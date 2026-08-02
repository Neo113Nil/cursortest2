package com.yandex.go.flex.common.api.actions;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nnm;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/OpenOrganizationCardAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/b0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OpenOrganizationCardAction extends n {
    public static final b0 Companion = new b0();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public /* synthetic */ OpenOrganizationCardAction(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOrganizationCardAction)) {
            return false;
        }
        OpenOrganizationCardAction openOrganizationCardAction = (OpenOrganizationCardAction) obj;
        return jl40.l(this.b, openOrganizationCardAction.b) && jl40.l(this.c, openOrganizationCardAction.c) && jl40.l(this.d, openOrganizationCardAction.d) && jl40.l(this.e, openOrganizationCardAction.e) && jl40.l(this.f, openOrganizationCardAction.f) && this.g == openOrganizationCardAction.g;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return Boolean.hashCode(this.g) + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpenOrganizationCardAction(uri=", this.b, ", oid=", this.c, ", yclid=");
        g8e.D(v, this.d, ", suggestReqid=", this.e, ", source=");
        return nnm.i(this.f, ", withMultipleMediaCards=", Extension.C_BRAKE, v, this.g);
    }

    public OpenOrganizationCardAction() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
    }
}
