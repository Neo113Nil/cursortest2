package xsna;

import com.vk.clips.design.view.seek.WheelSeekView;

/* compiled from: WheelCenteredValueMapper.kt */
/* loaded from: classes16.dex */
public final class okx0 implements WheelSeekView.a {
    @Override // com.vk.clips.design.view.seek.WheelSeekView.a
    public final float a(float f) {
        if (f <= 0.49f || f >= 0.51f) {
            return f;
        }
        return 0.5f;
    }
}
