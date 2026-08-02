package androidx.compose.ui.window;

import defpackage.bts;
import defpackage.fid;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "(Lfid;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* renamed from: androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt$lambda$-1131826196$1, reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$AndroidPopup_androidKt$lambda$1131826196$1 extends Lambda implements wls {
    public static final ComposableSingletons$AndroidPopup_androidKt$lambda$1131826196$1 w = new ComposableSingletons$AndroidPopup_androidKt$lambda$1131826196$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        int intValue = ((Number) obj2).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
            btsVar.Y();
        }
        return zy11.a;
    }
}
