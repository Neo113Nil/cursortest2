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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/DeletedTrustedContactsResponse;", "", "Companion", "$serializer", "com/yandex/go/trusted_contacts/data/entities/network/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DeletedTrustedContactsResponse {
    public static final c Companion = new c();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new b9h(13)), kotlin.a.b(lazyThreadSafetyMode, new b9h(14))};
    }

    public /* synthetic */ DeletedTrustedContactsResponse(List list, List list2, int i) {
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
        if (!(obj instanceof DeletedTrustedContactsResponse)) {
            return false;
        }
        DeletedTrustedContactsResponse deletedTrustedContactsResponse = (DeletedTrustedContactsResponse) obj;
        return jl40.l(this.a, deletedTrustedContactsResponse.a) && jl40.l(this.b, deletedTrustedContactsResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("DeletedTrustedContactsResponse(trustedContactIds=", this.a, ", trustingContactIds=", this.b, Extension.C_BRAKE);
    }

    public DeletedTrustedContactsResponse(int i) {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }

    public DeletedTrustedContactsResponse() {
        this(0);
    }
}
