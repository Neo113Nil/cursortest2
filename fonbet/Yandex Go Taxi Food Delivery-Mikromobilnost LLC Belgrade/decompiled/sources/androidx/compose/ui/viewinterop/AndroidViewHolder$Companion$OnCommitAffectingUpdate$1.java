package androidx.compose.ui.viewinterop;

import android.os.Handler;
import defpackage.h60;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "Lzy11;", "invoke", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
public final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements tls {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 w = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        sls slsVar;
        AndroidViewHolder androidViewHolder = (AndroidViewHolder) obj;
        Handler handler = androidViewHolder.getHandler();
        slsVar = androidViewHolder.runUpdate;
        handler.post(new h60(8, slsVar));
        return zy11.a;
    }
}
