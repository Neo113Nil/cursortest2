package defpackage;

import com.yandex.go.flex.common.router.web_view.FlexWebApi;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class bnr implements anr {
    public final cnr a;

    public bnr(cnr cnrVar) {
        this.a = cnrVar;
    }

    public final FlexWebApi a(List list, uhx uhxVar, gym gymVar) {
        cnr cnrVar = this.a;
        return new FlexWebApi((wnt) cnrVar.a.get(), list, EmptyList.a, uhxVar, gymVar, (tt2) cnrVar.b.get());
    }
}
