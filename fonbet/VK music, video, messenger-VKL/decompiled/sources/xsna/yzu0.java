package xsna;

import androidx.fragment.app.Fragment;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: VkIdentityEditContractCommon.kt */
/* loaded from: classes6.dex */
public class yzu0 implements wzu0 {
    public final Fragment b;
    public Object c = EmptyList.b;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: VkIdentityEditContractCommon.kt */
    public static final class a implements izs {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
        @Override // xsna.izs
        public final Object invoke(Object obj) {
            yzu0.this.b.fa((WebIdentityCard) obj);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yzu0(zzu0 zzu0Var) {
        this.b = (Fragment) zzu0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
    public final void F4(io.reactivex.rxjava3.core.x<?> xVar) {
        this.d.b(bug0.e(xVar, this.b.getContext(), null, 6).subscribe(new cgu0(new a(), 1), new xzu0(new cim0(this, 13), 0)));
    }

    @Override // xsna.wzu0
    public final void N3(WebIdentityLabel webIdentityLabel, String str, int i) {
        if (i == 0) {
            vdx0 vdx0Var = e370.e;
            F4((vdx0Var != null ? vdx0Var : null).k().h(webIdentityLabel, str));
        } else {
            vdx0 vdx0Var2 = e370.e;
            F4((vdx0Var2 != null ? vdx0Var2 : null).k().f(new WebIdentityPhone(webIdentityLabel, str, i)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
    @Override // xsna.wzu0
    public final void Z(WebIdentityCard webIdentityCard) {
        io.reactivex.rxjava3.internal.operators.single.y e;
        if (webIdentityCard == null) {
            return;
        }
        this.b.E();
        int zb = webIdentityCard.zb();
        String type = webIdentityCard.getType();
        int hashCode = type.hashCode();
        if (hashCode != -1147692044) {
            if (hashCode != 96619420) {
                if (hashCode != 106642798 || !type.equals("phone")) {
                    return;
                }
                vdx0 vdx0Var = e370.e;
                e = (vdx0Var != null ? vdx0Var : null).k().c(zb);
            } else {
                if (!type.equals("email")) {
                    return;
                }
                vdx0 vdx0Var2 = e370.e;
                e = (vdx0Var2 != null ? vdx0Var2 : null).k().b(zb);
            }
        } else {
            if (!type.equals(RTCStatsConstants.KEY_ADDRESS)) {
                return;
            }
            vdx0 vdx0Var3 = e370.e;
            e = (vdx0Var3 != null ? vdx0Var3 : null).k().e(zb);
        }
        this.d.b(e.subscribe(new zk30(new p0p0(3, this, webIdentityCard), 24), new ow40(new bnc0(this, 27), 28)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    @Override // xsna.wzu0
    public final void d0(String str, ArrayList<WebIdentityLabel> arrayList) {
        boolean isEmpty = ((Collection) this.c).isEmpty();
        ?? r1 = this.b;
        if (!isEmpty) {
            r1.vd(this.c);
            return;
        }
        r1.E();
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.d.b(vdx0Var.k().g(str).subscribe(new fsq0(new eci0(9, this, arrayList), 3), new s440(new mmm0(this, 19), 25)));
    }

    @Override // xsna.wzu0
    public final void h1(WebIdentityLabel webIdentityLabel, String str, int i, int i2, String str2, int i3) {
        if (i3 == 0) {
            vdx0 vdx0Var = e370.e;
            F4((vdx0Var != null ? vdx0Var : null).k().k(i, i2, webIdentityLabel, str, str2));
        } else {
            vdx0 vdx0Var2 = e370.e;
            F4((vdx0Var2 != null ? vdx0Var2 : null).k().j(new WebIdentityAddress(webIdentityLabel, str, str2, str, i3, i2, i)));
        }
    }

    @Override // xsna.wzu0
    public final void x4(WebIdentityLabel webIdentityLabel, String str, int i) {
        if (i == 0) {
            vdx0 vdx0Var = e370.e;
            F4((vdx0Var != null ? vdx0Var : null).k().a(webIdentityLabel, str));
        } else {
            vdx0 vdx0Var2 = e370.e;
            F4((vdx0Var2 != null ? vdx0Var2 : null).k().d(new WebIdentityEmail(webIdentityLabel, str, i)));
        }
    }
}
