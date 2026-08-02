package com.yandex.go.superapp.tracking.models.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.r9v;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/tracking/models/dto/ImageDto$Tag", "Lr9v;", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/a", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImageDto$Tag implements r9v {
    public static final a Companion = new a();
    public final String a;

    public /* synthetic */ ImageDto$Tag(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ImageDto$Tag$$serializer.INSTANCE.getDescriptor());
            throw null;
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
        return (obj instanceof ImageDto$Tag) && jl40.l(this.a, ((ImageDto$Tag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Tag(tag=", this.a, Extension.C_BRAKE);
    }
}
