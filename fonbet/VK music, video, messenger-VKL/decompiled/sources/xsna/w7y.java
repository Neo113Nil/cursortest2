package xsna;

import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w7y implements izs {
    public final /* synthetic */ x7y b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ WebGroupShortInfo f;
    public final /* synthetic */ wh9 g;

    public /* synthetic */ w7y(x7y x7yVar, int i, List list, List list2, WebGroupShortInfo webGroupShortInfo, wh9 wh9Var) {
        this.b = x7yVar;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = webGroupShortInfo;
        this.g = wh9Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wh9 wh9Var = this.g;
        if (booleanValue) {
            this.b.w0(this.c + 1, this.d, j5g.v0(this.f, this.e), wh9Var);
        } else {
            wh9Var.invoke(EmptyList.b);
        }
        return s3q0.a;
    }
}
