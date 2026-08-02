package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.libvideo.adfree.api.VideoAdFreeBottomSheetArguments;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.toggle.data.VideoAdFreeSubscriptionFeatureConfig;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.adfree.VideoAdFreeButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dzr0;
import xsna.qyr0;

/* compiled from: VideoAdFreeTrapManagerImpl.kt */
/* loaded from: classes18.dex */
public final class hzr0 implements fzr0 {
    public final vyr0 a;
    public final com.vk.libvideo.adfree.api.di.a b;
    public final tyr0 c;
    public boolean d;
    public boolean e;
    public String f;
    public syr0 g;
    public hpj h;
    public final Object i;
    public final Object j;
    public Set<VideoAdFreeSubscriptionFeatureConfig.PopupStrategy> k;
    public final Object l;
    public final som0 m;

    /* compiled from: VideoAdFreeTrapManagerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAdFreeTrapEventTrigger.values().length];
            try {
                iArr[VideoAdFreeTrapEventTrigger.APP_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAdFreeTrapEventTrigger.DISCOVERY_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAdFreeTrapEventTrigger.AD_SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoAdFreeTrapEventTrigger.AD_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoAdFreeTrapEventTrigger.AD_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoAdFreeTrapEventTrigger.VIDEO_TAB_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoAdFreeTrapManagerImpl.kt */
    @b6l(c = "com.vk.libvideo.adfree.impl.domain.VideoAdFreeTrapManagerImpl$onEventTriggered$1", f = "VideoAdFreeTrapManagerImpl.kt", l = {176, 186}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $shouldShowButton;
        final /* synthetic */ boolean $shouldShowPopup;
        final /* synthetic */ VideoAdFreeTrapEventTrigger $trigger;
        Object L$0;
        int label;
        final /* synthetic */ hzr0 this$0;

        /* compiled from: VideoAdFreeTrapManagerImpl.kt */
        @b6l(c = "com.vk.libvideo.adfree.impl.domain.VideoAdFreeTrapManagerImpl$onEventTriggered$1$1", f = "VideoAdFreeTrapManagerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ dzr0 $currentSubscriptionState;
            final /* synthetic */ VideoAdFreeTrapEventTrigger $trigger;
            int label;
            final /* synthetic */ hzr0 this$0;

            /* compiled from: VideoAdFreeTrapManagerImpl.kt */
            /* renamed from: xsna.hzr0$b$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C3028a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VideoAdFreeTrapEventTrigger.values().length];
                    try {
                        iArr[VideoAdFreeTrapEventTrigger.VIDEO_TAB_START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VideoAdFreeTrapEventTrigger.APP_START.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[VideoAdFreeTrapEventTrigger.DISCOVERY_START.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[VideoAdFreeTrapEventTrigger.AD_SKIP.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[VideoAdFreeTrapEventTrigger.AD_START.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[VideoAdFreeTrapEventTrigger.AD_END.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(hzr0 hzr0Var, Context context, dzr0 dzr0Var, VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger, spj<? super a> spjVar) {
                super(2, spjVar);
                this.this$0 = hzr0Var;
                this.$context = context;
                this.$currentSubscriptionState = dzr0Var;
                this.$trigger = videoAdFreeTrapEventTrigger;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.this$0, this.$context, this.$currentSubscriptionState, this.$trigger, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                hzr0 hzr0Var = this.this$0;
                Context context = this.$context;
                dzr0.b bVar = (dzr0.b) this.$currentSubscriptionState;
                String str = bVar.a;
                String str2 = bVar.b;
                String valueOf = String.valueOf(bVar.c);
                this.this$0.getClass();
                String str3 = com.vk.toggle.d.t().c;
                this.this$0.getClass();
                String str4 = com.vk.toggle.d.t().d;
                this.this$0.getClass();
                String str5 = com.vk.toggle.d.t().e;
                int i = 1;
                switch (C3028a.$EnumSwitchMapping$0[this.$trigger.ordinal()]) {
                    case 1:
                    case 2:
                        z = false;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        z = true;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                VideoAdFreeBottomSheetArguments videoAdFreeBottomSheetArguments = new VideoAdFreeBottomSheetArguments(str4, str3, str5, valueOf, str, str2, z);
                VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger = this.$trigger;
                hzr0Var.getClass();
                new qyr0.a(context, videoAdFreeBottomSheetArguments).a0(new poq0(i, hzr0Var, videoAdFreeTrapEventTrigger)).d0(new hp30(hzr0Var, 28)).I0(null);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, boolean z2, hzr0 hzr0Var, VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger, Context context, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$shouldShowButton = z;
            this.$shouldShowPopup = z2;
            this.this$0 = hzr0Var;
            this.$trigger = videoAdFreeTrapEventTrigger;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$shouldShowButton, this.$shouldShowPopup, this.this$0, this.$trigger, this.$context, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0040, code lost:
        
            if (r11 == r0) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00d0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dzr0 dzr0Var;
            ge00 ge00Var;
            a aVar;
            dzr0 dzr0Var2;
            dzr0 dzr0Var3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$shouldShowButton || this.$shouldShowPopup) {
                    vyr0 vyr0Var = this.this$0.a;
                    this.label = 1;
                    Object b = vyr0Var.b(this);
                    dzr0Var3 = b;
                }
                dzr0Var = r2;
                if (this.$shouldShowPopup && !this.this$0.d && (dzr0Var instanceof dzr0.b)) {
                    if (hzr0.g() != 0) {
                        this.this$0.k.remove(hzr0.i(this.$trigger));
                        hzr0 hzr0Var = this.this$0;
                        SharedPreferences.Editor edit = hzr0Var.f().edit();
                        Set<VideoAdFreeSubscriptionFeatureConfig.PopupStrategy> set = hzr0Var.k;
                        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((VideoAdFreeSubscriptionFeatureConfig.PopupStrategy) it.next()).name());
                        }
                        edit.putStringSet("pref_key_traps_queue", j5g.S0(arrayList));
                        edit.apply();
                    }
                    bdn bdnVar = bdn.a;
                    ge00Var = ie00.a;
                    aVar = new a(this.this$0, this.$context, dzr0Var, this.$trigger, null);
                    this.L$0 = dzr0Var;
                    this.label = 2;
                    if (myc0.k(ge00Var, aVar, this) != coroutineSingletons) {
                        dzr0Var2 = dzr0Var;
                        dzr0Var = dzr0Var2;
                    }
                    return coroutineSingletons;
                }
                if (dzr0Var instanceof dzr0.b) {
                }
                return s3q0.a;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dzr0Var2 = (dzr0) this.L$0;
                kotlin.a.a(obj);
                dzr0Var = dzr0Var2;
                if (dzr0Var instanceof dzr0.b) {
                    this.this$0.f = ((dzr0.b) dzr0Var).a;
                }
                return s3q0.a;
            }
            kotlin.a.a(obj);
            dzr0Var3 = ((Result) obj).d();
            r2 = dzr0Var3 instanceof Result.Failure ? null : dzr0Var3;
            dzr0Var = r2;
            if (this.$shouldShowPopup) {
                if (hzr0.g() != 0) {
                }
                bdn bdnVar2 = bdn.a;
                ge00Var = ie00.a;
                aVar = new a(this.this$0, this.$context, dzr0Var, this.$trigger, null);
                this.L$0 = dzr0Var;
                this.label = 2;
                if (myc0.k(ge00Var, aVar, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (dzr0Var instanceof dzr0.b) {
            }
            return s3q0.a;
        }
    }

    public hzr0(wyr0 wyr0Var, xyr0 xyr0Var, tyr0 tyr0Var) {
        this.a = wyr0Var;
        this.b = xyr0Var;
        this.c = tyr0Var;
        dgc0 dgc0Var = new dgc0(14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, dgc0Var);
        this.j = msy.a(lazyThreadSafetyMode, new gzr0(0));
        this.k = new LinkedHashSet();
        this.l = msy.a(lazyThreadSafetyMode, new s7c0(11));
        this.m = new som0(this);
    }

    public static long g() {
        int i = com.vk.toggle.d.t().j;
        return i < 0 ? TimeUnit.SECONDS.toMillis(Math.abs(i)) : TimeUnit.MINUTES.toMillis(i);
    }

    public static VideoAdFreeSubscriptionFeatureConfig.PopupStrategy i(VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger) {
        switch (a.$EnumSwitchMapping$0[videoAdFreeTrapEventTrigger.ordinal()]) {
            case 1:
                return VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.APP_START;
            case 2:
                return VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.DISCOVERY_START;
            case 3:
                return VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.AD_SKIP;
            case 4:
                return VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.AD_FIRST;
            case 5:
                return VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.AD_END;
            case 6:
                return VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.VIDEO_TAB_START;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    @Override // xsna.fzr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger, Context context) {
        boolean z;
        boolean z2;
        hpj hpjVar;
        boolean z3 = false;
        if (this.k.contains(i(videoAdFreeTrapEventTrigger))) {
            long j = f().getLong("pref_key_last_ad_free_popup_show", 0L);
            int i = com.vk.toggle.d.t().a;
            if (e(j, i < 0 ? TimeUnit.SECONDS.toMillis(Math.abs(i)) : TimeUnit.DAYS.toMillis(i))) {
                z = true;
                if (videoAdFreeTrapEventTrigger != VideoAdFreeTrapEventTrigger.AD_START) {
                    if (com.vk.toggle.d.t().i.contains(VideoAdFreeSubscriptionFeatureConfig.ButtonStrategy.DURING_AD)) {
                        long j2 = f().getLong("pref_key_last_ad_free_button_show", 0L);
                        int i2 = com.vk.toggle.d.t().b;
                        if (e(j2, i2 < 0 ? TimeUnit.SECONDS.toMillis(Math.abs(i2)) : TimeUnit.DAYS.toMillis(i2))) {
                            h(true);
                            z2 = true;
                            hpjVar = this.h;
                            if (hpjVar != null) {
                                myc0.h(hpjVar, null, null, new b(z2, z, this, videoAdFreeTrapEventTrigger, context, null), 3);
                                return;
                            }
                            return;
                        }
                    }
                    z3 = this.e;
                } else if (videoAdFreeTrapEventTrigger == VideoAdFreeTrapEventTrigger.AD_END) {
                    if (com.vk.toggle.d.t().i.contains(VideoAdFreeSubscriptionFeatureConfig.ButtonStrategy.DURING_AD)) {
                        h(false);
                    }
                    z3 = this.e;
                }
                z2 = z3;
                hpjVar = this.h;
                if (hpjVar != null) {
                }
            }
        }
        z = false;
        if (videoAdFreeTrapEventTrigger != VideoAdFreeTrapEventTrigger.AD_START) {
        }
        z2 = z3;
        hpjVar = this.h;
        if (hpjVar != null) {
        }
    }

    @Override // xsna.fzr0
    public final void b(boolean z) {
        if (z && this.e) {
            syr0 syr0Var = this.g;
            if (syr0Var != null) {
                syr0Var.setVisible(true);
                return;
            }
            return;
        }
        syr0 syr0Var2 = this.g;
        if (syr0Var2 != null) {
            syr0Var2.setVisible(false);
        }
    }

    @Override // xsna.fzr0
    public final ryr0 c() {
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r11 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa A[LOOP:2: B:37:0x00f4->B:39:0x00fa, LOOP_END] */
    @Override // xsna.fzr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(VideoAdFreeButton videoAdFreeButton) {
        Object obj;
        boolean z;
        Iterator<T> it;
        Set<VideoAdFreeSubscriptionFeatureConfig.PopupStrategy> linkedHashSet;
        this.g = videoAdFreeButton;
        if (this.h == null) {
            this.h = zvj.a(hqu0.b());
        }
        Set<String> stringSet = f().getStringSet("pref_key_initial_popup_strategies", EmptySet.b);
        if (stringSet != null) {
            Set<String> set = stringSet;
            ArrayList arrayList = new ArrayList(c5g.u(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.valueOf((String) it2.next()));
            }
            obj = j5g.S0(arrayList);
        }
        obj = EmptySet.b;
        long currentTimeMillis = System.currentTimeMillis();
        if (f().getLong("pref_key_last_ad_free_popup_show", 0L) != 0) {
            long j = f().getLong("pref_key_last_ad_free_popup_show", 0L);
            int i = com.vk.toggle.d.t().a;
            if (currentTimeMillis < (i < 0 ? TimeUnit.SECONDS.toMillis(Math.abs(i)) : TimeUnit.DAYS.toMillis(i)) + j) {
                z = false;
                if (!epx.f(obj, com.vk.toggle.d.t().h) && !z) {
                    Set<String> stringSet2 = f().getStringSet("pref_key_traps_queue", EmptySet.b);
                    if (stringSet2 != null) {
                        Set<String> set2 = stringSet2;
                        ArrayList arrayList2 = new ArrayList(c5g.u(set2, 10));
                        Iterator<T> it3 = set2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.valueOf((String) it3.next()));
                        }
                        linkedHashSet = j5g.R0(arrayList2);
                    } else {
                        linkedHashSet = new LinkedHashSet<>();
                    }
                    this.k = linkedHashSet;
                    return;
                }
                Set<VideoAdFreeSubscriptionFeatureConfig.PopupStrategy> R0 = j5g.R0(com.vk.toggle.d.t().h);
                this.k = R0;
                ArrayList arrayList3 = new ArrayList(c5g.u(R0, 10));
                it = R0.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((VideoAdFreeSubscriptionFeatureConfig.PopupStrategy) it.next()).name());
                }
                Set<String> S0 = j5g.S0(arrayList3);
                SharedPreferences.Editor edit = f().edit();
                edit.putStringSet("pref_key_initial_popup_strategies", S0);
                edit.apply();
                SharedPreferences.Editor edit2 = f().edit();
                edit2.putStringSet("pref_key_traps_queue", S0);
                edit2.apply();
            }
        }
        z = true;
        if (!epx.f(obj, com.vk.toggle.d.t().h)) {
        }
        Set<VideoAdFreeSubscriptionFeatureConfig.PopupStrategy> R02 = j5g.R0(com.vk.toggle.d.t().h);
        this.k = R02;
        ArrayList arrayList32 = new ArrayList(c5g.u(R02, 10));
        it = R02.iterator();
        while (it.hasNext()) {
        }
        Set<String> S02 = j5g.S0(arrayList32);
        SharedPreferences.Editor edit3 = f().edit();
        edit3.putStringSet("pref_key_initial_popup_strategies", S02);
        edit3.apply();
        SharedPreferences.Editor edit22 = f().edit();
        edit22.putStringSet("pref_key_traps_queue", S02);
        edit22.apply();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean e(long j, long j2) {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_FREE_SUBSCRIPTION;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            VideoAdFreeSubscriptionFeatureConfig t = com.vk.toggle.d.t();
            VideoAdFreeSubscriptionFeatureConfig.k.getClass();
            if (!epx.f(t, VideoAdFreeSubscriptionFeatureConfig.l) && ((b25) this.i.getValue()).b()) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = j == 0 || currentTimeMillis >= j2 + j;
                boolean z2 = g() != 0 && (j == 0 || currentTimeMillis >= g() + j);
                if (z || z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SharedPreferences f() {
        return (SharedPreferences) this.j.getValue();
    }

    public final void h(boolean z) {
        if (!z) {
            this.e = false;
            syr0 syr0Var = this.g;
            if (syr0Var != null) {
                syr0Var.setVisible(false);
                return;
            }
            return;
        }
        syr0 syr0Var2 = this.g;
        if (syr0Var2 != null) {
            syr0Var2.setVisible(true);
        }
        this.e = true;
        SharedPreferences.Editor edit = f().edit();
        edit.putLong("pref_key_last_ad_free_button_show", System.currentTimeMillis());
        edit.apply();
    }

    @Override // xsna.fzr0
    public final void release() {
        this.g = null;
        hpj hpjVar = this.h;
        if (hpjVar != null) {
            zvj.c(hpjVar, null);
        }
        this.h = null;
    }
}
