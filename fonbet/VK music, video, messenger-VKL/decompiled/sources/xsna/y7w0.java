package xsna;

import android.content.Context;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.vmoji.character.VmojiCharacterFragment;

/* compiled from: VmojiCharacterRouter.kt */
/* loaded from: classes7.dex */
public final class y7w0 {
    public final VmojiCharacterFragment a;
    public dw20 b;
    public final Context c;

    public y7w0(VmojiCharacterFragment vmojiCharacterFragment) {
        this.a = vmojiCharacterFragment;
        this.c = vmojiCharacterFragment.requireContext();
    }

    public final void a(String str, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel) {
        y8w0 y8w0Var = new y8w0(0);
        y8w0Var.a = str;
        y8w0Var.b = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.v0() : null;
        y8w0Var.c = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.zb() : null;
        y8w0Var.d = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.Ab() : null;
        d6w0.a(b6m.e(), this.c, "keyboard_create", y8w0Var.a(), 8);
    }
}
