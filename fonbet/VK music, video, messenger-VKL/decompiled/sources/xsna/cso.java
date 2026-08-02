package xsna;

import com.vk.newsfeed.api.posting.domain.model.PostingStateCacheKey;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cso implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ cso(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "dzen_screen_toolbar");
                if (str == null) {
                    str = "";
                }
                qgi0.h(tgi0Var, str);
                break;
            case 1:
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                vdx0Var.C(str);
                break;
            case 2:
                ArrayList arrayList = new ArrayList((List) obj);
                arrayList.remove(new PostingStateCacheKey(str));
                wmi0.a.m("PostingStateCacheKeys", arrayList);
                break;
            default:
                qcy<Object>[] qcyVarArr = qgi0.a;
                ((tgi0) obj).a(ngi0.M, str);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cso(f9t f9tVar, String str) {
        this.b = 2;
        this.c = str;
    }
}
