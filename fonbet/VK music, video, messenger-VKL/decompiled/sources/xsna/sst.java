package xsna;

import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sst implements izs {
    public final /* synthetic */ NewsEntry b;
    public final /* synthetic */ Ref$LongRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ Ref$ObjectRef g;

    public /* synthetic */ sst(NewsEntry newsEntry, Ref$LongRef ref$LongRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4) {
        this.b = newsEntry;
        this.c = ref$LongRef;
        this.d = ref$ObjectRef;
        this.e = ref$ObjectRef2;
        this.f = ref$ObjectRef3;
        this.g = ref$ObjectRef4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        rtt rttVar = (rtt) obj;
        return new ust(this.b, this.c.element, (UserId) this.d.element, (LikesGetList.Type) this.e.element, (Counters) this.f.element, (UserId) this.g.element, rttVar);
    }
}
