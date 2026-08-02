package xsna;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.tza0;

/* compiled from: PlayerBackgroundUtils.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.background.PlayerBackgroundUtilsKt$ExtractColorsLaunchedEffect$1$1", f = "PlayerBackgroundUtils.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class sza0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ pfl0 $coversController;
    final /* synthetic */ boolean $hasCoversInLayout;
    final /* synthetic */ String $url;
    Object L$0;
    int label;

    /* compiled from: PlayerBackgroundUtils.kt */
    public static final class a implements izs<Bitmap, sfl0> {
        public final /* synthetic */ long b;

        public a(long j) {
            this.b = j;
        }

        @Override // xsna.izs
        public final sfl0 invoke(Bitmap bitmap) {
            List a = tfl0.a(this.b, bitmap);
            if (a != null) {
                return new sfl0(a);
            }
            return null;
        }
    }

    /* compiled from: PlayerBackgroundUtils.kt */
    public static final class b implements izs<sfl0, s3q0> {
        public final /* synthetic */ pfl0 b;
        public final /* synthetic */ String c;

        public b(pfl0 pfl0Var, String str) {
            this.b = pfl0Var;
            this.c = str;
        }

        @Override // xsna.izs
        public final s3q0 invoke(sfl0 sfl0Var) {
            sfl0 sfl0Var2 = sfl0Var;
            List list = sfl0Var2 != null ? sfl0Var2.a : null;
            if (list != null) {
            }
            pfl0 pfl0Var = this.b;
            String str = this.c;
            pfl0Var.b(str, list);
            pfl0Var.e(str, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sza0(boolean z, pfl0 pfl0Var, String str, long j, spj<? super sza0> spjVar) {
        super(2, spjVar);
        this.$hasCoversInLayout = z;
        this.$coversController = pfl0Var;
        this.$url = str;
        this.$backgroundColor = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sza0(this.$hasCoversInLayout, this.$coversController, this.$url, this.$backgroundColor, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((sza0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        io.reactivex.rxjava3.disposables.c cVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$hasCoversInLayout) {
                return s3q0.a;
            }
            if (this.$coversController.d(this.$url)) {
                this.$coversController.e(this.$url, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
            String str = this.$url;
            io.reactivex.rxjava3.core.q<Bitmap> h = mcr0.h(str != null ? jeq0.g(str) : null);
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.disposables.c subscribe = h.r0(asu0Var.c()).U(new tza0.a(new a(this.$backgroundColor))).a0(asu0Var.d()).subscribe(new j3z(new b(this.$coversController, this.$url), 10));
            try {
                this.L$0 = subscribe;
                this.label = 1;
                if (qsl.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = subscribe;
            } catch (Throwable th2) {
                cVar = subscribe;
                th = th2;
                cVar.dispose();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (io.reactivex.rxjava3.disposables.c) this.L$0;
            try {
                kotlin.a.a(obj);
            } catch (Throwable th3) {
                th = th3;
                cVar.dispose();
                throw th;
            }
        }
        throw new KotlinNothingValueException();
    }
}
