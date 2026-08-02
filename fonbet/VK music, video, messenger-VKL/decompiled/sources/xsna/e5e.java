package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import xsna.by40;
import xsna.d4e;
import xsna.t5e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class e5e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e5e(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                h5e h5eVar = (h5e) this.d;
                UserId userId = (UserId) this.e;
                u2e u2eVar = (u2e) obj;
                h5eVar.c.g(new d4e.a.d(u2eVar));
                if (this.c) {
                    h5eVar.b.d(new t5e.l(userId, u2eVar.a, u2eVar.d, new f20(7)), null);
                }
                break;
            case 1:
                rw40 rw40Var = (rw40) this.d;
                MusicTrack musicTrack = (MusicTrack) this.e;
                rw40Var.W(musicTrack, this.c);
                if (musicTrack.S4() || musicTrack.Pb()) {
                    rw40Var.z.add(musicTrack.Fb());
                    rw40Var.v.b(new fw40(musicTrack));
                    rw40Var.T(new by40.i(musicTrack));
                }
                break;
            default:
                ymq0 ymq0Var = (ymq0) this.d;
                Clips clips = (Clips) this.e;
                if (this.c) {
                    wmq0.B(ymq0Var, clips, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    wmq0.B(ymq0Var, clips, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ e5e(h5e h5eVar, boolean z, UserId userId) {
        this.b = 0;
        this.d = h5eVar;
        this.c = z;
        this.e = userId;
    }
}
