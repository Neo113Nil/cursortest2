package defpackage;

import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class k0d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ k0d(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0(componentActivity);
                break;
            default:
                componentActivity.invalidateMenu();
                break;
        }
    }
}
