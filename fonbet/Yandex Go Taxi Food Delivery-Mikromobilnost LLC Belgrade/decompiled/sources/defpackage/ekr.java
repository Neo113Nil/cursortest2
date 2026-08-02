package defpackage;

import com.yandex.go.navigation.modals.coroutines.a;

/* loaded from: classes.dex */
public abstract class ekr extends a {
    public w0j F;

    public ekr() {
        super(null);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final void R(u45 u45Var) {
        w0j w0jVar = this.F;
        if (w0jVar != null) {
            w0jVar.a();
        }
        this.F = null;
        this.F = com.yandex.go.feedsdk.lifecycle.a.a(u45Var, this);
    }
}
