package com.yandex.go.places.impl.ui.main.map.filters;

import com.yandex.go.places.impl.data.entities.network.bookings.BookingDto;
import com.yandex.go.places.impl.data.entities.network.bookings.PlacesUserBookingsResponse;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.evu0;
import defpackage.g6c0;
import defpackage.jwd;
import defpackage.k5c0;
import defpackage.kk80;
import defpackage.l5c0;
import defpackage.mvg;
import defpackage.nk80;
import defpackage.ny61;
import defpackage.p5c0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersPresenter$renderBookings$1", f = "PlacesCategoryFiltersPresenter.kt", l = {364, 365, 371}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesCategoryFiltersPresenter$renderBookings$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesCategoryFiltersPresenter$renderBookings$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesCategoryFiltersPresenter$renderBookings$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesCategoryFiltersPresenter$renderBookings$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0168, code lost:
    
        if (r2.O9(r10, r19) == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0056, code lost:
    
        if (r2 == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x003e, code lost:
    
        if (r2 == r1) goto L83;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object a;
        List a2;
        ArrayList arrayList;
        k5c0 k5c0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.experiments.map.map_as_main_places.b bVar = this.this$0.I;
            this.label = 1;
            b = bVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                kotlin.b.b(obj);
                a = obj;
                nk80 nk80Var = (nk80) a;
                if (nk80Var instanceof kk80) {
                    p5c0 p5c0Var = this.this$0.J;
                    PlacesUserBookingsResponse placesUserBookingsResponse = (PlacesUserBookingsResponse) ((kk80) nk80Var).a;
                    List list = placesUserBookingsResponse.a;
                    String str = placesUserBookingsResponse.b;
                    p5c0Var.getClass();
                    BookingDto bookingDto = (BookingDto) kotlin.collections.a.R(list);
                    if (bookingDto == null) {
                        k5c0Var = null;
                    } else {
                        int i2 = 0;
                        boolean z = list.size() > 1;
                        if (z) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str2 = ((BookingDto) it.next()).e;
                                if (evu0.J(str2)) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    arrayList2.add(str2);
                                }
                            }
                            a2 = Collections.singletonList(new jwd(kotlin.collections.a.X(arrayList2, Extension.FIX_SPACE, null, null, null, 62), 4));
                        } else {
                            a2 = p5c0.a(bookingDto);
                        }
                        List list2 = a2;
                        if (z) {
                            List list3 = list;
                            ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                            for (Object obj2 : list3) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                BookingDto bookingDto2 = (BookingDto) obj2;
                                String str3 = bookingDto2.c + i2;
                                String str4 = bookingDto2.c;
                                ArrayList a3 = p5c0.a(bookingDto2);
                                ImageDto imageDto = bookingDto2.o;
                                String str5 = imageDto != null ? imageDto.a : null;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str6 = bookingDto2.m;
                                arrayList3.add(new l5c0(str3, str4, str5, str6 == null ? "" : str6, a3));
                                i2 = i3;
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = null;
                        }
                        if (!z) {
                            str = bookingDto.c;
                        }
                        String str7 = str;
                        ImageDto imageDto2 = bookingDto.o;
                        k5c0Var = new k5c0(str7, list2, !z ? imageDto2 != null ? imageDto2.a : null : null, !z ? bookingDto.m : null, arrayList);
                    }
                    if (k5c0Var != null) {
                        g6c0 g6c0Var = (g6c0) this.this$0.Dg();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        if (((Boolean) b).booleanValue()) {
            com.yandex.go.places.impl.data.repositories.bookings.a aVar = this.this$0.H;
            this.label = 2;
            a = aVar.a(50, this);
        }
        return zy11.a;
    }
}
