package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AlbumsProcessorHandler.kt */
/* loaded from: classes7.dex */
public final class jp1 implements fhd0, lao0 {
    public final oga0 a;

    public jp1(oga0 oga0Var) {
        this.a = oga0Var;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        UserId c;
        try {
            c = new UserId(cqm0.l(fgxVar.c("userId")));
        } catch (Throwable unused) {
            c = o25.a().c();
        }
        if (epx.f(c, UserId.d)) {
            c = o25.a().c();
        }
        this.a.m(fgxVar.e, c, "link", null);
        blk.P(fgxVar).onSuccess();
    }
}
