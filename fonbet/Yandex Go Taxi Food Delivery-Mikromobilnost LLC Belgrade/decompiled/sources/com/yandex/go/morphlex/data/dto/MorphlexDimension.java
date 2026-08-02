package com.yandex.go.morphlex.data.dto;

import defpackage.b64;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/morphlex/data/dto/MorphlexDimension;", "", "Companion", "n730", "$serializer", "com/yandex/go/morphlex/data/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MorphlexDimension {
    public static final a Companion = new a();
    public final int a;
    public final int b;

    public /* synthetic */ MorphlexDimension(int i, int i2, int i3) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MorphlexDimension)) {
            return false;
        }
        MorphlexDimension morphlexDimension = (MorphlexDimension) obj;
        return this.a == morphlexDimension.a && this.b == morphlexDimension.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "MorphlexDimension(value=", ", typedUnit=", Extension.C_BRAKE);
    }

    public MorphlexDimension() {
        this.a = 0;
        this.b = 1;
    }
}
