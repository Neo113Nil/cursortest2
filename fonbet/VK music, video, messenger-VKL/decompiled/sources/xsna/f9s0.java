package xsna;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import com.vk.core.view.components.picture.VkImage;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class f9s0 implements gzs<s3q0> {
    public final /* synthetic */ VkImage b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ VkImage e;
    public final /* synthetic */ Drawable f;

    public f9s0(VkImage vkImage, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, VkImage vkImage2, Drawable drawable) {
        this.b = vkImage;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = vkImage2;
        this.f = drawable;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        VkImage vkImage = this.b;
        int measuredWidth = vkImage.getMeasuredWidth();
        int measuredHeight = vkImage.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            Matrix matrix = new Matrix();
            Drawable drawable = this.f;
            float f = measuredHeight;
            float max = Math.max(measuredWidth / drawable.getIntrinsicWidth(), f / drawable.getIntrinsicHeight());
            matrix.setScale(max, max);
            matrix.postTranslate(0.5f, f - (drawable.getIntrinsicHeight() * max));
            this.e.setImageMatrix(matrix);
        }
        return s3q0.a;
    }
}
