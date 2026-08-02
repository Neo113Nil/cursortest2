package xsna;

/* compiled from: BackHandlerDispatcherCompat.kt */
/* loaded from: classes11.dex */
public final class zu5 {
    public final jy50 a;
    public final p180 b;

    /* JADX WARN: Multi-variable type inference failed */
    public zu5(jy50 jy50Var, p180 p180Var) {
        this.a = jy50Var;
        this.b = p180Var;
        if ((jy50Var == null ? p180Var : jy50Var) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }
}
