package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vk.voip.ui.sessionrooms.f;
import java.util.Collection;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wvi0 implements wzs {
    public final /* synthetic */ com.vk.voip.ui.sessionrooms.dialog.model.a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a.c d;

    public /* synthetic */ wvi0(com.vk.voip.ui.sessionrooms.dialog.model.a aVar, boolean z, a.c cVar) {
        this.b = aVar;
        this.c = z;
        this.d = cVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        a.c cVar = this.d;
        Collection<f.a.b> collection = cVar.c;
        return this.b.d(this.c, cVar, collection, (Pair) obj, (Pair) obj2);
    }
}
