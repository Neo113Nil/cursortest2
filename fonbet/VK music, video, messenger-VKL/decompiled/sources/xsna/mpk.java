package xsna;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: CustomisableBottomSheetDialog.java */
/* loaded from: classes17.dex */
public final class mpk implements View.OnClickListener {
    public final /* synthetic */ ppk b;

    public mpk(ppk ppkVar) {
        this.b = ppkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ppk ppkVar = this.b;
        if (ppkVar.i && ppkVar.isShowing()) {
            if (!ppkVar.l) {
                TypedArray obtainStyledAttributes = ppkVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                ppkVar.k = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                ppkVar.l = true;
            }
            if (ppkVar.k) {
                ppkVar.cancel();
            }
        }
    }
}
