package xsna;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.requests.WallGetMain;
import xsna.kdh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class grh implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ grh(com.vk.lists.c cVar, hrh hrhVar, boolean z) {
        this.d = cVar;
        this.e = hrhVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                hrh hrhVar = (hrh) this.e;
                WallGetMain.Result result = (WallGetMain.Result) obj;
                boolean f = epx.f(cVar.j(), "0");
                cVar.s(result.s1());
                sa30 sa30Var = hrhVar.h0;
                boolean z = this.c;
                boolean z2 = z || f;
                if (z2) {
                    hrhVar.o0 = 0;
                }
                if (!z2 || result.isEmpty()) {
                    hrhVar.o0 = result.size() + hrhVar.o0;
                } else {
                    NewsEntry newsEntry = result.get(0);
                    hrhVar.p0 = (na60.e(newsEntry) && na60.f(newsEntry)) ? Integer.valueOf(di60.u(newsEntry)) : null;
                    hrhVar.o0 = result.size();
                }
                Integer num = hrhVar.p0;
                sa30Var.getClass();
                sa30.g(result, num);
                hrhVar.d0.g3();
                hrhVar.g0();
                if (!z) {
                    sa30.N(result, hrhVar.d);
                }
                if (!result.isEmpty()) {
                    hrhVar.o(result, null);
                    com.vk.lists.c cVar2 = hrhVar.g;
                    if (cVar2 != null) {
                        cVar2.s(result.s1());
                    }
                    hrhVar.h0();
                }
                if (TextUtils.isEmpty(result.s1()) || result.isEmpty()) {
                    cVar.r(false);
                }
                break;
            case 1:
                kdh0.a aVar = (kdh0.a) this.d;
                izs izsVar = (izs) this.e;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(1079530485, new eup(aVar, izsVar, this.c, 1), true), 3);
                if (aVar.g != null) {
                    nvy.g(nvyVar, null, null, new jai(422434832, new iif(1, aVar, izsVar), true), 3);
                }
                nvy.g(nvyVar, "ITEM_KEY_TITLE", null, new jai(1157180999, new yqz(aVar, izsVar), true), 2);
                nvy.g(nvyVar, null, null, new jai(1265911020, new i3c(2, aVar, izsVar), true), 3);
                if (aVar.j != null) {
                    nvy.g(nvyVar, null, null, new jai(-656611704, new nwl(1, aVar, izsVar), true), 3);
                }
                jai jaiVar = ahi.a;
                nvy.g(nvyVar, null, null, jaiVar, 3);
                nvy.g(nvyVar, null, null, new jai(-524652573, new q2h(1, aVar, izsVar), true), 3);
                nvy.g(nvyVar, null, null, new jai(845519244, new po7(1, aVar, izsVar), true), 3);
                if (aVar.m != null) {
                    nvy.g(nvyVar, null, null, new jai(1792686187, new wqz(aVar, izsVar), true), 3);
                }
                nvy.g(nvyVar, null, null, jaiVar, 3);
                nvy.g(nvyVar, "ITEM_KEY_ADVANCED", null, new jai(1034360619, new zqz(0, aVar, izsVar), true), 2);
                break;
            default:
                lgv0 lgv0Var = (lgv0) this.e;
                com.vk.lists.c cVar3 = (com.vk.lists.c) this.d;
                p2v0 p2v0Var = (p2v0) obj;
                if (this.c && (recyclerPaginatedView = lgv0Var.i) != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
                    recyclerView.scrollToPosition(0);
                }
                hgv0 hgv0Var = lgv0Var.n;
                if (hgv0Var == null) {
                    hgv0Var = null;
                }
                hgv0Var.setItems(p2v0Var);
                cVar3.l(p2v0Var.b);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ grh(kdh0.a aVar, boolean z, izs izsVar) {
        this.d = aVar;
        this.c = z;
        this.e = izsVar;
    }

    public /* synthetic */ grh(boolean z, lgv0 lgv0Var, com.vk.lists.c cVar) {
        this.c = z;
        this.e = lgv0Var;
        this.d = cVar;
    }
}
