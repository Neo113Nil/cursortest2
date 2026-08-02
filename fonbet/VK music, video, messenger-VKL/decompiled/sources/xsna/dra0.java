package xsna;

import android.location.Location;
import com.vk.core.util.NoLocation;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.newsfeed.posting.geo_picker.presentation.b;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.newsfeed.posting.geo_picker.presentation.i;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;
import com.vk.newsfeed.posting.impl.domain.model.GeoPermissionStatus;
import com.vk.newsfeed.posting.impl.domain.model.NearbyPlaces;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PlacePickerPagingFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class dra0 {
    public final b.a a;
    public final xqa0 b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final int d;

    /* compiled from: PlacePickerPagingFeatureDelegate.kt */
    public final class a<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.n(xVar, new hms(new qi00(this, 22), 24)).h(new o330(new i750(this, 10), 11));
        }
    }

    /* compiled from: PlacePickerPagingFeatureDelegate.kt */
    public final class b<T> implements io.reactivex.rxjava3.core.c0<T, T> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.core.c0
        public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new cp50(new k170(this, 9), 7)), new zyu(new w110(this, 14), 17)).h(new o060(new yr00(this, 17), 4));
        }
    }

    /* compiled from: PlacePickerPagingFeatureDelegate.kt */
    public static final class c {
        public final Location a;

        public c(Location location) {
            this.a = location;
        }
    }

    /* compiled from: PlacePickerPagingFeatureDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<com.vk.newsfeed.posting.geo_picker.presentation.g, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.newsfeed.posting.geo_picker.presentation.g gVar) {
            ((juq) this.receiver).a(gVar);
            return s3q0.a;
        }
    }

    /* compiled from: PlacePickerPagingFeatureDelegate.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((dra0) this.receiver).a.a(new g.d(PlacePickerState.LoadingState.ERROR));
            return s3q0.a;
        }
    }

    public dra0(b.a aVar, xqa0 xqa0Var) {
        this.a = aVar;
        this.b = xqa0Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.c = bVar;
        this.d = 40;
        aVar.a.e.b(bVar);
    }

    public final void a(PlacePickerState placePickerState, a.InterfaceC1406a interfaceC1406a) {
        PlacePickerState.LoadingState loadingState = placePickerState.f;
        Location location = placePickerState.j;
        boolean z = interfaceC1406a instanceof a.InterfaceC1406a.C1407a;
        b.a aVar = this.a;
        if (z) {
            a.InterfaceC1406a.C1407a c1407a = (a.InterfaceC1406a.C1407a) interfaceC1406a;
            aVar.a(new g.l.c(c1407a.b));
            NearbyPlaces nearbyPlaces = c1407a.c;
            Location location2 = nearbyPlaces.g;
            Location location3 = nearbyPlaces.h;
            NoLocation noLocation = NoLocation.b;
            Location location4 = !location2.equals(noLocation) ? location2 : !location3.equals(noLocation) ? location3 : noLocation;
            if (nearbyPlaces.f != GeoPermissionStatus.Granted || epx.f(location4, noLocation)) {
                b(placePickerState);
                return;
            }
            List<PostingPlaceDto> list = nearbyPlaces.b;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (PostingPlaceDto postingPlaceDto : list) {
                arrayList.add(new gra0(new PickerPlaceDto(postingPlaceDto.b, postingPlaceDto.c, postingPlaceDto.d, postingPlaceDto.e)));
            }
            aVar.a(new g.C1416g("", location4, arrayList, nearbyPlaces.c, nearbyPlaces.d, false));
            return;
        }
        if (interfaceC1406a instanceof a.InterfaceC1406a.d) {
            b(placePickerState);
            return;
        }
        if (interfaceC1406a instanceof a.InterfaceC1406a.b) {
            if (loadingState != PlacePickerState.LoadingState.IDLE) {
                return;
            }
            aVar.a(new g.d(PlacePickerState.LoadingState.LOADING));
            c(location, placePickerState.b(), new yl0(18, this, placePickerState));
            return;
        }
        boolean z2 = interfaceC1406a instanceof a.InterfaceC1406a.c;
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        if (z2) {
            bVar.e();
            aVar.b(i.b.C1418b.a);
            aVar.a(new g.d(PlacePickerState.LoadingState.RELOADING));
            c(location, placePickerState.b(), new v74(23, this, placePickerState));
            return;
        }
        if (interfaceC1406a instanceof a.InterfaceC1406a.e) {
            if (loadingState != PlacePickerState.LoadingState.ERROR) {
                return;
            }
            aVar.a(new g.d(PlacePickerState.LoadingState.LOADING));
            c(location, placePickerState.b(), new yl0(18, this, placePickerState));
            return;
        }
        if (!(interfaceC1406a instanceof a.InterfaceC1406a.f)) {
            throw new NoWhenBranchMatchedException();
        }
        PlacePickerState a2 = PlacePickerState.a(placePickerState, null, null, 0, ((a.InterfaceC1406a.f) interfaceC1406a).b, null, false, null, false, false, false, null, 16367);
        bVar.e();
        aVar.b(i.b.C1418b.a);
        aVar.a(new g.d(PlacePickerState.LoadingState.RELOADING));
        if (!a2.b() && a2.e.length() == 0) {
            aVar.a(new g.C1416g(a2.e, NoLocation.b, EmptyList.b, 0, 0, true));
        } else {
            int i = 24;
            bVar.b(new io.reactivex.rxjava3.internal.operators.single.r(this.b.a(a2.j, a2.b()), new tp1(new d0w(new lx60(5, this, a2), 13), i)).subscribe(new jw80(new xd8(1, aVar, juq.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 6), 3), new lw30(new ut6(i, this, a2), 6)));
        }
    }

    public final void b(PlacePickerState placePickerState) {
        this.c.e();
        g.d dVar = new g.d(PlacePickerState.LoadingState.RELOADING);
        b.a aVar = this.a;
        aVar.a(dVar);
        if (placePickerState.b() || placePickerState.e.length() != 0) {
            c(placePickerState.j, placePickerState.b(), new k22(15, placePickerState, this));
            return;
        }
        aVar.a(new g.C1416g(placePickerState.e, NoLocation.b, EmptyList.b, 0, 0, true));
    }

    public final void c(Location location, boolean z, izs<? super c, ? extends io.reactivex.rxjava3.core.x<com.vk.newsfeed.posting.geo_picker.presentation.g>> izsVar) {
        this.c.b(new io.reactivex.rxjava3.internal.operators.single.r(this.b.a(location, z), new je40(new ndh(izsVar, 2), 5)).subscribe(new o7y(new d(1, this.a, juq.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), 9), new bdz(new e(1, this, dra0.class, "dispatchError", "dispatchError(Ljava/lang/Throwable;)V", 0), 15)));
    }
}
