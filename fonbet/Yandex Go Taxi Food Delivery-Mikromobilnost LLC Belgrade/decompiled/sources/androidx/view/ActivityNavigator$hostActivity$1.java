package androidx.view;

import android.content.Context;
import android.content.ContextWrapper;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Context;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ActivityNavigator$hostActivity$1 extends Lambda implements tls {
    public static final ActivityNavigator$hostActivity$1 w = new ActivityNavigator$hostActivity$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
