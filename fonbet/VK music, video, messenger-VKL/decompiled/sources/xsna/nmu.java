package xsna;

import android.content.Context;
import com.vk.dto.group.Group;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nmu implements izs {
    public final /* synthetic */ Group b;
    public final /* synthetic */ int c;

    public /* synthetic */ nmu(Group group, int i) {
        this.b = group;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Group group = this.b;
        int i = this.c;
        group.C = i;
        e4h h0 = xwk.e().h0();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        h0.h(i, context, fkq0.e(group.c));
        return s3q0.a;
    }
}
