package xsna;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Chip.java */
/* loaded from: classes13.dex */
public final class eac extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public eac(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        com.google.android.material.chip.a aVar = this.a.f;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
