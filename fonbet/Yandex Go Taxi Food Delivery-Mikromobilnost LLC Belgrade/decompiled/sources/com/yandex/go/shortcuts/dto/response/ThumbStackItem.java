package com.yandex.go.shortcuts.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.y6y0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ThumbStackItem;", "Lcom/yandex/go/shortcuts/dto/response/r2;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/x2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ThumbStackItem extends r2 {
    public static final x2 Companion = new x2();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(29)), null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public ThumbStackItem(String str, int i, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public static final /* synthetic */ void w(ThumbStackItem thumbStackItem, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(thumbStackItem.a, "")) {
            yjdVar.o(serialDescriptor, 0, thumbStackItem.a);
        }
        if (yjdVar.F() || !jl40.l(thumbStackItem.b, "")) {
            yjdVar.o(serialDescriptor, 1, thumbStackItem.b);
        }
        if (yjdVar.F() || !jl40.l(thumbStackItem.c, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) e[2].getValue(), thumbStackItem.c);
        }
        if (!yjdVar.F() && jl40.l(thumbStackItem.d, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 3, thumbStackItem.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbStackItem)) {
            return false;
        }
        ThumbStackItem thumbStackItem = (ThumbStackItem) obj;
        return jl40.l(this.a, thumbStackItem.a) && jl40.l(this.b, thumbStackItem.b) && jl40.l(this.c, thumbStackItem.c) && jl40.l(this.d, thumbStackItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.n.l(", multiplyColor=", this.d, Extension.C_BRAKE, b64.v("ThumbStackItem(imageTag=", this.a, ", imageUrl=", this.b, ", overlays="), this.c);
    }

    public ThumbStackItem() {
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
        this.d = "";
    }
}
