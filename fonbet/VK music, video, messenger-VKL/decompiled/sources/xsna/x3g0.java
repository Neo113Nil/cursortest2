package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.data.b;
import xsna.qjc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3g0 implements qjc.a, t8z0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x3g0(Context context, UserId userId, LinkButton linkButton) {
        this.b = context;
        this.c = userId;
        this.d = linkButton;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        UserId userId = (UserId) this.c;
        LinkButton linkButton = (LinkButton) this.d;
        Context context = this.b;
        if (context != null) {
            di60.w(linkButton.c, context, null, null, null, null, 62);
        }
        b.d dVar = new b.d("donut_click_pay");
        dVar.b("replies_placeholder", "source");
        dVar.b(userId, "owner_id");
        dVar.e();
    }

    @Override // xsna.t8z0
    public void accept(Object obj) {
        zfz0 zfz0Var = (zfz0) this.c;
        String str = (String) this.d;
        Context context = this.b;
        String str2 = (String) obj;
        if (str2 != null) {
            str = str2;
        }
        mfz0.a(str, zfz0Var.a, context);
        ndz0 ndz0Var = zfz0Var.b;
        synchronized (ndz0Var) {
            int i = ndz0Var.b - 1;
            ndz0Var.b = i;
            if (i == 0) {
                synchronized (ndz0Var) {
                    ndz0Var.a = false;
                    ndz0Var.c = SystemClock.elapsedRealtime() + 800;
                }
            }
        }
    }

    public /* synthetic */ x3g0(zfz0 zfz0Var, String str, xey0 xey0Var, Context context, fiz0 fiz0Var) {
        this.c = zfz0Var;
        this.d = str;
        this.b = context;
    }
}
