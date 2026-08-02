package xsna;

import com.google.gson.Gson;
import com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.Ad;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import io.appmetrica.analytics.impl.L2;
import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ThreadCountReporter.kt */
/* loaded from: classes.dex */
public final class oqo0 {
    public static volatile boolean d;
    public static volatile SchemeStat$TypeDevNullItem e;
    public static final Object f = pn00.k(new Pair("thread", "th"), new Pair("threads", "th"), new Pair("pool", "pl"), new Pair(L2.g, "bg"), new Pair("network", "net"), new Pair("net", "net"), new Pair("io", "io"), new Pair("dispatcher", "disp"), new Pair(BuildConfig.FLAVOR, "def"), new Pair("okhttp", ApiUris.SCHEME_OK), new Pair("okio", "oio"), new Pair("firebase", "fb"), new Pair("cronet", "cr"), new Pair("download", "dl"), new Pair("downloadmanager", "dlmgr"), new Pair("download-manager", "dl-mgr"), new Pair("computation", "comp"), new Pair("computation-thread", "comp-th"), new Pair(SignalingProtocol.NOTIFY_CONNECTION, "conn"), new Pair("conn", "conn"), new Pair("logger", "log"), new Pair("logging", "log"), new Pair("measurement", "meas"), new Pair("monitoring", "mon"), new Pair("handler", "hnd"), new Pair("hd", "hnd"), new Pair("manager", "mgr"), new Pair("mgr", "mgr"), new Pair("init", "init"), new Pair("initialize", "init"), new Pair("service", "svc"), new Pair("api", "api"), new Pair(X3.i.Z, X3.i.Z), new Pair("render", "rndr"), new Pair(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, TrackProductionApertureDimensionsAtom.TYPE), new Pair("statistics", "stats"), new Pair("stats", "stats"), new Pair("uploader", "upl"), new Pair("saver", "sv"), new Pair("repository", "repo"), new Pair("executor", "exec"), new Pair("executors", "exec"), new Pair("task", "tsk"), new Pair("tasks", "tsk"), new Pair("taskrunner", "tr"), new Pair("queue", CampaignEx.JSON_KEY_AD_Q), new Pair("scheduled", "sched"), new Pair("scheduler", "sched"), new Pair("listener", "lst"), new Pair("observer", "obs"), new Pair("heap", "heap"), new Pair("heapdump", "heap"), new Pair("leakcanary", "lc"), new Pair("firebase-messaging", "fb-msg"), new Pair("fb-msg", "fb-msg"), new Pair("connectivity", "conn"), new Pair("push", "push"), new Pair("push-registration", "push-reg"), new Pair("push-reg", "push-reg"), new Pair("measurement-worker", "meas-wrk"), new Pair("meas-wrk", "meas-wrk"), new Pair("foreground", "fg"), new Pair("foreground-worker", "fg-wrk"), new Pair("blocking", "blk"), new Pair("blocking-thread", "blk-th"), new Pair("default-jobs-manager-internal", "def-jm"), new Pair("io-bound", "io-bd"), new Pair("cached", "cch"), new Pair("cached-worker", "c-wk"), new Pair("long-poll", "lp"), new Pair("longpoll", "lp"), new Pair("sync", "sync"), new Pair("upload", "upl"), new Pair("tracker", "trk"), new Pair("tracking", "trk"), new Pair("toggle", "tgl"), new Pair("toggles", "tgl"), new Pair("scheduler-thread", "sched-th"), new Pair("apply-prefs", "prefs"), new Pair("reaper", "reap"), new Pair("watchdog", "wd"), new Pair("finalizer", "fin"), new Pair("signal-catcher", "sig"), new Pair("rapid", "fast"), new Pair("fast", "fast"), new Pair("high-priority", "hi-pr"), new Pair("low-priority", "lo-pr"), new Pair(Ad.d, "1x"), new Pair("worker", "wk"), new Pair("worker-pool", "wk-pl"), new Pair("eviction-evictor", "evct"), new Pair("metrics", "met"), new Pair("requests", HiAnalyticsConstant.Direction.REQUEST), new Pair("requests-executor", "req-exec"), new Pair("api.vk.ru", "vk"), new Pair("vk.ru", "vk"), new Pair("vk", "vk"), new Pair("binder", "bndr"), new Pair("exoplayer", "expl"), new Pair("fresco", "fre"), new Pair("decode", "dec"), new Pair("deamon", "dmn"));
    public final boolean a;
    public final List<String> b;
    public final Gson c = com.vk.stat.scheme.w.a();

    /* compiled from: ThreadCountReporter.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    /* compiled from: _Collections.kt */
    /* loaded from: classes3.dex */
    public static final class b implements nou<Thread, Thread.State> {
        public final /* synthetic */ Iterable b;

        public b(Iterable iterable) {
            this.b = iterable;
        }

        @Override // xsna.nou
        public final Iterator<Thread> c() {
            return this.b.iterator();
        }

        @Override // xsna.nou
        public final Thread.State e(Thread thread) {
            return thread.getState();
        }
    }

    public oqo0(boolean z, List<String> list) {
        this.a = z;
        this.b = list;
    }

    public static SchemeStat$TypeDevNullItem a(int i, Set set) {
        Map a2 = pou.a(new b(set));
        String h = DevNullEventKey.THREAD_COUNT.h();
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(set.size());
        Integer num = (Integer) a2.get(Thread.State.NEW);
        Integer valueOf3 = Integer.valueOf(num != null ? num.intValue() : 0);
        Integer num2 = (Integer) a2.get(Thread.State.RUNNABLE);
        Integer valueOf4 = Integer.valueOf(num2 != null ? num2.intValue() : 0);
        Integer num3 = (Integer) a2.get(Thread.State.BLOCKED);
        Integer valueOf5 = Integer.valueOf(num3 != null ? num3.intValue() : 0);
        Integer num4 = (Integer) a2.get(Thread.State.WAITING);
        Integer valueOf6 = Integer.valueOf(num4 != null ? num4.intValue() : 0);
        Integer num5 = (Integer) a2.get(Thread.State.TIMED_WAITING);
        Integer valueOf7 = Integer.valueOf(num5 != null ? num5.intValue() : 0);
        Integer num6 = (Integer) a2.get(Thread.State.TERMINATED);
        return new SchemeStat$TypeDevNullItem(h, null, null, valueOf, null, valueOf2, null, valueOf3, null, valueOf4, null, null, null, valueOf5, null, valueOf6, null, valueOf7, null, Integer.valueOf(num6 != null ? num6.intValue() : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -697002, 3, null);
    }

    public static Set b() {
        Object failure;
        try {
            failure = Thread.getAllStackTraces().keySet();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(new a(a2));
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Set set = (Set) failure;
        if (set == null) {
            return null;
        }
        return set;
    }

    public final String c(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.c.toJson(list);
    }
}
