package com.yandex.go.feed_video.actions;

import com.yandex.go.feed_video.actions.models.MediaItemDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.kr;
import defpackage.qje;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/feed_video/actions/ListVideoPlayerChangeVisibilityAction;", "Lkr;", "Companion", "com/yandex/go/feed_video/actions/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ListVideoPlayerChangeVisibilityAction extends kr {
    public static final c Companion = new c();
    public final MediaItemDto a;
    public final String b;
    public final boolean c;

    public /* synthetic */ ListVideoPlayerChangeVisibilityAction(int i, MediaItemDto mediaItemDto, String str, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ListVideoPlayerChangeVisibilityAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = mediaItemDto;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListVideoPlayerChangeVisibilityAction)) {
            return false;
        }
        ListVideoPlayerChangeVisibilityAction listVideoPlayerChangeVisibilityAction = (ListVideoPlayerChangeVisibilityAction) obj;
        return jl40.l(this.a, listVideoPlayerChangeVisibilityAction.a) && jl40.l(this.b, listVideoPlayerChangeVisibilityAction.b) && this.c == listVideoPlayerChangeVisibilityAction.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListVideoPlayerChangeVisibilityAction(item=");
        sb.append(this.a);
        sb.append(", sessionPageViewUID=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
