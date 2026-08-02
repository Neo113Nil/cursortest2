package xsna;

import android.view.View;
import com.vk.dto.video.VideoSeason;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.egp0;
import xsna.k840;
import xsna.m5t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uyn0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uyn0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist;
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                rg50 rg50Var = (rg50) this.d;
                int intValue = ((Integer) obj).intValue();
                wh50Var.setValue(Boolean.FALSE);
                rg50Var.C(intValue);
                return s3q0.a;
            case 1:
                ((xfp0) this.c).V(egp0.a.C2808a.b, ((fgp0) this.d).b);
                return s3q0.a;
            case 2:
                fuv0 fuv0Var = (fuv0) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                tny tnyVar = (tny) obj;
                if (!fuv0Var.isVisible()) {
                    return s3q0.a;
                }
                ((wh50) ref$ObjectRef.element).setValue(jgz.p(tnyVar).z(tnyVar, true));
                return s3q0.a;
            case 3:
                VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = (VideoDiscoveryRelatedVideosSourceArgs) this.c;
                com.vk.video.ui.discovery.minimizable.related_videos.k kVar = (com.vk.video.ui.discovery.minimizable.related_videos.k) this.d;
                o5t0 o5t0Var = (o5t0) obj;
                Iterator<T> it = o5t0Var.a.q.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((VideoSeason) obj2).e) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                VideoSeason videoSeason = (VideoSeason) obj2;
                if (videoSeason != null) {
                    int i = videoSeason.b;
                    playlist = VideoDiscoveryRelatedVideosSourceArgs.Playlist.e((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs, null, Integer.valueOf(i), Integer.valueOf(i), null, 243);
                    kVar.f.invoke(playlist);
                } else {
                    playlist = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs;
                }
                Integer num = playlist.g;
                int i2 = playlist.c;
                d7b0 a = com.vk.video.ui.discovery.minimizable.related_videos.l.a(playlist, num != null ? num.intValue() : i2);
                m5t0.a.C3323a c3323a = a.e;
                com.vk.video.ui.discovery.minimizable.related_videos.c cVar = kVar.j;
                m5t0 m5t0Var = kVar.b;
                Integer num2 = playlist.g;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                cVar.getClass();
                return io.reactivex.rxjava3.core.x.A(new io.reactivex.rxjava3.internal.operators.single.b(new ngs0(cVar, playlist, i2)), q5t0.a(m5t0Var, a.a, a.b, a.c, false, a.d, c3323a), q5t0.a(m5t0Var, a.a, a.b, a.c, true, a.d, c3323a), new t9c0(7, new er0(o5t0Var, playlist, kVar, 3)));
            case 4:
                h4v0 h4v0Var = (h4v0) this.c;
                izs izsVar = (izs) this.d;
                List list = (List) obj;
                if (list.isEmpty()) {
                    r5v0 r5v0Var = k840.a.h;
                    if (r5v0Var == null) {
                        r5v0Var = null;
                    }
                    r5v0Var.b(new xs20(h4v0Var.f.e));
                    h4v0Var.s(null);
                }
                h4v0Var.g = true;
                izsVar.invoke(list);
                return s3q0.a;
            default:
                yqx0 yqx0Var = (yqx0) this.c;
                View view = (View) this.d;
                yqx0Var.a(view);
                return new xqx0(yqx0Var, view);
        }
    }
}
