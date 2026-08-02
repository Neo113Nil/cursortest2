package xsna;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Be;
import com.ironsource.C4278d9;
import com.ironsource.C4498pe;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.log.L;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class vv6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vv6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Be.d.a((Be) this.c, (C4498pe) this.d, (C4278d9) this.e);
                break;
            case 1:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.c;
                rhq0 rhq0Var = (rhq0) this.d;
                try {
                    ((FragmentActivity) this.e).startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("skype:" + extendedUserProfile.w0 + "?call")));
                    break;
                } catch (Throwable th) {
                    if (th instanceof ActivityNotFoundException) {
                        return;
                    }
                    if ((th instanceof NullPointerException) && rhq0.c(rhq0Var)) {
                        L.G(ms9.b("Can't start activity cause of internal OS error: ", th));
                        return;
                    } else {
                        com.vk.metrics.eventtracking.b.a.q(th);
                        return;
                    }
                }
            case 2:
                new vs8().a(((aaw0) this.c).b, (VmojiPurchaseProductResponseDto) this.d, (gd0) this.e);
                break;
            default:
                hcz0 hcz0Var = (hcz0) this.c;
                String str = (String) this.d;
                if (!hcz0Var.b(str, (hdz0) this.e)) {
                    hcz0Var.a(str, (String) new caz0().d(str, null, null).c);
                    break;
                } else {
                    gu8.c(null, "AudioLoader: can't load. Audio already loading");
                    break;
                }
        }
    }
}
