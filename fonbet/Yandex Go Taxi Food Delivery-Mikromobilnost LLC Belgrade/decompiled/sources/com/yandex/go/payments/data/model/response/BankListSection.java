package com.yandex.go.payments.data.model.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.p73;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/BankListSection;", "", "Companion", "BankItem", "$serializer", "com/yandex/go/payments/data/model/response/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BankListSection {
    public static final n Companion = new n();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(28))};
    public final String a;
    public final List b;

    public /* synthetic */ BankListSection(int i, String str, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankListSection)) {
            return false;
        }
        BankListSection bankListSection = (BankListSection) obj;
        return jl40.l(this.a, bankListSection.a) && jl40.l(this.b, bankListSection.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nnm.h("BankListSection(title=", this.a, ", banks=", Extension.C_BRAKE, this.b);
    }

    public BankListSection() {
        this.a = null;
        this.b = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/BankListSection$BankItem;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BankItem {
        public static final m Companion = new m();
        public static final i3y[] h = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(29)), null, null, null};
        public final String a;
        public final String b;
        public final String c;
        public final List d;
        public final String e;
        public final boolean f;
        public final boolean g;

        public /* synthetic */ BankItem(int i, String str, String str2, String str3, String str4, List list, boolean z, boolean z2) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z;
            }
            if ((i & 64) == 0) {
                this.g = true;
            } else {
                this.g = z2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BankItem)) {
                return false;
            }
            BankItem bankItem = (BankItem) obj;
            return jl40.l(this.a, bankItem.a) && jl40.l(this.b, bankItem.b) && jl40.l(this.c, bankItem.c) && jl40.l(this.d, bankItem.d) && jl40.l(this.e, bankItem.e) && this.f == bankItem.f && this.g == bankItem.g;
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            List list = this.d;
            int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.e;
            return Boolean.hashCode(this.g) + unr0.e((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder v = b64.v("BankItem(bankId=", this.a, ", title=", this.b, ", bankName=");
            tse0.x(this.c, ", additionalKeywords=", ", subtitle=", v, this.d);
            tse0.y(this.e, ", hasWeb=", ", enabled=", v, this.f);
            return x4e.i(v, this.g, Extension.C_BRAKE);
        }

        public BankItem() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
            this.e = null;
            this.f = false;
            this.g = true;
        }
    }
}
