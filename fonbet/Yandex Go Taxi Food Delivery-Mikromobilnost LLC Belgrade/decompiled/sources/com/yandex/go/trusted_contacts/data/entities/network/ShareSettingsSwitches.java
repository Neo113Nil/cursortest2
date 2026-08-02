package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/ShareSettingsSwitches;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ShareSettingsSwitches {
    public static final k Companion = new k();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ ShareSettingsSwitches(String str, int i, String str2, boolean z) {
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
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareSettingsSwitches)) {
            return false;
        }
        ShareSettingsSwitches shareSettingsSwitches = (ShareSettingsSwitches) obj;
        return jl40.l(this.a, shareSettingsSwitches.a) && jl40.l(this.b, shareSettingsSwitches.b) && this.c == shareSettingsSwitches.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("ShareSettingsSwitches(id=", this.a, ", title=", this.b, ", isEnabledByDefault="), this.c, Extension.C_BRAKE);
    }

    public ShareSettingsSwitches(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public ShareSettingsSwitches() {
        this("", "", false);
    }
}
