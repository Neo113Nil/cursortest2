package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.collections.EmptySet;

/* loaded from: classes10.dex */
public final class oat extends e9f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oat(boolean z, int i) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", r2, r3, r4, r5, 1000);
        boolean z2 = (i & 2) != 0 ? false : z;
        Bundle bundle = new Bundle();
        EmptySet emptySet = EmptySet.a;
        bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(emptySet));
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(emptySet));
    }

    public oat() {
        this(false, 7);
    }
}
