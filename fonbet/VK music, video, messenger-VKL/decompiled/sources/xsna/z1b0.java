package xsna;

import com.vk.music.player.PlaybackActionMeta;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1b0 implements izs {
    public final /* synthetic */ e2b0 b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ PlaybackActionMeta g;
    public final /* synthetic */ String h;

    public /* synthetic */ z1b0(e2b0 e2b0Var, AtomicBoolean atomicBoolean, boolean z, boolean z2, String str, PlaybackActionMeta playbackActionMeta, String str2) {
        this.b = e2b0Var;
        this.c = atomicBoolean;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = playbackActionMeta;
        this.h = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        e2b0 e2b0Var = this.b;
        e2b0Var.S((String) obj);
        this.c.set(e2b0Var.l0(this.d, this.e, this.f, this.g, this.h));
        return s3q0.a;
    }
}
