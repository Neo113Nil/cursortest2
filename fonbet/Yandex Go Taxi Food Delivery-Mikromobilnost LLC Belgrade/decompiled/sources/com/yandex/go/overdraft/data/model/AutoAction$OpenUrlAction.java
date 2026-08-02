package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/overdraft/data/model/AutoAction$OpenUrlAction", "Lcom/yandex/go/overdraft/data/model/e;", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AutoAction$OpenUrlAction extends e {
    public static final c Companion = new c();
    public final String a;

    public AutoAction$OpenUrlAction(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoAction$OpenUrlAction) && jl40.l(this.a, ((AutoAction$OpenUrlAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenUrlAction(url=", this.a, Extension.C_BRAKE);
    }

    public AutoAction$OpenUrlAction() {
        this.a = "";
    }
}
