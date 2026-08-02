package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: DismissingTouchListener.kt */
/* loaded from: classes4.dex */
public final class jcn implements View.OnTouchListener {
    public final fy2 b;
    public boolean c;
    public boolean d;

    public jcn(fy2 fy2Var) {
        this.b = fy2Var;
        com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) fy2Var.b;
        new GestureDetector(eVar.q.getContext(), new icn(this));
        ViewConfiguration.get(eVar.q.getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.d;
    }
}
