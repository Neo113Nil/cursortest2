package defpackage;

import android.view.MotionEvent;
import android.view.View;
import ru.yandex.taxi.HapticController$Effect;

/* loaded from: classes13.dex */
public final /* synthetic */ class oxk0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ oxk0(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        View view2 = this.b;
        switch (i) {
            case 0:
                int action = motionEvent.getAction();
                if (action == 0 || action == 1 || action == 3) {
                    qke.E(view2.getContext(), HapticController$Effect.CLICK_LIGHT, false, 12);
                    break;
                }
            default:
                int action2 = motionEvent.getAction();
                if (action2 == 0 || action2 == 1 || action2 == 3) {
                    qke.E(view2.getContext(), HapticController$Effect.CLICK_LIGHT, false, 12);
                    break;
                }
        }
        return false;
    }
}
