package xsna;

import java.util.ArrayList;

/* compiled from: LazyObservableProperty.kt */
/* loaded from: classes17.dex */
public final class fwy implements p7f0 {
    public static final Object f = new Object();
    public final /* synthetic */ int b;
    public final Object c;
    public final Object d;
    public Object e;

    public fwy(String str, String str2) {
        this.b = 1;
        this.d = str;
        this.c = str2;
        this.e = new ArrayList();
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        if (epx.f(this.e, f)) {
            this.e = ((gzs) this.c).invoke();
        }
        return this.e;
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        Object obj3 = epx.f(this.e, f) ? null : this.e;
        Object obj4 = obj3 != null ? obj3 : null;
        if (Boolean.TRUE.booleanValue()) {
            this.e = obj2;
            ((wzs) this.d).invoke(obj4, obj2);
        }
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return k73.c(new StringBuilder("LazyObservableProperty(value="), this.e, ')');
            default:
                return super.toString();
        }
    }

    public fwy(gzs gzsVar, nhi nhiVar, wzs wzsVar) {
        this.b = 0;
        this.c = gzsVar;
        this.d = wzsVar;
        this.e = f;
    }
}
