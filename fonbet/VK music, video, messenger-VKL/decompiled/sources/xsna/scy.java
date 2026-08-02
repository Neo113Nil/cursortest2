package xsna;

import xsna.qcy;

/* compiled from: KProperty.kt */
/* loaded from: classes11.dex */
public interface scy<T, V> extends qcy<V>, izs<T, V> {

    /* compiled from: KProperty.kt */
    /* loaded from: classes8.dex */
    public interface a<T, V> extends qcy.a<V>, izs<T, V> {
    }

    V get(T t);

    Object getDelegate(T t);

    /* renamed from: getGetter */
    a<T, V> mo289getGetter();
}
