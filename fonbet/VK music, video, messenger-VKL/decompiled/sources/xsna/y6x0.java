package xsna;

import android.content.Context;
import android.media.AudioManager;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.toggle.features.MusicFeatures;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VolumeChangeReporter.kt */
/* loaded from: classes3.dex */
public final class y6x0 {
    public final Context a;
    public final bpn0 b;
    public final bpn0 c;
    public final hpj d;
    public yok0 e;
    public final nb9 f;

    /* compiled from: VolumeChangeReporter.kt */
    @b6l(c = "com.vk.music.player.core.stats.VolumeChangeReporter$start$1", f = "VolumeChangeReporter.kt", l = {67}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: VolumeChangeReporter.kt */
        /* renamed from: xsna.y6x0$a$a, reason: collision with other inner class name */
        public static final class C4084a<T> implements lsr {
            public static final C4084a<T> b = new C4084a<>();

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                Pair pair = (Pair) obj;
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIO_VOLUME_CHANGE.h(), null, null, (Integer) pair.i(), null, (Integer) pair.j(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                l5mVar.q();
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return y6x0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 izg0Var = new izg0(new x6x0(new psr(new ysr(5000L, rsr.l(y6x0.this.f), null)), null));
                this.label = 1;
                if (izg0Var.collect(C4084a.b, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public y6x0() {
        Context context = e43.a;
        this.a = context == null ? null : context;
        this.b = new bpn0(new sqf0(17));
        this.c = new bpn0(new uho0(this, 21));
        bdn bdnVar = bdn.a;
        this.d = zvj.a(ie00.a.U().plus(whn0.a()));
        this.f = rsr.i(new z6x0(this, null));
    }

    public static final int a(y6x0 y6x0Var) {
        return (int) ((((AudioManager) y6x0Var.b.getValue()).getStreamVolume(3) / ((Number) y6x0Var.c.getValue()).intValue()) * 100);
    }

    public final void b() {
        if (MusicFeatures.AUDIO_VOLUME_STATS.h()) {
            yok0 yok0Var = this.e;
            if (yok0Var == null || !yok0Var.isActive()) {
                this.e = myc0.h(this.d, null, null, new a(null), 3);
            }
        }
    }
}
