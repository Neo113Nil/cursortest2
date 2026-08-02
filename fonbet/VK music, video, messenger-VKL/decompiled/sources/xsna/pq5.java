package xsna;

import com.vk.newsfeed.api.posting.domain.model.PostingStateCacheKey;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pq5 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c);
                qgi0.r(tgi0Var, "profile_avatar");
                break;
            default:
                ArrayList arrayList = new ArrayList((List) obj);
                arrayList.add(new PostingStateCacheKey(this.c));
                wmi0.a.m("PostingStateCacheKeys", arrayList);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pq5(f9t f9tVar, String str) {
        this.c = str;
    }
}
