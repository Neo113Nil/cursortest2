package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitError;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodContext;
import com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.rida.mainscreen.router.e;
import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.api.SharingType;
import com.yandex.go.safety.center.api.TrustedContacts;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.main.SafetyCenterMainMvpView;
import com.yandex.go.scooters.misc.action_dialog.ScootersActionDialogModalView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenBankSearchResult;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsWidgetShownStateWidget;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountAddGoalSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountResultResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountResultType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountLockMoneyResultResult;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingParams;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingState;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import com.ybsdk.feature.savings.internal.screens.close.SavingsAccountCloseParams;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.scheduleride.deeplink.ScheduleRideNext;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.d;
import ru.yandex.taxi.summary.requirements.list.interactors.v;
import ru.yandex.taxi.summary.requirements.list.recycler.i;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final class cfj0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cfj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x024f  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentKitError paymentKitError;
        Object value;
        dzk0 dzk0Var;
        SavingsEvents$SavingsAccountCloseAccountResultType savingsEvents$SavingsAccountCloseAccountResultType;
        r0 r0Var;
        Object value2;
        y3m0 y3m0Var;
        SavingsEvents$SavingsAccountCloseAccountResultType savingsEvents$SavingsAccountCloseAccountResultType2;
        r0 r0Var2;
        Object value3;
        z6m0 z6m0Var;
        Object bindConfig;
        int i = 2;
        xyk0 xyk0Var = null;
        Object obj2 = null;
        xyk0Var = null;
        switch (this.a) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((v) this.b).a.g((String) it.next(), null, null, null, new d82(1), false);
                }
                break;
            case 1:
                Object a = ((i) this.b).e.a((fbj0) obj, continuation);
                if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                q3a0 q3a0Var = (q3a0) obj;
                zy11 zy11Var = zy11.a;
                pzj0 pzj0Var = (pzj0) this.b;
                t3a0 t3a0Var = pzj0Var.d;
                Scenario scenario = pzj0Var.c.f;
                FinishFlowStatus finishFlowStatus = q3a0Var.a;
                Map map = q3a0Var.b;
                t3a0Var.getClass();
                li3 li3Var = new li3(scenario, finishFlowStatus);
                a aVar = (a) t3a0Var.b;
                aVar.a(li3Var);
                if (finishFlowStatus == FinishFlowStatus.FAIL) {
                    aVar.b(li3Var);
                }
                if (nzj0.a[finishFlowStatus.ordinal()] == 1) {
                    Map f = map == null ? b.f() : map;
                    paymentKitError = new PaymentKitError(pzj0.a(scc.g("reason_code", "reasonCode"), f), pzj0.a(scc.g(Constants.KEY_MESSAGE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION), f));
                } else {
                    paymentKitError = null;
                }
                Parcelable parcelable = q3a0Var.c;
                Intent intent = new Intent();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (parcelable != null) {
                    if (parcelable instanceof SelectedPaymentMethodContext) {
                        intent.putExtra("PAYMENT_KIT.RESULT.SELECTED_METHOD", parcelable);
                    } else {
                        intent.putExtra("PAYMENT_KIT.RESULT.DATA", parcelable);
                    }
                }
                if (paymentKitError != null) {
                    intent.putExtra("PAYMENT_KIT.RESULT.ERROR", paymentKitError);
                }
                int i2 = nzj0.a[finishFlowStatus.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = -1;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                            w511.b();
                            break;
                        }
                        break;
                    } else {
                        i = 0;
                    }
                }
                pzj0Var.b.e(i, intent);
            case 3:
                Object h = ru.yandex.taxi.multiorder.i.h((ru.yandex.taxi.multiorder.i) this.b, (wl40) obj, continuation);
                if (h != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                zy11 zy11Var2 = zy11.a;
                e eVar = (e) this.b;
                Object S = eVar.M.a() ? eVar.S(new a5y0("widgets response", null, null, 30), continuation) : zy11Var2;
                if (S == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                pex0 pex0Var = (pex0) obj;
                com.yandex.go.taxi.summary.rida_summary.repository.i iVar = (com.yandex.go.taxi.summary.rida_summary.repository.i) this.b;
                r0 r0Var3 = iVar.b;
                List<q6k0> list = pex0Var.H0;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (q6k0 q6k0Var : list) {
                    arrayList.add(new r6k0(q6k0Var.b, q6k0Var.a));
                }
                String a2 = pex0Var.J0.b.a();
                t6k0 t6k0Var = (t6k0) r0Var3.getValue();
                boolean equals = t6k0Var.a.equals(a2);
                List list2 = t6k0Var.b;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((r6k0) it2.next()).b);
                }
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((r6k0) it3.next()).b);
                }
                boolean equals2 = arrayList2.equals(arrayList3);
                if (!equals || !equals2) {
                    r0 r0Var4 = iVar.d;
                    Integer num = new Integer(y6i0.d(pex0Var.I0, 0, scc.f(arrayList)));
                    r0Var4.getClass();
                    r0Var4.m(null, num);
                }
                t6k0 t6k0Var2 = new t6k0(a2, arrayList);
                r0Var3.getClass();
                r0Var3.m(null, t6k0Var2);
                break;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    r0 r0Var5 = ((com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a) this.b).b.a;
                    do {
                        value = r0Var5.getValue();
                    } while (!r0Var5.k(value, ykk0.a((ykk0) value, 4, false, false, null, null, false, 62)));
                }
                break;
            case 7:
                ((ltk0) this.b).H1((itk0) obj);
                break;
            case 8:
                ((rvk0) this.b).render((uvk0) obj);
                break;
            case 9:
                com.ybsdk.feature.autotopup.internal.presentation.saver.b bVar = (com.ybsdk.feature.autotopup.internal.presentation.saver.b) this.b;
                Object X = bVar.X();
                RoundingParams roundingParams = bVar.C;
                xyk0 xyk0Var2 = ((RoundingState) X).c;
                ezk0 ezk0Var = (ezk0) ((RoundingState) bVar.X()).e.a();
                if (ezk0Var != null && (dzk0Var = ezk0Var.a) != null) {
                    xyk0Var = dzk0Var.d;
                }
                boolean l = jl40.l(xyk0Var2, xyk0Var);
                us3 us3Var = bVar.J;
                if (l) {
                    us3Var.u(roundingParams, RoundingEvents$RoundingSettingsWidgetShownStateWidget.HIDDEN);
                    bVar.Z(jzk0.a);
                } else {
                    us3Var.u(roundingParams, RoundingEvents$RoundingSettingsWidgetShownStateWidget.SHOWN);
                    bVar.Z(lzk0.a);
                }
                break;
            case 10:
                ThemeType themeType = (ThemeType) obj;
                n0l0 n0l0Var = (n0l0) this.b;
                SourceDestinationComponent sourceDestinationComponent = n0l0Var.j;
                if (sourceDestinationComponent != null) {
                    sourceDestinationComponent.applyTheme(themeType);
                }
                SourceDestinationComponentV2 sourceDestinationComponentV2 = n0l0Var.k;
                if (sourceDestinationComponentV2 != null) {
                    sourceDestinationComponentV2.applyTheme(themeType);
                }
                break;
            case 11:
                ((edl0) this.b).render(new pdl0(((pe50) obj).b));
                break;
            case 12:
                ((com.yandex.go.routestops.v2.interactor.a) this.b).a.b();
                break;
            case 13:
                com.yandex.go.safety.center.car.crash.status.a aVar2 = (com.yandex.go.safety.center.car.crash.status.a) this.b;
                if (((Result) obj) != null) {
                    Iterator it4 = aVar2.x.j.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            if (jl40.l(((SafetyCenterExperiment.Instruction) next).a, "car_crash")) {
                                obj2 = next;
                            }
                        }
                    }
                    SafetyCenterExperiment.Instruction instruction = (SafetyCenterExperiment.Instruction) obj2;
                    ndl0 ndl0Var = aVar2.z;
                    if (instruction != null) {
                        n48 n48Var = new n48(instruction);
                        qql0 qql0Var = (qql0) ndl0Var.b;
                        qql0Var.z(((esl0) qql0Var.H).a(new hrl0(), n48Var), new pql0());
                    } else {
                        ((qql0) ndl0Var.b).r(new z0l0(19));
                    }
                }
                break;
            case 14:
                com.yandex.go.safety.center.main.a aVar3 = (com.yandex.go.safety.center.main.a) this.b;
                Result result = (Result) obj;
                if (result != null) {
                    Object value4 = result.getValue();
                    if (!(value4 instanceof Result.Failure)) {
                        SafetyCenterConfig safetyCenterConfig = (SafetyCenterConfig) value4;
                        SafetyCenterMainMvpView safetyCenterMainMvpView = (SafetyCenterMainMvpView) aVar3.Dg();
                        SafetyCenterExperiment.ButtonType buttonType = SafetyCenterExperiment.ButtonType.CONTACTS;
                        SafetyCenterMainMvpView.ButtonState buttonState = SafetyCenterMainMvpView.ButtonState.VISIBLE;
                        safetyCenterMainMvpView.setButtonState(buttonType, buttonState);
                        hrl0 hrl0Var = aVar3.I;
                        if (!hrl0Var.a()) {
                            hrl0Var.c(new ajl0(5, aVar3, safetyCenterConfig), false);
                        }
                        ((SafetyCenterMainMvpView) aVar3.Dg()).setButtonState(SafetyCenterExperiment.ButtonType.EMERGENCY, buttonState);
                    }
                    Throwable a3 = Result.a(value4);
                    if (a3 != null) {
                        aVar3.getClass();
                        jst.e.k(a3, "Cannot load /launch for safety center");
                        ((SafetyCenterMainMvpView) aVar3.Dg()).setButtonState(SafetyCenterExperiment.ButtonType.CONTACTS, SafetyCenterMainMvpView.ButtonState.GONE);
                        hrl0 hrl0Var2 = aVar3.I;
                        if (!hrl0Var2.a() && hrl0Var2.c) {
                            hrl0Var2.c = false;
                            Runnable runnable = hrl0Var2.a;
                            if (hrl0Var2.d && runnable != null) {
                                runnable.run();
                            }
                        }
                    }
                }
                break;
            case 15:
                ((SafetyCenterMainMvpView) this.b).setStories((List) obj);
                break;
            case 16:
                SafetyCenterConfig safetyCenterConfig2 = (SafetyCenterConfig) obj;
                j jVar = (j) this.b;
                r0 r0Var6 = jVar.o;
                cne0 cne0Var = jVar.m;
                Result result2 = new Result(safetyCenterConfig2);
                r0Var6.getClass();
                r0Var6.m(null, result2);
                try {
                    cne0Var.r("cached_config", ((xnt) jVar.l).e(safetyCenterConfig2, SafetyCenterConfig.Companion.serializer()));
                } catch (Exception e) {
                    jst.e.k(e, "Failed to cache config");
                }
                r0 r0Var7 = jVar.p;
                if (cne0Var.c("need_share_location_key")) {
                    Boolean valueOf = Boolean.valueOf(cne0Var.f("need_share_location_key"));
                    r0Var7.getClass();
                    r0Var7.m(null, valueOf);
                } else if (safetyCenterConfig2.a.c != SharingType.DISABLED_CHECKBOX) {
                    Boolean bool = Boolean.TRUE;
                    r0Var7.getClass();
                    r0Var7.m(null, bool);
                    cne0Var.u("need_share_location_key", true);
                }
                if (jVar.s != null) {
                    jVar.g((TrustedContacts) safetyCenterConfig2.d.getValue());
                }
                r0 r0Var8 = jVar.A;
                List f2 = jVar.f();
                r0Var8.getClass();
                r0Var8.m(null, f2);
                jVar.f.q.put((EnumMap) SafetyCenterExperiment.L10nTemplateParam.PHONE, (SafetyCenterExperiment.L10nTemplateParam) safetyCenterConfig2.b);
                break;
            case 17:
                pzl0 pzl0Var = (pzl0) this.b;
                if (!pzl0Var.e.contains((Screen) obj)) {
                    pzl0Var.c.clear();
                    pzt0 pzt0Var = pzl0Var.d;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    pzl0Var.d = null;
                }
                break;
            case 18:
                w9m0 w9m0Var = (w9m0) obj;
                b4m0 b4m0Var = (b4m0) this.b;
                SavingsAccountCloseParams savingsAccountCloseParams = b4m0Var.B;
                AppAnalyticsReporter appAnalyticsReporter = b4m0Var.D;
                SavingsActionStatus savingsActionStatus = w9m0Var.a;
                Throwable th = w9m0Var.b;
                int i3 = z3m0.a[savingsActionStatus.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            w511.b();
                            break;
                        }
                    } else {
                        if (th != null) {
                            b4m0Var.W("IDEMPOTENCY_KEY_FOR_CLOSING", th);
                        }
                        rt1 rt1Var = appAnalyticsReporter.f0;
                        String type = savingsAccountCloseParams.getType();
                        if (type != null) {
                            if (type.equalsIgnoreCase("SAVER")) {
                                savingsEvents$SavingsAccountCloseAccountResultType2 = SavingsEvents$SavingsAccountCloseAccountResultType.SAVER;
                            } else if (type.equalsIgnoreCase("DEPOSIT")) {
                                savingsEvents$SavingsAccountCloseAccountResultType2 = SavingsEvents$SavingsAccountCloseAccountResultType.DEPOSIT;
                            }
                            rt1Var.H(th != null ? th.getLocalizedMessage() : null, SavingsEvents$SavingsAccountCloseAccountResultResult.ERROR, savingsEvents$SavingsAccountCloseAccountResultType2);
                        }
                        savingsEvents$SavingsAccountCloseAccountResultType2 = null;
                        rt1Var.H(th != null ? th.getLocalizedMessage() : null, SavingsEvents$SavingsAccountCloseAccountResultResult.ERROR, savingsEvents$SavingsAccountCloseAccountResultType2);
                    }
                } else {
                    rt1 rt1Var2 = appAnalyticsReporter.f0;
                    String type2 = savingsAccountCloseParams.getType();
                    if (type2 != null) {
                        if (type2.equalsIgnoreCase("SAVER")) {
                            savingsEvents$SavingsAccountCloseAccountResultType = SavingsEvents$SavingsAccountCloseAccountResultType.SAVER;
                        } else if (type2.equalsIgnoreCase("DEPOSIT")) {
                            savingsEvents$SavingsAccountCloseAccountResultType = SavingsEvents$SavingsAccountCloseAccountResultType.DEPOSIT;
                        }
                        rt1Var2.H(null, SavingsEvents$SavingsAccountCloseAccountResultResult.OK, savingsEvents$SavingsAccountCloseAccountResultType);
                        ((gdm0) b4m0Var.F).b();
                    }
                    savingsEvents$SavingsAccountCloseAccountResultType = null;
                    rt1Var2.H(null, SavingsEvents$SavingsAccountCloseAccountResultResult.OK, savingsEvents$SavingsAccountCloseAccountResultType);
                    ((gdm0) b4m0Var.F).b();
                }
                pz40 Y = b4m0Var.Y();
                do {
                    r0Var = (r0) Y;
                    value2 = r0Var.getValue();
                    y3m0Var = (y3m0) value2;
                } while (!r0Var.k(value2, new y3m0(y3m0Var.a, y3m0Var.b, w9m0Var.a == SavingsActionStatus.IN_PROGRESS, y3m0Var.d, y3m0Var.e, y3m0Var.f, y3m0Var.g)));
            case 19:
                t9m0 t9m0Var = (t9m0) obj;
                p6m0 p6m0Var = (p6m0) this.b;
                p6m0Var.a0(new ohk0(28, t9m0Var));
                AppAnalyticsReporter appAnalyticsReporter2 = p6m0Var.F;
                SavingsActionStatus savingsActionStatus2 = t9m0Var.c;
                Throwable th2 = t9m0Var.d;
                int i4 = o6m0.a[savingsActionStatus2.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            w511.b();
                            break;
                        }
                    } else {
                        rt1 rt1Var3 = appAnalyticsReporter2.f0;
                        String str = ((i6m0) p6m0Var.X()).g;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = ((i6m0) p6m0Var.X()).d;
                        rt1Var3.a.a("savings.account.add_goal.save.initiated", x4e.t(2, "value", str, MetaDataField.DATE_FIELD, str2 != null ? str2 : ""));
                        p6m0Var.C.e();
                    }
                } else {
                    if (th2 != null) {
                        p6m0Var.W("IDEMPOTENCY_KEY_FOR_GOAL", th2);
                    }
                    rt1 rt1Var4 = appAnalyticsReporter2.f0;
                    SavingsEvents$SavingsAccountAddGoalSaveResultResult savingsEvents$SavingsAccountAddGoalSaveResultResult = SavingsEvents$SavingsAccountAddGoalSaveResultResult.ERROR;
                    String localizedMessage = th2 != null ? th2.getLocalizedMessage() : null;
                    if (localizedMessage == null) {
                        localizedMessage = "";
                    }
                    String str3 = ((i6m0) p6m0Var.X()).g;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = ((i6m0) p6m0Var.X()).d;
                    String str5 = str4 != null ? str4 : "";
                    LinkedHashMap linkedHashMap = new LinkedHashMap(4);
                    linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountAddGoalSaveResultResult.getOriginalValue());
                    linkedHashMap.put("error", localizedMessage);
                    linkedHashMap.put("value", str3);
                    linkedHashMap.put(MetaDataField.DATE_FIELD, str5);
                    rt1Var4.a.a("savings.account.add_goal.save.result", linkedHashMap);
                }
                break;
            case 20:
                x9m0 x9m0Var = (x9m0) obj;
                c7m0 c7m0Var = (c7m0) this.b;
                AppAnalyticsReporter appAnalyticsReporter3 = c7m0Var.D;
                int i5 = a7m0.a[x9m0Var.b.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            w511.b();
                            break;
                        }
                    } else {
                        Throwable th3 = x9m0Var.c;
                        if (th3 != null) {
                            c7m0Var.W("IDEMPOTENCY_KEY_FOR_LOCK", th3);
                        }
                        rt1 rt1Var5 = appAnalyticsReporter3.f0;
                        SavingsEvents$SavingsAccountLockMoneyResultResult savingsEvents$SavingsAccountLockMoneyResultResult = SavingsEvents$SavingsAccountLockMoneyResultResult.ERROR;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                        linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountLockMoneyResultResult.getOriginalValue());
                        rt1Var5.a.a("savings.account.lock_money.result", linkedHashMap2);
                    }
                } else {
                    rt1 rt1Var6 = appAnalyticsReporter3.f0;
                    SavingsEvents$SavingsAccountLockMoneyResultResult savingsEvents$SavingsAccountLockMoneyResultResult2 = SavingsEvents$SavingsAccountLockMoneyResultResult.OK;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(1);
                    linkedHashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountLockMoneyResultResult2.getOriginalValue());
                    rt1Var6.a.a("savings.account.lock_money.result", linkedHashMap3);
                    c7m0Var.C.e();
                }
                pz40 Y2 = c7m0Var.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value3 = r0Var2.getValue();
                    z6m0Var = (z6m0) value3;
                } while (!r0Var2.k(value3, new z6m0(z6m0Var.a, z6m0Var.b, x9m0Var.b == SavingsActionStatus.IN_PROGRESS)));
            case 21:
                k7m0 k7m0Var = (k7m0) this.b;
                k7m0Var.a0(new vxj0(25, (u9m0) obj, k7m0Var));
                break;
            case 22:
                c cVar = (c) this.b;
                pzt0 pzt0Var2 = cVar.I;
                if (pzt0Var2 == null || !pzt0Var2.isActive()) {
                    cVar.d0(false);
                }
                break;
            case 23:
                ((vgm0) ((ygm0) this.b).Dg()).J6((List) obj);
                break;
            case 24:
                z94.p(((AppAnalyticsReporter) ((krl0) this.b).a).G, (String) obj, LinkingAccountEvents$LinkingAccountListOfBanksScreenBankSearchResult.OK);
                break;
            case 25:
                ScheduleRideNext scheduleRideNext = (ScheduleRideNext) obj;
                mnm0 mnm0Var = (mnm0) this.b;
                mnm0Var.getClass();
                if (scheduleRideNext == ScheduleRideNext.DST_SELECTION) {
                    mnm0Var.b.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, true);
                }
                axm axmVar = mnm0Var.a;
                axmVar.getClass();
                axmVar.e = ScheduleRideNext.UNKNOWN;
                break;
            case 26:
                ((gom0) ((hom0) this.b).Dg()).setOrderInstructionModels((List) obj);
                break;
            case 27:
                bindConfig = ((ScootersActionDialogModalView) this.b).bindConfig(continuation);
                if (bindConfig != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                ((erm0) this.b).render(new irm0(((irm0) obj).a));
                break;
            default:
                ((d) this.b).O = (zuo0) obj;
                break;
        }
        return zy11.a;
    }
}
