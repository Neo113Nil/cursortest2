package xsna;

import com.vk.superapp.api.dto.widgets.actions.WebActionCallback;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class ijt implements cgn0 {
    @Override // xsna.cgn0
    public final io.reactivex.rxjava3.internal.operators.single.y a(String str, int i, WebActionCallback webActionCallback) {
        String str2 = webActionCallback.c;
        ufx ufxVar = new ufx("widgetsKit.sendCallbackEvent", new iub0(8), new uga0(9));
        ufx.k(ufxVar, "widget_id", i, 0, 12);
        ufx.n(ufxVar, "peer_id", str, 0, 12);
        ufx.n(ufxVar, "payload", str2, 0, 12);
        return rdx0.B(e370.e(ufxVar)).l(new np1(new c4r(5), 19));
    }
}
