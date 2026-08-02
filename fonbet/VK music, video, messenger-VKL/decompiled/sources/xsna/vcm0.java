package xsna;

import android.view.KeyEvent;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;

/* compiled from: StorySendMessageKeyboardDelegate.kt */
/* loaded from: classes6.dex */
public final class vcm0 extends StickersView.c {
    public final /* synthetic */ xcm0 c;

    public vcm0(xcm0 xcm0Var) {
        this.c = xcm0Var;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean a() {
        return false;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
    public final void b(String str) {
        Object failure;
        xcm0 xcm0Var = this.c;
        VkInputSelect vkInputSelect = xcm0Var.e;
        StickersView stickersView = xcm0Var.l;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.getClass();
        try {
            failure = vkInputSelect.getText().insert(vkInputSelect.getSelectionStart(), str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            vkInputSelect.g.append(str);
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final ContextUser e() {
        return this.c.i.c();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final List<UserId> h() {
        UserId d = this.c.i.d();
        return d != null ? e43.o(d) : new ArrayList();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void j() {
        this.c.e.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        xcm0 xcm0Var = this.c;
        xcm0Var.i.f();
        StickersView stickersView = xcm0Var.l;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.g(i);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void o(int i, String str, ContextUser contextUser) {
        xcm0.a(i, contextUser, this.c);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        ycm0 ycm0Var = this.c.i.m;
        if (ycm0Var != null) {
            ycm0Var.t2(i, stickerItem, "story_keyboard", "keyboard", null);
        }
    }
}
