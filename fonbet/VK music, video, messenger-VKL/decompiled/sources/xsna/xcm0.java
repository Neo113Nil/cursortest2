package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.log.L;
import com.vk.stickers.ContextUser;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vkontakte.android.R;
import xsna.xgy;

/* compiled from: StorySendMessageKeyboardDelegate.kt */
/* loaded from: classes6.dex */
public final class xcm0 implements xgy.b {
    public final Activity b;
    public final Window c;
    public final View d;
    public final VkInputSelect e;
    public final ImageView f;
    public final kcl0 g;
    public final View h;
    public final tcm0 i;
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();
    public xgy k;
    public StickersView l;
    public final AutoSuggestStickersPopupWindow m;

    public xcm0(Activity activity, Window window, View view, VkInputSelect vkInputSelect, ImageView imageView, kcl0 kcl0Var, ViewGroup viewGroup, ojf0 ojf0Var, View view2, tcm0 tcm0Var) {
        this.b = activity;
        this.c = window;
        this.d = view;
        this.e = vkInputSelect;
        this.f = imageView;
        this.g = kcl0Var;
        this.h = view2;
        this.i = tcm0Var;
        wcm0 wcm0Var = new wcm0(this);
        int i = AutoSuggestStickersPopupWindow.H;
        AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = new AutoSuggestStickersPopupWindow(activity, vkInputSelect.getEditText(), kcl0Var, wcm0Var);
        autoSuggestStickersPopupWindow.k(ojf0Var);
        autoSuggestStickersPopupWindow.setBottomSheetContainer(viewGroup);
        autoSuggestStickersPopupWindow.l(view2);
        this.m = autoSuggestStickersPopupWindow;
        autoSuggestStickersPopupWindow.q();
    }

    public static final void a(int i, ContextUser contextUser, xcm0 xcm0Var) {
        xcm0Var.j.b(hg1.m(rsg0.y0(new cqt(i), null, null, 3), xcm0Var.b, 0L, false, 62).subscribe(new afs(new ucm0(i, contextUser, xcm0Var), 26), new cp50(new qi3(L.a, 12), 17)));
    }

    @Override // xsna.xgy.b
    public final void E(boolean z, xgy xgyVar) {
        this.f.setImageResource(R.drawable.vk_icon_keyboard_outline_28);
    }

    public final xgy g() {
        xgy xgyVar = this.k;
        if (xgyVar != null) {
            return xgyVar;
        }
        StickersView stickersView = new StickersView(this.b, (StickersView.c) null, 6);
        this.l = stickersView;
        ycm0 ycm0Var = this.i.m;
        StoryOwner storyOwner = ycm0Var != null ? ycm0Var.d : null;
        stickersView.setStickersKeyboardContext(storyOwner instanceof StoryOwner.User ? new b.d.C1800b(((StoryOwner.User) storyOwner).e) : storyOwner instanceof StoryOwner.Community ? new b.d.a(((StoryOwner.Community) storyOwner).f) : b.C1795b.a);
        StickersView stickersView2 = this.l;
        if (stickersView2 == null) {
            stickersView2 = null;
        }
        stickersView2.setListener(new vcm0(this));
        StickersView stickersView3 = this.l;
        if (stickersView3 == null) {
            stickersView3 = null;
        }
        stickersView3.setAnchorViewProvider(new op5(this));
        StickersView stickersView4 = this.l;
        xgy xgyVar2 = new xgy(this.b, this.d, stickersView4 == null ? null : stickersView4, this.c, null, 112);
        xgyVar2.o = this;
        xgyVar2.a(this.f, null);
        this.k = xgyVar2;
        xgyVar2.m = true;
        return xgyVar2;
    }

    @Override // xsna.xgy.b
    public final void q(xgy xgyVar) {
        this.f.setImageResource(R.drawable.vk_icon_smile_outline_28);
    }

    @Override // xsna.xgy.b
    public final void D() {
    }
}
