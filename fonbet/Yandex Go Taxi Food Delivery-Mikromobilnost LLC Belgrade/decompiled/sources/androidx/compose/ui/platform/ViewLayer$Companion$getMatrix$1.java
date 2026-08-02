package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "Lzy11;", "invoke", "(Landroid/view/View;Landroid/graphics/Matrix;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
public final class ViewLayer$Companion$getMatrix$1 extends Lambda implements wls {
    public static final ViewLayer$Companion$getMatrix$1 w = new ViewLayer$Companion$getMatrix$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return zy11.a;
    }
}
