package defpackage;

import com.yandex.go.ultima_mode.ui.header.UltimaModeHeaderView;

/* loaded from: classes14.dex */
public final /* synthetic */ class gv11 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ vu11 c;

    public /* synthetic */ gv11(tls tlsVar, vu11 vu11Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = vu11Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 updateTrailAction$lambda$0;
        zy11 updateSubtitleAction$lambda$0;
        switch (this.a) {
            case 0:
                updateTrailAction$lambda$0 = UltimaModeHeaderView.updateTrailAction$lambda$0(this.b, this.c);
                return updateTrailAction$lambda$0;
            default:
                updateSubtitleAction$lambda$0 = UltimaModeHeaderView.updateSubtitleAction$lambda$0(this.b, this.c);
                return updateSubtitleAction$lambda$0;
        }
    }
}
