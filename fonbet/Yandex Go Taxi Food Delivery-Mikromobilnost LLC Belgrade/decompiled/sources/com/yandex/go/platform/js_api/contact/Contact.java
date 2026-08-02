package com.yandex.go.platform.js_api.contact;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/contact/Contact;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/contact/a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Contact {
    public static final a Companion = new a();
    public final String a;
    public final String b;

    public /* synthetic */ Contact(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, Contact$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        return jl40.l(this.a, contact.a) && jl40.l(this.b, contact.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(name=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        return b64.p(sb, this.b, ')');
    }

    public Contact(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
