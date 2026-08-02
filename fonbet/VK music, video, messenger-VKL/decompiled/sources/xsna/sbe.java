package xsna;

import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: ClipsGridBlockOtherClipsButtonContainer.kt */
/* loaded from: classes17.dex */
public final class sbe {
    public final obe a;
    public final VkButton b;

    public sbe(View view, obe obeVar) {
        this.a = obeVar;
        VkButton vkButton = (VkButton) view.findViewById(R.id.other_clips_button);
        this.b = vkButton;
        vkButton.setOnClickListener(new rbe(this, 0));
    }
}
