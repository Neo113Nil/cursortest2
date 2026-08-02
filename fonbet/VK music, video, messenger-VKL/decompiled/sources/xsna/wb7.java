package xsna;

import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.dto.common.Attachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: BitmapDrawableTranscoder.java */
/* loaded from: classes12.dex */
public final class wb7 implements bbg0, gz20 {
    public final Object b;

    public /* synthetic */ wb7(Object obj) {
        this.b = obj;
    }

    public boolean a() {
        VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) this.b;
        return (videoCatalogRootVh.y0.r instanceof ltz) || !videoCatalogRootVh.U.isEmpty();
    }

    public boolean b(Attachment attachment) {
        Boolean b = ((zbc0) this.b).b(attachment);
        if (b != null) {
            return b.booleanValue();
        }
        if ((attachment instanceof PendingPhotoAttachment) || (attachment instanceof PendingVideoAttachment)) {
            return true;
        }
        if (((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) || (attachment instanceof VideoAttachment)) {
            return true;
        }
        if (!(attachment instanceof DocumentAttachment)) {
            return false;
        }
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        return documentAttachment.Ib() && !documentAttachment.x5();
    }

    @Override // xsna.bbg0
    @Nullable
    public hag0 c(@NonNull hag0 hag0Var, @NonNull au80 au80Var) {
        Resources resources = (Resources) this.b;
        if (hag0Var == null) {
            return null;
        }
        return new dqy(resources, hag0Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public void d() {
        ((nht0) ((VideoCatalogRootVh) this.b).K0.getValue()).a();
    }

    @Override // xsna.gz20
    public void onCancel() {
        ((k7x) this.b).invoke();
    }

    public wb7() {
        this.b = new f4z();
    }
}
