package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.dto.clips.media.VideoConfigEditor;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import io.appmetrica.analytics.impl.U;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class uod implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uod(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ((rhd) ((vod) this.c).d.getValue()).i();
                return s3q0.a;
            case 1:
                ArrayList<ClipsEditorInputVideoItem> arrayList = ((pdo) this.c).d;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (ClipsEditorInputVideoItem clipsEditorInputVideoItem : arrayList) {
                    File file = clipsEditorInputVideoItem.b;
                    VideoConfigEditor videoConfigEditor = clipsEditorInputVideoItem.p;
                    arrayList2.add(new ClipsDraftPersistentStore.b(file, videoConfigEditor != null ? videoConfigEditor.f : 0, (int) clipsEditorInputVideoItem.c, (int) clipsEditorInputVideoItem.d, clipsEditorInputVideoItem.h, clipsEditorInputVideoItem.k, clipsEditorInputVideoItem.e));
                }
                ClipsDraftPersistentStore.b.getClass();
                return ClipsDraftPersistentStore.z(arrayList2);
            default:
                return U.e((U) this.c);
        }
    }

    public /* synthetic */ uod(rxd rxdVar, pdo pdoVar) {
        this.b = 1;
        this.c = pdoVar;
    }
}
