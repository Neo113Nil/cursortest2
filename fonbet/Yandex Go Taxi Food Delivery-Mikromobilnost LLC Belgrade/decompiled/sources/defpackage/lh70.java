package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.search.router.Origin;
import java.lang.ref.WeakReference;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;

/* loaded from: classes6.dex */
public final class lh70 extends dds {
    public final a F;
    public WeakReference G;
    public int H;

    public lh70(a aVar) {
        super(null);
        this.F = aVar;
        this.G = new WeakReference(null);
    }

    @Override // defpackage.dds, defpackage.h55
    public final void H(Object obj) {
        kh70 kh70Var = (kh70) obj;
        ViewGroup viewGroup = (ViewGroup) this.G.get();
        if (viewGroup != null) {
            viewGroup.setImportantForAccessibility(this.H);
        }
        this.G.clear();
        super.H(kh70Var);
    }

    @Override // defpackage.dds
    public final a P() {
        return this.F;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        kh70 kh70Var = (kh70) obj;
        AddressMapPickerFragment addressMapPickerFragment = (AddressMapPickerFragment) baseFragment;
        pv0 pv0Var = kh70Var.d;
        if (pv0Var != null) {
            addressMapPickerFragment.setInitialAddress(pv0Var);
        } else {
            addressMapPickerFragment.updateInitialPoint(kh70Var.e);
        }
        addressMapPickerFragment.setCallbackListener(new mc30(this, 1));
        View view = addressMapPickerFragment.getView();
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        this.H = viewGroup.getImportantForAccessibility();
        viewGroup.setImportantForAccessibility(1);
        this.G = new WeakReference(viewGroup);
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        kh70 kh70Var = (kh70) obj;
        d01 d01Var = AddressMapPickerFragment.Companion;
        int i = kh70Var.a;
        PointType pointType = kh70Var.b;
        String str = kh70Var.c;
        Origin origin = Origin.ORDER;
        d01Var.getClass();
        return d01.a(i, pointType, str, origin, true, true, true, true, true, true, true, false, true, false);
    }
}
