package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ClipsVideoPreview.kt */
/* loaded from: classes16.dex */
public final class ymf extends ConstraintLayout {
    public final VkPicture t;
    public final VkText u;

    public ymf(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.clips_video_preview, (ViewGroup) this, true);
        this.t = (VkPicture) findViewById(R.id.video_picker_cover);
        this.u = (VkText) findViewById(R.id.video_picker_duration);
    }

    public final void setCover(String str) {
        this.t.o0(str, null);
    }

    public final void setDuration(int i) {
        this.u.setText(z8s.a(i));
    }
}
