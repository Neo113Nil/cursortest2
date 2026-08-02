package androidx.camera.camera2.internal;

import defpackage.jyq0;
import defpackage.lru0;
import defpackage.xi21;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ l a;
    public final /* synthetic */ String b;
    public final /* synthetic */ jyq0 c;
    public final /* synthetic */ xi21 w;
    public final /* synthetic */ lru0 x;
    public final /* synthetic */ List y;

    public /* synthetic */ d(l lVar, String str, jyq0 jyq0Var, xi21 xi21Var, lru0 lru0Var, List list) {
        this.a = lVar;
        this.b = str;
        this.c = jyq0Var;
        this.w = xi21Var;
        this.x = lru0Var;
        this.y = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.a;
        String str = this.b;
        jyq0 jyq0Var = this.c;
        xi21 xi21Var = this.w;
        lru0 lru0Var = this.x;
        List list = this.y;
        lVar.w("Use case " + str + " RESET");
        lVar.a.f(str, jyq0Var, xi21Var, lru0Var, list);
        lVar.s();
        lVar.F();
        lVar.M();
        if (lVar.x == Camera2CameraImpl$InternalState.OPENED) {
            lVar.E();
        }
    }
}
