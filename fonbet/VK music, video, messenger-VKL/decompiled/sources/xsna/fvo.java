package xsna;

import android.widget.PopupWindow;

/* compiled from: EasterEggsPopupShowHelper.kt */
/* loaded from: classes14.dex */
public final class fvo implements dcn {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;
    public final /* synthetic */ PopupWindow c;

    public fvo(io.reactivex.rxjava3.disposables.c cVar, PopupWindow popupWindow) {
        this.b = cVar;
        this.c = popupWindow;
    }

    @Override // xsna.dcn
    public final void dismiss() {
        this.b.dispose();
        i0q0.j(new ef2(this.c, 9));
    }
}
