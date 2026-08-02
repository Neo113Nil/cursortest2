package com.yandex.go.address.address_map_picker.ui.actions;

import android.graphics.Bitmap;
import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyButtonName;
import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyCloseReason;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.address.address_map_picker.domain.c;
import com.yandex.go.address.address_map_picker.navigation.g;
import com.yandex.go.address.address_map_picker.panorama.d;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import defpackage.a11;
import defpackage.a21;
import defpackage.a8y0;
import defpackage.avj0;
import defpackage.ayb;
import defpackage.b11;
import defpackage.bc1;
import defpackage.bp0;
import defpackage.c11;
import defpackage.d6z;
import defpackage.f11;
import defpackage.f21;
import defpackage.gz0;
import defpackage.hnb0;
import defpackage.hz0;
import defpackage.iz0;
import defpackage.j01;
import defpackage.j11;
import defpackage.j21;
import defpackage.jl40;
import defpackage.k21;
import defpackage.k56;
import defpackage.kyh0;
import defpackage.l21;
import defpackage.m21;
import defpackage.m950;
import defpackage.mbe0;
import defpackage.n21;
import defpackage.ny61;
import defpackage.o21;
import defpackage.p01;
import defpackage.p21;
import defpackage.pv0;
import defpackage.q21;
import defpackage.qu;
import defpackage.r21;
import defpackage.s21;
import defpackage.s71;
import defpackage.s8y0;
import defpackage.sy60;
import defpackage.t21;
import defpackage.tb90;
import defpackage.tje;
import defpackage.tls;
import defpackage.u21;
import defpackage.u6r;
import defpackage.umb0;
import defpackage.v21;
import defpackage.v6r;
import defpackage.vsx;
import defpackage.w511;
import defpackage.w71;
import defpackage.wy0;
import defpackage.x4e;
import defpackage.xb90;
import defpackage.y01;
import defpackage.ydp;
import defpackage.z01;
import defpackage.z81;
import defpackage.zy0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.panorama.d;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class a {
    public final p01 a;
    public final c b;
    public final d c;
    public final hnb0 d;
    public final ayb e;
    public final bp0 f;
    public final ru.yandex.taxi.address.clarification.impl.repo.a g;
    public final j11 h;

    public a(p01 p01Var, c cVar, d dVar, hnb0 hnb0Var, ayb aybVar, bp0 bp0Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar, j11 j11Var) {
        this.a = p01Var;
        this.b = cVar;
        this.c = dVar;
        this.d = hnb0Var;
        this.e = aybVar;
        this.f = bp0Var;
        this.g = aVar;
        this.h = j11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
    
        if (r0.e(r1, r6) == r7) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
    
        if (r0.e(r1, r6) == r7) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v21 v21Var, a11 a11Var, ContinuationImpl continuationImpl) {
        AddressMapPickerUiActionInteractor$handleAction$1 addressMapPickerUiActionInteractor$handleAction$1;
        u6r u6rVar;
        k56 k56Var;
        a11 a11Var2;
        a11 a11Var3;
        pv0 pv0Var;
        PointType pointType;
        a11 a11Var4;
        u6r u6rVar2;
        k56 k56Var2;
        a11 a11Var5;
        u6r u6rVar3;
        k56 k56Var3;
        f11 f11Var = f11.a;
        gz0 gz0Var = gz0.a;
        if (continuationImpl instanceof AddressMapPickerUiActionInteractor$handleAction$1) {
            addressMapPickerUiActionInteractor$handleAction$1 = (AddressMapPickerUiActionInteractor$handleAction$1) continuationImpl;
            int i = addressMapPickerUiActionInteractor$handleAction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressMapPickerUiActionInteractor$handleAction$1.label = i - Integer.MIN_VALUE;
                Object obj = addressMapPickerUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = 6;
                s8y0 s8y0Var = null;
                switch (addressMapPickerUiActionInteractor$handleAction$1.label) {
                    case 0:
                        b.b(obj);
                        boolean z = true;
                        if (jl40.l(v21Var, u21.a)) {
                            this.e.a(ClarifyAnalytics$ClarifyButtonName.Done);
                            this.e.b(ClarifyAnalytics$ClarifyCloseReason.Done);
                            bc1 bc1Var = (bc1) e.d(this.g.h).a.getValue();
                            if (!jl40.l(bc1Var, bc1.g)) {
                                v6r a = bc1Var.a();
                                String str = (a == null || (u6rVar3 = a.a) == null || (k56Var3 = u6rVar3.e) == null) ? null : k56Var3.d;
                                String str2 = str == null ? "" : str;
                                if (str2.length() != 0) {
                                    bp0 bp0Var = this.f;
                                    ru.yandex.taxi.address.clarification.impl.repo.a aVar = this.g;
                                    bp0Var.a("RestrictedAreaPopup.DidTapConfirmButton", true, aVar.d, str2, aVar.e);
                                }
                            }
                            if (this.h.a() != null && (!r1.equals(f11Var))) {
                                c cVar = this.b;
                                wy0 wy0Var = wy0.a;
                                addressMapPickerUiActionInteractor$handleAction$1.L$0 = null;
                                addressMapPickerUiActionInteractor$handleAction$1.L$1 = a11Var;
                                addressMapPickerUiActionInteractor$handleAction$1.label = 1;
                                break;
                            }
                            a11Var5 = a11Var;
                            a11Var5.a.r(new j01(i2));
                            return zy11.a;
                        }
                        if (jl40.l(v21Var, k21.a)) {
                            this.e.a(ClarifyAnalytics$ClarifyButtonName.Back);
                            bc1 bc1Var2 = (bc1) e.d(this.g.h).a.getValue();
                            if (!jl40.l(bc1Var2, bc1.g)) {
                                v6r a2 = bc1Var2.a();
                                String str3 = (a2 == null || (u6rVar2 = a2.a) == null || (k56Var2 = u6rVar2.e) == null) ? null : k56Var2.d;
                                String str4 = str3 == null ? "" : str3;
                                if (str4.length() != 0) {
                                    this.f.a("RestrictedAreaPopup.DidTapBack", false, this.g.d, str4, null);
                                }
                            }
                            if (this.h.a() != null && (!r1.equals(f11Var))) {
                                c cVar2 = this.b;
                                hz0 hz0Var = hz0.a;
                                addressMapPickerUiActionInteractor$handleAction$1.L$0 = null;
                                addressMapPickerUiActionInteractor$handleAction$1.L$1 = a11Var;
                                addressMapPickerUiActionInteractor$handleAction$1.label = 2;
                                break;
                            }
                            a11Var4 = a11Var;
                            a11Var4.a.r(new qu(9));
                            return zy11.a;
                        }
                        if (v21Var instanceof j21) {
                            AddressMapPickerPointType addressMapPickerPointType = ((j21) v21Var).a;
                            c11 c11Var = a11Var.a;
                            w71 w71Var = (w71) c11Var.S.getValue();
                            String h = ((avj0) c11Var.N).h(kyh0.search_source_address_hint);
                            int i3 = a21.a[addressMapPickerPointType.ordinal()];
                            if (i3 == 1) {
                                pointType = PointType.SOURCE;
                            } else {
                                if (i3 != 2) {
                                    w511.b();
                                    return null;
                                }
                                pointType = PointType.DESTINATION;
                            }
                            c11Var.A(w71Var, new s71(h, pointType, true, false, true), (b11) c11Var.T.getValue());
                        } else if (v21Var instanceof n21) {
                            String str5 = ((n21) v21Var).a;
                            c11 c11Var2 = a11Var.a;
                            c11Var2.A((m950) c11Var2.J.get(), new mbe0(str5, z), new g(c11Var2));
                        } else if (jl40.l(v21Var, p21.a)) {
                            this.e.a(ClarifyAnalytics$ClarifyButtonName.Geo);
                            c cVar3 = this.b;
                            zy0 zy0Var = zy0.a;
                            addressMapPickerUiActionInteractor$handleAction$1.L$0 = null;
                            addressMapPickerUiActionInteractor$handleAction$1.L$1 = null;
                            addressMapPickerUiActionInteractor$handleAction$1.label = 3;
                            Object e = cVar3.e(zy0Var, addressMapPickerUiActionInteractor$handleAction$1);
                            if (e != coroutineSingletons) {
                                return e;
                            }
                        } else if (jl40.l(v21Var, o21.a)) {
                            c11 c11Var3 = a11Var.a;
                            f21 a3 = c11Var3.R.a();
                            if (a3 != null && (pv0Var = a3.c) != null) {
                                c11Var3.A((m950) c11Var3.Q.get(), new ydp(z81.h(pv0Var.a, null), true, "clarify", null, 20), new y01(c11Var3, 0));
                            }
                        } else if (jl40.l(v21Var, s21.a)) {
                            ((umb0) this.d).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
                            c cVar4 = this.b;
                            addressMapPickerUiActionInteractor$handleAction$1.L$0 = null;
                            addressMapPickerUiActionInteractor$handleAction$1.L$1 = a11Var;
                            addressMapPickerUiActionInteractor$handleAction$1.label = 4;
                            if (cVar4.e(gz0Var, addressMapPickerUiActionInteractor$handleAction$1) != coroutineSingletons) {
                                a11Var3 = a11Var;
                                c11 c11Var4 = a11Var3.a;
                                c11Var4.z((m950) c11Var4.O.get(), new z01(c11Var4));
                            }
                        } else if (jl40.l(v21Var, t21.a)) {
                            this.e.a(ClarifyAnalytics$ClarifyButtonName.Retry);
                            this.e.b(ClarifyAnalytics$ClarifyCloseReason.Retry);
                            c cVar5 = this.b;
                            addressMapPickerUiActionInteractor$handleAction$1.L$0 = null;
                            addressMapPickerUiActionInteractor$handleAction$1.L$1 = a11Var;
                            addressMapPickerUiActionInteractor$handleAction$1.label = 5;
                            if (cVar5.e(gz0Var, addressMapPickerUiActionInteractor$handleAction$1) != coroutineSingletons) {
                                a11Var2 = a11Var;
                                c11 c11Var5 = a11Var2.a;
                                c11Var5.z((m950) c11Var5.O.get(), new z01(c11Var5));
                            }
                        } else if (jl40.l(v21Var, r21.a)) {
                            ((umb0) this.d).a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
                        } else if (v21Var instanceof l21) {
                            x4e.z(((l21) v21Var).a, this.a.a, null);
                        } else if (v21Var instanceof m21) {
                            bc1 bc1Var3 = (bc1) e.d(this.g.h).a.getValue();
                            if (!jl40.l(bc1Var3, bc1.g)) {
                                v6r a4 = bc1Var3.a();
                                String str6 = (a4 == null || (u6rVar = a4.a) == null || (k56Var = u6rVar.e) == null) ? null : k56Var.d;
                                String str7 = str6 != null ? str6 : "";
                                if (str7.length() != 0) {
                                    m21 m21Var = (m21) v21Var;
                                    this.f.c(m21Var.a, this.g.d, str7, m21Var.b);
                                }
                            }
                            c cVar6 = this.b;
                            m21 m21Var2 = (m21) v21Var;
                            iz0 iz0Var = new iz0(m21Var2.a, m21Var2.b);
                            addressMapPickerUiActionInteractor$handleAction$1.L$0 = null;
                            addressMapPickerUiActionInteractor$handleAction$1.L$1 = null;
                            addressMapPickerUiActionInteractor$handleAction$1.label = 6;
                            Object e2 = cVar6.e(iz0Var, addressMapPickerUiActionInteractor$handleAction$1);
                            if (e2 != coroutineSingletons) {
                                return e2;
                            }
                        } else {
                            if (!jl40.l(v21Var, q21.a)) {
                                w511.b();
                                return null;
                            }
                            final d dVar = this.c;
                            vsx vsxVar = dVar.h.a;
                            if (vsxVar != null) {
                                xb90 xb90Var = vsxVar.b;
                                a8y0 a8y0Var = dVar.c;
                                tb90 tb90Var = xb90Var.a;
                                a8y0Var.d(tb90Var.a, xb90Var.c, xb90Var.b, tb90Var.c);
                                ArrayList a5 = dVar.f.a();
                                ru.yandex.taxi.panorama.d dVar2 = xb90Var.d;
                                boolean equals = xb90Var.b.equals("a");
                                String str8 = equals ? dVar2.m.d : dVar2.m.e;
                                String Y = equals ? d6z.Y(dVar2, dVar2.m.b) : d6z.Y(dVar2, dVar2.m.c);
                                tb90 tb90Var2 = xb90Var.a;
                                String str9 = xb90Var.c;
                                String str10 = xb90Var.b;
                                double d = dVar2.i;
                                Bitmap bitmap = vsxVar.a.a;
                                d.b bVar = dVar2.k;
                                String Y2 = equals ? d6z.Y(dVar2, bVar.a) : d6z.Y(dVar2, bVar.b);
                                String Y3 = d6z.Y(dVar2, dVar2.l.a);
                                String Y4 = d6z.Y(dVar2, dVar2.l.b);
                                String Y5 = d6z.Y(dVar2, dVar2.m.a);
                                d.C0109d c0109d = dVar2.m;
                                s8y0Var = new s8y0(tb90Var2, str9, str10, d, bitmap, Y2, a5, Y3, Y4, Y5, Y, str8, c0109d.f, new tls() { // from class: com.yandex.go.address.address_map_picker.panorama.a
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        d dVar3 = d.this;
                                        tje.N(dVar3.a, null, null, new AddressMapPickerPanoramaInteractor$movePinToGeoPoint$1(dVar3, (zzs) obj2, null), 3);
                                        return zy11.a;
                                    }
                                }, c0109d.g);
                            }
                            if (s8y0Var != null) {
                                c11 c11Var6 = a11Var.a;
                                c11Var6.A((m950) c11Var6.M.get(), s8y0Var, sy60.Q2);
                            }
                        }
                        return zy11.a;
                        return coroutineSingletons;
                    case 1:
                        a11Var5 = (a11) addressMapPickerUiActionInteractor$handleAction$1.L$1;
                        b.b(obj);
                        a11Var5.a.r(new j01(i2));
                        return zy11.a;
                    case 2:
                        a11Var4 = (a11) addressMapPickerUiActionInteractor$handleAction$1.L$1;
                        b.b(obj);
                        a11Var4.a.r(new qu(9));
                        return zy11.a;
                    case 3:
                    case 6:
                        b.b(obj);
                        return obj;
                    case 4:
                        a11Var3 = (a11) addressMapPickerUiActionInteractor$handleAction$1.L$1;
                        b.b(obj);
                        c11 c11Var42 = a11Var3.a;
                        c11Var42.z((m950) c11Var42.O.get(), new z01(c11Var42));
                        return zy11.a;
                    case 5:
                        a11Var2 = (a11) addressMapPickerUiActionInteractor$handleAction$1.L$1;
                        b.b(obj);
                        c11 c11Var52 = a11Var2.a;
                        c11Var52.z((m950) c11Var52.O.get(), new z01(c11Var52));
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        addressMapPickerUiActionInteractor$handleAction$1 = new AddressMapPickerUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj2 = addressMapPickerUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i22 = 6;
        s8y0 s8y0Var2 = null;
        switch (addressMapPickerUiActionInteractor$handleAction$1.label) {
        }
    }
}
