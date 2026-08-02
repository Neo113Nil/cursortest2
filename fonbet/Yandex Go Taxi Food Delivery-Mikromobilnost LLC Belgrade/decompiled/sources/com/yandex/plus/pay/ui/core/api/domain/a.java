package com.yandex.plus.pay.ui.core.api.domain;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.plus.log.api.LogPriority;
import defpackage.evu0;
import defpackage.j73;
import defpackage.jse;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.tje;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes2.dex */
public final class a {
    public static final Set d = j73.f0(new String[]{"http", Constants.SCHEME});
    public final com.yandex.plus.domain.auth.impl.a a;
    public final jse b;
    public final mdd0 c;

    public a(com.yandex.plus.domain.auth.impl.a aVar, jse jseVar, mdd0 mdd0Var) {
        this.a = aVar;
        this.b = jseVar;
        this.c = mdd0Var;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        mdd0 mdd0Var = this.c;
        if (scheme == null || !kotlin.collections.a.G(d, parse.getScheme())) {
            LogPriority logPriority = LogPriority.WARNING;
            mdd0Var.getClass();
            ((ndd0) mdd0Var).a(logPriority, "PlusPayGetAuthorizedUrlInteractorImpl", "Invalid scheme for url = \"" + str + OpenList.CHAR_QUOTE);
            return str;
        }
        String host = parse.getHost();
        if (host == null || host.length() == 0) {
            LogPriority logPriority2 = LogPriority.WARNING;
            mdd0Var.getClass();
            ((ndd0) mdd0Var).a(logPriority2, "PlusPayGetAuthorizedUrlInteractorImpl", "Failed to get host for url = \"" + str + OpenList.CHAR_QUOTE);
            return str;
        }
        String host2 = parse.getHost();
        List Y = host2 != null ? evu0.Y(host2, new char[]{'.'}, 0, 6) : null;
        String str2 = Y != null ? (String) kotlin.collections.a.b0(Y) : null;
        if (str2 != null) {
            return tje.k0(this.b, new PlusPayGetAuthorizedUrlInteractorImpl$getAuthorizedUrl$5(this, parse, str2, str, null), continuationImpl);
        }
        LogPriority logPriority3 = LogPriority.WARNING;
        mdd0Var.getClass();
        ((ndd0) mdd0Var).a(logPriority3, "PlusPayGetAuthorizedUrlInteractorImpl", "Failed to get TLD for url = \"" + str + OpenList.CHAR_QUOTE);
        return str;
    }
}
