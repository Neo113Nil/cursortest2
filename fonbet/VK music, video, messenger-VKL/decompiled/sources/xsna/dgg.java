package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import com.vk.reactions.fragments.ReactionsFragment;

/* compiled from: CommentsRouterProvider.kt */
/* loaded from: classes18.dex */
public final class dgg implements bgg {
    public final /* synthetic */ cxo a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ n5g0 c;

    public dgg(cxo cxoVar, Context context, n5g0 n5g0Var) {
        this.a = cxoVar;
        this.b = context;
        this.c = n5g0Var;
    }

    @Override // xsna.bgg
    public final void b(iag iagVar) {
        UserId userId;
        h010 h010Var = this.a.f;
        if (h010Var == null || (userId = h010Var.c) == null) {
            return;
        }
        this.c.c(this.b, "market_comment", "market_comment", userId, iagVar.getId());
    }

    @Override // xsna.bgg
    public final void c(iag iagVar) {
        UserId userId;
        h010 h010Var = this.a.f;
        if (h010Var == null || (userId = h010Var.c) == null) {
            return;
        }
        ReactionsFragment.a aVar = new ReactionsFragment.a(userId, iagVar.getId());
        LikesGetList.Type type = LikesGetList.Type.COMMENT;
        Bundle bundle = aVar.j;
        bundle.putSerializable("ltype", type);
        bundle.putSerializable("lptype", LikesGetList.Type.MARKET);
        aVar.k(this.b);
    }

    @Override // xsna.bgg
    public final void a(iag iagVar) {
    }
}
