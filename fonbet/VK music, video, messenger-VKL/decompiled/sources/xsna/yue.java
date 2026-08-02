package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yue implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yue(int i, int i2, Object obj, Object obj2, boolean z) {
        this.b = i2;
        this.d = obj;
        this.f = obj2;
        this.c = z;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.e | 1);
                ave.d((izs) this.d, (List) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                return s3q0.a;
            case 1:
                a4b0 a4b0Var = (a4b0) this.f;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                a4b0Var.h(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, izsVar, this.c);
                return s3q0.a;
            default:
                final ztm0 ztm0Var = (ztm0) obj;
                final o6j o6jVar = (o6j) obj2;
                final tra0 N = ((zo10) j5g.Y(ztm0Var.t1("tab", new jai(-1624267612, new q0r((anx) this.d, (yzs) this.f), true)))).N(o6jVar.a);
                int i = N.b;
                int i2 = N.c;
                final boolean z = this.c;
                final int i3 = this.e;
                return ztm0Var.Q(i, i2, jgp.b, new izs() { // from class: xsna.tiv0
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        tra0.a aVar = (tra0.a) obj3;
                        final boolean z2 = z;
                        final int i4 = i3;
                        zo10 zo10Var = (zo10) j5g.a0(ztm0.this.t1("indicator", new jai(1508670003, new wzs() { // from class: xsna.niv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1508670003, intValue, -1, "com.vk.core.compose.component.VkSecondaryScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:239)");
                                    }
                                    if (z2 && i4 == 0) {
                                        aVar2.K(-2044586284);
                                        ziv0.a(0, aVar2);
                                    } else {
                                        aVar2.K(-2054051793);
                                    }
                                    aVar2.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, true)));
                        tra0 tra0Var = N;
                        if (zo10Var != null) {
                            long j = o6jVar.a;
                            int i5 = tra0Var.b;
                            int i6 = tra0Var.c;
                            aVar.q(zo10Var.N(o6j.a(i5, i5, i6, i6)), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        aVar.q(tra0Var, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        return s3q0.a;
                    }
                });
        }
    }

    public /* synthetic */ yue(a4b0 a4b0Var, boolean z, izs izsVar, int i) {
        this.b = 1;
        this.f = a4b0Var;
        this.c = z;
        this.d = izsVar;
        this.e = i;
    }
}
