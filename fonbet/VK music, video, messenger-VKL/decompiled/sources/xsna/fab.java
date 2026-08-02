package xsna;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class fab implements gzs<s3q0> {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ w9b e;

    public fab(FrameLayout frameLayout, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, w9b w9bVar) {
        this.b = frameLayout;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = w9bVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        FrameLayout frameLayout = this.b;
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            w9b w9bVar = this.e;
            FrameLayout frameLayout2 = w9bVar.k;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            frameLayout2.setPivotX(measuredWidth / 2.0f);
            FrameLayout frameLayout3 = w9bVar.k;
            (frameLayout3 != null ? frameLayout3 : null).setPivotY(measuredHeight);
        }
        return s3q0.a;
    }
}
