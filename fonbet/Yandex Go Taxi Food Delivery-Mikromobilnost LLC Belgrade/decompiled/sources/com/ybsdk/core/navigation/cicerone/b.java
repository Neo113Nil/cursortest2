package com.ybsdk.core.navigation.cicerone;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import defpackage.dlc;
import defpackage.i5z0;
import defpackage.j73;
import defpackage.jkc;
import defpackage.l131;
import defpackage.qq31;
import defpackage.tfl0;
import defpackage.tjc;
import defpackage.ujc;
import defpackage.vjc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class b extends tfl0 {
    public final qq31 b;
    public final l131 c;
    public List d;

    public b(qq31 qq31Var, l131 l131Var) {
        this.b = qq31Var;
        this.c = l131Var;
    }

    @Override // defpackage.i95
    public final void a(dlc... dlcVarArr) {
        OpenScreenRequirement openScreenRequirement;
        dlc dlcVar = (dlc) j73.D(dlcVarArr);
        boolean z = (dlcVar instanceof jkc) || ((dlcVar instanceof ujc) && ((ujc) dlcVar).a == null);
        OpenScreenRequirement openScreenRequirement2 = OpenScreenRequirement.WithoutRequirements.INSTANCE;
        for (dlc dlcVar2 : dlcVarArr) {
            if (dlcVar2 instanceof vjc) {
                openScreenRequirement = ((vjc) dlcVar2).a.getRequirements();
            } else if (dlcVar2 instanceof jkc) {
                openScreenRequirement = ((jkc) dlcVar2).a.getRequirements();
            } else {
                if (!(dlcVar2 instanceof tjc) && !(dlcVar2 instanceof ujc)) {
                    w511.b();
                    return;
                }
                openScreenRequirement = OpenScreenRequirement.WithoutRequirements.INSTANCE;
            }
            openScreenRequirement2 = (a.a(openScreenRequirement2) || a.a(openScreenRequirement)) ? OpenScreenRequirement.WithBuid.INSTANCE : (a.c(openScreenRequirement2) || a.c(openScreenRequirement)) ? OpenScreenRequirement.WithYbSession.INSTANCE : (a.b(openScreenRequirement2) || a.b(openScreenRequirement)) ? OpenScreenRequirement.WithUid.INSTANCE : OpenScreenRequirement.WithoutRequirements.INSTANCE;
        }
        if (((Boolean) this.b.invoke(openScreenRequirement2)).booleanValue()) {
            super.a((dlc[]) Arrays.copyOf(dlcVarArr, dlcVarArr.length));
            return;
        }
        i5z0.a.a("Verify screens " + j73.L(dlcVarArr, null, null, null, 63) + " requirements " + openScreenRequirement2 + " require resolve", new Object[0]);
        this.d = Arrays.asList(dlcVarArr);
        this.c.invoke(openScreenRequirement2, Boolean.valueOf(z));
    }

    @Override // defpackage.tfl0
    public final void d() {
        this.d = null;
    }

    @Override // defpackage.tfl0
    public final List g() {
        Screen screen;
        List<dlc> list = this.d;
        if (list == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (dlc dlcVar : list) {
            if (dlcVar instanceof vjc) {
                screen = ((vjc) dlcVar).a;
            } else if (dlcVar instanceof jkc) {
                screen = ((jkc) dlcVar).a;
            } else {
                if (!(dlcVar instanceof tjc) && !(dlcVar instanceof ujc)) {
                    w511.b();
                    return null;
                }
                screen = null;
            }
            if (screen != null) {
                arrayList.add(screen);
            }
        }
        return arrayList;
    }
}
