package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import xsna.vrm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k8j implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Comparable e;

    public /* synthetic */ k8j(com.vk.newsfeed.posting.impl.domain.model.j jVar, Long l, long j) {
        this.d = jVar;
        this.e = l;
        this.c = j;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        long j = this.c;
        Comparable comparable = this.e;
        Object obj = this.d;
        switch (i) {
            case 0:
                l8j l8jVar = (l8j) obj;
                a1w a1wVar = l8jVar.j;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                a1wVar.D(l8jVar, new vrm(Peer.a.b(j), new vrm.a.b((Peer) comparable)));
                return s3q0.a;
            default:
                Long l = (Long) comparable;
                StringBuilder sb = new StringBuilder("Posting tech stats: picker opening [");
                sb.append(((com.vk.newsfeed.posting.impl.domain.model.j) obj).b);
                sb.append("]: (");
                sb.append(l);
                sb.append(", ");
                sb.append(j);
                sb.append("), diff: ");
                return efz.b(j - l.longValue(), " ms", sb);
        }
    }

    public /* synthetic */ k8j(l8j l8jVar, long j, Peer peer) {
        this.d = l8jVar;
        this.c = j;
        this.e = peer;
    }
}
