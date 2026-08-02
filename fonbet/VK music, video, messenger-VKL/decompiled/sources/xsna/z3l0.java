package xsna;

import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.c0e;

/* compiled from: StickerDraftMapper.kt */
/* loaded from: classes16.dex */
public final class z3l0 implements w8i {
    public final bpn0 b = new bpn0(new y3l0(this, 0));
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new e20(26));
    public final c0e d = new c0e();

    public final nov a(CanvasStickerDraft.LoadableCanvasStickerDraft loadableCanvasStickerDraft, MediaUtils.d dVar) {
        try {
            c0e c0eVar = this.d;
            String str = loadableCanvasStickerDraft.e;
            String str2 = loadableCanvasStickerDraft.h;
            return c0eVar.a(new c0e.b(loadableCanvasStickerDraft.b, loadableCanvasStickerDraft.c, str, loadableCanvasStickerDraft.f, str2, loadableCanvasStickerDraft.g), dVar).a();
        } catch (Throwable th) {
            L.g("ClipsEditorDraftLoadingInteractor", th);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final nov b(CanvasStickerDraft.NativeCanvasStickerDraft nativeCanvasStickerDraft, MediaUtils.d dVar) {
        try {
            return (nov) j5g.a0(new szl0(dVar.a, dVar.b, (s5m0) this.b.getValue(), (y4f) this.c.getValue()).c(Collections.singletonList(nativeCanvasStickerDraft)).a());
        } catch (Throwable th) {
            L.g("ClipsEditorDraftLoadingInteractor", th);
            return null;
        }
    }

    public final c1f c(List list, MediaUtils.d dVar) {
        nov b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ISerializableStickerSDK iSerializableStickerSDK = (ISerializableStickerSDK) it.next();
            if (iSerializableStickerSDK instanceof CanvasStickerDraft.LoadableCanvasStickerDraft) {
                b = a((CanvasStickerDraft.LoadableCanvasStickerDraft) iSerializableStickerSDK, dVar);
            } else {
                if (!(iSerializableStickerSDK instanceof CanvasStickerDraft.NativeCanvasStickerDraft)) {
                    throw new IllegalArgumentException("Failed to map " + qjg.a(iSerializableStickerSDK) + " to MediaLayer");
                }
                b = b((CanvasStickerDraft.NativeCanvasStickerDraft) iSerializableStickerSDK, dVar);
            }
            if (b != null) {
                arrayList.add(b);
            }
        }
        return new c1f(arrayList, dVar);
    }
}
