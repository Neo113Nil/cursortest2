package xsna;

import android.view.View;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vk.sharing.api.dto.Target;
import xsna.cdc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ufg implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ufg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                j20 j20Var = (j20) this.c;
                wfg wfgVar = ((vfg) this.d).m;
                if (wfgVar == null) {
                    wfgVar = null;
                }
                j20Var.invoke(wfgVar.b);
                break;
            case 1:
                PinKeyboardView pinKeyboardView = (PinKeyboardView) this.c;
                sf6 sf6Var = (sf6) this.d;
                if (!pinKeyboardView.e) {
                    sf6Var.a(pinKeyboardView.c);
                    break;
                }
                break;
            case 2:
                cdc0.a aVar = (cdc0.a) this.c;
                f180 f180Var = (f180) this.d;
                T t = aVar.m;
                if (t != 0) {
                    f180Var.b((Target) t);
                    break;
                }
                break;
            default:
                rxy0 rxy0Var = (rxy0) this.c;
                rxy0Var.b.f((p0z0) this.d);
                break;
        }
    }
}
