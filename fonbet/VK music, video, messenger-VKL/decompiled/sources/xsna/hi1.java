package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AlbumHandler.kt */
/* loaded from: classes7.dex */
public final class hi1 implements fhd0, lao0 {
    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        boolean f = epx.f(fgxVar.a("rev"), "1");
        long l = cqm0.l(fgxVar.c("userId"));
        com.vk.common.links.c.d(fgxVar.e, new UserId(l), fgxVar.c("albumId"), blk.P(fgxVar), f);
    }
}
