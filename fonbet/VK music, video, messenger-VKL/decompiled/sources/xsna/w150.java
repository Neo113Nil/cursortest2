package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w150 implements izs {
    public final /* synthetic */ com.vk.music.playlist.display.data.a b;
    public final /* synthetic */ int c;
    public final /* synthetic */ UserId d;

    public /* synthetic */ w150(com.vk.music.playlist.display.data.a aVar, int i, UserId userId) {
        this.b = aVar;
        this.c = i;
        this.d = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.music.playlist.display.data.a aVar = this.b;
        return aVar.c.K(this.c, this.d).r().c0(io.reactivex.rxjava3.core.q.H((Throwable) obj)).U(new d810(new wq20(aVar, 7), 6));
    }
}
