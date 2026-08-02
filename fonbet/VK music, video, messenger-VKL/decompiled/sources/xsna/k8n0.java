package xsna;

import android.content.Context;
import com.vkontakte.android.attachments.GeoAttachment;
import xsna.sw50;
import xsna.tzp0;
import xsna.vnt;

/* compiled from: SuperAppGeoPicker.kt */
/* loaded from: classes6.dex */
public final class k8n0 implements sw50.e {
    @Override // xsna.sw50.e
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(Context context, tzp0.c cVar) {
        vnt.a aVar = new vnt.a(context, cVar);
        aVar.c(fnj.d(aVar.c) ? new cpo(false, 0, 7) : new a470());
        aVar.I0("com.vk.superapp:geopicker");
        io.reactivex.rxjava3.subjects.f<Object> fVar = ynt.a.a;
        qjk0 qjk0Var = new qjk0(3);
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, qjk0Var).U(new rjk0(3));
    }

    @Override // xsna.sw50.e
    public final void b(Context context, GeoAttachment geoAttachment) {
        zl00.b(context, geoAttachment);
    }
}
