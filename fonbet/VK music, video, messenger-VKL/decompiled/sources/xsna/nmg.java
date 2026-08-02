package xsna;

import android.app.Activity;
import android.graphics.Rect;
import com.vk.dto.hints.HintId;
import xsna.l7v;

/* compiled from: CommonStickerHints.kt */
/* loaded from: classes5.dex */
public final class nmg implements m4l0 {
    public static final nmg a = new nmg();

    @Override // xsna.m4l0
    public final boolean a() {
        return pla.e().b().a(HintId.INFO_BUBBLE_KEYBOARD_STICKER_TIP.getId());
    }

    @Override // xsna.m4l0
    public final dcn b(Activity activity, Rect rect) {
        l7v b = pla.e().b();
        String id = HintId.INFO_BUBBLE_KEYBOARD_STICKER_TIP.getId();
        b.getClass();
        return new l7v.b(id, b, rect).j(activity);
    }
}
