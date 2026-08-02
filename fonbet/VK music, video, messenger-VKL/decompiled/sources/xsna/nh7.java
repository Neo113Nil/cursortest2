package xsna;

import com.vk.dto.common.ImageSize;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;

/* compiled from: BlurredImagePostingHolderStrategy.kt */
/* loaded from: classes4.dex */
public interface nh7 {
    void b(ImageSize imageSize);

    void c(List<ImageSize> list);

    void init();

    default void a(PhotoAttachment photoAttachment) {
    }
}
