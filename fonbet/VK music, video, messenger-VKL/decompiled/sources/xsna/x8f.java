package xsna;

import android.util.SparseIntArray;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplatesInputVideoItem;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.media.VideoConfigEditor;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.stickers.StickerItem;
import com.vk.media.MediaUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x8f implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x8f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        ClipsTemplatesInputVideoItem clipsTemplatesInputVideoItem;
        int i;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                String str = (String) obj;
                ClipsDraftPersistentStore.b.getClass();
                Future o = ClipsDraftPersistentStore.o(null);
                if (o != null) {
                    o.get();
                }
                ClipsDraftPersistentStore.v(str);
                ClipsDraftVk k = ClipsDraftPersistentStore.k();
                TemplateDraftData templateDraftData = k != null ? k.c.i : null;
                if (k == null || templateDraftData == null) {
                    tv4.b("Trying to open templates editor without draft or template data", com.vk.metrics.eventtracking.b.a);
                    return EmptyList.b;
                }
                ArrayList X0 = j5g.X0(templateDraftData.c, k.b.d);
                ArrayList arrayList = new ArrayList();
                Iterator it = X0.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    int intValue = ((Number) pair.d()).intValue();
                    ClipsEditorInputVideoItem clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) pair.g();
                    VideoConfigEditor videoConfigEditor = clipsEditorInputVideoItem.p;
                    File file = clipsEditorInputVideoItem.b;
                    if (videoConfigEditor != null) {
                        i = videoConfigEditor.f;
                    } else {
                        MediaUtils.f d = MediaUtils.a.d(file.getAbsolutePath());
                        if (d != null) {
                            i = d.f;
                        } else {
                            clipsTemplatesInputVideoItem = null;
                            if (clipsTemplatesInputVideoItem == null) {
                                arrayList.add(clipsTemplatesInputVideoItem);
                            }
                        }
                    }
                    String path = file.getPath();
                    long j = i;
                    TranscodingState transcodingState = clipsEditorInputVideoItem.h;
                    AudioConfigEditor audioConfigEditor = clipsEditorInputVideoItem.o;
                    clipsTemplatesInputVideoItem = new ClipsTemplatesInputVideoItem(new ClipsProcessedItem(path, j, transcodingState, audioConfigEditor != null ? new MediaUtils.AudioConfigLight(audioConfigEditor.b, audioConfigEditor.c) : null, clipsEditorInputVideoItem.q, clipsEditorInputVideoItem.m), clipsEditorInputVideoItem.c, clipsEditorInputVideoItem.d, intValue, clipsEditorInputVideoItem.l);
                    if (clipsTemplatesInputVideoItem == null) {
                    }
                }
                return arrayList;
            default:
                pro0.b();
                System.currentTimeMillis();
                List<StickerItem> list = ((b6l0) obj).b;
                SparseIntArray sparseIntArray = new SparseIntArray(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = list.get(i3).b;
                    u4q0 u4q0Var = zik0.a;
                    sparseIntArray.put(i4, i3);
                }
                System.currentTimeMillis();
                return sparseIntArray;
        }
    }
}
