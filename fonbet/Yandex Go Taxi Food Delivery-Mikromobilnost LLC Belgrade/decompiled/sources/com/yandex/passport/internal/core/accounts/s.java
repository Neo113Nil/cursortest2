package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;
import java.util.Comparator;

/* loaded from: classes15.dex */
public final class s implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return jl40.r(((ModernAccount) obj).getUserInfo().m263getRetrievalTimeR7zlAxo(), ((ModernAccount) obj2).getUserInfo().m263getRetrievalTimeR7zlAxo());
    }
}
