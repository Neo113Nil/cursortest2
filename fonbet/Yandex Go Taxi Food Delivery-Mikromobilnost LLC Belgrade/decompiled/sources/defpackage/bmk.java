package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.messaging.views.ClickableSpanHandler;
import java.util.List;

/* loaded from: classes15.dex */
public final /* synthetic */ class bmk implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ bmk(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                dmk dmkVar = (dmk) obj2;
                Div2View div2View = (Div2View) obj;
                List<v3k> list = ((clk) obj3).w;
                if (list != null) {
                    for (v3k v3kVar : list) {
                        dmkVar.d = false;
                        Div2View.handleAction$default(div2View, v3kVar, null, null, 6, null);
                    }
                }
                return true;
            default:
                sls slsVar = (sls) obj2;
                mw10 mw10Var = (mw10) obj;
                boolean onTouch = ((ClickableSpanHandler) obj3).onTouch(view, motionEvent);
                if (slsVar != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 1) {
                        long eventTime = motionEvent.getEventTime();
                        long j = mw10Var.E;
                        int i2 = mw10Var.D;
                        if (j != 0) {
                            long j2 = eventTime - j;
                            if (j2 > 0 && j2 < mw10Var.C) {
                                float f = i2;
                                if (Math.abs(motionEvent.getX() - mw10Var.F) <= f && Math.abs(motionEvent.getY() - mw10Var.G) <= f) {
                                    slsVar.invoke();
                                    mw10Var.E = 0L;
                                }
                            }
                            mw10Var.E = eventTime;
                            mw10Var.F = motionEvent.getX();
                            mw10Var.G = motionEvent.getY();
                        } else {
                            mw10Var.E = eventTime;
                            mw10Var.F = motionEvent.getX();
                            mw10Var.G = motionEvent.getY();
                        }
                    } else if (actionMasked == 3) {
                        mw10Var.E = 0L;
                    }
                }
                return onTouch;
        }
    }
}
