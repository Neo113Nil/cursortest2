package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import xsna.b26;

/* compiled from: DialogBusinessNotifyComponent.kt */
/* loaded from: classes2.dex */
public final class ebm extends j8i {
    public final FragmentActivity i;
    public final a1w j;
    public final mxv k;
    public final kkm l;
    public final fbm m = new fbm();
    public final io.reactivex.rxjava3.disposables.b n = new io.reactivex.rxjava3.disposables.b();
    public ibm o;
    public b26.c p;

    /* compiled from: DialogBusinessNotifyComponent.kt */
    public final class a {
        public a() {
        }
    }

    /* compiled from: DialogBusinessNotifyComponent.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ebm(FragmentActivity fragmentActivity, a1w a1wVar, mxv mxvVar, kkm kkmVar) {
        this.i = fragmentActivity;
        this.j = a1wVar;
        this.k = mxvVar;
        this.l = kkmVar;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        ibm ibmVar = new ibm(layoutInflater, viewGroup, this.l);
        ibmVar.e = new a();
        Z0(ibmVar);
        this.o = ibmVar;
        return ibmVar.a;
    }

    @Override // xsna.j8i
    public final void M0() {
        io.reactivex.rxjava3.disposables.b bVar = this.n;
        bVar.e();
        fbm fbmVar = this.m;
        fbmVar.b = null;
        fbmVar.a = false;
        ibm ibmVar = this.o;
        if (ibmVar != null) {
            Z0(ibmVar);
        }
        bVar.dispose();
    }

    @Override // xsna.j8i
    public final void N0() {
        ibm ibmVar = this.o;
        if (ibmVar != null) {
            ibmVar.e = null;
        }
        this.o = null;
    }

    public final void X0(xpp<Dialog> xppVar) {
        fbm fbmVar = this.m;
        if (fbmVar.a && !epx.f(xppVar, fbmVar.b)) {
            ypp yppVar = fbmVar.b;
            if (yppVar == null) {
                ibm ibmVar = this.o;
                if (ibmVar != null) {
                    ibmVar.a(null);
                }
                b26.c cVar = this.p;
                if (cVar != null) {
                    cVar.a(false);
                    return;
                }
                return;
            }
            if (yppVar.d()) {
                Y0(Source.ACTUAL);
            }
            ibm ibmVar2 = this.o;
            if (ibmVar2 != null) {
                ibmVar2.a((Dialog) yppVar.d);
            }
            b26.c cVar2 = this.p;
            if (cVar2 != null) {
                Dialog dialog = (Dialog) yppVar.d;
                cVar2.a(dialog != null ? dialog.Bb() : false);
            }
        }
    }

    public final void Y0(Source source) {
        io.reactivex.rxjava3.core.w wVar;
        Dialog dialog;
        ypp yppVar = this.m.b;
        Long Sb = (yppVar == null || (dialog = (Dialog) yppVar.d) == null) ? null : dialog.Sb();
        if (Sb == null) {
            return;
        }
        a1w a1wVar = this.j;
        if (a1wVar.u()) {
            int i = 1;
            if (b.$EnumSwitchMapping$0[source.ordinal()] == 1) {
                asu0.a.getClass();
                wVar = asu0.k();
            } else {
                asu0.a.getClass();
                wVar = (io.reactivex.rxjava3.core.w) asu0.i0.getValue();
            }
            long longValue = Sb.longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            this.n.b(io.reactivex.rxjava3.kotlin.c.e(a1wVar.F(this, new tqm(new sqm(Peer.a.b(longValue), source, true, (Object) "ebm", 16))).l(new vj0(new dbm(longValue), 16)).q(wVar).m(io.reactivex.rxjava3.android.schedulers.a.b()), new pwk(this, i), new iz0(this, 23)));
        }
    }

    public final void Z0(ibm ibmVar) {
        ypp yppVar = this.m.b;
        ibmVar.a(yppVar != null ? (Dialog) yppVar.d : null);
    }
}
