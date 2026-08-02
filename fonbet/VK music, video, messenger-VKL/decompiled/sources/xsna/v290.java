package xsna;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: OverlayMenuConfigImpl.kt */
/* loaded from: classes4.dex */
public final class v290 implements u290 {
    public static final /* synthetic */ qcy<Object>[] e = {new MutablePropertyReference1Impl(v290.class, "enabled", "getEnabled()Z", 0), p5j.a(0, v290.class, "enableOnNextLaunch", "getEnableOnNextLaunch()Z", fpf0.a), new MutablePropertyReference1Impl(v290.class, "buttonScreenNormalizedPosition", "getButtonScreenNormalizedPosition()Lcom/vk/overlaymenu/ScreenNormalizedPosition;", 0)};
    public final fwy b;
    public final fwy c;
    public final fwy d;

    public v290() {
        int i = 4;
        this.b = new fwy(new f4(27), new nhi(i), new f07((byte) 0, 8));
        this.c = new fwy(new cy20(5), new nhi(i), new xdi(2));
        this.d = new fwy(new r(21), new nhi(i), new i60(7));
    }

    @Override // xsna.u290
    public final void a(och0 och0Var) {
        this.d.setValue(this, e[2], och0Var);
    }

    @Override // xsna.u290
    public final void b(boolean z) {
        this.c.setValue(this, e[1], Boolean.valueOf(z));
    }

    @Override // xsna.u290
    public final boolean c() {
        return ((Boolean) this.c.getValue(this, e[1])).booleanValue();
    }

    @Override // xsna.u290
    public final boolean getEnabled() {
        return ((Boolean) this.b.getValue(this, e[0])).booleanValue();
    }

    @Override // xsna.u290
    public final void setEnabled(boolean z) {
        this.b.setValue(this, e[0], Boolean.valueOf(z));
    }
}
