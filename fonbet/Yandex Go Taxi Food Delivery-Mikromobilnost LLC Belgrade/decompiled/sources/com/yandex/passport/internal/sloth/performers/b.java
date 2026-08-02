package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.internal.sloth.SlothEulaSupport$TextKey;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class b implements s {
    public final com.yandex.passport.internal.sloth.k a;

    public b(com.yandex.passport.internal.sloth.k kVar) {
        this.a = kVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        Iterable iterable;
        SlothEulaSupport$TextKey.Companion.getClass();
        iterable = SlothEulaSupport$TextKey.allValues;
        List list = ((com.yandex.passport.sloth.command.data.o) obj).a;
        if (list != null) {
            iterable = kotlin.collections.a.U(list, iterable);
        }
        return new iqn(com.yandex.passport.internal.ui.sloth.e.a(new f(1, iterable, this)));
    }
}
