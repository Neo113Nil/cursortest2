package com.yandex.go.navigator.settings.voice_settings;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c b;

    public b(r0 r0Var, c cVar) {
        this.a = r0Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        VoiceSettingsPresenter$attachView$$inlined$map$1$1 voiceSettingsPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof VoiceSettingsPresenter$attachView$$inlined$map$1$1) {
            voiceSettingsPresenter$attachView$$inlined$map$1$1 = (VoiceSettingsPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = voiceSettingsPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voiceSettingsPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = voiceSettingsPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = voiceSettingsPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    voiceSettingsPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    voiceSettingsPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    voiceSettingsPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    voiceSettingsPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, voiceSettingsPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        voiceSettingsPresenter$attachView$$inlined$map$1$1 = new VoiceSettingsPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = voiceSettingsPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = voiceSettingsPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
