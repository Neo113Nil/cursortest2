package xsna;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.log.L;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: UserDetailsItemsFactory.kt */
/* loaded from: classes5.dex */
public final class qhq0<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ rhq0 b;
    public final /* synthetic */ rhq0 c;
    public final /* synthetic */ FragmentActivity d;
    public final /* synthetic */ ExtendedUserProfile e;

    public qhq0(rhq0 rhq0Var, rhq0 rhq0Var2, FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile) {
        this.b = rhq0Var;
        this.c = rhq0Var2;
        this.d = fragmentActivity;
        this.e = extendedUserProfile;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof ActivityNotFoundException)) {
            if ((th instanceof NullPointerException) && rhq0.c(this.b)) {
                L.G(ms9.b("Can't start activity cause of internal OS error: ", th));
                return;
            } else {
                com.vk.metrics.eventtracking.b.a.q(th);
                return;
            }
        }
        try {
            this.d.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(this.e.C0, new StringBuilder("https://instagram.com/"))));
        } catch (Throwable th2) {
            if (th2 instanceof ActivityNotFoundException) {
                return;
            }
            if ((th2 instanceof NullPointerException) && rhq0.c(this.c)) {
                L.G(ms9.b("Can't start activity cause of internal OS error: ", th2));
            } else {
                com.vk.metrics.eventtracking.b.a.q(th2);
            }
        }
    }
}
