package androidx.core.view;

import android.view.ViewParent;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements tls {
    public static final ViewKt$ancestors$1 b = new ViewKt$ancestors$1(1, 0, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
