package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.DayOfWeek;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.autotopup.internal.presentation.saver.helpers.AutoTopupRegularSettingsValidationHelper;
import defpackage.asi0;
import defpackage.csi0;
import defpackage.dk11;
import defpackage.dzh0;
import defpackage.f5a0;
import defpackage.giq0;
import defpackage.h5a0;
import defpackage.jl40;
import defpackage.lrp0;
import defpackage.nx3;
import defpackage.oz3;
import defpackage.pz40;
import defpackage.qx3;
import defpackage.r7b1;
import defpackage.rgq0;
import defpackage.sgq0;
import defpackage.sls;
import defpackage.t170;
import defpackage.u170;
import defpackage.uc5;
import defpackage.v170;
import defpackage.vou0;
import defpackage.w170;
import defpackage.w511;
import defpackage.x4c;
import defpackage.z630;
import defpackage.zri0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupRegularFragment$getViewBinding$1$15 extends FunctionReferenceImpl implements sls {
    public AutoTopupRegularFragment$getViewBinding$1$15(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onPrimaryClick", "onPrimaryClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        boolean z;
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        u170 u170Var;
        csi0 csi0Var;
        r0 r0Var;
        Object value;
        oz3 oz3Var;
        vou0 vou0Var;
        MoneyEntity moneyEntity3;
        MoneyEntity moneyEntity4;
        a aVar = (a) this.receiver;
        aVar.L.F(RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton.ACTIVATE_BUTTON, aVar.B, (qx3) aVar.X());
        asi0 asi0Var = (asi0) ((qx3) aVar.X()).e.a();
        boolean z2 = false;
        boolean z3 = (asi0Var != null ? asi0Var.h : null) != null;
        asi0 asi0Var2 = (asi0) ((qx3) aVar.X()).e.a();
        if (jl40.l(((qx3) aVar.X()).f, asi0Var2 != null ? asi0Var2.h : null)) {
            rgq0 rgq0Var = ((qx3) aVar.X()).c;
            giq0 giq0Var = (asi0Var2 == null || (csi0Var = asi0Var2.a) == null) ? null : csi0Var.e;
            FrequencyType frequencyType = rgq0Var.a;
            if (frequencyType == (giq0Var != null ? giq0Var.a : null)) {
                int i = sgq0.a[frequencyType.ordinal()];
                if (i == 1) {
                    v170 v170Var = rgq0Var.b;
                    DayOfWeek dayOfWeek = v170Var.a;
                    z2 = jl40.l((dayOfWeek == null || (moneyEntity = v170Var.b) == null) ? null : new w170(dayOfWeek, moneyEntity), giq0Var.b);
                } else if (i == 2) {
                    t170 t170Var = rgq0Var.c;
                    boolean z4 = t170Var.c;
                    Integer num = t170Var.a;
                    if ((num != null || z4) && (moneyEntity2 = t170Var.b) != null) {
                        if (z4) {
                            num = null;
                        }
                        u170Var = new u170(num, moneyEntity2, z4);
                    } else {
                        u170Var = null;
                    }
                    z2 = jl40.l(u170Var, giq0Var.c);
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    z2 = jl40.l(r7b1.c(rgq0Var.d), giq0Var.d);
                }
            }
            z = !z2;
        } else {
            z = true;
        }
        if (z || !z3) {
            csi0 b = ((qx3) aVar.X()).b();
            if ((b != null ? b.d : null) == null) {
                x4c.g("Can't validate without limits info", null, null, Collections.singletonList(lrp0.c), 6);
            } else {
                AutoTopupRegularSettingsValidationHelper autoTopupRegularSettingsValidationHelper = aVar.F;
                BigDecimal valueOf = BigDecimal.valueOf(r1.b);
                BigDecimal valueOf2 = BigDecimal.valueOf(r1.a);
                h5a0 h5a0Var = ((qx3) aVar.X()).f;
                rgq0 rgq0Var2 = ((qx3) aVar.X()).c;
                autoTopupRegularSettingsValidationHelper.getClass();
                v170 v170Var2 = rgq0Var2.b;
                t170 t170Var2 = rgq0Var2.c;
                dk11 dk11Var = rgq0Var2.d;
                z630 z630Var = dk11Var.a;
                ArrayList arrayList = new ArrayList();
                if (h5a0Var == null) {
                    arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.SOURCE_NOT_SELECTED);
                }
                int i2 = nx3.a[rgq0Var2.a.ordinal()];
                if (i2 == 1) {
                    if (v170Var2.a == null) {
                        arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.DATE_MISSING_FIRST);
                    }
                    MoneyEntity moneyEntity5 = v170Var2.b;
                    BigDecimal amount = moneyEntity5 != null ? moneyEntity5.getAmount() : null;
                    if (amount == null || amount.compareTo(valueOf) < 0 || amount.compareTo(valueOf2) > 0) {
                        arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.AMOUNT_WRONG_FIRST);
                    }
                } else if (i2 == 2) {
                    if (t170Var2.a == null && !t170Var2.c) {
                        arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.DATE_MISSING_FIRST);
                    }
                    MoneyEntity moneyEntity6 = t170Var2.b;
                    BigDecimal amount2 = moneyEntity6 != null ? moneyEntity6.getAmount() : null;
                    if (amount2 == null || amount2.compareTo(valueOf) < 0 || amount2.compareTo(valueOf2) > 0) {
                        arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.AMOUNT_WRONG_FIRST);
                    }
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    z630 z630Var2 = dk11Var.b;
                    if ((z630Var != null ? z630Var.a : null) == null) {
                        arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.DATE_MISSING_FIRST);
                    }
                    BigDecimal amount3 = (z630Var == null || (moneyEntity4 = z630Var.b) == null) ? null : moneyEntity4.getAmount();
                    if (amount3 == null || amount3.compareTo(valueOf) < 0 || amount3.compareTo(valueOf2) > 0) {
                        arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.AMOUNT_WRONG_FIRST);
                    }
                    if ((z630Var2 != null ? z630Var2.a : null) == null) {
                        arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.DATE_MISSING_SECOND);
                    }
                    BigDecimal amount4 = (z630Var2 == null || (moneyEntity3 = z630Var2.b) == null) ? null : moneyEntity3.getAmount();
                    if (amount4 == null || amount4.compareTo(valueOf) < 0 || amount4.compareTo(valueOf2) > 0) {
                        arrayList.add(AutoTopupRegularSettingsValidationHelper.Errors.AMOUNT_WRONG_SECOND);
                    }
                }
                if (arrayList.isEmpty()) {
                    asi0 asi0Var3 = (asi0) ((qx3) aVar.X()).e.a();
                    vou0 vou0Var2 = (asi0Var3 == null || (oz3Var = asi0Var3.j) == null || (vou0Var = oz3Var.a) == null || ((qx3) aVar.X()).c()) ? null : vou0Var;
                    if (vou0Var2 == null || (((qx3) aVar.X()).f instanceof f5a0)) {
                        zri0 g0 = aVar.g0(null);
                        if (g0 != null) {
                            aVar.K0(g0);
                        }
                    } else {
                        pz40 Y = aVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, qx3.a((qx3) value, null, vou0Var2, null, null, null, null, null, false, 253)));
                    }
                } else {
                    com.ybsdk.core.utils.text.b bVar = Text.Companion;
                    int i3 = dzh0.ybsdk_auto_topup_regular_all_fields_mandatory;
                    bVar.getClass();
                    a.M0(aVar, new Text.Resource(i3));
                    pz40 Y2 = aVar.Y();
                    while (true) {
                        r0 r0Var2 = (r0) Y2;
                        Object value2 = r0Var2.getValue();
                        ArrayList arrayList2 = arrayList;
                        if (r0Var2.k(value2, qx3.a((qx3) value2, null, null, null, arrayList2, null, null, null, false, 247))) {
                            break;
                        }
                        arrayList = arrayList2;
                    }
                }
            }
        } else {
            aVar.C.e();
        }
        return zy11.a;
    }
}
