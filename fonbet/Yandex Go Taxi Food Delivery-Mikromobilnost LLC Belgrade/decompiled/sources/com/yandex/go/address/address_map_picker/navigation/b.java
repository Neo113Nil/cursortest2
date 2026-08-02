package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.mapkit.geometry.Point;
import defpackage.a11;
import defpackage.c11;
import defpackage.cwa1;
import defpackage.fh00;
import defpackage.gh00;
import defpackage.jqr;
import defpackage.m01;
import defpackage.tje;
import defpackage.tls;
import defpackage.utr;
import defpackage.v21;
import defpackage.ymu;
import defpackage.zy11;
import defpackage.zzs;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                f fVar = (f) obj2;
                utr utrVar = (utr) obj;
                ymu ymuVar = ((m01) obj3).a;
                if (ymuVar != null) {
                    Float f = (Float) ymuVar.c;
                    float floatValue = f != null ? f.floatValue() : 17.0f;
                    Point d = cwa1.d((zzs) ymuVar.b);
                    gh00 gh00Var = (gh00) fVar.E;
                    gh00Var.getClass();
                    gh00Var.q(new fh00(gh00Var, d, floatValue));
                }
                kotlinx.coroutines.flow.e.H(fVar.o(), new jqr(utrVar.m1(), new AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$2(fVar, null), 3));
                kotlinx.coroutines.flow.e.H(fVar.o(), new jqr(fVar.I.b, new AddressMapPickerMapLayerRouterImpl$initMapApis$1$1$3(utrVar, null), 3));
                break;
            default:
                c11 c11Var = (c11) obj3;
                tje.N(c11Var.o(), null, null, new AddressMapPickerModalViewRouter$content$1$1$1(c11Var, (v21) obj, (a11) obj2, null), 3);
                break;
        }
        return zy11Var;
    }
}
