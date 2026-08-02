package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.f9j0;

/* compiled from: ClipsFastSharePopupHelper.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class r2e extends FunctionReferenceImpl implements izs<List<? extends f9j0.c>, List<? extends f9j0.c>> {
    @Override // xsna.izs
    public final List<? extends f9j0.c> invoke(List<? extends f9j0.c> list) {
        ((q2e) this.receiver).getClass();
        List<? extends f9j0.c> list2 = list;
        if (list2.isEmpty()) {
            if (o25.a().b()) {
                cn o = o25.a().o();
                UserId userId = o.a;
                String str = o.b;
                String str2 = o.c;
                if (str2 == null) {
                    str2 = "";
                }
                list2 = Collections.singletonList(new f9j0.c.b(userId, true, str, str2));
            } else {
                list2 = EmptyList.b;
            }
        }
        return list2;
    }
}
