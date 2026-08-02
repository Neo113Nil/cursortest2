package org.chromium.net.apihelpers;

import androidx.annotation.Nullable;
import com.vk.movika.sdk.base.model.history.b;
import java.text.ParseException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes8.dex */
final class ContentTypeParametersParser {
    private static final String TOKEN_ALLOWED_SPECIAL_CHARS = "!#$%&'*+-.^_`|~";
    private int mCurrentPosition;
    private final String mHeaderValue;

    public static class ContentTypeParametersParserException extends ParseException {
        public ContentTypeParametersParserException(String str, int i) {
            super(str, i);
        }
    }

    public ContentTypeParametersParser(String str) {
        this.mHeaderValue = str;
        int indexOf = str.indexOf(59);
        this.mCurrentPosition = indexOf != -1 ? indexOf + 1 : str.length();
    }

    private void advance() throws ContentTypeParametersParserException {
        if (!hasMore()) {
            throw new ContentTypeParametersParserException("End of header reached", this.mCurrentPosition);
        }
        this.mCurrentPosition++;
    }

    private char currentChar() throws ContentTypeParametersParserException {
        if (hasMore()) {
            return this.mHeaderValue.charAt(this.mCurrentPosition);
        }
        throw new ContentTypeParametersParserException("End of header reached", this.mCurrentPosition);
    }

    private String getNextQuotedString() throws ContentTypeParametersParserException {
        int i = this.mCurrentPosition;
        if (currentChar() != '\"') {
            throw new ContentTypeParametersParserException(b.b(this.mCurrentPosition, "Not a quoted string: expected \" at ", ": [", this.mHeaderValue), this.mCurrentPosition);
        }
        advance();
        StringBuilder sb = new StringBuilder();
        while (true) {
            boolean z = false;
            while (hasMore()) {
                if (z) {
                    if (!isQuotedPairChar(currentChar())) {
                        throw new ContentTypeParametersParserException(b.b(this.mCurrentPosition, "Invalid character at ", ": [", this.mHeaderValue), this.mCurrentPosition);
                    }
                    sb.append(currentChar());
                    advance();
                } else {
                    if (currentChar() == '\"') {
                        advance();
                        return sb.toString();
                    }
                    if (currentChar() == '\\') {
                        advance();
                        z = true;
                    } else {
                        if (!isQdtextChar(currentChar())) {
                            throw new ContentTypeParametersParserException(b.b(this.mCurrentPosition, "Invalid character at ", ": [", this.mHeaderValue), this.mCurrentPosition);
                        }
                        sb.append(currentChar());
                        advance();
                    }
                }
            }
            throw new ContentTypeParametersParserException(b.b(i, "Unterminated quoted string at ", ": [", this.mHeaderValue), i);
        }
    }

    private String getNextToken() throws ContentTypeParametersParserException {
        int i = this.mCurrentPosition;
        while (hasMore() && isTokenCharacter(currentChar())) {
            advance();
        }
        int i2 = this.mCurrentPosition;
        if (i != i2) {
            return this.mHeaderValue.substring(i, i2);
        }
        throw new ContentTypeParametersParserException(b.b(i, "Token not found at position ", ": [", this.mHeaderValue), i);
    }

    private static boolean isAscii(char c) {
        return c <= 127;
    }

    private static boolean isQdtextChar(char c) {
        return (c == '\\' || c == '\"' || !isQuotedPairChar(c)) ? false : true;
    }

    private static boolean isQuotedPairChar(char c) {
        if (isWhitespace(c)) {
            return true;
        }
        return '!' <= c && c <= 255 && c != 127;
    }

    private static boolean isTokenCharacter(char c) {
        if (isAscii(c)) {
            return Character.isLetterOrDigit(c) || TOKEN_ALLOWED_SPECIAL_CHARS.indexOf(c) != -1;
        }
        return false;
    }

    private static boolean isWhitespace(char c) {
        return c == '\t' || c == ' ';
    }

    private void optionallySkipWhitespace() throws ContentTypeParametersParserException {
        while (hasMore() && isWhitespace(currentChar())) {
            advance();
        }
    }

    @Nullable
    public Map.Entry<String, String> getNextParameter() throws ContentTypeParametersParserException {
        optionallySkipWhitespace();
        String nextToken = getNextToken();
        if (currentChar() != '=') {
            throw new ContentTypeParametersParserException(b.b(this.mCurrentPosition, "Invalid parameter format: expected = at ", ": [", this.mHeaderValue), this.mCurrentPosition);
        }
        advance();
        String nextQuotedString = currentChar() == '\"' ? getNextQuotedString() : getNextToken();
        optionallySkipWhitespace();
        if (hasMore()) {
            if (currentChar() != ';') {
                throw new ContentTypeParametersParserException(b.b(this.mCurrentPosition, "Invalid parameter format: expected ; at ", ": [", this.mHeaderValue), this.mCurrentPosition);
            }
            advance();
        }
        return new AbstractMap.SimpleEntry(nextToken, nextQuotedString);
    }

    public boolean hasMore() {
        return this.mCurrentPosition < this.mHeaderValue.length();
    }
}
