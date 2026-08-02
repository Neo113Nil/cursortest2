package com.yandex.div.evaluable.function;

import defpackage.cxq0;
import defpackage.jb7;
import defpackage.jdo;
import defpackage.sls;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class n extends com.yandex.div.evaluable.c {
    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        jb7 jb7Var = (jb7) cxq0Var.c;
        String str = (String) list.get(0);
        GetStoredValue$evaluate$fallback$1 getStoredValue$evaluate$fallback$1 = new GetStoredValue$evaluate$fallback$1(this, list);
        return l() ? j(jb7Var.h(str, (String) list.get(1)), getStoredValue$evaluate$fallback$1) : j(jb7Var.h(str, "global"), getStoredValue$evaluate$fallback$1);
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }

    public Object j(Object obj, sls slsVar) {
        if (obj == null) {
            obj = null;
        }
        return obj == null ? ((GetStoredValue$evaluate$fallback$1) slsVar).invoke() : obj;
    }

    public Object k(List list) {
        return list.get(l() ? 2 : 1);
    }

    public boolean l() {
        return false;
    }
}
