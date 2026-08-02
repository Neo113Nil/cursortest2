package com.yandex.go.zone.dto.response;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/response/Selector;", "", "Companion", "HighlightedEtaDto", "com/yandex/go/zone/dto/response/g", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Selector {
    public static final g Companion = new g();
    public static final Selector i = new Selector(0);
    public final String a;
    public final String b;
    public final n7v c;
    public final n7v d;
    public final n7v e;
    public final boolean f;
    public final float g;
    public final HighlightedEtaDto h;

    public /* synthetic */ Selector(int i2, String str, String str2, n7v n7vVar, n7v n7vVar2, n7v n7vVar3, boolean z, float f, HighlightedEtaDto highlightedEtaDto) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = n7vVar;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = n7vVar2;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = n7vVar3;
        }
        if ((i2 & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i2 & 64) == 0) {
            this.g = 0.0f;
        } else {
            this.g = f;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = highlightedEtaDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selector)) {
            return false;
        }
        Selector selector = (Selector) obj;
        return jl40.l(this.a, selector.a) && jl40.l(this.b, selector.b) && jl40.l(this.c, selector.c) && jl40.l(this.d, selector.d) && jl40.l(this.e, selector.e) && this.f == selector.f && Float.compare(this.g, selector.g) == 0 && jl40.l(this.h, selector.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        n7v n7vVar = this.c;
        int hashCode3 = (hashCode2 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        n7v n7vVar2 = this.d;
        int hashCode4 = (hashCode3 + (n7vVar2 == null ? 0 : n7vVar2.hashCode())) * 31;
        n7v n7vVar3 = this.e;
        int c = g8e.c(this.g, unr0.e((hashCode4 + (n7vVar3 == null ? 0 : n7vVar3.hashCode())) * 31, 31, this.f), 31);
        HighlightedEtaDto highlightedEtaDto = this.h;
        return c + (highlightedEtaDto != null ? highlightedEtaDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Selector(description=", this.a, ", tooltip=", this.b, ", carIcon=");
        v.append(this.c);
        v.append(", carImage=");
        v.append(this.d);
        v.append(", priceIcon=");
        v.append(this.e);
        v.append(", isHidden=");
        v.append(this.f);
        v.append(", hiddenPercent=");
        v.append(this.g);
        v.append(", highlightedEta=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/response/Selector$HighlightedEtaDto;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/response/h", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class HighlightedEtaDto {
        public static final h Companion = new h();
        public final String a;
        public final String b;

        public /* synthetic */ HighlightedEtaDto(int i, String str, String str2) {
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
            if (!(obj instanceof HighlightedEtaDto)) {
                return false;
            }
            HighlightedEtaDto highlightedEtaDto = (HighlightedEtaDto) obj;
            return jl40.l(this.a, highlightedEtaDto.a) && jl40.l(this.b, highlightedEtaDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("HighlightedEtaDto(color=", this.a, ", textColor=", this.b, Extension.C_BRAKE);
        }

        public HighlightedEtaDto() {
            this.a = "";
            this.b = "";
        }
    }

    public Selector(int i2) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = 0.0f;
        this.h = null;
    }

    public Selector() {
        this(0);
    }
}
