package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffDefinitionPresentationModal;", "", "Companion", "com/yandex/go/zone/dto/objects/e6", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TariffDefinitionPresentationModal {
    public static final e6 Companion = new e6();
    public static final TariffDefinitionPresentationModal f = new TariffDefinitionPresentationModal(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ TariffDefinitionPresentationModal(String str, String str2, String str3, String str4, int i, String str5) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffDefinitionPresentationModal)) {
            return false;
        }
        TariffDefinitionPresentationModal tariffDefinitionPresentationModal = (TariffDefinitionPresentationModal) obj;
        return jl40.l(this.a, tariffDefinitionPresentationModal.a) && jl40.l(this.b, tariffDefinitionPresentationModal.b) && jl40.l(this.c, tariffDefinitionPresentationModal.c) && jl40.l(this.d, tariffDefinitionPresentationModal.d) && jl40.l(this.e, tariffDefinitionPresentationModal.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("TariffDefinitionPresentationModal(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        g8e.D(v, this.c, ", preview=", this.d, ", buttonText=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public TariffDefinitionPresentationModal(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
    }

    public TariffDefinitionPresentationModal() {
        this(0);
    }
}
