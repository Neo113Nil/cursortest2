package com.yandex.go.flex.common.api.actions;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/OpenOrganizationsListAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/c0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OpenOrganizationsListAction extends n {
    public static final c0 Companion = new c0();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ OpenOrganizationsListAction(int i, String str, String str2, String str3, String str4) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOrganizationsListAction)) {
            return false;
        }
        OpenOrganizationsListAction openOrganizationsListAction = (OpenOrganizationsListAction) obj;
        return jl40.l(this.b, openOrganizationsListAction.b) && jl40.l(this.c, openOrganizationsListAction.c) && jl40.l(this.d, openOrganizationsListAction.d) && jl40.l(this.e, openOrganizationsListAction.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("OpenOrganizationsListAction(geosearchContext=", this.b, ", context=", this.c, ", placeholder="), this.d, ", source=", this.e, Extension.C_BRAKE);
    }

    public OpenOrganizationsListAction() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
