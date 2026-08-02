package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PhotosProcessorHandler.kt */
/* loaded from: classes7.dex */
public final class zfa0 implements fhd0, lao0 {
    public final oga0 a;

    public zfa0(oga0 oga0Var) {
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
        this.a.o(fgxVar.e, c);
        blk.P(fgxVar).onSuccess();
    }
}
