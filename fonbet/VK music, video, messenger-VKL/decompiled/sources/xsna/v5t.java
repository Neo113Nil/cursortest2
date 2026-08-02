package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: GalvitaFlexLayoutStrategyProvider.kt */
/* loaded from: classes4.dex */
public final class v5t implements ppr {
    public final int b;
    public Object c;

    public v5t() {
        this.c = new t5t();
        this.b = 10;
    }

    @Override // xsna.ppr
    public int a() {
        return this.b;
    }

    @Override // xsna.ppr
    public npr b(int i) {
        t5t t5tVar = (t5t) this.c;
        int i2 = this.b;
        if (i > i2) {
            i = i2;
        }
        t5tVar.e = i;
        return t5tVar;
    }

    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (((View) this.c) == null) {
            this.c = layoutInflater.inflate(this.b, viewGroup, false);
        }
        View view = (View) this.c;
        if (view != null) {
            return view;
        }
        return null;
    }

    public v5t(int i) {
        this.b = i;
    }
}
