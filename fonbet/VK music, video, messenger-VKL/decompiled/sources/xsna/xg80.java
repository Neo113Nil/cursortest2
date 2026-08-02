package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.JsonSyntaxException;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import com.vk.onboardingpromo.impl.data.OnboardingPromoConfig;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoArgumentsImpl;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: OnboardingPromoRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class xg80 {
    public static final /* synthetic */ qcy<Object>[] h;
    public final Context a;
    public final rf80 b;
    public final h43 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final hn70 g;

    /* compiled from: OnboardingPromoRepositoryImpl.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.data.OnboardingPromoRepositoryImpl$clearCache$2", f = "OnboardingPromoRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ long $promoId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$promoId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return xg80.this.new a(this.$promoId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PrivateFiles.a b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            SharedPreferences.Editor edit = xg80.this.b().edit();
            edit.remove("onboarding_promo");
            edit.remove("is_promo_seen_once");
            edit.remove("is_fully_cached");
            edit.apply();
            hn70 hn70Var = xg80.this.g;
            qcy<Object> qcyVar = xg80.h[0];
            hn70Var.b(Long.MIN_VALUE);
            b = e8r.a.b(r0, PrivateSubdir.LARGE_TEMP_UPLOADS.h(), false);
            File file = b.a;
            final long j = this.$promoId;
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: xsna.wg80
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return brm0.B(str, tg80.d(j), false);
                }
            });
            if (listFiles != null) {
                long j2 = this.$promoId;
                if (listFiles.length == 0) {
                    throw new IllegalArgumentException(defpackage.k0.a(j2, "There are no files to remove in the promo campaign: ").toString());
                }
                for (File file2 : listFiles) {
                    nbr.l(file2);
                }
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(xg80.class, "cachedPromoIdPref", "getCachedPromoIdPref()J", 0);
        fpf0.a.getClass();
        h = new qcy[]{mutablePropertyReference1Impl};
    }

    public xg80(Context context, rf80 rf80Var) {
        rzv0 rzv0Var = rzv0.a;
        this.a = context;
        this.b = rf80Var;
        this.c = rzv0Var;
        fc fcVar = new fc(26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, fcVar);
        this.e = msy.a(lazyThreadSafetyMode, new gc(24));
        this.f = msy.a(lazyThreadSafetyMode, new pr0(this));
        this.g = new hn70("onboarding_promo", "promo_id", Long.MIN_VALUE);
    }

    public final Object a(long j, spj<? super s3q0> spjVar) {
        Object k = myc0.k(this.c.getIo(), new a(j, null), spjVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SharedPreferences b() {
        return (SharedPreferences) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public final OnboardingPromoArgumentsImpl c() {
        String string = b().getString("onboarding_promo", null);
        if (string == null) {
            return null;
        }
        try {
            return new OnboardingPromoArgumentsImpl((OnboardingPromoDo) GsonHolder.a().fromJson(string, OnboardingPromoDo.class), (OnboardingPromoConfig) this.f.getValue());
        } catch (JsonSyntaxException e) {
            L.e("OnboardingPromo", "Can't parse cached config: " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        zg80 zg80Var;
        int i;
        try {
            if (continuationImpl instanceof zg80) {
                zg80Var = (zg80) continuationImpl;
                int i2 = zg80Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zg80Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = zg80Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zg80Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ovj io2 = this.c.getIo();
                        ah80 ah80Var = new ah80(this, null);
                        zg80Var.L$0 = null;
                        zg80Var.I$0 = 0;
                        zg80Var.label = 1;
                        obj = myc0.k(io2, ah80Var, zg80Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return (OnboardingPromoDo) obj;
                }
            }
            if (i != 0) {
            }
            return (OnboardingPromoDo) obj;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        zg80Var = new zg80(this, continuationImpl);
        Object obj2 = zg80Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zg80Var.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, ContinuationImpl continuationImpl) {
        bh80 bh80Var;
        int i2;
        try {
            if (continuationImpl instanceof bh80) {
                bh80Var = (bh80) continuationImpl;
                int i3 = bh80Var.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    bh80Var.label = i3 - Integer.MIN_VALUE;
                    Object obj = bh80Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = bh80Var.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        ovj io2 = this.c.getIo();
                        ch80 ch80Var = new ch80(this, i, null);
                        bh80Var.L$0 = null;
                        bh80Var.I$0 = i;
                        bh80Var.I$1 = 0;
                        bh80Var.label = 1;
                        if (myc0.k(io2, ch80Var, bh80Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return s3q0.a;
                }
            }
            if (i2 != 0) {
            }
            return s3q0.a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        bh80Var = new bh80(this, continuationImpl);
        Object obj2 = bh80Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = bh80Var.label;
    }
}
