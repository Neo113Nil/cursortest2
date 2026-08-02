package xsna;

import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public abstract class ar2 {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((sxo0) t).a), Integer.valueOf(((sxo0) t2).a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r5 == androidx.compose.runtime.a.C0011a.a) goto L35;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(wlp0<Boolean> wlp0Var, uuk0 uuk0Var, int i, androidx.compose.runtime.a aVar, int i2) {
        Object obj;
        Object[] objArr;
        int i3;
        Object[] objArr2;
        int i4;
        int i5;
        int i6;
        String str;
        int i7 = i;
        androidx.compose.runtime.a M = aVar.M(1894587123);
        wlp0<Boolean> wlp0Var2 = wlp0Var;
        int i8 = i2 | (M.J(wlp0Var2) ? 4 : 2) | (M.y(uuk0Var) ? 32 : 16) | (M.o(i7) ? 256 : 128) | (M.J(this) ? 2048 : 1024);
        if (M.t(i8 & 1, (i8 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1894587123, i8, -1, "androidx.compose.animation.graphics.vector.Animator.Configure (Animator.kt:67)");
            }
            boolean z = (i8 & 896) == 256;
            Object x = M.x();
            if (!z) {
                obj = x;
            }
            ph50<String, m7e0<?>> b = h5h0.b();
            b(b, i7, 0);
            M.R(b);
            obj = b;
            ph50<String, m7e0<?>> ph50Var = (ph50) obj;
            Object[] objArr3 = ph50Var.b;
            Object[] objArr4 = ph50Var.c;
            long[] jArr = ph50Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j = jArr[i9];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        long j2 = j;
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j2 & 255) < 128) {
                                int i13 = (i9 << 3) + i12;
                                Object obj2 = objArr3[i13];
                                m7e0 m7e0Var = (m7e0) objArr4[i13];
                                str = (String) obj2;
                                i5 = i10;
                                ArrayList arrayList = m7e0Var.a;
                                objArr2 = objArr3;
                                if (arrayList.size() > 1) {
                                    g5g.L(arrayList, new a());
                                }
                                i4 = i12;
                                i6 = i9;
                                mtk0 a2 = m7e0Var.a(wlp0Var2, str, i7, M, i8 & 910);
                                switch (str.hashCode()) {
                                    case -1721943862:
                                        if (!str.equals("translateX")) {
                                            break;
                                        } else {
                                            uuk0Var.f = a2;
                                            break;
                                        }
                                    case -1721943861:
                                        if (!str.equals("translateY")) {
                                            break;
                                        } else {
                                            uuk0Var.g = a2;
                                            break;
                                        }
                                    case -1143814757:
                                        if (!str.equals("fillAlpha")) {
                                            break;
                                        } else {
                                            uuk0Var.m = a2;
                                            break;
                                        }
                                    case -1141881952:
                                        if (!str.equals("fillColor")) {
                                            break;
                                        } else {
                                            uuk0Var.i = a2;
                                            break;
                                        }
                                    case -1121758502:
                                        if (!str.equals("trimPathOffset")) {
                                            break;
                                        } else {
                                            uuk0Var.p = a2;
                                            break;
                                        }
                                    case -987906986:
                                        if (!str.equals("pivotX")) {
                                            break;
                                        } else {
                                            uuk0Var.b = a2;
                                            break;
                                        }
                                    case -987906985:
                                        if (!str.equals("pivotY")) {
                                            break;
                                        } else {
                                            uuk0Var.c = a2;
                                            break;
                                        }
                                    case -908189618:
                                        if (!str.equals("scaleX")) {
                                            break;
                                        } else {
                                            uuk0Var.d = a2;
                                            break;
                                        }
                                    case -908189617:
                                        if (!str.equals("scaleY")) {
                                            break;
                                        } else {
                                            uuk0Var.e = a2;
                                            break;
                                        }
                                    case -170626757:
                                        if (!str.equals("trimPathStart")) {
                                            break;
                                        } else {
                                            uuk0Var.n = a2;
                                            break;
                                        }
                                    case -40300674:
                                        if (!str.equals("rotation")) {
                                            break;
                                        } else {
                                            uuk0Var.a = a2;
                                            break;
                                        }
                                    case 1233923439:
                                        if (!str.equals("pathData")) {
                                            break;
                                        } else {
                                            uuk0Var.h = a2;
                                            break;
                                        }
                                    case 1903848966:
                                        if (!str.equals("strokeAlpha")) {
                                            break;
                                        } else {
                                            uuk0Var.l = a2;
                                            break;
                                        }
                                    case 1905781771:
                                        if (!str.equals("strokeColor")) {
                                            break;
                                        } else {
                                            uuk0Var.j = a2;
                                            break;
                                        }
                                    case 1924065902:
                                        if (!str.equals("strokeWidth")) {
                                            break;
                                        } else {
                                            uuk0Var.k = a2;
                                            break;
                                        }
                                    case 2136119284:
                                        if (!str.equals("trimPathEnd")) {
                                            break;
                                        } else {
                                            uuk0Var.o = a2;
                                            break;
                                        }
                                }
                            } else {
                                objArr2 = objArr3;
                                i4 = i12;
                                i5 = i10;
                                i6 = i9;
                            }
                            j2 >>= i5;
                            i12 = i4 + 1;
                            wlp0Var2 = wlp0Var;
                            i7 = i;
                            i9 = i6;
                            i10 = i5;
                            objArr3 = objArr2;
                        }
                        objArr = objArr3;
                        int i14 = i10;
                        i3 = i9;
                        if (i11 != i14) {
                        }
                    } else {
                        objArr = objArr3;
                        i3 = i9;
                    }
                    if (i3 != length) {
                        i9 = i3 + 1;
                        wlp0Var2 = wlp0Var;
                        i7 = i;
                        objArr3 = objArr;
                    }
                }
                throw new IllegalStateException("Unknown propertyName: ".concat(str));
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zq2(this, wlp0Var, uuk0Var, i, i2);
        }
    }

    public abstract void b(ph50<String, m7e0<?>> ph50Var, int i, int i2);

    public abstract int c();
}
