package com.yandex.go.scooters.mosru.mapper;

import com.adjust.sdk.Constants;
import com.yandex.go.scooters.mosru.data.model.ScootersMosRuStateInfoPanelDto;
import com.yandex.go.scooters.mosru.data.model.ScootersMosRuStateModalWindowDto;
import com.yandex.go.scooters.mosru.data.model.ScootersMosRuStateResponse;
import com.yandex.go.scooters.mosru.data.model.ScootersMosRusStateAuthorizationDto;
import defpackage.d0o0;
import defpackage.e0o0;
import defpackage.ny61;
import defpackage.qzn0;
import defpackage.rzn0;
import defpackage.s6k0;
import defpackage.szn0;
import defpackage.tzn0;
import defpackage.uzn0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class a {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static s6k0 b(ScootersMosRuStateModalWindowDto.ScootersMosRuStateActionItemDto scootersMosRuStateActionItemDto) {
        String str;
        FormattedText formattedText = scootersMosRuStateActionItemDto.a;
        FormattedText formattedText2 = scootersMosRuStateActionItemDto.b;
        ScootersMosRuStateModalWindowDto.ScootersMosRuStateActionItemDto.ScootersMosRuStateActionItemActionDto scootersMosRuStateActionItemActionDto = scootersMosRuStateActionItemDto.c;
        String str2 = scootersMosRuStateActionItemActionDto.a;
        Object obj = null;
        switch (str2.hashCode()) {
            case -1385570183:
                if (str2.equals("authorization")) {
                    obj = rzn0.a;
                    break;
                }
                break;
            case 94756344:
                if (str2.equals("close")) {
                    obj = szn0.a;
                    break;
                }
                break;
            case 629233382:
                if (str2.equals(Constants.DEEPLINK)) {
                    String str3 = scootersMosRuStateActionItemActionDto.d;
                    if (str3 == null) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        obj = new tzn0(str3);
                        break;
                    }
                }
                break;
            case 1223731894:
                if (str2.equals("web_app") && (str = scootersMosRuStateActionItemActionDto.b) != null) {
                    obj = new uzn0(str);
                    break;
                }
                break;
        }
        return new s6k0(formattedText, formattedText2, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersMosRuStateResponse scootersMosRuStateResponse, ContinuationImpl continuationImpl) {
        ScootersMosRuStateMapper$mapState$1 scootersMosRuStateMapper$mapState$1;
        int i;
        d0o0 d0o0Var;
        e0o0 e0o0Var;
        e0o0 e0o0Var2;
        String str;
        Boolean bool;
        if (continuationImpl instanceof ScootersMosRuStateMapper$mapState$1) {
            scootersMosRuStateMapper$mapState$1 = (ScootersMosRuStateMapper$mapState$1) continuationImpl;
            int i2 = scootersMosRuStateMapper$mapState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuStateMapper$mapState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuStateMapper$mapState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuStateMapper$mapState$1.label;
                if (i != 0) {
                    b.b(obj);
                    ScootersMosRuStateModalWindowDto scootersMosRuStateModalWindowDto = scootersMosRuStateResponse.a;
                    if (scootersMosRuStateModalWindowDto == null) {
                        return null;
                    }
                    ScootersMosRuStateInfoPanelDto scootersMosRuStateInfoPanelDto = scootersMosRuStateResponse.b;
                    String str2 = scootersMosRuStateModalWindowDto.e;
                    String str3 = scootersMosRuStateModalWindowDto.a;
                    FormattedText formattedText = scootersMosRuStateModalWindowDto.b;
                    FormattedText formattedText2 = scootersMosRuStateModalWindowDto.c;
                    FormattedText formattedText3 = scootersMosRuStateModalWindowDto.d;
                    s6k0 b = b(scootersMosRuStateModalWindowDto.f);
                    ScootersMosRuStateModalWindowDto.ScootersMosRuStateActionItemDto scootersMosRuStateActionItemDto = scootersMosRuStateModalWindowDto.g;
                    e0o0 e0o0Var3 = new e0o0(formattedText, formattedText2, formattedText3, b, scootersMosRuStateActionItemDto != null ? b(scootersMosRuStateActionItemDto) : null, str2, str3);
                    if (scootersMosRuStateInfoPanelDto == null) {
                        d0o0Var = null;
                        e0o0Var = e0o0Var3;
                        Integer num = scootersMosRuStateResponse.c;
                        ScootersMosRusStateAuthorizationDto scootersMosRusStateAuthorizationDto = scootersMosRuStateResponse.d;
                        str = scootersMosRusStateAuthorizationDto != null ? scootersMosRusStateAuthorizationDto.a : null;
                        if (str == null) {
                            str = "";
                        }
                        return new qzn0(e0o0Var, d0o0Var, num, str, (scootersMosRusStateAuthorizationDto != null || (bool = scootersMosRusStateAuthorizationDto.b) == null) ? false : bool.booleanValue());
                    }
                    scootersMosRuStateMapper$mapState$1.L$0 = scootersMosRuStateResponse;
                    scootersMosRuStateMapper$mapState$1.L$1 = null;
                    scootersMosRuStateMapper$mapState$1.L$2 = null;
                    scootersMosRuStateMapper$mapState$1.L$3 = null;
                    scootersMosRuStateMapper$mapState$1.L$4 = e0o0Var3;
                    scootersMosRuStateMapper$mapState$1.label = 1;
                    obj = c(scootersMosRuStateInfoPanelDto, scootersMosRuStateMapper$mapState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    e0o0Var2 = e0o0Var3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e0o0Var2 = (e0o0) scootersMosRuStateMapper$mapState$1.L$4;
                    scootersMosRuStateResponse = (ScootersMosRuStateResponse) scootersMosRuStateMapper$mapState$1.L$0;
                    b.b(obj);
                }
                e0o0Var = e0o0Var2;
                d0o0Var = (d0o0) obj;
                Integer num2 = scootersMosRuStateResponse.c;
                ScootersMosRusStateAuthorizationDto scootersMosRusStateAuthorizationDto2 = scootersMosRuStateResponse.d;
                if (scootersMosRusStateAuthorizationDto2 != null) {
                }
                if (str == null) {
                }
                return new qzn0(e0o0Var, d0o0Var, num2, str, (scootersMosRusStateAuthorizationDto2 != null || (bool = scootersMosRusStateAuthorizationDto2.b) == null) ? false : bool.booleanValue());
            }
        }
        scootersMosRuStateMapper$mapState$1 = new ScootersMosRuStateMapper$mapState$1(this, continuationImpl);
        Object obj3 = scootersMosRuStateMapper$mapState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuStateMapper$mapState$1.label;
        if (i != 0) {
        }
        e0o0Var = e0o0Var2;
        d0o0Var = (d0o0) obj3;
        Integer num22 = scootersMosRuStateResponse.c;
        ScootersMosRusStateAuthorizationDto scootersMosRusStateAuthorizationDto22 = scootersMosRuStateResponse.d;
        if (scootersMosRusStateAuthorizationDto22 != null) {
        }
        if (str == null) {
        }
        return new qzn0(e0o0Var, d0o0Var, num22, str, (scootersMosRusStateAuthorizationDto22 != null || (bool = scootersMosRusStateAuthorizationDto22.b) == null) ? false : bool.booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ScootersMosRuStateInfoPanelDto scootersMosRuStateInfoPanelDto, ContinuationImpl continuationImpl) {
        ScootersMosRuStateMapper$mapStateInfoPanel$1 scootersMosRuStateMapper$mapStateInfoPanel$1;
        int i;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        if (continuationImpl instanceof ScootersMosRuStateMapper$mapStateInfoPanel$1) {
            scootersMosRuStateMapper$mapStateInfoPanel$1 = (ScootersMosRuStateMapper$mapStateInfoPanel$1) continuationImpl;
            int i2 = scootersMosRuStateMapper$mapStateInfoPanel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuStateMapper$mapStateInfoPanel$1.label = i2 - Integer.MIN_VALUE;
                ScootersMosRuStateMapper$mapStateInfoPanel$1 scootersMosRuStateMapper$mapStateInfoPanel$12 = scootersMosRuStateMapper$mapStateInfoPanel$1;
                Object obj = scootersMosRuStateMapper$mapStateInfoPanel$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuStateMapper$mapStateInfoPanel$12.label;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    b.b(obj);
                    FormattedText formattedText2 = scootersMosRuStateInfoPanelDto.a;
                    scootersMosRuStateMapper$mapStateInfoPanel$12.L$0 = scootersMosRuStateInfoPanelDto;
                    scootersMosRuStateMapper$mapStateInfoPanel$12.label = 1;
                    obj = c.e(this.a, formattedText2, null, false, scootersMosRuStateMapper$mapStateInfoPanel$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) scootersMosRuStateMapper$mapStateInfoPanel$12.L$2;
                        scootersMosRuStateInfoPanelDto = (ScootersMosRuStateInfoPanelDto) scootersMosRuStateMapper$mapStateInfoPanel$12.L$0;
                        b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        String str = scootersMosRuStateInfoPanelDto.c.a;
                        return new d0o0(charSequence, charSequence3);
                    }
                    scootersMosRuStateInfoPanelDto = (ScootersMosRuStateInfoPanelDto) scootersMosRuStateMapper$mapStateInfoPanel$12.L$0;
                    b.b(obj);
                }
                charSequence = (CharSequence) obj;
                formattedText = scootersMosRuStateInfoPanelDto.b;
                if (formattedText != null) {
                    scootersMosRuStateMapper$mapStateInfoPanel$12.L$0 = scootersMosRuStateInfoPanelDto;
                    scootersMosRuStateMapper$mapStateInfoPanel$12.L$1 = null;
                    scootersMosRuStateMapper$mapStateInfoPanel$12.L$2 = charSequence;
                    scootersMosRuStateMapper$mapStateInfoPanel$12.label = 2;
                    Object e = c.e(this.a, formattedText, null, false, scootersMosRuStateMapper$mapStateInfoPanel$12, 30);
                    if (e != coroutineSingletons) {
                        obj = e;
                        charSequence2 = charSequence;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                    }
                    return coroutineSingletons;
                }
                String str2 = scootersMosRuStateInfoPanelDto.c.a;
                return new d0o0(charSequence, charSequence3);
            }
        }
        scootersMosRuStateMapper$mapStateInfoPanel$1 = new ScootersMosRuStateMapper$mapStateInfoPanel$1(this, continuationImpl);
        ScootersMosRuStateMapper$mapStateInfoPanel$1 scootersMosRuStateMapper$mapStateInfoPanel$122 = scootersMosRuStateMapper$mapStateInfoPanel$1;
        Object obj2 = scootersMosRuStateMapper$mapStateInfoPanel$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuStateMapper$mapStateInfoPanel$122.label;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = scootersMosRuStateInfoPanelDto.b;
        if (formattedText != null) {
        }
        String str22 = scootersMosRuStateInfoPanelDto.c.a;
        return new d0o0(charSequence, charSequence32);
    }
}
