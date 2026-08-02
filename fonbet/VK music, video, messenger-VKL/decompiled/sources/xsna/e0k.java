package xsna;

import android.content.Context;
import android.graphics.RectF;
import com.vk.dto.common.id.UserId;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.t;
import com.vkontakte.android.R;
import xsna.lta;
import xsna.o2k;

/* compiled from: CoverChangesApplier.kt */
/* loaded from: classes5.dex */
public final class e0k implements lta {
    public final pta a;
    public final aha0 b = new aha0();

    public e0k(pta ptaVar) {
        this.a = ptaVar;
    }

    @Override // xsna.lta
    public final io.reactivex.rxjava3.core.x<lta.a> apply() {
        pta ptaVar = this.a;
        pta ptaVar2 = pta.this;
        boolean f = epx.f(ptaVar2.c.b, ptaVar2.b.b);
        lta.a.b bVar = lta.a.b.a;
        if (f) {
            return io.reactivex.rxjava3.core.x.k(bVar);
        }
        o2k o2kVar = ptaVar.c.b;
        if ((o2kVar instanceof o2k.a) && (ptaVar.b.b instanceof o2k.c)) {
            return new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(this.b.n(UserId.d))), new zl0(new lt0(this, 29), 18)).l(new to(new d0k(0), 10)), new wq(6), null);
        }
        if (!(o2kVar instanceof o2k.b)) {
            return io.reactivex.rxjava3.core.x.k(bVar);
        }
        o2k.b.a aVar = ((o2k.b) o2kVar).b;
        RectF rectF = aVar.a;
        com.vk.upload.impl.tasks.t tVar = new com.vk.upload.impl.tasks.t(new t.a(aVar.b, Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom)));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String string = context.getString(R.string.photo_upload_ok);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        com.vk.upload.impl.a.g(tVar, new UploadNotification.a(null, string, context2.getString(R.string.photo_upload_ok_long)));
        com.vk.upload.impl.a.i(tVar);
        return io.reactivex.rxjava3.core.x.k(lta.a.c.d.a);
    }
}
