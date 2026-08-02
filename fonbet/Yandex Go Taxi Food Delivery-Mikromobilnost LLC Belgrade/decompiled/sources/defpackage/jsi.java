package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.a;

/* loaded from: classes9.dex */
public final class jsi implements m1r {
    public final i3y a;

    public jsi(Context context) {
        this.a = a.a(new ku2(context, 5));
    }

    @Override // defpackage.m1r
    public final Object a(Object obj) {
        return (List) ((m1r) this.a.getValue()).a((List) obj);
    }

    @Override // defpackage.m1r
    public final void set(Object obj) {
        ((m1r) this.a.getValue()).set((List) obj);
    }
}
