package xsna;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.history.ForceLogReason;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import org.json.JSONObject;
import xsna.h7u0;
import xsna.zhr0;

/* compiled from: VKCastManager.kt */
/* loaded from: classes2.dex */
public final class fbr0 {
    public final Context a;
    public final gzs<yg5> b;
    public final xbc c;
    public boolean d;
    public a e;

    /* compiled from: VKCastManager.kt */
    public static final class a implements y2e0 {
        public final yg5 a;
        public boolean b;
        public Long c;

        public a(yg5 yg5Var) {
            this.a = yg5Var;
        }

        @Override // xsna.y2e0
        public final void a(long j) {
            hui0 d;
            g0a c;
            lvf0 k;
            yg5 yg5Var = this.a;
            o100 o100Var = uz9.m;
            exc0.e("Must be called from the main thread.");
            uz9 uz9Var = uz9.o;
            boolean z = false;
            if (uz9Var != null && (d = uz9Var.d()) != null && (c = d.c()) != null && (k = c.k()) != null && k.p()) {
                z = true;
            }
            if (z != this.b) {
                yg5Var.seek(j);
                yg5Var.x0(ForceLogReason.SEEK);
            }
            this.b = z;
            this.c = Long.valueOf(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fbr0(Context context, gzs<? extends yg5> gzsVar) {
        this.a = context;
        this.b = gzsVar;
        d0a b = b();
        avj0 avj0Var = new avj0(this, 14);
        gbr0 gbr0Var = new gbr0(context, this);
        hbr0 hbr0Var = new hbr0(this);
        xbc xbcVar = null;
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context.getApplicationContext()) == 0) {
            try {
                xbcVar = new xbc(context, b, avj0Var, gbr0Var, hbr0Var);
            } catch (Throwable unused) {
            }
        }
        this.c = xbcVar;
    }

    public static final void a(fbr0 fbr0Var, MediaRouteConnectStatus mediaRouteConnectStatus) {
        Map<String, yg5> c;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        a2.x = mediaRouteConnectStatus;
        if (mediaRouteConnectStatus == null || (c = a2.c()) == null) {
            return;
        }
        Iterator<Map.Entry<String, yg5>> it = c.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setMediaRouteConnectStatus(mediaRouteConnectStatus);
        }
    }

    public final d0a b() {
        VideoFile A;
        zhr0.a aVar;
        String str;
        yg5 invoke = this.b.invoke();
        if (invoke == null || (A = invoke.A()) == null || (aVar = (zhr0.a) rli0.n(rli0.t(new i5g(zhr0.a(A)), new alj0(A, 15)))) == null) {
            return null;
        }
        String str2 = aVar.a;
        int i = nlj.$EnumSwitchMapping$0[aVar.b.ordinal()];
        if (i != 1) {
            str = "application/x-mpegurl";
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = MimeTypes.VIDEO_MP4;
            }
        } else {
            str = MimeTypes.APPLICATION_MPD;
        }
        String str3 = str;
        String title = A.getTitle();
        String j1 = A.j1();
        String h = ixj0.h(A.getImage().b);
        long duration = A.getDuration();
        boolean q0 = A.q0();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("video_id", A.a1());
        return new d0a(title, j1, h, str2, str3, duration, q0, jSONObject);
    }

    public final void c() {
        hui0 d;
        xbc xbcVar = this.c;
        if (xbcVar != null) {
            uz9 uz9Var = xbcVar.e;
            if (uz9Var != null && (d = uz9Var.d()) != null) {
                d.e(xbcVar.g);
            }
            if (uz9Var != null) {
                uz9Var.f(xbcVar.h);
            }
        }
    }

    public final void d() {
        hui0 d;
        hui0 d2;
        xbc xbcVar = this.c;
        if (xbcVar != null) {
            uz9 uz9Var = xbcVar.e;
            v20 v20Var = xbcVar.h;
            m0g0 m0g0Var = xbcVar.g;
            if (uz9Var != null && (d2 = uz9Var.d()) != null) {
                d2.e(m0g0Var);
            }
            if (uz9Var != null && (d = uz9Var.d()) != null) {
                d.a(m0g0Var);
            }
            if (uz9Var != null) {
                uz9Var.f(v20Var);
            }
            if (uz9Var != null) {
                uz9Var.a(v20Var);
            }
            Integer valueOf = uz9Var != null ? Integer.valueOf(uz9Var.b()) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                xbcVar.a(intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? MediaRouteConnectStatus.NO_DEVICES_AVAILABLE : MediaRouteConnectStatus.CONNECTED : MediaRouteConnectStatus.CONNECTING : MediaRouteConnectStatus.NOT_CONNECTED : MediaRouteConnectStatus.NO_DEVICES_AVAILABLE);
            }
        }
    }

    public final void e() {
        xbc xbcVar;
        g0a g0aVar;
        CastDevice j;
        yg5 invoke = this.b.invoke();
        if (invoke == null || (xbcVar = this.c) == null || (g0aVar = xbcVar.f) == null) {
            return;
        }
        int i = 1;
        if (!g0aVar.c() || invoke.w0() || this.d) {
            return;
        }
        List<VideoUrl> list = zhr0.a;
        if (zhr0.a(invoke.A()).isEmpty()) {
            return;
        }
        this.d = true;
        g0a g0aVar2 = xbcVar.f;
        String str = (g0aVar2 == null || (j = g0aVar2.j()) == null) ? null : j.e;
        if (str == null) {
            str = "";
        }
        int i2 = h7u0.p;
        Context context = this.a;
        h7u0.a c = h7u0.b.c(context);
        c.g0(R.string.chrome_cast_showing_dialog_title);
        c.a.f = context.getString(R.string.chrome_cast_showing_dialog_description, str);
        c.c0(R.string.chrome_cast_showing_dialog_positive_action, new c9a0(this, i));
        c.W(R.string.chrome_cast_showing_dialog_negative_action, new ebr0());
        c.m();
    }
}
