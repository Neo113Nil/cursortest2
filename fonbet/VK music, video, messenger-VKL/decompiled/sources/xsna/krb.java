package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;

/* compiled from: ChatHeaderInfoComponent.kt */
/* loaded from: classes16.dex */
public final class krb extends j8i {
    public final tw0 i;
    public final vza j;
    public final kkm k;
    public prb m;
    public final io.reactivex.rxjava3.disposables.b o;
    public final boolean p;
    public final int l = R.attr.im_ic_back;
    public final io.reactivex.rxjava3.subjects.d<mrb> n = io.reactivex.rxjava3.subjects.d.N0();

    public krb(sza szaVar, tw0 tw0Var, vza vzaVar, kkm kkmVar) {
        this.i = tw0Var;
        this.j = vzaVar;
        this.k = kkmVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.o = bVar;
        ImFeatures imFeatures = ImFeatures.IM_CHAT_TOOLBAR_REDESIGN;
        imFeatures.getClass();
        this.p = com.vk.toggle.b.A.a(imFeatures);
        io.reactivex.rxjava3.subjects.d dVar = szaVar.h;
        dVar.getClass();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, null, new w5(this, 16)));
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        prb qrbVar;
        if (this.p) {
            qrbVar = new orb(layoutInflater.getContext(), viewStub, this.i, this.j, this.k);
        } else {
            qrbVar = new qrb(layoutInflater.getContext(), viewStub, this.i, this.j, this.k, this.l);
        }
        this.m = qrbVar;
        return qrbVar.getView();
    }

    @Override // xsna.j8i
    public final void M0() {
        this.o.e();
    }

    @Override // xsna.j8i
    public final void N0() {
        this.m = null;
    }

    @Override // xsna.j8i
    public final void S0(View view) {
        I0(io.reactivex.rxjava3.kotlin.c.f(3, this.n, null, null, new on(this, 15)));
    }
}
