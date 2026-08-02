package com.yandex.passport.data.network;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class id {
    public final boolean a;
    public final String b;

    public id(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id)) {
            return false;
        }
        id idVar = (id) obj;
        return this.a == idVar.a && this.b.equals(idVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagingPlusDevicesResult(hasDeviceAdded=");
        sb.append(this.a);
        sb.append(", requestId=");
        return b64.p(sb, this.b, ')');
    }
}
