package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import defpackage.cgp;
import defpackage.hbp0;
import defpackage.oln;
import ru.yandex.taxi.favorites.data.repo.a;
import ru.yandex.taxi.favorites.edit.presenter.EditExisting$updateFavorite$$inlined$safeCollectIn$1;
import ru.yandex.taxi.favorites.edit.presenter.d;
import ru.yandex.taxi.favorites.experiment.e;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;

/* loaded from: classes5.dex */
public final class oln implements k3u0 {
    public final d a;
    public FavoriteAddress b;
    public final a c;
    public final zuj0 d;
    public final qmp e;
    public final tt2 f;
    public final e g;
    public final bgf h;
    public final kip i;
    public final hbp0 j = new hbp0(new czo0(14), "", null);
    public final w3i k;

    public oln(d dVar, FavoriteAddress favoriteAddress, a aVar, zuj0 zuj0Var, qmp qmpVar, tt2 tt2Var, e eVar, bgf bgfVar, kip kipVar) {
        this.a = dVar;
        this.b = favoriteAddress;
        this.c = aVar;
        this.d = zuj0Var;
        this.e = qmpVar;
        this.f = tt2Var;
        this.g = eVar;
        this.h = bgfVar;
        this.i = kipVar;
        w3i w3iVar = new w3i(z81.f(favoriteAddress));
        String name = favoriteAddress.getName();
        String obj = name != null ? evu0.k0(name).toString() : null;
        w3iVar.B = obj == null ? "" : obj;
        String porchNumber = favoriteAddress.getPorchNumber();
        String obj2 = porchNumber != null ? evu0.k0(porchNumber).toString() : null;
        w3iVar.c = obj2 == null ? "" : obj2;
        String comment = favoriteAddress.getComment();
        String obj3 = comment != null ? evu0.k0(comment).toString() : null;
        w3iVar.w = obj3 == null ? "" : obj3;
        String quartersNumber = favoriteAddress.getQuartersNumber();
        String obj4 = quartersNumber != null ? evu0.k0(quartersNumber).toString() : null;
        w3iVar.x = obj4 == null ? "" : obj4;
        String floorNumber = favoriteAddress.getFloorNumber();
        String obj5 = floorNumber != null ? evu0.k0(floorNumber).toString() : null;
        w3iVar.y = obj5 == null ? "" : obj5;
        String doorPhoneNumber = favoriteAddress.getDoorPhoneNumber();
        String obj6 = doorPhoneNumber != null ? evu0.k0(doorPhoneNumber).toString() : null;
        w3iVar.z = obj6 == null ? "" : obj6;
        String commentCourier = favoriteAddress.getCommentCourier();
        String obj7 = commentCourier != null ? evu0.k0(commentCourier).toString() : null;
        w3iVar.A = obj7 != null ? obj7 : "";
        this.k = w3iVar;
    }

    @Override // defpackage.k3u0
    public final PlainAddress a() {
        return z81.f(this.b);
    }

    @Override // defpackage.k3u0
    public final void b() {
        ((cgp) this.a.Dg()).showDeleteDialog(new Runnable() { // from class: ru.yandex.taxi.favorites.edit.presenter.a
            @Override // java.lang.Runnable
            public final void run() {
                oln olnVar = oln.this;
                d dVar = olnVar.a;
                ((cgp) dVar.Dg()).showDeleteLoading();
                ((cgp) dVar.Dg()).showLoading();
                hbp0.e(olnVar.j, null, null, new EditExisting$removeAddress$1(olnVar, null), 3);
            }
        });
    }

    @Override // defpackage.k3u0
    public final void c() {
        this.j.b();
    }

    @Override // defpackage.k3u0
    public final bgp d() {
        String name = this.b.getName();
        String str = name == null ? "" : name;
        String shortText = this.b.getShortText();
        String fullText = this.b.getFullText();
        String fullText2 = this.b.getFullText();
        PlaceType placeType = this.b.getPlaceType();
        int i = placeType == null ? -1 : nln.a[placeType.ordinal()];
        zuj0 zuj0Var = this.d;
        String h = i != 1 ? i != 2 ? null : ((avj0) zuj0Var).h(kyh0.favorite_home) : ((avj0) zuj0Var).h(kyh0.favorite_work);
        String str2 = (h == null && (h = this.b.getName()) == null) ? "" : h;
        String porchNumber = this.b.getPorchNumber();
        String str3 = porchNumber == null ? "" : porchNumber;
        String comment = this.b.getComment();
        String str4 = comment == null ? "" : comment;
        String quartersNumber = this.b.getQuartersNumber();
        String str5 = quartersNumber == null ? "" : quartersNumber;
        String floorNumber = this.b.getFloorNumber();
        String str6 = floorNumber == null ? "" : floorNumber;
        String doorPhoneNumber = this.b.getDoorPhoneNumber();
        String str7 = doorPhoneNumber == null ? "" : doorPhoneNumber;
        String commentCourier = this.b.getCommentCourier();
        String str8 = commentCourier == null ? "" : commentCourier;
        kip kipVar = this.i;
        return new bgp(str2, str, shortText, fullText2, str3, str4, fullText, str5, str6, str7, str8, true, kipVar.c(), !((PlainAddress) this.k.b).equals(z81.f(this.b)), true, kipVar.b());
    }

    @Override // defpackage.k3u0
    public final void e() {
        if (l()) {
            return;
        }
        d dVar = this.a;
        ((cgp) dVar.Dg()).showLoading();
        egp inputsHolder = ((cgp) dVar.Dg()).inputsHolder();
        tpr f = this.c.f(z81.f(this.b), nnm.k(inputsHolder.d), nnm.k(inputsHolder.e));
        this.f.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.j, null, null, new EditExisting$updateFavorite$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(f, mdh.b), null, this), 3);
    }

    @Override // defpackage.k3u0
    public final void f(FavoriteAddressDatumType favoriteAddressDatumType) {
        this.b = FavoriteAddress.b(this.b, null, 0, null, favoriteAddressDatumType, null, 4194239);
    }

    @Override // defpackage.k3u0
    public final void g(String str) {
        cgp cgpVar = (cgp) this.a.Dg();
        if (!this.i.c()) {
            str = "";
        }
        cgpVar.setScreenTitle(str);
    }

    @Override // defpackage.k3u0
    public final void h(Address address) {
        String p;
        this.b = z81.k(this.b, address);
        GeoPointAcquisitionType geoPointAcquisitionType = address.getGeoPointAcquisitionType();
        GeoPointAcquisitionType geoPointAcquisitionType2 = GeoPointAcquisitionType.USER_LOCATION;
        String str = "";
        d dVar = this.a;
        if (geoPointAcquisitionType == geoPointAcquisitionType2) {
            bgf bgfVar = this.h;
            if (bgfVar.isEnabled()) {
                ((cgp) dVar.Dg()).updateAddressItem(bgfVar.a(), "", address.d());
                ((cgp) dVar.Dg()).showSaveButton();
            }
        }
        cgp cgpVar = (cgp) dVar.Dg();
        String q = this.b.q();
        if (this.i.b() && (p = this.b.p()) != null) {
            str = p;
        }
        cgpVar.updateAddressItem(q, str, address.d());
        ((cgp) dVar.Dg()).showSaveButton();
    }

    @Override // defpackage.k3u0
    public final void i() {
        this.j.a();
    }

    @Override // defpackage.k3u0
    public final void j() {
        ((cgp) this.a.Dg()).onPickedAddress(this.b);
    }

    @Override // defpackage.k3u0
    public final void k() {
        cgp cgpVar = (cgp) this.a.Dg();
        egp inputsHolder = cgpVar.inputsHolder();
        if (inputsHolder.c.isFocused() || inputsHolder.d.isFocused() || inputsHolder.e.isFocused() || inputsHolder.f.isFocused() || inputsHolder.g.isFocused() || inputsHolder.h.isFocused() || inputsHolder.i.isFocused()) {
            cgpVar.showSaveButton();
        } else if (l()) {
            cgpVar.showSetAsDestinationButton();
        } else {
            cgpVar.showSaveButton();
        }
    }

    public final boolean l() {
        egp inputsHolder = ((cgp) this.a.Dg()).inputsHolder();
        w3i w3iVar = this.k;
        if (((PlainAddress) w3iVar.b).equals(z81.f(this.b))) {
            return ((String) w3iVar.B).equals(evu0.k0(inputsHolder.a()).toString()) && ((String) w3iVar.c).equals(evu0.k0(nnm.k(inputsHolder.d)).toString()) && ((String) w3iVar.w).equals(evu0.k0(nnm.k(inputsHolder.e)).toString()) && ((String) w3iVar.x).equals(evu0.k0(nnm.k(inputsHolder.f)).toString()) && ((String) w3iVar.y).equals(evu0.k0(nnm.k(inputsHolder.g)).toString()) && ((String) w3iVar.z).equals(evu0.k0(nnm.k(inputsHolder.h)).toString()) && ((String) w3iVar.A).equals(evu0.k0(nnm.k(inputsHolder.i)).toString());
        }
        return false;
    }
}
