package xsna;

import com.vk.profile.user.impl.ui.b;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jn20 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jn20(ExtendedUserProfile extendedUserProfile, vlq0 vlq0Var, boolean z) {
        this.d = extendedUserProfile;
        this.e = vlq0Var;
        this.c = z;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                nn20 nn20Var = (nn20) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                nn20Var.b(ne7.I(385), (androidx.compose.runtime.a) obj, q630Var, this.c);
                break;
            default:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.d;
                vlq0 vlq0Var = (vlq0) this.e;
                ((Boolean) obj).getClass();
                extendedUserProfile.l = this.c;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = vlq0Var.j;
                if (izsVar == null) {
                    izsVar = null;
                }
                izsVar.invoke(new b.y(extendedUserProfile));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jn20(nn20 nn20Var, boolean z, q630 q630Var, int i) {
        this.d = nn20Var;
        this.c = z;
        this.e = q630Var;
    }
}
