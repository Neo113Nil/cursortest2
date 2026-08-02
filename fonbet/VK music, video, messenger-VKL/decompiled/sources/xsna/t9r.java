package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: FilePickerBottomSheet.kt */
/* loaded from: classes4.dex */
public final class t9r extends BottomSheetBehavior.d {
    public final /* synthetic */ u9r a;

    public t9r(u9r u9rVar) {
        this.a = u9rVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
        Resources resources;
        Configuration configuration;
        u9r u9rVar = this.a;
        Context mo2getContext = u9rVar.mo2getContext();
        if (mo2getContext == null || (resources = mo2getContext.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return;
        }
        u9rVar.Gn(configuration, f);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        if (i == 5) {
            this.a.tn();
        }
    }
}
