package xsna;

import android.content.Context;

/* compiled from: StringProvider.kt */
/* loaded from: classes6.dex */
public final class mqm0 implements lqm0 {
    public final Context a;

    public mqm0(Context context) {
        this.a = context;
    }

    @Override // xsna.lqm0
    public final String a(int i) {
        return this.a.getString(i);
    }
}
