package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.log.L;
import xsna.a7f0;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedRequestVideoUpdateActionDelegate.kt */
/* loaded from: classes17.dex */
public final class k4r implements oj50<q4r, qvq, c2r> {
    public final i4r a;
    public final myc b;
    public final v5e c;

    public k4r(i4r i4rVar, myc mycVar, v5e v5eVar) {
        this.a = i4rVar;
        this.b = mycVar;
        this.c = v5eVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((qvqVar instanceof qvq.q) && (q4rVar instanceof q4r.a)) {
            SdkVideoFile sdkVideoFile = ((qvq.q) qvqVar).b;
            if (dgd.d(sdkVideoFile)) {
                return;
            }
            a7f0.a.f(aVar, this.a.v(sdkVideoFile).l(new z7(new fre(sdkVideoFile, 22), 25)).l(new v20(new j4r(1, this.b, myc.class, "mapToAutoPlayItem", "mapToAutoPlayItem(Lcom/vk/clips/sdk/shared/api/deps/video/SdkVideoFile;Lcom/vk/clips/sdk/facade/api/MyTargetFacade;Lcom/vk/clips/sdk/shared/api/routing/models/ClipFeedCacheInfo;)Lcom/vk/clips/sdk/shared/feed/model/FeedItem$AutoPlay;", 0), 22)).l(new yi2(new ugm(this, 5), 17)), new m4g(aVar, 19), new a2a(L.a, 7), 1);
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
