package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: AbstractErrorView.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class ee extends FrameLayout {
    public final a b;
    public xa80 c;

    /* compiled from: AbstractErrorView.java */
    public class a extends BroadcastReceiver {

        /* compiled from: AbstractErrorView.java */
        /* renamed from: xsna.ee$a$a, reason: collision with other inner class name */
        public class RunnableC2797a implements Runnable {
            public RunnableC2797a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ee.this.a();
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || intent.getBooleanExtra("noConnectivity", false)) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2797a(), 1000L);
        }
    }

    public ee(Context context) {
        super(context);
        this.b = new a();
    }

    public final void a() {
        if (getRetryClickListener() == null || jjc.b()) {
            return;
        }
        getRetryClickListener().b();
    }

    public abstract void b();

    public xa80 getRetryClickListener() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getVisibility() == 0) {
            try {
                getContext().unregisterReceiver(this.b);
            } catch (Exception unused) {
            }
        }
    }

    public abstract void setActionTitle(int i);

    public abstract void setMessage(CharSequence charSequence);

    public abstract void setRetryBtnVisible(boolean z);

    public void setRetryClickListener(xa80 xa80Var) {
        this.c = xa80Var;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        a aVar = this.b;
        if (i == 0 && visibility != 0) {
            getContext().registerReceiver(aVar, z23.a("android.net.conn.CONNECTIVITY_CHANGE"));
        } else {
            if (i == 0 || visibility != 0) {
                return;
            }
            try {
                getContext().unregisterReceiver(aVar);
            } catch (Exception unused) {
            }
        }
    }

    public ee(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new a();
    }

    public ee(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new a();
    }
}
