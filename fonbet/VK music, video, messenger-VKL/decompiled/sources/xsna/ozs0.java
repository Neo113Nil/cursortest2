package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import com.vk.dto.common.ImageSize;
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
import com.vkontakte.android.R;
import java.lang.reflect.Field;
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
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.exo.offline.DownloadInfo;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.b25;
import xsna.c63;
import xsna.h7u0;
import xsna.hfr;
import xsna.hq80;
import xsna.kr10;
import xsna.ozs0;
import xsna.y560;
import xsna.zot0;

/* compiled from: VideoOfflineManagerImpl.kt */
/* loaded from: classes3.dex */
public final class ozs0 implements ezs0 {
    public final InitializedLazyImpl a;
    public final InitializedLazyImpl b;
    public final bpn0 c;
    public final Object d;
    public final ArrayList e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final xhs0 g;
    public final mm80 h;
    public hq80 i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public final Object m;
    public final bpn0 n;
    public final bpn0 o;
    public final jzs0 p;
    public final VkHttpCallFactory q;

    /* compiled from: VideoOfflineManagerImpl.kt */
    public final class a implements hu70 {
        public Set<String> b;
        public long c;

        public a(HashMap hashMap) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((DownloadInfo) entry.getValue()).c == DownloadInfo.State.STATE_COMPLETED) {
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
                if (((DownloadInfo) entry.getValue()).c != DownloadInfo.State.STATE_COMPLETED) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.values().iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((DownloadInfo) it.next()).d;
            }
            long j2 = this.c;
            Iterator it2 = linkedHashMap.values().iterator();
            long j3 = 0;
            while (it2.hasNext()) {
                j3 += w8o.a((DownloadInfo) it2.next());
            }
            this.c = j3;
            if (j3 != j2) {
                final ozs0 ozs0Var = ozs0.this;
                final long j4 = j3 - j;
                asu0.a.getClass();
                asu0.n().execute(new Runnable() { // from class: xsna.hzs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrivateFiles.a b;
                        ozs0 ozs0Var2 = ozs0.this;
                        long j5 = j4;
                        r6m r6mVar = r6m.a;
                        b = e8r.a.b(r5, PrivateSubdir.VIDEO_DOWNLOADS_INTERNAL.h(), true);
                        String absolutePath = b.a.getAbsolutePath();
                        r6mVar.getClass();
                        if (r6m.b(absolutePath) - 52428800 > j5) {
                            ozs0Var2.l = true;
                        } else {
                            fxc0.B().a();
                            ozs0Var2.l = false;
                        }
                    }
                });
            } else if (j3 == 0) {
                ozs0.this.l = true;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (((DownloadInfo) entry2.getValue()).c == DownloadInfo.State.STATE_COMPLETED) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set<String> keySet = linkedHashMap2.keySet();
            Set g = izi0.g(keySet, this.b);
            ozs0 ozs0Var2 = ozs0.this;
            Iterator it3 = g.iterator();
            while (it3.hasNext()) {
                try {
                    VideoFileOld videoFileOld = new VideoFileOld(new JSONObject(y2r0.r(((DownloadInfo) hashMap.get((String) it3.next())).b)));
                    xhs0 xhs0Var = ozs0Var2.g;
                    Long valueOf = Long.valueOf(videoFileOld.c);
                    Long valueOf2 = Long.valueOf(videoFileOld.b.b);
                    String str = videoFileOld.W;
                    xhs0Var.getClass();
                    xhs0.d(valueOf, valueOf2, str, MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.FINISHED, null, null);
                } catch (Exception e) {
                    L.i(e);
                }
            }
            this.b = keySet;
        }
    }

    /* compiled from: VideoOfflineManagerImpl.kt */
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

    /* compiled from: VideoOfflineManagerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: VideoOfflineManagerImpl.kt */
    public static final class d extends c63.b {
        public final /* synthetic */ io.reactivex.rxjava3.subjects.d<Boolean> b;

        public d(io.reactivex.rxjava3.subjects.d<Boolean> dVar) {
            this.b = dVar;
        }

        @Override // xsna.c63.b
        public final void u() {
            this.b.onNext(Boolean.FALSE);
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            this.b.onNext(Boolean.TRUE);
        }
    }

    /* compiled from: VideoOfflineManagerImpl.kt */
    public static final class e implements y560.a {
        public final /* synthetic */ io.reactivex.rxjava3.subjects.d<Boolean> a;

        public e(io.reactivex.rxjava3.subjects.d<Boolean> dVar) {
            this.a = dVar;
        }

        @Override // xsna.y560.a
        public final void b() {
            this.a.onNext(Boolean.TRUE);
        }

        @Override // xsna.y560.a
        public final void c() {
            this.a.onNext(Boolean.FALSE);
        }

        @Override // xsna.y560.a
        public final boolean f(String str) {
            return true;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((DownloadInfo) t2).f), Long.valueOf(((DownloadInfo) t).f));
        }
    }

    /* compiled from: VideoOfflineManagerImpl.kt */
    public static final class g implements hu70 {
        public final /* synthetic */ Ref$ObjectRef<io.reactivex.rxjava3.disposables.c> b;
        public final /* synthetic */ ozs0 c;
        public final /* synthetic */ io.reactivex.rxjava3.core.r<List<czs0>> d;

        public g(Ref$ObjectRef<io.reactivex.rxjava3.disposables.c> ref$ObjectRef, ozs0 ozs0Var, io.reactivex.rxjava3.core.r<List<czs0>> rVar) {
            this.b = ref$ObjectRef;
            this.c = ozs0Var;
            this.d = rVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, io.reactivex.rxjava3.disposables.c] */
        @Override // xsna.hu70
        public final void kg(Map<String, ? extends DownloadInfo> map) {
            Ref$ObjectRef<io.reactivex.rxjava3.disposables.c> ref$ObjectRef = this.b;
            ref$ObjectRef.element.dispose();
            ref$ObjectRef.element = this.c.h().subscribe(new j990(new exi0(this.d, 24), 17), new u2c0(new lir0(3), 1));
        }
    }

    /* compiled from: VideoOfflineManagerImpl.kt */
    public static final class h implements Consumer<ApplicationStartInfo> {
        public final /* synthetic */ ActivityManager b;

        public h(ActivityManager activityManager) {
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
                ozs0.this.M();
                this.b.removeApplicationStartInfoCompletionListener(this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [xsna.jzs0] */
    public ozs0(InitializedLazyImpl initializedLazyImpl, InitializedLazyImpl initializedLazyImpl2, nzv0 nzv0Var) {
        fd90 fd90Var = new fd90(19);
        this.a = initializedLazyImpl;
        this.b = initializedLazyImpl2;
        this.c = new bpn0(new hyd0(7));
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new io.reactivex.rxjava3.disposables.b();
        this.g = new xhs0(nzv0Var);
        this.h = new mm80();
        this.l = true;
        this.m = msy.a(LazyThreadSafetyMode.NONE, new im80(this));
        this.n = new bpn0(new buc0(fd90Var));
        this.o = new bpn0(new ta50(18));
        this.p = new b25.a() { // from class: xsna.jzs0
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                ozs0 ozs0Var;
                mm80 O;
                HashMap f2;
                if (!fxc0.B().J().A0() || tbu0Var.b() || (O = (ozs0Var = ozs0.this).O()) == null || (f2 = O.f()) == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : f2.entrySet()) {
                    if (((DownloadInfo) entry.getValue()).c != DownloadInfo.State.STATE_COMPLETED && ((DownloadInfo) entry.getValue()).c != DownloadInfo.State.STATE_FAILED && ((DownloadInfo) entry.getValue()).c != DownloadInfo.State.STATE_STOPPED) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    mm80 O2 = ozs0Var.O();
                    if (O2 != null) {
                        O2.j((String) entry2.getKey());
                    }
                }
            }
        };
        this.q = new VkHttpCallFactory(null, new qmj0(5), 1);
    }

    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x A(int i, String str, String str2) {
        return !c(str) ? new io.reactivex.rxjava3.internal.operators.single.v(new t7r0(str2, 1)) : K().A(i, str, str2);
    }

    @Override // xsna.ezs0
    public final io.reactivex.rxjava3.core.q<List<czs0>> B() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new hhj0(this, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ezs0
    public final a.InterfaceC0045a C(a.InterfaceC0045a interfaceC0045a) {
        o0m o0mVar = (o0m) this.m.getValue();
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
        mm80 O = O();
        if (O != null) {
            DownloadInfo c2 = O.c(v);
            if (c2 != null && c2.c != DownloadInfo.State.STATE_COMPLETED) {
                xhs0.d(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.CANCELLED, this.g.a(videoScreenMode), null);
            }
            O.k(v);
        }
        if (fxc0.B().J().M1()) {
            K().m(videoFile.r1());
        }
        hls0 hls0Var = (hls0) this.o.getValue();
        if (hls0Var != null) {
            itg0.j(hls0Var.c(videoFile.r1()).q(asu0.a.c()), null, 3);
        }
    }

    @Override // xsna.ezs0
    public final boolean G() {
        return this.l;
    }

    @Override // xsna.ezs0
    public final void H() {
        if (this.j) {
            return;
        }
        L();
    }

    public final void I() {
        c63 c63Var = c63.a;
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(Boolean.valueOf(c63.f));
        d dVar = new d(O0);
        c63.a(dVar);
        y560 y560Var = d260.b;
        io.reactivex.rxjava3.subjects.d O02 = io.reactivex.rxjava3.subjects.d.O0(Boolean.valueOf(y560Var.a().d1()));
        e eVar = new e(O02);
        y560Var.a().a().add(eVar);
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(O0, O02, new xw70(new uhd(10), 12));
        sni0 sni0Var = new sni0(new o7j0(10), 7);
        m.getClass();
        io.reactivex.rxjava3.internal.operators.completable.p pVar = new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.observable.i0(m, sni0Var).K());
        asu0 asu0Var = asu0.a;
        this.f.b(pVar.q(asu0Var.c()).o(asu0Var.d()).j(new of1(2, eVar, dVar)).subscribe(new nt1(this, 6), new f0o0(new c(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 4)));
    }

    @SuppressLint({"CheckResult"})
    public final void J(ths0 ths0Var, hq80.a aVar, z2d0 z2d0Var, Context context, boolean z) {
        io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(s3q0.a);
        asu0 asu0Var = asu0.a;
        T.a0(asu0Var.c()).U(new o860(new fh1(26, this, aVar), 14)).a0(asu0Var.d()).subscribe(new nzs0(new mzs0(this, ths0Var, aVar, z2d0Var, context, z), 0));
    }

    public final bzs0 K() {
        return (bzs0) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void L() {
        PrivateFiles.a b2;
        synchronized (this.d) {
            if (this.j) {
                return;
            }
            o0m o0mVar = (o0m) this.m.getValue();
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
                this.h.h(context2, (Class) this.c.getValue(), absolutePath, new c.a(context2.getApplicationContext(), new etk(this.q, null)), null, Executors.newFixedThreadPool(2));
                this.j = true;
                mm80 O = O();
                if (O == null) {
                    return;
                }
                O.b(new a(O.f()));
                I();
                com.vk.core.utils.newtork.b.a.getClass();
                io.reactivex.rxjava3.core.q f2 = com.vk.core.utils.newtork.b.f();
                VideoFeatures videoFeatures = VideoFeatures.LAZY_VIDEO_BRIDGE;
                videoFeatures.getClass();
                if (!com.vk.toggle.b.A.a(videoFeatures)) {
                    f2 = f2.a0(io.reactivex.rxjava3.android.schedulers.a.b());
                }
                this.f.b(f2.subscribe(new u0o0(new alj0(this, 24), 7)));
                o25.a().b0(this.p);
                ((b3o) this.b.getValue()).init();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                mm80 mm80Var = this.h;
                synchronized (mm80Var) {
                    try {
                        mm80Var.f = null;
                        androidx.media3.exoplayer.offline.c cVar2 = mm80Var.e;
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        mm80Var.e = null;
                        androidx.media3.datasource.cache.c cVar3 = mm80Var.d;
                        if (cVar3 != null) {
                            cVar3.o();
                        }
                        mm80Var.d = null;
                        mm80Var.c = null;
                        mm80Var.b = null;
                        mm80Var.a = false;
                        L.i(th);
                    } finally {
                    }
                }
            }
        }
    }

    public final void M() {
        if (this.j) {
            return;
        }
        asu0.a.getClass();
        asu0.n().execute(new a72(this, 25));
    }

    public final void N(VideoFile videoFile, gzs<s3q0> gzsVar) {
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
            ImageSize Cb = videoFile.getImage().Cb(ImageScreenSize.MID.h(), true, false);
            Uri parse = Uri.parse(Cb != null ? Cb.d.d : null);
            Field field = mcr0.a;
            itg0.j(new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.e(new mh40(new u0n(parse, 4), 18)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()), io.reactivex.rxjava3.internal.functions.a.g), null, 3);
            s3q0 s3q0Var = s3q0.a;
        }
        hls0 hls0Var = (hls0) this.o.getValue();
        if (hls0Var != null) {
            itg0.j(hls0Var.b(Collections.singletonList(videoFile)).q(asu0.a.c()), null, 3);
        }
        gzsVar.invoke();
    }

    public final mm80 O() {
        H();
        mm80 mm80Var = this.h;
        if (this.j) {
            return mm80Var;
        }
        return null;
    }

    @SuppressLint({"CheckResult"})
    public final void P(VideoFile videoFile) {
        String v;
        DownloadInfo c2;
        byte[] bArr;
        mm80 O = O();
        if (O == null || (c2 = O.c((v = v(videoFile.r1())))) == null || (bArr = c2.b) == null) {
            return;
        }
        rsg0.w0(new gns0(videoFile.I0(), videoFile.o0(), videoFile.C1())).subscribe(new uk40(new yf1(new VideoFileOld(new JSONObject(y2r0.r(bArr))), O, v, 9), 24), new rrg(new eyp0(9), 2));
    }

    @Override // xsna.ezs0
    public final void a() {
        mm80 O = O();
        if (O == null) {
            return;
        }
        Map<String, DownloadInfo> u = u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, DownloadInfo> entry : u.entrySet()) {
            if (entry.getValue().c != DownloadInfo.State.STATE_COMPLETED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            O.k((String) ((Map.Entry) it.next()).getKey());
        }
    }

    @Override // xsna.ezs0
    public final void b(boolean z) {
        if (this.j) {
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
        Trace.beginSection("VideoOfflineManagerImpl.hasDownload");
        try {
            mm80 O = O();
            return O != null ? O.g(v(str)) : false;
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.ezs0
    public final void d(VideoFile videoFile, VideoScreenMode videoScreenMode) {
        String v;
        DownloadInfo c2;
        kr10 kr10Var;
        kr10.f fVar;
        Uri uri;
        mm80 O = O();
        if (O == null || (c2 = O.c((v = v(videoFile.r1())))) == null || (kr10Var = c2.h) == null || (fVar = kr10Var.b) == null || (uri = fVar.a) == null) {
            return;
        }
        String str = fVar.b;
        gpt0 gpt0Var = gpt0.a;
        String uri2 = uri.toString();
        xuo0.a.getClass();
        if (gpt0.z(xuo0.a(), uri2) || !epx.f(str, MimeTypes.APPLICATION_MPD)) {
            O.l(v);
        } else {
            P(videoFile);
        }
        xhs0.d(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.CONTINUED, this.g.a(videoScreenMode), null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ezs0
    public final void e() {
        mm80 O = O();
        if (O == null) {
            return;
        }
        for (Map.Entry<String, DownloadInfo> entry : u().entrySet()) {
            O.k(entry.getKey());
            String str = (String) j5g.k0(drm0.c0(entry.getKey(), new String[]{" | "}, 0, 6));
            if (str != null) {
                if (fxc0.B().J().M1()) {
                    K().m(str);
                }
                hls0 hls0Var = (hls0) this.o.getValue();
                if (hls0Var != null) {
                    itg0.j(hls0Var.c(str).q(asu0.a.c()), null, 3);
                }
            }
        }
        o0m o0mVar = (o0m) this.m.getValue();
        if (o0mVar != null) {
            o0mVar.a();
        }
    }

    @Override // xsna.ezs0
    public final mm80 f() {
        return this.h;
    }

    @Override // xsna.ezs0
    public final void g(boolean z) {
        synchronized (this.d) {
            try {
                if (this.j && !this.k) {
                    mm80 O = O();
                    if (O == null) {
                        return;
                    }
                    boolean a2 = gz80.a(28);
                    boolean b2 = t5m.b();
                    if (!z || (a2 && !b2)) {
                        ((b3o) this.b.getValue()).c();
                        this.k = true;
                        HashMap f2 = O.f();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : f2.entrySet()) {
                            if (((DownloadInfo) entry.getValue()).c != DownloadInfo.State.STATE_QUEUED && ((DownloadInfo) entry.getValue()).c != DownloadInfo.State.STATE_DOWNLOADING) {
                            }
                            if (((DownloadInfo) entry.getValue()).b.length != 0) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            try {
                                synchronized (O) {
                                    one.video.exo.offline.c e2 = O.e();
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
                        hfr.a aVar = new hfr.a(rli0.j(rn00.w(O.f()), new z7w(27)));
                        while (aVar.hasNext()) {
                            O.k((String) ((Map.Entry) aVar.next()).getKey());
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
        return new io.reactivex.rxjava3.internal.operators.single.v(new uld(this, 1)).q(asu0.a.c());
    }

    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x<Uri> i(String str, String str2) {
        return !c(str) ? new io.reactivex.rxjava3.internal.operators.single.v(new od60(str2, 3)) : K().i(str, str2);
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
        if (this.j) {
            return;
        }
        if (Build.VERSION.SDK_INT < 35) {
            M();
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
            M();
            return;
        }
        activityManager.addApplicationStartInfoCompletionListener(context.getMainExecutor(), new h(activityManager));
    }

    @Override // xsna.ezs0
    public final boolean isEnabled() {
        return this.j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ezs0
    public final boolean j() {
        o0m o0mVar = (o0m) this.m.getValue();
        return o0mVar == null || o0mVar.a == null;
    }

    @Override // xsna.ezs0
    public final void l() {
        hq80 hq80Var;
        if (!fxc0.B().J().R0() || (hq80Var = this.i) == null) {
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
        mm80 O = O();
        if (O == null) {
            return;
        }
        O.j(v(videoFile.r1()));
        xhs0.d(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), MobileOfficialAppsVideoStat$TypeVideoDownloadItem.EventType.PAUSED, this.g.a(videoScreenMode), null);
    }

    @Override // xsna.bzs0
    public final io.reactivex.rxjava3.core.x o(Image image, String str) {
        return !c(str) ? new io.reactivex.rxjava3.internal.operators.single.v(new wkl(image.Cb(ImageScreenSize.MID.h(), true, false), 1)) : K().o(image, str);
    }

    @Override // xsna.ezs0
    public final boolean p() {
        Map<String, DownloadInfo> u = u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, DownloadInfo> entry : u.entrySet()) {
            if (entry.getValue().c != DownloadInfo.State.STATE_FAILED) {
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
            arrayList.add(Long.valueOf(it.next().getValue().d));
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
        Trace.beginSection("VideoOfflineManagerImpl.getDownloadInfo");
        try {
            return u().get(v(str));
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.ezs0
    public final void t(hu70 hu70Var) {
        mm80 O = O();
        if (O != null) {
            O.b(hu70Var);
        }
    }

    @Override // xsna.ezs0
    public final Map<String, DownloadInfo> u() {
        HashMap f2;
        UserId c2 = o25.a().c();
        mm80 O = O();
        if (O == null || (f2 = O.f()) == null) {
            return jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f2.entrySet()) {
            List c0 = drm0.c0((String) entry.getKey(), new String[]{" | "}, 0, 6);
            if (epx.f(c0.size() == 1 ? UserId.d : new UserId(Long.parseLong((String) c0.get(0))), c2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // xsna.ezs0
    public final String v(String str) {
        Trace.beginSection("VideoOfflineManagerImpl.createDownloadUniqueKey");
        try {
            return o25.a().c().b + " | " + str;
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.ezs0
    public final void w(final ths0 ths0Var, final Context context, final boolean z, gzs gzsVar, final z2d0 z2d0Var) {
        ArrayList arrayList;
        Iterable g2;
        List list;
        String d2;
        VideoDownloadFormat videoDownloadFormat;
        Context context2;
        InitializedLazyImpl initializedLazyImpl = this.a;
        xhs0 xhs0Var = this.g;
        VideoFile videoFile = ths0Var.a;
        xhs0Var.b(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), ths0Var.b);
        if (fxc0.B().J().E1() && fkq0.b(videoFile.I0())) {
            fxc0.B().Z(context, videoFile.a1(), z);
            return;
        }
        if (fxc0.B().J().Z0()) {
            ((j0t0) initializedLazyImpl.getValue()).getClass();
            if (com.vk.core.utils.newtork.b.c().d() != NetworkType.WIFI) {
                my30 my30Var = new my30(this, ths0Var, context, z, gzsVar, z2d0Var);
                if (z) {
                    dhr0.a.getClass();
                    context2 = dhr0.t(context);
                } else {
                    context2 = context;
                }
                int i = h7u0.p;
                h7u0.a b2 = h7u0.b.b(context2);
                b2.g0(R.string.video_download_settings_by_mobile_net_title);
                b2.U(R.string.video_download_settings_by_mobile_net_message);
                b2.W(R.string.video_download_settings_by_mobile_net_negative_button, new vbc0(my30Var, 2));
                b2.c0(R.string.video_download_settings_by_mobile_net_positive_button, new com.vk.stickers.bonus.catalog.a(my30Var, 3));
                b2.a.n = new xbc0(my30Var, 1);
                b2.m();
                return;
            }
        }
        if (videoFile.U3() != null) {
            b3o b3oVar = (b3o) this.b.getValue();
            UserId I0 = videoFile.I0();
            v(videoFile.r1());
            b3oVar.e(I0);
        }
        if (fxc0.B().J().S1()) {
            wir0 wir0Var = new wir0(videoFile);
            b.d i2 = com.vk.toggle.b.A.i(VideoFeatures.VIDEO_DOWNLOAD_FORMAT_PRIORITY);
            Object obj = null;
            if (i2 == null || (d2 = i2.d()) == null) {
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
                int i3 = b.$EnumSwitchMapping$0[((VideoDownloadFormat) it2.next()).ordinal()];
                if (i3 == 1) {
                    ListBuilder e2 = e43.e();
                    e2.add(VideoUrl.DASH_STREAMS);
                    e2.add(VideoUrl.DASH_AV1);
                    e2.add(VideoUrl.DASH_WEBM_URL);
                    e2.add(VideoUrl.DASH_URL);
                    e2.add(VideoUrl.DASH_ONDEMAND_URL);
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_CMAF;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        e2.add(VideoUrl.DASH_LIVE_ON_DEMAND_URL);
                    }
                    g2 = e2.g();
                } else if (i3 == 2) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_HLS_FMP4;
                    videoFeatures2.getClass();
                    g2 = rl3.I(new VideoUrl[]{com.vk.toggle.b.A.a(videoFeatures2) ? VideoUrl.FMP4_HLS : null, VideoUrl.HLS_URL, VideoUrl.HLS_ONDEMAND_URL, VideoUrl.HLS_LIVE, VideoUrl.HLS_ONDEMAND_LIVE_URL});
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VideoUrl.Companion.getClass();
                    list = VideoUrl.MP4_URLS;
                    g2 = j5g.D0(new zot0.a(), list);
                }
                g5g.y(g2, arrayList2);
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
                hq80 hq80Var = this.i;
                if (hq80Var != null) {
                    hq80Var.b();
                }
                hq80 hq80Var2 = new hq80(context, ths0Var.a, z, ((j0t0) initializedLazyImpl.getValue()).a(), "stub_mp4_download_url", new izs() { // from class: xsna.izs0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        izs p6e0Var;
                        List list2;
                        Object obj3;
                        hq80.a aVar = (hq80.a) obj2;
                        QualityOptionTypeDo qualityOptionTypeDo = aVar.c;
                        if (qualityOptionTypeDo == null) {
                            qualityOptionTypeDo = aVar.a;
                        }
                        ths0 ths0Var2 = ths0Var;
                        VideoFile videoFile2 = ths0Var2.a;
                        int i4 = qualityOptionTypeDo == null ? -1 : ozs0.b.$EnumSwitchMapping$1[qualityOptionTypeDo.ordinal()];
                        T t = 0;
                        t = 0;
                        if (i4 == 1) {
                            p6e0Var = new p6e0(18);
                        } else {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    p6e0Var = new nc90(27);
                                }
                                Ref$ObjectRef.this.element = t;
                                this.J(ths0Var2, aVar, z2d0Var, context, z);
                                return s3q0.a;
                            }
                            p6e0Var = new g1s0(2);
                        }
                        wir0 wir0Var2 = new wir0(videoFile2);
                        VideoUrl.Companion.getClass();
                        list2 = VideoUrl.MP4_URLS;
                        Iterator it4 = j5g.D0(new zot0.a(), list2).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it4.next();
                            VideoUrl videoUrl2 = (VideoUrl) obj3;
                            if (((Boolean) p6e0Var.invoke(Integer.valueOf(videoUrl2.m()))).booleanValue() && wir0Var2.a(videoUrl2)) {
                                break;
                            }
                        }
                        VideoUrl videoUrl3 = (VideoUrl) obj3;
                        if (videoUrl3 != null) {
                            t = videoFile2.w9().Ab(videoUrl3);
                        }
                        Ref$ObjectRef.this.element = t;
                        this.J(ths0Var2, aVar, z2d0Var, context, z);
                        return s3q0.a;
                    }
                }, gzsVar);
                hq80Var2.c();
                this.i = hq80Var2;
                EmptyList emptyList = EmptyList.b;
                hq80Var2.a(new rr1(emptyList, emptyList, emptyList), new zrx0(ths0Var, ref$ObjectRef, this));
                return;
            }
        }
        Pair<String, sht0> l = gpt0.l(videoFile);
        if (l == null) {
            L.l("Trying to download video with no downloadable urls, should not happen, see VideoUtils.isDownloadable()");
            return;
        }
        String d3 = l.d();
        final sht0 g3 = l.g();
        final byte[] bytes = videoFile.e8(d3).toString().getBytes(emb.b);
        if (!fxc0.B().J().T()) {
            N(videoFile, new gzs() { // from class: xsna.lzs0
                @Override // xsna.gzs
                public final Object invoke() {
                    ozs0 ozs0Var = ozs0.this;
                    mm80 O = ozs0Var.O();
                    if (O != null) {
                        mm80.a(O, ozs0Var.v(ths0Var.a.r1()), g3, bytes);
                    }
                    return s3q0.a;
                }
            });
            this.g.c(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), ths0Var.b, null);
            z2d0Var.invoke();
            return;
        }
        hq80 hq80Var3 = this.i;
        if (hq80Var3 != null) {
            hq80Var3.b();
        }
        QualityOptionTypeDo a2 = ((j0t0) initializedLazyImpl.getValue()).a();
        if (ths0Var.c && a2 == QualityOptionTypeDo.ALWAYS_ASK) {
            a2 = QualityOptionTypeDo.HIGH;
        }
        this.i = new hq80(context, ths0Var.a, z, a2, d3, new izs() { // from class: xsna.kzs0
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                boolean z2 = z;
                ozs0.this.J(ths0Var, (hq80.a) obj2, z2d0Var, context, z2);
                return s3q0.a;
            }
        }, gzsVar);
        mm80 O = O();
        if (O != null) {
            String v = v(videoFile.r1());
            hq80 hq80Var4 = this.i;
            if (hq80Var4 != null) {
                hq80Var4.c();
            }
            s3q0 s3q0Var = s3q0.a;
            synchronized (O) {
                O.e().b(v, g3, bytes, hq80Var4);
            }
        }
    }

    @Override // xsna.ezs0
    public final boolean y() {
        return O() != null;
    }

    @Override // xsna.ezs0
    public final void z(hu70 hu70Var) {
        mm80 O = O();
        if (O != null) {
            synchronized (O) {
                O.e().f.remove(hu70Var);
            }
        }
    }
}
