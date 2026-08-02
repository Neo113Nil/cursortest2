package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qxd implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qxd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<? extends List<? extends CanvasStickerDraft>> list;
        nov b;
        switch (this.b) {
            case 0:
                rxd rxdVar = (rxd) this.c;
                ClipsDraftPersistentStore.b.getClass();
                ClipsDraftVk j = ClipsDraftPersistentStore.j();
                if (j == null || (list = j.c.b) == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    List<CanvasStickerDraft> list2 = (List) it.next();
                    ArrayList arrayList2 = new ArrayList();
                    for (CanvasStickerDraft canvasStickerDraft : list2) {
                        z3l0 z3l0Var = rxdVar.b;
                        nal0 nal0Var = rxdVar.a.a;
                        MediaUtils.d dVar = new MediaUtils.d(nal0Var.getWidth(), nal0Var.getHeight());
                        z3l0Var.getClass();
                        if (canvasStickerDraft instanceof CanvasStickerDraft.LoadableCanvasStickerDraft) {
                            b = z3l0Var.a((CanvasStickerDraft.LoadableCanvasStickerDraft) canvasStickerDraft, dVar);
                        } else {
                            if (!(canvasStickerDraft instanceof CanvasStickerDraft.NativeCanvasStickerDraft)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b = z3l0Var.b((CanvasStickerDraft.NativeCanvasStickerDraft) canvasStickerDraft, dVar);
                        }
                        if (b != null) {
                            arrayList2.add(b);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        arrayList.add(arrayList2);
                    }
                }
                return arrayList;
            default:
                return Boolean.valueOf(((o6r0) this.c).commit());
        }
    }
}
