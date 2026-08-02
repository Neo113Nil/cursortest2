package xsna;

import android.content.Context;

/* compiled from: SettingTitleRecyclerItem.kt */
/* loaded from: classes18.dex */
public final class a0j0 extends eg90 {
    public final int b;
    public final String c;

    public a0j0(int i) {
        Context context = e43.a;
        String string = (context == null ? null : context).getString(i);
        this.b = i;
        this.c = string;
    }

    @Override // xsna.zif0
    public final long a() {
        return this.b;
    }

    @Override // xsna.zif0
    public final int b() {
        return 3;
    }
}
