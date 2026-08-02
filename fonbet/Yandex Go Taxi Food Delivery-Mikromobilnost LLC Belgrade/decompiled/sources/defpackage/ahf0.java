package defpackage;

import android.view.ViewGroup;
import com.yandex.go.slot.ui.view.SlotItemButtonViewComponent;
import com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ahf0 implements rqs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ahf0(ViewGroup viewGroup, Object obj, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        int i = this.a;
        Object obj = this.c;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                ProfileUltimaModeView.render$lambda$0((ProfileUltimaModeView) viewGroup, (sls) obj, nqs0Var, wss0Var);
                break;
            default:
                SlotItemButtonViewComponent.setAction$lambda$0((SlotItemButtonViewComponent) viewGroup, (wrs0) obj, nqs0Var, wss0Var);
                break;
        }
    }
}
