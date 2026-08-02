package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: AnimationExt.kt */
/* loaded from: classes17.dex */
public final class wo2 extends ViewOutlineProvider {
    public final /* synthetic */ View a;
    public final /* synthetic */ Ref$FloatRef b;

    public wo2(View view, Ref$FloatRef ref$FloatRef) {
        this.a = view;
        this.b = ref$FloatRef;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        View view2 = this.a;
        outline.setRoundRect(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight(), this.b.element);
    }
}
