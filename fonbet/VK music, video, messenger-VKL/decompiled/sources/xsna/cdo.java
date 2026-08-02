package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.dw20;

/* compiled from: DraftBottomSheet.kt */
/* loaded from: classes16.dex */
public final class cdo extends kq6 {
    public final Context c;
    public final jn2 d;
    public final e07 e;

    public cdo(Context context, jn2 jn2Var, e07 e07Var) {
        this.c = context;
        this.d = jn2Var;
        this.e = e07Var;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        dhr0.a.getClass();
        int i = dhr0.u().c;
        Context context = this.c;
        LayoutInflater from = LayoutInflater.from(new l7s(context, i));
        av20.a aVar = new av20.a();
        aVar.d(R.layout.actions_popup_item, from);
        aVar.d = new bdo(context);
        aVar.c(new zco(0, this, context));
        av20 b = aVar.b();
        b.setItems(e43.l(new e520(R.id.draft_go_to_clips_editor, R.drawable.vk_icon_camera_outline_28, R.string.clips_profile_bottomsheet_edit_draft, 0, false, 0, 0, false, null, 0, null, false, 8176), new e520(R.id.draft_delete, R.drawable.vk_icon_delete_outline_28, R.string.clips_profile_bottomsheet_delete_draft, 1, false, 0, 0, false, null, 0, null, false, 8176)));
        return ((dw20.b) dw20.a.k(new dw20.b(context, tzp0.a(null, 3)).a0(new r5i(this, 10)), b, 4)).I0("draft_options");
    }
}
