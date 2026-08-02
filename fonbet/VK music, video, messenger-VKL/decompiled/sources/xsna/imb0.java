package xsna;

import android.view.MotionEvent;
import kotlin.jvm.internal.Lambda;

/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes11.dex */
public final class imb0 extends Lambda implements izs<MotionEvent, Boolean> {
    final /* synthetic */ xd2 $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imb0(dxt0 dxt0Var) {
        super(1);
        this.$view = dxt0Var;
    }

    @Override // xsna.izs
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean dispatchTouchEvent;
        MotionEvent motionEvent2 = motionEvent;
        switch (motionEvent2.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = this.$view.dispatchTouchEvent(motionEvent2);
                break;
            default:
                dispatchTouchEvent = this.$view.dispatchGenericMotionEvent(motionEvent2);
                break;
        }
        return Boolean.valueOf(dispatchTouchEvent);
    }
}
