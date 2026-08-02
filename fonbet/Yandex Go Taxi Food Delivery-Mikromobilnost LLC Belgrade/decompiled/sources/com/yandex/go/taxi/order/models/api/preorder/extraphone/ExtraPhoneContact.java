package com.yandex.go.taxi.order.models.api.preorder.extraphone;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/extraphone/ExtraPhoneContact;", "", "Companion", "com/yandex/go/taxi/order/models/api/preorder/extraphone/a", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ExtraPhoneContact {
    public static final a Companion = new a();
    public static final ExtraPhoneContact c = new ExtraPhoneContact(0);
    public final String a;
    public final String b;

    public /* synthetic */ ExtraPhoneContact(int i, String str, String str2) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraPhoneContact)) {
            return false;
        }
        ExtraPhoneContact extraPhoneContact = (ExtraPhoneContact) obj;
        return jl40.l(this.a, extraPhoneContact.a) && jl40.l(this.b, extraPhoneContact.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public ExtraPhoneContact() {
        this(0);
    }

    public ExtraPhoneContact(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ ExtraPhoneContact(int i) {
        this("", "");
    }
}
