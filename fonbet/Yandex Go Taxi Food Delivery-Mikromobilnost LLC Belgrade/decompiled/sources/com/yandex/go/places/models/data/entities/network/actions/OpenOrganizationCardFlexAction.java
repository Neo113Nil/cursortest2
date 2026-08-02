package com.yandex.go.places.models.data.entities.network.actions;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.kr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/OpenOrganizationCardFlexAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/actions/i", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OpenOrganizationCardFlexAction extends kr {
    public static final i Companion = new i();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ OpenOrganizationCardFlexAction(int i, String str, String str2, String str3, String str4) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOrganizationCardFlexAction)) {
            return false;
        }
        OpenOrganizationCardFlexAction openOrganizationCardFlexAction = (OpenOrganizationCardFlexAction) obj;
        return jl40.l(this.a, openOrganizationCardFlexAction.a) && jl40.l(this.b, openOrganizationCardFlexAction.b) && jl40.l(this.c, openOrganizationCardFlexAction.c) && jl40.l(this.d, openOrganizationCardFlexAction.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("OpenOrganizationCardFlexAction(uri=", this.a, ", oid=", this.b, ", suggestReqId="), this.c, ", goalTrackingLink=", this.d, Extension.C_BRAKE);
    }

    public OpenOrganizationCardFlexAction() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
