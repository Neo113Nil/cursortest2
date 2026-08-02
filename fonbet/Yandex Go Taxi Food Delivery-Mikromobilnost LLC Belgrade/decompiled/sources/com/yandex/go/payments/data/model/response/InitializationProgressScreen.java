package com.yandex.go.payments.data.model.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/InitializationProgressScreen;", "", "Companion", "com/yandex/go/payments/data/model/response/l0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InitializationProgressScreen {
    public static final l0 Companion = new l0();
    public static final InitializationProgressScreen b = new InitializationProgressScreen(0);
    public final String a;

    public /* synthetic */ InitializationProgressScreen(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitializationProgressScreen) && jl40.l(this.a, ((InitializationProgressScreen) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("InitializationProgressScreen(loadDescription=", this.a, Extension.C_BRAKE);
    }

    public InitializationProgressScreen(int i) {
        this.a = "";
    }

    public InitializationProgressScreen() {
        this(0);
    }
}
