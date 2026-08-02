package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.VKApplication;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.k840;
import xsna.mb4;
import xsna.s3z0;

/* compiled from: AudioAdStateManagerImpl.kt */
@b6l(c = "com.vk.music.player.ads.impl.AudioAdStateManagerImpl$createPendingAudioState$2", f = "AudioAdStateManagerImpl.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class sb4 extends SuspendLambda implements wzs<yvj, spj<? super g8x>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PlaybackLaunchMeta $launchMeta;
    final /* synthetic */ MusicTrack $musicTrack;
    final /* synthetic */ j9q0 $updateUserStatistic;
    int label;
    final /* synthetic */ pb4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb4(pb4 pb4Var, MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, j9q0 j9q0Var, Context context, spj<? super sb4> spjVar) {
        super(2, spjVar);
        this.this$0 = pb4Var;
        this.$musicTrack = musicTrack;
        this.$launchMeta = playbackLaunchMeta;
        this.$updateUserStatistic = j9q0Var;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sb4(this.this$0, this.$musicTrack, this.$launchMeta, this.$updateUserStatistic, this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super g8x> spjVar) {
        return ((sb4) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        Integer b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        jb4 jb4Var = this.this$0.b;
        MusicTrack musicTrack = this.$musicTrack;
        PlaybackLaunchMeta playbackLaunchMeta = this.$launchMeta;
        AudioAdConfig.Type type = this.$updateUserStatistic.b;
        Context context = this.$context;
        this.label = 1;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"track = " + musicTrack + ", launchMeta = " + playbackLaunchMeta});
        }
        if (musicTrack.Vb() || musicTrack.Mb() || musicTrack.Wb()) {
            obj2 = null;
        } else {
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = playbackLaunchMeta.b;
            boolean z = jb4.d;
            L.p(new Object[0]);
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            MusicFeatures musicFeatures = MusicFeatures.AUDIO_REWORK_PLAYER_ADS;
            b.d i2 = bVar.i(musicFeatures);
            int intValue = (i2 == null || (b = i2.b()) == null) ? 69342 : b.intValue();
            if (BuildInfo.h()) {
                fp01 fp01Var = k840.a.j;
                if (fp01Var == null) {
                    fp01Var = null;
                }
                fp01Var.getClass();
                o2l.a.getClass();
                int i3 = Preference.j().getInt("__dbg_music_ad_slot_id", 0);
                Integer valueOf = Integer.valueOf(i3);
                if (i3 == 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    intValue = valueOf.intValue();
                }
            }
            VKApplication vKApplication = com.vk.core.apps.a.a;
            g8x g8xVar = new g8x(intValue, jb4Var.b.a(), context);
            s3z0.a aVar = g8xVar.b;
            u6z0 u6z0Var = g8xVar.a;
            int i4 = MusicFeatures.AUDIO_AD_CACHING.h() ? 0 : 3;
            u6z0Var.f = i4;
            u6z0Var.j.g = i4;
            qnk qnkVar = u6z0Var.a;
            qnkVar.i(String.valueOf(jb4Var.c.c().b));
            qnkVar.g("vkcat_id", String.valueOf(musicPlaybackLaunchContext.b.getInt("__META_AD_CATEGORY")));
            if (musicFeatures.h() && MusicFeatures.AUDIO_MY_TARGET_FORCE_AD.h()) {
                qnkVar.g("force_ad", "1");
            }
            Bundle bundle = musicTrack.v;
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    String string = bundle.getString(str2);
                    if (string != null) {
                        qnkVar.g(str2, string);
                    }
                }
            }
            if (z) {
                qnkVar.g("preview", "1");
            }
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            g8xVar.j = new hb4(jb4Var, playbackLaunchMeta, type, musicTrack, lq9Var);
            lq9Var.r(new ib4(jb4Var, playbackLaunchMeta, g8xVar));
            if (g8xVar.c.compareAndSet(false, true)) {
                str = null;
                s3z0 a = aVar.a();
                dkz0 dkz0Var = new dkz0(null, u6z0Var, aVar, g8xVar.k);
                dkz0Var.d = new kf3(g8xVar, 23);
                dkz0Var.e(a, g8xVar.e);
            } else {
                str = null;
                gu8.c(null, "InstreamAudioAd: Doesn't support multiple load");
                g8xVar.c(null, xla.a(iaz0.t));
            }
            mb4.a.a("requested", str, playbackLaunchMeta.b);
            obj2 = lq9Var.n();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
