package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment;
import com.yandex.messaging.ui.creation.component.TelemessengerCreationDialogFragment;
import com.yandex.messaging.ui.urlpreview.joinchat.JoinWallFragment;
import com.yandex.messaging.ui.urlpreview.joinchat.a;
import com.ybsdk.feature.savings.internal.entities.CellType;
import com.ybsdk.feature.savings.internal.entities.SavingProductType;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;

/* loaded from: classes11.dex */
public final class bab implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bab(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zj zjVar;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                ((Number) obj3).intValue();
                hlb1.a(wwg.S(785229519, true, new ut9(i2, (ChatThreadsContainerFragment) obj4, (rwi) obj), fidVar), fidVar, 6);
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                ((Number) obj3).intValue();
                hlb1.a(wwg.S(599514334, true, new vs4(i2, (ComposeBottomSheetDialogFragment) obj4), fidVar2), fidVar2, 6);
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                ((Number) obj3).intValue();
                hlb1.a(wwg.S(1463322222, true, new vs4((ComposeMessengerFragment) obj4, (rwi) obj), fidVar3), fidVar3, 6);
                return zy11Var;
            case 3:
                long j = ((ldc) obj).a;
                fid fidVar4 = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= fidVar4.d(j) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar4;
                if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    cmh.b(((hly0) obj4).c, (intValue << 3) & 112, j, btsVar);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 4:
                dj6 dj6Var = (dj6) obj;
                fid fidVar5 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar5).k(dj6Var) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    bts btsVar2 = (bts) fidVar5;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                }
                qnm.c.getClass();
                float d = dj6Var.d() - 72.0f;
                c530 c530Var = c530.a;
                f530 w = ljs0.w(c530Var, 3);
                bts btsVar3 = (bts) fidVar5;
                btsVar3.e0(1849434622);
                Object Q = btsVar3.Q();
                if (Q == did.a) {
                    Q = new c0m(26);
                    btsVar3.o0(Q);
                }
                btsVar3.t(false);
                f530 b = fnq0.b(w, false, (tls) Q);
                qnm.d.getClass();
                fqm fqmVar = (fqm) obj4;
                lhl0 a = khl0.a(new i43(16.0f, true, new quz(11)), x4c.D, btsVar3, 0);
                int hashCode = Long.hashCode(btsVar3.T);
                r1b0 o = btsVar3.o();
                f530 d2 = b.d(btsVar3, b);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar3.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, d.f, a);
                qje.W(btsVar3, d.e, o);
                wls wlsVar = d.g;
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar3, hashCode, wlsVar);
                }
                qje.W(btsVar3, d.d, d2);
                btsVar3.e0(-808060049);
                if ((fqmVar != null ? fqmVar.c : null) != null) {
                    mo91.g(fqmVar.a, fqmVar.b, fqmVar.c, ljs0.s(c530Var, 0.0f, d, 1), null, false, false, btsVar3, 0, 496);
                }
                btsVar3.t(false);
                btsVar3.e0(-808046404);
                btsVar3.t(false);
                btsVar3.t(true);
                return zy11Var;
            case 5:
                fid fidVar6 = (fid) obj2;
                ((Number) obj3).intValue();
                hlb1.a(wwg.S(-875613887, true, new a((JoinWallFragment) obj4, false ? 1 : 0), fidVar6), fidVar6, 6);
                return zy11Var;
            case 6:
                ((Number) obj3).intValue();
                ((wls) obj4).invoke((fid) obj2, 0);
                return zy11Var;
            case 7:
                fid fidVar7 = (fid) obj2;
                int intValue3 = ((Number) obj3).intValue();
                bts btsVar4 = (bts) fidVar7;
                if (btsVar4.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ((r2l0) obj4).getClass();
                    jeb1.f("", null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.b, btsVar4, 0, 0, 16382);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 8:
                String str = ((jr) obj).a;
                CellType cellType = (CellType) obj2;
                SavingProductType savingProductType = (SavingProductType) obj3;
                com.ybsdk.feature.savings.internal.screens.dashboard.a access$getViewModel = SavingsDashboardFragmentV2.access$getViewModel((SavingsDashboardFragmentV2) obj4);
                if (!((ndm0) access$getViewModel.C).b()) {
                    access$getViewModel.I.o(str, cellType, savingProductType);
                }
                ((vcm0) access$getViewModel.D).a(str);
                return zy11Var;
            case 9:
                String str2 = ((jr) obj).a;
                CellType cellType2 = (CellType) obj2;
                SavingProductType savingProductType2 = (SavingProductType) obj3;
                zjVar = ((SavingsShelfView) obj4).accountCallbacks;
                if (zjVar != null) {
                    c cVar = (c) zjVar;
                    cVar.H.o(str2, cellType2, savingProductType2);
                    ((vcm0) cVar.E).a(str2);
                }
                return zy11Var;
            case 10:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar8 = (fid) obj2;
                int intValue4 = ((Number) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar8).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar8;
                if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    m9b1.a(ebp0Var, ((ctm0) obj4).b.a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar5, intValue4 & 14, 0, 16382);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 11:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar9 = (fid) obj2;
                int intValue5 = ((Number) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar9).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar6 = (bts) fidVar9;
                if (btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    p9b1.c(ebp0Var2, ((hpn0) obj4).c, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar6, intValue5 & 14, 0, 8190);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar10 = (fid) obj2;
                int intValue6 = ((Number) obj3).intValue();
                bts btsVar7 = (bts) fidVar10;
                if (btsVar7.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    jeb1.f(((dsn0) obj4).c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar7, 0, 0, 32766);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 13:
                ((Number) obj).intValue();
                rcx0 rcx0Var = (rcx0) obj2;
                int intValue7 = ((Number) obj3).intValue();
                ((dex0) obj4).getClass();
                if (rcx0Var instanceof amj0) {
                    amj0 amj0Var = (amj0) rcx0Var;
                    return amj0.a(amj0Var, qv10.h(intValue7, amj0Var.a, "__local_fix_"), null, 8190);
                }
                if (!(rcx0Var instanceof prl)) {
                    return rcx0Var;
                }
                prl prlVar = (prl) rcx0Var;
                String h = qv10.h(intValue7, prlVar.getItemId(), "__local_fix_");
                if (prlVar instanceof krl) {
                    return new krl(h, ((krl) rcx0Var).b);
                }
                if (prlVar instanceof lrl) {
                    return new lrl(h, ((lrl) rcx0Var).b);
                }
                if (prlVar instanceof orl) {
                    orl orlVar = (orl) rcx0Var;
                    return new orl(h, orlVar.b, orlVar.c);
                }
                if (prlVar instanceof nrl) {
                    return new nrl(h, ((nrl) rcx0Var).b);
                }
                if (prlVar instanceof jrl) {
                    return new jrl(h, ((jrl) rcx0Var).b);
                }
                if (prlVar instanceof mrl) {
                    return new mrl(h, ((mrl) rcx0Var).b);
                }
                if (prlVar instanceof irl) {
                    irl irlVar = (irl) rcx0Var;
                    return new irl(h, irlVar.b, irlVar.c, irlVar.d, irlVar.e, irlVar.f, irlVar.g);
                }
                w511.b();
                return null;
            case 14:
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar11 = (fid) obj2;
                int intValue8 = ((Number) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar11).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar11;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    p9b1.c(ebp0Var3, ((tyx0) obj4).b, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar8, intValue8 & 14, 0, 8190);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 15:
                fid fidVar12 = (fid) obj2;
                ((Number) obj3).intValue();
                hlb1.a(wwg.S(1478604764, true, new vs4(29, (TelemessengerCreationDialogFragment) obj4), fidVar12), fidVar12, 6);
                return zy11Var;
            case 16:
                long j2 = ((ldc) obj).a;
                fid fidVar13 = (fid) obj2;
                int intValue9 = ((Number) obj3).intValue();
                bts btsVar9 = (bts) fidVar13;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    gly0.a.i((Drawable) obj4, btsVar9, 48);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 17:
                long j3 = ((ldc) obj).a;
                fid fidVar14 = (fid) obj2;
                int intValue10 = ((Number) obj3).intValue();
                bts btsVar10 = (bts) fidVar14;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    gly0.a.l(((RemoteAction) obj4).getIcon(), btsVar10, 48);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            default:
                fid fidVar15 = (fid) obj2;
                int intValue11 = ((Number) obj3).intValue();
                bts btsVar11 = (bts) fidVar15;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    qgy.b(((rx41) obj4).a.c, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar11).g.b, null, btsVar11, 0, 0, 12286);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
        }
    }
}
