package com.yandex.passport.data.exceptions;

import com.yandex.passport.common.exception.InvalidTokenException;
import defpackage.j73;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes15.dex */
public abstract class a {
    public static final Set a = j73.f0(new String[]{"oauth_token.invalid", "yandex_token.invalid", "blackbox.expired_token", "x_wrong_location", "invalid_grant"});

    public static final void a(List list) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (a.contains((String) it.next())) {
                    throw new InvalidTokenException();
                }
            }
        }
        throw new EbsBackendErrorsException(list);
    }
}
