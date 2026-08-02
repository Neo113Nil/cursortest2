package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;
import kotlin.NoWhenBranchMatchedException;
import xsna.bs70;
import xsna.ds70;
import xsna.mr70;

/* compiled from: ObtainVerificationFeature.kt */
/* loaded from: classes18.dex */
public final class as70 extends wk50<qs70, bs70, mr70, ds70> {
    public final ks70 f;
    public final UserId g;
    public final String h;
    public final unr0 i;
    public final f4z j;
    public final hpj k;

    public as70(mr70 mr70Var, es70 es70Var, ks70 ks70Var, UserId userId, String str, unr0 unr0Var) {
        super(mr70Var, es70Var);
        this.f = ks70Var;
        this.g = userId;
        this.h = str;
        this.i = unr0Var;
        this.j = new f4z();
        this.k = zvj.a(hqu0.a());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // xsna.wk50
    public final void N(bs70 bs70Var, mr70 mr70Var) {
        ls70 ls70Var;
        bs70 bs70Var2 = bs70Var;
        mr70 mr70Var2 = mr70Var;
        boolean z = mr70Var2 instanceof mr70.b;
        hpj hpjVar = this.k;
        String str = null;
        if (z) {
            T(ds70.b.b);
            myc0.h(hpjVar, null, null, new wr70(this, null), 3);
            return;
        }
        if (mr70Var2 instanceof mr70.i) {
            T(new ds70.g(true));
            myc0.h(hpjVar, null, null, new yr70(this, null), 3);
            return;
        }
        boolean z2 = mr70Var2 instanceof mr70.d;
        f4z f4zVar = this.j;
        if (z2) {
            f4zVar.b(rr70.a);
            return;
        }
        if (mr70Var2 instanceof mr70.e) {
            bs70.c cVar = bs70Var2 instanceof bs70.c ? (bs70.c) bs70Var2 : null;
            if (cVar != null && (ls70Var = cVar.b) != null) {
                str = ls70Var.b.b;
            }
            if (str == null || str.length() == 0) {
                return;
            }
            f4zVar.b(new tr70(str));
            return;
        }
        boolean z3 = mr70Var2 instanceof mr70.f;
        String str2 = this.h;
        UserId userId = this.g;
        unr0 unr0Var = this.i;
        if (!z3) {
            if (mr70Var2 instanceof mr70.g) {
                if ((bs70Var2 instanceof bs70.c) && ((bs70.c) bs70Var2).b.f.b) {
                    if (epx.f(str2, "base")) {
                        unr0Var.j(userId.b);
                    } else if (epx.f(str2, "premium")) {
                        unr0Var.k(userId.b);
                    }
                    T(new ds70.g(true));
                    myc0.h(hpjVar, null, null, new vr70(this, null), 3);
                    return;
                }
                return;
            }
            if (mr70Var2 instanceof mr70.j) {
                T(new ds70.g(true));
                myc0.h(hpjVar, null, null, new xr70(this, null), 3);
                return;
            } else if (mr70Var2 instanceof mr70.h) {
                T(new ds70.g(true));
                myc0.h(hpjVar, null, null, new zr70(this, null), 3);
                return;
            } else if (mr70Var2 instanceof mr70.c) {
                T(new ds70.c(null));
                return;
            } else {
                if (!(mr70Var2 instanceof mr70.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new ds70.c(ObtainVerificationScreenContent.CurrentModalType.NONE));
                return;
            }
        }
        mr70.f fVar = (mr70.f) mr70Var2;
        String str3 = fVar.c;
        if (!epx.f(str2, "base")) {
            if (epx.f(str2, "premium")) {
                switch (str3.hashCode()) {
                    case -1813565398:
                        if (str3.equals("business_profile")) {
                            unr0Var.d(userId.b);
                            break;
                        }
                        break;
                    case -938102371:
                        if (str3.equals(CampaignEx.JSON_KEY_STAR)) {
                            unr0Var.b(userId.b);
                            break;
                        }
                        break;
                    case -891985998:
                        if (str3.equals("strike")) {
                            unr0Var.c(userId.b);
                            break;
                        }
                        break;
                    case 138992833:
                        if (str3.equals("verified_business_profile")) {
                            unr0Var.h(userId.b);
                            break;
                        }
                        break;
                    case 341203229:
                        if (str3.equals("subscription")) {
                            unr0Var.e(userId.b);
                            break;
                        }
                        break;
                }
            }
        } else if (epx.f(str3, "business_profile")) {
            unr0Var.l(userId.b);
        } else if (epx.f(str3, "verified_business_profile")) {
            unr0Var.a(userId.b);
        }
        f4zVar.b(new sr70(fVar.b));
    }
}
