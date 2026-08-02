package androidx.view;

import defpackage.eah0;
import defpackage.tls;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/navigation/d;", "invoke", "(Landroid/view/View;)Landroidx/navigation/d;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.Navigation$findViewNavController$2, reason: from Kotlin metadata */
/* loaded from: classes10.dex */
final class View extends Lambda implements tls {
    public static final View w = new View(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object tag = ((android.view.View) obj).getTag(eah0.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (d) ((WeakReference) tag).get();
        }
        if (tag instanceof d) {
            return (d) tag;
        }
        return null;
    }
}
