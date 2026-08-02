package xsna;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import java.io.File;
import kotlin.Result;

/* compiled from: MediaEntryFactory.kt */
/* loaded from: classes4.dex */
public final class xq10 {
    public static MediaPickerSelectedItem.LocalMedia a(Uri uri, File file) {
        Object failure;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
        int andIncrement = com.vk.upload.impl.a.d.getAndIncrement();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int i = options.outWidth;
        int i2 = options.outHeight;
        try {
            failure = Long.valueOf(file.lastModified());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = -1L;
        }
        return new MediaPickerSelectedItem.LocalMedia(new LocalMediaEntry.Image(new MediaStoreImageEntry(andIncrement, uri, currentTimeMillis, i, i2, ((Number) failure).longValue(), z4g.f(file), attributeInt)));
    }
}
