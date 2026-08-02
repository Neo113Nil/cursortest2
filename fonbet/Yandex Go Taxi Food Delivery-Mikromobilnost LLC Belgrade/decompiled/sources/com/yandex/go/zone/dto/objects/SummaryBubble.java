package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SummaryBubble;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/h5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SummaryBubble {
    public static final h5 Companion = new h5();
    public final String a;
    public final n7v b;

    public /* synthetic */ SummaryBubble(int i, n7v n7vVar, String str) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = n7vVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final n7v getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryBubble)) {
            return false;
        }
        SummaryBubble summaryBubble = (SummaryBubble) obj;
        return jl40.l(this.a, summaryBubble.a) && jl40.l(this.b, summaryBubble.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n7v n7vVar = this.b;
        return hashCode + (n7vVar == null ? 0 : n7vVar.hashCode());
    }

    public final String toString() {
        return "SummaryBubble(text=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }

    public SummaryBubble() {
        this.a = "";
        this.b = null;
    }
}
