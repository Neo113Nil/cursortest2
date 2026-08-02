package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import java.util.List;

/* compiled from: PlaylistOfflineRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class ubb0 implements w8i {
    public final cb50 b;
    public final j8b0 c;
    public final mm20 d;
    public final bpn0 e = new bpn0(new fat(this, 6));

    public ubb0(cb50 cb50Var, j8b0 j8b0Var, mm20 mm20Var) {
        this.b = cb50Var;
        this.c = j8b0Var;
        this.d = mm20Var;
    }

    public final List<Playlist> a(UserId userId) {
        return (List) b(new com.vk.movika.sdk.base.ui.r(12, this, userId));
    }

    public final <T> T b(gzs<? extends T> gzsVar) {
        if (!((com.vk.music.pref.a) this.e.getValue()).O()) {
            this.d.a();
        }
        return gzsVar.invoke();
    }
}
