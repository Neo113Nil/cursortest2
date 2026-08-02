package com.yandex.go.chargers.debt.screen.data;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.chargers.data.model.ChargersDebt;
import defpackage.bia0;
import defpackage.d9s;
import defpackage.fl8;
import defpackage.gl;
import defpackage.gwk0;
import defpackage.hfa0;
import defpackage.ief;
import defpackage.jq9;
import defpackage.kyh0;
import defpackage.lea0;
import defpackage.lq9;
import defpackage.m6a0;
import defpackage.mq9;
import defpackage.ny61;
import defpackage.oq9;
import defpackage.pq9;
import defpackage.qq9;
import defpackage.rea0;
import defpackage.rq9;
import defpackage.sea0;
import defpackage.sq9;
import defpackage.tje;
import defpackage.up9;
import defpackage.x2h0;
import defpackage.xdf;
import defpackage.yy51;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;
    public final xdf b;
    public final e c;
    public final bia0 d;
    public final rea0 e;

    public a(Context context, xdf xdfVar, e eVar, bia0 bia0Var, rea0 rea0Var) {
        this.a = context;
        this.b = xdfVar;
        this.c = eVar;
        this.d = bia0Var;
        this.e = rea0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersDebt chargersDebt, hfa0 hfa0Var, up9 up9Var, ContinuationImpl continuationImpl) {
        ChargersDebtUiStateMapper$mapToChargersDebtUiState$1 chargersDebtUiStateMapper$mapToChargersDebtUiState$1;
        Object obj;
        int i;
        FormattedText formattedText;
        hfa0 hfa0Var2;
        ChargersDebt chargersDebt2;
        up9 up9Var2;
        Object x;
        CharSequence charSequence;
        hfa0 hfa0Var3;
        lea0 b;
        pq9 pq9Var;
        Object b2;
        up9 up9Var3;
        CharSequence charSequence2;
        rq9 rq9Var;
        lea0 b3;
        Context context;
        if (continuationImpl instanceof ChargersDebtUiStateMapper$mapToChargersDebtUiState$1) {
            chargersDebtUiStateMapper$mapToChargersDebtUiState$1 = (ChargersDebtUiStateMapper$mapToChargersDebtUiState$1) continuationImpl;
            int i2 = chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersDebtUiStateMapper$mapToChargersDebtUiState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label;
                pq9 pq9Var2 = lq9.a;
                e eVar = this.c;
                if (i != 0) {
                    b.b(obj2);
                    FormattedText formattedText2 = chargersDebt.a;
                    if (formattedText2 != null) {
                        ief iefVar = chargersDebt.i;
                        if (iefVar == null) {
                            iefVar = ief.e;
                        }
                        formattedText = d9s.c(formattedText2, this.b, gwk0.h(iefVar), true);
                    } else {
                        formattedText = null;
                    }
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$0 = chargersDebt;
                    hfa0Var2 = hfa0Var;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1 = hfa0Var2;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2 = up9Var;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$3 = null;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$4 = null;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$5 = null;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label = 1;
                    obj2 = eVar.x(formattedText, chargersDebtUiStateMapper$mapToChargersDebtUiState$1);
                    if (obj2 != obj) {
                        chargersDebt2 = chargersDebt;
                        up9Var2 = up9Var;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rq9 rq9Var2 = (rq9) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$5;
                        CharSequence charSequence3 = (CharSequence) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$4;
                        charSequence = (CharSequence) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$3;
                        up9Var3 = (up9) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2;
                        hfa0Var3 = (hfa0) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1;
                        b.b(obj2);
                        rq9Var = rq9Var2;
                        charSequence2 = charSequence3;
                        CharSequence charSequence4 = charSequence;
                        qq9 qq9Var = (qq9) obj2;
                        if (hfa0Var3.d() != null) {
                            pq9Var2 = new jq9();
                        }
                        b3 = hfa0Var3.b();
                        context = this.a;
                        if (b3 != null || (r3 = bia0.a(this.d, context, b3)) == null) {
                            Drawable y = tje.y(x2h0.ic_payment_undefined, context);
                        }
                        boolean z = !up9Var3.a();
                        String string = eVar.a.getString(kyh0.scooters_payment_method);
                        String a = b3 != null ? ((sea0) this.e).a(context, b3) : null;
                        gl glVar = new gl();
                        glVar.b = pq9Var2;
                        glVar.a = z;
                        glVar.c = y;
                        glVar.w = string;
                        glVar.x = a;
                        return new sq9(charSequence4, charSequence2, rq9Var, qq9Var, glVar);
                    }
                    CharSequence charSequence5 = (CharSequence) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$3;
                    up9 up9Var4 = (up9) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2;
                    hfa0Var3 = (hfa0) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1;
                    chargersDebt2 = (ChargersDebt) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$0;
                    b.b(obj2);
                    charSequence = charSequence5;
                    up9Var2 = up9Var4;
                    CharSequence charSequence6 = (CharSequence) obj2;
                    boolean a2 = up9Var2.a();
                    b = hfa0Var3.b();
                    m6a0 d = hfa0Var3.d();
                    if (b == null && d != null && b.e()) {
                        if ((b instanceof fl8) || (b instanceof yy51)) {
                            String str = chargersDebt2.g;
                            if (str == null) {
                                str = "";
                            }
                            pq9Var = new oq9(str, d);
                            rq9 rq9Var3 = new rq9(pq9Var, !a2, eVar.a.getString(a2 ? kyh0.scooters_card_button_on_loading : kyh0.scooters_you_have_a_dept_btn), a2);
                            chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$0 = null;
                            chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1 = hfa0Var3;
                            chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2 = up9Var2;
                            chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$3 = charSequence;
                            chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$4 = charSequence6;
                            chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$5 = rq9Var3;
                            chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label = 3;
                            b2 = b(chargersDebt2, up9Var2, chargersDebtUiStateMapper$mapToChargersDebtUiState$1);
                            if (b2 != obj) {
                                up9Var3 = up9Var2;
                                charSequence2 = charSequence6;
                                obj2 = b2;
                                rq9Var = rq9Var3;
                                CharSequence charSequence42 = charSequence;
                                qq9 qq9Var2 = (qq9) obj2;
                                if (hfa0Var3.d() != null) {
                                }
                                b3 = hfa0Var3.b();
                                context = this.a;
                                if (b3 != null) {
                                }
                                Drawable y2 = tje.y(x2h0.ic_payment_undefined, context);
                                boolean z2 = !up9Var3.a();
                                String string2 = eVar.a.getString(kyh0.scooters_payment_method);
                                if (b3 != null) {
                                }
                                gl glVar2 = new gl();
                                glVar2.b = pq9Var2;
                                glVar2.a = z2;
                                glVar2.c = y2;
                                glVar2.w = string2;
                                glVar2.x = a;
                                return new sq9(charSequence42, charSequence2, rq9Var, qq9Var2, glVar2);
                            }
                            return obj;
                        }
                    }
                    pq9Var = pq9Var2;
                    rq9 rq9Var32 = new rq9(pq9Var, !a2, eVar.a.getString(a2 ? kyh0.scooters_card_button_on_loading : kyh0.scooters_you_have_a_dept_btn), a2);
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$0 = null;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1 = hfa0Var3;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2 = up9Var2;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$3 = charSequence;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$4 = charSequence6;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$5 = rq9Var32;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label = 3;
                    b2 = b(chargersDebt2, up9Var2, chargersDebtUiStateMapper$mapToChargersDebtUiState$1);
                    if (b2 != obj) {
                    }
                    return obj;
                }
                up9Var2 = (up9) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2;
                hfa0Var2 = (hfa0) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1;
                chargersDebt2 = (ChargersDebt) chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$0;
                b.b(obj2);
                CharSequence charSequence7 = (CharSequence) obj2;
                FormattedText formattedText3 = chargersDebt2.b;
                chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$0 = chargersDebt2;
                chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1 = hfa0Var2;
                chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2 = up9Var2;
                chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$3 = charSequence7;
                chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$4 = null;
                chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$5 = null;
                chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label = 2;
                x = eVar.x(formattedText3, chargersDebtUiStateMapper$mapToChargersDebtUiState$1);
                if (x != obj) {
                    hfa0 hfa0Var4 = hfa0Var2;
                    charSequence = charSequence7;
                    obj2 = x;
                    hfa0Var3 = hfa0Var4;
                    CharSequence charSequence62 = (CharSequence) obj2;
                    boolean a22 = up9Var2.a();
                    b = hfa0Var3.b();
                    m6a0 d2 = hfa0Var3.d();
                    if (b == null) {
                    }
                    pq9Var = pq9Var2;
                    rq9 rq9Var322 = new rq9(pq9Var, !a22, eVar.a.getString(a22 ? kyh0.scooters_card_button_on_loading : kyh0.scooters_you_have_a_dept_btn), a22);
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$0 = null;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1 = hfa0Var3;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2 = up9Var2;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$3 = charSequence;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$4 = charSequence62;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$5 = rq9Var322;
                    chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label = 3;
                    b2 = b(chargersDebt2, up9Var2, chargersDebtUiStateMapper$mapToChargersDebtUiState$1);
                    if (b2 != obj) {
                    }
                }
                return obj;
            }
        }
        chargersDebtUiStateMapper$mapToChargersDebtUiState$1 = new ChargersDebtUiStateMapper$mapToChargersDebtUiState$1(this, continuationImpl);
        Object obj22 = chargersDebtUiStateMapper$mapToChargersDebtUiState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label;
        pq9 pq9Var22 = lq9.a;
        e eVar2 = this.c;
        if (i != 0) {
        }
        CharSequence charSequence72 = (CharSequence) obj22;
        FormattedText formattedText32 = chargersDebt2.b;
        chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$0 = chargersDebt2;
        chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$1 = hfa0Var2;
        chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$2 = up9Var2;
        chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$3 = charSequence72;
        chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$4 = null;
        chargersDebtUiStateMapper$mapToChargersDebtUiState$1.L$5 = null;
        chargersDebtUiStateMapper$mapToChargersDebtUiState$1.label = 2;
        x = eVar2.x(formattedText32, chargersDebtUiStateMapper$mapToChargersDebtUiState$1);
        if (x != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChargersDebt chargersDebt, up9 up9Var, ContinuationImpl continuationImpl) {
        ChargersDebtUiStateMapper$prepareDebtOrderInfo$1 chargersDebtUiStateMapper$prepareDebtOrderInfo$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        pq9 pq9Var;
        FormattedText formattedText;
        int i2;
        ChargersDebt chargersDebt2;
        int i3;
        Object x;
        CharSequence charSequence;
        pq9 pq9Var2;
        Object x2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        pq9 pq9Var3;
        if (continuationImpl instanceof ChargersDebtUiStateMapper$prepareDebtOrderInfo$1) {
            chargersDebtUiStateMapper$prepareDebtOrderInfo$1 = (ChargersDebtUiStateMapper$prepareDebtOrderInfo$1) continuationImpl;
            int i4 = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label = i4 - Integer.MIN_VALUE;
                Object obj = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label;
                e eVar = this.c;
                if (i != 0) {
                    b.b(obj);
                    int i5 = chargersDebt.h == ChargersDebt.OrderStatus.FINISHED ? 1 : 0;
                    pq9Var = i5 != 0 ? mq9.a : null;
                    int i6 = !up9Var.a() ? 1 : 0;
                    FormattedText formattedText2 = chargersDebt.e;
                    if (formattedText2 != null) {
                        ief iefVar = chargersDebt.i;
                        if (iefVar == null) {
                            iefVar = ief.e;
                        }
                        formattedText = d9s.c(formattedText2, this.b, gwk0.h(iefVar), true);
                    } else {
                        formattedText = null;
                    }
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$0 = chargersDebt;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$1 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$2 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$3 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$4 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$5 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$6 = pq9Var;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$0 = i5;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$1 = i6;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label = 1;
                    Object x3 = eVar.x(formattedText, chargersDebtUiStateMapper$prepareDebtOrderInfo$1);
                    if (x3 != coroutineSingletons) {
                        int i7 = i5;
                        obj = x3;
                        i2 = i6;
                        chargersDebt2 = chargersDebt;
                        i3 = i7;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$1;
                        CharSequence charSequence4 = (CharSequence) chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$5;
                        CharSequence charSequence5 = (CharSequence) chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$4;
                        pq9 pq9Var4 = (pq9) chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$3;
                        b.b(obj);
                        charSequence2 = charSequence4;
                        charSequence3 = charSequence5;
                        pq9Var3 = pq9Var4;
                        return new qq9(pq9Var3, i2 == 0, charSequence3, charSequence2, (CharSequence) obj);
                    }
                    i2 = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$1;
                    i3 = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$0;
                    charSequence = (CharSequence) chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$4;
                    pq9Var2 = (pq9) chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$3;
                    chargersDebt2 = (ChargersDebt) chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$0;
                    b.b(obj);
                    CharSequence charSequence6 = (CharSequence) obj;
                    FormattedText formattedText3 = chargersDebt2.d;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$0 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$1 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$2 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$3 = pq9Var2;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$4 = charSequence;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$5 = charSequence6;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$0 = i3;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$1 = i2;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label = 3;
                    x2 = eVar.x(formattedText3, chargersDebtUiStateMapper$prepareDebtOrderInfo$1);
                    if (x2 != coroutineSingletons) {
                        charSequence2 = charSequence6;
                        charSequence3 = charSequence;
                        pq9Var3 = pq9Var2;
                        obj = x2;
                        return new qq9(pq9Var3, i2 == 0, charSequence3, charSequence2, (CharSequence) obj);
                    }
                    return coroutineSingletons;
                }
                i2 = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$1;
                i3 = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$0;
                pq9Var = (pq9) chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$6;
                chargersDebt2 = (ChargersDebt) chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$0;
                b.b(obj);
                CharSequence charSequence7 = (CharSequence) obj;
                FormattedText formattedText4 = chargersDebt2.c;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$0 = chargersDebt2;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$1 = null;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$2 = null;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$3 = pq9Var;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$4 = charSequence7;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$5 = null;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$6 = null;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$0 = i3;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$1 = i2;
                chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label = 2;
                x = eVar.x(formattedText4, chargersDebtUiStateMapper$prepareDebtOrderInfo$1);
                if (x != coroutineSingletons) {
                    pq9 pq9Var5 = pq9Var;
                    charSequence = charSequence7;
                    obj = x;
                    pq9Var2 = pq9Var5;
                    CharSequence charSequence62 = (CharSequence) obj;
                    FormattedText formattedText32 = chargersDebt2.d;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$0 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$1 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$2 = null;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$3 = pq9Var2;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$4 = charSequence;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$5 = charSequence62;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$0 = i3;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$1 = i2;
                    chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label = 3;
                    x2 = eVar.x(formattedText32, chargersDebtUiStateMapper$prepareDebtOrderInfo$1);
                    if (x2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1 = new ChargersDebtUiStateMapper$prepareDebtOrderInfo$1(this, continuationImpl);
        Object obj2 = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label;
        e eVar2 = this.c;
        if (i != 0) {
        }
        CharSequence charSequence72 = (CharSequence) obj2;
        FormattedText formattedText42 = chargersDebt2.c;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$0 = chargersDebt2;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$1 = null;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$2 = null;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$3 = pq9Var;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$4 = charSequence72;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$5 = null;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.L$6 = null;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$0 = i3;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.I$1 = i2;
        chargersDebtUiStateMapper$prepareDebtOrderInfo$1.label = 2;
        x = eVar2.x(formattedText42, chargersDebtUiStateMapper$prepareDebtOrderInfo$1);
        if (x != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
