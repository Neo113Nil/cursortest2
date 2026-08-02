package sg.bigo.ads.bs;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.bo.a;

/* loaded from: classes9.dex */
public final class a<T extends sg.bigo.ads.bo.a> extends c<T> {
    public a(int i, @NonNull T t, Context context) {
        this(i, t, false, context);
    }

    @Override // sg.bigo.ads.bs.c
    @NonNull
    public final String a() {
        return super.a();
    }

    public a(int i, @NonNull T t, boolean z, Context context) {
        super(i, t, z, context);
    }

    public a(@NonNull T t, Context context) {
        this(sg.bigo.ads.bx.a.a(), t, context);
    }
}
