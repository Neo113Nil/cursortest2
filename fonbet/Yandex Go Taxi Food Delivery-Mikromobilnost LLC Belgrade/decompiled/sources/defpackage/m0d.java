package defpackage;

import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class m0d implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ m0d(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 fullyDrawnReporter_delegate$lambda$0$0;
        kls fullyDrawnReporter_delegate$lambda$0;
        blj onBackPressedInput_delegate$lambda$0;
        k2m0 defaultViewModelProviderFactory_delegate$lambda$0;
        qx60 onBackPressedDispatcher_delegate$lambda$0;
        int i = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                fullyDrawnReporter_delegate$lambda$0$0 = ComponentActivity.fullyDrawnReporter_delegate$lambda$0$0(componentActivity);
                return fullyDrawnReporter_delegate$lambda$0$0;
            case 1:
                fullyDrawnReporter_delegate$lambda$0 = ComponentActivity.fullyDrawnReporter_delegate$lambda$0(componentActivity);
                return fullyDrawnReporter_delegate$lambda$0;
            case 2:
                onBackPressedInput_delegate$lambda$0 = ComponentActivity.onBackPressedInput_delegate$lambda$0(componentActivity);
                return onBackPressedInput_delegate$lambda$0;
            case 3:
                defaultViewModelProviderFactory_delegate$lambda$0 = ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0(componentActivity);
                return defaultViewModelProviderFactory_delegate$lambda$0;
            default:
                onBackPressedDispatcher_delegate$lambda$0 = ComponentActivity.onBackPressedDispatcher_delegate$lambda$0(componentActivity);
                return onBackPressedDispatcher_delegate$lambda$0;
        }
    }
}
