package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;

/* loaded from: classes11.dex */
public final class bpi0 extends api0 {
    public final fp60 b;

    public bpi0(fp60 fp60Var, cpi0 cpi0Var) {
        super(cpi0Var);
        this.b = fp60Var;
    }

    @Override // defpackage.api0
    public final Object a() {
        return this.b.i();
    }

    @Override // defpackage.api0
    public final Object b(Object obj) {
        return obj;
    }

    @Override // defpackage.api0
    public final void c(Object obj, wdx wdxVar, zoi0 zoi0Var) {
        Field field = zoi0Var.b;
        Object read = zoi0Var.g.read(wdxVar);
        if (read == null && zoi0Var.h) {
            return;
        }
        if (zoi0Var.d) {
            epi0.a(obj, field);
        } else if (zoi0Var.i) {
            throw new JsonIOException("Cannot set value of 'static final' ".concat(xoi0.d(field, false)));
        }
        field.set(obj, read);
    }
}
