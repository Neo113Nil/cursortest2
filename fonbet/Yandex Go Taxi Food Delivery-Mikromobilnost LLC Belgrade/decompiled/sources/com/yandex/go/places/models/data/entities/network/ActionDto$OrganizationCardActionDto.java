package com.yandex.go.places.models.data.entities.network;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$OrganizationCardActionDto", "Lcom/yandex/go/places/models/data/entities/network/s;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/m", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionDto$OrganizationCardActionDto extends s {
    public static final m Companion = new m();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ActionDto$OrganizationCardActionDto(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDto$OrganizationCardActionDto)) {
            return false;
        }
        ActionDto$OrganizationCardActionDto actionDto$OrganizationCardActionDto = (ActionDto$OrganizationCardActionDto) obj;
        return jl40.l(this.a, actionDto$OrganizationCardActionDto.a) && jl40.l(this.b, actionDto$OrganizationCardActionDto.b) && jl40.l(this.c, actionDto$OrganizationCardActionDto.c) && jl40.l(this.d, actionDto$OrganizationCardActionDto.d) && jl40.l(this.e, actionDto$OrganizationCardActionDto.e) && jl40.l(this.f, actionDto$OrganizationCardActionDto.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrganizationCardActionDto(oid=", this.a, ", uri=", this.b, ", suggestReqId=");
        g8e.D(v, this.c, ", mode=", this.d, ", yclid=");
        return g8e.r(v, this.e, ", bannerId=", this.f, Extension.C_BRAKE);
    }

    public ActionDto$OrganizationCardActionDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
