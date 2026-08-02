package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes9.dex */
public abstract class jse extends d7 implements dse {
    public static final ise a = new ise(x4c.K, new qu(18));

    public jse() {
        super(x4c.K);
    }

    public void B(fse fseVar, Runnable runnable) {
        bvf0.Q(fseVar, this, runnable);
    }

    public boolean G(fse fseVar) {
        return !(this instanceof qx11);
    }

    public jse P(int i) {
        cma1.n(i);
        return new sfy(this, i);
    }

    @Override // defpackage.d7, defpackage.fse
    public final dse get(ese eseVar) {
        dse dseVar;
        if (eseVar instanceof ise) {
            ise iseVar = (ise) eseVar;
            ese key = getKey();
            if ((key == iseVar || iseVar.b == key) && (dseVar = (dse) iseVar.a.invoke(this)) != null) {
                return dseVar;
            }
        } else if (x4c.K == eseVar) {
            return this;
        }
        return null;
    }

    @Override // defpackage.d7, defpackage.fse
    public final fse minusKey(ese eseVar) {
        if (eseVar instanceof ise) {
            ise iseVar = (ise) eseVar;
            ese key = getKey();
            if ((key != iseVar && iseVar.b != key) || ((dse) iseVar.a.invoke(this)) == null) {
                return this;
            }
        } else if (x4c.K != eseVar) {
            return this;
        }
        return EmptyCoroutineContext.a;
    }

    public abstract void o(fse fseVar, Runnable runnable);

    public String toString() {
        return getClass().getSimpleName() + '@' + wwg.s(this);
    }
}
