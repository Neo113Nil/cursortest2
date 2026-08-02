package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PauseReason;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p450 implements izs {
    public final /* synthetic */ u2b0 b;
    public final /* synthetic */ s450 c;

    public /* synthetic */ p450(u2b0 u2b0Var, s450 s450Var) {
        this.b = u2b0Var;
        this.c = s450Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        u2b0 u2b0Var = this.b;
        s450 s450Var = this.c;
        n450 n450Var = (n450) obj;
        String str = n450Var.a;
        String str2 = n450Var.b;
        MusicTrack b = u2b0Var.b();
        boolean Ob = b != null ? b.Ob() : false;
        bn40.f("got stop playing music event: deviceId=", str, "deviceName=", str2);
        if (!epx.f(vx2.d.getDeviceId(), str) && u2b0Var.m0().h() && !Ob) {
            u2b0Var.t1(27, PauseReason.QUEUE, new nl6(4, s450Var, str2));
        }
        return s3q0.a;
    }
}
