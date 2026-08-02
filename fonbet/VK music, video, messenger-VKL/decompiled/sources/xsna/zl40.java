package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.superapp.multiaccount.api.PinCodeAnalyticsParams;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.epx;
import xsna.gm40;
import xsna.k840;
import xsna.km40;
import xsna.lsf0;
import xsna.lsr;
import xsna.nb9;
import xsna.pvj;
import xsna.s3q0;
import xsna.spj;

/* compiled from: MusicKidsModeManagerImpl.kt */
/* loaded from: classes3.dex */
public final class zl40 implements xl40 {
    public final lm40 b;
    public final u240 c;
    public final b25 d;
    public final bpn0 e;
    public final hpj f;
    public yok0 g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicKidsModeManagerImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Cancelled;
        public static final a Success;

        static {
            a aVar = new a("Success", 0);
            Success = aVar;
            a aVar2 = new a("Cancelled", 1);
            Cancelled = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: MusicKidsModeManagerImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zl40(lm40 lm40Var, bpn0 bpn0Var, u240 u240Var, b25 b25Var) {
        this.b = lm40Var;
        this.c = u240Var;
        this.d = b25Var;
        this.e = bpn0Var;
        hm40 hm40Var = new hm40(pvj.a.b);
        this.f = zvj.a(hqu0.b().plus(whn0.a()).plus(hm40Var).plus(new vvj("MusicKidsModeManagerScope")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r7.e(false, r9, r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        if (r7.e(true, r9, r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(zl40 zl40Var, Context context, gzs gzsVar, gzs gzsVar2, ContinuationImpl continuationImpl) {
        cm40 cm40Var;
        int i;
        zl40Var.getClass();
        if (continuationImpl instanceof cm40) {
            cm40Var = (cm40) continuationImpl;
            int i2 = cm40Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cm40Var.label = i2 - Integer.MIN_VALUE;
                Object obj = cm40Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cm40Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (((Boolean) zl40Var.b.a().getValue()).booleanValue()) {
                        bdn bdnVar = bdn.a;
                        ge00 ge00Var = ie00.a;
                        dm40 dm40Var = new dm40(zl40Var, context, null);
                        cm40Var.L$0 = null;
                        cm40Var.L$1 = gzsVar;
                        cm40Var.L$2 = gzsVar2;
                        cm40Var.label = 1;
                        obj = myc0.k(ge00Var, dm40Var, cm40Var);
                    } else {
                        cm40Var.L$0 = null;
                        cm40Var.L$1 = null;
                        cm40Var.L$2 = null;
                        cm40Var.label = 3;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                gzsVar2 = (gzs) cm40Var.L$2;
                gzsVar = (gzs) cm40Var.L$1;
                kotlin.a.a(obj);
                int i3 = b.$EnumSwitchMapping$0[((a) obj).ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return s3q0.a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                cm40Var.L$0 = null;
                cm40Var.L$1 = null;
                cm40Var.L$2 = null;
                cm40Var.L$3 = null;
                cm40Var.label = 2;
            }
        }
        cm40Var = new cm40(zl40Var, continuationImpl);
        Object obj3 = cm40Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cm40Var.label;
        if (i != 0) {
        }
    }

    public static void f(Context context) {
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        if (aVar == null) {
            aVar = null;
        }
        com.vk.music.notifications.restriction.a aVar2 = aVar;
        String string = context.getString(R.string.paywall_restriction_title);
        String string2 = context.getString(R.string.paywall_restriction_description);
        String string3 = context.getString(R.string.paywall_restriction_button_title);
        StringBuilder sb = new StringBuilder();
        Object obj = k840.b.a;
        sb.append("https://www." + a0a.d + "/popup?act=buy_music_subscription");
        sb.append("&ref=audio_kids");
        aVar2.l(24, string, R.drawable.illustration_vk_music_player_with_notes_80, string2, string3, sb.toString());
    }

    @Override // xsna.xl40
    public final void a(Context context) {
        lm40 lm40Var = this.b;
        boolean booleanValue = ((Boolean) lm40Var.a().getValue()).booleanValue();
        hpj hpjVar = this.f;
        if (booleanValue) {
            yok0 yok0Var = this.g;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.g = myc0.h(hpjVar, null, null, new im40(this, context, null, null, null), 3);
            return;
        }
        if (!((Boolean) lm40Var.b().getValue()).booleanValue()) {
            Activity h = e3m.h(context);
            AppCompatActivity appCompatActivity = h instanceof AppCompatActivity ? (AppCompatActivity) h : null;
            if (appCompatActivity != null) {
                new km40.a(context, new pk(13, this, context), new yl40(context, 0)).H0(appCompatActivity.getSupportFragmentManager(), "music_kids_mode_onboarding_modal_tag");
                return;
            }
            return;
        }
        if (!k840.a.i.b()) {
            f(context);
            return;
        }
        yok0 yok0Var2 = this.g;
        if (yok0Var2 != null) {
            yok0Var2.b(null);
        }
        this.g = myc0.h(hpjVar, null, null, new jm40(this, context, null, null, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        am40 am40Var;
        int i;
        if (continuationImpl instanceof am40) {
            am40Var = (am40) continuationImpl;
            int i2 = am40Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                am40Var.label = i2 - Integer.MIN_VALUE;
                Object obj = am40Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = am40Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                final nb9 a2 = cdn.a(this.c.a());
                ksr<lsf0> ksrVar = new ksr<lsf0>() { // from class: com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl$awaitSetupPinCodeEvent$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    /* renamed from: com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl$awaitSetupPinCodeEvent$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements lsr {
                        public final /* synthetic */ lsr b;

                        @b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl$awaitSetupPinCodeEvent$$inlined$filter$1$2", f = "MusicKidsModeManagerImpl.kt", l = {50}, m = "emit")
                        /* renamed from: com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl$awaitSetupPinCodeEvent$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(spj spjVar) {
                                super(spjVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(lsr lsrVar) {
                            this.b = lsrVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                        @Override // xsna.lsr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, spj spjVar) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (spjVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) spjVar;
                                int i2 = anonymousClass1.label;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        kotlin.a.a(obj2);
                                        lsf0 lsf0Var = (lsf0) obj;
                                        if (epx.f(lsf0Var, lsf0.a.a) || epx.f(lsf0Var, lsf0.b.a)) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else if (!epx.f(lsf0Var, lsf0.c.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.a.a(obj2);
                                    }
                                    return s3q0.a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(spjVar);
                            Object obj22 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return s3q0.a;
                        }
                    }

                    @Override // xsna.ksr
                    public final Object collect(lsr<? super lsf0> lsrVar, spj spjVar) {
                        Object collect = nb9.this.collect(new AnonymousClass2(lsrVar), spjVar);
                        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                    }
                };
                am40Var.label = 1;
                Object n = rsr.n(ksrVar, am40Var);
                return n == coroutineSingletons ? coroutineSingletons : n;
            }
        }
        am40Var = new am40(this, continuationImpl);
        Object obj2 = am40Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = am40Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
    
        if (r9.invoke(r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
    
        if (r9.invoke(r0) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v3, types: [xsna.izs] */
    /* JADX WARN: Type inference failed for: r8v0, types: [xsna.zl40] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, PinCodeAnalyticsParams pinCodeAnalyticsParams, gm40.a aVar, ContinuationImpl continuationImpl) {
        em40 em40Var;
        int i;
        izs izsVar;
        gm40.a aVar2;
        lsf0 lsf0Var;
        izs izsVar2;
        if (continuationImpl instanceof em40) {
            em40Var = (em40) continuationImpl;
            int i2 = em40Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                em40Var.label = i2 - Integer.MIN_VALUE;
                Object obj = em40Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = em40Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ((com.vk.superapp.multiaccount.api.e) this.e.getValue()).c(context, this.d.c(), pinCodeAnalyticsParams);
                    em40Var.L$0 = null;
                    em40Var.L$1 = null;
                    em40Var.L$2 = aVar;
                    em40Var.L$3 = null;
                    em40Var.label = 1;
                    obj = c(em40Var);
                    if (obj != coroutineSingletons) {
                        izsVar = null;
                        aVar2 = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        izsVar2 = (izs) em40Var.L$2;
                        kotlin.a.a(obj);
                        ((Result) obj).getClass();
                        if (izsVar2 != null) {
                            em40Var.L$0 = null;
                            em40Var.L$1 = null;
                            em40Var.L$2 = null;
                            em40Var.L$3 = null;
                            em40Var.label = 3;
                        }
                        return s3q0.a;
                    }
                    if (i == 3) {
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                izsVar = (izs) em40Var.L$3;
                ?? r11 = (izs) em40Var.L$2;
                kotlin.a.a(obj);
                aVar2 = r11;
                lsf0Var = (lsf0) obj;
                if (epx.f(lsf0Var, lsf0.a.a)) {
                    if (epx.f(lsf0Var, lsf0.b.a)) {
                        if (izsVar != null) {
                            em40Var.L$0 = null;
                            em40Var.L$1 = null;
                            em40Var.L$2 = null;
                            em40Var.L$3 = null;
                            em40Var.label = 4;
                        }
                    } else {
                        if (!epx.f(lsf0Var, lsf0.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (BuildInfo.h()) {
                            throw new IllegalStateException("Consume unsupported pin code event");
                        }
                        L.l("MusicKidsModeManager", "Consume unsupported pin code event");
                    }
                    return s3q0.a;
                }
                em40Var.L$0 = null;
                em40Var.L$1 = null;
                em40Var.L$2 = aVar2;
                em40Var.L$3 = null;
                em40Var.label = 2;
                if (this.b.c() != coroutineSingletons) {
                    izsVar2 = aVar2;
                    if (izsVar2 != null) {
                    }
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }
        em40Var = new em40(this, continuationImpl);
        Object obj2 = em40Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = em40Var.label;
        if (i != 0) {
        }
        lsf0Var = (lsf0) obj2;
        if (epx.f(lsf0Var, lsf0.a.a)) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(boolean z, gzs gzsVar, gzs gzsVar2, ContinuationImpl continuationImpl) {
        fm40 fm40Var;
        int i;
        Object d;
        if (continuationImpl instanceof fm40) {
            fm40Var = (fm40) continuationImpl;
            int i2 = fm40Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fm40Var.label = i2 - Integer.MIN_VALUE;
                Object obj = fm40Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fm40Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    fm40Var.L$0 = gzsVar;
                    fm40Var.L$1 = gzsVar2;
                    fm40Var.Z$0 = z;
                    fm40Var.label = 1;
                    d = this.b.d(z, fm40Var);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gzsVar2 = (gzs) fm40Var.L$1;
                    gzsVar = (gzs) fm40Var.L$0;
                    kotlin.a.a(obj);
                    d = ((Result) obj).d();
                }
                if (!(d instanceof Result.Failure)) {
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                if (Result.a(d) != null && gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            }
        }
        fm40Var = new fm40(this, continuationImpl);
        Object obj2 = fm40Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fm40Var.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        if (Result.a(d) != null) {
            gzsVar2.invoke();
        }
        return s3q0.a;
    }

    @Override // xsna.xl40
    public final ttk0<Boolean> isEnabled() {
        return this.b.a();
    }
}
