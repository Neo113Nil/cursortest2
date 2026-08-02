package com.yandex.go.transfer_requirement.transferapi.draft;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/transfer_requirement/transferapi/draft/TransferDraftDto$ManualLookup", "", "Companion", "$serializer", "com/yandex/go/transfer_requirement/transferapi/draft/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TransferDraftDto$ManualLookup {
    public static final b Companion = new b();
    public final Boolean a;

    public /* synthetic */ TransferDraftDto$ManualLookup(Boolean bool, int i) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransferDraftDto$ManualLookup) && jl40.l(this.a, ((TransferDraftDto$ManualLookup) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "ManualLookup(enabled=" + this.a + Extension.C_BRAKE;
    }

    public TransferDraftDto$ManualLookup() {
        this.a = null;
    }
}
