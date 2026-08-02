package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.b330;
import xsna.buk;
import xsna.r7l;

/* compiled from: SourceGenerator.java */
/* loaded from: classes12.dex */
public final class jgk0 implements buk.a<Object> {
    public final /* synthetic */ b330.a b;
    public final /* synthetic */ kgk0 c;

    public jgk0(kgk0 kgk0Var, b330.a aVar) {
        this.c = kgk0Var;
        this.b = aVar;
    }

    @Override // xsna.buk.a
    public final void c(@Nullable Object obj) {
        kgk0 kgk0Var = this.c;
        b330.a<?> aVar = this.b;
        b330.a<?> aVar2 = kgk0Var.g;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        kgk0 kgk0Var2 = this.c;
        b330.a aVar3 = this.b;
        bbn bbnVar = kgk0Var2.b.p;
        if (obj != null && bbnVar.c(aVar3.c.e())) {
            kgk0Var2.f = obj;
            kgk0Var2.c.n(r7l.f.SWITCH_TO_SOURCE_SERVICE);
        } else {
            r7l r7lVar = kgk0Var2.c;
            ady adyVar = aVar3.a;
            buk<Data> bukVar = aVar3.c;
            r7lVar.c(adyVar, obj, bukVar, bukVar.e(), kgk0Var2.h);
        }
    }

    @Override // xsna.buk.a
    public final void f(@NonNull Exception exc) {
        kgk0 kgk0Var = this.c;
        b330.a<?> aVar = this.b;
        b330.a<?> aVar2 = kgk0Var.g;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        kgk0 kgk0Var2 = this.c;
        b330.a aVar3 = this.b;
        r7l r7lVar = kgk0Var2.c;
        ady adyVar = kgk0Var2.h;
        buk<Data> bukVar = aVar3.c;
        r7lVar.b(adyVar, exc, bukVar, bukVar.e());
    }
}
