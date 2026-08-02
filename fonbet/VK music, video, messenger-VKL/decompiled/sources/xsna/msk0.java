package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: StatMore.kt */
/* loaded from: classes16.dex */
public final class msk0 extends FrameLayout {
    public final VkText b;

    public msk0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.stat_more, (ViewGroup) this, true);
        this.b = (VkText) findViewById(R.id.viewers_more_title);
    }

    public final VkText getTitle() {
        return this.b;
    }
}
