package xsna;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.sdk.controller.f;
import io.opentelemetry.api.trace.StatusCode;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import one.video.player.OneVideoPlayer;

/* compiled from: OpenTelemetryCollector.kt */
/* loaded from: classes17.dex */
public final class ks80 implements com.vk.core.telemetry.b {
    public final wmd0 a;
    public final bpn0 e;
    public final HashMap<String, Boolean> b = new HashMap<>();
    public final HashMap<Integer, Set<String>> c = new HashMap<>();
    public final Handler d = new Handler(Looper.getMainLooper());
    public final js80 f = new js80(this);
    public final fs80 g = new fs80(this);

    public ks80(wmd0 wmd0Var, bpn0 bpn0Var) {
        this.a = wmd0Var;
        this.e = bpn0Var;
    }

    public static final void d(ks80 ks80Var, OneVideoPlayer oneVideoPlayer, wzs wzsVar) {
        Set<String> remove;
        if (ks80Var.d.getLooper().isCurrentThread() && (remove = ks80Var.c.remove(Integer.valueOf(oneVideoPlayer.hashCode()))) != null) {
            for (String str : remove) {
                ks80Var.f().g(str);
                ohk0 a = ks80Var.f().a(str);
                if (a != null) {
                    wzsVar.invoke(a, str);
                    a.end();
                }
            }
        }
    }

    public static void e(OneVideoPlayer oneVideoPlayer, izs izsVar) {
        List<String> pathSegments;
        int indexOf;
        sht0 j = oneVideoPlayer.j();
        String str = null;
        Uri uri = j != null ? j.b : null;
        if (uri != null && (indexOf = (pathSegments = uri.getPathSegments()).indexOf("id")) != -1 && indexOf < pathSegments.size() - 1) {
            str = pathSegments.get(indexOf + 1);
        } else if (uri != null) {
            str = uri.getQueryParameter("id");
        }
        if (str != null) {
            izsVar.invoke(str);
        }
    }

    public static void g(ks80 ks80Var, OneVideoPlayer oneVideoPlayer, String str, String str2) {
        ohk0 f = ks80Var.f().f(str2);
        if (str.equals("STATE:BUFFERING")) {
            Boolean bool = ks80Var.b.get(str2);
            if ((bool != null ? bool.booleanValue() : false) && oneVideoPlayer.a() < 1000) {
                ks80Var.f().d(str2);
                if (f != null) {
                    f.l(StatusCode.ERROR);
                }
            }
        } else {
            ks80Var.f().g(str2);
        }
        if (f != null) {
            f.c("NEW_STATE: ".concat(str));
        }
    }

    @Override // com.vk.core.telemetry.b
    public final void a(String str, String str2) {
        ohk0 f;
        List<String> pathSegments;
        int indexOf;
        Uri parse = Uri.parse(str2);
        String queryParameter = (parse == null || (indexOf = (pathSegments = parse.getPathSegments()).indexOf("id")) == -1 || indexOf >= pathSegments.size() + (-1)) ? parse != null ? parse.getQueryParameter("id") : null : pathSegments.get(indexOf + 1);
        if (queryParameter == null || (f = f().f(queryParameter)) == null) {
            return;
        }
        f.j("onAdStart", new lk3().b(f.b.c, str).e());
    }

    @Override // com.vk.core.telemetry.b
    public final void b(OneVideoPlayer oneVideoPlayer) {
        c(oneVideoPlayer);
        oneVideoPlayer.d0(this.f);
        oneVideoPlayer.D(this.g);
    }

    @Override // com.vk.core.telemetry.b
    public final void c(OneVideoPlayer oneVideoPlayer) {
        oneVideoPlayer.c0(this.f);
        oneVideoPlayer.K(this.g);
    }

    public final com.vk.core.telemetry.a f() {
        return (com.vk.core.telemetry.a) this.e.getValue();
    }

    @Override // com.vk.core.telemetry.b
    public final void onAdEnd(String str) {
        ohk0 f;
        List<String> pathSegments;
        int indexOf;
        Uri parse = Uri.parse(str);
        String queryParameter = (parse == null || (indexOf = (pathSegments = parse.getPathSegments()).indexOf("id")) == -1 || indexOf >= pathSegments.size() + (-1)) ? parse != null ? parse.getQueryParameter("id") : null : pathSegments.get(indexOf + 1);
        if (queryParameter == null || (f = f().f(queryParameter)) == null) {
            return;
        }
        f.c("onAdEnd");
    }
}
