package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.catalog.mvi.block.impl.albumauthor.AlbumTitleSubtitleAvatar$State;
import com.vk.core.apps.BuildInfo;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.o0r0;
import xsna.t0a;

/* compiled from: AlbumTitleSubtitleAvatar.kt */
/* loaded from: classes16.dex */
public final class zk1 extends u1a<AlbumTitleSubtitleAvatar$State, yk1> {
    public final o0r0 c;
    public final com.vk.video.kidsprofile.restricteduseractions.a d;

    public zk1(b2a b2aVar, o0r0 o0r0Var, com.vk.video.kidsprofile.restricteduseractions.a aVar) {
        super(b2aVar);
        this.c = o0r0Var;
        this.d = aVar;
    }

    @Override // xsna.u1a
    public final void g(yk1 yk1Var) {
        this.d.getClass();
        Context context = yk1Var.c;
        b2a b2aVar = (b2a) this.b.b;
        if (BuildInfo.r()) {
            return;
        }
        this.c.m(context, ((AlbumTitleSubtitleAvatar$State) b2aVar.getCurrentState()).h, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        v(new t0a.a(((AlbumTitleSubtitleAvatar$State) b2aVar.getCurrentState()).j, null, null, new t0a.a.d(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER, SchemeStat$EventItem.Type.VIDEO_PLAYLIST), 6));
    }
}
