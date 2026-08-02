package com.yandex.go.trusted_contacts.data.entities.network;

import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/DeleteTrustedContactsRequest;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DeleteTrustedContactsRequest {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new b9h(11)), kotlin.a.b(lazyThreadSafetyMode, new b9h(12))};
    }

    public /* synthetic */ DeleteTrustedContactsRequest(List list, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteTrustedContactsRequest)) {
            return false;
        }
        DeleteTrustedContactsRequest deleteTrustedContactsRequest = (DeleteTrustedContactsRequest) obj;
        return jl40.l(this.a, deleteTrustedContactsRequest.a) && jl40.l(this.b, deleteTrustedContactsRequest.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("DeleteTrustedContactsRequest(trustedContactIds=", this.a, ", trustingContactIds=", this.b, Extension.C_BRAKE);
    }

    public DeleteTrustedContactsRequest(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeleteTrustedContactsRequest() {
        this(r0, r0);
        EmptyList emptyList = EmptyList.a;
    }
}
