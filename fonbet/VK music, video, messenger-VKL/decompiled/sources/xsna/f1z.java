package xsna;

/* compiled from: LegacyPlatformTextInputServiceAdapter.kt */
/* loaded from: classes11.dex */
public abstract class f1z implements oua0 {
    public a a;

    /* compiled from: LegacyPlatformTextInputServiceAdapter.kt */
    public interface a {
        yok0 L1(ma2 ma2Var);

        gho0 W();

        j1z c0();

        nek0 getSoftwareKeyboardController();

        rut0 getViewConfiguration();

        tny j0();
    }

    @Override // xsna.oua0
    public final void d() {
        nek0 softwareKeyboardController;
        a aVar = this.a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    @Override // xsna.oua0
    public final void h() {
        nek0 softwareKeyboardController;
        a aVar = this.a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public abstract void i();

    public final void j(d0z d0zVar) {
        if (this.a != d0zVar) {
            xzw.c("Expected textInputModifierNode to be " + d0zVar + " but was " + this.a);
        }
        this.a = null;
    }
}
