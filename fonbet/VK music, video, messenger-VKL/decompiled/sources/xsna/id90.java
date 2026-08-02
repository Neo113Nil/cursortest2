package xsna;

import com.vk.core.view.components.context.menu.VkContextMenu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class id90 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ id90(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                xvy xvyVar = (xvy) this.d;
                xuy xuyVar = (xuy) j5g.k0(xvyVar.j().f());
                return Boolean.valueOf((xuyVar != null ? xuyVar.getIndex() : Integer.MIN_VALUE) >= xvyVar.j().d() - this.c);
            default:
                return Integer.valueOf(e3m.f(this.c, ((VkContextMenu.c) this.d).e));
        }
    }
}
