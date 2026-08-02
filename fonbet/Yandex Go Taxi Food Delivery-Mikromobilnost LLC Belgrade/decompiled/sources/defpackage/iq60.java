package defpackage;

/* loaded from: classes9.dex */
public abstract class iq60 implements xbi0 {
    private Object value;

    public iq60(Object obj) {
        this.value = obj;
    }

    public abstract void afterChange(kgx kgxVar, Object obj, Object obj2);

    public boolean beforeChange(kgx kgxVar, Object obj, Object obj2) {
        return true;
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return this.value;
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        Object obj3 = this.value;
        if (beforeChange(kgxVar, obj3, obj2)) {
            this.value = obj2;
            afterChange(kgxVar, obj3, obj2);
        }
    }

    public String toString() {
        return qv10.r(new StringBuilder("ObservableProperty(value="), this.value, ')');
    }
}
