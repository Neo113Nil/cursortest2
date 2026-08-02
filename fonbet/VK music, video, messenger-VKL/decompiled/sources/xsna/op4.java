package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.libvideo.offline.VideoDownloadServiceV2;
import java.util.LinkedHashMap;

/* compiled from: AudioHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class op4 {
    public final Object a;
    public final Object b;

    public op4(VideoDownloadServiceV2.b bVar) {
        this.a = bVar;
        this.b = new LinkedHashMap();
    }

    public cp10 a() {
        return (cp10) ((zak0) ((wh50) this.b)).getValue();
    }

    public op4(LayoutNode layoutNode, cp10 cp10Var) {
        this.a = layoutNode;
        this.b = androidx.compose.runtime.k.b(cp10Var);
    }

    public op4(jc4 jc4Var, pp4 pp4Var) {
        this.a = jc4Var;
        this.b = pp4Var;
    }
}
