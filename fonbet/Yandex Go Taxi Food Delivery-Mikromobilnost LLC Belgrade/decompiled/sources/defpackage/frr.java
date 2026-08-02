package defpackage;

import android.window.OnBackInvokedCallback;
import io.flutter.embedding.android.FlutterActivity;

/* loaded from: classes7.dex */
public final /* synthetic */ class frr implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ frr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((FlutterActivity) obj).onBackPressed();
                break;
            case 1:
                ((b710) obj).handleBackInvoked();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            default:
                qe81 qe81Var = (qe81) obj;
                ch81 ch81Var = qe81Var.b;
                if (ch81Var != null && ch81Var.c.d()) {
                    qe81Var.a.finish();
                    break;
                }
                break;
        }
    }
}
