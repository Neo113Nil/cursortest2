package xsna;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes12.dex */
public final class z4q0 implements Spannable {
    public boolean b = false;

    @NonNull
    public Spannable c;

    public z4q0(@NonNull Spannable spannable) {
        this.c = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c.charAt(i);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final IntStream chars() {
        return this.c.chars();
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final IntStream codePoints() {
        return this.c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.c.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.c.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.c;
        if (!this.b && ((spannable instanceof PrecomputedText) || (spannable instanceof dxc0))) {
            this.c = new SpannableString(spannable);
        }
        this.b = true;
        this.c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.c;
        if (!this.b && ((spannable instanceof PrecomputedText) || (spannable instanceof dxc0))) {
            this.c = new SpannableString(spannable);
        }
        this.b = true;
        this.c.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final CharSequence subSequence(int i, int i2) {
        return this.c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.c.toString();
    }
}
