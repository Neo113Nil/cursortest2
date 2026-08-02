package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.rm6;
import defpackage.txw0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/BundledOrdersPayload;", "", "Companion", "$serializer", "com/yandex/go/dto/response/r1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BundledOrdersPayload {
    public static final r1 Companion = new r1();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(13)), null};
    public final FormattedText a;
    public final FormattedText b;
    public final List c;
    public final txw0 d;

    public /* synthetic */ BundledOrdersPayload(int i, FormattedText formattedText, FormattedText formattedText2, List list, txw0 txw0Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = txw0Var;
        }
    }

    public static BundledOrdersPayload a(BundledOrdersPayload bundledOrdersPayload, ArrayList arrayList) {
        FormattedText formattedText = bundledOrdersPayload.a;
        FormattedText formattedText2 = bundledOrdersPayload.b;
        txw0 txw0Var = bundledOrdersPayload.d;
        bundledOrdersPayload.getClass();
        return new BundledOrdersPayload(formattedText, formattedText2, arrayList, txw0Var);
    }

    /* renamed from: b, reason: from getter */
    public final List getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final txw0 getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundledOrdersPayload)) {
            return false;
        }
        BundledOrdersPayload bundledOrdersPayload = (BundledOrdersPayload) obj;
        return jl40.l(this.a, bundledOrdersPayload.a) && jl40.l(this.b, bundledOrdersPayload.b) && jl40.l(this.c, bundledOrdersPayload.c) && jl40.l(this.d, bundledOrdersPayload.d);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        txw0 txw0Var = this.d;
        return c + (txw0Var == null ? 0 : txw0Var.hashCode());
    }

    public final String toString() {
        StringBuilder r = defpackage.n.r("BundledOrdersPayload(title=", this.a, ", subtitle=", this.b, ", orders=");
        r.append(this.c);
        r.append(", swipeAction=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public BundledOrdersPayload() {
        this(0);
    }

    public BundledOrdersPayload(FormattedText formattedText, FormattedText formattedText2, List list, txw0 txw0Var) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = list;
        this.d = txw0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BundledOrdersPayload(int i) {
        this(r3, r3, EmptyList.a, null);
        FormattedText formattedText = FormattedText.c;
    }
}
