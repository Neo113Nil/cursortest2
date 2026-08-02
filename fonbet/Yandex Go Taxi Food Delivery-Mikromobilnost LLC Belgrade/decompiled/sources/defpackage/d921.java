package defpackage;

import androidx.datastore.core.f;

/* loaded from: classes.dex */
public final class d921 implements dse {
    public final d921 a;
    public final f b;

    public d921(d921 d921Var, f fVar) {
        this.a = d921Var;
        this.b = fVar;
    }

    public final void b(f fVar) {
        if (this.b == fVar) {
            ny61.r("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        d921 d921Var = this.a;
        if (d921Var != null) {
            d921Var.b(fVar);
        }
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final /* bridge */ dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return x4c.V;
    }

    @Override // defpackage.fse
    public final /* bridge */ fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }
}
