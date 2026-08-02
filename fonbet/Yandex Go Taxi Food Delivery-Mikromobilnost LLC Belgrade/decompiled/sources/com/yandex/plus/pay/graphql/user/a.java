package com.yandex.plus.pay.graphql.user;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.type.USER_SYNC_STATUS;
import com.yandex.plus.pay.repository.api.model.sync.UserSyncStatus;
import defpackage.c0u;
import defpackage.hu21;
import defpackage.ju21;
import defpackage.ny61;
import defpackage.qo2;
import defpackage.rya1;
import defpackage.skd0;
import defpackage.vo2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final qo2 a;

    public a(qo2 qo2Var) {
        this.a = qo2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        GraphQLUserSyncStatusRepository$getUserSyncStatus$1 graphQLUserSyncStatusRepository$getUserSyncStatus$1;
        int i;
        int i2;
        if (continuationImpl instanceof GraphQLUserSyncStatusRepository$getUserSyncStatus$1) {
            graphQLUserSyncStatusRepository$getUserSyncStatus$1 = (GraphQLUserSyncStatusRepository$getUserSyncStatus$1) continuationImpl;
            int i3 = graphQLUserSyncStatusRepository$getUserSyncStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                graphQLUserSyncStatusRepository$getUserSyncStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = graphQLUserSyncStatusRepository$getUserSyncStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLUserSyncStatusRepository$getUserSyncStatus$1.label;
                if (i != 0) {
                    b.b(obj);
                    skd0.b(PlusLogTag.SDK, "userSyncStatus()");
                    ju21 ju21Var = new ju21();
                    graphQLUserSyncStatusRepository$getUserSyncStatus$1.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.d(this.a, ju21Var, graphQLUserSyncStatusRepository$getUserSyncStatus$1);
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
                skd0.g(PlusLogTag.SDK, "userSyncStatus() response=" + vo2Var);
                hu21 hu21Var = (hu21) vo2Var.c;
                USER_SYNC_STATUS user_sync_status = hu21Var == null ? hu21Var.a.a : null;
                i2 = user_sync_status != null ? -1 : c0u.a[user_sync_status.ordinal()];
                if (i2 != 1) {
                    return UserSyncStatus.SYNC_IN_PROGRESS;
                }
                if (i2 != 2) {
                    return null;
                }
                return UserSyncStatus.SYNCED;
            }
        }
        graphQLUserSyncStatusRepository$getUserSyncStatus$1 = new GraphQLUserSyncStatusRepository$getUserSyncStatus$1(this, continuationImpl);
        Object obj2 = graphQLUserSyncStatusRepository$getUserSyncStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLUserSyncStatusRepository$getUserSyncStatus$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.g(PlusLogTag.SDK, "userSyncStatus() response=" + vo2Var2);
        hu21 hu21Var2 = (hu21) vo2Var2.c;
        if (hu21Var2 == null) {
        }
        if (user_sync_status != null) {
        }
        if (i2 != 1) {
        }
    }
}
