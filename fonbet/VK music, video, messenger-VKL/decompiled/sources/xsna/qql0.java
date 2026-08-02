package xsna;

import android.content.IntentFilter;
import com.vk.newsfeed.impl.controllers.stories.StoriesBlockController$receiver$1;
import kotlin.Lazy;

/* compiled from: StoriesBlockController.kt */
/* loaded from: classes4.dex */
public final class qql0 {
    public final p870 a;
    public final Object b;
    public final Object c;
    public final Object d;
    public erl0 e;
    public final bpn0 f;
    public final lql0 g;
    public final mql0 h;
    public final nql0 i;
    public final oql0 j;
    public final IntentFilter k;
    public final StoriesBlockController$receiver$1 l;

    public qql0() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [xsna.oql0] */
    public qql0(f5z f5zVar, p870 p870Var, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = p870Var;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        f5zVar.getLifecycle().addObserver(new pql0(this));
        this.f = new bpn0(new orj0(this, 3));
        int i = 0;
        this.g = new lql0(this, i);
        this.h = new mql0(this, i);
        this.i = new nql0(this, i);
        this.j = new bd70() { // from class: xsna.oql0
            @Override // xsna.bd70
            public final void x0(int i2, int i3, Object obj) {
                qql0.this.getClass();
            }
        };
        this.k = z23.a("com.vkontakte.android.ACTION_PROFILE_UPDATED");
        this.l = new StoriesBlockController$receiver$1();
    }
}
