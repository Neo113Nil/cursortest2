package xsna;

import com.vk.channels.impl.list.domain.PinnedChannelsLimitExceededException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import one.video.player.OneVideoPlayer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sta implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sta(long j, Object obj, int i) {
        this.b = i;
        this.c = j;
        this.d = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        long j = this.c;
        switch (i) {
            case 0:
                tta ttaVar = (tta) obj2;
                a1w a1wVar = ttaVar.a;
                a1wVar.r().getClass();
                if (((Integer) obj).intValue() >= 5) {
                    return io.reactivex.rxjava3.core.x.i(new PinnedChannelsLimitExceededException());
                }
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return a1wVar.C(ttaVar, new j8b(Peer.a.b(j)));
            case 1:
                ((OneVideoPlayer) obj).seekTo(j);
                ((c9d) obj2).r(j);
                return s3q0.a;
            case 2:
                String str = (String) obj2;
                hpm e = ((xgl0) obj).b().e();
                com.vk.im.engine.models.dialogs.b c = e.c(j);
                InfoBar infoBar = c != null ? c.w : null;
                if (epx.f(infoBar != null ? infoBar.b : null, str)) {
                    e.c.a(Long.valueOf(j), new jr3(13), new nom(j, e, 0));
                    e.p(j, false);
                }
                return s3q0.a;
            default:
                return ((kw8) obj).c(new n19(j, (mtk0) obj2));
        }
    }

    public /* synthetic */ sta(tta ttaVar, long j) {
        this.b = 0;
        this.d = ttaVar;
        this.c = j;
    }
}
