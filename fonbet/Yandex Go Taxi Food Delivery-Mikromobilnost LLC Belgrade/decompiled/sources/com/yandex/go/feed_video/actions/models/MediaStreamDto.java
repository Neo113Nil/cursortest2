package com.yandex.go.feed_video.actions.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.w410;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/feed_video/actions/models/MediaStreamDto;", "", "Companion", "$serializer", "com/yandex/go/feed_video/actions/models/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MediaStreamDto {
    public static final b Companion = new b();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(12)), null};
    public final StreamTypeDto a;
    public final String b;

    public /* synthetic */ MediaStreamDto(int i, StreamTypeDto streamTypeDto, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, MediaStreamDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = streamTypeDto;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStreamDto)) {
            return false;
        }
        MediaStreamDto mediaStreamDto = (MediaStreamDto) obj;
        return this.a == mediaStreamDto.a && jl40.l(this.b, mediaStreamDto.b);
    }

    public final int hashCode() {
        StreamTypeDto streamTypeDto = this.a;
        return this.b.hashCode() + ((streamTypeDto == null ? 0 : streamTypeDto.hashCode()) * 31);
    }

    public final String toString() {
        return "MediaStreamDto(streamType=" + this.a + ", stream=" + this.b + Extension.C_BRAKE;
    }
}
