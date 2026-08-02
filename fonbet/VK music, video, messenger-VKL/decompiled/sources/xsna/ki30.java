package xsna;

import android.content.Context;
import com.vk.im.popup.Popup;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.collections.EmptyList;
import xsna.u8m;

/* compiled from: Popups.kt */
/* loaded from: classes2.dex */
public final class ki30 extends Popup.f<u8m> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ki30(int i, Context context, boolean z, boolean z2) {
        super(r4, null, 0, r7, null, R.string.vkim_popup_msg_delete_submit_cancel, z ? Collections.singletonList(new lwb0(context.getString(R.string.vkim_popup_msg_delete_submit_checkbox_for_all), 0, null, null, 0, r14, false, null, false, z2, 1502)) : EmptyList.b, z ? Collections.singletonList(r14) : EmptyList.b, 934);
        int i2 = (z && i == 1) ? R.string.vkim_popup_msg_delete_submit_title_question_single : z ? R.string.vkim_popup_msg_delete_submit_title_question_many : i == 1 ? R.string.vkim_popup_msg_delete_submit_title_default_single : R.string.vkim_popup_msg_delete_submit_title_default_many;
        String f = z ? "" : enj.f(R.plurals.vkim_popup_msg_delete_submit_desc, i, context);
        u8m.u uVar = u8m.u.b;
    }
}
