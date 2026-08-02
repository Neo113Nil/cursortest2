package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes13.dex */
public final class c88 extends hk {
    public final /* synthetic */ com.google.android.material.bottomsheet.b b;

    public c88(com.google.android.material.bottomsheet.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        if (!this.b.m) {
            amVar.s(false);
        } else {
            amVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            amVar.s(true);
        }
    }

    @Override // xsna.hk
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            com.google.android.material.bottomsheet.b bVar = this.b;
            if (bVar.m) {
                bVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
