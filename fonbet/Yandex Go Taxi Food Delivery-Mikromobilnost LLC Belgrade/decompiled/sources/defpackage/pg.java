package defpackage;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.AccessibilityBridge;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class pg {
    public final m2v a;
    public final FlutterJNI b;
    public og c;

    public pg(ufg ufgVar, FlutterJNI flutterJNI) {
        g191 g191Var = new g191(this);
        m2v m2vVar = new m2v(ufgVar, "flutter/accessibility", vzt0.a, null);
        this.a = m2vVar;
        m2vVar.G(g191Var);
        this.b = flutterJNI;
    }

    public final void a(int i, AccessibilityBridge.Action action) {
        this.b.dispatchSemanticsAction(i, action);
    }

    public final void b(int i, AccessibilityBridge.Action action, Serializable serializable) {
        this.b.dispatchSemanticsAction(i, action, serializable);
    }
}
