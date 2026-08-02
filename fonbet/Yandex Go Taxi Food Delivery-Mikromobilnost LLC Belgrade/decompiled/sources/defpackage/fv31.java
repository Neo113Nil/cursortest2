package defpackage;

import android.os.Bundle;
import android.view.ViewStructure;

/* loaded from: classes10.dex */
public final class fv31 {
    public final ViewStructure a;

    public fv31(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    public final Bundle a() {
        return this.a.getExtras();
    }

    public final void b(String str) {
        this.a.setClassName(str);
    }

    public final void c(String str) {
        this.a.setContentDescription(str);
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.a.setDimens(i, i2, 0, 0, i3, i4);
    }

    public final void e(int i, String str) {
        this.a.setId(i, null, null, str);
    }

    public final void f(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void g(float f) {
        this.a.setTextStyle(f, 0, 0, 0);
    }

    public final ViewStructure h() {
        return this.a;
    }
}
