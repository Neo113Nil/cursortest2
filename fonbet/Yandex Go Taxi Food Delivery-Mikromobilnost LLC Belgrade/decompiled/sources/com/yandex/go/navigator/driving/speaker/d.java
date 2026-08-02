package com.yandex.go.navigator.driving.speaker;

import android.speech.tts.TextToSpeech;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.repository.f;
import com.yandex.mapkit.navigation.automotive.Annotator;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.bf50;
import defpackage.bvf0;
import defpackage.dt20;
import defpackage.dvw;
import defpackage.gf50;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.hzw;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kol0;
import defpackage.m450;
import defpackage.mlb0;
import defpackage.my31;
import defpackage.ny61;
import defpackage.oc50;
import defpackage.qc50;
import defpackage.sj11;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vnt0;
import defpackage.x4e;
import defpackage.zvs;
import defpackage.zy11;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class d {
    public final vnt0 a;
    public final bf50 b;
    public final com.yandex.go.navigator.settings.language_settings.b c;
    public final a d;
    public final hzw e;
    public final qc50 f;
    public final f g;
    public final hit h;
    public final tt2 i;
    public gf50 j;
    public final r0 k;
    public final r0 l;
    public final r0 m;

    public d(vnt0 vnt0Var, bf50 bf50Var, com.yandex.go.navigator.settings.language_settings.b bVar, a aVar, hzw hzwVar, qc50 qc50Var, f fVar, oc50 oc50Var, hit hitVar, tt2 tt2Var) {
        this.a = vnt0Var;
        this.b = bf50Var;
        this.c = bVar;
        this.d = aVar;
        this.e = hzwVar;
        this.f = qc50Var;
        this.g = fVar;
        this.h = hitVar;
        this.i = tt2Var;
        r0 c = bvf0.c(0);
        this.k = c;
        r0 c2 = bvf0.c(null);
        this.l = c2;
        this.m = c2;
        tje.N(hitVar.a, null, null, new SpeakerManager$subscribeToNavigationUpdates$$inlined$safeCollectIn$1(e.p(e.l(e.t(new c(qc50Var.b)), bf50Var.j, oc50Var.b, c2, c, new SpeakerManager$subscribeToNavigationUpdates$2(null)), 1000L), null, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(NavigatorLanguageSettingAvailabilityExperiment.Language language, String str, String str2, ContinuationImpl continuationImpl) {
        SpeakerManager$downloadLanguage$1 speakerManager$downloadLanguage$1;
        int i;
        String str3;
        List list;
        Object obj;
        if (continuationImpl instanceof SpeakerManager$downloadLanguage$1) {
            speakerManager$downloadLanguage$1 = (SpeakerManager$downloadLanguage$1) continuationImpl;
            int i2 = speakerManager$downloadLanguage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                speakerManager$downloadLanguage$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = speakerManager$downloadLanguage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = speakerManager$downloadLanguage$1.label;
                r0 r0Var = this.l;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r0Var.l(str2);
                    if (language != null && (list = language.d) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Voice) obj).a, str2)) {
                                break;
                            }
                        }
                        NavigatorLanguageSettingAvailabilityExperiment.Voice voice = (NavigatorLanguageSettingAvailabilityExperiment.Voice) obj;
                        if (voice != null) {
                            str3 = voice.b;
                            speakerManager$downloadLanguage$1.L$0 = null;
                            speakerManager$downloadLanguage$1.L$1 = null;
                            speakerManager$downloadLanguage$1.L$2 = null;
                            speakerManager$downloadLanguage$1.L$3 = null;
                            speakerManager$downloadLanguage$1.label = 1;
                            if (this.c.g(str, str2, str3, speakerManager$downloadLanguage$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    str3 = null;
                    speakerManager$downloadLanguage$1.L$0 = null;
                    speakerManager$downloadLanguage$1.L$1 = null;
                    speakerManager$downloadLanguage$1.L$2 = null;
                    speakerManager$downloadLanguage$1.L$3 = null;
                    speakerManager$downloadLanguage$1.label = 1;
                    if (this.c.g(str, str2, str3, speakerManager$downloadLanguage$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                r0Var.l(null);
                return zy11.a;
            }
        }
        speakerManager$downloadLanguage$1 = new SpeakerManager$downloadLanguage$1(this, continuationImpl);
        Object obj22 = speakerManager$downloadLanguage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = speakerManager$downloadLanguage$1.label;
        r0 r0Var2 = this.l;
        if (i != 0) {
        }
        r0Var2.l(null);
        return zy11.a;
    }

    public final void b(gf50 gf50Var) {
        Navigation b = this.g.b();
        if (b == null) {
            this.j = gf50Var;
            return;
        }
        tt2 tt2Var = this.i;
        hit hitVar = this.h;
        if (gf50Var != null) {
            Annotator annotator = b.getGuidance().getAnnotator();
            if (!annotator.isValid()) {
                hbp0 hbp0Var = hitVar.a;
                tt2Var.getClass();
                tje.N(hbp0Var, uyj.a, null, new SpeakerManager$repeatInit$1(this, null), 2);
                this.j = null;
                return;
            }
            annotator.setSpeaker(gf50Var);
        }
        if (gf50Var instanceof sj11) {
            hbp0 hbp0Var2 = hitVar.a;
            tt2Var.getClass();
            tje.N(hbp0Var2, uyj.a, null, new SpeakerManager$repeatInit$1(this, null), 2);
        } else {
            x4e.z(0, this.k, null);
        }
        this.j = gf50Var;
    }

    public final void c(String str) {
        bf50 bf50Var = this.b;
        if (bf50Var.c.l("navigator.language_assistance_key", null) != null) {
            r0 r0Var = bf50Var.i;
            if (jl40.l(str, r0Var.getValue())) {
                return;
            }
            bf50Var.c.r("navigator.selected_voice_key", str);
            r0Var.l(str);
        }
    }

    public final void d(String str, String str2) {
        x4e.z(0, this.k, null);
        tje.N(this.h.a, null, null, new SpeakerManager$setVoiceToDownloading$1(this, str, str2, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0210, code lost:
    
        if (r3 != r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015f, code lost:
    
        if (r0.a(r7, r2, r1, r5) == r6) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d2, code lost:
    
        if (r3 == r6) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, Continuation continuation) {
        SpeakerManager$setVoiceToDownloadingSuspend$1 speakerManager$setVoiceToDownloadingSuspend$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        a aVar;
        String str3;
        String str4;
        NavigatorLanguageSettingAvailabilityExperiment navigatorLanguageSettingAvailabilityExperiment;
        String str5;
        Iterator it;
        Object obj;
        NavigatorLanguageSettingAvailabilityExperiment.Language language;
        String str6;
        gf50 gf50Var;
        dt20 dt20Var;
        Map map;
        File file;
        d dVar = this;
        String str7 = str;
        String str8 = str2;
        zy11 zy11Var = zy11.a;
        if (continuation instanceof SpeakerManager$setVoiceToDownloadingSuspend$1) {
            speakerManager$setVoiceToDownloadingSuspend$1 = (SpeakerManager$setVoiceToDownloadingSuspend$1) continuation;
            int i2 = speakerManager$setVoiceToDownloadingSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                speakerManager$setVoiceToDownloadingSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = speakerManager$setVoiceToDownloadingSuspend$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = speakerManager$setVoiceToDownloadingSuspend$1.label;
                m450 m450Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gf50 gf50Var2 = dVar.j;
                    m450 m450Var2 = gf50Var2 instanceof m450 ? (m450) gf50Var2 : null;
                    if (m450Var2 == null || !jl40.l(m450Var2.c, str7) || !jl40.l(m450Var2.d, str8)) {
                        qc50 qc50Var = dVar.f;
                        speakerManager$setVoiceToDownloadingSuspend$1.L$0 = str7;
                        speakerManager$setVoiceToDownloadingSuspend$1.L$1 = str8;
                        speakerManager$setVoiceToDownloadingSuspend$1.label = 1;
                        obj2 = qc50Var.a.b(speakerManager$setVoiceToDownloadingSuspend$1);
                    }
                    return zy11Var;
                }
                if (i == 1) {
                    String str9 = (String) speakerManager$setVoiceToDownloadingSuspend$1.L$1;
                    String str10 = (String) speakerManager$setVoiceToDownloadingSuspend$1.L$0;
                    kotlin.b.b(obj2);
                    str8 = str9;
                    str7 = str10;
                } else {
                    if (i == 2) {
                        navigatorLanguageSettingAvailabilityExperiment = (NavigatorLanguageSettingAvailabilityExperiment) speakerManager$setVoiceToDownloadingSuspend$1.L$2;
                        String str11 = (String) speakerManager$setVoiceToDownloadingSuspend$1.L$1;
                        String str12 = (String) speakerManager$setVoiceToDownloadingSuspend$1.L$0;
                        kotlin.b.b(obj2);
                        ((Result) obj2).getClass();
                        str5 = str11;
                        str4 = str12;
                        it = navigatorLanguageSettingAvailabilityExperiment.c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Language) obj).c, str4)) {
                                break;
                            }
                        }
                        language = (NavigatorLanguageSettingAvailabilityExperiment.Language) obj;
                        if (language != null) {
                            str6 = language.b;
                            if (str5 != null) {
                                str6 = str5;
                            }
                            if (dVar.e.a(str4, str6)) {
                                dVar.c(str6);
                                gf50Var = dVar.j;
                                if (gf50Var != null) {
                                }
                                speakerManager$setVoiceToDownloadingSuspend$1.L$0 = null;
                                speakerManager$setVoiceToDownloadingSuspend$1.L$1 = null;
                                speakerManager$setVoiceToDownloadingSuspend$1.L$2 = null;
                                speakerManager$setVoiceToDownloadingSuspend$1.L$3 = null;
                                speakerManager$setVoiceToDownloadingSuspend$1.L$4 = null;
                                speakerManager$setVoiceToDownloadingSuspend$1.L$5 = null;
                                speakerManager$setVoiceToDownloadingSuspend$1.L$6 = dVar;
                                speakerManager$setVoiceToDownloadingSuspend$1.label = 4;
                                kol0 kol0Var = new kol0(dvw.b(speakerManager$setVoiceToDownloadingSuspend$1));
                                final vnt0 vnt0Var = dVar.a;
                                final zvs zvsVar = new zvs(kol0Var, 3);
                                dt20Var = vnt0Var.c;
                                float value = vnt0Var.b.b().getValue();
                                dt20Var.getClass();
                                if (str4 != null) {
                                    my31 my31Var = (my31) dt20Var.c;
                                    my31Var.getClass();
                                    file = new File(my31Var.a.b(str4, str6));
                                    if (!file.exists()) {
                                    }
                                    if (file != null) {
                                    }
                                }
                                if (m450Var == null) {
                                }
                                obj2 = kol0Var.a();
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            } else {
                                if (!jl40.l(dVar.c.e.get(str4 + "/" + str6), Boolean.TRUE)) {
                                    speakerManager$setVoiceToDownloadingSuspend$1.L$0 = str4;
                                    speakerManager$setVoiceToDownloadingSuspend$1.L$1 = null;
                                    speakerManager$setVoiceToDownloadingSuspend$1.L$2 = null;
                                    speakerManager$setVoiceToDownloadingSuspend$1.L$3 = null;
                                    speakerManager$setVoiceToDownloadingSuspend$1.L$4 = null;
                                    speakerManager$setVoiceToDownloadingSuspend$1.L$5 = str6;
                                    speakerManager$setVoiceToDownloadingSuspend$1.label = 3;
                                }
                            }
                        }
                        return zy11Var;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dVar = (d) speakerManager$setVoiceToDownloadingSuspend$1.L$6;
                        kotlin.b.b(obj2);
                        dVar.b((gf50) obj2);
                        return zy11Var;
                    }
                    str6 = (String) speakerManager$setVoiceToDownloadingSuspend$1.L$5;
                    str4 = (String) speakerManager$setVoiceToDownloadingSuspend$1.L$0;
                    kotlin.b.b(obj2);
                    if (jl40.l(dVar.b.a(), str4)) {
                        dVar.c(str6);
                    }
                    gf50Var = dVar.j;
                    if (gf50Var != null) {
                        gf50Var.reset();
                    }
                    speakerManager$setVoiceToDownloadingSuspend$1.L$0 = null;
                    speakerManager$setVoiceToDownloadingSuspend$1.L$1 = null;
                    speakerManager$setVoiceToDownloadingSuspend$1.L$2 = null;
                    speakerManager$setVoiceToDownloadingSuspend$1.L$3 = null;
                    speakerManager$setVoiceToDownloadingSuspend$1.L$4 = null;
                    speakerManager$setVoiceToDownloadingSuspend$1.L$5 = null;
                    speakerManager$setVoiceToDownloadingSuspend$1.L$6 = dVar;
                    speakerManager$setVoiceToDownloadingSuspend$1.label = 4;
                    kol0 kol0Var2 = new kol0(dvw.b(speakerManager$setVoiceToDownloadingSuspend$1));
                    final vnt0 vnt0Var2 = dVar.a;
                    final zvs zvsVar2 = new zvs(kol0Var2, 3);
                    dt20Var = vnt0Var2.c;
                    float value2 = vnt0Var2.b.b().getValue();
                    dt20Var.getClass();
                    if (str4 != null && str6 != null && ((hzw) dt20Var.b).a(str4, str6) && (map = ((a) dt20Var.x).f) != null) {
                        my31 my31Var2 = (my31) dt20Var.c;
                        my31Var2.getClass();
                        file = new File(my31Var2.a.b(str4, str6));
                        if (!file.exists()) {
                            file = null;
                        }
                        if (file != null) {
                            m450Var = new m450(file.getPath(), (mlb0) dt20Var.w, str4, str6, value2, map);
                        }
                    }
                    if (m450Var == null) {
                        jst.e.getClass();
                        zvsVar2.invoke(m450Var);
                    } else {
                        vnt0Var2.f = new TextToSpeech(vnt0Var2.a, new TextToSpeech.OnInitListener() { // from class: unt0
                            @Override // android.speech.tts.TextToSpeech.OnInitListener
                            public final void onInit(int i3) {
                                vnt0 vnt0Var3 = vnt0.this;
                                TextToSpeech textToSpeech = vnt0Var3.f;
                                bf50 bf50Var = vnt0Var3.b;
                                zvs zvsVar3 = zvsVar2;
                                if (textToSpeech == null) {
                                    jst.e.getClass();
                                    zvsVar3.invoke(null);
                                    return;
                                }
                                if (i3 != 0 || vnt0Var3.e.a() == null) {
                                    return;
                                }
                                TextToSpeech textToSpeech2 = vnt0Var3.f;
                                if ((textToSpeech2 != null ? textToSpeech2.isLanguageAvailable(new Locale(bf50Var.a())) : -1) >= 0) {
                                    jst.e.getClass();
                                    rj11 rj11Var = vnt0Var3.d;
                                    float value3 = bf50Var.b().getValue();
                                    rj11Var.getClass();
                                    zvsVar3.invoke(new sj11(textToSpeech, value3));
                                }
                            }
                        });
                    }
                    obj2 = kol0Var2.a();
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                }
                NavigatorLanguageSettingAvailabilityExperiment navigatorLanguageSettingAvailabilityExperiment2 = (NavigatorLanguageSettingAvailabilityExperiment) obj2;
                aVar = dVar.d;
                str3 = navigatorLanguageSettingAvailabilityExperiment2.d;
                speakerManager$setVoiceToDownloadingSuspend$1.L$0 = str7;
                speakerManager$setVoiceToDownloadingSuspend$1.L$1 = str8;
                speakerManager$setVoiceToDownloadingSuspend$1.L$2 = navigatorLanguageSettingAvailabilityExperiment2;
                speakerManager$setVoiceToDownloadingSuspend$1.label = 2;
                if (aVar.b(str3, speakerManager$setVoiceToDownloadingSuspend$1) != coroutineSingletons) {
                    String str13 = str8;
                    str4 = str7;
                    navigatorLanguageSettingAvailabilityExperiment = navigatorLanguageSettingAvailabilityExperiment2;
                    str5 = str13;
                    it = navigatorLanguageSettingAvailabilityExperiment.c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    language = (NavigatorLanguageSettingAvailabilityExperiment.Language) obj;
                    if (language != null) {
                    }
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        speakerManager$setVoiceToDownloadingSuspend$1 = new SpeakerManager$setVoiceToDownloadingSuspend$1(dVar, continuation);
        Object obj22 = speakerManager$setVoiceToDownloadingSuspend$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = speakerManager$setVoiceToDownloadingSuspend$1.label;
        m450 m450Var3 = null;
        if (i != 0) {
        }
        NavigatorLanguageSettingAvailabilityExperiment navigatorLanguageSettingAvailabilityExperiment22 = (NavigatorLanguageSettingAvailabilityExperiment) obj22;
        aVar = dVar.d;
        str3 = navigatorLanguageSettingAvailabilityExperiment22.d;
        speakerManager$setVoiceToDownloadingSuspend$1.L$0 = str7;
        speakerManager$setVoiceToDownloadingSuspend$1.L$1 = str8;
        speakerManager$setVoiceToDownloadingSuspend$1.L$2 = navigatorLanguageSettingAvailabilityExperiment22;
        speakerManager$setVoiceToDownloadingSuspend$1.label = 2;
        if (aVar.b(str3, speakerManager$setVoiceToDownloadingSuspend$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
