package com.yandex.div.evaluable.internal;

import androidx.credentials.provider.CredentialEntry;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.brm0;
import xsna.epx;
import xsna.g5g;
import xsna.j5g;
import xsna.zr;

/* compiled from: Tokenizer.kt */
/* loaded from: classes7.dex */
public final class Tokenizer {
    public static final Tokenizer INSTANCE = new Tokenizer();

    /* compiled from: Tokenizer.kt */
    public static final class TokenizationState {
        private int index;
        private final char[] source;
        private final List<Token> tokens = new ArrayList();

        public TokenizationState(char[] cArr) {
            this.source = cArr;
        }

        public static /* synthetic */ int forward$default(TokenizationState tokenizationState, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return tokenizationState.forward(i);
        }

        public static /* synthetic */ char nextChar$default(TokenizationState tokenizationState, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return tokenizationState.nextChar(i);
        }

        public static /* synthetic */ char prevChar$default(TokenizationState tokenizationState, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return tokenizationState.prevChar(i);
        }

        public final char charAt(int i) {
            if (i < 0) {
                return (char) 0;
            }
            char[] cArr = this.source;
            if (i < cArr.length) {
                return cArr[i];
            }
            return (char) 0;
        }

        public final char currentChar() {
            int i = this.index;
            char[] cArr = this.source;
            if (i >= cArr.length) {
                return (char) 0;
            }
            return cArr[i];
        }

        public final boolean currentCharIsEscaped() {
            int i = this.index;
            if (i >= this.source.length) {
                return false;
            }
            int i2 = 0;
            for (int i3 = i - 1; i3 > 0 && this.source[i3] == '\\'; i3--) {
                i2++;
            }
            return i2 % 2 == 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (TokenizationState.class.equals(obj != null ? obj.getClass() : null)) {
                return Arrays.equals(this.source, ((TokenizationState) obj).source);
            }
            return false;
        }

        public final int forward(int i) {
            int i2 = this.index;
            this.index = i + i2;
            return i2;
        }

        public final int getIndex() {
            return this.index;
        }

        public final List<Token> getTokens() {
            return this.tokens;
        }

        public int hashCode() {
            return Arrays.hashCode(this.source);
        }

        public final char nextChar(int i) {
            int i2 = this.index;
            int i3 = i2 + i;
            char[] cArr = this.source;
            if (i3 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i2 + i];
        }

        public final String part(int i, int i2) {
            return brm0.q(this.source, i, i2);
        }

        public final char prevChar(int i) {
            int i2 = this.index;
            if (i2 - i >= 0) {
                return this.source[i2 - i];
            }
            return (char) 0;
        }

        public String toString() {
            return "TokenizationState(source=" + Arrays.toString(this.source) + ')';
        }
    }

    private Tokenizer() {
    }

    private final EvaluableException invalidToken(TokenizationState tokenizationState) {
        return new EvaluableException("Invalid token '" + tokenizationState.currentChar() + "' at position " + tokenizationState.getIndex(), null, 2, null);
    }

    private final boolean isAlphabetic(char c) {
        if ('a' > c || c >= '{') {
            return ('A' <= c && c < '[') || c == '_';
        }
        return true;
    }

    private final boolean isAtEnd(char c) {
        return c == 0;
    }

    private final boolean isAtEndOfExpression(char c) {
        return c == '}';
    }

    private final boolean isAtEndOfString(TokenizationState tokenizationState, boolean z) {
        if (isAtEnd(tokenizationState.currentChar()) || isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            return true;
        }
        return z && isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState);
    }

    private final boolean isAtEndOfStringLiteral(char c, TokenizationState tokenizationState) {
        return c == '\'' && !tokenizationState.currentCharIsEscaped();
    }

    private final boolean isDecimal(char c, char c2, char c3) {
        if (!Character.isDigit(c)) {
            if (!(c == '.' ? Character.isDigit(c3) : !(c == 'e' || c == 'E') ? !((c == '+' || c == '-') && ((c2 == 'e' || c2 == 'E') && Character.isDigit(c3))) : !(Character.isDigit(c2) && (Character.isDigit(c3) || c3 == '+' || c3 == '-')))) {
                return false;
            }
        }
        return true;
    }

    private final boolean isDot(char c) {
        return c == '.';
    }

    private final boolean isNumber(char c) {
        return '0' <= c && c < ':';
    }

    private final boolean isOperator(List<? extends Token> list) {
        if (list.isEmpty() || (j5g.i0(list) instanceof Token.Operator.Unary)) {
            return false;
        }
        return (j5g.i0(list) instanceof Token.Operand) || (j5g.i0(list) instanceof Token$Bracket$RightRound);
    }

    private final boolean isStartOfExpression(char c, TokenizationState tokenizationState) {
        return c == '@' && TokenizationState.prevChar$default(tokenizationState, 0, 1, null) != '\\' && TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '{';
    }

    private final boolean isUnaryOperator(List<? extends Token> list) {
        return (isOperator(list) || (j5g.k0(list) instanceof Token.Operator.Unary)) ? false : true;
    }

    private final boolean isValidIdentifier(char c) {
        return isAlphabetic(c) || isNumber(c);
    }

    private final boolean isWhiteSpace(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    private final boolean processExpression(TokenizationState tokenizationState, List<Token> list) {
        Token token;
        Token token2;
        if (!isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            return false;
        }
        tokenizationState.forward(2);
        while (!isAtEnd(tokenizationState.currentChar()) && tokenizationState.currentChar() != '}') {
            char currentChar = tokenizationState.currentChar();
            if (currentChar == '?') {
                list.add(Token.Operator.TernaryIf.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == ':') {
                list.add(Token.Operator.TernaryElse.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '+') {
                if (isUnaryOperator(list)) {
                    token = Token.Operator.Unary.Plus.INSTANCE;
                } else {
                    if (!isOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    token = Token.Operator.Binary.Sum.Plus.INSTANCE;
                }
                list.add(token);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '-') {
                if (isUnaryOperator(list)) {
                    token2 = Token.Operator.Unary.Minus.INSTANCE;
                } else {
                    if (!isOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    token2 = Token.Operator.Binary.Sum.Minus.INSTANCE;
                }
                list.add(token2);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '*') {
                list.add(Token.Operator.Binary.Factor.Multiplication.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '/') {
                list.add(Token.Operator.Binary.Factor.Division.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '%') {
                list.add(Token.Operator.Binary.Factor.Modulo.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '!') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Equality.NotEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == ':') {
                    list.add(Token.Operator.Try.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    if (!isUnaryOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    list.add(Token.Operator.Unary.Not.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (currentChar == '&') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '&') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Logical.And.INSTANCE);
                tokenizationState.forward(2);
            } else if (currentChar == '|') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '|') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Logical.Or.INSTANCE);
                tokenizationState.forward(2);
            } else if (currentChar == '<') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Comparison.LessOrEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    list.add(Token.Operator.Binary.Comparison.Less.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (currentChar == '>') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Comparison.GreaterOrEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    list.add(Token.Operator.Binary.Comparison.Greater.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (currentChar == '=') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '=') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Equality.Equal.INSTANCE);
                tokenizationState.forward(2);
            } else if (currentChar == '(') {
                list.add(Token$Bracket$LeftRound.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == ')') {
                list.add(Token$Bracket$RightRound.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == ',') {
                list.add(Token.Function.ArgumentDelimiter.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '\'') {
                processStringTemplate$default(this, tokenizationState, list, false, 4, null);
            } else {
                TokenizationState tokenizationState2 = tokenizationState;
                List<Token> list2 = list;
                if (isWhiteSpace(tokenizationState2.currentChar())) {
                    TokenizationState.forward$default(tokenizationState2, 0, 1, null);
                } else if (isDecimal(tokenizationState2.currentChar(), TokenizationState.prevChar$default(tokenizationState2, 0, 1, null), TokenizationState.nextChar$default(tokenizationState2, 0, 1, null))) {
                    processNumber(tokenizationState2, list2);
                } else if (isAlphabetic(tokenizationState2.currentChar())) {
                    processIdentifier(tokenizationState2, list2);
                } else {
                    if (!isDot(tokenizationState2.currentChar())) {
                        throw invalidToken(tokenizationState2);
                    }
                    TokenizationState.forward$default(tokenizationState2, 0, 1, null);
                    list2.add(Token.Operator.Dot.INSTANCE);
                }
                tokenizationState = tokenizationState2;
                list = list2;
            }
        }
        TokenizationState tokenizationState3 = tokenizationState;
        if (isAtEndOfExpression(tokenizationState3.currentChar())) {
            TokenizationState.forward$default(tokenizationState3, 0, 1, null);
            return true;
        }
        throw new TokenizingException("'}' expected at end of expression at " + tokenizationState3.getIndex(), null, 2, null);
    }

    private final void processIdentifier(TokenizationState tokenizationState, List<Token> list) {
        Token.Function function;
        int index = tokenizationState.getIndex();
        Integer num = null;
        while (true) {
            int index2 = tokenizationState.getIndex();
            while (isValidIdentifier(tokenizationState.currentChar())) {
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            }
            if (isDot(tokenizationState.currentChar())) {
                int index3 = tokenizationState.getIndex() + 1;
                Integer valueOf = Integer.valueOf(index3);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
                if (index3 - index2 <= 1) {
                    throw new EvaluableException("Unexpected token: .", null, 2, null);
                }
                num = valueOf;
            }
            if (!isValidIdentifier(tokenizationState.currentChar()) && !isDot(tokenizationState.currentChar())) {
                int index4 = tokenizationState.getIndex();
                while (isWhiteSpace(tokenizationState.currentChar())) {
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
                if (tokenizationState.currentChar() == '(') {
                    function = new Token.Function(tokenizationState.part(num != null ? num.intValue() : index, index4));
                    if (num == null) {
                        list.add(function);
                        return;
                    }
                    index4 = num.intValue() - 1;
                } else {
                    function = null;
                }
                String part = tokenizationState.part(index, index4);
                Tokenizer tokenizer = INSTANCE;
                if (!tokenizer.processKeyword(part, list)) {
                    if (tokenizer.isDot(tokenizationState.charAt(index4 - 1))) {
                        throw new EvaluableException("Unexpected token: .", null, 2, null);
                    }
                    list.add(Token.Operand.Variable.m174boximpl(Token.Operand.Variable.m175constructorimpl(part)));
                }
                if (function != null) {
                    list.add(Token.Operator.Dot.INSTANCE);
                    list.add(function);
                    return;
                }
                return;
            }
        }
    }

    private final boolean processKeyword(String str, List<Token> list) {
        Token.Operand.Literal.Bool m156boximpl = epx.f(str, "true") ? Token.Operand.Literal.Bool.m156boximpl(Token.Operand.Literal.Bool.m157constructorimpl(true)) : epx.f(str, CredentialEntry.FALSE_STRING) ? Token.Operand.Literal.Bool.m156boximpl(Token.Operand.Literal.Bool.m157constructorimpl(false)) : null;
        if (m156boximpl == null) {
            return false;
        }
        list.add(m156boximpl);
        return true;
    }

    private final void processNumber(TokenizationState tokenizationState, List<Token> list) {
        String part;
        String part2;
        int index = tokenizationState.getIndex();
        boolean z = j5g.k0(list) instanceof Token.Operator.Unary.Minus;
        if (z) {
            g5g.J(list);
        }
        do {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        } while (Character.isDigit(tokenizationState.currentChar()));
        if (tokenizationState.charAt(index) != '.' && !isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
            if (z) {
                part2 = "-" + tokenizationState.part(index, tokenizationState.getIndex());
            } else {
                part2 = tokenizationState.part(index, tokenizationState.getIndex());
            }
            try {
                list.add(Token.Operand.Literal.Num.m162boximpl(Token.Operand.Literal.Num.m163constructorimpl(Long.valueOf(Long.parseLong(part2)))));
                return;
            } catch (Exception unused) {
                throw new EvaluableException(zr.a("Value ", part2, " can't be converted to Integer type."), null, 2, null);
            }
        }
        while (isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        if (z) {
            part = "-" + tokenizationState.part(index, tokenizationState.getIndex());
        } else {
            part = tokenizationState.part(index, tokenizationState.getIndex());
        }
        try {
            list.add(Token.Operand.Literal.Num.m162boximpl(Token.Operand.Literal.Num.m163constructorimpl(Double.valueOf(Double.parseDouble(part)))));
        } catch (Exception unused2) {
            throw new EvaluableException(zr.a("Value ", part, " can't be converted to Number type."), null, 2, null);
        }
    }

    /* renamed from: processString-wB-4SYI, reason: not valid java name */
    private final String m181processStringwB4SYI(TokenizationState tokenizationState, boolean z) {
        int index = tokenizationState.getIndex();
        while (!isAtEndOfString(tokenizationState, z)) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        String process$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, tokenizationState.part(index, tokenizationState.getIndex()), null, 2, null);
        if (process$default.length() > 0) {
            return Token.Operand.Literal.Str.m169constructorimpl(process$default);
        }
        return null;
    }

    private final void processStringTemplate(TokenizationState tokenizationState, List<Token> list, boolean z) {
        if (z) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        String m181processStringwB4SYI = m181processStringwB4SYI(tokenizationState, z);
        if (isAtEnd(tokenizationState.currentChar())) {
            if (z) {
                throw new TokenizingException("''' expected at end of string literal at " + tokenizationState.getIndex(), null, 2, null);
            }
            if (m181processStringwB4SYI != null) {
                list.add(Token.Operand.Literal.Str.m168boximpl(m181processStringwB4SYI));
                return;
            }
            return;
        }
        if (isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState)) {
            if (m181processStringwB4SYI == null) {
                m181processStringwB4SYI = Token.Operand.Literal.Str.m169constructorimpl("");
            }
            list.add(Token.Operand.Literal.Str.m168boximpl(m181processStringwB4SYI));
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
            return;
        }
        if (m181processStringwB4SYI != null && isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            arrayList.add(Token$StringTemplate$Start.INSTANCE);
            arrayList.add(Token.Operand.Literal.Str.m168boximpl(m181processStringwB4SYI));
        }
        while (isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            ArrayList arrayList2 = new ArrayList();
            processExpression(tokenizationState, arrayList2);
            String m181processStringwB4SYI2 = m181processStringwB4SYI(tokenizationState, z);
            if (!z && arrayList.isEmpty() && m181processStringwB4SYI2 == null && !isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
                list.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(Token$StringTemplate$Start.INSTANCE);
            }
            arrayList.add(Token$StringTemplate$StartOfExpression.INSTANCE);
            arrayList.addAll(arrayList2);
            arrayList.add(Token$StringTemplate$EndOfExpression.INSTANCE);
            if (m181processStringwB4SYI2 != null) {
                arrayList.add(Token.Operand.Literal.Str.m168boximpl(m181processStringwB4SYI2));
            }
        }
        if (z && !isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState)) {
            throw new TokenizingException("''' expected at end of string literal at " + tokenizationState.getIndex(), null, 2, null);
        }
        if (!arrayList.isEmpty()) {
            list.addAll(arrayList);
            list.add(Token$StringTemplate$End.INSTANCE);
        }
        if (z) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
    }

    public static /* synthetic */ void processStringTemplate$default(Tokenizer tokenizer, TokenizationState tokenizationState, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        tokenizer.processStringTemplate(tokenizationState, list, z);
    }

    public final List<Token> tokenize(String str) {
        return tokenize(str.toCharArray());
    }

    private final List<Token> tokenize(char[] cArr) {
        TokenizationState tokenizationState = new TokenizationState(cArr);
        try {
            processStringTemplate(tokenizationState, tokenizationState.getTokens(), false);
            return tokenizationState.getTokens();
        } catch (EvaluableException e) {
            if (!(e instanceof TokenizingException)) {
                throw e;
            }
            throw new EvaluableException("Error tokenizing '" + new String(cArr) + "'.", e);
        }
    }
}
