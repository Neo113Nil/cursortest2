package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao50;
import xsna.kj50;
import xsna.vk50;

/* compiled from: MviFragmentController.kt */
/* loaded from: classes3.dex */
public final class zk50<F extends vk50<VS, A>, VS extends ao50, A extends kj50> implements xn50<F, VS, A> {
    public static final /* synthetic */ qcy<Object>[] g;
    public final Fragment b;
    public final xn50<F, VS, A> c;
    public final quk0<km50> d;
    public final ArrayList e;
    public final s5q0 f;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(zk50.class, SignalingProtocol.KEY_FEATURE, "getFeature()Lcom/vk/mvi/core/MviFeature;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public zk50(Fragment fragment, xn50<F, VS, A> xn50Var, quk0<km50> quk0Var) {
        this.b = fragment;
        this.c = xn50Var;
        this.d = quk0Var;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        s5q0 s5q0Var = new s5q0(null, fragment, new cv4(this, 6), quk0Var);
        arrayList.add(s5q0Var);
        this.f = s5q0Var;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return this.c.Fl();
    }

    @Override // xsna.xn50
    public final void Jh(VS vs, View view) {
        this.c.Jh(vs, view);
    }

    @Override // xsna.xn50
    public final void R4(F f) {
        this.c.R4(f);
    }

    @Override // xsna.xn50
    public final void e2(A a) {
        this.c.e2(a);
    }

    @Override // xsna.xn50
    public final F getFeature() {
        qcy<Object> qcyVar = g[0];
        return (F) this.f.a();
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b.getViewLifecycleOwner();
    }

    @Override // xsna.xn50
    public final F x8(Bundle bundle, km50 km50Var) {
        return this.c.x8(bundle, km50Var);
    }
}
