package com.yandex.go.payments.data.model.response;

import defpackage.auu0;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/CoopAccountUiDto;", "", "Companion", "Details", "$serializer", "com/yandex/go/payments/data/model/response/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CoopAccountUiDto {
    public static final z Companion = new z();
    public final String a;
    public final String b;
    public final Details c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;

    public /* synthetic */ CoopAccountUiDto(int i, String str, String str2, Details details, boolean z, String str3, String str4, boolean z2) {
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
            this.c = new Details(0);
        } else {
            this.c = details;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
    }

    public static final /* synthetic */ void a(CoopAccountUiDto coopAccountUiDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(coopAccountUiDto.a, "")) {
            yjdVar.o(serialDescriptor, 0, coopAccountUiDto.a);
        }
        if (yjdVar.F() || !jl40.l(coopAccountUiDto.b, "")) {
            yjdVar.o(serialDescriptor, 1, coopAccountUiDto.b);
        }
        if (yjdVar.F() || !jl40.l(coopAccountUiDto.c, new Details(0))) {
            yjdVar.e(serialDescriptor, 2, CoopAccountUiDto$Details$$serializer.INSTANCE, coopAccountUiDto.c);
        }
        if (yjdVar.F() || coopAccountUiDto.d) {
            yjdVar.n(serialDescriptor, 3, coopAccountUiDto.d);
        }
        if (yjdVar.F() || coopAccountUiDto.e != null) {
            yjdVar.g(serialDescriptor, 4, auu0.a, coopAccountUiDto.e);
        }
        if (yjdVar.F() || !jl40.l(coopAccountUiDto.f, "")) {
            yjdVar.o(serialDescriptor, 5, coopAccountUiDto.f);
        }
        if (yjdVar.F() || coopAccountUiDto.g) {
            yjdVar.n(serialDescriptor, 6, coopAccountUiDto.g);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoopAccountUiDto)) {
            return false;
        }
        CoopAccountUiDto coopAccountUiDto = (CoopAccountUiDto) obj;
        return jl40.l(this.a, coopAccountUiDto.a) && jl40.l(this.b, coopAccountUiDto.b) && jl40.l(this.c, coopAccountUiDto.c) && this.d == coopAccountUiDto.d && jl40.l(this.e, coopAccountUiDto.e) && jl40.l(this.f, coopAccountUiDto.f) && this.g == coopAccountUiDto.g;
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + unr0.b((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("CoopAccountUiDto(id=", this.a, ", type=", this.b, ", details=");
        v.append(this.c);
        v.append(", isActive=");
        v.append(this.d);
        v.append(", memberRole=");
        g8e.D(v, this.e, ", description=", this.f, ", hasRides=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/CoopAccountUiDto$Details;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Details {
        public static final a0 Companion = new a0();
        public final String a;
        public final String b;

        public /* synthetic */ Details(int i, String str, String str2) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return jl40.l(this.a, details.a) && jl40.l(this.b, details.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("Details(name=", this.a, ", color=", this.b, Extension.C_BRAKE);
        }

        public Details(int i) {
            this.a = "";
            this.b = "";
        }

        public Details() {
            this(0);
        }
    }

    public CoopAccountUiDto() {
        Details details = new Details(0);
        this.a = "";
        this.b = "";
        this.c = details;
        this.d = false;
        this.e = null;
        this.f = "";
        this.g = false;
    }
}
