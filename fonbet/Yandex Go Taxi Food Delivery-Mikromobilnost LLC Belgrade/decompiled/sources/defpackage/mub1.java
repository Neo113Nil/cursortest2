package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.yandex.plus.core.network.header.NetworkHeader$Name$Loggable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class mub1 {
    public static au2 a;

    public static final void a(keu keuVar, xu50 xu50Var) {
        Set set;
        for (tu50 tu50Var : xu50Var.a.keySet()) {
            Set set2 = (Set) xu50Var.a.get(tu50Var);
            if (set2 != null) {
                Set set3 = set2;
                ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
                Iterator it = set3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((uu50) it.next()).b);
                }
                set = a.N0(arrayList);
            } else {
                set = null;
            }
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    keuVar.a(tu50Var.a, (String) it2.next());
                }
            }
        }
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, hoy0 hoy0Var, iv60 iv60Var, dry0 dry0Var, Matrix matrix, zii0 zii0Var, zii0 zii0Var2, boolean z, boolean z2, boolean z3, boolean z4) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        builder.reset();
        builder.setMatrix(matrix);
        long j = hoy0Var.b;
        asy0 asy0Var = hoy0Var.c;
        int f = asy0.f(j);
        builder.setSelectionRange(f, asy0.e(hoy0Var.b));
        if (z && f >= 0) {
            int r = iv60Var.r(f);
            zii0 c = dry0Var.c(r);
            float c2 = y6i0.c(c.a, 0.0f, (int) (dry0Var.c >> 32));
            boolean c3 = c(zii0Var, c2, c.b);
            boolean c4 = c(zii0Var, c2, c.d);
            boolean z5 = dry0Var.a(r) == ResolvedTextDirection.Rtl;
            int i = (c3 || c4) ? 1 : 0;
            if (!c3 || !c4) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f2 = c.b;
            float f3 = c.d;
            builder.setInsertionMarkerLocation(c2, f2, f3, f3, i);
        }
        if (z2) {
            int f4 = asy0Var != null ? asy0.f(asy0Var.a) : -1;
            int e = asy0Var != null ? asy0.e(asy0Var.a) : -1;
            if (f4 >= 0 && f4 < e) {
                builder.setComposingText(f4, hoy0Var.a.b.subSequence(f4, e));
                int r2 = iv60Var.r(f4);
                int r3 = iv60Var.r(e);
                float[] fArr = new float[(r3 - r2) * 4];
                dry0Var.b.a(eja1.c(r2, r3), fArr);
                for (int i2 = f4; i2 < e; i2++) {
                    int r4 = iv60Var.r(i2);
                    int i3 = (r4 - r2) * 4;
                    float f5 = fArr[i3];
                    float f6 = fArr[i3 + 1];
                    float f7 = fArr[i3 + 2];
                    float f8 = fArr[i3 + 3];
                    int i4 = (f5 < zii0Var.c ? 1 : 0) & (zii0Var.a < f7 ? 1 : 0) & (zii0Var.b < f8 ? 1 : 0) & (f6 < zii0Var.d ? 1 : 0);
                    if (!c(zii0Var, f5, f6) || !c(zii0Var, f7, f8)) {
                        i4 |= 2;
                    }
                    if (dry0Var.a(r4) == ResolvedTextDirection.Rtl) {
                        i4 |= 4;
                    }
                    builder.addCharacterBounds(i2, f5, f6, f7, f8, i4);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && z3) {
            editorBounds = jif.l().setEditorBounds(fia1.f(zii0Var2));
            handwritingBounds = editorBounds.setHandwritingBounds(fia1.f(zii0Var2));
            build = handwritingBounds.build();
            builder.setEditorBoundsInfo(build);
        }
        if (i5 >= 34 && z4 && !zii0Var.g()) {
            hm40 hm40Var = dry0Var.b;
            int i6 = hm40Var.f - 1;
            if (i6 < 0) {
                i6 = 0;
            }
            int d = y6i0.d(hm40Var.e(zii0Var.b), 0, i6);
            int d2 = y6i0.d(hm40Var.e(zii0Var.d), 0, i6);
            if (d <= d2) {
                while (true) {
                    builder.addVisibleLineBounds(dry0Var.i(d), hm40Var.f(d), dry0Var.j(d), hm40Var.b(d));
                    if (d == d2) {
                        break;
                    }
                    d++;
                }
            }
        }
        return builder.build();
    }

    public static final boolean c(zii0 zii0Var, float f, float f2) {
        float f3 = zii0Var.a;
        if (f > zii0Var.c || f3 > f) {
            return false;
        }
        return f2 <= zii0Var.d && zii0Var.b <= f2;
    }

    public static final au2 d() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Trash", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(11.1f, 2.0f);
        uq90Var.g(1.8f);
        uq90Var.b(4.0f, 4.0f, false, true, 1.26f, 0.13f);
        uq90Var.m(0.8f, 0.26f, 1.27f, 0.96f);
        uq90Var.e(0.23f, 0.34f, 0.35f, 0.75f, 0.47f, 1.17f);
        uq90Var.i(0.03f, 0.1f);
        uq90Var.i(0.24f, 0.84f);
        uq90Var.d(19.05f, 5.51f, 21.0f, 6.15f, 21.0f, 7.0f);
        uq90Var.p(2.0f);
        uq90Var.i(-1.49f, 1.0f);
        uq90Var.i(-1.42f, 9.84f);
        uq90Var.e(-0.06f, 0.44f, -0.14f, 0.9f, -0.45f, 1.21f);
        uq90Var.e(-0.57f, 0.6f, -2.02f, 1.45f, -5.64f, 1.45f);
        uq90Var.e(-3.6f, 0.0f, -5.05f, -0.84f, -5.63f, -1.44f);
        uq90Var.e(-0.32f, -0.32f, -0.4f, -0.79f, -0.47f, -1.23f);
        uq90Var.h(4.51f, 10.0f);
        uq90Var.h(3.0f, 9.0f);
        uq90Var.o(7.06f);
        uq90Var.e(0.0f, -0.93f, 1.95f, -1.57f, 4.83f, -1.86f);
        uq90Var.i(0.24f, -0.84f);
        uq90Var.i(0.03f, -0.1f);
        uq90Var.e(0.12f, -0.42f, 0.24f, -0.83f, 0.47f, -1.17f);
        uq90Var.m(0.47f, -0.69f, 1.27f, -0.96f);
        uq90Var.e(0.39f, -0.13f, 0.82f, -0.13f, 1.25f, -0.13f);
        uq90Var.j(14.0f, 4.9f);
        uq90Var.i(0.04f, 0.15f);
        uq90Var.b(45.0f, 45.0f, false, false, -4.08f, 0.0f);
        uq90Var.i(0.03f, -0.14f);
        uq90Var.e(0.17f, -0.6f, 0.2f, -0.66f, 0.23f, -0.7f);
        uq90Var.b(0.5f, 0.5f, false, true, 0.25f, -0.18f);
        uq90Var.e(0.04f, -0.02f, 0.11f, -0.03f, 0.73f, -0.03f);
        uq90Var.g(1.6f);
        uq90Var.e(0.62f, 0.0f, 0.69f, 0.01f, 0.73f, 0.03f);
        uq90Var.m(0.16f, 0.05f, 0.25f, 0.19f);
        uq90Var.e(0.02f, 0.03f, 0.06f, 0.1f, 0.22f, 0.69f);
        uq90Var.k(3.65f, 3.94f);
        uq90Var.i(1.35f, -0.9f);
        uq90Var.p(-0.16f);
        uq90Var.b(8.0f, 8.0f, false, false, -1.04f, -0.28f);
        uq90Var.a(30.0f, 30.0f, false, false, 12.0f, 7.0f);
        uq90Var.e(-2.43f, 0.0f, -4.52f, 0.18f, -5.96f, 0.49f);
        uq90Var.m(-0.68f, 0.15f, -1.04f, 0.29f);
        uq90Var.p(0.15f);
        uq90Var.i(1.37f, 0.9f);
        uq90Var.i(1.55f, 10.93f);
        uq90Var.e(0.97f, 0.67f, 2.95f, 0.74f, 4.08f, 0.74f);
        uq90Var.e(2.7f, 0.0f, 3.76f, -0.52f, 4.08f, -0.74f);
        uq90Var.c();
        uq90Var.j(10.52f, 9.0f);
        uq90Var.i(0.48f, 9.75f);
        uq90Var.i(-1.5f, -0.25f);
        uq90Var.i(-0.98f, -9.37f);
        uq90Var.c();
        uq90Var.j(13.0f, 18.75f);
        uq90Var.h(13.48f, 9.0f);
        uq90Var.i(2.0f, 0.13f);
        uq90Var.i(-0.98f, 9.37f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final xu50 e(meu meuVar) {
        xu50 xu50Var = new xu50(0);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = meuVar.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(meuVar.b(i));
        }
        for (String str : Collections.unmodifiableSet(treeSet)) {
            List g = meuVar.g(str);
            tu50 tu50Var = null;
            if (g.isEmpty()) {
                g = null;
            }
            if (g != null) {
                ReentrantLock reentrantLock = vu50.a;
                tu50 tu50Var2 = new tu50(str, NetworkHeader$Name$Loggable.UNKNOWN);
                ConcurrentHashMap concurrentHashMap = vu50.b;
                tu50 tu50Var3 = (tu50) concurrentHashMap.get(tu50Var2.a());
                NetworkHeader$Name$Loggable networkHeader$Name$Loggable = tu50Var2.b;
                if (tu50Var3 == null || tu50Var3.b.compareTo(networkHeader$Name$Loggable) < 0) {
                    tu50Var3 = null;
                }
                if (tu50Var3 != null) {
                    tu50Var2 = tu50Var3;
                } else {
                    ReentrantLock reentrantLock2 = vu50.a;
                    reentrantLock2.lock();
                    try {
                        tu50 tu50Var4 = (tu50) concurrentHashMap.get(tu50Var2.a());
                        if (tu50Var4 != null && tu50Var4.b.compareTo(networkHeader$Name$Loggable) >= 0) {
                            tu50Var = tu50Var4;
                        }
                        if (tu50Var != null) {
                            reentrantLock2.unlock();
                            tu50Var2 = tu50Var;
                        } else {
                            concurrentHashMap.put(tu50Var2.a(), tu50Var2);
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
                List list = g;
                if (!list.isEmpty()) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new uu50(tu50Var2, (String) it.next()));
                    }
                    Iterable N0 = a.N0(arrayList);
                    LinkedHashMap linkedHashMap = xu50Var.a;
                    Set set = (Set) linkedHashMap.get(tu50Var2);
                    if (set != null) {
                        N0 = v4r0.h(set, N0);
                    }
                    linkedHashMap.put(tu50Var2, N0);
                }
            }
        }
        return xu50Var;
    }
}
