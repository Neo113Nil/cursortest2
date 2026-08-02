package xsna;

import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class hrx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hrx(InviteFriendsTabIndex inviteFriendsTabIndex, yrx yrxVar, q630 q630Var, izs izsVar, int i) {
        this.b = 1;
        this.f = inviteFriendsTabIndex;
        this.g = yrxVar;
        this.c = q630Var;
        this.d = izsVar;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((krx) this.f).j((q630) this.c, (s890) this.g, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gsn0.c((InviteFriendsTabIndex) this.f, (yrx) this.g, (q630) this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((tmt0) this.f).e((a8a) this.c, (vmt0) this.g, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hrx(Object obj, Object obj2, Object obj3, izs izsVar, int i, int i2) {
        this.b = i2;
        this.f = obj;
        this.c = obj2;
        this.g = obj3;
        this.d = izsVar;
        this.e = i;
    }
}
