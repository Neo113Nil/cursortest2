package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.kj50;
import xsna.mk50;
import xsna.vk50;
import xsna.xn50;

/* compiled from: MviFragment.kt */
/* loaded from: classes3.dex */
public abstract class yk50<F extends vk50<VS, A>, VS extends ao50, A extends kj50> extends Fragment implements xn50<F, VS, A>, quk0<km50> {
    public final bpn0 h = new bpn0(new vt30(this, 6));

    @Override // xsna.xn50
    public final void e2(A a) {
        xn50.a.c(this, a);
    }

    @Override // xsna.xn50
    public final F getFeature() {
        return (F) ((zk50) this.h.getValue()).getFeature();
    }

    @Override // androidx.fragment.app.Fragment, xsna.gm50
    public final f5z getViewOwner() {
        return ((zk50) this.h.getValue()).b.getViewLifecycleOwner();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zk50 zk50Var = (zk50) this.h.getValue();
        Iterator it = zk50Var.e.iterator();
        while (it.hasNext()) {
            ((z4z) it.next()).a();
        }
        vk50 feature = zk50Var.getFeature();
        zyw zywVar = feature instanceof zyw ? (zyw) feature : null;
        if (zywVar != null) {
            zywVar.A();
        }
        zk50Var.R4(zk50Var.getFeature());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mk50 Fl = ((zk50) this.h.getValue()).c.Fl();
        if (Fl instanceof mk50.c) {
            return ((mk50.c) Fl).a;
        }
        if (Fl instanceof mk50.b) {
            return layoutInflater.inflate(((mk50.b) Fl).a, viewGroup, false);
        }
        if (Fl instanceof mk50.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((zk50) this.h.getValue()).Jh(getFeature().g(), view);
    }

    @Override // xsna.quk0
    public final /* bridge */ /* synthetic */ Object sf(Parcelable parcelable) {
        return null;
    }

    @Override // xsna.quk0
    public final Parcelable vb() {
        return null;
    }

    public void R4(F f) {
    }
}
