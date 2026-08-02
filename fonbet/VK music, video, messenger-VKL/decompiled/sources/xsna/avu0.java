package xsna;

import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import com.vk.feed.tool.view.newsfeed.photo.BlurredImageWrapper;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class avu0 implements gzs<s3q0> {
    public final /* synthetic */ BlurredImageWrapper b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ zuu0 e;

    public avu0(BlurredImageWrapper blurredImageWrapper, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, zuu0 zuu0Var) {
        this.b = blurredImageWrapper;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = zuu0Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        BlurredImageWrapper blurredImageWrapper = this.b;
        int measuredWidth = blurredImageWrapper.getMeasuredWidth();
        int measuredHeight = blurredImageWrapper.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            ProductsPhotoOverlayView productsPhotoOverlayView = this.e.c;
            BlurredImageWrapper.a aVar = new BlurredImageWrapper.a(measuredWidth, measuredHeight);
            aVar.a = 17;
            aVar.b = true;
            productsPhotoOverlayView.setLayoutParams(aVar);
        }
        return s3q0.a;
    }
}
