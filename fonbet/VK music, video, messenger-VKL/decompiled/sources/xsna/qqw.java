package xsna;

import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import xsna.gqx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qqw implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;

    public /* synthetic */ qqw(izs izsVar) {
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                rqw.a(this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                this.c.invoke(new gqx.d((InviteFriendsTabIndex) obj));
                break;
        }
        return s3q0.a;
    }
}
