package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f970 implements izs {
    public final /* synthetic */ UserId b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Context e;

    public /* synthetic */ f970(UserId userId, String str, ArrayList arrayList, Context context) {
        this.b = userId;
        this.c = str;
        this.d = arrayList;
        this.e = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = rfc0.a;
        q860 q860Var = new q860();
        q860Var.n(this.b, this.c, this.d, (Group) obj);
        q860Var.l(this.e);
        return s3q0.a;
    }
}
