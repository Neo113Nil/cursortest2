package defpackage;

import android.view.KeyEvent;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.g;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class jkx implements iyv {
    public final hkx[] a;
    public final HashSet b = new HashSet();
    public final FlutterView c;

    public jkx(FlutterView flutterView) {
        this.c = flutterView;
        this.a = new hkx[]{new g(flutterView.getBinaryMessenger()), new hdu(new fix(flutterView.getBinaryMessenger()))};
        tt5 binaryMessenger = flutterView.getBinaryMessenger();
        h2t h2tVar = new h2t();
        new ea20(binaryMessenger, "flutter/keyboard", wzt0.b, null).b(new c9v(h2tVar));
        h2tVar.a = this;
    }

    public final boolean a(KeyEvent keyEvent) {
        HashSet hashSet = this.b;
        if (hashSet.remove(keyEvent)) {
            return false;
        }
        hkx[] hkxVarArr = this.a;
        if (hkxVarArr.length > 0) {
            xe6 xe6Var = new xe6(this, keyEvent);
            for (hkx hkxVar : hkxVarArr) {
                wvb1 wvb1Var = new wvb1();
                wvb1Var.b = xe6Var;
                wvb1Var.a = false;
                hkxVar.c(keyEvent, wvb1Var);
            }
        } else {
            FlutterView flutterView = this.c;
            if (flutterView != null && !flutterView.onTextInputKeyEvent(keyEvent)) {
                hashSet.add(keyEvent);
                flutterView.redispatch(keyEvent);
                hashSet.remove(keyEvent);
            }
        }
        return true;
    }
}
