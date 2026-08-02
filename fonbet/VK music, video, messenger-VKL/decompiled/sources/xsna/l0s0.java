package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Size;
import com.vk.api.generated.video.dto.VideoSuspendAdsReasonDto;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdTrialAction;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.c0s0;
import xsna.ikv0;

/* compiled from: VideoAdsSuspendManagerImpl.kt */
/* loaded from: classes6.dex */
public final class l0s0 implements f0s0 {
    public final Object a;
    public final Object b;
    public final hit0 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final hpj h;
    public final n0s0 i;
    public boolean j;
    public Boolean k;
    public boolean l;
    public boolean m;

    /* compiled from: VideoAdsSuspendManagerImpl.kt */
    @b6l(c = "com.vk.video.growth.impl.adssuspend.VideoAdsSuspendManagerImpl$suspendAds$1", f = "VideoAdsSuspendManagerImpl.kt", l = {289, 294}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ VideoSuspendAdsReasonDto $adsSuspendReason;
        final /* synthetic */ Context $context;
        final /* synthetic */ Hint $hint;
        final /* synthetic */ boolean $showSuccessPopup;
        final /* synthetic */ m0s0 $snackbarViewState;
        final /* synthetic */ e0s0 $viewState;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ l0s0 this$0;

        /* compiled from: VideoAdsSuspendManagerImpl.kt */
        @b6l(c = "com.vk.video.growth.impl.adssuspend.VideoAdsSuspendManagerImpl$suspendAds$1$1$1", f = "VideoAdsSuspendManagerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.l0s0$a$a, reason: collision with other inner class name */
        public static final class C3223a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ Hint $hint;
            final /* synthetic */ m0s0 $snackbarViewState;
            int label;
            final /* synthetic */ l0s0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3223a(l0s0 l0s0Var, Context context, m0s0 m0s0Var, Hint hint, spj<? super C3223a> spjVar) {
                super(2, spjVar);
                this.this$0 = l0s0Var;
                this.$context = context;
                this.$snackbarViewState = m0s0Var;
                this.$hint = hint;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3223a(this.this$0, this.$context, this.$snackbarViewState, this.$hint, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3223a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                l0s0 l0s0Var = this.this$0;
                Context context = this.$context;
                m0s0 m0s0Var = this.$snackbarViewState;
                Hint hint = this.$hint;
                l0s0Var.getClass();
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                aVar.u = new ikv0.d(m0s0Var.a, m0s0Var.b, (ikv0.d.a) null, 4);
                HashSet hashSet = iah0.a;
                if (fnj.d(context)) {
                    aVar.k = 1;
                    aVar.g(1);
                }
                pkv0.e(aVar);
                pkv0.f(aVar);
                l0s0Var.g().s(hint);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(VideoSuspendAdsReasonDto videoSuspendAdsReasonDto, l0s0 l0s0Var, m0s0 m0s0Var, Hint hint, boolean z, Context context, e0s0 e0s0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$adsSuspendReason = videoSuspendAdsReasonDto;
            this.this$0 = l0s0Var;
            this.$snackbarViewState = m0s0Var;
            this.$hint = hint;
            this.$showSuccessPopup = z;
            this.$context = context;
            this.$viewState = e0s0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$adsSuspendReason, this.this$0, this.$snackbarViewState, this.$hint, this.$showSuccessPopup, this.$context, this.$viewState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00da, code lost:
        
            if (r3.intValue() == 0) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00cd A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0019, B:9:0x00c4, B:11:0x00cd, B:14:0x00dc, B:15:0x00de, B:20:0x00d6, B:24:0x002a, B:25:0x005f, B:28:0x0079, B:32:0x009a, B:34:0x00aa, B:35:0x00bd, B:37:0x0031), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00d6 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0019, B:9:0x00c4, B:11:0x00cd, B:14:0x00dc, B:15:0x00de, B:20:0x00d6, B:24:0x002a, B:25:0x005f, B:28:0x0079, B:32:0x009a, B:34:0x00aa, B:35:0x00bd, B:37:0x0031), top: B:2:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            l0s0 l0s0Var;
            Hint hint;
            l0s0 l0s0Var2;
            Hint hint2;
            Integer m;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
            } catch (Throwable th) {
                L.i(th);
            }
            if (i == 0) {
                kotlin.a.a(obj);
                VideoSuspendAdsReasonDto videoSuspendAdsReasonDto = this.$adsSuspendReason;
                tfx tfxVar = new tfx("video.suspendAds", new wul0(3), new hbn0(1));
                tfx.o(tfxVar, "reason", videoSuspendAdsReasonDto.j(), 0, 0, 12);
                iz2 A = yfb.A(tfxVar);
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hint2 = (Hint) this.L$1;
                    l0s0Var2 = (l0s0) this.L$0;
                    kotlin.a.a(obj);
                    hint = hint2;
                    l0s0Var = l0s0Var2;
                    l0s0Var.getClass();
                    String f = l0s0.f(hint);
                    m = f != null ? arm0.m(10, f) : null;
                    if (m != null) {
                    }
                    l0s0Var.j = true;
                    l0s0Var.k = Boolean.FALSE;
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            l0s0Var = this.this$0;
            m0s0 m0s0Var = this.$snackbarViewState;
            hint = this.$hint;
            boolean z = this.$showSuccessPopup;
            Context context = this.$context;
            e0s0 e0s0Var = this.$viewState;
            if (!epx.f(l0s0Var.k, Boolean.TRUE) || m0s0Var == null) {
                n0s0 n0s0Var = l0s0Var.i;
                String f2 = l0s0.f(hint);
                n0s0Var.getClass();
                n0s0.b(MobileOfficialAppsVideoStat$TypeVideoAdTrialAction.EventType.TURNED_ON, null, f2);
                if (z) {
                    new c0s0.a(context, e0s0Var, new k0s0(l0s0Var, hint, new Ref$BooleanRef())).I0(null);
                } else {
                    l0s0Var.g().s(hint);
                }
                l0s0Var.getClass();
                String f3 = l0s0.f(hint);
                if (f3 != null) {
                }
                if (m != null) {
                }
                l0s0Var.j = true;
                l0s0Var.k = Boolean.FALSE;
                return s3q0.a;
            }
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            C3223a c3223a = new C3223a(l0s0Var, context, m0s0Var, hint, null);
            this.L$0 = l0s0Var;
            this.L$1 = hint;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 2;
            if (myc0.k(ge00Var, c3223a, this) != coroutineSingletons) {
                l0s0Var2 = l0s0Var;
                hint2 = hint;
                hint = hint2;
                l0s0Var = l0s0Var2;
                l0s0Var.getClass();
                String f32 = l0s0.f(hint);
                if (f32 != null) {
                }
                if (m != null) {
                }
                l0s0Var.j = true;
                l0s0Var.k = Boolean.FALSE;
                return s3q0.a;
            }
            return coroutineSingletons;
        }
    }

    public l0s0(Lazy<? extends h7v> lazy, Lazy<? extends b25> lazy2, hit0 hit0Var) {
        this.a = lazy;
        this.b = lazy2;
        this.c = hit0Var;
        qqf0 qqf0Var = new qqf0(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, qqf0Var);
        this.e = msy.a(lazyThreadSafetyMode, new g0s0(0));
        this.f = msy.a(lazyThreadSafetyMode, new y8p0(1));
        this.g = msy.a(lazyThreadSafetyMode, new w5k0(4));
        this.h = zvj.a(hqu0.b());
        this.i = new n0s0();
        this.l = true;
    }

    public static String f(Hint hint) {
        Map<String, String> map = hint.e;
        if (map != null) {
            return map.get("ads_suspend_days");
        }
        return null;
    }

    public static e0s0 h(Hint hint) {
        Map<String, String> map;
        String str;
        String str2 = hint.c;
        if (str2 == null || (map = hint.e) == null || (str = map.get("button_title")) == null) {
            return null;
        }
        return new e0s0(str2, str, null, 28);
    }

    public static boolean i(Context context) {
        return System.currentTimeMillis() - context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime < 604800000;
    }

    @Override // xsna.f0s0
    public final boolean a() {
        return this.j;
    }

    @Override // xsna.f0s0
    public final boolean b(Context context, VideoGrowthVideoParams videoGrowthVideoParams) {
        Map<String, String> map;
        String str;
        boolean z = BuildInfo.s() && (g().a(HintId.ADS_CAN_SUSPEND_SAA_UNUSED.getId()) || g().a(HintId.ADS_CAN_SUSPEND_SAA_UNUSED_60.getId()) || g().a(HintId.ADS_CAN_SUSPEND_SAA_UNUSED_90.getId())) && dy2.i("com.vk.vkvideo");
        if (z) {
            Hint p = g().p(HintId.ADS_CAN_SUSPEND_SAA_UNUSED.getId());
            if (p == null && (p = g().p(HintId.ADS_CAN_SUSPEND_SAA_UNUSED_60.getId())) == null) {
                p = g().p(HintId.ADS_CAN_SUSPEND_SAA_UNUSED_90.getId());
            }
            Hint hint = p;
            if (hint != null) {
                e0s0 h = h(hint);
                if (h == null || (map = hint.e) == null || (str = map.get("ads_suspend_days")) == null) {
                    return false;
                }
                new c0s0.a(context, h, new i0s0(this, hint, context, videoGrowthVideoParams, str)).I0(null);
                return z;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f0s0
    public final void c(Context context) {
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(VideoFeatures.VIDEO_ADS_SUSPEND_COLD)) {
            h7v g = g();
            HintId hintId = HintId.ADS_SUSPENDED_COLD_USERS_0;
            if (g.a(hintId.getId()) || g().a(HintId.ADS_SUSPENDED_COLD_USERS_1.getId()) || g().a(HintId.ADS_SUSPENDED_COLD_USERS_2.getId()) || g().a(HintId.ADS_SUSPENDED_COLD_USERS_3.getId())) {
                Hint p = g().p(hintId.getId());
                if (p == null && (p = g().p(HintId.ADS_SUSPENDED_COLD_USERS_1.getId())) == null && (p = g().p(HintId.ADS_SUSPENDED_COLD_USERS_2.getId())) == null) {
                    p = g().p(HintId.ADS_SUSPENDED_COLD_USERS_3.getId());
                }
                if (p != null) {
                    j(context, p, ((o0s0) this.f.getValue()).a);
                    return;
                }
                return;
            }
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_ADS_SUSPEND_SAA_UNUSED;
        if (bVar.a(videoFeatures)) {
            h7v g2 = g();
            HintId hintId2 = HintId.ADS_SUSPENDED_SAA_UNUSED;
            if (g2.a(hintId2.getId()) || g().a(HintId.ADS_SUSPENDED_SAA_UNUSED_60.getId()) || g().a(HintId.ADS_SUSPENDED_SAA_UNUSED_90.getId())) {
                Hint p2 = g().p(hintId2.getId());
                if (p2 == null && (p2 = g().p(HintId.ADS_SUSPENDED_SAA_UNUSED_60.getId())) == null) {
                    p2 = g().p(HintId.ADS_SUSPENDED_SAA_UNUSED_90.getId());
                }
                if (p2 != null) {
                    j(context, p2, ((o0s0) this.g.getValue()).a);
                    return;
                }
                return;
            }
        }
        if (bVar.a(VideoFeatures.VIDEO_ADS_TRIAL_SUSPEND)) {
            h7v g3 = g();
            HintId hintId3 = HintId.ADS_SUSPENDED_NEWREG_30;
            if (g3.a(hintId3.getId()) || g().a(HintId.ADS_SUSPENDED_NEWREG.getId()) || g().a(HintId.ADS_SUSPENDED_NEWREG_60.getId()) || g().a(HintId.ADS_SUSPENDED_NEWREG_90.getId())) {
                Hint p3 = g().p(hintId3.getId());
                if (p3 == null && (p3 = g().p(HintId.ADS_SUSPENDED_NEWREG.getId())) == null && (p3 = g().p(HintId.ADS_SUSPENDED_NEWREG_60.getId())) == null) {
                    p3 = g().p(HintId.ADS_SUSPENDED_NEWREG_90.getId());
                }
                if (p3 != null) {
                    ?? r1 = this.e;
                    boolean z = ((o0s0) r1.getValue()).b;
                    n0s0 n0s0Var = this.i;
                    if (!z) {
                        boolean i = i(context);
                        String f = f(p3);
                        n0s0Var.getClass();
                        n0s0.a(f, i);
                        j(context, p3, ((o0s0) r1.getValue()).a);
                        return;
                    }
                    if (i(context)) {
                        String f2 = f(p3);
                        n0s0Var.getClass();
                        n0s0.a(f2, true);
                        j(context, p3, ((o0s0) r1.getValue()).a);
                        return;
                    }
                    g().s(p3);
                    String f3 = f(p3);
                    n0s0Var.getClass();
                    n0s0.a(f3, false);
                    return;
                }
                return;
            }
        }
        if (bVar.a(videoFeatures) && epx.f(this.k, Boolean.TRUE) && ((b25) this.b.getValue()).b() && this.l) {
            myc0.h(this.h, null, null, new h0s0(this, context, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f0s0
    public final void d(Context context) {
        if (((b25) this.b.getValue()).b()) {
            return;
        }
        epx.f(this.k, Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f0s0
    public final void e(Context context) {
        ?? r0 = this.b;
        if (((b25) r0.getValue()).b()) {
            ?? r1 = this.d;
            long j = ((SharedPreferences) r1.getValue()).getLong("trigger_stats_sended_uid", 0L);
            long j2 = ((b25) r0.getValue()).c().b;
            if (j == 0 || j != j2) {
                boolean i = i(context);
                this.i.getClass();
                n0s0.a(null, i);
                SharedPreferences.Editor edit = ((SharedPreferences) r1.getValue()).edit();
                edit.putLong("trigger_stats_sended_uid", j2);
                edit.apply();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h7v g() {
        return (h7v) this.a.getValue();
    }

    public final void j(Context context, Hint hint, boolean z) {
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto;
        e0s0 h;
        String str;
        String str2;
        Object obj;
        this.l = false;
        Map<String, String> map = hint.e;
        if (map == null || (str2 = map.get("suspension_reason")) == null) {
            videoSuspendAdsReasonDto = null;
        } else {
            Iterator<E> it = VideoSuspendAdsReasonDto.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((VideoSuspendAdsReasonDto) obj).j(), str2)) {
                        break;
                    }
                }
            }
            videoSuspendAdsReasonDto = (VideoSuspendAdsReasonDto) obj;
        }
        if (videoSuspendAdsReasonDto == null || (h = h(hint)) == null) {
            return;
        }
        m0s0 m0s0Var = (map == null || (str = map.get("snack_title")) == null) ? null : new m0s0(str, map.get("snack_subtitle"));
        String f = f(hint);
        this.i.getClass();
        n0s0.b(MobileOfficialAppsVideoStat$TypeVideoAdTrialAction.EventType.REQUEST, null, f);
        myc0.h(this.h, null, null, new a(videoSuspendAdsReasonDto, this, m0s0Var, hint, z, context, h, null), 3);
    }
}
