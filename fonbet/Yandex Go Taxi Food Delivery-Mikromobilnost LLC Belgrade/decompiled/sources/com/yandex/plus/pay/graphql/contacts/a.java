package com.yandex.plus.pay.graphql.contacts;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import defpackage.b64;
import defpackage.jbc;
import defpackage.kbc;
import defpackage.lbc;
import defpackage.mbc;
import defpackage.nbc;
import defpackage.ny61;
import defpackage.p5z;
import defpackage.qbc;
import defpackage.qo2;
import defpackage.rya1;
import defpackage.skd0;
import defpackage.vo2;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final qo2 a;
    public final p5z b;
    public final String c;
    public final jbc d = new jbc();

    public a(qo2 qo2Var, p5z p5zVar, String str) {
        this.a = qo2Var;
        this.b = p5zVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kbc kbcVar, ContinuationImpl continuationImpl) {
        GraphQLWebCollectContactsRepository$getCollectContactsWebUrl$1 graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1;
        int i;
        mbc mbcVar;
        if (continuationImpl instanceof GraphQLWebCollectContactsRepository$getCollectContactsWebUrl$1) {
            graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1 = (GraphQLWebCollectContactsRepository$getCollectContactsWebUrl$1) continuationImpl;
            int i2 = graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    String upperCase = this.b.getLocale().getLanguage().toUpperCase(Locale.ROOT);
                    PlusLogTag plusLogTag = PlusLogTag.SDK;
                    String str = this.c;
                    StringBuilder v = b64.v("getCollectContactsWebUrl() language=", upperCase, ", service=", str, ", params=");
                    v.append(kbcVar);
                    skd0.b(plusLogTag, v.toString());
                    nbc nbcVar = new nbc(upperCase, str, kbcVar.a.getRawName());
                    graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.L$0 = null;
                    graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.L$1 = null;
                    graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.d(this.a, nbcVar, graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                vo2 vo2Var = (vo2) obj;
                rya1.b(vo2Var);
                skd0.g(PlusLogTag.SDK, "getCollectContactsWebUrl() response=" + vo2Var);
                mbcVar = (mbc) vo2Var.c;
                if (mbcVar != null) {
                    throw new GraphQLParseException("collectUserContacts response data is null", null);
                }
                this.d.getClass();
                lbc lbcVar = mbcVar.a;
                return new qbc(lbcVar.a, lbcVar.b, lbcVar.c);
            }
        }
        graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1 = new GraphQLWebCollectContactsRepository$getCollectContactsWebUrl$1(this, continuationImpl);
        Object obj2 = graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLWebCollectContactsRepository$getCollectContactsWebUrl$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.g(PlusLogTag.SDK, "getCollectContactsWebUrl() response=" + vo2Var2);
        mbcVar = (mbc) vo2Var2.c;
        if (mbcVar != null) {
        }
    }
}
