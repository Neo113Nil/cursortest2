package xsna;

import android.content.Intent;
import android.os.PowerManager;
import androidx.media3.exoplayer.video.g;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4229ae;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.y8x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ger implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ger(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        switch (this.b) {
            case 0:
                com.vk.photo.editor.features.filter.b bVar = (com.vk.photo.editor.features.filter.b) this.c;
                Integer num = (Integer) this.d;
                RecyclerView recyclerView = bVar.j;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(num.intValue());
                    return;
                }
                return;
            case 1:
                ((com.vk.core.performance.device.a) this.c).b((c24) this.d);
                return;
            case 2:
                g.a aVar = (g.a) this.c;
                g8l g8lVar = (g8l) this.d;
                androidx.media3.exoplayer.video.g gVar = aVar.b;
                String str = y2r0.a;
                gVar.e(g8lVar);
                return;
            case 3:
                y8x0.a aVar2 = (y8x0.a) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                synchronized (aVar2) {
                    if (atomicBoolean.get() && (wakeLock = aVar2.b) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 4:
                C4229ae.a((C4229ae) this.c, (IronSourceError) this.d);
                return;
            default:
                ((com.my.tracker.obfuscated.d) this.c).b((Intent) this.d);
                return;
        }
    }
}
