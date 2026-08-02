package com.yandex.go.payments.addmethod.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/UserDataField;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/n0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UserDataField {
    public static final n0 Companion = new n0();
    public final String a;
    public final String b;

    public /* synthetic */ UserDataField(int i, String str, String str2) {
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
        if (!(obj instanceof UserDataField)) {
            return false;
        }
        UserDataField userDataField = (UserDataField) obj;
        return jl40.l(this.a, userDataField.a) && jl40.l(this.b, userDataField.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("UserDataField(fieldId=", this.a, ", fieldValue=", this.b, Extension.C_BRAKE);
    }

    public UserDataField(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public UserDataField() {
        this("", "");
    }
}
