package xsna;

import android.content.Context;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AudioAdStateManagerImpl.kt */
/* loaded from: classes3.dex */
public final class ub4 implements v940 {
    public final tb4 a = new tb4(0);
    public final /* synthetic */ pb4 b;

    /* compiled from: AudioAdStateManagerImpl.kt */
    @b6l(c = "com.vk.music.player.ads.impl.AudioAdStateManagerImpl$listener$1$onEvents$1", f = "AudioAdStateManagerImpl.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MusicTrack $currentTrack;
        final /* synthetic */ ax1[] $events;
        final /* synthetic */ PlaybackLaunchMeta $launchMeta;
        int label;
        final /* synthetic */ pb4 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pb4 pb4Var, ax1[] ax1VarArr, PlaybackLaunchMeta playbackLaunchMeta, MusicTrack musicTrack, Context context, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = pb4Var;
            this.$events = ax1VarArr;
            this.$launchMeta = playbackLaunchMeta;
            this.$currentTrack = musicTrack;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$events, this.$launchMeta, this.$currentTrack, this.$context, spjVar);
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
                pb4 pb4Var = this.this$0;
                List u0 = rl3.u0(this.$events);
                PlaybackLaunchMeta playbackLaunchMeta = this.$launchMeta;
                MusicTrack musicTrack = this.$currentTrack;
                Context context = this.$context;
                this.label = 1;
                if (pb4.f(pb4Var, u0, playbackLaunchMeta, musicTrack, context, this) == coroutineSingletons) {
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

    public ub4(pb4 pb4Var) {
        this.b = pb4Var;
    }

    @Override // xsna.v940
    public final tb4 a() {
        return this.a;
    }

    @Override // xsna.v940
    public final void b(ax1... ax1VarArr) {
        pb4 pb4Var = this.b;
        MusicTrack musicTrack = pb4Var.g;
        PlaybackLaunchMeta playbackLaunchMeta = pb4Var.i;
        Context context = pb4Var.h;
        if (musicTrack == null || playbackLaunchMeta == null || context == null) {
            return;
        }
        yok0 yok0Var = pb4Var.f;
        if (yok0Var == null || !yok0Var.isActive()) {
            pb4Var.f = myc0.h(pb4Var.e, null, null, new a(pb4Var, ax1VarArr, playbackLaunchMeta, musicTrack, context, null), 3);
        }
    }
}
