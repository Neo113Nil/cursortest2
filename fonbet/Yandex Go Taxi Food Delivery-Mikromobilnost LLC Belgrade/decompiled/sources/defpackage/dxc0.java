package defpackage;

import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import io.flutter.view.AccessibilityBridge;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class dxc0 implements xwc0 {
    public final at20 D;
    public aq80 a;
    public vc2 b;
    public Activity c;
    public FlutterView w;
    public c y;
    public oy80 z;
    public FlutterJNI x = null;
    public Surface G = null;
    public SurfaceControl H = null;
    public final aq80 I = new aq80(this);
    public final tg A = new tg();
    public final SparseArray B = new SparseArray();
    public final SparseArray C = new SparseArray();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();

    public dxc0() {
        if (at20.c == null) {
            at20.c = new at20();
        }
        this.D = at20.c;
    }

    @Override // defpackage.xwc0
    public final void a(AccessibilityBridge accessibilityBridge) {
        this.A.a = accessibilityBridge;
    }

    public final void b() {
        while (true) {
            SparseArray sparseArray = this.B;
            if (sparseArray.size() <= 0) {
                return;
            }
            this.I.C(sparseArray.keyAt(0));
        }
    }

    public final void c(FlutterJNI flutterJNI) {
        this.x = flutterJNI;
    }

    @Override // defpackage.xwc0
    public final View d(int i) {
        qwc0 qwc0Var = (qwc0) this.B.get(i);
        if (qwc0Var == null) {
            return null;
        }
        return qwc0Var.getView();
    }

    public final void e(aq80 aq80Var) {
        this.a = aq80Var;
    }

    @Override // defpackage.xwc0
    public final boolean g(int i) {
        return false;
    }

    @Override // defpackage.xwc0
    public final void h() {
        this.A.a = null;
    }
}
