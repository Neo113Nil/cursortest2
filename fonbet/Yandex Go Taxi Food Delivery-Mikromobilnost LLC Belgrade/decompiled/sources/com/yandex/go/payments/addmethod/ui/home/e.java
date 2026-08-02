package com.yandex.go.payments.addmethod.ui.home;

import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import com.yandex.go.payments.addmethod.data.model.s;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ah0;
import defpackage.avj0;
import defpackage.bh0;
import defpackage.bvf0;
import defpackage.ch0;
import defpackage.eh0;
import defpackage.evu0;
import defpackage.hh0;
import defpackage.jh0;
import defpackage.kh0;
import defpackage.kyh0;
import defpackage.lh0;
import defpackage.mh0;
import defpackage.nh0;
import defpackage.ny61;
import defpackage.oh0;
import defpackage.ph0;
import defpackage.qh0;
import defpackage.rh0;
import defpackage.scc;
import defpackage.sh0;
import defpackage.tcc;
import defpackage.th0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uh0;
import defpackage.vh0;
import defpackage.w511;
import defpackage.wh0;
import defpackage.yt11;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class e implements yt11 {
    public final tt2 a;
    public final zuj0 b;
    public final ru.yandex.taxi.widget.c c;
    public final BindUniversalPaymentMethodApi d;
    public final boolean e;
    public final r0 f;
    public mh0 g;
    public final r0 h;

    public e(tt2 tt2Var, zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar, BindUniversalPaymentMethodApi bindUniversalPaymentMethodApi, boolean z) {
        this.a = tt2Var;
        this.b = zuj0Var;
        this.c = cVar;
        this.d = bindUniversalPaymentMethodApi;
        this.e = z;
        r0 c = bvf0.c(new sh0(z));
        this.f = c;
        this.h = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, AddPaymentHomeResponse addPaymentHomeResponse, PaymentMethod$Type paymentMethod$Type, ContinuationImpl continuationImpl) {
        AddPaymentHomeUiStateInteractor$mapResponseToState$1 addPaymentHomeUiStateInteractor$mapResponseToState$1;
        int i;
        AddPaymentHomeResponse.BindDialog bindDialog;
        int i2;
        ah0 ah0Var;
        CoroutineSingletons coroutineSingletons;
        AddPaymentHomeResponse.BindDialog bindDialog2;
        ah0 ah0Var2;
        List list;
        uh0 uh0Var;
        qh0 qh0Var;
        uh0 uh0Var2;
        List list2;
        int i3;
        ?? g;
        String sb;
        th0 th0Var;
        com.yandex.go.payments.addmethod.data.model.c cVar;
        boolean z;
        ArrayList arrayList;
        AddPaymentHomeResponse.Footer footer;
        String str;
        qh0 qh0Var2;
        ArrayList arrayList2;
        String str2;
        oh0 oh0Var;
        ?? r0;
        qh0 qh0Var3;
        String str3;
        String str4;
        ArrayList arrayList3;
        e eVar2 = eVar;
        PaymentMethod$Type paymentMethod$Type2 = paymentMethod$Type;
        zuj0 zuj0Var = eVar2.b;
        if (continuationImpl instanceof AddPaymentHomeUiStateInteractor$mapResponseToState$1) {
            addPaymentHomeUiStateInteractor$mapResponseToState$1 = (AddPaymentHomeUiStateInteractor$mapResponseToState$1) continuationImpl;
            int i4 = addPaymentHomeUiStateInteractor$mapResponseToState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                addPaymentHomeUiStateInteractor$mapResponseToState$1.label = i4 - Integer.MIN_VALUE;
                Object obj = addPaymentHomeUiStateInteractor$mapResponseToState$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addPaymentHomeUiStateInteractor$mapResponseToState$1.label;
                int i5 = 3;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AddPaymentHomeResponse.PrerequisiteScreen prerequisiteScreen = addPaymentHomeResponse.b;
                    AddPaymentHomeResponse.HomeInfoScreen homeInfoScreen = addPaymentHomeResponse.c;
                    uh0 uh0Var3 = new uh0(prerequisiteScreen.a, prerequisiteScreen.b);
                    bindDialog = addPaymentHomeResponse.a;
                    if (bindDialog == null) {
                        boolean z2 = eVar2.e;
                        if (homeInfoScreen == null) {
                            avj0 avj0Var = (avj0) zuj0Var;
                            return new nh0(z2, paymentMethod$Type2, avj0Var.h(kyh0.payment_methods_home_error), avj0Var.h(kyh0.payment_methods_home_try_again));
                        }
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$0 = null;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$1 = null;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$2 = null;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$3 = null;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$4 = null;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.Z$0 = z2;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.label = 1;
                        obj = eVar2.f(homeInfoScreen, uh0Var3, addPaymentHomeUiStateInteractor$mapResponseToState$1);
                        if (obj == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        z = z2;
                        return new ph0(z, (qh0) obj, null, true);
                    }
                    List<AddPaymentHomeResponse.ActionButton> list3 = bindDialog.c;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list3, 10));
                    for (AddPaymentHomeResponse.ActionButton actionButton : list3) {
                        arrayList4.add(new lh0(actionButton.a, actionButton.b, d(actionButton.c, uh0Var3), e(actionButton.d)));
                        i5 = i5;
                    }
                    i2 = i5;
                    AddPaymentHomeResponse.Footer footer2 = bindDialog.d;
                    ah0Var = (footer2 == null || (cVar = footer2.b) == null || !(cVar instanceof AddPaymentHomeResponse.OpenLinkAction)) ? null : new ah0(((AddPaymentHomeResponse.OpenLinkAction) cVar).a);
                    List list4 = bindDialog.e;
                    ArrayList arrayList5 = new ArrayList(tcc.n(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        AddPaymentHomeResponse.InputField inputField = (AddPaymentHomeResponse.InputField) it.next();
                        AddPaymentHomeResponse.Validation validation = inputField.d;
                        List list5 = validation.d;
                        AddPaymentHomeResponse.LengthRestrictions lengthRestrictions = validation.b;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it2 = list5.iterator();
                        while (true) {
                            Iterator it3 = it;
                            if (it2.hasNext()) {
                                Iterator it4 = it2;
                                AddPaymentHomeResponse.PhoneFormat phoneFormat = (AddPaymentHomeResponse.PhoneFormat) it2.next();
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                String str5 = phoneFormat.b;
                                if (evu0.J(str5)) {
                                    str5 = null;
                                }
                                if (str5 == null) {
                                    th0Var = null;
                                } else {
                                    String str6 = phoneFormat.a;
                                    th0Var = new th0(evu0.J(str6) ? ".*" : str6, str5);
                                }
                                if (th0Var != null) {
                                    arrayList6.add(th0Var);
                                }
                                coroutineSingletons2 = coroutineSingletons3;
                                it = it3;
                                it2 = it4;
                            } else {
                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                                boolean isEmpty = arrayList6.isEmpty();
                                List list6 = arrayList6;
                                if (isEmpty) {
                                    if (paymentMethod$Type2 == PaymentMethod$Type.NEQUI_TOKEN || paymentMethod$Type2 == PaymentMethod$Type.JAZZCASH_WALLET) {
                                        String str7 = validation.c;
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        Integer valueOf = lengthRestrictions != null ? Integer.valueOf(lengthRestrictions.b) : null;
                                        if (valueOf == null || valueOf.intValue() >= Integer.MAX_VALUE) {
                                            i3 = 10;
                                        } else {
                                            i3 = valueOf.intValue() - str7.length();
                                            if (i3 < 0) {
                                                i3 = 0;
                                            }
                                        }
                                        Integer valueOf2 = Integer.valueOf(i2);
                                        if (str7.length() == 0) {
                                            str7 = "+";
                                        }
                                        if (i3 <= 0) {
                                            sb = str7;
                                        } else {
                                            int i6 = i3;
                                            StringBuilder sb2 = new StringBuilder(str7);
                                            switch (i6) {
                                                case 7:
                                                    g = scc.g(valueOf2, 4);
                                                    break;
                                                case 8:
                                                    g = scc.g(4, 4);
                                                    break;
                                                case 9:
                                                    g = scc.g(valueOf2, valueOf2, valueOf2);
                                                    break;
                                                case 10:
                                                    if (str7.equals("+92")) {
                                                        g = scc.g(valueOf2, 7);
                                                        break;
                                                    } else {
                                                        g = scc.g(valueOf2, 4, valueOf2);
                                                        break;
                                                    }
                                                case 11:
                                                    g = scc.g(valueOf2, 4, 4);
                                                    break;
                                                default:
                                                    g = new ArrayList();
                                                    int i7 = i6;
                                                    while (i7 > 0) {
                                                        int i8 = i7 > 4 ? i2 : i7;
                                                        g.add(Integer.valueOf(i8));
                                                        i7 -= i8;
                                                    }
                                                    break;
                                            }
                                            Iterator it5 = g.iterator();
                                            while (it5.hasNext()) {
                                                int intValue = ((Number) it5.next()).intValue();
                                                if (sb2.length() > 0) {
                                                    sb2.append(HexString.CHAR_SPACE);
                                                }
                                                for (int i9 = 0; i9 < intValue; i9++) {
                                                    sb2.append(MoneyInputEditView.DEFAULT_VALUE);
                                                }
                                            }
                                            sb = sb2.toString();
                                        }
                                    } else {
                                        sb = null;
                                    }
                                    list6 = sb == null ? EmptyList.a : Collections.singletonList(new th0(".*", sb));
                                }
                                arrayList5.add(new rh0(inputField.a, validation.a, inputField.e, inputField.b, inputField.c, validation.c, lengthRestrictions != null ? lengthRestrictions.a : 0, lengthRestrictions != null ? lengthRestrictions.b : Integer.MAX_VALUE, list6));
                                paymentMethod$Type2 = paymentMethod$Type;
                                coroutineSingletons2 = coroutineSingletons4;
                                it = it3;
                            }
                        }
                    }
                    CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
                    if (homeInfoScreen != null) {
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$0 = null;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$1 = null;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$2 = uh0Var3;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$3 = bindDialog;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$4 = arrayList4;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$5 = ah0Var;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$6 = arrayList5;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.L$7 = null;
                        addPaymentHomeUiStateInteractor$mapResponseToState$1.label = 2;
                        eVar2 = eVar;
                        Object f = eVar2.f(homeInfoScreen, uh0Var3, addPaymentHomeUiStateInteractor$mapResponseToState$1);
                        coroutineSingletons = coroutineSingletons5;
                        if (f == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        uh0Var2 = uh0Var3;
                        obj = f;
                        list2 = arrayList5;
                        arrayList3 = arrayList4;
                        qh0Var = (qh0) obj;
                        ah0 ah0Var3 = ah0Var;
                        bindDialog2 = bindDialog;
                        ah0Var2 = ah0Var3;
                        uh0Var = uh0Var2;
                        list = list2;
                        arrayList = arrayList3;
                    } else {
                        eVar2 = eVar;
                        coroutineSingletons = coroutineSingletons5;
                        ah0 ah0Var4 = ah0Var;
                        bindDialog2 = bindDialog;
                        ah0Var2 = ah0Var4;
                        list = arrayList5;
                        uh0Var = uh0Var3;
                        qh0Var = null;
                        arrayList = arrayList4;
                    }
                } else {
                    if (i == 1) {
                        z = addPaymentHomeUiStateInteractor$mapResponseToState$1.Z$0;
                        kotlin.b.b(obj);
                        return new ph0(z, (qh0) obj, null, true);
                    }
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r0 = (List) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$11;
                        str4 = (String) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$10;
                        str3 = (String) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$9;
                        qh0Var3 = (qh0) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$7;
                        list = (List) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$6;
                        ah0Var2 = (ah0) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$5;
                        bindDialog2 = (AddPaymentHomeResponse.BindDialog) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$3;
                        uh0Var = (uh0) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$2;
                        kotlin.b.b(obj);
                        arrayList2 = r0;
                        str2 = str4;
                        str = str3;
                        qh0Var2 = qh0Var3;
                        oh0Var = new oh0((CharSequence) obj, ah0Var2);
                        return new mh0(str, str2, arrayList2, oh0Var, uh0Var, list, qh0Var2, g(bindDialog2.f), bindDialog2.g, null);
                    }
                    list2 = (List) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$6;
                    ah0 ah0Var5 = (ah0) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$5;
                    ?? r4 = (List) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$4;
                    bindDialog = (AddPaymentHomeResponse.BindDialog) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$3;
                    uh0 uh0Var4 = (uh0) addPaymentHomeUiStateInteractor$mapResponseToState$1.L$2;
                    kotlin.b.b(obj);
                    ah0Var = ah0Var5;
                    coroutineSingletons = coroutineSingletons2;
                    uh0Var2 = uh0Var4;
                    i2 = 3;
                    arrayList3 = r4;
                    qh0Var = (qh0) obj;
                    ah0 ah0Var32 = ah0Var;
                    bindDialog2 = bindDialog;
                    ah0Var2 = ah0Var32;
                    uh0Var = uh0Var2;
                    list = list2;
                    arrayList = arrayList3;
                }
                String str8 = bindDialog2.a;
                String str9 = bindDialog2.b;
                footer = bindDialog2.d;
                if (footer != null) {
                    str = str8;
                    qh0Var2 = qh0Var;
                    arrayList2 = arrayList;
                    str2 = str9;
                    oh0Var = null;
                    return new mh0(str, str2, arrayList2, oh0Var, uh0Var, list, qh0Var2, g(bindDialog2.f), bindDialog2.g, null);
                }
                ru.yandex.taxi.widget.c cVar2 = eVar2.c;
                FormattedText formattedText = footer.a;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$0 = null;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$1 = null;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$2 = uh0Var;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$3 = bindDialog2;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$4 = null;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$5 = ah0Var2;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$6 = list;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$7 = qh0Var;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$8 = null;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$9 = str8;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$10 = str9;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.L$11 = arrayList;
                addPaymentHomeUiStateInteractor$mapResponseToState$1.label = i2;
                Object i10 = ru.yandex.taxi.widget.c.i(cVar2, formattedText, null, addPaymentHomeUiStateInteractor$mapResponseToState$1, 30);
                if (i10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qh0 qh0Var4 = qh0Var;
                obj = i10;
                r0 = arrayList;
                qh0Var3 = qh0Var4;
                str3 = str8;
                str4 = str9;
                arrayList2 = r0;
                str2 = str4;
                str = str3;
                qh0Var2 = qh0Var3;
                oh0Var = new oh0((CharSequence) obj, ah0Var2);
                return new mh0(str, str2, arrayList2, oh0Var, uh0Var, list, qh0Var2, g(bindDialog2.f), bindDialog2.g, null);
            }
        }
        addPaymentHomeUiStateInteractor$mapResponseToState$1 = new AddPaymentHomeUiStateInteractor$mapResponseToState$1(eVar2, continuationImpl);
        Object obj2 = addPaymentHomeUiStateInteractor$mapResponseToState$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addPaymentHomeUiStateInteractor$mapResponseToState$1.label;
        int i52 = 3;
        if (i != 0) {
        }
        String str82 = bindDialog2.a;
        String str92 = bindDialog2.b;
        footer = bindDialog2.d;
        if (footer != null) {
        }
    }

    public static jh0 d(com.yandex.go.payments.addmethod.data.model.c cVar, uh0 uh0Var) {
        if (cVar instanceof AddPaymentHomeResponse.CloseAction) {
            return bh0.a;
        }
        if (cVar instanceof AddPaymentHomeResponse.StartBindingAction) {
            return new eh0(uh0Var);
        }
        if (cVar instanceof AddPaymentHomeResponse.OpenLinkAction) {
            return new ah0(((AddPaymentHomeResponse.OpenLinkAction) cVar).a);
        }
        if (cVar instanceof AddPaymentHomeResponse.OpenBindUrlAction) {
            return new eh0(uh0Var);
        }
        if (cVar instanceof AddPaymentHomeResponse.CloseFlowAndOpenBindUrlAction) {
            return ch0.a;
        }
        if (cVar instanceof AddPaymentHomeResponse.DeeplinkAction) {
            return new hh0(((AddPaymentHomeResponse.DeeplinkAction) cVar).a);
        }
        w511.b();
        return null;
    }

    public static ArrayList e(List list) {
        List<AddPaymentHomeResponse.HomeActionButtonState> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (AddPaymentHomeResponse.HomeActionButtonState homeActionButtonState : list2) {
            String str = homeActionButtonState.a;
            AddPaymentHomeResponse.ButtonState buttonState = homeActionButtonState.b;
            AddPaymentHomeResponse.HomeStateCondition homeStateCondition = homeActionButtonState.c;
            arrayList.add(new kh0(str, buttonState, homeStateCondition.a, homeStateCondition.b));
        }
        return arrayList;
    }

    public static vh0 g(AddPaymentHomeResponse.HomeToolbar homeToolbar) {
        wh0 wh0Var = null;
        if (homeToolbar == null) {
            return null;
        }
        s sVar = homeToolbar.b;
        if (sVar instanceof AddPaymentHomeResponse.TrailButtonLink) {
            AddPaymentHomeResponse.TrailButtonLink trailButtonLink = (AddPaymentHomeResponse.TrailButtonLink) sVar;
            wh0Var = new wh0(trailButtonLink.a, d(trailButtonLink.b, new uh0("", "")));
        } else if (sVar != null) {
            w511.b();
            return null;
        }
        return new vh0(homeToolbar.a, wh0Var);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        AddPaymentHomeUiStateInteractor$goBackFromInfoScreen$1 addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1;
        int i;
        if (continuationImpl instanceof AddPaymentHomeUiStateInteractor$goBackFromInfoScreen$1) {
            addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1 = (AddPaymentHomeUiStateInteractor$goBackFromInfoScreen$1) continuationImpl;
            int i2 = addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mh0 mh0Var = this.g;
                    if (mh0Var == null) {
                        return Boolean.FALSE;
                    }
                    addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1.L$0 = null;
                    addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1.label = 1;
                    this.f.emit(mh0Var, addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1);
                    if (zy11.a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.g = null;
                return Boolean.TRUE;
            }
        }
        addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1 = new AddPaymentHomeUiStateInteractor$goBackFromInfoScreen$1(this, continuationImpl);
        Object obj2 = addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addPaymentHomeUiStateInteractor$goBackFromInfoScreen$1.label;
        if (i != 0) {
        }
        this.g = null;
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AddPaymentHomeResponse.HomeInfoScreen homeInfoScreen, uh0 uh0Var, ContinuationImpl continuationImpl) {
        AddPaymentHomeUiStateInteractor$mapInfoScreen$1 addPaymentHomeUiStateInteractor$mapInfoScreen$1;
        int i;
        ArrayList arrayList;
        String str;
        AddPaymentHomeResponse.HomeInfoScreen homeInfoScreen2;
        String str2;
        ArrayList arrayList2;
        ah0 ah0Var;
        if (continuationImpl instanceof AddPaymentHomeUiStateInteractor$mapInfoScreen$1) {
            addPaymentHomeUiStateInteractor$mapInfoScreen$1 = (AddPaymentHomeUiStateInteractor$mapInfoScreen$1) continuationImpl;
            int i2 = addPaymentHomeUiStateInteractor$mapInfoScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addPaymentHomeUiStateInteractor$mapInfoScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addPaymentHomeUiStateInteractor$mapInfoScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addPaymentHomeUiStateInteractor$mapInfoScreen$1.label;
                oh0 oh0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<AddPaymentHomeResponse.ActionButton> list = homeInfoScreen.b;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    for (AddPaymentHomeResponse.ActionButton actionButton : list) {
                        arrayList.add(new lh0(actionButton.a, actionButton.b, d(actionButton.c, uh0Var), e(actionButton.d)));
                    }
                    String str3 = homeInfoScreen.a;
                    AddPaymentHomeResponse.Footer footer = homeInfoScreen.c;
                    if (footer == null) {
                        str = str3;
                        return new qh0(str, arrayList, oh0Var, g(homeInfoScreen.d), homeInfoScreen.e);
                    }
                    com.yandex.go.payments.addmethod.data.model.c cVar = footer.b;
                    ah0 ah0Var2 = (cVar == null || !(cVar instanceof AddPaymentHomeResponse.OpenLinkAction)) ? null : new ah0(((AddPaymentHomeResponse.OpenLinkAction) cVar).a);
                    FormattedText formattedText = footer.a;
                    addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$0 = homeInfoScreen;
                    addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$1 = null;
                    addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$2 = null;
                    addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$3 = null;
                    addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$4 = ah0Var2;
                    addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$5 = str3;
                    addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$6 = arrayList;
                    addPaymentHomeUiStateInteractor$mapInfoScreen$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.c, formattedText, null, addPaymentHomeUiStateInteractor$mapInfoScreen$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    homeInfoScreen2 = homeInfoScreen;
                    str2 = str3;
                    arrayList2 = arrayList;
                    ah0Var = ah0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r10 = (List) addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$6;
                    str2 = (String) addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$5;
                    ah0Var = (ah0) addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$4;
                    homeInfoScreen2 = (AddPaymentHomeResponse.HomeInfoScreen) addPaymentHomeUiStateInteractor$mapInfoScreen$1.L$0;
                    kotlin.b.b(obj);
                    arrayList2 = r10;
                }
                oh0Var = new oh0((CharSequence) obj, ah0Var);
                arrayList = arrayList2;
                str = str2;
                homeInfoScreen = homeInfoScreen2;
                return new qh0(str, arrayList, oh0Var, g(homeInfoScreen.d), homeInfoScreen.e);
            }
        }
        addPaymentHomeUiStateInteractor$mapInfoScreen$1 = new AddPaymentHomeUiStateInteractor$mapInfoScreen$1(this, continuationImpl);
        Object obj2 = addPaymentHomeUiStateInteractor$mapInfoScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addPaymentHomeUiStateInteractor$mapInfoScreen$1.label;
        oh0 oh0Var2 = null;
        if (i != 0) {
        }
        oh0Var2 = new oh0((CharSequence) obj2, ah0Var);
        arrayList = arrayList2;
        str = str2;
        homeInfoScreen = homeInfoScreen2;
        return new qh0(str, arrayList, oh0Var2, g(homeInfoScreen.d), homeInfoScreen.e);
    }
}
