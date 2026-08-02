package com.yandex.go.feed_video.actions.models;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qje;
import defpackage.unr0;
import defpackage.w410;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/feed_video/actions/models/MediaItemDto;", "", "Companion", "$serializer", "com/yandex/go/feed_video/actions/models/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MediaItemDto {
    public static final a Companion = new a();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(11)), null, null, null};
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ MediaItemDto(int i, String str, List list, String str2, String str3, Boolean bool) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, MediaItemDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItemDto)) {
            return false;
        }
        MediaItemDto mediaItemDto = (MediaItemDto) obj;
        return jl40.l(this.a, mediaItemDto.a) && jl40.l(this.b, mediaItemDto.b) && jl40.l(this.c, mediaItemDto.c) && jl40.l(this.d, mediaItemDto.d) && jl40.l(this.e, mediaItemDto.e);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("MediaItemDto(id=", this.a, ", streams=", this.b, ", firstFrameHash=");
        g8e.D(r, this.c, ", firstFrameUrl=", this.d, ", showFirstFrameUntilPlay=");
        return nzs.d(r, this.e, Extension.C_BRAKE);
    }
}
