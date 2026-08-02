package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.internal.displayname.a;
import com.yandex.messaging.ui.chatlist.b;
import com.yandex.messaging.ui.chatlist.c;

/* loaded from: classes15.dex */
public final class m4b extends RecyclerView.Adapter {
    public static final int w = olh0.msg_vh_chat_list_item;
    public static final int x = olh0.msg_vh_chat_list_compact_mode_item;
    public final q4g a;
    public boolean b;
    public final l4b c = new l4b(this);

    public m4b(q4g q4gVar) {
        this.a = q4gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        boolean z = this.b;
        if (!z) {
            return w;
        }
        if (z) {
            return x;
        }
        w511.b();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        b bVar = (b) x0Var;
        l4b l4bVar = this.c;
        p4b p4bVar = (p4b) l4bVar.c.get(i);
        bVar.W(p4bVar);
        if (i > 0) {
            bVar.N.setTag(e9h0.chat_list_item_first_non_pinned, Boolean.valueOf(!p4bVar.e && ((p4b) l4bVar.c.get(i - 1)).e));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = w;
        q4g q4gVar = this.a;
        if (i == i2) {
            q4gVar.getClass();
            q4gVar.y = viewGroup;
            z8g z8gVar = (z8g) q4gVar.b;
            g420 g420Var = z8gVar.a;
            p8g p8gVar = (p8g) q4gVar.c;
            d8g d8gVar = (d8g) q4gVar.w;
            e8g e8gVar = (e8g) q4gVar.x;
            ViewGroup viewGroup2 = (ViewGroup) q4gVar.y;
            q4g q4gVar2 = new q4g(z8gVar, p8gVar, d8gVar, e8gVar, viewGroup2);
            xqi0 xqi0Var = (xqi0) p8gVar.v.get();
            sfl0 sfl0Var = (sfl0) e8gVar.o.get();
            a aVar = (a) e8gVar.s.get();
            n8t g = q4gVar2.g();
            com.yandex.messaging.domain.personal.mentions.a aVar2 = (com.yandex.messaging.domain.personal.mentions.a) p8gVar.n2.get();
            p9t h = q4gVar2.h();
            z7b z7bVar = new z7b((com.yandex.messaging.internal.authorized.chat.b) p8gVar.C.get());
            nft nftVar = (nft) p8gVar.z0.get();
            rp21 h2 = p8gVar.h();
            Context context = g420Var.a;
            q5z.i(context);
            zp11 zp11Var = new zp11(z7bVar, nftVar, h2, context);
            ymp ympVar = (ymp) z8gVar.b0.get();
            c cVar = (c) p8gVar.k3.get();
            h3y a = i5m.a((g3b) q4gVar2.y);
            com.yandex.messaging.internal.team.gaps.a aVar3 = new com.yandex.messaging.internal.team.gaps.a((com.yandex.messaging.internal.team.gaps.c) p8gVar.h2.get(), new w3c());
            Context context2 = g420Var.a;
            q5z.i(context2);
            return new e4b(viewGroup2, xqi0Var, sfl0Var, aVar, g, aVar2, h, zp11Var, ympVar, cVar, a, aVar3, new p1b(new d820(context2, 0), (arg) e8gVar.u.get()), new zx6((kse) z8gVar.f.get(), (key0) p8gVar.f2.get()), (vse) z8gVar.g.get(), q4gVar2.d(), i5m.a(p8gVar.P), e8gVar.a, p8gVar.g(), q4gVar2.c());
        }
        if (i != x) {
            ny61.g("Invalid view type");
            return null;
        }
        q4gVar.getClass();
        q4gVar.y = viewGroup;
        z8g z8gVar2 = (z8g) q4gVar.b;
        p8g p8gVar2 = (p8g) q4gVar.c;
        d8g d8gVar2 = (d8g) q4gVar.w;
        e8g e8gVar2 = (e8g) q4gVar.x;
        ViewGroup viewGroup3 = (ViewGroup) q4gVar.y;
        q4g q4gVar3 = new q4g(z8gVar2, p8gVar2, d8gVar2, e8gVar2, viewGroup3);
        xqi0 xqi0Var2 = (xqi0) p8gVar2.v.get();
        sfl0 sfl0Var2 = (sfl0) e8gVar2.o.get();
        a aVar4 = (a) e8gVar2.s.get();
        com.yandex.messaging.domain.personal.mentions.a aVar5 = (com.yandex.messaging.domain.personal.mentions.a) p8gVar2.n2.get();
        n8t g2 = q4gVar3.g();
        p9t h3 = q4gVar3.h();
        ymp ympVar2 = (ymp) z8gVar2.b0.get();
        c cVar2 = (c) p8gVar2.k3.get();
        h3y a2 = i5m.a((g3b) q4gVar3.y);
        com.yandex.messaging.internal.team.gaps.a aVar6 = new com.yandex.messaging.internal.team.gaps.a((com.yandex.messaging.internal.team.gaps.c) p8gVar2.h2.get(), new w3c());
        Context context3 = z8gVar2.a.a;
        q5z.i(context3);
        p1b p1bVar = new p1b(new d820(context3, 0), (arg) e8gVar2.u.get());
        zx6 zx6Var = new zx6((kse) z8gVar2.f.get(), (key0) p8gVar2.f2.get());
        return new a4b(g8a1.g(viewGroup3, olh0.msg_vh_chat_list_compact_mode_item), sfl0Var2, a2, p1bVar, cVar2, (vse) z8gVar2.g.get(), aVar6, aVar4, h3, zx6Var, aVar5, ympVar2, xqi0Var2, g2, q4gVar3.d(), i5m.a(p8gVar2.P), e8gVar2.a, p8gVar2.g(), q4gVar3.c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(x0 x0Var) {
        b bVar = (b) x0Var;
        z83.i();
        bVar.X();
        return super.onFailedToRecycleView(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        b bVar = (b) x0Var;
        super.onViewRecycled(bVar);
        bVar.X();
    }
}
