package xsna;

import android.os.Bundle;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: VKBottomSheetDialog.java */
/* loaded from: classes17.dex */
public final class mar0 extends hk {
    public final /* synthetic */ kar0 b;

    public mar0(kar0 kar0Var) {
        this.b = kar0Var;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        if (!this.b.i) {
            amVar.s(false);
        } else {
            amVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            amVar.s(true);
        }
    }

    @Override // xsna.hk
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            kar0 kar0Var = this.b;
            if (kar0Var.i) {
                kar0Var.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
