package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.vkontakte.android.R;

/* compiled from: MsgImageSelectionColorFilter.java */
/* loaded from: classes2.dex */
public final class fk30 extends PorterDuffColorFilter {
    public fk30(Context context) {
        super(context.getResources().getColor(R.color.vkim_msg_part_selection_mask), PorterDuff.Mode.SRC_ATOP);
    }
}
