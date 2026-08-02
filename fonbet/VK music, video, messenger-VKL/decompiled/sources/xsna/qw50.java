package xsna;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;

/* compiled from: NavigationBarMenu.java */
/* loaded from: classes13.dex */
public final class qw50 extends androidx.appcompat.view.menu.f {
    public final int A;

    @NonNull
    public final Class<?> z;

    public qw50(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.z = cls;
        this.A = i;
    }

    @Override // androidx.appcompat.view.menu.f
    @NonNull
    public final androidx.appcompat.view.menu.h a(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size > i4) {
            String simpleName = this.z.getSimpleName();
            throw new IllegalArgumentException(i5s.a(xy6.b(i4, "Maximum number of items supported by ", simpleName, " is ", ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
        }
        w();
        androidx.appcompat.view.menu.h a = super.a(i, i2, i3, charSequence);
        a.f(true);
        v();
        return a;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    @NonNull
    public final SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
    }
}
