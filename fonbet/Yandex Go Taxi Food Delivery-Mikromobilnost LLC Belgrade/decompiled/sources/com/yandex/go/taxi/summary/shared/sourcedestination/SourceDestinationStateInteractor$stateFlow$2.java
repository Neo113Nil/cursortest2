package com.yandex.go.taxi.summary.shared.sourcedestination;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.cvu0;
import defpackage.dwh0;
import defpackage.ems;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.kdc;
import defpackage.kq0;
import defpackage.kyh0;
import defpackage.mct0;
import defpackage.mi31;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0j;
import defpackage.oct0;
import defpackage.oyr;
import defpackage.pct0;
import defpackage.pex0;
import defpackage.pqk0;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sct0;
import defpackage.t7s;
import defpackage.tct0;
import defpackage.tje;
import defpackage.tqk0;
import defpackage.uqk0;
import defpackage.vqk0;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xqg0;
import defpackage.yw0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.address.experiment.AddressItemMode;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;
import ru.yandex.taxi.address.experiment.r;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;
import ru.yandex.taxi.design.sourcedestination.SourceTrailMode;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lmct0;", "model", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "loadingState", "Lkotlin/Pair;", "Lmi31;", "Lru/yandex/taxi/address/experiment/e;", "<destruct>", "", "syncAddressInProgress", "Lru/yandex/taxi/theme/ThemeType;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lqct0;", "<anonymous>", "(Lmct0;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Lkotlin/Pair;ZLru/yandex/taxi/theme/ThemeType;)Lqct0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.shared.sourcedestination.SourceDestinationStateInteractor$stateFlow$2", f = "SourceDestinationStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SourceDestinationStateInteractor$stateFlow$2 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceDestinationStateInteractor$stateFlow$2(c cVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        SourceDestinationStateInteractor$stateFlow$2 sourceDestinationStateInteractor$stateFlow$2 = new SourceDestinationStateInteractor$stateFlow$2(this.this$0, (Continuation) obj6);
        sourceDestinationStateInteractor$stateFlow$2.L$0 = (mct0) obj;
        sourceDestinationStateInteractor$stateFlow$2.L$1 = (PriceUpdate$PriceLoadingState) obj2;
        sourceDestinationStateInteractor$stateFlow$2.L$2 = (Pair) obj3;
        sourceDestinationStateInteractor$stateFlow$2.Z$0 = booleanValue;
        return sourceDestinationStateInteractor$stateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        ru.yandex.taxi.address.experiment.a aVar;
        ru.yandex.taxi.address.experiment.a aVar2;
        i3y i3yVar;
        String T;
        ru.yandex.taxi.address.experiment.a aVar3;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        mct0 mct0Var = (mct0) this.L$0;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$1;
        Pair pair = (Pair) this.L$2;
        boolean z2 = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        mi31 mi31Var = (mi31) pair.getFirst();
        ru.yandex.taxi.address.experiment.e eVar = (ru.yandex.taxi.address.experiment.e) pair.getSecond();
        if (eVar == null) {
            return new pct0(mct0Var, z2);
        }
        boolean z3 = priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING || z2;
        tct0 tct0Var = this.this$0.b;
        pex0 pex0Var = mi31Var.a;
        Context context = tct0Var.a;
        i3y i3yVar2 = tct0Var.b;
        AddressItemMode addressItemMode = z3 ? AddressItemMode.LOADING : AddressItemMode.READ_ONLY;
        String str7 = eVar.k;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle = eVar.u;
        SourceTrailMode sourceTrailMode = mct0Var.c;
        String str8 = mct0Var.b;
        String str9 = mct0Var.a;
        if (sourceTrailMode == SourceTrailMode.NONE) {
            str7 = null;
        }
        String str10 = str7 == null ? "" : str7;
        int[] iArr = sct0.a;
        int i = iArr[summaryAddressStyle.ordinal()];
        if (i == 1) {
            str = eVar.i;
        } else if (i == 2) {
            str = str8;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            str = str9;
        }
        if (str == null) {
            str = "";
        }
        int i2 = iArr[summaryAddressStyle.ordinal()];
        if (i2 == 1 || i2 == 2) {
            str8 = str9;
        } else if (i2 != 3) {
            w511.b();
            return null;
        }
        if (str8 == null) {
            str8 = "";
        }
        if (evu0.J(str8) && !evu0.J(str)) {
            str8 = str;
            str = "";
        }
        ru.yandex.taxi.address.experiment.a aVar4 = new ru.yandex.taxi.address.experiment.a(str, str8, null, "", eVar.a, str10, iArr[summaryAddressStyle.ordinal()] == 1 ? g8e.p(context.getString(kyh0.new_mainscreen_from), Extension.FIX_SPACE, str8) : oyr.q(context.getString(kyh0.new_mainscreen_from), Extension.FIX_SPACE, str8, Extension.FIX_SPACE, str), null, addressItemMode, false, false, eVar.u, null, 488780);
        String str11 = eVar.j;
        o0j o0jVar = eVar.l;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle2 = eVar.v;
        DestinationTrailMode destinationTrailMode = mct0Var.f;
        String str12 = mct0Var.e;
        String str13 = mct0Var.d;
        DestinationTrailMode destinationTrailMode2 = DestinationTrailMode.NONE;
        String str14 = destinationTrailMode != destinationTrailMode2 ? str11 : null;
        if (str14 == null) {
            str14 = "";
        }
        if (str13 == null || str13.length() == 0) {
            aVar = aVar4;
            aVar2 = new ru.yandex.taxi.address.experiment.a(null, null, null, mct0Var.g, eVar.b, str14, tct0Var.a(eVar, mct0Var, "", null), null, addressItemMode, false, str11.length() == 0 && destinationTrailMode != destinationTrailMode2, null, null, 505167);
        } else {
            int i3 = mct0Var.l;
            String str15 = str12;
            if (i3 <= 1) {
                i3yVar = i3yVar2;
                T = null;
            } else {
                i3yVar = i3yVar2;
                T = tje.T(context, dwh0.summary_route_stops, i3, Integer.valueOf(i3));
            }
            int i4 = iArr[summaryAddressStyle2.ordinal()];
            if (i4 == 1) {
                if (pex0Var == null) {
                    str3 = o0jVar.c;
                    aVar3 = aVar4;
                    str2 = str11;
                } else {
                    int i5 = pex0Var.h.a;
                    aVar3 = aVar4;
                    str2 = str11;
                    int ceil = (int) Math.ceil(r7.b / 60.0f);
                    String str16 = pex0Var.r.a;
                    if (addressItemMode == AddressItemMode.LOADING) {
                        str3 = o0jVar.d;
                    } else {
                        if (ceil <= 0 || evu0.J(str16)) {
                            z = false;
                            str3 = o0jVar.c;
                        } else if (i5 <= 0) {
                            z = false;
                            str3 = cvu0.v(o0jVar.b, "$TRAVEL_TIME$", str16, false);
                        } else {
                            z = false;
                            String v = cvu0.v(o0jVar.a, "$TRAVEL_TIME$", str16, false);
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(12, ceil + i5);
                            str3 = cvu0.v(v, "$TIME$", t7s.c(context, calendar, 1), false);
                        }
                        str4 = str3;
                    }
                }
                z = false;
                str4 = str3;
            } else if (i4 == 2) {
                aVar3 = aVar4;
                str2 = str11;
                str4 = str15;
                z = false;
            } else {
                if (i4 != 3) {
                    w511.b();
                    return null;
                }
                aVar3 = aVar4;
                str2 = str11;
                z = false;
                str4 = str13;
            }
            if (str4 == null) {
                str4 = "";
            }
            int i6 = iArr[summaryAddressStyle2.ordinal()];
            if (i6 == 1 || i6 == 2) {
                str15 = str13;
            } else if (i6 != 3) {
                w511.b();
                return null;
            }
            if (str15 == null) {
                str15 = "";
            }
            if (str15.length() != 0 || str4.length() == 0) {
                str5 = str15;
            } else {
                str5 = str4;
                str4 = "";
            }
            String str17 = iArr[summaryAddressStyle2.ordinal()] == 1 ? mct0Var.g : "";
            pqk0 pqk0Var = mct0Var.k;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = str17;
            spannableStringBuilder.append((CharSequence) qeb1.f(str5, qje.t(xng0.textMain, context), 1.0f));
            if (summaryAddressStyle2 == NewbiesRedesignPointsABExperiment.SummaryAddressStyle.ONLY_CITY || pex0Var == null || (str6 = pex0Var.r.a) == null || evu0.J(str6)) {
                str6 = null;
            }
            if (str6 != null) {
                if (pqk0Var instanceof vqk0) {
                    vqk0 vqk0Var = (vqk0) pqk0Var;
                    tqk0 tqk0Var = (tqk0) i3yVar.getValue();
                    String replace = str6.replace(HexString.CHAR_SPACE, (char) 160);
                    Drawable drawable = vqk0Var.a;
                    kdc kdcVar = vqk0Var.b;
                    int m = kdcVar != null ? s8o.m(kdcVar, context) : context.getColor(xqg0.orange_normal);
                    kdc kdcVar2 = vqk0Var.c;
                    int m2 = kdcVar2 != null ? s8o.m(kdcVar2, context) : context.getColor(mqg0.white);
                    kdc kdcVar3 = vqk0Var.d;
                    kq0 a = tqk0Var.a(replace, drawable, m, m2, kdcVar3 != null ? s8o.m(kdcVar3, context) : context.getColor(mqg0.white));
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append(a.a);
                } else if (pqk0Var instanceof uqk0) {
                    spannableStringBuilder.append(((tqk0) i3yVar.getValue()).b(str6.replace(HexString.CHAR_SPACE, (char) 160), ((uqk0) pqk0Var).a).a);
                } else {
                    String b = tct0Var.b(pex0Var);
                    if (b != null && b.length() != 0) {
                        spannableStringBuilder.append((CharSequence) qeb1.f(b, qje.u(context.getTheme(), xng0.textMinor), 1.0f));
                    }
                }
            }
            yw0 yw0Var = eVar.b;
            String a2 = tct0Var.a(eVar, mct0Var, str4, pex0Var);
            List g = scc.g(context.getString(kyh0.select_address_to), str4, T, str13);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : g) {
                String str18 = (String) obj2;
                if (str18 != null && !evu0.J(str18)) {
                    arrayList.add(obj2);
                }
            }
            String X = kotlin.collections.a.X(arrayList, null, null, null, null, 63);
            aVar = aVar3;
            aVar2 = new ru.yandex.taxi.address.experiment.a(str4, spannableStringBuilder, T, charSequence, yw0Var, str14, a2, X, addressItemMode, !eVar.w, str2.length() == 0 && destinationTrailMode != DestinationTrailMode.NONE, eVar.v, null, 467268);
        }
        return new oct0(new r(aVar, aVar2));
    }
}
