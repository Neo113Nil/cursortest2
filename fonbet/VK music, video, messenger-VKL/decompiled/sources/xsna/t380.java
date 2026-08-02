package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.dto.notifications.NotificationEntity;
import java.util.ArrayList;

/* compiled from: OnCoordinatesClickListener.java */
/* loaded from: classes17.dex */
public final class t380 implements View.OnTouchListener {
    public static final float f = iah0.a(24);
    public final v770 b;
    public float c;
    public float d;
    public long e;

    public t380(v770 v770Var) {
        this.b = v770Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int min;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
            this.e = System.currentTimeMillis();
            return true;
        }
        if ((1 == actionMasked || 3 == actionMasked) && System.currentTimeMillis() - this.e < 200) {
            float abs = Math.abs(this.c - motionEvent.getX());
            float f2 = f;
            if (abs < f2 && gq.a(motionEvent, this.d) < f2) {
                int x = (int) motionEvent.getX();
                motionEvent.getY();
                v770 v770Var = this.b;
                int i = v770Var.f;
                if (!jjc.b() && (min = Math.min(v770Var.j, v770Var.k) - 1) >= 0 && min >= 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (x < i2 || x > i2 + i) {
                            i2 = i2 + i + v770Var.g;
                            if (i3 == min) {
                                break;
                            }
                            i3++;
                        } else {
                            ArrayList<NotificationEntity> arrayList = v770Var.l;
                            if (arrayList != null && i3 < arrayList.size()) {
                                v770Var.i.invoke(arrayList.get(i3));
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
