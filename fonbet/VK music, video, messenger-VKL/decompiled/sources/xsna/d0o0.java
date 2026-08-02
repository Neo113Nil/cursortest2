package xsna;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: TagBundle.java */
/* loaded from: classes11.dex */
public class d0o0 {
    public static final d0o0 b = new d0o0(new ArrayMap());
    public final ArrayMap a;

    public d0o0(@NonNull ArrayMap arrayMap) {
        this.a = arrayMap;
    }

    @Nullable
    public final Integer a(@NonNull String str) {
        return (Integer) this.a.get(str);
    }
}
