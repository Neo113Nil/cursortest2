package xsna;

import android.media.audiofx.DynamicsProcessing;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.audioeffect.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ztp;

/* compiled from: DynamicsProcessingWrapper.kt */
@b6l(c = "com.vk.music.player.core.audioeffect.normalization.DynamicsProcessingWrapper$asyncInit$1", f = "DynamicsProcessingWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class zqo extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ DynamicsProcessing $dynamicsProcessing;
    int label;
    final /* synthetic */ bro this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqo(bro broVar, DynamicsProcessing dynamicsProcessing, spj<? super zqo> spjVar) {
        super(2, spjVar);
        this.this$0 = broVar;
        this.$dynamicsProcessing = dynamicsProcessing;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zqo(this.this$0, this.$dynamicsProcessing, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zqo) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        final boolean booleanValue = ((Boolean) this.this$0.b.a().b.getValue()).booleanValue();
        final boolean booleanValue2 = ((Boolean) this.this$0.b.c().b.getValue()).booleanValue();
        final ztp ztpVar = (ztp) this.this$0.b.h().b.getValue();
        final bro broVar = this.this$0;
        L.o(new gzs() { // from class: xsna.yqo
            @Override // xsna.gzs
            public final Object invoke() {
                return "Equalizer: audioSessionId=" + bro.this.a + ", isLoudnessNormalizationEnabled = " + booleanValue2 + ", isisEqualizerEnabled" + booleanValue + ", preset=" + ztpVar;
            }
        });
        bro broVar2 = this.this$0;
        DynamicsProcessing dynamicsProcessing = this.$dynamicsProcessing;
        try {
            broVar2.a();
            DynamicsProcessing.Eq eq = broVar2.j;
            if (booleanValue2) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Loudness normalization: audioSessionId=" + broVar2.a + ", " + broVar2.c});
                }
                dynamicsProcessing.setInputGainAllChannelsTo(broVar2.c);
            } else {
                dynamicsProcessing.setInputGainAllChannelsTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            eq.setEnabled(booleanValue);
            if (ztpVar instanceof ztp.g) {
                a = ((ztp.g) ztpVar).d;
            } else {
                com.vk.music.audioeffect.a.a.getClass();
                a = a.C1320a.a(ztpVar);
            }
            com.vk.music.audioeffect.a.a.getClass();
            int i = a.C1320a.c;
            for (int i2 = 0; i2 < i; i2++) {
                DynamicsProcessing.EqBand band = eq.getBand(i2);
                band.setEnabled(true);
                com.vk.music.audioeffect.a.a.getClass();
                band.setCutoffFrequency(a.C1320a.b.get(i2).intValue());
                band.setGain(((Number) a.get(i2)).shortValue() / 100.0f);
            }
            dynamicsProcessing.setPreEqAllChannelsTo(eq);
        } catch (Throwable th) {
            broVar2.d("asyncInit", th);
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.e, new Object[]{"DynamicsProcessingWrapper", "Failed to do operation in DynamicsProcessing for audioSessionId=" + broVar2.a + " with " + th});
            }
        }
        return s3q0.a;
    }
}
