package defpackage;

import com.yandex.go.places.impl.domain.interactors.a;

/* loaded from: classes13.dex */
public abstract class j15 implements dw {
    public final a a;

    public j15(a aVar) {
        this.a = aVar;
    }

    public abstract fr a(kr krVar);

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        fr a = a(krVar);
        if (a == null) {
            return;
        }
        this.a.a(a, null);
    }
}
