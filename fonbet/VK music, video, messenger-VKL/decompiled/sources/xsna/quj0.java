package xsna;

import android.graphics.Rect;
import android.text.Editable;
import android.text.GetChars;
import android.text.Spannable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import java.lang.reflect.Array;

/* compiled from: SingleLineTransformationMethodWithParagraphs.kt */
/* loaded from: classes4.dex */
public final class quj0 implements TransformationMethod {
    public static final char[] b = {'\n', '\r'};
    public static final char[] c = {' ', 65279};

    /* compiled from: SingleLineTransformationMethodWithParagraphs.kt */
    public static class a implements CharSequence, GetChars {
        public final CharSequence b;
        public final char[] c;
        public final char[] d;

        public a(CharSequence charSequence, char[] cArr, char[] cArr2) {
            this.b = charSequence;
            this.c = cArr;
            this.d = cArr2;
        }

        @Override // java.lang.CharSequence
        public final char charAt(int i) {
            char charAt = this.b.charAt(i);
            char[] cArr = this.c;
            int length = cArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (charAt == cArr[i2]) {
                    charAt = this.d[i2];
                }
            }
            return charAt;
        }

        @Override // android.text.GetChars
        public final void getChars(int i, int i2, char[] cArr, int i3) {
            TextUtils.getChars(this.b, i, i2, cArr, i3);
            int i4 = (i2 - i) + i3;
            char[] cArr2 = this.c;
            int length = cArr2.length;
            while (i3 < i4) {
                char c = cArr[i3];
                for (int i5 = 0; i5 < length; i5++) {
                    if (c == cArr2[i5]) {
                        cArr[i3] = this.d[i5];
                    }
                }
                i3++;
            }
        }

        @Override // java.lang.CharSequence
        public final int length() {
            return this.b.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            char[] cArr = new char[i2 - i];
            getChars(i, i2, cArr, 0);
            return new String(cArr);
        }

        @Override // java.lang.CharSequence
        public final String toString() {
            CharSequence charSequence = this.b;
            char[] cArr = new char[charSequence.length()];
            getChars(0, charSequence.length(), cArr, 0);
            return new String(cArr);
        }
    }

    /* compiled from: SingleLineTransformationMethodWithParagraphs.kt */
    public static final class b extends a implements Spanned {
        public final Spanned e;

        public b(Spanned spanned, char[] cArr, char[] cArr2) {
            super(spanned, cArr, cArr2);
            this.e = spanned;
        }

        @Override // android.text.Spanned
        public final int getSpanEnd(Object obj) {
            return this.e.getSpanEnd(obj);
        }

        @Override // android.text.Spanned
        public final int getSpanFlags(Object obj) {
            return this.e.getSpanFlags(obj);
        }

        @Override // android.text.Spanned
        public final int getSpanStart(Object obj) {
            return this.e.getSpanStart(obj);
        }

        @Override // android.text.Spanned
        public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
            int i3;
            Object[] objArr = (T[]) this.e.getSpans(i, i2, cls);
            if (objArr != null) {
                i3 = 0;
                for (Object obj : objArr) {
                    if (obj instanceof ipk0) {
                        i3++;
                    }
                }
            } else {
                objArr = (T[]) null;
                i3 = 0;
            }
            if (objArr == null) {
                return null;
            }
            if (i3 == 0) {
                return (T[]) objArr;
            }
            Object newInstance = Array.newInstance((Class<?>) cls, objArr.length - i3);
            Object[] objArr2 = newInstance instanceof Object[] ? (T[]) ((Object[]) newInstance) : (T[]) null;
            if (objArr2 == null) {
                return null;
            }
            int i4 = 0;
            for (Object obj2 : objArr) {
                if (!(obj2 instanceof ipk0)) {
                    objArr2[i4] = obj2;
                    i4++;
                }
            }
            return (T[]) objArr2;
        }

        @Override // android.text.Spanned
        public final int nextSpanTransition(int i, int i2, Class<?> cls) {
            return this.e.nextSpanTransition(i, i2, cls);
        }

        @Override // xsna.quj0.a, java.lang.CharSequence
        public final CharSequence subSequence(int i, int i2) {
            return new SpannedString(this).subSequence(i, i2);
        }
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        boolean z = charSequence instanceof Editable;
        char[] cArr = b;
        char[] cArr2 = c;
        if (!z) {
            for (int i = 0; i < 2; i++) {
                if (TextUtils.indexOf(charSequence, cArr[i]) >= 0) {
                    if (!(charSequence instanceof Spannable)) {
                        return charSequence instanceof Spanned ? new SpannedString(new b((Spanned) charSequence, cArr, cArr2)) : new a(charSequence, cArr, cArr2).toString();
                    }
                }
            }
            return charSequence;
        }
        return new b((Spanned) charSequence, cArr, cArr2);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
