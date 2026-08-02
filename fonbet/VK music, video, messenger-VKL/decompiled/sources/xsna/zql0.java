package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.hg1;

/* compiled from: StoriesBlockHolderImpl.kt */
/* loaded from: classes6.dex */
public final class zql0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ arl0 b;
    public final /* synthetic */ RecyclerView c;

    public zql0(arl0 arl0Var, RecyclerView recyclerView) {
        this.b = arl0Var;
        this.c = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.vk.dto.common.id.UserId] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        arl0 arl0Var = this.b;
        arl0Var.H = false;
        arl0Var.I = false;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.STORIES_FEED_BLOCK, null, false, 62).j();
        mzp0Var.init();
        mzp0Var.start();
        mzp0Var.a();
        arl0Var.G = mzp0Var;
        arl0Var.F.dispose();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = UserId.d;
        io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) arl0Var.C.getValue();
        hg1.u3 u3Var = new hg1.u3(bxo.d);
        qVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, u3Var).U(new hg1.t3(brl0.b));
        jsv jsvVar = new jsv(new j20(25, ref$ObjectRef, arl0Var), 25);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        arl0Var.F = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.mixed.o(U.E(jsvVar, lVar, kVar, kVar), new nh40(new qz40(arl0Var, 29), 16)).a0(asu0.a.d()), lVar, new fa(arl0Var, 11)).subscribe(new bdz(new jbo(arl0Var, this.c, ref$ObjectRef, 6), 23), new fsq(new ee8(L.a, 15), 28));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.F.dispose();
    }
}
