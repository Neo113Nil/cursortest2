package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao50;
import xsna.kj50;
import xsna.mk50;
import xsna.vk50;
import xsna.xn50;

/* compiled from: MviModalBottomSheet.kt */
/* loaded from: classes3.dex */
public abstract class tl50<F extends vk50<VS, A>, VS extends ao50, A extends kj50> extends dw20 implements xn50<F, VS, A>, quk0<km50> {
    public static final /* synthetic */ qcy<Object>[] h1;
    public final ArrayList f1;
    public final s5q0 g1;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(tl50.class, SignalingProtocol.KEY_FEATURE, "getFeature()Lcom/vk/mvi/core/MviFeature;", 0);
        fpf0.a.getClass();
        h1 = new qcy[]{propertyReference1Impl};
    }

    public tl50() {
        ArrayList arrayList = new ArrayList();
        this.f1 = arrayList;
        s5q0 s5q0Var = new s5q0(null, this, new uxb(this, 8), this);
        arrayList.add(s5q0Var);
        this.g1 = s5q0Var;
    }

    public mk50 Zn() {
        return mk50.a.a;
    }

    public final View ao(mk50 mk50Var) {
        if (mk50Var instanceof mk50.c) {
            return ((mk50.c) mk50Var).a;
        }
        if (!(mk50Var instanceof mk50.b)) {
            if (mk50Var instanceof mk50.a) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        LayoutInflater from = LayoutInflater.from(Mn());
        if (from != null) {
            return from.inflate(((mk50.b) mk50Var).a, (ViewGroup) null, false);
        }
        return null;
    }

    public void e2(A a) {
        xn50.a.c(this, a);
    }

    @Override // xsna.xn50
    public final F getFeature() {
        qcy<Object> qcyVar = h1[0];
        return (F) this.g1.a();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator it = this.f1.iterator();
        while (it.hasNext()) {
            ((z4z) it.next()).a();
        }
        F feature = getFeature();
        zyw zywVar = feature instanceof zyw ? (zyw) feature : null;
        if (zywVar != null) {
            zywVar.A();
        }
        R4(getFeature());
    }

    @Override // xsna.quk0
    public final /* bridge */ /* synthetic */ Object sf(Parcelable parcelable) {
        return null;
    }

    @Override // xsna.quk0
    public final Parcelable vb() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public Dialog yn(Bundle bundle) {
        View ao = ao(Fl());
        if (ao != null) {
            dw20.Rn(this, ao, 6);
            Jh(getFeature().g(), ao);
        }
        View ao2 = ao(Zn());
        if (ao2 != null) {
            this.v0 = ao2;
            Yn(getFeature().g(), ao2);
        }
        return super.yn(bundle);
    }

    @Override // androidx.fragment.app.Fragment, xsna.gm50
    public f5z getViewOwner() {
        return this;
    }

    public void R4(F f) {
    }

    public void Yn(VS vs, View view) {
    }
}
