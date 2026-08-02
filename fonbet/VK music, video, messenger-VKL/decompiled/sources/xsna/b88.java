package xsna;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes13.dex */
public final class b88 implements View.OnClickListener {
    public final /* synthetic */ com.google.android.material.bottomsheet.b b;

    public b88(com.google.android.material.bottomsheet.b bVar) {
        this.b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.material.bottomsheet.b bVar = this.b;
        if (bVar.m && bVar.isShowing()) {
            if (!bVar.o) {
                TypedArray obtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                bVar.n = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                bVar.o = true;
            }
            if (bVar.n) {
                bVar.cancel();
            }
        }
    }
}
