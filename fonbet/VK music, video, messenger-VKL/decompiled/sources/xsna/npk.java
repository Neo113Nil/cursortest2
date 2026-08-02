package xsna;

import android.os.Bundle;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: CustomisableBottomSheetDialog.java */
/* loaded from: classes17.dex */
public final class npk extends hk {
    public final /* synthetic */ ppk b;

    public npk(ppk ppkVar) {
        this.b = ppkVar;
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
            ppk ppkVar = this.b;
            if (ppkVar.i) {
                ppkVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
