package defpackage;

import android.view.ViewGroup;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.domain.statuses.e;
import com.yandex.messaging.domain.unreadcount.d;
import com.yandex.messaging.internal.displayname.a;
import com.yandex.messaging.ui.chatlist.b;
import com.yandex.messaging.ui.chatlist.c;

/* loaded from: classes15.dex */
public final class e4b extends b {
    public final zp11 j0;
    public u2c0 k0;

    public e4b(ViewGroup viewGroup, xqi0 xqi0Var, sfl0 sfl0Var, a aVar, n8t n8tVar, com.yandex.messaging.domain.personal.mentions.a aVar2, p9t p9tVar, zp11 zp11Var, ymp ympVar, c cVar, h3y h3yVar, com.yandex.messaging.internal.team.gaps.a aVar3, p1b p1bVar, zx6 zx6Var, vse vseVar, e eVar, h3y h3yVar2, n4b n4bVar, d dVar, com.yandex.messaging.domain.e eVar2) {
        super(g8a1.g(viewGroup, olh0.msg_vh_chat_list_item), sfl0Var, h3yVar, p1bVar, cVar, vseVar, aVar3, aVar, p9tVar, zx6Var, aVar2, ympVar, xqi0Var, n8tVar, eVar, h3yVar2, n4bVar, dVar, eVar2);
        this.j0 = zp11Var;
    }

    @Override // com.yandex.messaging.ui.chatlist.b
    public final void W(p4b p4bVar) {
        super.W(p4bVar);
        ExistingChatRequest existingChatRequest = p4bVar.k;
        e48 e48Var = new e48(20, this);
        zp11 zp11Var = this.j0;
        zp11Var.getClass();
        this.k0 = new u2c0(zp11Var, existingChatRequest, e48Var);
    }

    @Override // com.yandex.messaging.ui.chatlist.b
    public final void X() {
        super.X();
        u2c0 u2c0Var = this.k0;
        if (u2c0Var != null) {
            u2c0Var.close();
        }
        this.k0 = null;
    }

    @Override // com.yandex.messaging.ui.chatlist.b
    public final boolean a0() {
        return false;
    }
}
