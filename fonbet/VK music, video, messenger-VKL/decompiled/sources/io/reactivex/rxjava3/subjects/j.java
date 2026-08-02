package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.v;

/* compiled from: Subject.java */
/* loaded from: classes11.dex */
public abstract class j<T> extends q<T> implements v<T> {
    public final h M0() {
        return this instanceof h ? (h) this : new h(this);
    }
}
