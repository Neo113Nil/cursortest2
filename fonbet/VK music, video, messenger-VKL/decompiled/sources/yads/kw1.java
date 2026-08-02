package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes10.dex */
public final class kw1 {
    public final i83 a;
    public final r83 b;
    public final q83 c;
    public final da3 d;
    public int e;

    public kw1(i83 i83Var, r83 r83Var, q83 q83Var) {
        this.a = i83Var;
        this.b = r83Var;
        this.c = q83Var;
        this.d = MimeTypes.AUDIO_TRUEHD.equals(i83Var.f.m) ? new da3() : null;
    }
}
