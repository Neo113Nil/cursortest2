package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg40 implements Callable {
    public final /* synthetic */ sg40 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ Playlist d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ lg40(sg40 sg40Var, UserId userId, Playlist playlist, boolean z) {
        this.b = sg40Var;
        this.c = userId;
        this.d = playlist;
        this.e = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        sg40 sg40Var = this.b;
        rbb0 rbb0Var = sg40Var.f;
        Playlist playlist = this.d;
        String Ib = playlist.Ib();
        UserId userId = this.c;
        sg40Var.n.execute(new z3l(sg40Var, userId, rbb0Var.l(userId, Ib), playlist.Ib(), 1));
        rbb0Var.D(userId, playlist);
        sg40Var.a.c0(playlist);
        sg40Var.l.F(playlist.Ib());
        sg40Var.d.b(new fi40(playlist, this.e));
        return s3q0.a;
    }
}
