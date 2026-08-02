package xsna;

import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedListNavigator.kt */
/* loaded from: classes4.dex */
public final class cr60 {
    public final so60 a;
    public final Lazy b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Object i;

    public cr60(so60 so60Var, du60 du60Var, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, Lazy lazy, bpn0 bpn0Var4) {
        this.a = so60Var;
        this.b = bpn0Var2;
        this.c = du60Var.b;
        this.d = du60Var.c;
        this.e = du60Var.d;
        this.f = bpn0Var;
        this.g = lazy;
        this.h = bpn0Var4;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new os30(bpn0Var3, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NewsfeedRouter a() {
        return ((NewsFeedComponent) this.d.getValue()).l0();
    }
}
