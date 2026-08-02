package xsna;

/* compiled from: AudioService.kt */
/* loaded from: classes.dex */
public final class ix4 implements hx4 {
    public final tfx D(Boolean bool, String str) {
        tfx tfxVar = new tfx("audio.getStreamMixSettings", new defpackage.j0(8), new or(4));
        if (str != null) {
            tfx.o(tfxVar, "mix_id", str, 0, 0, 12);
        }
        tfxVar.j("need_user_settings", bool.booleanValue());
        return tfxVar;
    }
}
