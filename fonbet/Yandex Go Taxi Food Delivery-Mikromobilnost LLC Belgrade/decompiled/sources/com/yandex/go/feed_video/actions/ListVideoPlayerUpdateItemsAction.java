package com.yandex.go.feed_video.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr;
import defpackage.qje;
import defpackage.tse0;
import defpackage.wwx;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/feed_video/actions/ListVideoPlayerUpdateItemsAction;", "Lkr;", "Companion", "com/yandex/go/feed_video/actions/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ListVideoPlayerUpdateItemsAction extends kr {
    public static final d Companion = new d();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(16))};
    public final List a;

    public /* synthetic */ ListVideoPlayerUpdateItemsAction(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, ListVideoPlayerUpdateItemsAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListVideoPlayerUpdateItemsAction) && jl40.l(this.a, ((ListVideoPlayerUpdateItemsAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ListVideoPlayerUpdateItemsAction(items=", Extension.C_BRAKE, this.a);
    }
}
