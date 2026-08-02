package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/overdraft/data/model/TapAction$OpenUrlAction", "Lcom/yandex/go/overdraft/data/model/t0;", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TapAction$OpenUrlAction extends t0 {
    public static final m0 Companion = new m0();
    public final String a;

    public TapAction$OpenUrlAction(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    @Override // com.yandex.go.overdraft.data.model.t0
    public final ButtonActionType a() {
        return ButtonActionType.OPEN_URL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapAction$OpenUrlAction) && jl40.l(this.a, ((TapAction$OpenUrlAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenUrlAction(url=", this.a, Extension.C_BRAKE);
    }

    public TapAction$OpenUrlAction() {
        this.a = "";
    }
}
