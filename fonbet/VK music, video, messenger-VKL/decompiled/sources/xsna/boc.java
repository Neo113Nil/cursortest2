package xsna;

import com.vk.clips.design.view.feed.ClipCoauthorInvitationView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class boc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ boc(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                int i2 = ClipCoauthorInvitationView.u;
                gzsVar.invoke();
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
