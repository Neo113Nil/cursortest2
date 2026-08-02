package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jf80 implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jf80(List list, izs izsVar, wh50 wh50Var) {
        this.d = list;
        this.c = izsVar;
        this.e = wh50Var;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                this.c.invoke(new te80((qg80) this.d, ((mc90) this.e).r(), ((yg5) obj).A().a1(), ((Long) obj2).longValue(), ((Long) obj3).longValue()));
                break;
            default:
                List list = (List) this.d;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i = 16;
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-246428120, intValue, -1, "com.vk.design.demo.presentation.components.SelectSlot.<anonymous> (SelectSlot.kt:75)");
                    }
                    for (Object obj4 : list) {
                        String valueOf = String.valueOf(obj4);
                        q630 f = txj0.f(q630.a.a, 1.0f);
                        izs izsVar = this.c;
                        boolean J = aVar.J(izsVar) | aVar.y(obj4);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new f56(izsVar, obj4, wh50Var, 5);
                            aVar.R(x);
                        }
                        androidx.compose.runtime.a aVar2 = aVar;
                        yqv0.c(valueOf, s200.D(ojc.c(f, false, null, null, (gzs) x, 15), i), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 0, 0, 16380);
                        aVar = aVar2;
                        jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 0, 15);
                        i = i;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jf80(izs izsVar, qg80 qg80Var, mc90 mc90Var) {
        this.c = izsVar;
        this.d = qg80Var;
        this.e = mc90Var;
    }
}
