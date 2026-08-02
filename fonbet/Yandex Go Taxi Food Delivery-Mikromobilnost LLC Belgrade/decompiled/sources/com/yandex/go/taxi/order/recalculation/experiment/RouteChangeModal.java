package com.yandex.go.taxi.order.recalculation.experiment;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/recalculation/experiment/RouteChangeModal;", "", "Companion", "com/yandex/go/taxi/order/recalculation/experiment/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RouteChangeModal {
    public static final c Companion = new c();
    public static final RouteChangeModal k = new RouteChangeModal(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public /* synthetic */ RouteChangeModal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteChangeModal)) {
            return false;
        }
        RouteChangeModal routeChangeModal = (RouteChangeModal) obj;
        return jl40.l(this.a, routeChangeModal.a) && jl40.l(this.b, routeChangeModal.b) && jl40.l(this.c, routeChangeModal.c) && jl40.l(this.d, routeChangeModal.d) && jl40.l(this.e, routeChangeModal.e) && jl40.l(this.f, routeChangeModal.f) && jl40.l(this.g, routeChangeModal.g) && jl40.l(this.h, routeChangeModal.h) && jl40.l(this.i, routeChangeModal.i) && jl40.l(this.j, routeChangeModal.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder v = b64.v("RouteChangeModal(headerKey=", this.a, ", headerChangeStopKey=", this.b, ", headerChangeDestinationKey=");
        g8e.D(v, this.c, ", headerChangeDestinationsKey=", this.d, ", headerRemoveStopKey=");
        g8e.D(v, this.e, ", descriptionKey=", this.f, ", buttonAcceptKey=");
        g8e.D(v, this.g, ", buttonCancelKey=", this.h, ", recalculationErrorKey=");
        return g8e.r(v, this.i, ", imageTag=", this.j, Extension.C_BRAKE);
    }

    public RouteChangeModal(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
    }

    public RouteChangeModal() {
        this(0);
    }
}
