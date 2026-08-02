package xsna;

import android.view.View;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vkontakte.android.R;
import xsna.gt10;

/* compiled from: CameraButtonsViewHolder.kt */
/* loaded from: classes17.dex */
public final class fg9 extends hf6<eg9> {
    public final gt10.a m;

    public fg9(View view, VkMediaPicker vkMediaPicker) {
        super(view);
        this.m = vkMediaPicker;
        jjc.g(view.findViewById(R.id.camera_photo_button), new l5(this, 15));
        jjc.g(view.findViewById(R.id.camera_video_button), new po1(this, 10));
    }

    @Override // xsna.hf6
    public final /* bridge */ /* synthetic */ void W5(eg9 eg9Var) {
    }
}
