package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes13.dex */
public final class j78 implements zm {
    public final /* synthetic */ int b;
    public final /* synthetic */ BottomSheetBehavior c;

    public j78(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.c = bottomSheetBehavior;
        this.b = i;
    }

    @Override // xsna.zm
    public final boolean a(@NonNull View view) {
        this.c.X(this.b);
        return true;
    }
}
