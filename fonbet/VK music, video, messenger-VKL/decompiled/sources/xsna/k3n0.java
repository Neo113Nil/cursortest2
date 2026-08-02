package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.SuggestMusicNotificationInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.stat.scheme.MobileOfficialAppsCorePushesStat$TypePushEventItem;
import xsna.k840;

/* compiled from: SuggestPlayMusicNotificationModel.kt */
/* loaded from: classes3.dex */
public final class k3n0 {
    public final SuggestMusicNotificationInfo a;
    public final k840.d b;
    public final gzs<UserId> c;
    public final MusicPlaybackLaunchContext d = MusicPlaybackLaunchContext.u;
    public final u2b0 e = k840.a.g().b();
    public final u750 f;

    public k3n0(SuggestMusicNotificationInfo suggestMusicNotificationInfo, k840.d dVar, gzs<UserId> gzsVar) {
        this.a = suggestMusicNotificationInfo;
        this.b = dVar;
        this.c = gzsVar;
        s750 s750Var = k840.a.e;
        this.f = s750Var == null ? null : s750Var;
    }

    public final void a(Context context) {
        k840.d dVar = this.b;
        if (dVar.d(context)) {
            dVar.c(context, this.d.t());
            this.f.H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action.OPEN, this.a.b);
        }
    }
}
