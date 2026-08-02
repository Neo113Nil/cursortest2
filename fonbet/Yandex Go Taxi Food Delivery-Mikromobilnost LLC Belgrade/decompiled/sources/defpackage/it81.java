package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class it81 {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public it81(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i2;
    }

    public final r871 a(int i) {
        float f;
        int i2 = this.e + this.f;
        int i3 = 32 - i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i4 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i4);
            int i5 = rf71.a;
            if (charSequence.length() > i3) {
                charSequence = charSequence.subSequence(0, i3);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
            i4++;
        }
        SpannableString c = c();
        int i6 = rf71.a;
        int length = c.length();
        CharSequence charSequence2 = c;
        if (length > i3) {
            charSequence2 = c.subSequence(0, i3);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i3 - spannableStringBuilder.length();
        int i7 = i2 - length2;
        int i8 = i != Integer.MIN_VALUE ? i : (this.g != 2 || (Math.abs(i7) >= 3 && length2 >= 0)) ? (this.g != 2 || i7 <= 0) ? 0 : 2 : 1;
        if (i8 != 1) {
            if (i8 == 2) {
                i2 = 32 - length2;
            }
            f = ((i2 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        float f2 = f;
        int i9 = this.d;
        if (i9 > 7) {
            i9 -= 17;
        } else if (this.g == 1) {
            i9 -= this.h - 1;
        }
        return new r871(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i9, 1, Integer.MIN_VALUE, f2, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ModalContentViewContainer.BASE_SHADOW_COLOR, Integer.MIN_VALUE, 0.0f);
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                fq81 fq81Var = (fq81) arrayList.get(size);
                int i = fq81Var.c;
                if (i != length) {
                    return;
                }
                fq81Var.c = i - 1;
            }
        }
    }

    public final SpannableString c() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i5 >= arrayList.size()) {
                break;
            }
            fq81 fq81Var = (fq81) arrayList.get(i5);
            boolean z2 = fq81Var.b;
            int i7 = fq81Var.a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = wv81.A[i7];
                }
                z = z3;
            }
            int i8 = fq81Var.c;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((fq81) arrayList.get(i5)).c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
