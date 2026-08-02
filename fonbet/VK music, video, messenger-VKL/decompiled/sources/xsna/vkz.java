package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.libvideo.live.impl.views.live.ProgressErrorStateMashine;
import com.vk.log.L;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: LivePresenter.java */
/* loaded from: classes3.dex */
public final class vkz implements io.reactivex.rxjava3.functions.f<Throwable> {
    public final /* synthetic */ com.vk.libvideo.live.impl.views.live.b b;

    public vkz(com.vk.libvideo.live.impl.views.live.b bVar) {
        this.b = bVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Throwable th) throws Throwable {
        boolean z;
        String str;
        cvp cvpVar;
        Drawable drawable;
        String string;
        Throwable th2 = th;
        L.i(th2);
        com.vk.libvideo.live.impl.views.live.b bVar = this.b;
        bVar.L = true;
        if (bVar.I && !gpt0.w(bVar.n.f)) {
            bVar.z2();
            bVar.A2();
            bVar.x2();
        }
        bVar.reset();
        bVar.q0 = true;
        ProgressErrorStateMashine progressErrorStateMashine = bVar.g;
        piz pizVar = bVar.f;
        String str2 = null;
        if (th2 instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
            int s = vKApiExecutionException.s();
            int i = R.string.live_stream_unavailable;
            if (s == -3) {
                Context viewContext = pizVar.getViewContext();
                if (bVar.j0) {
                    i = R.string.live_stream_deleted;
                }
                string = viewContext.getString(i);
                Context viewContext2 = pizVar.getViewContext();
                e3m.a aVar = e3m.a;
                drawable = m33.a(R.drawable.vk_icon_delete_outline_56, viewContext2);
                str = null;
                cvpVar = null;
            } else {
                if (vKApiExecutionException.s() == -1) {
                    string = pizVar.getViewContext().getString(R.string.live_network_error_description);
                    str = pizVar.getViewContext().getString(R.string.live_retry);
                    cvpVar = new dv3(bVar);
                } else if (vKApiExecutionException.s() == 6) {
                    string = pizVar.getViewContext().getString(R.string.live_network_error_description);
                    str = pizVar.getViewContext().getString(R.string.live_retry);
                    cvpVar = new dlv(bVar);
                } else {
                    string = bVar.j0 ? pizVar.getViewContext().getString(R.string.live_stream_unavailable) : pizVar.getViewContext().getString(R.string.live_stream_error, vKApiExecutionException.toString());
                    str = pizVar.getViewContext().getString(R.string.live_retry);
                    cvpVar = new wkz(bVar);
                }
                drawable = null;
            }
            str2 = string;
            z = true;
        } else {
            z = false;
            str = null;
            cvpVar = null;
            drawable = null;
        }
        if (!z) {
            str2 = pizVar.getViewContext().getString(R.string.live_general_error_description);
            str = pizVar.getViewContext().getString(R.string.live_retry);
            cvpVar = new hhd0(bVar);
        }
        progressErrorStateMashine.b = ProgressErrorStateMashine.State.HIDE;
        progressErrorStateMashine.h = new dvp(str2, str, cvpVar, drawable, bVar.j0);
        progressErrorStateMashine.d = ProgressErrorStateMashine.State.SHOW;
        progressErrorStateMashine.a();
        progressErrorStateMashine.b();
        bVar.M = true;
    }
}
