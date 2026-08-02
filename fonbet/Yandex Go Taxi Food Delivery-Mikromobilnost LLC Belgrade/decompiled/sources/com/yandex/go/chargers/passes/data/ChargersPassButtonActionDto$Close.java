package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassButtonActionDto$Close", "Lcom/yandex/go/chargers/passes/data/i;", "Companion", "com/yandex/go/chargers/passes/data/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassButtonActionDto$Close extends i {
    public static final c Companion = new c();
    public final String a;

    public ChargersPassButtonActionDto$Close(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "close";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersPassButtonActionDto$Close) && jl40.l(this.a, ((ChargersPassButtonActionDto$Close) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Close(type=", this.a, Extension.C_BRAKE);
    }

    public ChargersPassButtonActionDto$Close() {
        this.a = "close";
    }
}
