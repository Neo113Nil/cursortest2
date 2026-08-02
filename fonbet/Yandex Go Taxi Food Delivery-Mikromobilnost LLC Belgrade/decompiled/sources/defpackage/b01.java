package defpackage;

import android.graphics.Point;
import android.os.Handler;
import com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersModalView;
import com.yandex.go.taxi.order.map.overlay.c;
import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.go.taxi.order.map_objects.f;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.ui.overlay.d;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.altpins.walking_route.map.a;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$ActionV2;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$PointTypeV2;
import ru.yandex.taxi.favorites.fragment.FavoriteAddressPickerMapFragment;
import ru.yandex.taxi.masstransit.address.ui.MtAddressMapPickerFragment;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.masstransit.overlay.onmap.h;
import ru.yandex.taxi.masstransit.stoproute.interactor.p;
import ru.yandex.taxi.routeselector.presentation.s;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.AnimatedCircularHoleFogView;

/* loaded from: classes6.dex */
public final /* synthetic */ class b01 implements hr7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hr7
    public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((AddressMapPickerFragment) obj).onMapDragging(cameraPosition, cameraUpdateReason, z);
                break;
            case 1:
                a aVar = (a) obj;
                if (!aVar.l && cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    aVar.l = true;
                    break;
                }
                break;
            case 2:
                hf2 hf2Var = (hf2) obj;
                AnimatedCircularHoleFogView animatedCircularHoleFogView = hf2Var.j;
                m58 m58Var = hf2Var.l;
                if (m58Var != null) {
                    ScreenPoint a = hf2Var.a(m58Var);
                    if (a != null && hf2Var.c(a) && ((gh00) hf2Var.a).j() > 13.0f) {
                        animatedCircularHoleFogView.movePointTo(new Point((int) a.getX(), (int) a.getY()));
                        break;
                    } else {
                        hf2Var.g.removeCallbacks(hf2Var.h);
                        hf2Var.b(true);
                        break;
                    }
                } else if (!animatedCircularHoleFogView.isStaticFogAnimationGoing()) {
                    hf2Var.d();
                    break;
                }
                break;
            case 3:
                ru.yandex.taxi.altpins.confirmation_screen.a aVar2 = (ru.yandex.taxi.altpins.confirmation_screen.a) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    aVar2.G = true;
                    break;
                }
                break;
            case 4:
                isj isjVar = (isj) obj;
                Handler handler = isjVar.b;
                if (!z) {
                    if (!isjVar.g) {
                        isjVar.g = true;
                        uxh uxhVar = isjVar.f;
                        if (uxhVar == null) {
                            isjVar.d.run();
                            break;
                        } else {
                            handler.removeCallbacks(uxhVar);
                            isjVar.f = null;
                            break;
                        }
                    }
                } else {
                    isjVar.g = false;
                    uxh uxhVar2 = new uxh(18, isjVar);
                    isjVar.f = uxhVar2;
                    handler.postDelayed(uxhVar2, 500L);
                    break;
                }
                break;
            case 5:
                ahm ahmVar = (ahm) obj;
                if (!ahmVar.L && cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    r0 r0Var = ahmVar.G;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    break;
                }
                break;
            case 6:
                yhn yhnVar = (yhn) obj;
                din dinVar = yhnVar.y;
                if (!z) {
                    dinVar.a();
                    break;
                } else {
                    dinVar.c(yhnVar.A.e);
                    break;
                }
            case 7:
                FavoriteAddressPickerMapFragment.cameraListener$lambda$0((FavoriteAddressPickerMapFragment) obj, cameraPosition, cameraUpdateReason, z);
                break;
            case 8:
                ru.yandex.taxi.masstransit.utils.a aVar3 = (ru.yandex.taxi.masstransit.utils.a) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    aVar3.c.compareAndSet(false, true);
                    break;
                }
                break;
            case 9:
                ru.yandex.taxi.linked_order.map.utils.a aVar4 = (ru.yandex.taxi.linked_order.map.utils.a) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    aVar4.b();
                    break;
                }
                break;
            case 10:
                r0 r0Var2 = (r0) ((r1s) obj).c;
                Float valueOf = Float.valueOf(cameraPosition.getZoom());
                r0Var2.getClass();
                r0Var2.m(null, valueOf);
                break;
            case 11:
                ((tls) obj).invoke(new zs7(cameraPosition, cameraUpdateReason, z));
                break;
            case 12:
                zl00 zl00Var = (zl00) obj;
                if (!zl00Var.f && cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    zl00Var.e.removeCallbacks(zl00Var.g);
                    break;
                }
                break;
            case 13:
                ((vl00) obj).h(cameraPosition, cameraUpdateReason, z);
                break;
            case 14:
                sv20 sv20Var = (sv20) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    sv20Var.E.k(Boolean.FALSE, Boolean.TRUE);
                    if (z) {
                        sv20Var.A.a(true);
                        break;
                    }
                }
                break;
            case 15:
                d dVar = (d) obj;
                if (z && cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    fw20 fw20Var = dVar.a;
                    float j = ((gh00) dVar.b).j();
                    a2v a2vVar = fw20Var.I;
                    dxu dxuVar = fw20Var.H;
                    if (Math.abs(j - fw20Var.L) > 0.3f) {
                        if (j == -1.0f) {
                            fw20Var.L = j;
                        }
                        float f = fw20Var.L;
                        o7r0 o7r0Var = fw20Var.G;
                        if (j > f) {
                            o7r0Var.c("zoom_in", TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar));
                        } else {
                            o7r0Var.c("zoom_out", TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar));
                        }
                        fw20Var.L = j;
                        break;
                    }
                }
                break;
            case 16:
                fw20 fw20Var2 = (fw20) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    fw20Var2.M.k(Boolean.FALSE, Boolean.TRUE);
                    if (z) {
                        fw20Var2.B.a(true);
                        break;
                    }
                }
                break;
            case 17:
                ((MtAddressMapPickerFragment) obj).onMapDragging(cameraPosition, cameraUpdateReason, z);
                break;
            case 18:
                MtMainFlexModalView.mapListener$lambda$0((MtMainFlexModalView) obj, cameraPosition, cameraUpdateReason, z);
                break;
            case 19:
                yo30 yo30Var = (yo30) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    yo30Var.I.k(Boolean.FALSE, Boolean.TRUE);
                    break;
                }
                break;
            case 20:
                ru.yandex.taxi.masstransit.overlay.routes.a aVar5 = (ru.yandex.taxi.masstransit.overlay.routes.a) obj;
                CameraUpdateReason cameraUpdateReason2 = CameraUpdateReason.GESTURES;
                aVar5.k = cameraUpdateReason == cameraUpdateReason2;
                if (cameraUpdateReason == cameraUpdateReason2 && z) {
                    aVar5.a.C.a(true);
                }
                float zoom = cameraPosition.getZoom();
                i3y i3yVar = aVar5.h;
                if (zoom >= 13.0f) {
                    ((fw30) i3yVar.getValue()).i();
                    break;
                } else {
                    ((fw30) i3yVar.getValue()).c();
                    break;
                }
            case 21:
                p pVar = (p) obj;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    pVar.g.c();
                    break;
                }
                break;
            case 22:
                ru.yandex.taxi.masstransit.overlay.onmap.a aVar6 = (ru.yandex.taxi.masstransit.overlay.onmap.a) obj;
                h hVar = aVar6.a;
                float zoom2 = cameraPosition.getZoom();
                boolean z2 = cameraUpdateReason == CameraUpdateReason.GESTURES;
                hVar.M.k(Boolean.FALSE, Boolean.valueOf(z2));
                if (z && z2) {
                    hVar.x.b();
                }
                hVar.Lg(zoom2, (fk40) hVar.N.getValue());
                if (z2) {
                    hVar.L.c();
                }
                float zoom3 = cameraPosition.getZoom();
                fw30 fw30Var = aVar6.i;
                if (zoom3 >= 13.0f) {
                    if (fw30Var != null) {
                        fw30Var.i();
                        break;
                    }
                } else if (fw30Var != null) {
                    fw30Var.c();
                    break;
                }
                break;
            case 23:
                f080 f080Var = ((f) obj).w;
                float zoom4 = cameraPosition.getZoom();
                r0 r0Var3 = f080Var.D;
                Float valueOf2 = Float.valueOf(zoom4);
                r0Var3.getClass();
                r0Var3.m(null, valueOf2);
                break;
            case 24:
                c cVar = (c) obj;
                cVar.Pg();
                c0 c0Var = cVar.C;
                if (c0Var.C.a(c0Var.A).b9()) {
                    c0Var.eh();
                }
                c0Var.y1.g(new w080(2));
                c0Var.B1.g(Float.valueOf(cameraPosition.getZoom()));
                c0Var.dh();
                break;
            case 25:
                PlacesCategoryFiltersModalView.mapListener$lambda$0((PlacesCategoryFiltersModalView) obj, cameraPosition, cameraUpdateReason, z);
                break;
            case 26:
                jgc0 jgc0Var = (jgc0) obj;
                if (!z) {
                    jgc0Var.Hg();
                    break;
                } else if (cameraUpdateReason == CameraUpdateReason.APPLICATION) {
                    jgc0Var.Hg();
                    break;
                }
                break;
            case 27:
                ru.yandex.taxi.preorder.source.routeoverlay.a aVar7 = (ru.yandex.taxi.preorder.source.routeoverlay.a) obj;
                aVar7.Og(cameraPosition.getZoom());
                aVar7.S.e();
                f4c0 f4c0Var = aVar7.k0;
                if (f4c0Var != null) {
                    aVar7.T.B(f4c0Var);
                    break;
                }
                break;
            case 28:
                s sVar = (s) obj;
                x9l0 x9l0Var = sVar.z;
                faq0 faq0Var = sVar.B;
                if (cameraUpdateReason == CameraUpdateReason.GESTURES && z) {
                    com.yandex.mapkit.geometry.Point target = cameraPosition.getTarget();
                    fnx0 n = ((k) sVar.M).n();
                    if (!jl40.l(n != null ? n.d : null, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                        double latitude = target.getLatitude();
                        double longitude = target.getLongitude();
                        SourcePicker sourcePicker = x9l0Var.a;
                        faq0Var.getClass();
                        faq0Var.c(EditPointOnMapAnalytics$ActionV2.MapDragging, latitude, longitude, faq0.a(sourcePicker), faq0.b(sourcePicker), null);
                        break;
                    } else {
                        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV2 = x9l0Var.a() == PointType.DESTINATION ? EditPointOnMapAnalytics$PointTypeV2.DeliveryDestination : EditPointOnMapAnalytics$PointTypeV2.DeliverySource;
                        double latitude2 = target.getLatitude();
                        double longitude2 = target.getLongitude();
                        faq0Var.getClass();
                        faq0Var.c(EditPointOnMapAnalytics$ActionV2.MapDragging, latitude2, longitude2, editPointOnMapAnalytics$PointTypeV2, null, null);
                        break;
                    }
                }
                break;
            default:
                ygt0 ygt0Var = (ygt0) obj;
                ygt0Var.Kg();
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    dn6 dn6Var = ygt0Var.H;
                    dn6.a.getClass();
                    if (dn6Var != cn6.b && ygt0Var.H.f()) {
                        ((wgt0) ygt0Var.Dg()).v2();
                        break;
                    }
                }
                break;
        }
    }
}
