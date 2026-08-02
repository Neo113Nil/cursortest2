package xsna;

import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fcw;
import xsna.xx30;

/* compiled from: MsgSearchPeersInteractor.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class yx30 extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ yx30(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = (ImSearchLocalRequestLoggingInfo) obj2;
                xx30.b bVar = ((xx30) this.receiver).c;
                List l = e43.l(bVar.a, bVar.b);
                ArrayList arrayList = new ArrayList(c5g.u(l, 10));
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ibw) it.next()).a(new fcw.a("", 0L, imSearchLocalRequestLoggingInfo.c, imSearchLocalRequestLoggingInfo.f), obj));
                }
                return xx30.a(arrayList);
            default:
                ((VideoAutoPlay) this.receiver).y.H(((Number) obj).longValue(), ((Number) obj2).longValue());
                return s3q0.a;
        }
    }

    public yx30(Object obj) {
        super(2, obj, VideoAutoPlay.class, "handleWatchCoverage", "handleWatchCoverage(JJ)V", 0);
    }
}
