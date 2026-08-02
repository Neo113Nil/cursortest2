package xsna;

/* compiled from: CommunityProfileTopBarManageAction.kt */
/* loaded from: classes5.dex */
public final class juh implements etv0 {
    public final wh50 a = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final /* synthetic */ kuh b;

    public juh(kuh kuhVar) {
        this.b = kuhVar;
    }

    @Override // xsna.etv0
    public final void b(boolean z) {
        setVisible(false);
        ((gzs) ((zak0) this.b.e).getValue()).invoke();
    }

    @Override // xsna.etv0
    public final boolean isVisible() {
        return ((Boolean) ((zak0) this.a).getValue()).booleanValue();
    }

    @Override // xsna.etv0
    public final void setVisible(boolean z) {
        ((zak0) this.a).setValue(Boolean.valueOf(z));
    }

    @Override // xsna.etv0
    public final void a() {
    }
}
