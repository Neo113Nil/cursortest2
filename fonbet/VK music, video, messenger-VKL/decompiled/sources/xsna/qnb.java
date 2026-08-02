package xsna;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.vk.dto.clips.ClipItemFilterType;
import com.vk.media.MediaUtils;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bwd;
import xsna.fzd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qnb implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qnb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, android.graphics.Bitmap] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ynb.h((ynb) obj);
            case 1:
                bwd bwdVar = (bwd) obj;
                List<com.vk.clips.editor.state.model.c> list = bwdVar.e.o.a.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (com.vk.clips.editor.state.model.c cVar : list) {
                    String path = cVar.a.getPath();
                    long j = cVar.b;
                    ClipItemFilterType clipItemFilterType = cVar.h.b;
                    fzd.a aVar = new fzd.a(path, j, clipItemFilterType);
                    String str = cVar.j;
                    fzd fzdVar = cVar.q;
                    fzd.a aVar2 = fzdVar.c;
                    Bitmap bitmap = fzdVar.b;
                    Bitmap bitmap2 = fzdVar.a;
                    boolean z = (epx.f(aVar2.a, path) && aVar2.b == j && bitmap2 != null) ? false : true;
                    boolean z2 = z || aVar2.c != clipItemFilterType || (bitmap == null && clipItemFilterType != ClipItemFilterType.NONE);
                    bwd.a aVar3 = null;
                    if (z || z2) {
                        if (z) {
                            t0e t0eVar = bzd.this.c;
                            MediaUtils.d dVar = new MediaUtils.d(wlb0.f(R.dimen.clips_editor_fragment_preview_width, t0eVar.getCtx()), wlb0.f(R.dimen.clips_editor_fragment_preview_height, t0eVar.getCtx()));
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            try {
                                mediaMetadataRetriever.setDataSource(path);
                                ref$ObjectRef.element = MediaUtils.a.i(j, mediaMetadataRetriever, dVar);
                                s3q0 s3q0Var = s3q0.a;
                            } catch (Exception unused) {
                            } catch (Throwable th) {
                                mediaMetadataRetriever.release();
                                throw th;
                            }
                            mediaMetadataRetriever.release();
                            bitmap2 = (Bitmap) ref$ObjectRef.element;
                        }
                        if (z2) {
                            bitmap = (bitmap2 == null || clipItemFilterType == ClipItemFilterType.NONE) ? null : ((tfr) ((bpn0) bwdVar.g.c).getValue()).d(bwdVar.a, bitmap2, clipItemFilterType.i());
                        }
                        aVar3 = new bwd.a(str, bitmap2, bitmap, aVar);
                    }
                    arrayList.add(aVar3);
                }
                return arrayList;
            case 2:
                sz70 sz70Var = (sz70) obj;
                Long c = sz70Var.h().y().c(sz70Var.b.a());
                long longValue = c != null ? c.longValue() : 0L;
                if (longValue > 0) {
                    AtomicLong atomicLong = sz70Var.d;
                    while (!atomicLong.compareAndSet(atomicLong.get(), longValue)) {
                    }
                }
                return Long.valueOf(longValue);
            default:
                return Boolean.valueOf(((u4x0) obj).e());
        }
    }
}
