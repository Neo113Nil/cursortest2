package xsna;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4504q2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import xsna.ha70;
import xsna.pdv0;

/* compiled from: NotificationItemActionHandler.kt */
/* loaded from: classes4.dex */
public final class ia70 {
    public final qss a;
    public final sz00 b;
    public final mh70 c;
    public final ui70 d;
    public final xmc e;

    public ia70(qss qssVar, sz00 sz00Var, mh70 mh70Var, ui70 ui70Var, xmc xmcVar) {
        this.a = qssVar;
        this.b = sz00Var;
        this.c = mh70Var;
        this.d = ui70Var;
        this.e = xmcVar;
    }

    public final void a(ha70 ha70Var, Context context) {
        if (ha70Var.equals(ha70.j.a)) {
            this.a.a(context);
            return;
        }
        if (ha70Var instanceof ha70.l) {
            ha70.l lVar = (ha70.l) ha70Var;
            maz.c(xwk.d().e(), context, lVar.a, new LaunchContext(false, false, false, null, lVar.b, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108847), null, null, 24);
            return;
        }
        if (ha70Var instanceof ha70.o) {
            ha70.o oVar = (ha70.o) ha70Var;
            pdv0.a b = vtk0.c().b(oVar.a);
            Integer num = oVar.b;
            if (num != null) {
                b.F(num.intValue());
            }
            b.k(context);
            return;
        }
        if (ha70Var instanceof ha70.r) {
            ha70.r rVar = (ha70.r) ha70Var;
            gcd0.t(context, rVar.b, rVar.a, rVar.c, 40);
            return;
        }
        if (ha70Var instanceof ha70.s) {
            gd60.Z0(hd60.a(), context, ((ha70.s) ha70Var).a, null, null, 12);
            return;
        }
        if (ha70Var instanceof ha70.t) {
            ydt0 Y = fxc0.B().Y();
            ha70.t tVar = (ha70.t) ha70Var;
            VideoFileOld videoFileOld = tVar.a;
            Integer num2 = tVar.b;
            Y.k(context, videoFileOld, (r43 & 4) != 0 ? null : C4504q2.x, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : num2 != null ? new ReplyInfo(num2.intValue(), null) : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : this.e.c(videoFileOld), (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            return;
        }
        if (ha70Var instanceof ha70.u) {
            ha70.u uVar = (ha70.u) ha70Var;
            pdv0.a a = vtk0.c().a(uVar.a);
            Integer num3 = uVar.b;
            if (num3 != null) {
                a.F(num3.intValue());
            }
            a.J(C4504q2.x);
            a.k(context);
            return;
        }
        if (ha70Var instanceof ha70.q) {
            ha70.q qVar = (ha70.q) ha70Var;
            qhp0.a().h(qVar.a, context, qVar.b);
            return;
        }
        if (ha70Var instanceof ha70.v) {
            gd60.J(hd60.a(), context, ((ha70.v) ha70Var).a, C4504q2.x, null, null, 4084);
            return;
        }
        if (ha70Var instanceof ha70.m) {
            this.b.e(context, ((ha70.m) ha70Var).a);
            return;
        }
        if (ha70Var instanceof ha70.p) {
            fl4 g = lyd.g();
            MusicTrack musicTrack = ((ha70.p) ha70Var).a;
            g.O(context, musicTrack.c, musicTrack.b, MusicPlaybackLaunchContext.Fb(C4504q2.x), musicTrack.I);
            return;
        }
        if (ha70Var instanceof ha70.n) {
            String str = ((ha70.n) ha70Var).a;
            mh70 mh70Var = this.c;
            if (str == null) {
                mh70Var.c(context);
                return;
            } else {
                mh70Var.b(context, str);
                return;
            }
        }
        if (ha70Var instanceof ha70.i) {
            ha70.i iVar = (ha70.i) ha70Var;
            oz50 h = this.d.h(iVar.a, iVar.b);
            if (h != null) {
                h.k(context);
                return;
            }
            return;
        }
        if (ha70Var instanceof ha70.k) {
            GroupedNotificationListFragment.a aVar = new GroupedNotificationListFragment.a();
            aVar.j.putString("query", ((ha70.k) ha70Var).a);
            aVar.k(context);
        } else if (ha70Var instanceof ha70.h) {
            GroupedNotificationListFragment.a aVar2 = new GroupedNotificationListFragment.a();
            ha70.h hVar = (ha70.h) ha70Var;
            long j = hVar.b;
            String str2 = hVar.a;
            Bundle bundle = aVar2.j;
            bundle.putLong("group_id", j);
            bundle.putString("group_name", str2);
            aVar2.k(context);
        }
    }
}
