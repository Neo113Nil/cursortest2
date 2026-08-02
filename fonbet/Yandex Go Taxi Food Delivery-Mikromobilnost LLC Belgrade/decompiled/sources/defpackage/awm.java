package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lawm;", "Lxn11;", "Lc6z;", "Companion", "zvm", "yvm", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class awm implements xn11, c6z {
    public static final zvm Companion = new zvm();
    public static final i3y[] d;
    public static final awm e;
    public final Map b;
    public final Map c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new ktm(7)), a.b(lazyThreadSafetyMode, new ktm(8))};
        e = new awm(0);
    }

    public /* synthetic */ awm(int i, Map map, Map map2) {
        this.b = (i & 1) == 0 ? b.f() : map;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    public awm() {
        this(0);
    }

    public awm(int i) {
        Map f = b.f();
        Map f2 = b.f();
        this.b = f;
        this.c = f2;
    }
}
