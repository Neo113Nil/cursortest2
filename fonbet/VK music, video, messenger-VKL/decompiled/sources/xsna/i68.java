package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.ui.holders.HeaderVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.stories.model.clickable.ClickableChannelPost;
import com.vk.profile.questions.impl.AnswerSource;
import com.vk.profile.questions.impl.d;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.stories.design.view.text.TextStyleFontPicker;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i68 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i68(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                m68 m68Var = (m68) this.c;
                m68Var.v.setText((CharSequence) this.d);
                break;
            case 1:
                wh50 wh50Var = (wh50) this.c;
                VkButton vkButton = (VkButton) this.d;
                wh50Var.setValue(Boolean.TRUE);
                vkButton.setLoading(true);
                new Handler(Looper.getMainLooper()).postDelayed(new xq8(0, wh50Var, vkButton), 2000L);
                break;
            case 2:
                qkc qkcVar = (qkc) this.c;
                ClickableChannelPost clickableChannelPost = (ClickableChannelPost) this.d;
                gzs<Boolean> gzsVar = qkcVar.d.h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                qkcVar.m(clickableChannelPost);
                g2v.c().k().w(view.getContext(), po40.j(clickableChannelPost), "story");
                break;
            case 3:
                HeaderVh headerVh = (HeaderVh) this.c;
                UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) this.d;
                View view2 = headerVh.n;
                if (view2 != null) {
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    view2.getContext();
                    e.b bVar = new e.b(view2, null, null, l, 6);
                    bVar.w = R.layout.ds_internal_context_menu_item;
                    String str = uIBlockHideBlockButton.C;
                    if (str == null) {
                        View view3 = headerVh.f;
                        if (view3 == null) {
                            view3 = null;
                        }
                        str = view3.getContext().getResources().getString(R.string.video_catalog_hide_block);
                    }
                    VkContextMenu.c.d(bVar, str, dhr0.t.b(R.drawable.vk_icon_unblock_outline_24, R.attr.vk_ui_icon_accent), false, new com.vk.catalog2.common.ui.holders.b(0, headerVh, uIBlockHideBlockButton), 28);
                    VkContextMenu.c.k(bVar);
                    break;
                }
                break;
            case 4:
                com.vk.profile.questions.impl.e eVar = (com.vk.profile.questions.impl.e) this.c;
                d.c cVar = (d.c) this.d;
                eVar.l.e(cVar, AnswerSource.STORY_REPLY);
                iqe0.a(cVar, SchemeStat$TypeQuestionItem.Type.REPLY);
                break;
            default:
                TextStyleFontPicker.b bVar2 = (TextStyleFontPicker.b) this.c;
                izs izsVar = (izs) this.d;
                if (bVar2.getBindingAdapterPosition() != -1) {
                    izsVar.invoke(Integer.valueOf(bVar2.getBindingAdapterPosition()));
                    break;
                }
                break;
        }
    }
}
