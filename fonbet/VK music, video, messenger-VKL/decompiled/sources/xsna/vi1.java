package xsna;

import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.video.growth.impl.ui.entity.TrapViewState;
import xsna.b78;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vi1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vi1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                xi1.c((pi1) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                com.vk.profile.community.impl.ui.trust_mark.e.g((CommunityTrustMarksArgs.TrustMarkData) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                t1x.b((r1x) this.d, (jai) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                ((vwy) this.d).f(this.c, this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((n030) this.d).c((gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                uob0.b((gzs) this.d, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                ((tgg0) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                jpp0.a((TrapViewState) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x8u0.d((b78.b) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vi1(gzs gzsVar, gzs gzsVar2, int i) {
        this.b = 5;
        this.d = gzsVar;
        this.e = gzsVar2;
        this.c = i;
    }

    public /* synthetic */ vi1(r1x r1xVar, jai jaiVar, int i) {
        this.b = 2;
        this.d = r1xVar;
        this.e = jaiVar;
        this.c = i;
    }

    public /* synthetic */ vi1(vwy vwyVar, int i, Object obj, int i2) {
        this.b = 3;
        this.d = vwyVar;
        this.c = i;
        this.e = obj;
    }
}
