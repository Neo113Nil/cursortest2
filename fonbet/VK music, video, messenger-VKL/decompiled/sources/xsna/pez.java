package xsna;

import androidx.annotation.NonNull;
import com.ironsource.X3;
import java.util.List;
import xsna.ub9;

/* compiled from: ListFuture.java */
/* loaded from: classes11.dex */
public final class pez implements ub9.c<List<Object>> {
    public final /* synthetic */ sez b;

    public pez(sez sezVar) {
        this.b = sezVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ub9.c
    public final Object attachCompleter(@NonNull ub9.a<List<Object>> aVar) {
        sez sezVar = this.b;
        obr.f("The result can only set once!", sezVar.g == null);
        sezVar.g = aVar;
        return "ListFuture[" + this + X3.j.e;
    }
}
