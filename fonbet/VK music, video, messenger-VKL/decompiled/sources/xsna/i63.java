package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vk.common.links.LaunchContext;

/* compiled from: AppLinkProcessor.kt */
/* loaded from: classes17.dex */
public final class i63 extends aq80 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ Uri d;
    public final /* synthetic */ j63 e;
    public final /* synthetic */ LaunchContext f;
    public final /* synthetic */ Bundle g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i63(Context context, Uri uri, j63 j63Var, LaunchContext launchContext, Bundle bundle) {
        super(context);
        this.c = context;
        this.d = uri;
        this.e = j63Var;
        this.f = launchContext;
        this.g = bundle;
    }

    @Override // xsna.yp80
    public final void U() {
        if (naz.u(this.d)) {
            this.e.h.d(this.c, Uri.parse("https://" + a0a.d + "/404"), true);
            return;
        }
        if (naz.s(this.d)) {
            this.e.h.d(this.c, this.d, true);
            return;
        }
        if (this.f.b) {
            return;
        }
        this.e.h.f(this.c, this.g, this.f, this.d.toString());
    }
}
