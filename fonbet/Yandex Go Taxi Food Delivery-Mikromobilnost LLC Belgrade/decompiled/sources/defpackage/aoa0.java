package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes13.dex */
public final class aoa0 implements zo31 {
    public final GoFrameLayout a;
    public final ViewStub b;

    public aoa0(GoFrameLayout goFrameLayout, ViewStub viewStub) {
        this.a = goFrameLayout;
        this.b = viewStub;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
