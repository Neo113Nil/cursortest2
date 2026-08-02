package xsna;

import android.view.View;
import com.vkontakte.android.R;
import xsna.am;

/* compiled from: WriteBarAccessibilityHelper.kt */
/* loaded from: classes7.dex */
public final class p0y0 extends hk {
    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.b(new am.a(32, view.getResources().getString(R.string.accessibility_msg_record_audiomsg)));
    }
}
