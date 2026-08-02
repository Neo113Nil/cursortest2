package com.yandex.go.multimodal_route.network.models;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.qje;
import defpackage.unr0;
import defpackage.z2c;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/CommentFieldDto;", "", "Companion", "com/yandex/go/multimodal_route/network/models/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommentFieldDto {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(20))};
    public static final CommentFieldDto g = new CommentFieldDto();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ CommentFieldDto(int i, String str, String str2, String str3, String str4, List list) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, CommentFieldDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentFieldDto)) {
            return false;
        }
        CommentFieldDto commentFieldDto = (CommentFieldDto) obj;
        return jl40.l(this.a, commentFieldDto.a) && jl40.l(this.b, commentFieldDto.b) && jl40.l(this.c, commentFieldDto.c) && jl40.l(this.d, commentFieldDto.d) && jl40.l(this.e, commentFieldDto.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("CommentFieldDto(id=", this.a, ", analyticsId=", this.b, ", placeholder=");
        g8e.D(v, this.c, ", backgroundColor=", this.d, ", visibleOnRatings=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    public CommentFieldDto() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = EmptyList.a;
    }
}
