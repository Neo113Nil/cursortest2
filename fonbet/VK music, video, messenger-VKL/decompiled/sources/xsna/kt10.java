package xsna;

import android.net.Uri;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.ehw;
import xsna.fvz;

/* compiled from: MediaPickerConverterExt.kt */
/* loaded from: classes4.dex */
public final class kt10 {
    public static final MediaPickerSelectedItem.LocalMedia a(MediaStoreEntry mediaStoreEntry) {
        LocalMediaEntry video;
        if (mediaStoreEntry instanceof MediaStoreImageEntry) {
            video = new LocalMediaEntry.Image((MediaStoreImageEntry) mediaStoreEntry);
        } else {
            if (!(mediaStoreEntry instanceof MediaStoreVideoEntry)) {
                throw new NoWhenBranchMatchedException();
            }
            video = new LocalMediaEntry.Video((MediaStoreVideoEntry) mediaStoreEntry);
        }
        return new MediaPickerSelectedItem.LocalMedia(video);
    }

    public static final yp10 b(fvz fvzVar) {
        if (!(fvzVar instanceof fvz.a)) {
            if (fvzVar.equals(fvz.b.a)) {
                return new pg9(true, false);
            }
            if (fvzVar.equals(fvz.c.a)) {
                return isa0.a;
            }
            throw new NoWhenBranchMatchedException();
        }
        fvz.a aVar = (fvz.a) fvzVar;
        LocalMediaEntry localMediaEntry = aVar.b;
        int id = localMediaEntry.ba().getId();
        Uri f = localMediaEntry.ba().f();
        long d = localMediaEntry.ba().d() * 1000;
        String str = aVar.j;
        ehw.b bVar = aVar.c ? ehw.b.a.a : ehw.b.d.a;
        MediaStoreEntry ba = localMediaEntry.ba();
        return new ehw(id, f, d, str, null, bVar, ba instanceof MediaStoreVideoEntry ? new ehw.a(null, new ehw.a.AbstractC2809a.b(pvo0.b(((MediaStoreVideoEntry) ba).q / 1000)), 5) : null);
    }
}
