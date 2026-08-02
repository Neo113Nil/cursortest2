package com.ybsdk.screens.upgrade.presentation.edit;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$UpgradeDataEditExitType;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$UpgradeDataEditField;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$UpgradeDataEditInputType;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import defpackage.aes0;
import defpackage.ba21;
import defpackage.ca21;
import defpackage.da21;
import defpackage.des0;
import defpackage.ds31;
import defpackage.el11;
import defpackage.j3h;
import defpackage.np41;
import defpackage.pv01;
import defpackage.pz40;
import defpackage.qoi0;
import defpackage.rt1;
import defpackage.tfl0;
import defpackage.uc5;
import defpackage.w511;
import defpackage.z921;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b extends uc5 {
    public final com.ybsdk.screens.upgrade.domain.interactors.c B;
    public final des0 C;
    public final AppAnalyticsReporter D;
    public final com.ybsdk.rconfig.b E;
    public final np41 F;
    public final tfl0 G;
    public final j3h H;
    public ca21 I;

    public b(com.ybsdk.screens.upgrade.domain.interactors.c cVar, ba21 ba21Var, des0 des0Var, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.rconfig.b bVar, np41 np41Var, tfl0 tfl0Var, j3h j3hVar, UpgradeEditFragment.UpgradeEditScreenParams upgradeEditScreenParams) {
        super(new pv01(16, upgradeEditScreenParams), new el11(3, ba21Var));
        this.B = cVar;
        this.C = des0Var;
        this.D = appAnalyticsReporter;
        this.E = bVar;
        this.F = np41Var;
        this.G = tfl0Var;
        this.H = j3hVar;
        e.H(ds31.a(this), new o(new m0(cVar.f, cVar.g, new UpgradeEditViewModel$3(this, null)), new UpgradeEditViewModel$4(3, null)));
    }

    public final boolean b0() {
        List list;
        List list2;
        ca21 ca21Var = this.I;
        if (ca21Var != null) {
            e0(ca21Var, UpgradeEvents$UpgradeDataEditExitType.PREV);
        }
        zy11 zy11Var = null;
        this.I = null;
        SimpleIdFormFieldEntity.Companion.getClass();
        list = SimpleIdFormFieldEntity.sorted;
        int indexOf = list.indexOf(((z921) X()).a);
        Integer valueOf = Integer.valueOf(indexOf);
        if (indexOf == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue() - 1;
            list2 = SimpleIdFormFieldEntity.sorted;
            SimpleIdFormFieldEntity simpleIdFormFieldEntity = (SimpleIdFormFieldEntity) kotlin.collections.a.S(intValue, list2);
            if (simpleIdFormFieldEntity != null) {
                f0(z921.a((z921) X(), simpleIdFormFieldEntity, null, null, 6));
                zy11Var = zy11.a;
            }
        }
        return zy11Var != null;
    }

    public final void c0() {
        ca21 ca21Var = this.I;
        if (ca21Var != null) {
            e0(ca21Var, UpgradeEvents$UpgradeDataEditExitType.CLOSE);
        }
        this.I = null;
        tfl0.b(this.G, new FragmentScreen("UpgradeScreen", false, null, null, qoi0.a(UpgradeFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 14, null), null, false, 6);
    }

    public final void d0() {
        List list;
        List list2;
        List list3;
        this.D.s0.a.a("upgrade.click.ready", null);
        ca21 ca21Var = this.I;
        if (ca21Var != null) {
            e0(ca21Var, UpgradeEvents$UpgradeDataEditExitType.NEXT);
        }
        this.I = null;
        SimpleIdFormFieldEntity.Companion.getClass();
        list = SimpleIdFormFieldEntity.sorted;
        if (kotlin.collections.a.Z(list) == ((z921) X()).a) {
            tfl0.b(this.G, new FragmentScreen("UpgradeScreen", false, null, null, qoi0.a(UpgradeFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 14, null), null, false, 6);
            return;
        }
        list2 = SimpleIdFormFieldEntity.sorted;
        int indexOf = list2.indexOf(((z921) X()).a);
        Integer valueOf = Integer.valueOf(indexOf);
        if (indexOf == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue() + 1;
            list3 = SimpleIdFormFieldEntity.sorted;
            SimpleIdFormFieldEntity simpleIdFormFieldEntity = (SimpleIdFormFieldEntity) kotlin.collections.a.S(intValue, list3);
            if (simpleIdFormFieldEntity != null) {
                f0(z921.a((z921) X(), simpleIdFormFieldEntity, null, null, 6));
            }
        }
    }

    public final void e0(ca21 ca21Var, UpgradeEvents$UpgradeDataEditExitType upgradeEvents$UpgradeDataEditExitType) {
        UpgradeEvents$UpgradeDataEditField upgradeEvents$UpgradeDataEditField;
        boolean equals = ((z921) X()).b.b(((z921) X()).a).equals(ca21Var.a);
        boolean z = !equals;
        rt1 rt1Var = this.D.s0;
        switch (da21.a[((z921) X()).a.ordinal()]) {
            case 1:
                upgradeEvents$UpgradeDataEditField = UpgradeEvents$UpgradeDataEditField.BIRTHDAY;
                break;
            case 2:
                upgradeEvents$UpgradeDataEditField = UpgradeEvents$UpgradeDataEditField.LAST_NAME;
                break;
            case 3:
                upgradeEvents$UpgradeDataEditField = UpgradeEvents$UpgradeDataEditField.NAME;
                break;
            case 4:
                upgradeEvents$UpgradeDataEditField = UpgradeEvents$UpgradeDataEditField.MIDDLE_NAME;
                break;
            case 5:
                upgradeEvents$UpgradeDataEditField = UpgradeEvents$UpgradeDataEditField.INN;
                break;
            case 6:
                upgradeEvents$UpgradeDataEditField = UpgradeEvents$UpgradeDataEditField.PASSPORT;
                break;
            default:
                w511.b();
                return;
        }
        boolean z2 = ca21Var.a.length() == 0;
        boolean z3 = ((z921) X()).b.b(((z921) X()).a).length() == 0;
        boolean equals2 = this.C.e(((z921) X()).a, ((z921) X()).b.b(((z921) X()).a)).equals(aes0.a);
        UpgradeEvents$UpgradeDataEditInputType upgradeEvents$UpgradeDataEditInputType = equals ? null : ca21Var.b ? UpgradeEvents$UpgradeDataEditInputType.SUGGEST : UpgradeEvents$UpgradeDataEditInputType.MANUAL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(7);
        linkedHashMap.put("field", upgradeEvents$UpgradeDataEditField.getOriginalValue());
        linkedHashMap.put("was blank", Boolean.valueOf(z2));
        linkedHashMap.put("is blank", Boolean.valueOf(z3));
        linkedHashMap.put("has changed", Boolean.valueOf(z));
        if (upgradeEvents$UpgradeDataEditInputType != null) {
            linkedHashMap.put("input type", upgradeEvents$UpgradeDataEditInputType.getOriginalValue());
        }
        linkedHashMap.put("is valid", Boolean.valueOf(equals2));
        linkedHashMap.put("exit type", upgradeEvents$UpgradeDataEditExitType.getOriginalValue());
        rt1Var.a.a("upgrade.data.edit", linkedHashMap);
    }

    public final void f0(z921 z921Var) {
        r0 r0Var;
        Object value;
        SimpleIdFormFieldEntity simpleIdFormFieldEntity = z921Var.a;
        if (this.I == null) {
            this.I = new ca21(z921Var.b.b(simpleIdFormFieldEntity), false, false);
        }
        int i = da21.a[simpleIdFormFieldEntity.ordinal()];
        AppAnalyticsReporter appAnalyticsReporter = this.D;
        switch (i) {
            case 1:
                appAnalyticsReporter.s0.a.a("upgrade.birthday.open", null);
                break;
            case 2:
                appAnalyticsReporter.s0.a.a("upgrade.last_name.open", null);
                break;
            case 3:
                appAnalyticsReporter.s0.a.a("upgrade.first_name.open", null);
                break;
            case 4:
                appAnalyticsReporter.s0.a.a("upgrade.patronymic_name.open", null);
                break;
            case 5:
                appAnalyticsReporter.s0.a.a("upgrade.passport_inn.open", null);
                break;
            case 6:
                appAnalyticsReporter.s0.a.a("upgrade.passport.open", null);
                break;
            default:
                w511.b();
                return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, z921Var));
    }
}
