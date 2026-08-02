package xsna;

import ru.rustore.sdk.appupdate.model.InstallState;

/* compiled from: MutableStateSubject.kt */
/* loaded from: classes9.dex */
public final class yh50<T> {
    public final Object a = new Object();
    public final zh50<T> b;
    public volatile T c;

    /* JADX WARN: Multi-variable type inference failed */
    public yh50(InstallState installState) {
        zh50<T> zh50Var = new zh50<>();
        this.b = zh50Var;
        this.c = installState;
        zh50Var.a(installState);
    }
}
