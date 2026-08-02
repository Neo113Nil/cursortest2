package xsna;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import xsna.uhu;

/* compiled from: GroupCallInviteVc.kt */
/* loaded from: classes7.dex */
public final class zhu extends BottomSheetBehavior.d {
    public final /* synthetic */ aiu a;

    public zhu(aiu aiuVar) {
        this.a = aiuVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        uhu.a aVar;
        if (i != 5 || (aVar = this.a.q) == null) {
            return;
        }
        uhu.this.p.a(true);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
    }
}
