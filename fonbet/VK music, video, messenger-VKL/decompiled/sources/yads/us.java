package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class us {
    public final Handler a;
    public final gf b;

    public /* synthetic */ us(Context context) {
        this(new Handler(Looper.getMainLooper()), ws.a(context));
    }

    public us(Handler handler, gf gfVar) {
        this.a = handler;
        this.b = gfVar;
    }
}
