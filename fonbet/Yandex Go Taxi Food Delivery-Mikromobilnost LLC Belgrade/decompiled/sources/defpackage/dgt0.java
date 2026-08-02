package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import java.util.LinkedList;
import ru.yandex.taxi.orderforanother.v1.ui.WhoRideSelectorModalView;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes6.dex */
public final class dgt0 implements v030, cgt0 {
    public final kqv0 A;
    public final bwx0 B;
    public final uq40 C;
    public final yit0 D;
    public final vvx0 E;
    public final wjt0 F;
    public final fy01 a;
    public final rgt0 b;
    public final oft0 c;
    public final git0 w;
    public final svw x;
    public final kpi0 y;
    public final mxg z;

    public dgt0(fy01 fy01Var, rgt0 rgt0Var, oft0 oft0Var, git0 git0Var, svw svwVar, kpi0 kpi0Var, mxg mxgVar, kqv0 kqv0Var, bwx0 bwx0Var, uq40 uq40Var, yit0 yit0Var, vvx0 vvx0Var, wjt0 wjt0Var) {
        this.a = fy01Var;
        this.b = rgt0Var;
        this.c = oft0Var;
        this.w = git0Var;
        this.x = svwVar;
        this.y = kpi0Var;
        this.z = mxgVar;
        this.A = kqv0Var;
        this.B = bwx0Var;
        this.C = uq40Var;
        this.D = yit0Var;
        this.E = vvx0Var;
        this.F = wjt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
    
        if (defpackage.jl40.l(r8 != null ? r8.getModalScreenName() : null, "RouteStopsV2Router") != false) goto L65;
     */
    @Override // defpackage.v030
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        boolean z = modalViewCoordinator$StackChangeType == ModalViewCoordinator$StackChangeType.PUSH;
        boolean z2 = modalViewCoordinator$StackChangeType == ModalViewCoordinator$StackChangeType.POLL;
        if (modalViewCoordinator$StackChangeType == ModalViewCoordinator$StackChangeType.CLEAN) {
            return;
        }
        oft0 oft0Var = this.c;
        if (u45Var2 == null) {
            if (this.z.a()) {
                this.A.a();
            }
            oft0Var.a.clear();
        } else if (z) {
            if (u45Var2 instanceof kca0) {
                LinkedList linkedList = oft0Var.a;
                nft0.a.getClass();
                linkedList.push(nft0.b);
            } else {
                oft0Var.getClass();
            }
        } else if (u45Var != null) {
            if (u45Var instanceof kca0) {
                LinkedList linkedList2 = oft0Var.a;
                nft0.a.getClass();
                linkedList2.removeFirstOccurrence(nft0.b);
            } else {
                oft0Var.getClass();
            }
        }
        if (z && !(u45Var2 instanceof ShortcutsModalView) && this.w.a.w.a(Lifecycle.State.STARTED)) {
            this.b.a();
        }
        if (z2 && !(u45Var instanceof ShortcutsModalView)) {
            b(u45Var);
        }
        vvx0 vvx0Var = this.E;
        yit0 yit0Var = this.D;
        uq40 uq40Var = this.C;
        bwx0 bwx0Var = this.B;
        wjt0 wjt0Var = this.F;
        if (z && (u45Var2 instanceof RouteSelectorModalView)) {
            bwx0Var.a();
            uq40Var.b();
            yit0Var.a(MapPositionAction.SHOW_PICKUP_POINTS);
            vvx0Var.a();
            wjt0Var.c.b();
        }
        if (z2 && (u45Var instanceof RouteSelectorModalView)) {
            wjt0Var.a();
        }
        if (z) {
            if (jl40.l(u45Var2 != null ? u45Var2.getModalScreenName() : null, "RouteStopsV2Router")) {
                bwx0Var.a();
                uq40Var.b();
                yit0Var.a(MapPositionAction.NONE);
                vvx0Var.a();
            }
        }
        if (z2) {
            if (!jl40.l(u45Var2 != null ? u45Var2.getModalScreenName() : null, "RouteStopsV2Router")) {
            }
            wjt0Var.a();
        }
        if (z2 && (u45Var instanceof bel0)) {
            wjt0Var.a();
        }
    }

    public final void b(u45 u45Var) {
        if (this.w.a.w.a(Lifecycle.State.STARTED)) {
            if (!(u45Var instanceof WhoRideSelectorModalView)) {
                ((r) this.x).g();
                this.y.b();
            }
            rgt0 rgt0Var = this.b;
            rgt0Var.b.postDelayed(rgt0Var.c, 500L);
            ((nwx0) this.a).a.c().onModalViewDisappear();
        }
    }
}
