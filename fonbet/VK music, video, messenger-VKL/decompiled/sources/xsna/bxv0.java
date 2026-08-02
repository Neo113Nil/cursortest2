package xsna;

import com.ironsource.adapters.fyber.FyberConstants;
import com.vk.dto.stories.model.web.ClipBox;

/* compiled from: VkUiRxClipEvent.kt */
/* loaded from: classes6.dex */
public final class bxv0 extends wn4 {
    public final ClipBox.ClipBoxException a;

    public bxv0(ClipBox.ClipBoxException clipBoxException) {
        this.a = clipBoxException;
    }

    public final String toString() {
        String message = this.a.getMessage();
        return message == null ? FyberConstants.Logs.UNKNOWN_ERROR : message;
    }
}
