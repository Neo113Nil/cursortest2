package xsna;

import android.annotation.SuppressLint;
import com.vk.superapp.api.dto.story.WebStickerType;

/* compiled from: VKVideoRepostSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class air0 extends z7c0 {
    @Override // xsna.z7c0, xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new air0(getContext(), getStickerInfo(), getOnBindCompleted(), 4));
    }

    @Override // xsna.z7c0
    public Class<? extends nov> getStickerCreatorForRendering() {
        return air0.class;
    }

    @Override // xsna.z7c0
    public WebStickerType getStickerTypeForRendering() {
        return WebStickerType.VK_VIDEO;
    }
}
