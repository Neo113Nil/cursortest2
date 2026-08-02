package xsna;

import android.view.View;
import com.vkontakte.android.R;
import xsna.am;

/* compiled from: StickerVH.kt */
/* loaded from: classes6.dex */
public final class z7l0 extends hk {
    public final /* synthetic */ View b;

    public z7l0(View view) {
        this.b = view;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.b(new am.a(16, this.b.getContext().getString(R.string.story_message_accessibility_send)));
    }
}
