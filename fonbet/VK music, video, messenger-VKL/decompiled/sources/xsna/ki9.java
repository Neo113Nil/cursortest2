package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: CameraEventCallbacks.java */
/* loaded from: classes11.dex */
public final class ki9 extends t640<ji9> {
    @NonNull
    public static ki9 b() {
        ki9 ki9Var = new ki9();
        ki9Var.a.addAll(Arrays.asList(new ji9[0]));
        return ki9Var;
    }

    @Override // xsna.t640
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ki9 clone() {
        ki9 b = b();
        b.a.addAll(Collections.unmodifiableList(new ArrayList(this.a)));
        return b;
    }
}
