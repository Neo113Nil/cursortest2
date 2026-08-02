package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: OnTouchDownListener.java */
/* loaded from: classes17.dex */
public class jc80 implements View.OnTouchListener {
    public static final float g = iah0.a(24);
    public final a b = new a(Looper.getMainLooper());
    public final b c;
    public float d;
    public float e;
    public long f;

    /* compiled from: OnTouchDownListener.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            b bVar = jc80.this.c;
            if (bVar != null) {
                int i = message.what;
                if (i == 0) {
                    bVar.a(message.arg1);
                } else {
                    if (i != 1) {
                        return;
                    }
                    bVar.c();
                }
            }
        }
    }

    /* compiled from: OnTouchDownListener.java */
    public interface b {
        void a(int i);

        void b();

        void c();

        void d(int i, int i2);

        void onTouch(View view, MotionEvent motionEvent);
    }

    public jc80(b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        b bVar = this.c;
        a aVar = this.b;
        if (actionMasked == 0) {
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = System.currentTimeMillis();
            aVar.removeMessages(0);
            aVar.removeMessages(1);
            aVar.sendMessageDelayed(Message.obtain(aVar, 0, (int) motionEvent.getX(), (int) motionEvent.getY()), 10L);
            aVar.sendMessageDelayed(Message.obtain(aVar, 1, (int) motionEvent.getX(), (int) motionEvent.getY()), 250L);
        } else {
            float f = g;
            if (actionMasked == 2) {
                if (Math.abs(this.d - motionEvent.getX()) > f || gq.a(motionEvent, this.e) > f) {
                    aVar.removeMessages(0);
                    aVar.removeMessages(1);
                }
            } else if (1 == actionMasked || 3 == actionMasked) {
                aVar.removeMessages(0);
                if (bVar != null) {
                    if (3 != actionMasked && System.currentTimeMillis() - this.f < 200 && Math.abs(this.d - motionEvent.getX()) < f && gq.a(motionEvent, this.e) < f) {
                        aVar.removeMessages(1);
                        bVar.d((int) motionEvent.getX(), (int) motionEvent.getY());
                    }
                    motionEvent.getX();
                    motionEvent.getY();
                    bVar.b();
                }
            }
        }
        if (bVar != null) {
            bVar.onTouch(view, motionEvent);
        }
        return true;
    }
}
