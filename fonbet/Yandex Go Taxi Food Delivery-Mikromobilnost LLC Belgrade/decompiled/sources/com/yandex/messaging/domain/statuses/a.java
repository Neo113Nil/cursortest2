package com.yandex.messaging.domain.statuses;

import defpackage.clf;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class a {
    public final clf a;
    public final StatusAvailability b;
    public final boolean c;

    public a(clf clfVar, StatusAvailability statusAvailability, boolean z) {
        this.a = clfVar;
        this.b = statusAvailability;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomStatusPreset(customStatus=");
        sb.append(this.a);
        sb.append(", availability=");
        sb.append(this.b);
        sb.append(", muteNotification=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
