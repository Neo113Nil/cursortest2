package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/RatingStackItem;", "Lcom/yandex/go/shortcuts/dto/response/r2;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/z1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RatingStackItem extends r2 {
    public static final z1 Companion = new z1();
    public final Title a;
    public final int b;
    public final Details c;

    public RatingStackItem(int i, Title title, int i2, Details details) {
        this.a = (i & 1) == 0 ? new Title(0) : title;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = new Details(0);
        } else {
            this.c = details;
        }
    }

    public static final /* synthetic */ void v(RatingStackItem ratingStackItem, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(ratingStackItem.a, new Title(0))) {
            yjdVar.e(serialDescriptor, 0, Title$$serializer.INSTANCE, ratingStackItem.a);
        }
        if (yjdVar.F() || ratingStackItem.b != 0) {
            yjdVar.A(1, ratingStackItem.b, serialDescriptor);
        }
        if (!yjdVar.F() && jl40.l(ratingStackItem.c, new Details(0))) {
            return;
        }
        yjdVar.e(serialDescriptor, 2, Details$$serializer.INSTANCE, ratingStackItem.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingStackItem)) {
            return false;
        }
        RatingStackItem ratingStackItem = (RatingStackItem) obj;
        return jl40.l(this.a, ratingStackItem.a) && this.b == ratingStackItem.b && jl40.l(this.c, ratingStackItem.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RatingStackItem(metaInfo=" + this.a + ", value=" + this.b + ", ratingDetails=" + this.c + Extension.C_BRAKE;
    }

    public RatingStackItem() {
        Title title = new Title(0);
        Details details = new Details(0);
        this.a = title;
        this.b = 0;
        this.c = details;
    }
}
