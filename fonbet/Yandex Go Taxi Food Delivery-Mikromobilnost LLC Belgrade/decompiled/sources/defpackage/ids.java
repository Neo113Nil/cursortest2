package defpackage;

import androidx.fragment.app.Fragment;
import com.yandex.alicekit.core.permissions.b;

/* loaded from: classes15.dex */
public final class ids extends b {
    public final Fragment e;

    public ids(Fragment fragment) {
        super(fragment.requireActivity());
        this.e = fragment;
    }

    @Override // com.yandex.alicekit.core.permissions.b
    public final void h(int i, String[] strArr) {
        this.e.requestPermissions(strArr, i);
    }
}
