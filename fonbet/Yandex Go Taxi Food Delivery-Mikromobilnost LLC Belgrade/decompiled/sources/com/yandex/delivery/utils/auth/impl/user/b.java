package com.yandex.delivery.utils.auth.impl.user;

import android.content.Context;
import defpackage.dxf0;
import defpackage.en21;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.of11;
import defpackage.rle0;
import defpackage.tpg;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes11.dex */
public final class b {
    public static final en21 c = new en21();
    public static final rle0 d = jl40.I("delivery-user-id", new dxf0(new of11(26)), null, null, 12);
    public final Context a;
    public final kme0 b = new kme0("user_id");

    public b(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserIdPersistentDataStore$getUserId$1 userIdPersistentDataStore$getUserId$1;
        int i;
        if (continuationImpl instanceof UserIdPersistentDataStore$getUserId$1) {
            userIdPersistentDataStore$getUserId$1 = (UserIdPersistentDataStore$getUserId$1) continuationImpl;
            int i2 = userIdPersistentDataStore$getUserId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userIdPersistentDataStore$getUserId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userIdPersistentDataStore$getUserId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userIdPersistentDataStore$getUserId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c.getClass();
                    tpr data = ((tpg) d.getValue(this.a, en21.a[0])).getData();
                    userIdPersistentDataStore$getUserId$1.label = 1;
                    obj = e.y(data, userIdPersistentDataStore$getUserId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((mme0) obj).c(this.b);
            }
        }
        userIdPersistentDataStore$getUserId$1 = new UserIdPersistentDataStore$getUserId$1(this, continuationImpl);
        Object obj2 = userIdPersistentDataStore$getUserId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userIdPersistentDataStore$getUserId$1.label;
        if (i != 0) {
        }
        return ((mme0) obj2).c(this.b);
    }
}
