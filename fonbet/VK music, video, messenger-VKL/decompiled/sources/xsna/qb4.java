package xsna;

import android.content.Context;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AudioAdStateManagerImpl.kt */
@b6l(c = "com.vk.music.player.ads.impl.AudioAdStateManagerImpl$adCompleted$1", f = "AudioAdStateManagerImpl.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class qb4 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PlaybackLaunchMeta $launchMeta;
    final /* synthetic */ MusicTrack $track;
    final /* synthetic */ AudioAdConfig.Type $type;
    final /* synthetic */ boolean $wasListened;
    Object L$0;
    int label;
    final /* synthetic */ pb4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb4(pb4 pb4Var, boolean z, AudioAdConfig.Type type, MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, Context context, spj<? super qb4> spjVar) {
        super(2, spjVar);
        this.this$0 = pb4Var;
        this.$wasListened = z;
        this.$type = type;
        this.$track = musicTrack;
        this.$launchMeta = playbackLaunchMeta;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qb4(this.this$0, this.$wasListened, this.$type, this.$track, this.$launchMeta, this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qb4) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AudioAdConfig.Type type;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                pb4 pb4Var = this.this$0;
                PlaybackLaunchMeta playbackLaunchMeta = pb4Var.i;
                if (this.$wasListened && (type = this.$type) != null && playbackLaunchMeta != null) {
                    this.L$0 = null;
                    this.label = 1;
                    String t = playbackLaunchMeta.b.t();
                    if (t == null) {
                        t = "";
                    }
                    Object a = pb4Var.c.a(type, t, this);
                    if (a != coroutineSingletons) {
                        a = s3q0.a;
                    }
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
        } catch (Exception e) {
            L.i(e);
        }
        MusicTrack musicTrack = this.$track;
        if (musicTrack != null) {
            this.this$0.d(musicTrack, this.$launchMeta, this.$context);
        }
        return s3q0.a;
    }
}
