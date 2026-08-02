package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.search.panorama.TaxiPanoramaModalView;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes6.dex */
public final class n8y0 implements r8y0 {
    public final /* synthetic */ TaxiPanoramaModalView a;

    public n8y0(TaxiPanoramaModalView taxiPanoramaModalView) {
        this.a = taxiPanoramaModalView;
    }

    @Override // defpackage.r8y0
    public final void Bf(Drawable drawable) {
        o8y0 binding;
        binding = this.a.getBinding();
        ((RotatableFloatButton) binding.f.f).setImageDrawable(drawable);
    }

    @Override // defpackage.r8y0
    public final void Qf(Drawable drawable) {
        o8y0 binding;
        binding = this.a.getBinding();
        ((ListItemComponent) binding.f.e).setLeadImage(drawable);
    }

    @Override // defpackage.r8y0
    public final void Yb(List list) {
        TaxiPanoramaModalView taxiPanoramaModalView = this.a;
        taxiPanoramaModalView.pickupPoints = list;
        taxiPanoramaModalView.renderPickupPoints();
    }

    @Override // defpackage.r8y0
    public final void applyButtonStyle(m37 m37Var) {
        o8y0 binding;
        j37 a = m37Var.a(ButtonType.DEFAULT);
        if (a == null) {
            return;
        }
        binding = this.a.getBinding();
        mcb1.a((ButtonComponent) binding.f.b, xcb1.b(a));
    }
}
