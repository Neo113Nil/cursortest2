package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.View;

/* compiled from: HintBuilder.kt */
/* loaded from: classes2.dex */
public interface r6v {

    /* compiled from: HintBuilder.kt */
    public interface a extends r6v {
        a a(DialogInterface.OnDismissListener onDismissListener);

        a b(DialogInterface.OnShowListener onShowListener);

        a c(int i);

        a d(float f);

        a e();

        a f(Rect rect);

        a g(int i);

        a h(ykt0 ykt0Var);

        a i(View.OnClickListener onClickListener);

        a k(int i);

        a l();

        a m();
    }

    dcn j(Activity activity);
}
