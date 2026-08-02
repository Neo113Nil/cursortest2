package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;

/* loaded from: classes13.dex */
public final class ebn0 implements cwn0 {
    public final c a;
    public final a3v b;

    public ebn0(c cVar, a3v a3vVar) {
        this.a = cVar;
        this.b = a3vVar;
    }

    @Override // defpackage.cwn0
    public final void b() {
        this.a.i(Screen.SCOOTERS);
        this.b.b8(this);
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        this.b.a0(this);
        c cVar = this.a;
        cVar.i(cVar.d());
    }
}
