package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: PollEditorNavigator.kt */
/* loaded from: classes4.dex */
public final class tob0 {
    public final PollEditorModalBottomSheet a;
    public final PollEditorModalBottomSheet b;
    public final hj60 c;
    public final f550 d;
    public kob0 e;

    public tob0(PollEditorModalBottomSheet pollEditorModalBottomSheet, PollEditorModalBottomSheet pollEditorModalBottomSheet2, hj60 hj60Var, f550 f550Var) {
        this.a = pollEditorModalBottomSheet;
        this.b = pollEditorModalBottomSheet2;
        this.c = hj60Var;
        this.d = f550Var;
    }

    public static void a(Context context, String str) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(str, 3), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        int i = ify.a;
        if (ify.e(ify.c)) {
            aVar.e(iah0.a(8) + ify.d(3, null));
        } else {
            aVar.e(iah0.a(8));
        }
        aVar.n();
    }
}
