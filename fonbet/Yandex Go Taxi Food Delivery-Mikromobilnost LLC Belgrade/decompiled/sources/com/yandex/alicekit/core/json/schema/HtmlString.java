package com.yandex.alicekit.core.json.schema;

import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import java.util.stream.IntStream;

/* loaded from: classes11.dex */
public class HtmlString implements Spanned {
    private final Spanned formattedValue;
    private final String htmlValue;

    public HtmlString(String str) {
        this.htmlValue = str;
        this.formattedValue = isBlank(str) ? new SpannedString(str) : convertHtml(str);
    }

    private static Spanned convertHtml(String str) {
        return Html.fromHtml(str, 0);
    }

    private static boolean isBlank(String str) {
        if (str.isEmpty()) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.formattedValue.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return this.formattedValue.chars();
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return this.formattedValue.codePoints();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.htmlValue.equals(((HtmlString) obj).htmlValue);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.formattedValue.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.formattedValue.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.formattedValue.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.formattedValue.getSpans(i, i2, cls);
    }

    public int hashCode() {
        return this.htmlValue.hashCode() + 6913;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.formattedValue.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.formattedValue.nextSpanTransition(i, i2, cls);
    }

    public String rawValue() {
        return this.htmlValue;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.formattedValue.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.formattedValue.toString();
    }
}
