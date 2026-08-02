package xsna;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadService;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.dto.common.Image;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoContentType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.VideoDownloadFormat;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.offline.settings.api.domain.objects.QualityOptionTypeDo;
import com.vk.log.L;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDownloadItem;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import kotlin.InitializedLazyImpl;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.exo.offline.DownloadInfo;
import one.video.exo.offline.OfflineRequirement;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.b25;
import xsna.c0t0;
import xsna.hfr;
import xsna.hq80;
import xsna.kr10;
import xsna.zot0;

/* compiled from: VideoOfflineManagerImplOld.kt */
/* loaded from: classes.dex */
public final class c0t0 implements ezs0 {
    public final InitializedLazyImpl a;
    public final InitializedLazyImpl b;
    public final bpn0 c;
    public final Object d;
    public final ArrayList e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final xhs0 g;
    public hq80 h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public final Object l;
    public final bpn0 m;
    public final bpn0 n;
    public final wzs0 o;
    public final VkHttpCallFactory p;

    /* compiled from: VideoOfflineManagerImplOld.kt */
    public final class a implements hu70 {
        public Set<String> b;
        public long c;

        public a(HashMap hashMap) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((DownloadInfo) entry.getValue()).f() == DownloadInfo.State.STATE_COMPLETED) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.b = linkedHashMap.keySet();
        }

        @Override // xsna.hu70
        public final void kg(Map<String, ? extends DownloadInfo> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap hashMap = (HashMap) map;
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((DownloadInfo) entry.getValue()).f() != DownloadInfo.State.STATE_COMPLETED) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.values().iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((DownloadInfo) it.next()).a();
            }
            long j2 = this.c;
            Iterator it2 = linkedHashMap.values().iterator();
            long j3 = 0;
            while (it2.hasNext()) {
                j3 += w8o.a((DownloadInfo) it2.next());
            }
            this.c = j3;
            if (j3 != j2) {
                asu0.a.getClass();
                asu0.n().execute(new rzs0(c0t0.this, j3 - j, 0));
            } else if (j3 == 0) {
                c0t0.this.k = true;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (((DownloadInfo) entry2.getValue()).f() == DownloadInfo.State.STATE_COMPLETED) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set<String> keySet = linkedHashMap2.keySet();
            Set g = izi0.g(keySet, this.b);
            c0t0 c0t0Var = c0t0.this;
            Iterator it3 = g.iterator();
            while (it3.hasNext()) {
                try {
                    VideoFileOld d = VideoFile.a.d(new JSONObject(y2r0.r(((DownloadInfo) hashMap.get((String) it3.next())).c())));
                    xhs0 xhs0Var = c0t0Var.g;
                    Long valueOf = Long.valueOf(d.o0());
                    Long valueOf2 = Long.valueOf(d.I0().b);
                    String r = d.r();
                    xhs0Var.getClass();
                    xhs0.d(valueOf, valueOf2, r, MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.FINISHED, null, null);
                } catch (Exception e) {
                    L.i(e);
                }
            }
            this.b = keySet;
        }
    }

    /* compiled from: VideoOfflineManagerImplOld.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoDownloadFormat.values().length];
            try {
                iArr[VideoDownloadFormat.DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoDownloadFormat.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoDownloadFormat.MP4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QualityOptionTypeDo.values().length];
            try {
                iArr2[QualityOptionTypeDo.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[QualityOptionTypeDo.AVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[QualityOptionTypeDo.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((DownloadInfo) t2).f), Long.valueOf(((DownloadInfo) t).f));
        }
    }

    /* compiled from: VideoOfflineManagerImplOld.kt */
    /* loaded from: classes3.dex */
    public static final class d implements hu70 {
        public final /* synthetic */ Ref$ObjectRef<io.reactivex.rxjava3.disposables.c> b;
        public final /* synthetic */ c0t0 c;
        public final /* synthetic */ io.reactivex.rxjava3.core.r<List<czs0>> d;

        public d(Ref$ObjectRef<io.reactivex.rxjava3.disposables.c> ref$ObjectRef, c0t0 c0t0Var, io.reactivex.rxjava3.core.r<List<czs0>> rVar) {
            this.b = ref$ObjectRef;
            this.c = c0t0Var;
            this.d = rVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, io.reactivex.rxjava3.disposables.c] */
        @Override // xsna.hu70
        public final void kg(Map<String, ? extends DownloadInfo> map) {
            Ref$ObjectRef<io.reactivex.rxjava3.disposables.c> ref$ObjectRef = this.b;
            ref$ObjectRef.element.dispose();
            ref$ObjectRef.element = this.c.h().subscribe(new g600(new fvq0(this.d, 10), 29), new yng(new eni0(11), 3));
        }
    }

    /* compiled from: VideoOfflineManagerImplOld.kt */
    /* loaded from: classes3.dex */
    public static final class e implements Consumer<ApplicationStartInfo> {
        public final /* synthetic */ ActivityManager b;

        public e(ActivityManager activityManager) {
            this.b = activityManager;
        }

        @Override // java.util.function.Consumer
        public final void accept(ApplicationStartInfo applicationStartInfo) {
            int reason;
            Intent intent;
            ApplicationStartInfo a = g7x.a(applicationStartInfo);
            reason = a.getReason();
            if (reason != 2) {
                intent = a.getIntent();
                if (epx.f(intent != null ? intent.getAction() : null, "android.intent.action.BOOT_COMPLETED")) {
                    return;
                }
                c0t0.this.N();
                this.b.removeApplicationStartInfoCompletionListener(this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [xsna.wzs0] */
    public c0t0(InitializedLazyImpl initializedLazyImpl, InitializedLazyImpl initializedLazyImpl2, ozv0 ozv0Var) {
        l03 l03Var = new l03(13);
        this.a = initializedLazyImpl;
        this.b = initializedLazyImpl2;
        this.c = new bpn0(new s12(11));
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new io.reactivex.rxjava3.disposables.b();
        this.g = new xhs0(ozv0Var);
        this.k = true;
        this.l = msy.a(LazyThreadSafetyMode.NONE, new tog(this));
        this.m = new bpn0(new j55(l03Var));
        this.n = new bpn0(new k55(12));
        this.o = new b25.a() { // from class: xsna.wzs0
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                c0t0 c0t0Var;
                bu70 L;
                HashMap f;
                if (!fxc0.B().J().A0() || tbu0Var.b() || (L = (c0t0Var = c0t0.this).L()) == null || (f = L.f()) == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : f.entrySet()) {
                    if (((DownloadInfo) entry.getValue()).f() != DownloadInfo.State.STATE_COMPLETED && ((DownloadInfo) entry.getValue()).f() != DownloadInfo.State.STATE_FAILED && ((DownloadInfo) entry.getValue()).f() != DownloadInfo.State.STATE_STOPPED) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    bu70 L2 = c0t0Var.L();
                    if (L2 != null) {
                        L2.h((String) entry2.getKey());
                    }
                }
            }
        };
        this.p = new VkHttpCallFactory(null, new w94(18), 1);
    }

    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x A(int i, String str, String str2) {
        return !c(str) ? new io.reactivex.rxjava3.internal.operators.single.v(new cwk(str2, 4)) : K().A(i, str, str2);
    }

    @Override // xsna.ezs0
    public final io.reactivex.rxjava3.core.q<List<czs0>> B() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new aad0(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ezs0
    public final a.InterfaceC0045a C(a.InterfaceC0045a interfaceC0045a) {
        o0m o0mVar = (o0m) this.l.getValue();
        if (o0mVar == null) {
            return interfaceC0045a;
        }
        androidx.media3.datasource.cache.c cVar = o0mVar.a;
        a.b bVar = null;
        if (cVar != null) {
            a.b bVar2 = new a.b();
            bVar2.a = cVar;
            bVar2.c = o0mVar.b;
            bVar2.e = null;
            bVar2.d(null);
            bVar2.h = 2;
            bVar = bVar2;
        }
        return bVar == null ? androidx.media3.datasource.f.b : bVar;
    }

    @Override // xsna.ezs0
    public final void D(VideoFileOld videoFileOld) {
        P(videoFileOld);
    }

    @Override // xsna.ezs0
    public final boolean E() {
        PrivateFiles.a b2;
        b2 = e8r.a.b(r1, PrivateSubdir.VIDEO_DOWNLOADS_INTERNAL.h(), true);
        return b2.b == PrivateFiles.StorageType.INTERNAL;
    }

    @Override // xsna.ezs0
    public final void F(VideoFile videoFile, VideoScreenMode videoScreenMode) {
        String v = v(videoFile.r1());
        bu70 L = L();
        if (L != null) {
            DownloadInfo d2 = L.d(v);
            if (d2 != null && d2.f() != DownloadInfo.State.STATE_COMPLETED) {
                xhs0.d(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.CANCELLED, this.g.a(videoScreenMode), null);
            }
            L.i(v);
        }
        if (fxc0.B().J().M1()) {
            K().m(videoFile.r1());
        }
        hls0 hls0Var = (hls0) this.n.getValue();
        if (hls0Var != null) {
            itg0.j(hls0Var.c(videoFile.r1()).q(asu0.a.c()), null, 3);
        }
    }

    @Override // xsna.ezs0
    public final boolean G() {
        return this.k;
    }

    @Override // xsna.ezs0
    public final void H() {
        if (this.i) {
            return;
        }
        M();
    }

    public final void I() {
        c63 c63Var = c63.a;
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(Boolean.valueOf(c63.f));
        final e0t0 e0t0Var = new e0t0(O0);
        c63.a(e0t0Var);
        y560 y560Var = d260.b;
        io.reactivex.rxjava3.subjects.d O02 = io.reactivex.rxjava3.subjects.d.O0(Boolean.valueOf(y560Var.a().d1()));
        final f0t0 f0t0Var = new f0t0(O02);
        y560Var.a().a().add(f0t0Var);
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(O0, O02, new jm(new s03(2)));
        new v1w(3);
        efz efzVar = new efz();
        m.getClass();
        io.reactivex.rxjava3.internal.operators.completable.p pVar = new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.observable.i0(m, efzVar).K());
        asu0 asu0Var = asu0.a;
        this.f.b(pVar.q(asu0Var.c()).o(asu0Var.d()).j(new io.reactivex.rxjava3.functions.a() { // from class: xsna.szs0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                d260.b.a().a().remove(f0t0.this);
                c63 c63Var2 = c63.a;
                c63.c(e0t0Var);
            }
        }).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.tzs0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                c0t0.this.g(true);
            }
        }, new i460(new d0t0(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 3)));
    }

    @SuppressLint({"CheckResult"})
    public final void J(ths0 ths0Var, hq80.a aVar, z2d0 z2d0Var, Context context, boolean z) {
        io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(s3q0.a);
        asu0 asu0Var = asu0.a;
        T.a0(asu0Var.c()).U(new si60(new eci0(8, this, aVar), 17)).a0(asu0Var.d()).subscribe(new s440(new a0t0(this, ths0Var, aVar, z2d0Var, context, z), 22));
    }

    public final bzs0 K() {
        return (bzs0) this.m.getValue();
    }

    public final bu70 L() {
        H();
        bu70 bu70Var = bu70.a;
        if (this.i) {
            return bu70Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void M() {
        PrivateFiles.a b2;
        synchronized (this.d) {
            if (this.i) {
                return;
            }
            o0m o0mVar = (o0m) this.l.getValue();
            if (o0mVar != null) {
                kt70 kt70Var = o0mVar.b;
                androidx.media3.datasource.cache.c cVar = o0mVar.a;
                if (cVar != null) {
                    kt70Var.b = cVar.getKeys();
                }
                kt70Var.c = o0mVar.a;
            }
            b2 = e8r.a.b(r2, PrivateSubdir.VIDEO_DOWNLOADS_INTERNAL.h(), true);
            String absolutePath = b2.a.getAbsolutePath();
            Context context = e43.a;
            Context context2 = context != null ? context : null;
            if (fxc0.B().J().Z0()) {
                ((j0t0) this.a.getValue()).getClass();
            }
            try {
                bu70 bu70Var = bu70.a;
                bu70Var.a(context2, (Class) this.c.getValue(), absolutePath, new c.a(context2.getApplicationContext(), new etk(this.p, null)), null, Executors.newFixedThreadPool(2));
                this.i = true;
                bu70 L = L();
                if (L == null) {
                    return;
                }
                L.b(new a(bu70Var.f()));
                I();
                com.vk.core.utils.newtork.b.a.getClass();
                io.reactivex.rxjava3.core.q f = com.vk.core.utils.newtork.b.f();
                VideoFeatures videoFeatures = VideoFeatures.LAZY_VIDEO_BRIDGE;
                videoFeatures.getClass();
                if (!com.vk.toggle.b.A.a(videoFeatures)) {
                    f = f.a0(io.reactivex.rxjava3.android.schedulers.a.b());
                }
                this.f.b(f.subscribe(new c620(new y35(this, 3), 2)));
                o25.a().b0(this.o);
                ((b3o) this.b.getValue()).init();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                synchronized (bu70.a) {
                    try {
                        bu70.f = null;
                        androidx.media3.exoplayer.offline.c cVar2 = bu70.e;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        bu70.e = null;
                        androidx.media3.datasource.cache.c cVar3 = bu70.d;
                        if (cVar3 != null) {
                            cVar3.o();
                        }
                        bu70.d = null;
                        bu70.c = null;
                        bu70.b = null;
                        L.i(th);
                    } finally {
                    }
                }
            }
        }
    }

    public final void N() {
        if (this.i) {
            return;
        }
        asu0.a.getClass();
        asu0.n().execute(new Runnable() { // from class: xsna.xzs0
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c0t0.this.M();
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
            }
        });
    }

    public final void O(VideoFile videoFile, gzs<s3q0> gzsVar) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            this.e.add(new pu90(videoFile, gzsVar));
            return;
        }
        if (fxc0.B().J().M1()) {
            fsk.L(K(), videoFile.r1(), videoFile.getImage());
            String M0 = videoFile.M0();
            if (M0 != null) {
                fsk.K(K(), videoFile.r1(), M0);
            }
            TimelineThumbs B0 = videoFile.B0();
            if (B0 != null) {
                fsk.J(K(), videoFile.r1(), B0);
            }
        } else {
            new qjg0(videoFile, 15).invoke(ImageScreenSize.MID);
        }
        hls0 hls0Var = (hls0) this.n.getValue();
        if (hls0Var != null) {
            itg0.j(hls0Var.b(Collections.singletonList(videoFile)).q(asu0.a.c()), null, 3);
        }
        gzsVar.invoke();
    }

    @SuppressLint({"CheckResult"})
    public final void P(VideoFile videoFile) {
        String v;
        DownloadInfo d2;
        byte[] c2;
        bu70 L = L();
        if (L == null || (d2 = L.d((v = v(videoFile.r1())))) == null || (c2 = d2.c()) == null) {
            return;
        }
        rsg0.w0(znk0.K(videoFile.o0(), videoFile.I0(), videoFile.C1())).subscribe(new le50(new zo8(VideoFile.a.d(new JSONObject(y2r0.r(c2))), L, v, 13), 24), new x9w(new e750(29)));
    }

    @Override // xsna.ezs0
    public final void a() {
        bu70 L = L();
        if (L == null) {
            return;
        }
        Map<String, DownloadInfo> u = u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, DownloadInfo> entry : u.entrySet()) {
            if (entry.getValue().f() != DownloadInfo.State.STATE_COMPLETED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            L.i((String) ((Map.Entry) it.next()).getKey());
        }
    }

    @Override // xsna.ezs0
    public final void b(boolean z) {
        if (this.i) {
            this.f.e();
            a();
            if (z) {
                e();
            }
            ((b3o) this.b.getValue()).b(z);
        }
    }

    @Override // xsna.ezs0
    public final boolean c(String str) {
        Trace.beginSection("VideoOfflineManagerImplOld.hasDownload");
        try {
            bu70 L = L();
            return L != null ? L.g(v(str)) : false;
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.ezs0
    public final void d(VideoFile videoFile, VideoScreenMode videoScreenMode) {
        String v;
        DownloadInfo d2;
        kr10 d3;
        kr10.f fVar;
        Uri uri;
        kr10.f fVar2;
        bu70 L = L();
        if (L == null || (d2 = L.d((v = v(videoFile.r1())))) == null || (d3 = d2.d()) == null || (fVar = d3.b) == null || (uri = fVar.a) == null) {
            return;
        }
        kr10 d4 = d2.d();
        String str = (d4 == null || (fVar2 = d4.b) == null) ? null : fVar2.b;
        gpt0 gpt0Var = gpt0.a;
        String uri2 = uri.toString();
        xuo0.a.getClass();
        if (gpt0.z(xuo0.a(), uri2) || !epx.f(str, MimeTypes.APPLICATION_MPD)) {
            synchronized (L) {
                one.video.exo.offline.c e2 = bu70.e();
                Class<? extends DownloadService> cls = e2.d;
                if (cls != null) {
                    Context context = e2.a;
                    HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap = DownloadService.j;
                    context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON").putExtra("foreground", false).putExtra("content_id", v).putExtra("stop_reason", 0));
                } else {
                    e2.c.i(0, v);
                }
            }
        } else {
            P(videoFile);
        }
        xhs0.d(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.CONTINUED, this.g.a(videoScreenMode), null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ezs0
    public final void e() {
        bu70 L = L();
        if (L == null) {
            return;
        }
        for (Map.Entry<String, DownloadInfo> entry : u().entrySet()) {
            L.i(entry.getKey());
            String str = (String) j5g.k0(drm0.c0(entry.getKey(), new String[]{" | "}, 0, 6));
            if (str != null) {
                if (fxc0.B().J().M1()) {
                    K().m(str);
                }
                hls0 hls0Var = (hls0) this.n.getValue();
                if (hls0Var != null) {
                    itg0.j(hls0Var.c(str).q(asu0.a.c()), null, 3);
                }
            }
        }
        o0m o0mVar = (o0m) this.l.getValue();
        if (o0mVar != null) {
            o0mVar.a();
        }
    }

    @Override // xsna.ezs0
    public final mm80 f() {
        return null;
    }

    @Override // xsna.ezs0
    public final void g(boolean z) {
        synchronized (this.d) {
            try {
                if (this.i && !this.j) {
                    bu70 L = L();
                    if (L == null) {
                        return;
                    }
                    boolean a2 = gz80.a(28);
                    boolean b2 = t5m.b();
                    if (!z || (a2 && !b2)) {
                        ((b3o) this.b.getValue()).c();
                        this.j = true;
                        HashMap f = L.f();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : f.entrySet()) {
                            if (((DownloadInfo) entry.getValue()).f() != DownloadInfo.State.STATE_QUEUED && ((DownloadInfo) entry.getValue()).f() != DownloadInfo.State.STATE_DOWNLOADING) {
                            }
                            if (((DownloadInfo) entry.getValue()).c().length != 0) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            try {
                                synchronized (L) {
                                    one.video.exo.offline.c e2 = bu70.e();
                                    Class<? extends DownloadService> cls = e2.d;
                                    if (cls != null) {
                                        Context context = e2.a;
                                        HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap = DownloadService.j;
                                        DownloadService.l(context, new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS").putExtra("foreground", true), true);
                                    } else {
                                        e2.c.g(false);
                                    }
                                }
                            } catch (Exception e3) {
                                com.vk.metrics.eventtracking.b.a.a(new Throwable("exception in sendResumeDownloads; " + e3.getMessage()));
                            }
                        }
                        hfr.a aVar = new hfr.a(rli0.j(rn00.w(L.f()), new wfl0(5)));
                        while (aVar.hasNext()) {
                            L.i((String) ((Map.Entry) aVar.next()).getKey());
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ezs0
    public final io.reactivex.rxjava3.core.x<List<czs0>> h() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new uja0(this, 1)).q(asu0.a.c());
    }

    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x<Uri> i(String str, String str2) {
        return !c(str) ? new io.reactivex.rxjava3.internal.operators.single.v(new k3c0(str2, 4)) : K().i(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r4 == 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r3 = r3.getIntent();
     */
    @Override // xsna.ezs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void init() {
        List historicalProcessStartReasons;
        Intent intent;
        int reason;
        if (this.i) {
            return;
        }
        if (Build.VERSION.SDK_INT < 35) {
            N();
            return;
        }
        Context context = e43.a;
        String str = null;
        if (context == null) {
            context = null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
        ApplicationStartInfo a2 = g7x.a(j5g.a0(historicalProcessStartReasons));
        if (a2 != null) {
            reason = a2.getReason();
        }
        if (a2 != null && intent != null) {
            str = intent.getAction();
        }
        if (!epx.f(str, "android.intent.action.BOOT_COMPLETED")) {
            N();
            return;
        }
        activityManager.addApplicationStartInfoCompletionListener(context.getMainExecutor(), new e(activityManager));
    }

    @Override // xsna.ezs0
    public final boolean isEnabled() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ezs0
    public final boolean j() {
        o0m o0mVar = (o0m) this.l.getValue();
        return o0mVar == null || o0mVar.a == null;
    }

    @Override // xsna.ezs0
    public final void l() {
        hq80 hq80Var;
        if (!fxc0.B().J().R0() || (hq80Var = this.h) == null) {
            return;
        }
        hq80Var.b();
    }

    @Override // xsna.bzs0
    public final void m(String str) {
        K().m(str);
    }

    @Override // xsna.ezs0
    public final void n(VideoFile videoFile, VideoScreenMode videoScreenMode) {
        bu70 L = L();
        if (L == null) {
            return;
        }
        L.h(v(videoFile.r1()));
        xhs0.d(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.PAUSED, this.g.a(videoScreenMode), null);
    }

    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x o(Image image, String str) {
        return !c(str) ? new io.reactivex.rxjava3.internal.operators.single.v(new c1e(image.Cb(ImageScreenSize.MID.h(), true, false), 4)) : K().o(image, str);
    }

    @Override // xsna.ezs0
    public final boolean p() {
        Map<String, DownloadInfo> u = u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, DownloadInfo> entry : u.entrySet()) {
            if (entry.getValue().f() != DownloadInfo.State.STATE_FAILED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    @Override // xsna.ezs0
    public final long q() {
        Map<String, DownloadInfo> u = u();
        ArrayList arrayList = new ArrayList(u.size());
        Iterator<Map.Entry<String, DownloadInfo>> it = u.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getValue().a()));
        }
        return j5g.G0(arrayList);
    }

    @Override // xsna.ezs0
    public final boolean r() {
        PrivateFiles.a b2;
        b2 = e8r.a.b(r1, PrivateSubdir.VIDEO_DOWNLOADS_INTERNAL.h(), true);
        return b2.b == PrivateFiles.StorageType.EXTERNAL;
    }

    @Override // xsna.ezs0
    public final DownloadInfo s(String str) {
        Trace.beginSection("VideoOfflineManagerImplOld.getDownloadInfo");
        try {
            return u().get(v(str));
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.ezs0
    public final void t(hu70 hu70Var) {
        bu70 L = L();
        if (L != null) {
            L.b(hu70Var);
        }
    }

    @Override // xsna.ezs0
    public final Map<String, DownloadInfo> u() {
        HashMap f;
        UserId c2 = o25.a().c();
        bu70 L = L();
        if (L == null || (f = L.f()) == null) {
            return jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f.entrySet()) {
            List c0 = drm0.c0((String) entry.getKey(), new String[]{" | "}, 0, 6);
            if (epx.f(c0.size() == 1 ? UserId.d : new UserId(Long.parseLong((String) c0.get(0))), c2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // xsna.ezs0
    public final String v(String str) {
        Trace.beginSection("VideoOfflineManagerImplOld.createDownloadUniqueKey");
        try {
            return o25.a().c().b + " | " + str;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [xsna.b0t0] */
    @Override // xsna.ezs0
    public final void w(final ths0 ths0Var, final Context context, final boolean z, final gzs gzsVar, final z2d0 z2d0Var) {
        ArrayList arrayList;
        Iterable c2;
        String d2;
        VideoDownloadFormat videoDownloadFormat;
        InitializedLazyImpl initializedLazyImpl = this.a;
        this.g.b(Long.valueOf(ths0Var.c().o0()), Long.valueOf(ths0Var.c().I0().b), ths0Var.c().r(), ths0Var.b());
        VideoFile c3 = ths0Var.c();
        if (fxc0.B().J().E1() && fkq0.b(c3.I0())) {
            fxc0.B().Z(context, ths0Var.c().a1(), z);
            return;
        }
        if (fxc0.B().J().Z0()) {
            ((j0t0) initializedLazyImpl.getValue()).getClass();
            if (com.vk.core.utils.newtork.b.c().d() != NetworkType.WIFI) {
                xyi0.a(context, z, new izs() { // from class: xsna.b0t0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        c0t0 c0t0Var = c0t0.this;
                        ths0 ths0Var2 = ths0Var;
                        Context context2 = context;
                        boolean z2 = z;
                        gzs gzsVar2 = gzsVar;
                        z2d0 z2d0Var2 = z2d0Var;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ((j0t0) c0t0Var.a.getValue()).getClass();
                        if (booleanValue) {
                            bu70 L = c0t0Var.L();
                            if (L != null) {
                                OfflineRequirement offlineRequirement = OfflineRequirement.NETWORK_UNMETERED;
                                synchronized (L) {
                                    one.video.exo.offline.c e2 = bu70.e();
                                    int i = e2.c.p.c.b;
                                    int i2 = (~offlineRequirement.i()) & i;
                                    if (i != i2) {
                                        e2.d(i2);
                                    }
                                }
                            }
                        } else {
                            bu70 L2 = c0t0Var.L();
                            if (L2 != null) {
                                OfflineRequirement offlineRequirement2 = OfflineRequirement.NETWORK_UNMETERED;
                                synchronized (L2) {
                                    one.video.exo.offline.c e3 = bu70.e();
                                    int i3 = e3.c.p.c.b;
                                    int i4 = offlineRequirement2.i() | i3;
                                    if (i3 != i4) {
                                        e3.d(i4);
                                    }
                                }
                            }
                        }
                        c0t0Var.w(ths0Var2, context2, z2, gzsVar2, z2d0Var2);
                        return s3q0.a;
                    }
                });
                return;
            }
        }
        if (ths0Var.c().U3() != null) {
            b3o b3oVar = (b3o) this.b.getValue();
            UserId I0 = ths0Var.c().I0();
            v(ths0Var.c().r1());
            b3oVar.e(I0);
        }
        if (fxc0.B().J().S1()) {
            wir0 wir0Var = new wir0(ths0Var.c());
            b.d i = com.vk.toggle.b.A.i(VideoFeatures.VIDEO_DOWNLOAD_FORMAT_PRIORITY);
            Object obj = null;
            if (i == null || (d2 = i.d()) == null) {
                arrayList = null;
            } else {
                List<String> c0 = drm0.c0(d2, new String[]{";"}, 0, 6);
                arrayList = new ArrayList();
                for (String str : c0) {
                    int hashCode = str.hashCode();
                    if (hashCode == 103407) {
                        if (str.equals("hls")) {
                            videoDownloadFormat = VideoDownloadFormat.HLS;
                        }
                        videoDownloadFormat = null;
                    } else if (hashCode != 108273) {
                        if (hashCode == 3075986 && str.equals("dash")) {
                            videoDownloadFormat = VideoDownloadFormat.DASH;
                        }
                        videoDownloadFormat = null;
                    } else {
                        if (str.equals("mp4")) {
                            videoDownloadFormat = VideoDownloadFormat.MP4;
                        }
                        videoDownloadFormat = null;
                    }
                    if (videoDownloadFormat != null) {
                        arrayList.add(videoDownloadFormat);
                    }
                }
            }
            SetBuilder setBuilder = new SetBuilder();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    setBuilder.add((VideoDownloadFormat) it.next());
                }
            }
            setBuilder.add(VideoDownloadFormat.DASH);
            setBuilder.add(VideoDownloadFormat.HLS);
            setBuilder.add(VideoDownloadFormat.MP4);
            List O0 = j5g.O0(setBuilder.d());
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = O0.iterator();
            while (it2.hasNext()) {
                int i2 = b.$EnumSwitchMapping$0[((VideoDownloadFormat) it2.next()).ordinal()];
                if (i2 == 1) {
                    c2 = zot0.c();
                } else if (i2 == 2) {
                    c2 = zot0.d();
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2 = zot0.e();
                }
                g5g.y(c2, arrayList2);
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (wir0Var.a((VideoUrl) next)) {
                    obj = next;
                    break;
                }
            }
            VideoUrl videoUrl = (VideoUrl) obj;
            if (videoUrl != null && videoUrl.j() == VideoContentType.MP4) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = "";
                hq80 hq80Var = this.h;
                if (hq80Var != null) {
                    hq80Var.b();
                }
                hq80 hq80Var2 = new hq80(context, ths0Var.c(), z, ((j0t0) initializedLazyImpl.getValue()).a(), "stub_mp4_download_url", new izs() { // from class: xsna.qzs0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        izs cd10Var;
                        List list;
                        Object obj3;
                        hq80.a aVar = (hq80.a) obj2;
                        QualityOptionTypeDo qualityOptionTypeDo = aVar.c;
                        if (qualityOptionTypeDo == null) {
                            qualityOptionTypeDo = aVar.a;
                        }
                        ths0 ths0Var2 = ths0Var;
                        VideoFile videoFile = ths0Var2.a;
                        int i3 = qualityOptionTypeDo == null ? -1 : c0t0.b.$EnumSwitchMapping$1[qualityOptionTypeDo.ordinal()];
                        T t = 0;
                        t = 0;
                        if (i3 == 1) {
                            cd10Var = new cd10(26);
                        } else {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    cd10Var = new wss0(2);
                                }
                                Ref$ObjectRef.this.element = t;
                                this.J(ths0Var2, aVar, z2d0Var, context, z);
                                return s3q0.a;
                            }
                            cd10Var = new zzs0(0);
                        }
                        wir0 wir0Var2 = new wir0(videoFile);
                        VideoUrl.Companion.getClass();
                        list = VideoUrl.MP4_URLS;
                        Iterator it4 = j5g.D0(new zot0.a(), list).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it4.next();
                            VideoUrl videoUrl2 = (VideoUrl) obj3;
                            if (((Boolean) cd10Var.invoke(Integer.valueOf(videoUrl2.m()))).booleanValue() && wir0Var2.a(videoUrl2)) {
                                break;
                            }
                        }
                        VideoUrl videoUrl3 = (VideoUrl) obj3;
                        if (videoUrl3 != null) {
                            t = videoFile.w9().Ab(videoUrl3);
                        }
                        Ref$ObjectRef.this.element = t;
                        this.J(ths0Var2, aVar, z2d0Var, context, z);
                        return s3q0.a;
                    }
                }, gzsVar);
                hq80Var2.c();
                this.h = hq80Var2;
                EmptyList emptyList = EmptyList.b;
                hq80Var2.a(new rr1(emptyList, emptyList, emptyList), new g0t0(ths0Var, ref$ObjectRef, this));
                return;
            }
        }
        Pair<String, sht0> l = gpt0.l(ths0Var.c());
        if (l == null) {
            L.l("Trying to download video with no downloadable urls, should not happen, see VideoUtils.isDownloadable()");
            return;
        }
        String d3 = l.d();
        final sht0 g = l.g();
        final byte[] bytes = ths0Var.c().e8(d3).toString().getBytes(emb.b);
        if (!fxc0.B().J().T()) {
            O(ths0Var.c(), new gzs() { // from class: xsna.vzs0
                @Override // xsna.gzs
                public final Object invoke() {
                    c0t0 c0t0Var = c0t0.this;
                    ths0 ths0Var2 = ths0Var;
                    sht0 sht0Var = g;
                    byte[] bArr = bytes;
                    bu70 L = c0t0Var.L();
                    if (L != null) {
                        String v = c0t0Var.v(ths0Var2.a.r1());
                        synchronized (L) {
                            bu70.e().b(v, sht0Var, bArr, null);
                        }
                    }
                    return s3q0.a;
                }
            });
            this.g.c(Long.valueOf(ths0Var.c().o0()), Long.valueOf(ths0Var.c().I0().b), ths0Var.c().r(), ths0Var.b(), null);
            z2d0Var.invoke();
            return;
        }
        hq80 hq80Var3 = this.h;
        if (hq80Var3 != null) {
            hq80Var3.b();
        }
        QualityOptionTypeDo a2 = ((j0t0) initializedLazyImpl.getValue()).a();
        if (ths0Var.a() && a2 == QualityOptionTypeDo.ALWAYS_ASK) {
            a2 = QualityOptionTypeDo.HIGH;
        }
        this.h = new hq80(context, ths0Var.c(), z, a2, d3, new izs() { // from class: xsna.uzs0
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                boolean z2 = z;
                c0t0.this.J(ths0Var, (hq80.a) obj2, z2d0Var, context, z2);
                return s3q0.a;
            }
        }, gzsVar);
        bu70 L = L();
        if (L != null) {
            String v = v(ths0Var.c().r1());
            hq80 hq80Var4 = this.h;
            if (hq80Var4 != null) {
                hq80Var4.c();
            }
            s3q0 s3q0Var = s3q0.a;
            synchronized (L) {
                bu70.e().b(v, g, bytes, hq80Var4);
            }
        }
    }

    @Override // xsna.ezs0
    public final boolean y() {
        return L() != null;
    }

    @Override // xsna.ezs0
    public final void z(hu70 hu70Var) {
        bu70 L = L();
        if (L != null) {
            synchronized (L) {
                bu70.e().f.remove(hu70Var);
            }
        }
    }
}
