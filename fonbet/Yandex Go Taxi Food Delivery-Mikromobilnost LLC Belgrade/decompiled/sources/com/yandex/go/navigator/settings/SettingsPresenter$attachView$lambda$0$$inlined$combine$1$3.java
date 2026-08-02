package com.yandex.go.navigator.settings;

import com.yandex.go.navigator.analitycs.NavigationAnalytics$SettingsChangeType;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.repository.SoundMode;
import com.yandex.go.navigator.repository.VoiceMode;
import com.yandex.go.navigator.settings.c;
import defpackage.a5r0;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.bf50;
import defpackage.c5r0;
import defpackage.d5r0;
import defpackage.d6r0;
import defpackage.d6z;
import defpackage.e5r0;
import defpackage.ebr0;
import defpackage.hdr0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.nao0;
import defpackage.ny6;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.sls;
import defpackage.v2h0;
import defpackage.vpr;
import defpackage.wr21;
import defpackage.xng0;
import defpackage.z4r0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.SettingsPresenter$attachView$lambda$0$$inlined$combine$1$3", f = "SettingsPresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class SettingsPresenter$attachView$lambda$0$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPresenter$attachView$lambda$0$$inlined$combine$1$3(Continuation continuation, c cVar) {
        super(3, continuation);
        this.receiver$inlined = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SettingsPresenter$attachView$lambda$0$$inlined$combine$1$3 settingsPresenter$attachView$lambda$0$$inlined$combine$1$3 = new SettingsPresenter$attachView$lambda$0$$inlined$combine$1$3((Continuation) obj3, this.receiver$inlined);
        settingsPresenter$attachView$lambda$0$$inlined$combine$1$3.L$0 = (vpr) obj;
        settingsPresenter$attachView$lambda$0$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return settingsPresenter$attachView$lambda$0$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        NavigatorLanguageSettingAvailabilityExperiment.Voice voice;
        String str;
        String str2;
        List list;
        Object obj3;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Object obj4 = objArr[0];
        Object obj5 = objArr[1];
        Object obj6 = objArr[2];
        Object obj7 = objArr[3];
        Object obj8 = objArr[4];
        Object obj9 = objArr[5];
        Object obj10 = objArr[6];
        wr21 wr21Var = (wr21) objArr[7];
        NavigatorLanguageSettingAvailabilityExperiment navigatorLanguageSettingAvailabilityExperiment = (NavigatorLanguageSettingAvailabilityExperiment) obj10;
        final boolean booleanValue = ((Boolean) obj9).booleanValue();
        final boolean booleanValue2 = ((Boolean) obj8).booleanValue();
        String str3 = (String) obj7;
        String str4 = (String) obj6;
        SoundMode soundMode = (SoundMode) obj5;
        VoiceMode voiceMode = (VoiceMode) obj4;
        final c cVar = this.receiver$inlined;
        avj0 avj0Var = cVar.E;
        boolean z = wr21Var.a;
        String str5 = wr21Var.e;
        e5r0 e5r0Var = (!z || str5.length() <= 0) ? null : new e5r0(str5, wr21Var.b, Integer.valueOf(v2h0.ic_new_years_user_placemark_toggle), true, new nao0(27, cVar, wr21Var));
        a5r0 a5r0Var = new a5r0(kyh0.navigator_settings_voice_title, new SettingsPresenter$updateSettings$voiceSettings$1(1, cVar.B, bf50.class, "setVoiceSettingSelectedId", "setVoiceSettingSelectedId(Ljava/lang/String;)V", 0), voiceMode.getId(), cVar.K);
        a5r0 a5r0Var2 = new a5r0(kyh0.navigator_settings_sound_title, new SettingsPresenter$updateSettings$soundSettings$1(1, cVar.B, bf50.class, "setSoundSettingSelectedId", "setSoundSettingSelectedId(Ljava/lang/String;)V", 0), soundMode.getId(), cVar.L);
        final int i2 = 0;
        e5r0 e5r0Var2 = new e5r0(avj0Var.h(kyh0.navigator_settings_avoid_toll_roads_title), booleanValue2, Integer.valueOf(v2h0.ic_toll_roads), false, new sls() { // from class: vbr0
            @Override // defpackage.sls
            public final Object invoke() {
                boolean z2;
                r0 r0Var;
                int i3 = i2;
                zy11 zy11Var2 = zy11.a;
                boolean z3 = booleanValue2;
                c cVar2 = cVar;
                switch (i3) {
                    case 0:
                        bf50 bf50Var = cVar2.B;
                        z2 = !z3;
                        bf50Var.c.u("navigator.avoid_toll_roads", z2);
                        r6r0 r6r0Var = bf50Var.a;
                        NavigationAnalytics$SettingsChangeType navigationAnalytics$SettingsChangeType = NavigationAnalytics$SettingsChangeType.On;
                        if (z3) {
                            navigationAnalytics$SettingsChangeType = null;
                        }
                        if (navigationAnalytics$SettingsChangeType == null) {
                            navigationAnalytics$SettingsChangeType = NavigationAnalytics$SettingsChangeType.Off;
                        }
                        i650 i650Var = r6r0Var.a;
                        HashMap u = n.u(i650Var);
                        u.put("chosen_option", navigationAnalytics$SettingsChangeType.getEventValue());
                        i650Var.a.a("navigation.settings.change.avoid_toll_roads", u, 1, new HashMap());
                        r0Var = bf50Var.f;
                        break;
                    default:
                        bf50 bf50Var2 = cVar2.B;
                        z2 = !z3;
                        bf50Var2.c.u("navigator.avoid_unpaved_roads", z2);
                        r6r0 r6r0Var2 = bf50Var2.a;
                        NavigationAnalytics$SettingsChangeType navigationAnalytics$SettingsChangeType2 = NavigationAnalytics$SettingsChangeType.On;
                        if (z3) {
                            navigationAnalytics$SettingsChangeType2 = null;
                        }
                        if (navigationAnalytics$SettingsChangeType2 == null) {
                            navigationAnalytics$SettingsChangeType2 = NavigationAnalytics$SettingsChangeType.Off;
                        }
                        i650 i650Var2 = r6r0Var2.a;
                        HashMap u2 = n.u(i650Var2);
                        u2.put("chosen_option", navigationAnalytics$SettingsChangeType2.getEventValue());
                        i650Var2.a.a("navigation.settings.change.avoid_unpaved_routes", u2, 1, new HashMap());
                        r0Var = bf50Var2.g;
                        break;
                }
                qv10.B(z2, r0Var, null);
                return zy11Var2;
            }
        });
        final int i3 = 1;
        e5r0 e5r0Var3 = new e5r0(avj0Var.h(kyh0.navigator_settings_avoid_unpaved_roads_title), booleanValue, Integer.valueOf(v2h0.ic_unpaved_roads), true, new sls() { // from class: vbr0
            @Override // defpackage.sls
            public final Object invoke() {
                boolean z2;
                r0 r0Var;
                int i32 = i3;
                zy11 zy11Var2 = zy11.a;
                boolean z3 = booleanValue;
                c cVar2 = cVar;
                switch (i32) {
                    case 0:
                        bf50 bf50Var = cVar2.B;
                        z2 = !z3;
                        bf50Var.c.u("navigator.avoid_toll_roads", z2);
                        r6r0 r6r0Var = bf50Var.a;
                        NavigationAnalytics$SettingsChangeType navigationAnalytics$SettingsChangeType = NavigationAnalytics$SettingsChangeType.On;
                        if (z3) {
                            navigationAnalytics$SettingsChangeType = null;
                        }
                        if (navigationAnalytics$SettingsChangeType == null) {
                            navigationAnalytics$SettingsChangeType = NavigationAnalytics$SettingsChangeType.Off;
                        }
                        i650 i650Var = r6r0Var.a;
                        HashMap u = n.u(i650Var);
                        u.put("chosen_option", navigationAnalytics$SettingsChangeType.getEventValue());
                        i650Var.a.a("navigation.settings.change.avoid_toll_roads", u, 1, new HashMap());
                        r0Var = bf50Var.f;
                        break;
                    default:
                        bf50 bf50Var2 = cVar2.B;
                        z2 = !z3;
                        bf50Var2.c.u("navigator.avoid_unpaved_roads", z2);
                        r6r0 r6r0Var2 = bf50Var2.a;
                        NavigationAnalytics$SettingsChangeType navigationAnalytics$SettingsChangeType2 = NavigationAnalytics$SettingsChangeType.On;
                        if (z3) {
                            navigationAnalytics$SettingsChangeType2 = null;
                        }
                        if (navigationAnalytics$SettingsChangeType2 == null) {
                            navigationAnalytics$SettingsChangeType2 = NavigationAnalytics$SettingsChangeType.Off;
                        }
                        i650 i650Var2 = r6r0Var2.a;
                        HashMap u2 = n.u(i650Var2);
                        u2.put("chosen_option", navigationAnalytics$SettingsChangeType2.getEventValue());
                        i650Var2.a.a("navigation.settings.change.avoid_unpaved_routes", u2, 1, new HashMap());
                        r0Var = bf50Var2.g;
                        break;
                }
                qv10.B(z2, r0Var, null);
                return zy11Var2;
            }
        });
        cVar.C.i();
        ListBuilder a = rcc.a();
        if (e5r0Var != null) {
            a.add(e5r0Var);
        }
        a.add(a5r0Var);
        c5r0 c5r0Var = c5r0.a;
        a.add(c5r0Var);
        a.add(a5r0Var2);
        a.add(c5r0Var);
        if (navigatorLanguageSettingAvailabilityExperiment.b) {
            Iterator it = navigatorLanguageSettingAvailabilityExperiment.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Language) obj2).c, str4)) {
                    break;
                }
            }
            NavigatorLanguageSettingAvailabilityExperiment.Language language = (NavigatorLanguageSettingAvailabilityExperiment.Language) obj2;
            String a2 = cVar.G.a(navigatorLanguageSettingAvailabilityExperiment, language);
            if (language == null || (list = language.d) == null || list.size() <= 1) {
                voice = null;
            } else {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Voice) obj3).a, str3 == null ? language.b : str3)) {
                        break;
                    }
                }
                voice = (NavigatorLanguageSettingAvailabilityExperiment.Voice) obj3;
            }
            String Y = (voice == null || (str2 = voice.c) == null) ? null : d6z.Y(navigatorLanguageSettingAvailabilityExperiment, str2);
            if (Y == null) {
                Y = "";
            }
            if (a2.length() == 0) {
                str = "";
            } else {
                if (Y.length() != 0) {
                    a2 = avj0Var.i(kyh0.navigator_selected_guidance_audio_template, a2, Y);
                }
                str = a2;
            }
            a.add(new z4r0(avj0Var.h(kyh0.navigator_guidance_audio), str, Collections.singletonList(new ny6(new bdc(xng0.controlMinor), avj0Var.h(kyh0.common_edit), new bdc(xng0.textMain), new SettingsPresenter$configureGuidanceAudioButton$1(0, cVar.D, hdr0.class, "openLanguageSetting", "openLanguageSetting()V", 0))), new SettingsPresenter$configureGuidanceAudioButton$2(0, cVar.D, hdr0.class, "openLanguageSetting", "openLanguageSetting()V", 0), Integer.valueOf(v2h0.ic_planet)));
            a.add(new d5r0(kyh0.navigator_settings_routes_settings_title));
        }
        a.add(e5r0Var2);
        a.add(e5r0Var3);
        if (cVar.I.a.isEnabled()) {
            a.add(new z4r0("Simulation settings", "", Collections.singletonList(new ny6(new bdc(xng0.controlMinor), "Open", new bdc(xng0.textMain), new SettingsPresenter$configureDebugPanelButton$1(0, cVar.D, hdr0.class, "openDebugPanel", "openDebugPanel()V", 0))), new SettingsPresenter$configureDebugPanelButton$2(0, cVar.D, hdr0.class, "openDebugPanel", "openDebugPanel()V", 0), Integer.valueOf(v2h0.ic_settings_button)));
        }
        ((ebr0) cVar.Dg()).render(new d6r0(a.j(), cVar.J.getThemeType()));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        return vprVar.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
