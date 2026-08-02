package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: Unpin.kt */
/* loaded from: classes2.dex */
public final class v4q0 extends h6s0 {
    public static final v4q0 c = new v4q0(VideoBottomSheetOptions.UNPIN.ordinal());
    public static final abs0 d = new abs0();

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        boolean z = fxc0.B().J().p() && hg10.m(s6s0Var);
        Boolean Aa = videoFile.Aa();
        Boolean bool = Boolean.TRUE;
        boolean z2 = epx.f(Aa, bool) && epx.f(videoFile.Q(), bool);
        boolean z3 = s6s0Var.q != null;
        if (!z || !z2 || !z3) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_unpin_outline_28, R.string.video_unpin_short, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        UserId userId = s6s0Var.q;
        if (userId == null) {
            userId = o25.a().L();
        }
        String a1 = s6s0Var.a.a1();
        eo2 eo2Var = new eo2(y6s0Var, s6s0Var, activity, 4);
        defpackage.l lVar = new defpackage.l(activity, y6s0Var, s6s0Var, 7);
        abs0 abs0Var = d;
        abs0Var.getClass();
        UserId a = fkq0.a(userId);
        tfx tfxVar = new tfx("videoChannels.unpinVideo", new fbj0(6), new nq(29));
        tfx.n(tfxVar, "channel_id", a, 1L, 0L, 8);
        tfx.o(tfxVar, "video_raw_id", a1, 0, 0, 12);
        hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), activity, 0L, false, 62).subscribe(new epq0(new m2l0(eo2Var, abs0Var, activity), 3), new k130(new e9i0(lVar, abs0Var, activity), 28));
    }
}
