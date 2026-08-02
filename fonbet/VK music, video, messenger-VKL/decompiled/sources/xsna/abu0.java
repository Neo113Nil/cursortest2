package xsna;

import android.content.DialogInterface;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class abu0 implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialogInterface;
        if (bVar.findViewById(R.id.design_bottom_sheet) != null) {
            bVar.o().X(3);
        }
    }
}
