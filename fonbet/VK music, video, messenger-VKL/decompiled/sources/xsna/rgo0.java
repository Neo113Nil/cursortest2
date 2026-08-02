package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.vk.dto.common.VideoFile;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class rgo0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rgo0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ogo0 ogo0Var = (ogo0) this.c;
                sg50 sg50Var = (sg50) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(-102778667);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-102778667, intValue, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object x = aVar.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = bap.j(EmptyCoroutineContext.b, aVar);
                    aVar.R(x);
                }
                yvj yvjVar = (yvj) x;
                Object x2 = aVar.x();
                if (x2 == c0012a) {
                    x2 = androidx.compose.runtime.k.b(null);
                    aVar.R(x2);
                }
                wh50 wh50Var = (wh50) x2;
                wh50 c = androidx.compose.runtime.k.c(ogo0Var, aVar, 0);
                boolean J = aVar.J(sg50Var);
                Object x3 = aVar.x();
                if (J || x3 == c0012a) {
                    x3 = new d50(29, wh50Var, sg50Var);
                    aVar.R(x3);
                }
                bap.c(sg50Var, (izs) x3, aVar, 0);
                boolean y = aVar.y(yvjVar) | aVar.J(sg50Var) | aVar.J(c);
                Object x4 = aVar.x();
                if (y || x4 == c0012a) {
                    x4 = new sgo0(yvjVar, wh50Var, sg50Var, c);
                    aVar.R(x4);
                }
                q630 b = skn0.b(q630.a.a, sg50Var, (PointerInputEventHandler) x4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return b;
            default:
                com.vk.video.ui.discovery.minimizable.related_videos.c cVar = (com.vk.video.ui.discovery.minimizable.related_videos.c) this.c;
                rbt0 rbt0Var = (rbt0) obj;
                VideoFile videoFile = (VideoFile) obj2;
                VideoFile videoFile2 = (VideoFile) obj3;
                int i = ((VideoDiscoveryRelatedVideosSourceArgs.Playlist) this.d).c;
                cVar.getClass();
                return new c.s0.i(rbt0Var.e ? new m.b(true) : com.vk.video.ui.discovery.minimizable.related_videos.n.a(m.c.a, i, rbt0Var, cVar.c, videoFile, videoFile2));
        }
    }
}
