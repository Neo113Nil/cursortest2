package com.vkontakte.android;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.ViewConfiguration;
import androidx.work.a;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.internal.utils.NetworkBroadcastReceiver;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.core.application.BaseApplication;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.firebase.providers.FirebaseHijackingType;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.util.RecreateActivity;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.fcmerrorhandler.taostutils.EventType;
import com.vk.feature.uxpolls.configure.UxPollInitializer;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.lifecycle.ProcessStateProvider;
import com.vk.log.L;
import com.vk.masks.MasksController;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.mediastore.storage.MediaStorage;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.performance.appstart.a;
import com.vk.metrics.performance.images.ImageCacheSource;
import com.vk.network.di.NetworkComponent;
import com.vk.nspk.search.NspkSearchBanksFeatureComponent;
import com.vk.onboardingpromo.api.OnboardingPromoComponent;
import com.vk.rustore.di.RuStoreComponent;
import com.vk.silentauth.host.SilentAuthService;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.Features;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.data.firebase.FirebaseInitConfig;
import com.vk.toggle.data.firebase.FirebaseInitType;
import com.vk.toggle.data.firebase.FirebaseLocation;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.before.UserIdLegacyTrackerTaskLogic;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.http.DnsOverHttpApiEndpointProvider;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.commons.http.TcpHttpClient;
import ru.ok.android.ext.ApiClientBuilder;
import ru.ok.android.onelog.OneLogImpl;
import ru.ok.android.onelog.uv.UVApiClient;
import ru.ok.android.onelog.uv.UVApiClientBuilder;
import ru.ok.android.onelog.uv.composite.CompositeApiClientBuilder;
import ru.ok.android.onelog.uv.composite.OneLogRoutingPolicy;
import ru.ok.android.utils.Logger;
import ru.ok.tracer.utils.TracerLoggerDelegate;
import xsna.a0a;
import xsna.a6m;
import xsna.a8r0;
import xsna.ag7;
import xsna.aj80;
import xsna.an;
import xsna.ani0;
import xsna.any;
import xsna.aqi;
import xsna.asu0;
import xsna.axw;
import xsna.b0d0;
import xsna.b25;
import xsna.b260;
import xsna.b55;
import xsna.b5o;
import xsna.b6m;
import xsna.b9j;
import xsna.bb3;
import xsna.bek0;
import xsna.bg6;
import xsna.bl20;
import xsna.bn;
import xsna.bny;
import xsna.bpn0;
import xsna.bzs;
import xsna.c0d0;
import xsna.c13;
import xsna.c24;
import xsna.c4j0;
import xsna.c5g0;
import xsna.c63;
import xsna.c6m;
import xsna.ccg0;
import xsna.cd3;
import xsna.cep;
import xsna.cir;
import xsna.cj80;
import xsna.cp;
import xsna.cqm0;
import xsna.cu2;
import xsna.cuj0;
import xsna.cuq;
import xsna.cvk;
import xsna.cy90;
import xsna.d260;
import xsna.d4j0;
import xsna.d6m;
import xsna.d8q0;
import xsna.db3;
import xsna.dbr0;
import xsna.dew;
import xsna.dmw;
import xsna.dnj0;
import xsna.dp;
import xsna.dp70;
import xsna.dqo0;
import xsna.dr6;
import xsna.drm0;
import xsna.duq;
import xsna.dvb0;
import xsna.dwt;
import xsna.dx90;
import xsna.dxi;
import xsna.dxw;
import xsna.e43;
import xsna.e53;
import xsna.e9e0;
import xsna.egl;
import xsna.el3;
import xsna.eny;
import xsna.eqy;
import xsna.er4;
import xsna.er6;
import xsna.eu2;
import xsna.ez9;
import xsna.f25;
import xsna.f320;
import xsna.f43;
import xsna.fb8;
import xsna.feh0;
import xsna.fgd0;
import xsna.fgv;
import xsna.fpf0;
import xsna.fsp0;
import xsna.fxc0;
import xsna.fyx;
import xsna.g58;
import xsna.g67;
import xsna.gat;
import xsna.gbl;
import xsna.gia;
import xsna.gjx0;
import xsna.grk0;
import xsna.grv;
import xsna.gui0;
import xsna.gwt;
import xsna.gx8;
import xsna.gxw;
import xsna.gyp0;
import xsna.gyu;
import xsna.gz80;
import xsna.gzs;
import xsna.h260;
import xsna.h360;
import xsna.h960;
import xsna.hg1;
import xsna.hjk0;
import xsna.ho4;
import xsna.hqk0;
import xsna.hu2;
import xsna.hx8;
import xsna.i1q;
import xsna.i6q0;
import xsna.ib8;
import xsna.ihg;
import xsna.ijk0;
import xsna.imu0;
import xsna.imx0;
import xsna.io50;
import xsna.itg0;
import xsna.iug0;
import xsna.j55;
import xsna.j5g;
import xsna.jau0;
import xsna.jbw;
import xsna.jhg;
import xsna.jnf;
import xsna.jr10;
import xsna.jug0;
import xsna.jvo;
import xsna.jzw;
import xsna.k03;
import xsna.k55;
import xsna.k840;
import xsna.kb0;
import xsna.knf;
import xsna.krg0;
import xsna.ky6;
import xsna.kyc0;
import xsna.l03;
import xsna.l23;
import xsna.l250;
import xsna.l5m;
import xsna.l67;
import xsna.lmx0;
import xsna.lnf;
import xsna.lq6;
import xsna.lyc0;
import xsna.m03;
import xsna.m240;
import xsna.m25;
import xsna.m7m;
import xsna.m8f0;
import xsna.mb3;
import xsna.mb8;
import xsna.mcr0;
import xsna.md3;
import xsna.mhs;
import xsna.mir;
import xsna.ms0;
import xsna.msy;
import xsna.mui0;
import xsna.myc0;
import xsna.n3t0;
import xsna.n66;
import xsna.na3;
import xsna.nau0;
import xsna.nb8;
import xsna.nbw;
import xsna.ncr0;
import xsna.ndp0;
import xsna.nf3;
import xsna.nri;
import xsna.nxw;
import xsna.o19;
import xsna.o25;
import xsna.o260;
import xsna.o2l;
import xsna.o7r0;
import xsna.o8r;
import xsna.oiw;
import xsna.omy;
import xsna.opi;
import xsna.ow90;
import xsna.ox4;
import xsna.p1p0;
import xsna.p5m;
import xsna.p93;
import xsna.pb8;
import xsna.pe80;
import xsna.pi80;
import xsna.pip0;
import xsna.pl00;
import xsna.ply;
import xsna.pmr0;
import xsna.pqm0;
import xsna.ps0;
import xsna.psi;
import xsna.pt20;
import xsna.pv50;
import xsna.q03;
import xsna.q0d0;
import xsna.q240;
import xsna.q57;
import xsna.q6v;
import xsna.q6x;
import xsna.q7r0;
import xsna.qb8;
import xsna.qcy;
import xsna.qhe0;
import xsna.qhr;
import xsna.qhs;
import xsna.qji0;
import xsna.qv20;
import xsna.qyw;
import xsna.qz9;
import xsna.r03;
import xsna.r12;
import xsna.r30;
import xsna.r360;
import xsna.r63;
import xsna.r7m;
import xsna.r7r0;
import xsna.r9u;
import xsna.rgd0;
import xsna.rhr;
import xsna.rhs;
import xsna.rnf0;
import xsna.ro70;
import xsna.rq6;
import xsna.ruq;
import xsna.ruv0;
import xsna.rw90;
import xsna.rwe;
import xsna.rx2;
import xsna.rxc0;
import xsna.ryk0;
import xsna.rz9;
import xsna.s0f;
import xsna.s12;
import xsna.s3q0;
import xsna.s63;
import xsna.s6m;
import xsna.s7m;
import xsna.sdi;
import xsna.ser0;
import xsna.skj;
import xsna.sv8;
import xsna.sw90;
import xsna.sx2;
import xsna.syw;
import xsna.t03;
import xsna.t0f;
import xsna.t1d0;
import xsna.t3a;
import xsna.t5g0;
import xsna.t6g0;
import xsna.ta4;
import xsna.tcl0;
import xsna.tic;
import xsna.tkw;
import xsna.tmv;
import xsna.tog;
import xsna.tr10;
import xsna.tv8;
import xsna.tyw;
import xsna.u0f;
import xsna.u1d0;
import xsna.u7r0;
import xsna.ug9;
import xsna.uh;
import xsna.ui80;
import xsna.uia;
import xsna.upm0;
import xsna.uro0;
import xsna.usl;
import xsna.uv8;
import xsna.v1v0;
import xsna.v1w;
import xsna.v3j;
import xsna.v460;
import xsna.v57;
import xsna.v5h0;
import xsna.v790;
import xsna.v7r0;
import xsna.via;
import xsna.vjd;
import xsna.vkw;
import xsna.vmy;
import xsna.vs50;
import xsna.vsl;
import xsna.vv50;
import xsna.vv8;
import xsna.vw3;
import xsna.vwk;
import xsna.w83;
import xsna.wan;
import xsna.wc;
import xsna.wg9;
import xsna.wgd0;
import xsna.wgn0;
import xsna.wn80;
import xsna.wsm0;
import xsna.wv8;
import xsna.ww3;
import xsna.www;
import xsna.x0f;
import xsna.x390;
import xsna.xa3;
import xsna.xb3;
import xsna.xh6;
import xsna.xkr;
import xsna.xn80;
import xsna.xqk0;
import xsna.xrd0;
import xsna.xsa;
import xsna.xsi0;
import xsna.xsl;
import xsna.xuo0;
import xsna.xv8;
import xsna.xyw;
import xsna.y0f;
import xsna.y56;
import xsna.y83;
import xsna.y970;
import xsna.ybr0;
import xsna.yfl;
import xsna.ygs;
import xsna.yp20;
import xsna.z4j;
import xsna.z58;
import xsna.z7r0;
import xsna.zf6;
import xsna.zfl;
import xsna.zgv0;
import xsna.zi80;
import xsna.ziv;
import xsna.zjv0;
import xsna.zkk0;
import xsna.zkw;
import xsna.zqn0;
import xsna.zvj0;
import xsna.zzp;

/* compiled from: VKApplication.kt */
/* loaded from: classes11.dex */
public final class VKApplication extends BaseApplication implements a.b, na3 {
    public static final a c;
    public static final /* synthetic */ qcy<Object>[] d;
    public static final String e;
    public static boolean f;
    public final nf3 b = new nf3();

    /* compiled from: VKApplication.kt */
    public static final class a {
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class a0 extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            ((StoriesComponent) m7m.e().a(fpf0.a(StoriesComponent.class))).bf().a(BuildInfo.e);
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FirebaseInitConfig.values().length];
            try {
                iArr[FirebaseInitConfig.SAFE_ASYNC_CONTENT_PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FirebaseInitConfig.ASYNC_CONTENT_PROVIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FirebaseInitConfig.SYNC_CONTENT_PROVIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FirebaseInitConfig.AFTER_COLD_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class b0 extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            a0a a0aVar = a0a.a;
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_screencast_outline_24);
            Integer valueOf2 = Integer.valueOf(R.color.vk_blue_300);
            Integer valueOf3 = Integer.valueOf(R.style.ChromeCastActivityStyle);
            dbr0 dbr0Var = dbr0.a;
            synchronized (a0aVar) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                boolean z = false;
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context.getApplicationContext()) == 0 && !fxc0.B().J().V0()) {
                    Context context2 = e43.a;
                    if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable((context2 != null ? context2 : null).getApplicationContext()) == 0 && !fxc0.B().J().V0()) {
                        z = true;
                    }
                    qz9.a = new rz9(valueOf, valueOf2, valueOf3, z);
                    CopyOnWriteArrayList<ez9> copyOnWriteArrayList = xsi0.a;
                    copyOnWriteArrayList.remove(dbr0Var);
                    copyOnWriteArrayList.add(dbr0Var);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((upm0) this.receiver).getClass();
            if (upm0.c) {
                upm0.d = false;
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class c0 extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            io.reactivex.rxjava3.subjects.f<n3t0> L3 = ((VideoPip2Component) m7m.e().a(fpf0.a(VideoPip2Component.class))).L3();
            nau0 nau0Var = new nau0(new x0f(8));
            hg1.n4 n4Var = new hg1.n4();
            L3.getClass();
            j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(L3, n4Var).U(new hg1.m4());
            final o7r0 o7r0Var = new o7r0();
            itg0.i(6, U.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.p7r0
                @Override // io.reactivex.rxjava3.functions.l
                public final Object apply(Object obj) {
                    VKApplication.a aVar2 = VKApplication.c;
                    return (Boolean) o7r0.this.invoke(obj);
                }
            }).a0(asu0.a.d()), null, new gyu(nau0Var, 3), null);
            c63 c63Var = c63.a;
            c63.a(nau0Var);
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            xsl xslVar = (xsl) uh.b.b();
            xslVar.a("UpdateEmojiSpritesDelayedJob", new d8q0(new fyx()), new usl(null, 0L, 253));
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class d0 extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            v57 b = ((BiometricsLockComponent) m7m.e().a(fpf0.a(BiometricsLockComponent.class))).b();
            c63 c63Var = c63.a;
            c63.a(new z7r0(b));
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            ((NspkSearchBanksFeatureComponent) m7m.e().a(fpf0.a(NspkSearchBanksFeatureComponent.class))).mf().a(uh.b.b());
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class e0 extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            gx8 yc = ((CacheComponent) m7m.e().a(fpf0.a(CacheComponent.class))).yc();
            PrivateSubdir privateSubdir = PrivateSubdir.LOGS;
            CacheTarget cacheTarget = CacheTarget.OTHER;
            yc.c(new fgd0(privateSubdir, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.TRACES, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.CLIPS, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.CLIPS_DISK_CACHE, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.VIDEO_PLAYBACK_CACHE, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.VIDEO_MESSAGES_CACHE, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.VMOJI, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.MINI_APP_WEB_VIEW, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.MINI_APP_LOCAL_STORAGE, cacheTarget));
            yc.c(new fgd0(PrivateSubdir.LARGE_TEMP_UPLOADS, cacheTarget));
            yc.c(MediaStorage.b);
            yc.c(MasksController.f());
            yc.c(y970.b);
            yc.c(ClipsDraftPersistentStore.b);
            yc.c(t6g0.b);
            yc.c(MenuApiApplicationsCache.b);
            yc.c(yp20.b);
            yc.c(vjd.b);
            int i = 1;
            mb8 mb8Var = new mb8(i);
            int i2 = 0;
            uv8 uv8Var = new uv8(i2);
            CacheTarget cacheTarget2 = CacheTarget.SYSTEM;
            yc.c(new tv8(new sv8(cacheTarget2, "VKStickersRepository", mb8Var, uv8Var)));
            int i3 = 2;
            hx8.a(yc, "AppStateCache", new b55(i3));
            yc.c(new wc(cacheTarget2, "DeprecatedAnalytics", new pb8(i), new qb8(i)));
            hx8.a(yc, "VKAnimationLoader", new k03(i3));
            hx8.a(yc, "Cookies", new vv8(i2));
            hx8.a(yc, "Tokens", new wv8(i2));
            yc.c(new tv8(new sv8(cacheTarget2, "Preference", new l03(i), new xv8(i2))));
            yc.c(new fgd0(PrivateSubdir.HTTP_CACHE, cacheTarget));
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            Object obj;
            Object obj2;
            FirebaseInitConfig firebaseInitConfig;
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            com.vk.core.firebase.providers.a aVar2 = com.vk.core.firebase.providers.a.a;
            ReentrantLock reentrantLock = rhr.c;
            reentrantLock.lock();
            try {
                bpn0 bpn0Var = rhr.b;
                Context context = null;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                aVar2.c((Executor) bpn0Var.getValue(), vKApplication);
                qhr qhrVar = rhr.g;
                CompletableFuture<Void> completableFuture = com.vk.core.firebase.providers.a.e;
                if (completableFuture != null) {
                    final xkr xkrVar = new xkr(qhrVar);
                    completableFuture.whenComplete(new BiConsumer() { // from class: xsna.ykr
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj3, Object obj4) {
                            xkr.this.invoke(obj3, obj4);
                        }
                    });
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i = com.vk.toggle.b.A.i(CoreFeatures.ENABLE_FIREBASE_PROVIDERS);
                FirebaseInitType.a aVar3 = FirebaseInitType.Companion;
                Integer b = i != null ? i.b() : null;
                aVar3.getClass();
                Iterator<E> it = FirebaseInitType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int i2 = ((FirebaseInitType) obj).i();
                    if (b != null && i2 == b.intValue()) {
                        break;
                    }
                }
                FirebaseInitType firebaseInitType = (FirebaseInitType) obj;
                if (firebaseInitType == null) {
                    firebaseInitType = FirebaseInitType.SAFE_ASYNC;
                }
                if (!p1p0.a(i)) {
                    firebaseInitType = null;
                }
                if (firebaseInitType == null) {
                    firebaseInitType = FirebaseInitType.SAFE_ASYNC;
                }
                b.d i3 = com.vk.toggle.b.A.i(CoreFeatures.FIREBASE_LOCATION_TYPE);
                FirebaseLocation.a aVar4 = FirebaseLocation.Companion;
                Integer b2 = i3 != null ? i3.b() : null;
                aVar4.getClass();
                Iterator<E> it2 = FirebaseLocation.h().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    int i4 = ((FirebaseLocation) obj2).i();
                    if (b2 != null && i4 == b2.intValue()) {
                        break;
                    }
                }
                FirebaseLocation firebaseLocation = (FirebaseLocation) obj2;
                if (!p1p0.a(i3)) {
                    firebaseLocation = null;
                }
                if (firebaseLocation == null) {
                    firebaseLocation = FirebaseLocation.AFTER_COLD_START;
                }
                int i5 = d.a.$EnumSwitchMapping$1[firebaseInitType.ordinal()];
                if (i5 == 1) {
                    firebaseInitConfig = FirebaseInitConfig.SYNC_CONTENT_PROVIDER;
                } else if (i5 == 2) {
                    int i6 = d.a.$EnumSwitchMapping$0[firebaseLocation.ordinal()];
                    if (i6 == 1) {
                        firebaseInitConfig = FirebaseInitConfig.SAFE_ASYNC_CONTENT_PROVIDER;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        firebaseInitConfig = FirebaseInitConfig.AFTER_COLD_START;
                    }
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    firebaseInitConfig = FirebaseInitConfig.ASYNC_CONTENT_PROVIDER;
                }
                int i7 = b.$EnumSwitchMapping$0[firebaseInitConfig.ordinal()];
                if (i7 == 1) {
                    FirebaseHijackingType firebaseHijackingType = FirebaseHijackingType.ASYNC;
                    synchronized (aVar2) {
                        try {
                            if (Build.VERSION.SDK_INT >= 30) {
                                Context context2 = com.vk.core.firebase.providers.a.b;
                                if (context2 != null) {
                                    context = context2;
                                }
                                if (com.vk.core.firebase.providers.a.b(context)) {
                                    firebaseHijackingType = FirebaseHijackingType.SYNC;
                                }
                            }
                            aVar2.a(firebaseHijackingType);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (i7 == 2) {
                    aVar2.a(FirebaseHijackingType.ASYNC);
                } else if (i7 == 3) {
                    aVar2.a(FirebaseHijackingType.SYNC);
                } else {
                    if (i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.a(FirebaseHijackingType.COLD_START);
                }
                return s3q0.a;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class f0 extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            if (com.vk.toggle.d.H()) {
                o19.k();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((xuo0) this.receiver).getClass();
            Context context = xuo0.e;
            if (context != null) {
                SharedPreferences.Editor edit = Preference.h(context, 0, "time_provider").edit();
                CoreFeatures coreFeatures = CoreFeatures.USE_ONLY_SERVER_CLOCK;
                coreFeatures.getClass();
                edit.putBoolean("use_server_clock", com.vk.toggle.b.A.a(coreFeatures));
                edit.apply();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class g0 extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            boolean a = pmr0.a(vKApplication);
            mir mirVar = (mir) rhr.i.getValue();
            mirVar.getClass();
            if (a) {
                mirVar.a(mir.a.b.a);
                rhr.a(new cir(mirVar, 0));
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((NetworkPerformanceMeasurer) this.receiver).getClass();
            asu0.a.getClass();
            asu0.n().submit(new v460());
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class h0 extends FunctionReferenceImpl implements gzs<h360> {
        @Override // xsna.gzs
        public final h360 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            return ((NetworkComponent) m7m.e().a(fpf0.a(NetworkComponent.class))).vd();
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            VideoFeatures videoFeatures = VideoFeatures.ONBOARDING_PROMO;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                com.vk.onboardingpromo.api.a b = ((OnboardingPromoComponent) m7m.e().a(fpf0.a(OnboardingPromoComponent.class))).b();
                if (b.e() == null) {
                    b.b();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class i0 extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            ListBuilder e = e43.e();
            e.addAll(UxPollInitializer.g);
            e.addAll(UxPollInitializer.i);
            e.addAll(UxPollInitializer.j);
            ListBuilder g = e.g();
            b25 s = ((BridgeComponent) m7m.e().a(fpf0.a(BridgeComponent.class))).s();
            UxPollInitializer.AppType appType = UxPollInitializer.AppType.VK;
            mui0 J2 = ((SessionManagementComponent) m7m.e().a(fpf0.a(SessionManagementComponent.class))).J2();
            new a8r0(0, ply.a, ply.class, "getAppLanguage", "getAppLanguage()Ljava/lang/String;", 0);
            new UxPollInitializer(vKApplication, s, appType, g, new myc0(), J2).a();
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            tmv s;
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            if (com.vk.toggle.d.H() && (s = q6x.s()) != null) {
                s.b(EventType.COLD_START);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            r9u.a.getClass();
            try {
                pt20.c(vKApplication);
            } catch (RuntimeException unused) {
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            SakFeatures.Type type = SakFeatures.Type.FEATURE_CORE_COMPANION_DEVICE_ID;
            if (type.h()) {
                SakFeatures.b.getClass();
                ToggleManager toggleManager = SakFeatures.c;
                toggleManager.getClass();
                b.d j = toggleManager.j(type.getKey(), false);
                w83 w83Var = null;
                JSONObject g = j != null ? j.g() : null;
                Context applicationContext = vKApplication.getApplicationContext();
                String str = m8f0.a;
                synchronized (m8f0.class) {
                    try {
                        w83 w83Var2 = m8f0.c;
                        if (w83Var2 == null) {
                            w83Var2 = null;
                        }
                        w83Var2.getClass();
                        if (!Preference.j().getBoolean("compaion_device_id_requested", false) && m8f0.c(applicationContext, g)) {
                            L.e("request device id from companions");
                            a6m.a.getClass();
                            String b = a6m.b(applicationContext);
                            if (b != null) {
                                w83 w83Var3 = m8f0.c;
                                if (w83Var3 == null) {
                                    w83Var3 = null;
                                }
                                w83Var3.b(b);
                            }
                            w83 w83Var4 = m8f0.c;
                            if (w83Var4 != null) {
                                w83Var = w83Var4;
                            }
                            w83Var.getClass();
                            ky6.a aVar2 = (ky6.a) Preference.j().edit();
                            aVar2.putBoolean("compaion_device_id_requested", true);
                            aVar2.apply();
                        }
                    } finally {
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            ArrayList<String> arrayList = jzw.a;
            String g0 = j5g.g0(arrayList, null, null, null, 0, new rxc0(1), 31);
            arrayList.clear();
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar2 = new Event.a();
            if (aVar2.f) {
                throw new IllegalStateException("Already builded!");
            }
            aVar2.d.put("vk_tracking_startup_event", Boolean.TRUE);
            aVar2.g("COMMON.INITIALIZATION_INFO");
            aVar2.c("log", g0);
            aVar2.f();
            bVar.k(aVar2.e());
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.d;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_SET");
            vKApplication.registerReceiver(NetworkStateReceiver.a(), intentFilter);
            NetworkBroadcastReceiver networkBroadcastReceiver = NetworkBroadcastReceiver.a;
            networkBroadcastReceiver.getClass();
            synchronized (NetworkBroadcastReceiver.b) {
                try {
                    if (!NetworkBroadcastReceiver.e) {
                        NetworkBroadcastReceiver.d = vKApplication.getApplicationContext();
                        vKApplication.registerReceiver(networkBroadcastReceiver, NetworkBroadcastReceiver.f);
                        NetworkBroadcastReceiver.e = true;
                        com.vk.core.utils.newtork.b.a.getClass();
                        if (com.vk.core.utils.newtork.b.e()) {
                            hg1.h(com.vk.core.utils.newtork.b.d.a0(io.reactivex.rxjava3.android.schedulers.a.b()), new h260(0));
                        }
                        if (NetworkBroadcastReceiver.b()) {
                            NetworkBroadcastReceiver.c();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            synchronized (zqn0.a) {
                if (!zqn0.f) {
                    zqn0.f = true;
                    zqn0.b = vKApplication;
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            int i = pe80.a;
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class q extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getResources().getConfiguration();
            asu0.a.getClass();
            asu0.n().execute(new q7r0());
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class r extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            o2l.a.getClass();
            if (o2l.f()) {
                ruv0.a(vKApplication, o25.a());
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            if (BuildInfo.f()) {
                Context context = feh0.a;
                Context applicationContext = vKApplication.getApplicationContext();
                cvk cvkVar = new cvk();
                asu0.a.getClass();
                feh0.b(applicationContext, cvkVar, asu0.n());
                if (Preference.j().getBoolean("__dbg_screenshot_marker_new", true)) {
                    feh0.e();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            if (com.vk.toggle.b.A.a(VideoFeatures.VIDEO_SEND_ASSERTIONS)) {
                ww3 ww3Var = ww3.a;
                ww3.b(new sdi());
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            e9e0<ApiClient> provider;
            e9e0<UVApiClient> provider2;
            h960 h960Var;
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            Uri uri = ui80.a;
            String m = cqm0.m(BuildInfo.a.name());
            String str = (String) com.vk.core.apps.a.o.getValue();
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            o260 o260Var = d260.a;
            if (o260Var == null) {
                o260Var = null;
            }
            String a = o260Var.l.a();
            o2l.a.getClass();
            boolean z = false;
            boolean b = o2l.b("__dbg_log_onevideo_dev_env", false);
            boolean b2 = o2l.b("__dbg_force_send", false);
            String b3 = b6m.b(vKApplication);
            aj80 b4 = com.vk.toggle.d.D0.b();
            zi80 b5 = com.vk.toggle.d.E0.b();
            boolean z2 = b4 != null && b4.a;
            boolean z3 = b5 != null && b5.a;
            boolean z4 = (z2 || z3) ? false : true;
            eqy<h960> eqyVar = com.vk.toggle.d.t;
            boolean z5 = eqyVar.b() != null;
            ClipsFeatures clipsFeatures = ClipsFeatures.VP_UV_OLD_STAT;
            clipsFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (bVar.a(clipsFeatures) && !z3) {
                z = true;
            }
            ClipsFeatures clipsFeatures2 = ClipsFeatures.VP_UV_NEW_STAT;
            clipsFeatures2.getClass();
            boolean a2 = bVar.a(clipsFeatures2);
            if (z4 || z5) {
                final xn80 xn80Var = new xn80(vKApplication, b);
                ui80.b bVar2 = new ui80.b(xn80Var);
                ui80.d = bVar2;
                provider = new ApiClientBuilder(str).setHttpClient(bVar2).setUserAgent(a).setDeviceId(b3).setTokenProvider(new e9e0() { // from class: xsna.ti80
                    @Override // xsna.e9e0
                    public final Object get() {
                        return xn80.this.a();
                    }
                }).setApiEndpointProviderWithGoogleDns(b ? new DnsOverHttpApiEndpointProvider(new ui80.a(ui80.b), DnsOverHttpApiEndpointProvider.CacheStrategy.TTL, DnsOverHttpApiEndpointProvider.FallbackStrategy.ONCE) : new io50(new ui80.a(ui80.a), DnsOverHttpApiEndpointProvider.CacheStrategy.TTL, DnsOverHttpApiEndpointProvider.FallbackStrategy.ONCE)).toProvider();
            } else {
                provider = null;
            }
            if (z || a2) {
                gyp0 gyp0Var = new gyp0(vKApplication, b);
                ui80.c = gyp0Var;
                UVApiClientBuilder uVApiClientBuilder = new UVApiClientBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b260.o.getClass();
                int millis = (int) timeUnit.toMillis(b260.p.f);
                provider2 = uVApiClientBuilder.setHttpClient(new TcpHttpClient().setReadTimeout(millis).setConnectTimeout(millis)).setUVStatTokenProvider(gyp0Var).toProvider();
            } else {
                provider2 = null;
            }
            OneLogImpl.getInstance().attachApiClient(new CompositeApiClientBuilder().setOkApiClientProvider(provider).setUvApiClientProvider(provider2).setRoutingPolicy(new OneLogRoutingPolicy(z4, z, z5, a2)).toProvider());
            L.A("OneLogVk", "onelog initialized");
            asu0.a.getClass();
            ExecutorService executorService = (ExecutorService) asu0.P.getValue();
            Logger.setLoggingEnabled(wn80.q);
            cj80.b = "vk";
            cj80.c = executorService;
            h960 b6 = eqyVar.b();
            if (b6 != null) {
                h960Var = b6;
            } else if (a2) {
                h960.e.getClass();
                h960Var = h960.f;
            } else {
                h960Var = null;
            }
            if (h960Var != null) {
                vw3 vw3Var = ryk0.a;
                ryk0.a(vKApplication, v3j.a, new dxi(vKApplication.getFilesDir(), m, b2, h960Var.b, h960Var.c, h960Var.a));
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class v extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ActivityInfo activityInfo;
            final VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            final com.vkontakte.android.a aVar2 = new com.vkontakte.android.a();
            v1v0 v1v0Var = new v1v0(new eu2(14));
            int i = 11;
            bb3 bb3Var = new bb3(i);
            r63 r63Var = new r63(i);
            hu2 hu2Var = new hu2(12);
            db3 db3Var = new db3(3);
            vmy vmyVar = new vmy(v1v0Var, bb3Var, r63Var, hu2Var, db3Var);
            bny bnyVar = bny.a;
            final v7r0 v7r0Var = new v7r0();
            hjk0 hjk0Var = new hjk0(new dr6(16), new er6(13), new pqm0());
            bnyVar.getClass();
            bny.i = v1v0Var;
            bny.c = vKApplication.getPackageName();
            bny.b().c = vmyVar;
            bny.b().getClass();
            if (gz80.a(29)) {
                fpf0.a(bny.class).l();
                eny enyVar = (eny) bny.h.getValue();
                enyVar.getClass();
                ResolveInfo resolveActivity = vKApplication.getPackageManager().resolveActivity((Intent) enyVar.a.getValue(), 65536);
                if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
                    String str = activityInfo.packageName;
                }
                bny.d = aVar2;
                vKApplication.registerActivityLifecycleCallbacks(new grv(vKApplication, bny.b(), new ijk0(vKApplication, hjk0Var, v1v0Var)));
                db3Var.invoke(new gzs() { // from class: xsna.zmy
                    @Override // xsna.gzs
                    public final Object invoke() {
                        bny.a.getClass();
                        j1v0 b = bny.b();
                        thl0.c(b.a);
                        Application application = vKApplication;
                        b.a(application);
                        asu0.a.getClass();
                        asu0.n().execute(new i6k(application, aVar2, v7r0Var));
                        return s3q0.a;
                    }
                });
                bny.b.add(new any());
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class w extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            final b0d0 b0d0Var = (b0d0) c0d0.a.getValue();
            asu0.a.getClass();
            ScheduledExecutorService o = asu0.o();
            b0d0Var.getClass();
            o.schedule(new Runnable() { // from class: xsna.a0d0
                @Override // java.lang.Runnable
                public final void run() {
                    long j = b0d0.this.a;
                    long a = qni0.a();
                    Features.Type type = Features.Type.AB_PREFETCH_DEFAULT_OFF;
                    type.getClass();
                    com.vk.toggle.b bVar = com.vk.toggle.b.A;
                    if (a - Preference.m(bVar.a(type) ? 0L : qni0.a(), "prefetch_loading", "prefetch_loading_stories") >= j) {
                        MediaStorage mediaStorage = MediaStorage.b;
                        MediaStorage.c(MediaStorage.VideoCacheType.STORIES).b();
                    }
                    long a2 = qni0.a();
                    type.getClass();
                    if (a2 - Preference.m(bVar.a(type) ? 0L : qni0.a(), "prefetch_loading", "prefetch_loading_clips") < j) {
                        return;
                    }
                    ClipsVideoStorage.a();
                }
            }, 30L, TimeUnit.SECONDS);
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class x extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            krg0 b = com.vk.toggle.d.P0.b();
            if (b == null) {
                krg0.c.getClass();
                b = krg0.a.a();
            }
            if (b.a()) {
                qv20.j(vKApplication, vKApplication.getString(R.string.rustore_project_id), ((RuStoreComponent) m7m.e().a(fpf0.a(RuStoreComponent.class))).Ma());
            }
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class y extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            final Context context2 = context;
            final jnf jnfVar = new jnf(11);
            final egl eglVar = (egl) egl.f.getValue();
            final yfl yflVar = (yfl) yfl.d.getValue();
            final List singletonList = Collections.singletonList(k840.a.f().a());
            ygs ygsVar = new ygs();
            o2l.a.getClass();
            int i = 0;
            ygsVar.a = o2l.b("__dbg_fresco_debug_overlay", false);
            s3q0 s3q0Var = s3q0.a;
            final dmw dmwVar = new dmw();
            dmwVar.b = new dmw.b();
            dmwVar.c = new dmw.a(true, false, false, false);
            dmwVar.a = o2l.b("__dbg_thumbhash_debug_enabled_", false);
            zkw b = com.vk.toggle.d.q.b();
            if (b == null) {
                zkw.c.getClass();
                b = zkw.d;
            }
            boolean z = b.a;
            boolean z2 = b.b;
            CoreFeatures coreFeatures = CoreFeatures.NEW_IMAGE_FETCHER;
            coreFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            boolean a = bVar.a(coreFeatures);
            CoreFeatures coreFeatures2 = CoreFeatures.IMAGE_LOADING_STAT;
            coreFeatures2.getClass();
            dmwVar.c = new dmw.a(z, z2, bVar.a(coreFeatures2), a);
            final int largeMemoryClass = (int) ((10 / 100.0f) * ((ActivityManager) vKApplication.getSystemService("activity")).getLargeMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            final int largeMemoryClass2 = (int) ((2 / 100.0f) * ((ActivityManager) vKApplication.getSystemService("activity")).getLargeMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            mcr0.j = dmwVar;
            bpn0 bpn0Var = new bpn0(new gzs() { // from class: xsna.hcr0
                /* JADX WARN: Type inference failed for: r12v2, types: [xsna.lcr0] */
                /* JADX WARN: Type inference failed for: r8v13, types: [xsna.fcr0] */
                @Override // xsna.gzs
                public final Object invoke() {
                    new r63(13);
                    l360 l360Var = new l360();
                    acr0 acr0Var = new acr0(new dvb0(new dvb0.a()));
                    acr0Var.a();
                    Field field = mcr0.a;
                    final Context context3 = context2;
                    tkw.a aVar2 = new tkw.a(context3);
                    aVar2.d = DownsampleMode.ALWAYS;
                    vkw.a aVar3 = aVar2.q;
                    aVar3.getClass();
                    aVar3.a = 5120;
                    s3q0 s3q0Var2 = s3q0.a;
                    aVar2.l = true;
                    dmw dmwVar2 = dmwVar;
                    dmw.a aVar4 = dmwVar2.c;
                    boolean z3 = false;
                    if (aVar4 != null && aVar4.c) {
                        z3 = true;
                    }
                    jnf jnfVar2 = jnfVar;
                    aVar2.i = (aVar4 == null || !aVar4.d) ? (aVar4 == null || !aVar4.b) ? new hy70(jnfVar2, z3) : new my70(aVar4.a, jnfVar2, z3) : new iy70(jnfVar2, z3);
                    aVar2.b = qar0.g();
                    aVar2.n = new elw(singletonList);
                    aVar2.h = mcr0.h;
                    aVar2.j = acr0Var;
                    aVar2.k = Collections.singleton(l360Var);
                    hgw hgwVar = eglVar;
                    aVar2.f = new jgw(hgwVar, yflVar);
                    mcr0.i = dmwVar2.a;
                    oiw.a aVar5 = new oiw.a();
                    khs khsVar = new khs();
                    jhs jhsVar = new jhs(acr0Var.a());
                    if (aVar5.b == null) {
                        aVar5.b = new ArrayList();
                    }
                    aVar5.b.add(khsVar);
                    if (aVar5.a == null) {
                        aVar5.a = new HashMap();
                    }
                    aVar5.a.put(ecl.b, jhsVar);
                    siw siwVar = lyd.b;
                    mhs.a aVar6 = new mhs.a();
                    mhs mhsVar = new mhs(acr0Var.a());
                    if (aVar5.b == null) {
                        aVar5.b = new ArrayList();
                    }
                    aVar5.b.add(aVar6);
                    if (aVar5.a == null) {
                        aVar5.a = new HashMap();
                    }
                    aVar5.a.put(siwVar, mhsVar);
                    shs shsVar = new shs(context3);
                    if (aVar5.a == null) {
                        aVar5.a = new HashMap();
                    }
                    aVar5.a.put(siw.c, shsVar);
                    aVar2.o = new oiw(aVar5);
                    wan.b bVar2 = new wan.b(context3);
                    bVar2.b = new yhn0() { // from class: xsna.kcr0
                        @Override // xsna.yhn0
                        public final Object get() {
                            return context3.getCacheDir();
                        }
                    };
                    bVar2.a = "fresco_cache";
                    long j = 419430400;
                    bVar2.c = j;
                    mcr0.c cVar = mcr0.e;
                    bVar2.e = cVar;
                    aVar2.g = new wan(bVar2);
                    wan.b bVar3 = new wan.b(context3);
                    bVar3.b = new yhn0() { // from class: xsna.kcr0
                        @Override // xsna.yhn0
                        public final Object get() {
                            return context3.getCacheDir();
                        }
                    };
                    bVar3.a = "fresco_sticker_cache";
                    bVar3.c = 262144000L;
                    bVar3.e = cVar;
                    aVar2.m = new wan(bVar3);
                    final int i2 = largeMemoryClass;
                    if (i2 != -1) {
                        aVar2.a = new yhn0() { // from class: xsna.lcr0
                            @Override // xsna.yhn0
                            public final Object get() {
                                return new o220(i2, Integer.MAX_VALUE);
                            }
                        };
                    }
                    final int i3 = largeMemoryClass2;
                    if (i3 != -1) {
                        aVar2.e = new yhn0() { // from class: xsna.fcr0
                            @Override // xsna.yhn0
                            public final Object get() {
                                int i4 = i3;
                                return new o220(i4, i4 / 8);
                            }
                        };
                    }
                    hgwVar.a(ImageCacheSource.IMAGES, new File(context3.getCacheDir(), "fresco_cache").getAbsolutePath(), j);
                    hgwVar.a(ImageCacheSource.OTHER, new File(context3.getCacheDir(), "fresco_cache").getAbsolutePath(), j);
                    hgwVar.a(ImageCacheSource.STICKERS, new File(context3.getCacheDir(), "fresco_sticker_cache").getAbsolutePath(), 262144000L);
                    context3.registerComponentCallbacks(new rcr0(new AtomicInteger(iah0.f().densityDpi)));
                    aVar3.c = new rdv0();
                    return aVar2;
                }
            });
            ReentrantLock reentrantLock = rhs.a;
            rhs.b = new ncr0(bpn0Var, ygsVar);
            asu0.a.getClass();
            asu0.h().submit(new qhs(context2, i));
            mcr0.b = true;
            ((CacheComponent) m7m.e().a(fpf0.a(CacheComponent.class))).yc().c(new tv8(new sv8(CacheTarget.OTHER, "VKImageLoader", new f25(vKApplication, 5), new ziv(4))));
            return s3q0.a;
        }
    }

    /* compiled from: VKApplication.kt */
    public static final /* synthetic */ class z extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKApplication vKApplication = (VKApplication) this.receiver;
            a aVar = VKApplication.c;
            vKApplication.getClass();
            zgv0.a.a = new bpn0(new j55(15));
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object failure;
        long startRequestedElapsedRealtime;
        int i2 = 0;
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(VKApplication.class, "singlePrefsRepo", "getSinglePrefsRepo()Lcom/vk/singleprefs/toggle/api/SingleSharedPrefsRepository;", 0);
        fpf0.a.getClass();
        d = new qcy[]{mutablePropertyReference1Impl};
        c = new a();
        e = "39905392329609327611";
        com.vk.metrics.performance.appstart.a aVar = ow90.g;
        wgd0 wgd0Var = aVar.a;
        rgd0 rgd0Var = rgd0.a;
        int i3 = wgd0Var.a;
        rgd0Var.getClass();
        try {
            failure = Integer.valueOf(Process.getThreadPriority(i3));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        aVar.e = num == null ? ProcessStateProvider.ProcessState.Gone : num.intValue() == -10 ? ProcessStateProvider.ProcessState.Foreground : ProcessStateProvider.ProcessState.Background;
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dx90Var.b = System.currentTimeMillis();
        int i4 = dx90.W;
        dx90.b.a("onCreate");
        dx90.b.a("initContentProviders");
        dx90.b.a("initToggles");
        dx90.b.a("coldStart");
        dx90Var.r = elapsedRealtime - Process.getStartElapsedRealtime();
        if (gz80.a(33)) {
            startRequestedElapsedRealtime = Process.getStartRequestedElapsedRealtime();
            dx90Var.s = elapsedRealtime - startRequestedElapsedRealtime;
        }
        dx90Var.r();
        Iterator<a.InterfaceC1278a> it = aVar.d.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new y83(aVar, i2), TimeUnit.SECONDS.toMillis(10L));
        if (l23.c != -1) {
            l23.c = -1;
            synchronized (l23.i) {
                try {
                    el3<WeakReference<l23>> el3Var = l23.h;
                    el3Var.getClass();
                    el3.a aVar2 = new el3.a();
                    while (aVar2.hasNext()) {
                        l23 l23Var = (l23) ((WeakReference) aVar2.next()).get();
                        if (l23Var != null) {
                            l23Var.e();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public VKApplication() {
        sw90.a.getClass();
        Trace.beginSection(ndp0.f("PerformanceReporterStartMetrics ApplicationInitialization"));
        sw90.c.a.c();
    }

    @Override // androidx.work.a.b
    public final androidx.work.a a() {
        a.C0091a c0091a = new a.C0091a();
        c0091a.c = 3;
        CoreFeatures coreFeatures = CoreFeatures.SUBSTITUTE_POOLS;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            asu0.a.getClass();
            c0091a.a = asu0.h();
            c0091a.b = asu0.n();
        }
        return new androidx.work.a(c0091a);
    }

    @Override // com.vk.core.application.BaseApplication, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        nf3 nf3Var = this.b;
        Trace.beginSection(ndp0.f("VKApplication.attachBaseContext"));
        try {
            super.attachBaseContext(context);
            ApplicationProvider.Companion companion = ApplicationProvider.Companion;
            companion.setApplication(this);
            companion.setDebuggable(false);
            e43.a = this;
            zjv0 zjv0Var = new zjv0(context, new lq6(this));
            qcy<Object>[] qcyVarArr = d;
            qcy<Object> qcyVar = qcyVarArr[0];
            nf3Var.c = zjv0Var;
            boolean g2 = ((zvj0) nf3Var.getValue(this, qcyVar)).g();
            boolean f2 = ((zvj0) nf3Var.getValue(this, qcyVarArr[0])).f();
            Preference preference = Preference.a;
            preference.getClass();
            if (Preference.b == null) {
                Preference.b = this;
            }
            Preference.L(preference, g2, f2, 4);
            b();
            upm0.a.getClass();
            upm0.b();
            if (bl20.a == null) {
                preference.getClass();
                Preference.w(this);
                bl20.a = Preference.f("analytics");
            }
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    public final void b() {
        Bundle bundle;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        com.vk.core.apps.a.a = this;
        ApplicationInfo applicationInfo = getPackageManager().getPackageInfo(getPackageName(), 128).applicationInfo;
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            bundle = new Bundle();
        }
        com.vk.core.apps.a.b = bundle;
        String str = (String) com.vk.core.apps.a.d.getValue();
        String string = getString(R.string.vk_file_provider_authority);
        BuildInfo.Client client = BuildInfo.Client.VK_APP;
        int intValue = ((Number) com.vk.core.apps.a.g.getValue()).intValue();
        boolean booleanValue = ((Boolean) com.vk.core.apps.a.f.getValue()).booleanValue();
        xa3 xa3Var = new xa3(9);
        BuildInfo.b = "release";
        BuildInfo.c = "arm";
        BuildInfo.d = str;
        BuildInfo.e = v790.a.a(this);
        BuildInfo.f = string;
        BuildInfo.g = intValue;
        BuildInfo.h = booleanValue;
        BuildInfo.a = client;
        BuildInfo.j = xa3Var;
    }

    public final void c(ParallelTaskRunner parallelTaskRunner) {
        parallelTaskRunner.b(new ParallelTaskRunner.e("TurnOffStrictMode", new ox4(9)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("FirebaseAppInitialization", new f(0, this, VKApplication.class, "initFirebaseAsync", "initFirebaseAsync()V", 0)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("fcm-error-handler-checker", new j(0, this, VKApplication.class, "checkFcmErrors", "checkFcmErrors()V", 0)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("Google ML initialization", new k(0, this, VKApplication.class, "initGoogleMLAsync", "initGoogleMLAsync()V", 0)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("WebAppAds", new ag7(9)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("NotifyNetworkPerformanceMeasurer", new mb8(11)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("easterEggsFirstUpdate", jvo.b));
        parallelTaskRunner.b(new ParallelTaskRunner.e("MultiAccountPreload", new t1d0(new bpn0(new pb8(this)), new bpn0(new qb8(this)), new bpn0(new k03(this)), new bpn0(new vv8(this)), new bpn0(new wv8(this)))));
        parallelTaskRunner.b(new ParallelTaskRunner.e("AppConsumption", new l03(12)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ScreenThermalImpact", new m03(9)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ReportLastApplicationExit", new cp(this, 5)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ReportInstallReferrer", new dp(this, 3)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("HeadsetManager", new t3a(this, 5)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("restoreNotifications", new ccg0(this)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ThermalApi", new dqo0(this)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("VkRunConfigLoad", new ser0(this)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("warmUpMenuCache", new aqi(10)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ReportSerializerCacheDbSizeTask", new t5g0(this)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ReportCacheStatistic", new c5g0()));
        parallelTaskRunner.b(new ParallelTaskRunner.e("PersistExecutorsConfigs", new xb3(this, 12)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("initEmojiUpdater", new d(0, this, VKApplication.class, "checkAndUpdateEmojis", "checkAndUpdateEmojis()V", 0)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("initNspkListUpdater", new e(0, this, VKApplication.class, "checkAndUpdateNspkList", "checkAndUpdateNspkList()V", 0)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("getUnbanRecommendations", new gwt(new bpn0(new xh6(this, 14)), new bpn0(new y56(this)), new bpn0(new kb0(9)), new bpn0(new ihg(this, 10)))));
        parallelTaskRunner.b(new ParallelTaskRunner.e("permission_stat", new cy90()));
        parallelTaskRunner.b(new ParallelTaskRunner.e(0, "VideoCacheInitTask", new jhg(this, 9)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ComposeWarmup", new nri()));
        parallelTaskRunner.b(new ParallelTaskRunner.e("VkComposeExp", new imu0()));
        parallelTaskRunner.b(new ParallelTaskRunner.e("oat check", new dp70(this)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("Blockstore", new fb8(this, 11)));
        parallelTaskRunner.a(new v5h0(this));
        parallelTaskRunner.b(new ParallelTaskRunner.e("VkOnboarding", new rwe(this, 11)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("VKIDAppStartAfter", new g67(this, 7)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("StoriesInitVideoCache", new zfl(this, 9)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("step_counter", new bg6(this, 13)));
        parallelTaskRunner.b(new ParallelTaskRunner.e(new tic(this)));
        parallelTaskRunner.b(new ParallelTaskRunner.e(new cuj0(this, (zvj0) this.b.getValue(this, d[0]))));
        parallelTaskRunner.b(new ParallelTaskRunner.e("DesignInspector", new xsa(this, 11)));
        parallelTaskRunner.b(new ParallelTaskRunner.e(new skj(this)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("WarmUpNetworkObserver", new ib8(this, 13)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("TimeProviderUseServerClock", new g(0, xuo0.a, xuo0.class, "syncUseServerClockFlagAgainstFeatureManager", "syncUseServerClockFlagAgainstFeatureManager()V", 0)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ReportFeedNetworkPerformanceData", new h(0, NetworkPerformanceMeasurer.a, NetworkPerformanceMeasurer.class, "reportPreviousSession", "reportPreviousSession()V", 0)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("OnboardingPromoSetup", new i(0, this, VKApplication.class, "initOnboardingPromo", "initOnboardingPromo()V", 0)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("ReportInstalledDynModules", new c24(17)));
        parallelTaskRunner.b(new ParallelTaskRunner.e("setSnackbarManagerConfig", new l67(12)));
        parallelTaskRunner.a(new r7m(this));
        parallelTaskRunner.a(new qhe0(this));
        parallelTaskRunner.a(new c4j0(this, new jbw(this)));
        parallelTaskRunner.a(new ta4(this, new nb8(this, 19)));
        parallelTaskRunner.a(new tcl0(this, new p5m(this)));
        parallelTaskRunner.a(new xqk0(this));
        parallelTaskRunner.a(new ro70(this));
        parallelTaskRunner.a(new qji0(this));
        parallelTaskRunner.a(new gjx0(this));
        parallelTaskRunner.a(new lmx0(this));
        parallelTaskRunner.a(new uro0(this));
        parallelTaskRunner.a(new fsp0(this));
        parallelTaskRunner.a(new i6q0(this));
    }

    public final void d(ParallelTaskRunner parallelTaskRunner) {
        parallelTaskRunner.c(new ParallelTaskRunner.e("RequestCompanionsDeviceId", new l(0, this, VKApplication.class, "requestCompanionsDeviceId", "requestCompanionsDeviceId()V", 0)));
        parallelTaskRunner.c(new ParallelTaskRunner.e("MediaScope", new u7r0(this, 0)));
        parallelTaskRunner.c(new ParallelTaskRunner.e("flushSetupLogs", new m(0, this, VKApplication.class, "flushSetupLogs", "flushSetupLogs()V", 0)));
    }

    public final void e(ParallelTaskRunner parallelTaskRunner) {
        rw90 rw90Var = new rw90(this);
        lyc0 lyc0Var = new lyc0(this);
        jau0 jau0Var = new jau0(this);
        grk0 grk0Var = new grk0(this, new b55(this, 9));
        jug0 jug0Var = new jug0(this);
        kyc0 kyc0Var = new kyc0(this, new ug9(this, 10));
        gui0 gui0Var = new gui0(this, new via(this, 11));
        m25 m25Var = new m25(this, new s63(this));
        ani0 ani0Var = new ani0(this);
        ruq ruqVar = new ruq(this);
        dew dewVar = new dew(this);
        nbw nbwVar = new nbw(this);
        q240 q240Var = new q240(this, new q57(this));
        u1d0 u1d0Var = new u1d0(this);
        www wwwVar = new www(this, new k55(this));
        gxw gxwVar = new gxw(this, new ps0(this, 9));
        axw axwVar = new axw(this, new y0f(this));
        ybr0 ybr0Var = new ybr0(this, new er6(this));
        c6m c6mVar = new c6m(this);
        q0d0 q0d0Var = new q0d0(this);
        tr10 tr10Var = new tr10(this);
        nxw nxwVar = new nxw(this);
        s6m s6mVar = new s6m(this);
        UserIdLegacyTrackerTaskLogic userIdLegacyTrackerTaskLogic = new UserIdLegacyTrackerTaskLogic(this);
        iug0 iug0Var = new iug0(this);
        vv50 vv50Var = new vv50(this);
        vsl vslVar = new vsl(this);
        d4j0 d4j0Var = new d4j0(this);
        syw sywVar = new syw(this, new mb3(this));
        p93 p93Var = new p93(this);
        pi80 pi80Var = new pi80(this, new q03(this));
        pi80Var.d = new zzp(2);
        x390 x390Var = new x390(this);
        r360 r360Var = new r360(this, new r12(this));
        new io.reactivex.rxjava3.internal.operators.observable.t(new r7r0(this));
        ParallelTaskRunner.d[] dVarArr = {rw90Var, lyc0Var, jau0Var, grk0Var, jug0Var, kyc0Var, gui0Var, m25Var, ani0Var, ruqVar, dewVar, nbwVar, q240Var, u1d0Var, wwwVar, gxwVar, axwVar, ybr0Var, c6mVar, q0d0Var, tr10Var, nxwVar, s6mVar, userIdLegacyTrackerTaskLogic, iug0Var, vv50Var, vslVar, d4j0Var, sywVar, p93Var, pi80Var, x390Var, r360Var, new dxw(this), new xyw(this), new xrd0(this)};
        for (int i2 = 0; i2 < 36; i2++) {
            parallelTaskRunner.d(new ParallelTaskRunner.e(dVarArr[i2]));
        }
        parallelTaskRunner.d(new ParallelTaskRunner.e("receivers", new n(0, this, VKApplication.class, "initReceivers", "initReceivers()V", 0)));
        parallelTaskRunner.d(new ParallelTaskRunner.e("initSystemNotificationsHelper", new o(0, this, VKApplication.class, "initSystemNotificationsHelper", "initSystemNotificationsHelper()V", 0)));
        parallelTaskRunner.d(new ParallelTaskRunner.e("initOnboardingPopupBridge", new p(0, this, VKApplication.class, "initOnboardingPopupBridge", "initOnboardingPopupBridge()V", 0)));
        parallelTaskRunner.d(new ParallelTaskRunner.e("contexts", new q(0, this, VKApplication.class, "initContexts", "initContexts()V", 0)));
    }

    public final void f(ParallelTaskRunner parallelTaskRunner) {
        parallelTaskRunner.f(new z4j(this));
        parallelTaskRunner.f(new d6m(this));
        parallelTaskRunner.f(new pv50(this));
        parallelTaskRunner.f(new opi(this));
        parallelTaskRunner.f(new hqk0(this));
        parallelTaskRunner.f(new md3(this));
        g58 g58Var = new g58(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ParallelTaskRunner.b e2 = parallelTaskRunner.e(new ParallelTaskRunner.e(0, "contacts", new b9j(msy.a(lazyThreadSafetyMode, g58Var), msy.a(lazyThreadSafetyMode, new lnf(this)))));
        bpn0 bpn0Var = new bpn0(new i1q(this, 4));
        ParallelTaskRunner.b e3 = parallelTaskRunner.e(new ParallelTaskRunner.e("messengerParallel", true, Collections.singletonList(e2), new uia(bpn0Var, 10)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("initImUiModule", e3, new ho4(bpn0Var, 7)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("subscribeToMessengerEvents", e3, new dwt(bpn0Var, 1)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("ImEngineSyncHelper", e3, new rx2(bpn0Var, 8)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("initNewContactsNotifications", e3, new sx2(bpn0Var, 8)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("initAudioMsgPlayer", e3, new cuq(bpn0Var, 7)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("voipInit", e3, new duq(bpn0Var, 8)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("PreinflateTaskLogic", new gia(this, 3)));
        parallelTaskRunner.f(new l250(this, new r03(this)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("fcm-error-handler-init", new f0(0, this, VKApplication.class, "initFcmErrorHandler", "initFcmErrorHandler()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("Firebase.InitConfig", new g0(0, this, VKApplication.class, "initFirebaseConfig", "initFirebaseConfig()V", 0)));
        parallelTaskRunner.f(new wsm0(this));
        parallelTaskRunner.e(new ParallelTaskRunner.e(0, "HttpRequestExecutor-Init", new n66(this, 9)));
        parallelTaskRunner.f(new jr10(this));
        parallelTaskRunner.e(new ParallelTaskRunner.e(0, "Music", new t03(this)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("RLottie", new e53(this)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("init_location", new rq6(this, 14)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("warmUpNewsfeed", new er4(this, 8)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("warmUpStickers", new c13(this, 16)));
        parallelTaskRunner.e(new ParallelTaskRunner.e(0, "initCatalog", new r30(this, 8)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("initMviCatalog", new knf(this)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("analytics", new s12(this)));
        parallelTaskRunner.e(new ParallelTaskRunner.e(0, "image-cache-stat", new tog(10)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("logs", new s7m(this, 1)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("utils", new s0f(this, 10)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("services", new an(this, 8)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("other", new bn(this, 6)));
        parallelTaskRunner.e(new ParallelTaskRunner.e(0, "Emoji", new cep()));
        parallelTaskRunner.e(new ParallelTaskRunner.e("SseEventSourceBuiler-Init", new gbl(this, 6)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("initTraceProfilerManager", new r(0, this, VKApplication.class, "initTraceProfilerManager", "initTraceProfilerManager()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("ScreenshotMarker", new s(0, this, VKApplication.class, "initScreenshotMarker", "initScreenshotMarker()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("LeakCanary", new cd3(this)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("OneVideoAssertions", new t(0, this, VKApplication.class, "initOneVideoAssertions", "initOneVideoAssertions()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("onelog", new u(0, this, VKApplication.class, "initOneLog", "initOneLog()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("videoOffline", new z58(12)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("HmsComponentsStatus", new b5o(this, 6)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("LauncherIcons", new v(0, this, VKApplication.class, "initIconLauncher", "initIconLauncher()V", 0)));
        parallelTaskRunner.f(new zkk0(this));
        parallelTaskRunner.e(new ParallelTaskRunner.e("checkStoriesAndVideosPrefetch", new w(0, this, VKApplication.class, "checkStoriesAndVideosPrefetch", "checkStoriesAndVideosPrefetch()V", 0)));
        parallelTaskRunner.f(new fgv(this, new nb8(this, 4)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("initRustore", new x(0, this, VKApplication.class, "initRustorePushes", "initRustorePushes()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("initMapUi", new pl00(this)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("ImageLoader", new y(0, this, VKApplication.class, "initImageLoader", "initImageLoader()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("InitReef", new rnf0(this)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("RichContentRegister", new z(0, this, VKApplication.class, "initRichContent", "initRichContent()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e(0, "InitStoriesCacheManager", new a0(0, this, VKApplication.class, "initStoriesCache", "initStoriesCache()V", 0)));
        parallelTaskRunner.f(new qyw(this));
        parallelTaskRunner.e(new ParallelTaskRunner.e("VkVideoCast", new b0(0, this, VKApplication.class, "initVkVideoCast", "initVkVideoCast()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("VkVideoPipAnalytics", new c0(0, this, VKApplication.class, "initVkVideoPipAnalytics", "initVkVideoPipAnalytics()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("BiometricsLock", new d0(0, this, VKApplication.class, "initBiometricsLock", "initBiometricsLock()V", 0)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("ClipsEditorExternalLogger", new wg9(this, 5)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("BottomNavigationButtonsPoolWarmUp", new t0f(12)));
        parallelTaskRunner.e(new ParallelTaskRunner.e(0, "webapp", new vwk(this, 6)));
        parallelTaskRunner.e(new ParallelTaskRunner.e("fullscreen-promo-setup", new bzs(new u0f(this, 10))));
        parallelTaskRunner.f(new tyw(this));
        parallelTaskRunner.f(new pip0(this));
        parallelTaskRunner.e(new ParallelTaskRunner.e("AdditionalVkComposeExp", new ms0()));
        parallelTaskRunner.e(new ParallelTaskRunner.e("CacheControls", new e0(0, this, VKApplication.class, "initCacheControls", "initCacheControls()V", 0)));
        parallelTaskRunner.f(new imx0(this));
        parallelTaskRunner.f(new vs50(this));
    }

    public final void g(ParallelTaskRunner parallelTaskRunner) {
        parallelTaskRunner.h(new ParallelTaskRunner.e("UxPollsConfiguration", new i0(0, this, VKApplication.class, "initUxPoll", "initUxPoll()V", 0)));
        parallelTaskRunner.h(new ParallelTaskRunner.e(0, "cleanCallerIdFootSteps", new x0f(9)));
        parallelTaskRunner.h(new ParallelTaskRunner.e("SettingsChangeBroadcast", new gat(this, 12)));
        parallelTaskRunner.h(new ParallelTaskRunner.e(new q6v(this)));
        parallelTaskRunner.h(new ParallelTaskRunner.e("LoadPerformanceStorageFixFlag", new f43()));
        parallelTaskRunner.h(new ParallelTaskRunner.e("ActionSynchronizer", new omy(new cu2(this))));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (str.equals("connectivity")) {
            AtomicBoolean atomicBoolean = psi.b;
            if (psi.d) {
                return new psi((ConnectivityManager) super.getSystemService(str));
            }
        }
        return super.getSystemService(str);
    }

    @Override // ru.ok.tracer.HasTracerLogger
    public final TracerLoggerDelegate getTracerLoggerDelegate() {
        return new na3.a();
    }

    public final boolean h() {
        rgd0 rgd0Var = rgd0.a;
        rgd0Var.getClass();
        String a2 = rgd0.a(this);
        if (drm0.D(a2, ":com.vk.push.service", false) || drm0.D(a2, ":pushservice", false)) {
            return true;
        }
        rgd0Var.getClass();
        if (drm0.D(rgd0.a(this), ":app_redirect", false)) {
            return true;
        }
        int i2 = RecreateActivity.b;
        rgd0Var.getClass();
        return drm0.D(rgd0.a(this), ":phoenix", false);
    }

    @Override // com.vk.core.application.BaseApplication, android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        rgd0.a.getClass();
        if (rgd0.a(this).equals(getPackageName())) {
            try {
                ViewConfiguration.get(this);
            } catch (ArrayIndexOutOfBoundsException e2) {
                com.vk.metrics.eventtracking.b.a.a(e2);
                try {
                    Field declaredField = ViewConfiguration.class.getDeclaredField("sConfigurations");
                    declaredField.setAccessible(true);
                    declaredField.set(null, new SparseArray(2));
                    ViewConfiguration.get(this);
                } catch (Exception e3) {
                    com.vk.metrics.eventtracking.b.a.a(e3);
                }
            }
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Application
    public final void onCreate() {
        Trace.beginSection(ndp0.f("VKApplication.onCreate"));
        try {
            if (f) {
                super.onCreate();
                StringBuilder sb = new StringBuilder("By some reason VKApplication#onCreate is called twice. Ignoring second call. (processName=");
                rgd0.a.getClass();
                sb.append(rgd0.a(this));
                sb.append(')');
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(sb.toString()));
                return;
            }
            super.onCreate();
            if (h()) {
                return;
            }
            ow90 ow90Var = ow90.a;
            ow90.o = new ProcessStateProvider(this);
            Iterator<a.InterfaceC1278a> it = ow90.g.d.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            int i2 = 2;
            ParallelTaskRunner parallelTaskRunner = new ParallelTaskRunner(BuildInfo.h(), new v1w(i2), new o8r(i2), new zf6(this, 13));
            e(parallelTaskRunner);
            f(parallelTaskRunner);
            d(parallelTaskRunner);
            g(parallelTaskRunner);
            c(parallelTaskRunner);
            parallelTaskRunner.i();
            SilentAuthService.b.post(new dnj0());
            sw90.a.getClass();
            sw90.c.b.c();
            UiTracker uiTracker = UiTracker.a;
            UiTracker.a(new sw90.b());
            Trace.endSection();
            dx90 dx90Var = ow90.e;
            dx90Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            dx90Var.c = currentTimeMillis;
            dx90Var.d = currentTimeMillis;
            int i3 = dx90.W;
            dx90.b.b("onCreate");
            dx90Var.r();
            f = true;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        rgd0 rgd0Var = rgd0.a;
        rgd0Var.getClass();
        String a2 = rgd0.a(this);
        if (drm0.D(a2, ":com.vk.push.service", false) || drm0.D(a2, ":pushservice", false)) {
            return;
        }
        rgd0Var.getClass();
        if (drm0.D(rgd0.a(this), ":app_redirect", false)) {
            return;
        }
        mcr0.b();
        wgn0.a();
        UiTracker uiTracker = UiTracker.a;
        String str = null;
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        Integer num4 = null;
        String str5 = null;
        Integer num5 = null;
        String str6 = null;
        Integer num6 = null;
        String str7 = null;
        Integer num7 = null;
        String str8 = null;
        Integer num8 = null;
        String str9 = null;
        Integer num9 = null;
        String str10 = null;
        Integer num10 = null;
        String str11 = null;
        Integer num11 = null;
        String str12 = null;
        Integer num12 = null;
        String str13 = null;
        Integer num13 = null;
        String str14 = null;
        Integer num14 = null;
        String str15 = null;
        Integer num15 = null;
        String str16 = null;
        Integer num16 = null;
        int i2 = -6;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.ON_LOW_MEMORY.h(), str, UiTracker.c().name(), num, str2, num2, str3, num3, str4, num4, str5, num5, str6, num6, str7, num7, str8, num8, str9, num9, str10, num10, str11, num11, str12, num12, str13, num13, str14, num14, str15, num15, str16, num16, i2, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        rgd0 rgd0Var = rgd0.a;
        rgd0Var.getClass();
        String a2 = rgd0.a(this);
        if (!drm0.D(a2, ":com.vk.push.service", false) && !drm0.D(a2, ":pushservice", false)) {
            rgd0Var.getClass();
            if (!drm0.D(rgd0.a(this), ":app_redirect", false)) {
                m240 m240Var = mcr0.h;
                m240Var.getClass();
                MemoryTrimType memoryTrimType = null;
                if (i2 != 5) {
                    if (i2 == 10) {
                        memoryTrimType = MemoryTrimType.OnSystemLowMemoryWhileAppInForeground;
                    } else if (i2 == 15) {
                        memoryTrimType = MemoryTrimType.OnCloseToDalvikHeapLimit;
                    } else if (i2 == 40) {
                        memoryTrimType = MemoryTrimType.OnAppBackgrounded;
                    } else if (i2 == 60) {
                        memoryTrimType = MemoryTrimType.OnSystemLowMemoryWhileAppInBackgroundLowSeverity;
                    } else if (i2 == 80) {
                        memoryTrimType = MemoryTrimType.OnCloseToDalvikHeapLimit;
                    }
                }
                if (memoryTrimType != null) {
                    Iterator it = ((CopyOnWriteArraySet) m240Var.b).iterator();
                    while (it.hasNext()) {
                        ((f320) it.next()).h(memoryTrimType);
                    }
                }
            }
        }
        super.onTrimMemory(i2);
    }
}
