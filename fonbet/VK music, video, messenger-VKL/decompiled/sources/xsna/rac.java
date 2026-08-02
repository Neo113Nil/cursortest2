package xsna;

import com.vk.core.compose.component.defaults.TabMode;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import xsna.osn0;
import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rac implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rac(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.e = obj2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                fbc.e(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 1:
                ((Integer) obj2).intValue();
                com.vk.profile.community.impl.ui.trust_mark.e.f((CommunityTrustMarksArgs.TrustMarkData) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                r3m r3mVar = (r3m) this.c;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                r3mVar.g(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((v0r) this.c).m((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((b2x) this.c).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                kta0.b((q630) this.e, (jai) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                zrf0.a((r1k0.a.b) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((osn0.a) this.c).a((TabMode) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rac(Object obj, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = xzsVar;
        this.d = i;
    }

    public /* synthetic */ rac(osn0.a aVar, TabMode tabMode, int i) {
        this.b = 7;
        this.c = aVar;
        this.e = tabMode;
        this.d = i;
    }
}
