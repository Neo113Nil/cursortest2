package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.d6z;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z extends com.yandex.passport.common.domain.a {
    public final DatabaseHelper b;

    public z(com.yandex.passport.common.coroutine.a aVar, DatabaseHelper databaseHelper) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = databaseHelper;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        Object obj2;
        y yVar = (y) obj;
        if (yVar.c.getSupportedAccountTypes().contains(PassportAccountType.CHILDISH)) {
            List<com.yandex.passport.internal.database.c> children = this.b.getChildren(yVar.a);
            ArrayList arrayList = new ArrayList(tcc.n(children, 10));
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                arrayList.add(new Uid(yVar.b, ((com.yandex.passport.internal.database.c) it.next()).a));
            }
            obj2 = d6z.d(arrayList);
        } else {
            obj2 = EmptyList.a;
        }
        return new Result(obj2);
    }
}
