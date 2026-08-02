package xsna;

import android.widget.TextView;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class eyb implements gzs<s3q0> {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ com.vk.im.ui.components.chat_profile.a e;

    public eyb(TextView textView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, com.vk.im.ui.components.chat_profile.a aVar) {
        this.b = textView;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = aVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        TextView textView = this.b;
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            com.vk.im.ui.components.chat_profile.a aVar = this.e;
            TextView textView2 = aVar.m;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setPivotX(measuredWidth / 2.0f);
            TextView textView3 = aVar.m;
            (textView3 != null ? textView3 : null).setPivotY(measuredHeight / 2.0f);
        }
        return s3q0.a;
    }
}
