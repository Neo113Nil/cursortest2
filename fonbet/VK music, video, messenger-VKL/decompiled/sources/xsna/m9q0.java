package xsna;

import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.d;

/* compiled from: DataStoreImpl.kt */
/* loaded from: classes.dex */
public final class m9q0 implements d.b {
    public final m9q0 b;
    public final DataStoreImpl<?> c;

    public m9q0(m9q0 m9q0Var, DataStoreImpl<?> dataStoreImpl) {
        this.b = m9q0Var;
        this.c = dataStoreImpl;
    }

    public final void a(DataStoreImpl dataStoreImpl) {
        if (this.c == dataStoreImpl) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        m9q0 m9q0Var = this.b;
        if (m9q0Var != null) {
            m9q0Var.a(dataStoreImpl);
        }
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<?> getKey() {
        return l9q0.b;
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }
}
