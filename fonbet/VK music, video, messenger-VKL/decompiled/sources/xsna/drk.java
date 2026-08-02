package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.TimeUnit;

/* compiled from: D2DHorizontalScrollTracker.kt */
/* loaded from: classes7.dex */
public final class drk implements View.OnTouchListener {
    public final stg0 b;
    public final int c;
    public boolean d;
    public float e;
    public float f;
    public final io.reactivex.rxjava3.subjects.f<s3q0> g;

    public drk(Context context, stg0 stg0Var) {
        this.b = stg0Var;
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.g = fVar;
        ver0.c(context, fVar.y(100L, TimeUnit.MILLISECONDS).subscribe(new defpackage.x(new ifg(this, 4), 16)));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = motionEvent.getX();
            this.f = motionEvent.getY();
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float abs = Math.abs(motionEvent.getX() - this.e);
                float abs2 = Math.abs(motionEvent.getY() - this.f);
                if (!this.d || abs <= this.c || abs <= abs2) {
                    return false;
                }
                this.g.onNext(s3q0.a);
                return false;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return false;
    }
}
