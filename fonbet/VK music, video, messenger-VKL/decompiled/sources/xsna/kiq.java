package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.music.player.core.audioeffect.fade.FadeDirection;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: FadeController.kt */
/* loaded from: classes3.dex */
public final class kiq {
    public final long a;
    public final miq b;
    public final izs<Float, s3q0> c;
    public final io.reactivex.rxjava3.disposables.g d = new io.reactivex.rxjava3.disposables.g();
    public final io.reactivex.rxjava3.core.w e = asu0.a.A(1, "fade_longtap_scheduler");
    public final long f;

    /* compiled from: FadeController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FadeDirection.values().length];
            try {
                iArr[FadeDirection.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FadeDirection.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kiq(long j, miq miqVar, izs<? super Float, s3q0> izsVar) {
        this.a = j;
        this.b = miqVar;
        this.c = izsVar;
        this.f = j / 50;
    }

    public final void a() {
        this.c.invoke(Float.valueOf(1.0f));
        this.d.b(null);
    }

    public final void b(FadeDirection fadeDirection) {
        if (hg1.d(this.d.a())) {
            return;
        }
        bn40.f("Fade " + fadeDirection + " started");
        int i = a.$EnumSwitchMapping$0[fadeDirection.ordinal()];
        if (i == 1) {
            this.c.invoke(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final void c(float f, final float f2) {
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = f;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.core.w wVar = this.e;
        long j = this.f;
        this.d.b(new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.r2(io.reactivex.rxjava3.core.q.Q(j, j, timeUnit, wVar), new aa6(new p4f(this, 24), 18)).a0(asu0.a.d()), new io.reactivex.rxjava3.functions.a() { // from class: xsna.iiq
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                kiq kiqVar = kiq.this;
                kiqVar.d.b(null);
                kiqVar.c.invoke(Float.valueOf(f2));
                bn40.f("Fade ended");
            }
        }).subscribe(new wf1(new jiq(ref$FloatRef, (f2 - f) / 50, this), 21), new ff3(new qt(28), 13)));
    }
}
