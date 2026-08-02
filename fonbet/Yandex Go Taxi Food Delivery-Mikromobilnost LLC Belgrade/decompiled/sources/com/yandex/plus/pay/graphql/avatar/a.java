package com.yandex.plus.pay.graphql.avatar;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import defpackage.ak21;
import defpackage.fk21;
import defpackage.fnh;
import defpackage.gk21;
import defpackage.hk21;
import defpackage.ny61;
import defpackage.pg21;
import defpackage.qo2;
import defpackage.rya1;
import defpackage.skd0;
import defpackage.vo2;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final qo2 a;
    public final pg21 b;

    public a(qo2 qo2Var, fnh fnhVar) {
        this.a = qo2Var;
        this.b = new pg21(fnhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GraphQLUserAvatarRepository$getUserAvatarInfo$1 graphQLUserAvatarRepository$getUserAvatarInfo$1;
        int i;
        fk21 fk21Var;
        Object failure;
        if (continuationImpl instanceof GraphQLUserAvatarRepository$getUserAvatarInfo$1) {
            graphQLUserAvatarRepository$getUserAvatarInfo$1 = (GraphQLUserAvatarRepository$getUserAvatarInfo$1) continuationImpl;
            int i2 = graphQLUserAvatarRepository$getUserAvatarInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLUserAvatarRepository$getUserAvatarInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLUserAvatarRepository$getUserAvatarInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLUserAvatarRepository$getUserAvatarInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    skd0.b(PlusLogTag.SDK, "getUserAvatarInfo() puid=" + str);
                    hk21 hk21Var = new hk21(str);
                    graphQLUserAvatarRepository$getUserAvatarInfo$1.L$0 = null;
                    graphQLUserAvatarRepository$getUserAvatarInfo$1.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.d(this.a, hk21Var, graphQLUserAvatarRepository$getUserAvatarInfo$1);
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
                skd0.b(PlusLogTag.SDK, "getUserAvatarInfo() response=" + vo2Var);
                fk21Var = (fk21) vo2Var.c;
                if (fk21Var != null) {
                    throw new GraphQLParseException("user avatar response data is null", null);
                }
                pg21 pg21Var = this.b;
                gk21 gk21Var = fk21Var.a;
                if (gk21Var == null) {
                    throw new GraphQLParseException("user is null", null);
                }
                try {
                    failure = new ak21(pg21Var.a.getUrl() + gk21Var.b.b.b + "/islands-150");
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a == null) {
                    return (ak21) failure;
                }
                throw new GraphQLParseException(null, a);
            }
        }
        graphQLUserAvatarRepository$getUserAvatarInfo$1 = new GraphQLUserAvatarRepository$getUserAvatarInfo$1(this, continuationImpl);
        Object obj2 = graphQLUserAvatarRepository$getUserAvatarInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLUserAvatarRepository$getUserAvatarInfo$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.b(PlusLogTag.SDK, "getUserAvatarInfo() response=" + vo2Var2);
        fk21Var = (fk21) vo2Var2.c;
        if (fk21Var != null) {
        }
    }
}
