package com.yandex.go.payments.domain;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.q03;
import defpackage.xvz;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/domain/BankModel;", "", "Companion", "com/yandex/go/payments/domain/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BankModel {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(13))};
    public static final BankModel d = new BankModel(null, null);
    public final String a;
    public final Map b;

    public /* synthetic */ BankModel(int i, String str, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankModel)) {
            return false;
        }
        BankModel bankModel = (BankModel) obj;
        return jl40.l(this.a, bankModel.a) && jl40.l(this.b, bankModel.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return xvz.j("BankModel(fileUrl=", this.a, ", banksIcons=", Extension.C_BRAKE, this.b);
    }

    public BankModel(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public BankModel() {
        this(null, null);
    }
}
