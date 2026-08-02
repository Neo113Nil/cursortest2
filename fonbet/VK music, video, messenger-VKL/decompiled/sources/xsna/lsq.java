package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import com.vk.libvideo.api.di.WatchLaterComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FaveVideoAttachmentSnackbar.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class lsq extends FunctionReferenceImpl implements wzs<Context, pqq, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Context context, pqq pqqVar) {
        Context context2 = context;
        pqq pqqVar2 = pqqVar;
        ((nsq) this.receiver).getClass();
        ComponentCallbacks2 h = e3m.h(context2);
        w8i w8iVar = h instanceof w8i ? (w8i) h : null;
        if (w8iVar == null) {
            w8iVar = new msq();
        }
        sbx0 f = ((WatchLaterComponent) ((k7m) m7m.f(w8iVar)).mo408a(fpf0.a(WatchLaterComponent.class))).f();
        String str = pqqVar2.b;
        f.getClass();
        String uri = Uri.parse(sbx0.a).toString();
        VideoCatalogFragment.a aVar = new VideoCatalogFragment.a();
        aVar.C();
        aVar.K(str);
        aVar.F(true);
        aVar.z(uri, false);
        aVar.k(context2);
        return s3q0.a;
    }
}
