package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xsna.mk50;

/* compiled from: MviComponentModalBottomSheet.kt */
/* loaded from: classes2.dex */
public abstract class ck50 extends dw20 implements mg8, quk0<km50>, fcn {
    public static final /* synthetic */ int k1 = 0;
    public final msm0 f1 = new msm0();
    public final io.reactivex.rxjava3.subjects.f<kj50> g1 = new io.reactivex.rxjava3.subjects.f<>();
    public final bpn0 h1 = new bpn0(new tzv(this, 15));
    public final LinkedHashMap i1 = new LinkedHashMap();
    public final bpn0 j1 = new bpn0(new k7y(this, 17));

    @Override // xsna.mg8
    public final <T extends yn50> void H9(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, T t) {
        ((mg8) this.h1.getValue()).H9(yj50Var, t);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.mg8
    public final <T extends kj50> void P9(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, T t) {
        ((mg8) this.h1.getValue()).P9(yj50Var, t);
    }

    public abstract yj50<?, ?, ?, ?, ?, ?, ?> Yn();

    public abstract ViewGroup Zn(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // xsna.fcn
    public final void b(boolean z) {
        super.dismiss();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = ((Set) this.j1.getValue()).iterator();
        while (it.hasNext()) {
            ((yj50) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Iterator it = ((Set) this.j1.getValue()).iterator();
        while (it.hasNext()) {
            ((yj50) it.next()).h();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Iterator it = ((Set) this.j1.getValue()).iterator();
        while (it.hasNext()) {
            ((yj50) it.next()).i();
        }
        this.i1.clear();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50<?> Y;
        super.onDismiss(dialogInterface);
        Object mo2getContext = mo2getContext();
        ey50 ey50Var = mo2getContext instanceof ey50 ? (ey50) mo2getContext : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        Y.H(this);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.quk0
    public final /* bridge */ /* synthetic */ Object sf(Parcelable parcelable) {
        return null;
    }

    @Override // xsna.mg8
    public final io.reactivex.rxjava3.core.q<kj50> v() {
        return ((mg8) this.h1.getValue()).v().Y(this.g1);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.quk0
    public final Parcelable vb() {
        return null;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        LinkedHashMap linkedHashMap;
        LayoutInflater layoutInflater = kn().getLayoutInflater();
        ViewGroup Zn = Zn(layoutInflater, null, bundle);
        Iterator it = ((Set) this.j1.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.i1;
            if (!hasNext) {
                break;
            }
            yj50 yj50Var = (yj50) it.next();
            qcy<Object>[] qcyVarArr = yj50.m;
            linkedHashMap.put(yj50Var, yj50Var.c(layoutInflater, Zn, null));
        }
        this.f1.a(Zn, linkedHashMap);
        Zn.setClipToOutline(true);
        Zn.setOutlineProvider(new t0w0(4, iah0.b(12.0f), false, false));
        dw20.Rn(this, Zn, 6);
        this.K0 = true;
        this.I0 = 0;
        this.H0 = 0;
        this.e0 = new jgj(Zn, 0, 0, 14);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            yj50 yj50Var2 = (yj50) entry.getKey();
            mk50 mk50Var = (mk50) entry.getValue();
            mk50.c cVar = mk50Var instanceof mk50.c ? (mk50.c) mk50Var : null;
            yj50Var2.j(cVar != null ? cVar.a : null, bundle);
        }
        Dialog yn = super.yn(bundle);
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.bk50
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ww50<?> Y;
                int i = ck50.k1;
                ck50 ck50Var = ck50.this;
                Object mo2getContext = ck50Var.mo2getContext();
                ey50 ey50Var = mo2getContext instanceof ey50 ? (ey50) mo2getContext : null;
                if (ey50Var == null || (Y = ey50Var.Y()) == null) {
                    return;
                }
                Y.S(ck50Var);
                s3q0 s3q0Var = s3q0.a;
            }
        });
        return yn;
    }
}
