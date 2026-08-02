package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public abstract class a extends ViewGroup {
    private int a;
    private boolean b;
    private AbstractRunnableC2460a c;

    /* renamed from: sg.bigo.ads.common.view.a$a, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC2460a implements Runnable {
        boolean b;

        private AbstractRunnableC2460a() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.b) {
                return;
            }
            a();
        }

        public /* synthetic */ AbstractRunnableC2460a(byte b) {
            this();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private synchronized void a(boolean z) {
        try {
            AbstractRunnableC2460a abstractRunnableC2460a = this.c;
            if (abstractRunnableC2460a != null) {
                abstractRunnableC2460a.b = true;
                this.c = null;
            }
            if (z) {
                AbstractRunnableC2460a abstractRunnableC2460a2 = new AbstractRunnableC2460a() { // from class: sg.bigo.ads.common.view.a.1
                    @Override // sg.bigo.ads.common.view.a.AbstractRunnableC2460a
                    public final void a() {
                        if (a.this.b && a.this.b() && v.c(a.this) && sg.bigo.ads.ca.a.a(a.this, new Rect())) {
                            a.this.a();
                        }
                        a.this.postDelayed(this, r0.a);
                    }
                };
                this.c = abstractRunnableC2460a2;
                postDelayed(abstractRunnableC2460a2, this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void a();

    public abstract boolean b();

    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        a(true);
    }

    public final void d() {
        this.b = false;
        a(false);
    }

    public int getFlipInterval() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(int i) {
        this.a = i;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        this.b = false;
    }
}
