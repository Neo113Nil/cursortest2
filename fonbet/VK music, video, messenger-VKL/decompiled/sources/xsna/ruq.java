package xsna;

import android.app.Application;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.Features;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.internal.ToggleManager;
import java.util.Set;
import kotlin.InitializedLazyImpl;
import xsna.dx90;

/* compiled from: FeatureManagerInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class ruq extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "FeatureManager";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Application application = this.b;
        Set y0 = rl3.y0(new String[]{Features.Type.FEATURE_NET_OPTIONS.getKey(), Features.Type.FEATURE_NET_ZSTD.getKey(), Features.Type.FEATURE_NET_SEE.getKey(), Features.Type.FEATURE_NET_API_METHODS_CONFIG.getKey(), Features.Type.FEATURE_CORE_PROXY_COMBINED_STATE.getKey(), Features.Type.FEATURE_CLIPS_TABLETS_DISABLED.getKey(), Features.Type.FEATURE_CORE_FORK_JOIN_IN_PARALLEL.getKey(), Features.Type.FEATURE_NET_HTTP_CACHE_CONFIG.getKey(), CoreFeatures.SAVE_STAT_STATE_ON_EACH_EVENT.getKey(), Features.Type.FEATURE_IM_MEDIASCOPE.getKey(), Features.Type.FEATURE_EASTER_EGGS.getKey(), Features.Type.FEATURE_EASTER_EGGS_QUEUE.getKey(), CoreFeatures.DO_NOT_KILL_ROOT_FRAGMENTS.getKey(), Features.Type.FEATURE_NET_STARTUP_BACKOFF_CONFIG.getKey(), CoreFeatures.BASEURL_VALIDATE_PHOTO_SIZES.getKey(), CoreFeatures.COMMON_WEBSOCKET.getKey(), CoreFeatures.COMMON_WEBSOCKET_COMPRESSION.getKey(), CoreFeatures.COMMON_WEBSOCKET_RATE_LIMIT.getKey(), CoreFeatures.NEW_NETWORK_CALLBACK.getKey(), CoreFeatures.NET_BUCKET_PRIORITY.getKey(), CoreFeatures.STAT_TRIGGERS.getKey(), CoreFeatures.CONSCRYPT_THREAD_DEDUP.getKey(), CoreFeatures.LEGO_REDESIGN.getKey(), CoreFeatures.CRONET_EXECUTOR_CONFIG.getKey(), CoreFeatures.CORE_SKIP_RETRY_SERVER_DOWN.getKey(), Features.Type.FEATURE_CORE_RUSTORE_PUSHES.getKey()});
        nb3 nb3Var = nb3.a;
        String valueOf = String.valueOf(o25.a().c().b);
        boolean b = o25.a().b();
        bpn0 bpn0Var = new bpn0(new ya3(application, 0));
        y0.toString();
        asu0.a.getClass();
        nb3.h = new ToggleManager.c(y0, asu0.n(), new za3(0));
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        ToggleManager.c cVar = nb3.h;
        if (cVar == null) {
            cVar = null;
        }
        bVar.c = cVar;
        bpn0 bpn0Var2 = new bpn0(new cu2(1));
        Features features = new Features();
        bpn0 bpn0Var3 = new bpn0(new ab3(0));
        bpn0 bpn0Var4 = new bpn0(new eu2(1));
        bVar.l(new ToggleManager.b(bpn0Var, b, bpn0Var2, valueOf, new InitializedLazyImpl(features), new bb3(0), bpn0Var3, bpn0Var4, new cb3(0)));
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        dx90Var.q = System.currentTimeMillis();
        int i = dx90.W;
        dx90.b.b("initToggles");
        dx90Var.r();
        return s3q0.a;
    }
}
