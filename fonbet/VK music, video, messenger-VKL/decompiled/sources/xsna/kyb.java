package xsna;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class kyb implements gzs<s3q0> {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ com.vk.im.ui.components.chat_profile.a e;

    public kyb(FrameLayout frameLayout, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, com.vk.im.ui.components.chat_profile.a aVar) {
        this.b = frameLayout;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = aVar;
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
            com.vk.im.ui.components.chat_profile.a aVar = this.e;
            FrameLayout frameLayout2 = aVar.k;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            frameLayout2.setPivotX(measuredWidth / 2.0f);
            FrameLayout frameLayout3 = aVar.k;
            (frameLayout3 != null ? frameLayout3 : null).setPivotY(measuredHeight);
        }
        return s3q0.a;
    }
}
