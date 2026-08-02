package xsna;

/* compiled from: KeyboardNavigationItems.kt */
/* loaded from: classes6.dex */
public abstract class jgy implements hfz {
    public abstract jgy a(boolean z);

    public abstract boolean b();

    public abstract int getId();

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(getId());
    }
}
