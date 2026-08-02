package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;

/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements x6k {
    public final /* synthetic */ j3h a;

    public /* synthetic */ g5(j3h j3hVar) {
        this.a = j3hVar;
    }

    public void a(String str) {
        h791.e(this.a, str, false, null, 14);
    }

    public boolean b(String str) {
        y0h e = h791.e(this.a, str, false, null, 14);
        if ((e instanceof v0h) || jl40.l(e, w0h.a)) {
            return true;
        }
        if (jl40.l(e, x0h.a)) {
            return false;
        }
        w511.b();
        return false;
    }

    public void c(Text text, Text text2) {
        ((l3h) this.a).d(new Deeplink(new DeeplinkAction.ShowSnackbar(text, text2, null, 4, null), null, null, null, null, null, false, false, 254, null));
    }
}
