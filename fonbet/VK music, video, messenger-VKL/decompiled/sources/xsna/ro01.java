package xsna;

import com.google.android.gms.cast.MediaStatus;
import java.util.Objects;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class ro01 extends lvf0.a {
    public final /* synthetic */ g0a a;

    public ro01(g0a g0aVar) {
        Objects.requireNonNull(g0aVar);
        this.a = g0aVar;
    }

    @Override // xsna.lvf0.a
    public final void e() {
        g0a g0aVar = this.a;
        lvf0 lvf0Var = g0aVar.j;
        MediaStatus h = lvf0Var != null ? lvf0Var.h() : null;
        pp01 pp01Var = g0aVar.m;
        if (pp01Var != null) {
            pp01Var.zzc(h);
        }
    }

    @Override // xsna.lvf0.a
    public final void f(String str, long j, int i, long j2, long j3) {
        pp01 pp01Var = this.a.m;
        if (pp01Var != null) {
            pp01Var.zzb(str, j, i, j2, j3);
        }
    }
}
