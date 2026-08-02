package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class l9h implements ipg {
    public final Context a;
    public final och b;

    public l9h(Context context, och ochVar) {
        this.a = context.getApplicationContext();
        this.b = ochVar;
    }

    @Override // defpackage.ipg
    public final kpg createDataSource() {
        return new m9h(this.a, this.b.createDataSource());
    }

    public l9h(Context context) {
        this(context, new och());
    }
}
