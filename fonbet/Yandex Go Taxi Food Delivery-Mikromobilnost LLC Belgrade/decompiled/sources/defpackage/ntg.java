package defpackage;

import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes5.dex */
public final class ntg implements qt00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ntg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qt00
    public final void onMapCollapsed() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qt00 qt00Var = ((otg) obj).h;
                if (qt00Var != null) {
                    qt00Var.onMapCollapsed();
                    break;
                }
                break;
            default:
                ((wl00) obj).onMapCollapsed();
                break;
        }
    }

    @Override // defpackage.qt00
    public final void onMapDragged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                otg otgVar = (otg) obj;
                otgVar.d.removeCallbacks(otgVar.e);
                otgVar.f = true;
                otgVar.c.a(true);
                TaxiMapView h = ((gh00) otgVar.b).h();
                if (h != null && otgVar.g) {
                    h.scaleOut();
                }
                qt00 qt00Var = otgVar.h;
                if (qt00Var != null) {
                    qt00Var.onMapDragged();
                    break;
                }
                break;
            default:
                ((wl00) obj).onMapDragged();
                break;
        }
    }

    @Override // defpackage.qt00
    public final void onMapExpanded() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                otg otgVar = (otg) obj;
                otgVar.f = true;
                otgVar.c.a(true);
                qt00 qt00Var = otgVar.h;
                if (qt00Var != null) {
                    qt00Var.onMapExpanded();
                    break;
                }
                break;
            default:
                ((wl00) obj).onMapExpanded();
                break;
        }
    }

    @Override // defpackage.qt00
    public final void onMapPressed() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                otg otgVar = (otg) obj;
                ((gh00) otgVar.b).u(otgVar.i);
                if (otgVar.f) {
                    otgVar.b();
                    otgVar.f = false;
                    otgVar.c.a(false);
                }
                qt00 qt00Var = otgVar.h;
                if (qt00Var != null) {
                    qt00Var.onMapPressed();
                    break;
                }
                break;
            default:
                ((wl00) obj).onMapPressed();
                break;
        }
    }

    @Override // defpackage.qt00
    public final void onMapReleased() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                otg otgVar = (otg) obj;
                ((gh00) otgVar.b).e(otgVar.i);
                qt00 qt00Var = otgVar.h;
                if (qt00Var != null) {
                    qt00Var.onMapReleased();
                    break;
                }
                break;
            default:
                ((wl00) obj).onMapReleased();
                break;
        }
    }

    @Override // defpackage.qt00
    public final boolean onMapTapped(float f, float f2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qt00 qt00Var = ((otg) obj).h;
                if (qt00Var != null) {
                    return qt00Var.onMapTapped(f, f2);
                }
                return false;
            default:
                return ((wl00) obj).onMapTapped(f, f2);
        }
    }
}
