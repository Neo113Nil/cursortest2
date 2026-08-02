package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.ui.discovery.map.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes13.dex */
public final class k7c0 extends r8 {
    public final yh00 A;
    public final d c;
    public final a3v w;
    public final i3y x;
    public final i3y y;
    public final i3y z;

    public k7c0(d dVar, a3v a3vVar, Context context, ah00 ah00Var) {
        super(5, ah00Var);
        this.c = dVar;
        this.w = a3vVar;
        qd00 qd00Var = new qd00(context, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = a.b(lazyThreadSafetyMode, qd00Var);
        this.y = a.b(lazyThreadSafetyMode, new qd00(context, 22));
        this.z = a.b(lazyThreadSafetyMode, new qd00(context, 23));
        this.A = new yh00(4, this, ah00Var);
    }
}
