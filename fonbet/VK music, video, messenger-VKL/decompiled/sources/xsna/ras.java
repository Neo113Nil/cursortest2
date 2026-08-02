package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* compiled from: FragmentExt.kt */
/* loaded from: classes18.dex */
public final class ras implements i7f0 {
    public final Object b;
    public final Object c;
    public Object d;

    public ras(String str, Serializable serializable) {
        this.c = str;
        this.b = serializable;
    }

    public Object a(Fragment fragment) {
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        Bundle arguments = fragment.getArguments();
        Object obj2 = arguments != null ? arguments.get((String) this.c) : null;
        Object obj3 = obj2 != null ? obj2 : null;
        if (obj3 == null && (obj3 = this.b) == null) {
            throw new IllegalStateException("Default property must be not null");
        }
        this.d = obj3;
        return obj3;
    }

    public boolean b() {
        if (((mtk0) this.c).getValue() != this.b) {
            return true;
        }
        ras rasVar = (ras) this.d;
        return rasVar != null && rasVar.b();
    }

    @Override // xsna.i7f0
    public /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
        return a((Fragment) obj);
    }

    public ras(mtk0 mtk0Var, ras rasVar) {
        this.c = mtk0Var;
        this.d = rasVar;
        this.b = mtk0Var.getValue();
    }
}
