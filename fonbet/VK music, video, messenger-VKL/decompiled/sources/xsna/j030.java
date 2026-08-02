package xsna;

import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import xsna.asx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class j030 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ xzs g;

    public /* synthetic */ j030(int i, int i2, Object obj, Object obj2, Object obj3, xzs xzsVar) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = xzsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((n030) this.d).f((gzs) this.e, (gzs) this.f, (gzs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gsn0.a((InviteFriendsTabIndex) this.d, (asx.a) this.e, (q630) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
