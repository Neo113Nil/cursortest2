package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.spatial.a;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.android.gms.measurement.internal.n;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public final class dmw0 implements o13, l2a1 {
    public final Object a;
    public final Object b;
    public Object c;

    public dmw0(LayoutNode layoutNode) {
        this.a = layoutNode;
        this.b = new ArrayList();
        this.c = layoutNode;
    }

    @Override // defpackage.o13
    public void a(int i, int i2) {
        ((LayoutNode) this.c).O(i, i2);
    }

    public void b() {
        ((ArrayList) this.b).clear();
        this.c = this.a;
        ((LayoutNode) this.a).N();
    }

    @Override // defpackage.o13
    public void d() {
        m390 m390Var = ((LayoutNode) this.a).G;
        if (m390Var != null) {
            m390Var.onEndApplyChanges();
        }
    }

    @Override // defpackage.o13
    public void f() {
        a rectManager;
        a rectManager2;
        LayoutNode layoutNode = (LayoutNode) this.c;
        t300 t300Var = layoutNode.a0;
        if (!layoutNode.F()) {
            ixv.a("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = layoutNode.H;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        i iVar = layoutNode.c0;
        if (iVar != null) {
            iVar.i();
        }
        layoutNode.M = false;
        if (layoutNode.l0) {
            layoutNode.l0 = false;
        } else {
            e530 e530Var = (v7x0) layoutNode.a0.f;
            for (e530 e530Var2 = e530Var; e530Var2 != null; e530Var2 = e530Var2.getParent$ui()) {
                if (e530Var2.isAttached()) {
                    e530Var2.reset$ui();
                }
            }
            for (e530 e530Var3 = e530Var; e530Var3 != null; e530Var3 = e530Var3.getParent$ui()) {
                if (e530Var3.isAttached()) {
                    e530Var3.runDetachLifecycle$ui();
                }
            }
            while (e530Var != null) {
                if (e530Var.isAttached()) {
                    e530Var.markAsDetached$ui();
                }
                e530Var = e530Var.getParent$ui();
            }
        }
        int i = layoutNode.b;
        m390 m390Var = layoutNode.G;
        if (m390Var != null && (rectManager2 = m390Var.getRectManager()) != null) {
            rectManager2.f(layoutNode);
        }
        layoutNode.b = fnq0.a.addAndGet(1);
        m390 m390Var2 = layoutNode.G;
        if (m390Var2 != null) {
            m390Var2.onPreLayoutNodeReused(layoutNode, i);
        }
        for (e530 e530Var4 = (e530) t300Var.g; e530Var4 != null; e530Var4 = e530Var4.getChild$ui()) {
            e530Var4.markAsAttached$ui();
        }
        t300Var.f();
        if (t300Var.e(8)) {
            layoutNode.D();
        }
        LayoutNode.U(layoutNode);
        m390 m390Var3 = layoutNode.G;
        if (m390Var3 != null) {
            m390Var3.onPostLayoutNodeReused(layoutNode, i);
        }
        m390 m390Var4 = layoutNode.G;
        if (m390Var4 == null || (rectManager = m390Var4.getRectManager()) == null) {
            return;
        }
        rectManager.e(layoutNode);
    }

    @Override // defpackage.o13
    public void i(int i, int i2, int i3) {
        ((LayoutNode) this.c).J(i, i2, i3);
    }

    @Override // defpackage.o13
    public /* bridge */ /* synthetic */ void k(int i, Object obj) {
    }

    @Override // defpackage.o13
    public Object l() {
        return this.c;
    }

    @Override // defpackage.o13
    public void m(int i, Object obj) {
        ((LayoutNode) this.c).z((LayoutNode) obj, i);
    }

    @Override // defpackage.o13
    public void n(Object obj) {
        ((ArrayList) this.b).add(this.c);
        this.c = obj;
    }

    @Override // defpackage.l2a1
    public void o(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((n) this.c).t(true, i, th, bArr, (String) this.a, (ArrayList) this.b);
    }

    @Override // defpackage.o13
    public void p() {
        this.c = ((ArrayList) this.b).remove(r0.size() - 1);
    }

    public dmw0(n nVar, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = nVar;
    }

    public /* synthetic */ dmw0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
