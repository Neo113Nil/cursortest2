package xsna;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: VkBaseModalBottomSheet.kt */
/* loaded from: classes6.dex */
public final class neu0 extends BottomSheetBehavior.d {
    public boolean a;
    public final /* synthetic */ oeu0 b;
    public final /* synthetic */ com.google.android.material.bottomsheet.b c;

    public neu0(oeu0 oeu0Var, com.google.android.material.bottomsheet.b bVar) {
        this.b = oeu0Var;
        this.c = bVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        if (i == 5) {
            this.c.cancel();
        } else {
            if (i != 3 || this.a) {
                return;
            }
            this.a = true;
            this.b.Jn();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
    }
}
