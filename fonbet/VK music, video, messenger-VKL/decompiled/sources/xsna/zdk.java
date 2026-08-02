package xsna;

import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.dto.common.VideoFile;
import java.nio.ByteBuffer;

/* compiled from: CronetClient.kt */
/* loaded from: classes2.dex */
public final class zdk implements hjc {
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ zdk(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // xsna.hjc
    public boolean a() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public void b() {
        ((ydk) this.b).a((ckv) this.c, (jek) this.d);
        dg3 dg3Var = (dg3) this.e;
        synchronized (dg3Var) {
            if (dg3Var.b == 0) {
                return;
            }
            dg3Var.b--;
            if (dg3Var.b <= 0 && dg3Var.c.isInitialized()) {
                dg3Var.a.a((ByteBuffer) dg3Var.c.getValue());
            }
        }
    }

    @Override // xsna.hjc
    public void onClick() {
        VideoFile videoFile = ((ClipFeedSideControlsView) ((com.vk.movika.sdk.base.logic.processor.h) this.e).c).q;
        if (videoFile == null) {
            return;
        }
        if (((rwc) this.d).c.b.a.b.h() || ((q1t) this.b).h()) {
            y8e y8eVar = (y8e) ((g6o0) this.c).b;
            izs<? super VideoFile, s3q0> izsVar = y8eVar.f;
            if (izsVar != null) {
                izsVar.invoke(videoFile);
                return;
            }
            h3d h3dVar = y8eVar.b;
            if (h3dVar != null) {
                h3dVar.g9(null, null, null);
            }
        }
    }
}
