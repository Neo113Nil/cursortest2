package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4605ve;
import com.ironsource.Ce;
import com.ironsource.InterfaceC4569te;
import com.ironsource.W2;
import com.vk.log.L;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class sla implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sla(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Ce.b((Context) this.c, (C4605ve) this.d, (InterfaceC4569te) this.e);
                break;
            case 1:
                ((EglRenderer) this.c).lambda$removeRenderListener$3((CountDownLatch) this.d, (EglRenderer.RenderListener) this.e);
                break;
            case 2:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.c;
                rhq0 rhq0Var = (rhq0) this.d;
                try {
                    ((FragmentActivity) this.e).startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(extendedUserProfile.v0, new StringBuilder("tel:"))));
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
                break;
            default:
                W2.a.a((W2) this.c, (View) this.d, (View) this.e);
                break;
        }
    }
}
