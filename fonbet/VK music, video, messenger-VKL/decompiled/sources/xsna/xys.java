package xsna;

import androidx.appcompat.app.AppCompatActivity;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xys implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xys(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ww50 v;
        switch (this.b) {
            case 0:
                break;
            case 1:
                gwt gwtVar = (gwt) this.c;
                bpn0 bpn0Var = gwtVar.e;
                g8e0 g8e0Var = (g8e0) obj;
                AppCompatActivity appCompatActivity = g8e0Var.a().get();
                if (((appCompatActivity == null || (v = s200.v(appCompatActivity)) == null) ? 0 : v.y()) == 0 && !((a8e0) bpn0Var.getValue()).b()) {
                    ((a8e0) bpn0Var.getValue()).a(g8e0Var, new ewt(gwtVar));
                }
                break;
            case 2:
                ((p870) ((ek40) this.c).b.getValue()).e(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, new AudioPlaylistAttachment(((gcb0) obj).a));
                break;
            default:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
