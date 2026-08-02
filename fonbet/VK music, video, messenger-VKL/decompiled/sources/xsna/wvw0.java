package xsna;

import com.vk.voip.ui.qr.ui.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wvw0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wvw0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return a.c.a;
            case 1:
                return ((com.vk.voip.ui.sessionrooms.f) obj).a.getId();
            default:
                String className = ((StackTraceElement) obj).getClassName();
                Package r0 = n3q.class.getPackage();
                String name = r0 != null ? r0.getName() : null;
                if (name == null) {
                    name = "";
                }
                return Boolean.valueOf(brm0.B(className, name, false));
        }
    }
}
