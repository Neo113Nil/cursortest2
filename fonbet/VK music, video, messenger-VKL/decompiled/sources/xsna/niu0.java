package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.q630;
import xsna.tra0;

/* compiled from: VkCellButtonGroup.kt */
/* loaded from: classes17.dex */
public final class niu0 {
    public static final void a(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1495134648);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1495134648, i, -1, "com.vk.core.compose.component.cell.button.group.VkCellButtonGroup (VkCellButtonGroup.kt:41)");
            }
            final jai c = kai.c(1790710165, new ads0(1, jaiVar), M);
            final float f = 1;
            final float f2 = 28;
            final jai c2 = kai.c(-1821952279, new wzs() { // from class: xsna.kiu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1821952279, intValue, -1, "com.vk.core.compose.component.cell.button.group.VkCellButtonGroup.<anonymous> (VkCellButtonGroup.kt:50)");
                        }
                        q630 h = txj0.h(txj0.v(q630.a.a, f), f2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        f9t.e(hr80.m(h, ylu0Var.p().d, androidx.compose.ui.graphics.e.a), aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M);
            q630 f3 = txj0.f(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(654261423, 6, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.minHeight (VkCellButtonDefaults.kt:20)");
            }
            float f4 = 44;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 1, f3);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new wzs() { // from class: xsna.liu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        Object obj3;
                        final ztm0 ztm0Var = (ztm0) obj;
                        o6j o6jVar = (o6j) obj2;
                        List<zo10> t1 = ztm0Var.t1(hmu.Button, jai.this);
                        final int size = t1.size();
                        final int i2 = o6j.i(o6jVar.a) / size;
                        List<zo10> list = t1;
                        final ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((zo10) it.next()).N(o6j.b(i2, o6jVar.a, i2, 0, 0, 12)));
                        }
                        final int r0 = ztm0Var.r0(f2);
                        final int r02 = ztm0Var.r0(f);
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (it2.hasNext()) {
                                int i3 = ((tra0) next).c;
                                do {
                                    Object next2 = it2.next();
                                    int i4 = ((tra0) next2).c;
                                    if (i3 < i4) {
                                        next = next2;
                                        i3 = i4;
                                    }
                                } while (it2.hasNext());
                            }
                            obj3 = next;
                        } else {
                            obj3 = null;
                        }
                        tra0 tra0Var = (tra0) obj3;
                        final int i5 = tra0Var != null ? tra0Var.c : 0;
                        int i6 = o6j.i(o6jVar.a);
                        final jai jaiVar2 = c2;
                        return ztm0Var.Q(i6, i5, jgp.b, new izs() { // from class: xsna.miu0
                            @Override // xsna.izs
                            public final Object invoke(Object obj4) {
                                tra0.a aVar2 = (tra0.a) obj4;
                                Iterator it3 = arrayList.iterator();
                                int i7 = 0;
                                while (true) {
                                    boolean hasNext = it3.hasNext();
                                    int i8 = i2;
                                    if (!hasNext) {
                                        int i9 = 0;
                                        for (Object obj5 : ztm0Var.t1(hmu.Divider, new jai(247188153, new os1(size, jaiVar2), true))) {
                                            int i10 = i9 + 1;
                                            if (i9 < 0) {
                                                e43.t();
                                                throw null;
                                            }
                                            zo10 zo10Var = (zo10) obj5;
                                            int i11 = r02;
                                            boolean z = i11 >= 0;
                                            int i12 = r0;
                                            if (!(z & (i12 >= 0))) {
                                                wzw.a("width and height must be >= 0");
                                            }
                                            tra0.a.x(aVar2, zo10Var.N(s6j.h(i11, i11, i12, i12)), (i10 * i8) - (i11 / 2), (i5 - i12) / 2);
                                            i9 = i10;
                                        }
                                        return s3q0.a;
                                    }
                                    Object next3 = it3.next();
                                    int i13 = i7 + 1;
                                    if (i7 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    tra0.a.x(aVar2, (tra0) next3, i7 * i8, 0);
                                    i7 = i13;
                                }
                            }
                        });
                    }
                };
                M.R(x);
            }
            xtm0.a(b, (wzs) x, M, 48, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new at0(q630Var, jaiVar, i);
        }
    }
}
