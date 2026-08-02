package defpackage;

import ru.yandex.taxi.widget.dialog.AlertDialogModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class dr1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialogModalView b;

    public /* synthetic */ dr1(AlertDialogModalView alertDialogModalView, int i) {
        this.a = i;
        this.b = alertDialogModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AlertDialogModalView alertDialogModalView = this.b;
        switch (i) {
            case 0:
                AlertDialogModalView.onAttachedToWindow$lambda$0(alertDialogModalView);
                break;
            default:
                alertDialogModalView.onBackPressed();
                break;
        }
    }
}
