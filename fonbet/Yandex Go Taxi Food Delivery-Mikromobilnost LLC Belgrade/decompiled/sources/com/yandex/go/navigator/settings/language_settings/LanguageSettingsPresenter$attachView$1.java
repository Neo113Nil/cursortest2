package com.yandex.go.navigator.settings.language_settings;

import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import defpackage.avj0;
import defpackage.b5r0;
import defpackage.d6r0;
import defpackage.ebr0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.vrx;
import defpackage.xng0;
import defpackage.y27;
import defpackage.ynn;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectedLocale", "Lcom/yandex/go/navigator/experiment/NavigatorLanguageSettingAvailabilityExperiment;", "exp", "Ld6r0;", "<anonymous>", "(Ljava/lang/String;Lcom/yandex/go/navigator/experiment/NavigatorLanguageSettingAvailabilityExperiment;)Ld6r0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.language_settings.LanguageSettingsPresenter$attachView$1", f = "LanguageSettingsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LanguageSettingsPresenter$attachView$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSettingsPresenter$attachView$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LanguageSettingsPresenter$attachView$1 languageSettingsPresenter$attachView$1 = new LanguageSettingsPresenter$attachView$1(this.this$0, (Continuation) obj3);
        languageSettingsPresenter$attachView$1.L$0 = (String) obj;
        languageSettingsPresenter$attachView$1.L$1 = (NavigatorLanguageSettingAvailabilityExperiment) obj2;
        return languageSettingsPresenter$attachView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ebr0 ebr0Var;
        y27 y27Var;
        sls languageSettingsPresenter$updateButtons$3;
        List list;
        String str = (String) this.L$0;
        NavigatorLanguageSettingAvailabilityExperiment navigatorLanguageSettingAvailabilityExperiment = (NavigatorLanguageSettingAvailabilityExperiment) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list2 = navigatorLanguageSettingAvailabilityExperiment.c;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Language) obj2).c, str)) {
                break;
            }
        }
        NavigatorLanguageSettingAvailabilityExperiment.Language language = (NavigatorLanguageSettingAvailabilityExperiment.Language) obj2;
        a aVar = this.this$0;
        if (aVar.J == null) {
            ListBuilder a = rcc.a();
            if (language != null) {
                a.add(language);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (!jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Language) obj3).c, str)) {
                    arrayList.add(obj3);
                }
            }
            a.addAll(arrayList);
            aVar.J = a.j();
        }
        a aVar2 = this.this$0;
        avj0 avj0Var = aVar2.C;
        boolean z = ((language == null || (list = language.d) == null) ? 1 : list.size()) > 1;
        int i = z ? kyh0.navigator_settings_language_assistance_select_voice : kyh0.trusted_contacts_save_and_close_action;
        ebr0 ebr0Var2 = (ebr0) aVar2.Dg();
        y27 y27Var2 = new y27(avj0Var.h(kyh0.common_back), true, xng0.controlMinor, xng0.textMain, new LanguageSettingsPresenter$updateButtons$1(0, aVar2.F, vrx.class, "back", "back()V", 0));
        String h = avj0Var.h(i);
        int i2 = xng0.textOnControl;
        int i3 = xng0.controlMain;
        if (z) {
            ebr0Var = ebr0Var2;
            y27Var = y27Var2;
            languageSettingsPresenter$updateButtons$3 = new LanguageSettingsPresenter$updateButtons$2(0, aVar2, a.class, "openVoiceSettings", "openVoiceSettings()V", 0);
        } else {
            ebr0Var = ebr0Var2;
            y27Var = y27Var2;
            languageSettingsPresenter$updateButtons$3 = new LanguageSettingsPresenter$updateButtons$3(0, aVar2.F, vrx.class, "closeSettings", "closeSettings()V", 0);
        }
        ebr0Var.Y3(y27Var, new y27(h, true, i3, i2, languageSettingsPresenter$updateButtons$3));
        a aVar3 = this.this$0;
        ListBuilder listBuilder = aVar3.J;
        if (listBuilder != null) {
            list2 = listBuilder;
        }
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        int i4 = 0;
        for (Object obj4 : list3) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                scc.m();
                throw null;
            }
            NavigatorLanguageSettingAvailabilityExperiment.Language language2 = (NavigatorLanguageSettingAvailabilityExperiment.Language) obj4;
            String a2 = aVar3.H.a(navigatorLanguageSettingAvailabilityExperiment, language2);
            String str2 = language2.c;
            arrayList2.add(new b5r0(str2, a2, jl40.l(str, str2), i4 != 0, new ynn(16, aVar3, str, language2)));
            i4 = i5;
        }
        return new d6r0(arrayList2, this.this$0.I.getThemeType());
    }
}
