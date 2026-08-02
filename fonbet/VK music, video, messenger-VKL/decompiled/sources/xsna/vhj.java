package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: Content.kt */
/* loaded from: classes16.dex */
public final class vhj implements zzs<qa8, Boolean, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzc e;
    public final /* synthetic */ izs<zqe, s3q0> f;
    public final /* synthetic */ zzf0 g;
    public final /* synthetic */ vtu h;

    /* JADX WARN: Multi-variable type inference failed */
    public vhj(int i, Integer num, boolean z, zzc zzcVar, izs<? super zqe, s3q0> izsVar, zzf0 zzf0Var, vtu vtuVar) {
        this.b = i;
        this.c = num;
        this.d = z;
        this.e = zzcVar;
        this.f = izsVar;
        this.g = zzf0Var;
        this.h = vtuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    @Override // xsna.zzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke(qa8 qa8Var, Boolean bool, androidx.compose.runtime.a aVar, Integer num) {
        boolean z;
        boolean J;
        Object x;
        bool.getClass();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-327825140, intValue, -1, "com.vk.clips.playlists.playlist_ui.ui.ClipsPlaylistUiView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Content.kt:147)");
            }
            Integer num2 = this.c;
            if (num2 != null) {
                if (this.b == num2.intValue()) {
                    z = true;
                    aVar2.K(-1507335642);
                    Object obj = a.C0011a.a;
                    q630 q630Var = q630.a.a;
                    if (this.d) {
                        vtu vtuVar = this.h;
                        boolean y = aVar2.y(vtuVar);
                        Object x2 = aVar2.x();
                        if (y || x2 == obj) {
                            x2 = new thj(vtuVar);
                            aVar2.R(x2);
                        }
                        q630Var = e5m.a(q630Var, this.g, (gzs) x2);
                    }
                    aVar2.j();
                    q630 E = ahn.E(q630Var, "PlaylistListItemInModal");
                    izs<zqe, s3q0> izsVar = this.f;
                    boolean J2 = aVar2.J(izsVar);
                    zzc zzcVar = this.e;
                    J = J2 | aVar2.J(zzcVar);
                    x = aVar2.x();
                    if (!J || x == obj) {
                        x = new uhj(izsVar, zzcVar);
                        aVar2.R(x);
                    }
                    zhj.a(this.e, (gzs) x, E, z, this.d, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            z = false;
            aVar2.K(-1507335642);
            Object obj2 = a.C0011a.a;
            q630 q630Var2 = q630.a.a;
            if (this.d) {
            }
            aVar2.j();
            q630 E2 = ahn.E(q630Var2, "PlaylistListItemInModal");
            izs<zqe, s3q0> izsVar2 = this.f;
            boolean J22 = aVar2.J(izsVar2);
            zzc zzcVar2 = this.e;
            J = J22 | aVar2.J(zzcVar2);
            x = aVar2.x();
            if (!J) {
            }
            x = new uhj(izsVar2, zzcVar2);
            aVar2.R(x);
            zhj.a(this.e, (gzs) x, E2, z, this.d, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
