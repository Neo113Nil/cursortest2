package xsna;

import android.os.Bundle;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: ModalBottomSheetDialog.kt */
/* loaded from: classes17.dex */
public final class qw20 extends hk {
    public final /* synthetic */ nw20 b;

    public qw20(nw20 nw20Var) {
        this.b = nw20Var;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        if (!this.b.p) {
            amVar.s(false);
        } else {
            amVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            amVar.s(true);
        }
    }

    @Override // xsna.hk
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            nw20 nw20Var = this.b;
            if (nw20Var.p) {
                nw20Var.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
