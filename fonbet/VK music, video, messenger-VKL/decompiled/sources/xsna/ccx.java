package xsna;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.c63;
import xsna.kcx;

/* compiled from: InteractiveVideoBackgroundControllerImpl.kt */
/* loaded from: classes3.dex */
public final class ccx implements com.vk.movika.api.a {
    public final Context a;
    public final NotificationManager b;
    public final bpn0 c;

    /* compiled from: InteractiveVideoBackgroundControllerImpl.kt */
    public static final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void v() {
            ccx ccxVar = ccx.this;
            Context context = ccxVar.a;
            new kcx(context, new kcx.a(pn00.k(new Pair("body", context.getString(R.string.interactive_videos_push_text)), new Pair("icon", BuildInfo.q() ? "video_24" : "")))).g(ccxVar.b);
        }

        @Override // xsna.c63.b
        public final void w() {
            ccx.this.b.cancel("local_default", 1);
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            ccx.this.b.cancel("local_default", 1);
        }
    }

    public ccx() {
        Context context = e43.a;
        context = context == null ? null : context;
        this.a = context;
        ca70 ca70Var = ca70.a;
        this.b = ca70.f(context);
        this.c = new bpn0(new rkt(this, 5));
    }

    @Override // com.vk.movika.api.a
    public final void disable() {
        this.b.cancel("local_default", 1);
        c63 c63Var = c63.a;
        c63.c((a) this.c.getValue());
    }

    @Override // com.vk.movika.api.a
    public final void enable() {
        c63 c63Var = c63.a;
        c63.a((a) this.c.getValue());
    }
}
