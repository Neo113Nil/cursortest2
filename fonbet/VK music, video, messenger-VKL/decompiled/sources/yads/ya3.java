package yads;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class ya3 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, za3 za3Var, wa3 wa3Var, Map map, int i3) {
        wa3 wa3Var2;
        int i4 = za3Var.h;
        if (i4 != -1 || za3Var.i != -1) {
            if (((i4 == 1 ? (char) 1 : (char) 0) | (za3Var.i == 1 ? (char) 2 : (char) 0)) != -1) {
                int i5 = za3Var.h;
                spannableStringBuilder.setSpan(new StyleSpan((i5 == -1 && za3Var.i == -1) ? -1 : (i5 == 1 ? 1 : 0) | (za3Var.i == 1 ? 2 : 0)), i, i2, 33);
            }
        }
        if (za3Var.f == 1) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (za3Var.g == 1) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (za3Var.c) {
            if (!za3Var.c) {
                throw new IllegalStateException("Font color has not been defined.");
            }
            i33.a(spannableStringBuilder, new ForegroundColorSpan(za3Var.b), i, i2);
        }
        if (za3Var.e) {
            if (!za3Var.e) {
                throw new IllegalStateException("Background color has not been defined.");
            }
            i33.a(spannableStringBuilder, new BackgroundColorSpan(za3Var.d), i, i2);
        }
        if (za3Var.a != null) {
            i33.a(spannableStringBuilder, new TypefaceSpan(za3Var.a), i, i2);
        }
        if (za3Var.r != null) {
            i33.a(spannableStringBuilder, new a73(), i, i2);
        }
        int i6 = za3Var.m;
        if (i6 == 2) {
            wa3 wa3Var3 = wa3Var;
            while (true) {
                if (wa3Var3 == null) {
                    wa3Var3 = null;
                    break;
                }
                za3 a = a(wa3Var3.f, wa3Var3.g, map);
                if (a != null && a.m == 1) {
                    break;
                } else {
                    wa3Var3 = wa3Var3.j;
                }
            }
            if (wa3Var3 != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(wa3Var3);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        wa3Var2 = null;
                        break;
                    }
                    wa3 wa3Var4 = (wa3) arrayDeque.pop();
                    za3 a2 = a(wa3Var4.f, wa3Var4.g, map);
                    if (a2 != null && a2.m == 3) {
                        wa3Var2 = wa3Var4;
                        break;
                    }
                    ArrayList arrayList = wa3Var4.m;
                    for (int size = (arrayList == null ? 0 : arrayList.size()) - 1; size >= 0; size--) {
                        arrayDeque.push(wa3Var4.a(size));
                    }
                }
                if (wa3Var2 != null) {
                    ArrayList arrayList2 = wa3Var2.m;
                    if (arrayList2 == null || arrayList2.size() != 1 || wa3Var2.a(0).b == null) {
                        ji1.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = wa3Var2.a(0).b;
                        int i7 = mc3.a;
                        za3 a3 = a(wa3Var2.f, wa3Var2.g, map);
                        if (a3 == null || a3.n == -1) {
                            a(wa3Var3.f, wa3Var3.g, map);
                        }
                        spannableStringBuilder.setSpan(new at2(), i, i2, 33);
                    }
                }
            }
        } else if (i6 == 3 || i6 == 4) {
            spannableStringBuilder.setSpan(new vf0(), i, i2, 33);
        }
        if (za3Var.q == 1) {
            i33.a(spannableStringBuilder, new d11(), i, i2);
        }
        int i8 = za3Var.j;
        if (i8 == 1) {
            i33.a(spannableStringBuilder, new AbsoluteSizeSpan((int) za3Var.k, true), i, i2);
        } else if (i8 == 2) {
            i33.a(spannableStringBuilder, new RelativeSizeSpan(za3Var.k), i, i2);
        } else {
            if (i8 != 3) {
                return;
            }
            i33.a(spannableStringBuilder, new RelativeSizeSpan(za3Var.k / 100.0f), i, i2);
        }
    }

    public static za3 a(za3 za3Var, String[] strArr, Map map) {
        int i = 0;
        if (za3Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (za3) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                za3 za3Var2 = new za3();
                int length = strArr.length;
                while (i < length) {
                    za3Var2.a((za3) map.get(strArr[i]));
                    i++;
                }
                return za3Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return za3Var.a((za3) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    za3Var.a((za3) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return za3Var;
    }
}
