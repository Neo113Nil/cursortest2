package xsna;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StorySendMessageKeyboardDelegate.kt */
/* loaded from: classes6.dex */
public final class wcm0 extends StickersView.c {
    public final /* synthetic */ xcm0 c;

    public wcm0(xcm0 xcm0Var) {
        this.c = xcm0Var;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean a() {
        return false;
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
    public final boolean i() {
        return TextUtils.isEmpty(this.c.e.getEditableText());
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        xcm0 xcm0Var = this.c;
        xgy g = xcm0Var.g();
        xcm0Var.i.f();
        StickersView stickersView = xcm0Var.l;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.g(i);
        if (g.e()) {
            return;
        }
        g.m = true;
        g.h(null);
        g.m = false;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void o(int i, String str, ContextUser contextUser) {
        xcm0.a(i, contextUser, this.c);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
        String str2 = c0.size() == 2 ? (String) c0.get(1) : "";
        xcm0 xcm0Var = this.c;
        tcm0 tcm0Var = xcm0Var.i;
        String concat = "story_suggestion_".concat(str2);
        ycm0 ycm0Var = tcm0Var.m;
        if (ycm0Var != null) {
            ycm0Var.t2(i, stickerItem, concat, "suggestion", null);
        }
        xcm0Var.m.r();
    }
}
