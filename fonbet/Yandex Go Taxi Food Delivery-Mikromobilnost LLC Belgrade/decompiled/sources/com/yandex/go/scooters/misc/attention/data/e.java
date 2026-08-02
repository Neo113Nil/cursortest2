package com.yandex.go.scooters.misc.attention.data;

import com.yandex.go.scooters.misc.api.attention.domain.ScootersAttention$Chelka$Style;
import com.yandex.go.scooters.misc.attention.data.model.ScootersAttentionDto;
import defpackage.dzm0;
import defpackage.ezm0;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.rym0;
import defpackage.sym0;
import defpackage.tt2;
import defpackage.tym0;
import defpackage.uym0;
import defpackage.vym0;
import defpackage.w511;
import defpackage.wnt;
import defpackage.wym0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class e implements dzm0 {
    public final wnt a;
    public final tt2 b;
    public final ru.yandex.taxi.widget.c c;
    public final n0 d = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public e(wnt wntVar, tt2 tt2Var, ru.yandex.taxi.widget.c cVar) {
        this.a = wntVar;
        this.b = tt2Var;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ScootersAttentionDto scootersAttentionDto, ContinuationImpl continuationImpl) {
        ScootersAttentionRepositoryImpl$mapScootersAttention$1 scootersAttentionRepositoryImpl$mapScootersAttention$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        uym0 rym0Var;
        String str;
        ScootersAttentionDto.Action.InfoScreenData infoScreenData;
        ScootersAttentionDto.Action action;
        Object e;
        ScootersAttentionDto scootersAttentionDto2;
        CharSequence charSequence;
        ScootersAttentionDto.Action action2;
        uym0 uym0Var;
        int i2;
        ScootersAttention$Chelka$Style scootersAttention$Chelka$Style;
        Object e2;
        ScootersAttentionDto scootersAttentionDto3;
        uym0 uym0Var2;
        ScootersAttention$Chelka$Style scootersAttention$Chelka$Style2;
        String str2;
        eVar.getClass();
        if (continuationImpl instanceof ScootersAttentionRepositoryImpl$mapScootersAttention$1) {
            scootersAttentionRepositoryImpl$mapScootersAttention$1 = (ScootersAttentionRepositoryImpl$mapScootersAttention$1) continuationImpl;
            int i3 = scootersAttentionRepositoryImpl$mapScootersAttention$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersAttentionRepositoryImpl$mapScootersAttention$1.label = i3 - Integer.MIN_VALUE;
                ScootersAttentionRepositoryImpl$mapScootersAttention$1 scootersAttentionRepositoryImpl$mapScootersAttention$12 = scootersAttentionRepositoryImpl$mapScootersAttention$1;
                Object obj = scootersAttentionRepositoryImpl$mapScootersAttention$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersAttentionRepositoryImpl$mapScootersAttention$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (scootersAttentionDto == null) {
                        return wym0.a;
                    }
                    ScootersAttentionDto.Action action3 = scootersAttentionDto.e;
                    if (action3 != null) {
                        ScootersAttentionDto.Action.Type type = action3.a;
                        type.getClass();
                        if (type == ScootersAttentionDto.Action.Type.INFO && (infoScreenData = action3.b) != null) {
                            ru.yandex.taxi.widget.c cVar = eVar.c;
                            FormattedText formattedText = infoScreenData.a;
                            scootersAttentionRepositoryImpl$mapScootersAttention$12.L$0 = null;
                            scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1 = scootersAttentionDto;
                            scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2 = action3;
                            scootersAttentionRepositoryImpl$mapScootersAttention$12.label = 1;
                            Object e3 = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersAttentionRepositoryImpl$mapScootersAttention$12, 30);
                            if (e3 != coroutineSingletons) {
                                action = action3;
                                obj = e3;
                            }
                            return coroutineSingletons;
                        }
                        rym0Var = (type != ScootersAttentionDto.Action.Type.FULLSCREEN || (str = action3.c) == null) ? null : new rym0(str);
                        if (rym0Var != null) {
                        }
                    }
                    uym0Var = tym0.a;
                    String str3 = scootersAttentionDto.a;
                    i2 = ezm0.a[scootersAttentionDto.b.ordinal()];
                    if (i2 != 1) {
                    }
                    ScootersAttention$Chelka$Style scootersAttention$Chelka$Style3 = scootersAttention$Chelka$Style;
                    ru.yandex.taxi.widget.c cVar2 = eVar.c;
                    FormattedText formattedText2 = scootersAttentionDto.c;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$0 = null;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1 = scootersAttentionDto;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2 = uym0Var;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$3 = scootersAttention$Chelka$Style3;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$4 = str3;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.label = 3;
                    e2 = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, scootersAttentionRepositoryImpl$mapScootersAttention$12, 30);
                    if (e2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str4 = (String) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$4;
                        ScootersAttention$Chelka$Style scootersAttention$Chelka$Style4 = (ScootersAttention$Chelka$Style) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$3;
                        uym0 uym0Var3 = (uym0) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2;
                        scootersAttentionDto3 = (ScootersAttentionDto) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1;
                        kotlin.b.b(obj);
                        str2 = str4;
                        scootersAttention$Chelka$Style2 = scootersAttention$Chelka$Style4;
                        uym0Var2 = uym0Var3;
                        return new vym0(str2, scootersAttention$Chelka$Style2, (CharSequence) obj, scootersAttentionDto3.d, uym0Var2);
                    }
                    charSequence = (CharSequence) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$3;
                    action2 = (ScootersAttentionDto.Action) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2;
                    scootersAttentionDto2 = (ScootersAttentionDto) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1;
                    kotlin.b.b(obj);
                    rym0Var = new sym0(charSequence, (CharSequence) obj, action2.b.c);
                    scootersAttentionDto = scootersAttentionDto2;
                    if (rym0Var != null) {
                        uym0Var = rym0Var;
                        String str32 = scootersAttentionDto.a;
                        i2 = ezm0.a[scootersAttentionDto.b.ordinal()];
                        if (i2 != 1) {
                            scootersAttention$Chelka$Style = ScootersAttention$Chelka$Style.PROMO;
                        } else if (i2 == 2) {
                            scootersAttention$Chelka$Style = ScootersAttention$Chelka$Style.INFO;
                        } else {
                            if (i2 != 3) {
                                w511.b();
                                return null;
                            }
                            scootersAttention$Chelka$Style = ScootersAttention$Chelka$Style.ERROR;
                        }
                        ScootersAttention$Chelka$Style scootersAttention$Chelka$Style32 = scootersAttention$Chelka$Style;
                        ru.yandex.taxi.widget.c cVar22 = eVar.c;
                        FormattedText formattedText22 = scootersAttentionDto.c;
                        scootersAttentionRepositoryImpl$mapScootersAttention$12.L$0 = null;
                        scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1 = scootersAttentionDto;
                        scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2 = uym0Var;
                        scootersAttentionRepositoryImpl$mapScootersAttention$12.L$3 = scootersAttention$Chelka$Style32;
                        scootersAttentionRepositoryImpl$mapScootersAttention$12.L$4 = str32;
                        scootersAttentionRepositoryImpl$mapScootersAttention$12.label = 3;
                        e2 = ru.yandex.taxi.widget.c.e(cVar22, formattedText22, null, false, scootersAttentionRepositoryImpl$mapScootersAttention$12, 30);
                        if (e2 != coroutineSingletons) {
                            scootersAttentionDto3 = scootersAttentionDto;
                            uym0Var2 = uym0Var;
                            scootersAttention$Chelka$Style2 = scootersAttention$Chelka$Style32;
                            str2 = str32;
                            obj = e2;
                            return new vym0(str2, scootersAttention$Chelka$Style2, (CharSequence) obj, scootersAttentionDto3.d, uym0Var2);
                        }
                        return coroutineSingletons;
                    }
                    uym0Var = tym0.a;
                    String str322 = scootersAttentionDto.a;
                    i2 = ezm0.a[scootersAttentionDto.b.ordinal()];
                    if (i2 != 1) {
                    }
                    ScootersAttention$Chelka$Style scootersAttention$Chelka$Style322 = scootersAttention$Chelka$Style;
                    ru.yandex.taxi.widget.c cVar222 = eVar.c;
                    FormattedText formattedText222 = scootersAttentionDto.c;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$0 = null;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1 = scootersAttentionDto;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2 = uym0Var;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$3 = scootersAttention$Chelka$Style322;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$4 = str322;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.label = 3;
                    e2 = ru.yandex.taxi.widget.c.e(cVar222, formattedText222, null, false, scootersAttentionRepositoryImpl$mapScootersAttention$12, 30);
                    if (e2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                ScootersAttentionDto.Action action4 = (ScootersAttentionDto.Action) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2;
                ScootersAttentionDto scootersAttentionDto4 = (ScootersAttentionDto) scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1;
                kotlin.b.b(obj);
                action = action4;
                scootersAttentionDto = scootersAttentionDto4;
                CharSequence charSequence2 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar3 = eVar.c;
                FormattedText formattedText3 = action.b.b.a;
                scootersAttentionRepositoryImpl$mapScootersAttention$12.L$0 = null;
                scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1 = scootersAttentionDto;
                scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2 = action;
                scootersAttentionRepositoryImpl$mapScootersAttention$12.L$3 = charSequence2;
                scootersAttentionRepositoryImpl$mapScootersAttention$12.label = 2;
                e = ru.yandex.taxi.widget.c.e(cVar3, formattedText3, null, false, scootersAttentionRepositoryImpl$mapScootersAttention$12, 30);
                if (e != coroutineSingletons) {
                    scootersAttentionDto2 = scootersAttentionDto;
                    charSequence = charSequence2;
                    obj = e;
                    action2 = action;
                    rym0Var = new sym0(charSequence, (CharSequence) obj, action2.b.c);
                    scootersAttentionDto = scootersAttentionDto2;
                    if (rym0Var != null) {
                    }
                    uym0Var = tym0.a;
                    String str3222 = scootersAttentionDto.a;
                    i2 = ezm0.a[scootersAttentionDto.b.ordinal()];
                    if (i2 != 1) {
                    }
                    ScootersAttention$Chelka$Style scootersAttention$Chelka$Style3222 = scootersAttention$Chelka$Style;
                    ru.yandex.taxi.widget.c cVar2222 = eVar.c;
                    FormattedText formattedText2222 = scootersAttentionDto.c;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$0 = null;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$1 = scootersAttentionDto;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$2 = uym0Var;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$3 = scootersAttention$Chelka$Style3222;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.L$4 = str3222;
                    scootersAttentionRepositoryImpl$mapScootersAttention$12.label = 3;
                    e2 = ru.yandex.taxi.widget.c.e(cVar2222, formattedText2222, null, false, scootersAttentionRepositoryImpl$mapScootersAttention$12, 30);
                    if (e2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        scootersAttentionRepositoryImpl$mapScootersAttention$1 = new ScootersAttentionRepositoryImpl$mapScootersAttention$1(eVar, continuationImpl);
        ScootersAttentionRepositoryImpl$mapScootersAttention$1 scootersAttentionRepositoryImpl$mapScootersAttention$122 = scootersAttentionRepositoryImpl$mapScootersAttention$1;
        Object obj2 = scootersAttentionRepositoryImpl$mapScootersAttention$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersAttentionRepositoryImpl$mapScootersAttention$122.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        ru.yandex.taxi.widget.c cVar32 = eVar.c;
        FormattedText formattedText32 = action.b.b.a;
        scootersAttentionRepositoryImpl$mapScootersAttention$122.L$0 = null;
        scootersAttentionRepositoryImpl$mapScootersAttention$122.L$1 = scootersAttentionDto;
        scootersAttentionRepositoryImpl$mapScootersAttention$122.L$2 = action;
        scootersAttentionRepositoryImpl$mapScootersAttention$122.L$3 = charSequence22;
        scootersAttentionRepositoryImpl$mapScootersAttention$122.label = 2;
        e = ru.yandex.taxi.widget.c.e(cVar32, formattedText32, null, false, scootersAttentionRepositoryImpl$mapScootersAttention$122, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
