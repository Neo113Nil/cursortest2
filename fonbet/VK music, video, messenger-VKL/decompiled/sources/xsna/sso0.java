package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: ThumbnailHolder.kt */
/* loaded from: classes4.dex */
public abstract class sso0<T extends Attachment> extends m56<T> {
    public final VKImageView D;

    public sso0(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.D = (VKImageView) this.itemView.findViewById(R.id.picture);
    }
}
