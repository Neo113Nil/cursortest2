package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: DoubleClickHelper.kt */
/* loaded from: classes18.dex */
public class g6o {
    public final s1v a;
    public final long b = ViewConfiguration.getDoubleTapTimeout();
    public final a c = new a(Looper.getMainLooper());
    public f6o d;

    /* compiled from: DoubleClickHelper.kt */
    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            f6o f6oVar;
            if (message.what == 3) {
                Object obj = message.obj;
                if (!(obj instanceof View) || (f6oVar = g6o.this.d) == null) {
                    return;
                }
                f6oVar.invoke((View) obj);
            }
        }
    }

    public g6o(s1v s1vVar) {
        this.a = s1vVar;
    }

    public final e6o a(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        return new e6o(this, null, onClickListener, onClickListener2);
    }
}
