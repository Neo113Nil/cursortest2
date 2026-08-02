package defpackage;

import android.view.View;
import android.view.ViewStub;

/* loaded from: classes13.dex */
public final class dio0 implements zo31 {
    public final ViewStub a;
    public final ViewStub b;

    public dio0(ViewStub viewStub, ViewStub viewStub2) {
        this.a = viewStub;
        this.b = viewStub2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
