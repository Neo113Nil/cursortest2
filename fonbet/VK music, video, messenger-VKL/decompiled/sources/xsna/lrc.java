package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.dw20;

/* compiled from: ClipDraftBottomSheet.kt */
/* loaded from: classes2.dex */
public final class lrc extends kq6 {
    public final Context c;
    public final boolean d;
    public final com.vk.movika.sdk.base.presenter.c e;
    public final l49 f;
    public final ldo g;

    public lrc(Context context, boolean z, com.vk.movika.sdk.base.presenter.c cVar, l49 l49Var, ldo ldoVar) {
        this.c = context;
        this.d = z;
        this.e = cVar;
        this.f = l49Var;
        this.g = ldoVar;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        dhr0.a.getClass();
        int i = dhr0.u().c;
        Context context = this.c;
        LayoutInflater from = LayoutInflater.from(new l7s(context, i));
        av20.a aVar = new av20.a();
        aVar.d(R.layout.actions_popup_item, from);
        aVar.d = new krc(context);
        aVar.c(new jrc(0, this, context));
        av20 b = aVar.b();
        b.setItems(e43.l(this.d ? new e520(R.id.draft_go_to_clips_editor, R.drawable.vk_icon_edit_outline_28, R.string.video_edit, 0, false, R.attr.vk_ui_icon_accent_themed, R.attr.vk_ui_text_primary, false, null, 0, null, false, 8080) : new e520(R.id.draft_go_to_clips_editor, R.drawable.vk_icon_edit_outline_28, R.string.video_edit, 0, false, R.attr.vk_ui_icon_accent, R.attr.vk_ui_text_primary, false, null, 0, null, false, 8080), new e520(R.id.draft_delete, R.drawable.vk_icon_delete_outline_28, R.string.clip_remove, 1, false, R.attr.vk_ui_icon_negative, R.attr.vk_ui_text_negative, false, null, 0, null, false, 8080)));
        return ((dw20.b) dw20.a.k(new dw20.b(context, tzp0.a(null, 3)).a0(new s1(this, 19)), b, 4)).I0("draft_options");
    }
}
