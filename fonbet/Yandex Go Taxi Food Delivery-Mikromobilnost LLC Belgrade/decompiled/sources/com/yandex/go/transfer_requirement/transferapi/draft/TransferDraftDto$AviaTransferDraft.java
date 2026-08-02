package com.yandex.go.transfer_requirement.transferapi.draft;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/transfer_requirement/transferapi/draft/TransferDraftDto$AviaTransferDraft", "Lcom/yandex/go/transfer_requirement/transferapi/draft/e;", "Companion", "$serializer", "com/yandex/go/transfer_requirement/transferapi/draft/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TransferDraftDto$AviaTransferDraft extends e {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final TransferDraftDto$ManualLookup f;
    public final Integer g;

    public TransferDraftDto$AviaTransferDraft(int i, String str, String str2, String str3, String str4, String str5, TransferDraftDto$ManualLookup transferDraftDto$ManualLookup, Integer num) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = transferDraftDto$ManualLookup;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferDraftDto$AviaTransferDraft)) {
            return false;
        }
        TransferDraftDto$AviaTransferDraft transferDraftDto$AviaTransferDraft = (TransferDraftDto$AviaTransferDraft) obj;
        return jl40.l(this.a, transferDraftDto$AviaTransferDraft.a) && jl40.l(this.b, transferDraftDto$AviaTransferDraft.b) && jl40.l(this.c, transferDraftDto$AviaTransferDraft.c) && jl40.l(this.d, transferDraftDto$AviaTransferDraft.d) && jl40.l(this.e, transferDraftDto$AviaTransferDraft.e) && jl40.l(this.f, transferDraftDto$AviaTransferDraft.f) && jl40.l(this.g, transferDraftDto$AviaTransferDraft.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TransferDraftDto$ManualLookup transferDraftDto$ManualLookup = this.f;
        int hashCode6 = (hashCode5 + (transferDraftDto$ManualLookup == null ? 0 : transferDraftDto$ManualLookup.hashCode())) * 31;
        Integer num = this.g;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AviaTransferDraft(id=", this.a, ", due=", this.b, ", transferText=");
        g8e.D(v, this.c, ", transferTextSummary=", this.d, ", expirationTime=");
        v.append(this.e);
        v.append(", manualLookup=");
        v.append(this.f);
        v.append(", lookupTtl=");
        return oo31.j(v, this.g, Extension.C_BRAKE);
    }

    public TransferDraftDto$AviaTransferDraft() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
