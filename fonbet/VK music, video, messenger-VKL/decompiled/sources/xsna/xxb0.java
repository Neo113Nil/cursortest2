package xsna;

import com.vk.rlottie.RLottieDrawable;
import com.vk.stickers.popup.PopupStickerView;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PopupStickerView.kt */
/* loaded from: classes6.dex */
public final class xxb0 implements RLottieDrawable.a {
    public final /* synthetic */ PopupStickerView a;

    public xxb0(PopupStickerView popupStickerView) {
        this.a = popupStickerView;
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void b() {
        AtomicInteger atomicInteger = PopupStickerView.q;
        this.a.b();
    }

    @Override // com.vk.rlottie.RLottieDrawable.a
    public final void a() {
    }
}
