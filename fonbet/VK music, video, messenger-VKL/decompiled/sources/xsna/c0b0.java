package xsna;

import android.content.Intent;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.music.playerservice.impl.PlayerService;

/* compiled from: PlayerConnection.java */
/* loaded from: classes3.dex */
public final class c0b0 extends com.vk.core.service.a<PlayerService> {
    public final b0b0 i;
    public final MusicPlayerAction j;
    public izs<s3q0, Intent> k;

    /* compiled from: PlayerConnection.java */
    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0b0(b0b0 b0b0Var, MusicPlayerAction musicPlayerAction) {
        super(b0b0Var, r6m.b);
        r6m.a.getClass();
        this.i = b0b0Var;
        this.j = musicPlayerAction;
    }

    public static void j(n1d n1dVar) {
        c0b0 c0b0Var = new c0b0(new b0b0(r1, null), MusicPlayerAction.ACTION_CONNECT_AND_CLOSE);
        c0b0Var.k = n1dVar;
        c0b0[] c0b0VarArr = {c0b0Var};
        c0b0Var.a();
    }

    @Override // com.vk.core.service.a
    public final Intent b() {
        return new Intent(e43.a, (Class<?>) PlayerService.class);
    }

    @Override // com.vk.core.service.a
    public final Intent c() {
        izs<s3q0, Intent> izsVar = this.k;
        if (izsVar != null) {
            return izsVar.invoke(s3q0.a);
        }
        Intent intent = new Intent(e43.a, (Class<?>) PlayerService.class);
        intent.setAction(this.j.name());
        return intent;
    }

    @Override // com.vk.core.service.a
    public final Class<PlayerService> f() {
        return PlayerService.class;
    }

    @Override // com.vk.core.service.a
    public final void g() {
        e2b0 e2b0Var;
        b0b0 b0b0Var = this.i;
        if (b0b0Var != null) {
            PlayerService e = e();
            if (e == null || (e2b0Var = e.d) == null) {
                e2b0Var = null;
            }
            e2b0Var.m0(b0b0Var);
        }
    }

    @Override // com.vk.core.service.a
    public final void h() {
        e2b0 e2b0Var;
        b0b0 b0b0Var = this.i;
        if (b0b0Var != null) {
            PlayerService e = e();
            if (e == null || (e2b0Var = e.d) == null) {
                e2b0Var = null;
            }
            if (e2b0Var != null) {
                e2b0Var.d.remove(b0b0Var);
            }
        }
    }

    @Override // com.vk.core.service.a
    public final void i() {
    }
}
