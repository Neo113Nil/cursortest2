package com.yandex.go.navigator.settings.voice_settings;

import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import defpackage.avj0;
import defpackage.b5r0;
import defpackage.bms;
import defpackage.d6r0;
import defpackage.d6z;
import defpackage.ebr0;
import defpackage.f5r0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.wp01;
import defpackage.xng0;
import defpackage.y27;
import defpackage.z95;
import defpackage.zjy0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "selectedVoiceId", "Lcom/yandex/go/navigator/experiment/NavigatorLanguageSettingAvailabilityExperiment;", "exp", "downloadingVoiceId", "Ld6r0;", "<anonymous>", "(Ljava/lang/String;Lcom/yandex/go/navigator/experiment/NavigatorLanguageSettingAvailabilityExperiment;Ljava/lang/String;)Ld6r0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.voice_settings.VoiceSettingsPresenter$attachView$2", f = "VoiceSettingsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class VoiceSettingsPresenter$attachView$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSettingsPresenter$attachView$2(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        VoiceSettingsPresenter$attachView$2 voiceSettingsPresenter$attachView$2 = new VoiceSettingsPresenter$attachView$2(this.this$0, (Continuation) obj4);
        voiceSettingsPresenter$attachView$2.L$0 = (String) obj;
        voiceSettingsPresenter$attachView$2.L$1 = (NavigatorLanguageSettingAvailabilityExperiment) obj2;
        voiceSettingsPresenter$attachView$2.L$2 = (String) obj3;
        return voiceSettingsPresenter$attachView$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str = (String) this.L$0;
        NavigatorLanguageSettingAvailabilityExperiment navigatorLanguageSettingAvailabilityExperiment = (NavigatorLanguageSettingAvailabilityExperiment) this.L$1;
        String str2 = (String) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        ListBuilder listBuilder = cVar.K;
        NavigatorLanguageSettingAvailabilityExperiment.Language language = cVar.F;
        if (listBuilder == null) {
            ListBuilder a = rcc.a();
            Iterator it = language.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Voice) obj2).a, str)) {
                    break;
                }
            }
            NavigatorLanguageSettingAvailabilityExperiment.Voice voice = (NavigatorLanguageSettingAvailabilityExperiment.Voice) obj2;
            if (voice != null) {
                a.add(voice);
            }
            List list = language.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (!jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Voice) obj3).a, str)) {
                    arrayList.add(obj3);
                }
            }
            a.addAll(arrayList);
            cVar.K = a.j();
        }
        c cVar2 = this.this$0;
        Iterable iterable = cVar2.K;
        if (iterable == null) {
            iterable = cVar2.F.d;
        }
        ebr0 ebr0Var = (ebr0) cVar2.Dg();
        avj0 avj0Var = cVar2.D;
        ebr0Var.Y3(new y27(avj0Var.h(kyh0.common_back), true, xng0.controlMinor, xng0.textMain, new VoiceSettingsPresenter$updateButtons$1(0, cVar2.J, z95.class, "back", "back()V", 0)), new y27(avj0Var.h(kyh0.trusted_contacts_save_and_close_action), new VoiceSettingsPresenter$updateButtons$2(0, cVar2, c.class, "saveAndClose", "saveAndClose()V", 0), 12));
        Iterable iterable2 = iterable;
        c cVar3 = this.this$0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : iterable2) {
            if (cVar3.E.a(cVar3.F.c, ((NavigatorLanguageSettingAvailabilityExperiment.Voice) obj4).a)) {
                arrayList2.add(obj4);
            }
        }
        c cVar4 = this.this$0;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            NavigatorLanguageSettingAvailabilityExperiment.Voice voice2 = (NavigatorLanguageSettingAvailabilityExperiment.Voice) next;
            arrayList3.add(new b5r0(voice2.a, d6z.Y(navigatorLanguageSettingAvailabilityExperiment, voice2.c), jl40.l(str, voice2.a), i != 0, new zjy0(21, cVar4, voice2, cVar4.F.c)));
            i = i2;
        }
        c cVar5 = this.this$0;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : iterable2) {
            if (!cVar5.E.a(cVar5.F.c, ((NavigatorLanguageSettingAvailabilityExperiment.Voice) obj5).a)) {
                arrayList4.add(obj5);
            }
        }
        c cVar6 = this.this$0;
        ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            NavigatorLanguageSettingAvailabilityExperiment.Voice voice3 = (NavigatorLanguageSettingAvailabilityExperiment.Voice) next2;
            arrayList5.add(new f5r0(voice3.a, d6z.Y(navigatorLanguageSettingAvailabilityExperiment, voice3.c), jl40.l(str2, voice3.a), (arrayList3.isEmpty() && i3 == 0) ? false : true, new wp01(5, cVar6, voice3, cVar6.F.c)));
            i3 = i4;
        }
        ListBuilder a2 = rcc.a();
        a2.addAll(arrayList3);
        a2.addAll(arrayList5);
        return new d6r0(a2.j(), this.this$0.G.getThemeType());
    }
}
