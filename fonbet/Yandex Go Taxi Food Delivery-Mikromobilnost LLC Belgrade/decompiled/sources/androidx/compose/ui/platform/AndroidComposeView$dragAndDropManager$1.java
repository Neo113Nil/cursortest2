package androidx.compose.ui.platform;

import defpackage.b64;
import defpackage.cjs0;
import defpackage.tls;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean m59startDrag12SF9DM;
        b64.D(obj);
        m59startDrag12SF9DM = ((AndroidComposeView) this.receiver).m59startDrag12SF9DM(null, ((cjs0) obj2).a, (tls) obj3);
        return Boolean.valueOf(m59startDrag12SF9DM);
    }
}
