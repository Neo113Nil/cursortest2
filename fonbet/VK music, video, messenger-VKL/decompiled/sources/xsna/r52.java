package xsna;

import android.view.MotionEvent;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class r52 extends Lambda implements gzs<Boolean> {
    final /* synthetic */ MotionEvent $event;
    final /* synthetic */ p52 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r52(MotionEvent motionEvent, p52 p52Var) {
        super(0);
        this.this$0 = p52Var;
        this.$event = motionEvent;
    }

    @Override // xsna.gzs
    public final Boolean invoke() {
        boolean dispatchGenericMotionEvent;
        dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent(this.$event);
        return Boolean.valueOf(dispatchGenericMotionEvent);
    }
}
