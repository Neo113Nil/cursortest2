package xsna;

import android.graphics.Bitmap;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class v640 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v640(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                gzs<? extends ArrayList<Bitmap>> gzsVar = ((MultiVideoTimelineView) this.c).t0;
                if (gzsVar != null) {
                    return gzsVar.invoke();
                }
                return null;
            case 1:
                jq40 jq40Var = (jq40) this.c;
                ArrayList L = jq40Var.L(jq40Var.E().b(o25.a().c()));
                ArrayList arrayList = new ArrayList();
                Iterator it = L.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!((Playlist) next).y.isEmpty()) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            default:
                return Boolean.valueOf(((rah0) this.c).b());
        }
    }
}
