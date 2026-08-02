package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;

/* compiled from: AdvTouchSwipeDetector.kt */
/* loaded from: classes17.dex */
public final class w21 implements View.OnTouchListener {
    public final int b = 50;
    public float c;
    public boolean d;
    public dxc e;
    public com.vk.movika.sdk.base.observable.c f;

    /* compiled from: AdvTouchSwipeDetector.kt */
    public static final class a {
        public static w21 a(ClipFeedTab clipFeedTab, q8e q8eVar) {
            if (!(clipFeedTab instanceof ClipFeedTab.SingleAdv)) {
                return null;
            }
            w21 w21Var = new w21();
            q8eVar.setOnTouchListener(w21Var);
            return w21Var;
        }
    }

    public final void a(com.vk.movika.sdk.base.observable.c cVar) {
        this.f = cVar;
    }

    public final void b(dxc dxcVar) {
        this.e = dxcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r2 != 3) goto L45;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        float y = this.c - motionEvent.getY();
        if (y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            y = 0.0f;
        }
        int b = an10.b(y / iah0.f().density);
        int action = motionEvent.getAction();
        if (action != 0) {
            int i = this.b;
            if (action != 1) {
                if (action == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    if (this.c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.c = motionEvent.getY();
                    }
                    float f2 = b / i;
                    f = f2 <= 1.0f ? f2 : 1.0f;
                    com.vk.movika.sdk.base.observable.c cVar = this.f;
                    if (cVar != null) {
                        cVar.invoke(Float.valueOf(f));
                    }
                    if (!this.d && b > i) {
                        this.d = true;
                        view.performHapticFeedback(0);
                        dxc dxcVar = this.e;
                        if (dxcVar != null) {
                            dxcVar.invoke();
                        }
                    }
                }
            }
            if (!this.d && b > i) {
                this.d = true;
                view.performHapticFeedback(0);
                dxc dxcVar2 = this.e;
                if (dxcVar2 != null) {
                    dxcVar2.invoke();
                }
            }
            float f3 = 0 / i;
            f = f3 <= 1.0f ? f3 : 1.0f;
            com.vk.movika.sdk.base.observable.c cVar2 = this.f;
            if (cVar2 != null) {
                cVar2.invoke(Float.valueOf(f));
            }
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = false;
            view.getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            this.c = motionEvent.getY();
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        view.performClick();
        return view.onTouchEvent(motionEvent);
    }
}
