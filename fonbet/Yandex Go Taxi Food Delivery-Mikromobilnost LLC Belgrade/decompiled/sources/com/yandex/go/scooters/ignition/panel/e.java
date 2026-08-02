package com.yandex.go.scooters.ignition.panel;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.bq2;
import defpackage.c6z;
import defpackage.f9s;
import defpackage.ly3;
import defpackage.ny61;
import defpackage.urn0;
import defpackage.vrn0;
import defpackage.w511;
import defpackage.yp2;
import defpackage.zrn0;
import defpackage.zuj0;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class e {
    public final zuj0 a;
    public final yp2 b;
    public final ru.yandex.taxi.widget.c c;

    public e(zuj0 zuj0Var, yp2 yp2Var, ru.yandex.taxi.widget.c cVar) {
        this.a = zuj0Var;
        this.b = yp2Var;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ScootersIgnitionExperiment.Ui.ControlPanel.Banner banner, c6z c6zVar, boolean z, Set set, ContinuationImpl continuationImpl) {
        ScootersIgnitionPanelUiStateMapper$mapToBanner$1 scootersIgnitionPanelUiStateMapper$mapToBanner$1;
        int i;
        String str;
        String str2;
        Set set2;
        CharSequence charSequence;
        String str3;
        int i2;
        ScootersIgnitionPanelUiState$Banner$Action scootersIgnitionPanelUiState$Banner$Action;
        ScootersIgnitionPanelUiState$Banner$Action scootersIgnitionPanelUiState$Banner$Action2;
        ScootersIgnitionExperiment.Ui.ControlPanel.Badge badge;
        String str4;
        String str5;
        String str6;
        String str7;
        CharSequence charSequence2;
        ScootersIgnitionExperiment.Ui.ControlPanel.Badge badge2;
        ScootersIgnitionPanelUiState$Banner$Action scootersIgnitionPanelUiState$Banner$Action3;
        String str8;
        ScootersIgnitionExperiment.Ui.ControlPanel.Banner banner2 = banner;
        c6z c6zVar2 = c6zVar;
        boolean z2 = z;
        eVar.getClass();
        if (continuationImpl instanceof ScootersIgnitionPanelUiStateMapper$mapToBanner$1) {
            scootersIgnitionPanelUiStateMapper$mapToBanner$1 = (ScootersIgnitionPanelUiStateMapper$mapToBanner$1) continuationImpl;
            int i3 = scootersIgnitionPanelUiStateMapper$mapToBanner$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionPanelUiStateMapper$mapToBanner$1.label = i3 - Integer.MIN_VALUE;
                ScootersIgnitionPanelUiStateMapper$mapToBanner$1 scootersIgnitionPanelUiStateMapper$mapToBanner$12 = scootersIgnitionPanelUiStateMapper$mapToBanner$1;
                Object obj = scootersIgnitionPanelUiStateMapper$mapToBanner$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionPanelUiStateMapper$mapToBanner$12.label;
                urn0 urn0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (banner2.f == ScootersIgnitionExperiment.Ui.ControlPanel.ActionType.START_RIDE && !z2) {
                        return null;
                    }
                    String str9 = banner2.a;
                    str = banner2.c;
                    ru.yandex.taxi.widget.c cVar = eVar.c;
                    FormattedText e = f9s.e(banner2.b, c6zVar2);
                    scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$0 = banner2;
                    scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$1 = c6zVar2;
                    scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$2 = set;
                    scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$3 = str9;
                    scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$4 = str;
                    scootersIgnitionPanelUiStateMapper$mapToBanner$12.Z$0 = z2;
                    scootersIgnitionPanelUiStateMapper$mapToBanner$12.label = 1;
                    Object e2 = ru.yandex.taxi.widget.c.e(cVar, e, null, false, scootersIgnitionPanelUiStateMapper$mapToBanner$12, 30);
                    if (e2 != coroutineSingletons) {
                        str2 = str9;
                        obj = e2;
                        set2 = set;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    scootersIgnitionPanelUiState$Banner$Action3 = (ScootersIgnitionPanelUiState$Banner$Action) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$8;
                    str6 = (String) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$7;
                    charSequence2 = (CharSequence) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$6;
                    str8 = (String) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$5;
                    str7 = (String) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$4;
                    badge2 = (ScootersIgnitionExperiment.Ui.ControlPanel.Badge) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$3;
                    kotlin.b.b(obj);
                    urn0Var = new urn0((CharSequence) obj, ly3.g(bq2.b, eVar.b, badge2.b));
                    scootersIgnitionPanelUiState$Banner$Action2 = scootersIgnitionPanelUiState$Banner$Action3;
                    charSequence = charSequence2;
                    str = str8;
                    str2 = str7;
                    str3 = str6;
                    str5 = str2;
                    str4 = str3;
                    return new vrn0(str5, str, charSequence, str4, scootersIgnitionPanelUiState$Banner$Action2, urn0Var);
                }
                boolean z3 = scootersIgnitionPanelUiStateMapper$mapToBanner$12.Z$0;
                String str10 = (String) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$4;
                String str11 = (String) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$3;
                set2 = (Set) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$2;
                c6z c6zVar3 = (c6z) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$1;
                ScootersIgnitionExperiment.Ui.ControlPanel.Banner banner3 = (ScootersIgnitionExperiment.Ui.ControlPanel.Banner) scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$0;
                kotlin.b.b(obj);
                str = str10;
                c6zVar2 = c6zVar3;
                str2 = str11;
                z2 = z3;
                banner2 = banner3;
                charSequence = (CharSequence) obj;
                str3 = banner2.e;
                i2 = zrn0.a[banner2.f.ordinal()];
                if (i2 != 1) {
                    scootersIgnitionPanelUiState$Banner$Action = ScootersIgnitionPanelUiState$Banner$Action.PROMOTION;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    scootersIgnitionPanelUiState$Banner$Action = ScootersIgnitionPanelUiState$Banner$Action.START_RIDE;
                }
                scootersIgnitionPanelUiState$Banner$Action2 = scootersIgnitionPanelUiState$Banner$Action;
                badge = banner2.d;
                if (badge != null) {
                    str4 = str3;
                    str5 = str2;
                    return new vrn0(str5, str, charSequence, str4, scootersIgnitionPanelUiState$Banner$Action2, urn0Var);
                }
                if (set2.contains(banner2.a)) {
                    str5 = str2;
                    str4 = str3;
                    return new vrn0(str5, str, charSequence, str4, scootersIgnitionPanelUiState$Banner$Action2, urn0Var);
                }
                ru.yandex.taxi.widget.c cVar2 = eVar.c;
                FormattedText e3 = f9s.e(badge.a, c6zVar2);
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$0 = null;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$1 = null;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$2 = null;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$3 = badge;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$4 = str2;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$5 = str;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$6 = charSequence;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$7 = str3;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.L$8 = scootersIgnitionPanelUiState$Banner$Action2;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.Z$0 = z2;
                scootersIgnitionPanelUiStateMapper$mapToBanner$12.label = 2;
                str6 = str3;
                String str12 = str2;
                Object e4 = ru.yandex.taxi.widget.c.e(cVar2, e3, null, false, scootersIgnitionPanelUiStateMapper$mapToBanner$12, 30);
                if (e4 != coroutineSingletons) {
                    str7 = str12;
                    charSequence2 = charSequence;
                    obj = e4;
                    badge2 = badge;
                    scootersIgnitionPanelUiState$Banner$Action3 = scootersIgnitionPanelUiState$Banner$Action2;
                    str8 = str;
                    urn0Var = new urn0((CharSequence) obj, ly3.g(bq2.b, eVar.b, badge2.b));
                    scootersIgnitionPanelUiState$Banner$Action2 = scootersIgnitionPanelUiState$Banner$Action3;
                    charSequence = charSequence2;
                    str = str8;
                    str2 = str7;
                    str3 = str6;
                    str5 = str2;
                    str4 = str3;
                    return new vrn0(str5, str, charSequence, str4, scootersIgnitionPanelUiState$Banner$Action2, urn0Var);
                }
                return coroutineSingletons;
            }
        }
        scootersIgnitionPanelUiStateMapper$mapToBanner$1 = new ScootersIgnitionPanelUiStateMapper$mapToBanner$1(eVar, continuationImpl);
        ScootersIgnitionPanelUiStateMapper$mapToBanner$1 scootersIgnitionPanelUiStateMapper$mapToBanner$122 = scootersIgnitionPanelUiStateMapper$mapToBanner$1;
        Object obj2 = scootersIgnitionPanelUiStateMapper$mapToBanner$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionPanelUiStateMapper$mapToBanner$122.label;
        urn0 urn0Var2 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        str3 = banner2.e;
        i2 = zrn0.a[banner2.f.ordinal()];
        if (i2 != 1) {
        }
        scootersIgnitionPanelUiState$Banner$Action2 = scootersIgnitionPanelUiState$Banner$Action;
        badge = banner2.d;
        if (badge != null) {
        }
    }
}
