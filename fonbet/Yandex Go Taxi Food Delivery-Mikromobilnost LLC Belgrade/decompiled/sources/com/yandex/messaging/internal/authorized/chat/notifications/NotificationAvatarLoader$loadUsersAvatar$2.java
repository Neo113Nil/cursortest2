package com.yandex.messaging.internal.authorized.chat.notifications;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.notifications.NotificationAvatarLoader$loadUsersAvatar$2", f = "NotificationAvatarLoader.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationAvatarLoader$loadUsersAvatar$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $guids;
    final /* synthetic */ Map<String, Bitmap> $result;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationAvatarLoader$loadUsersAvatar$2(List list, Map map, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$guids = list;
        this.$result = map;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationAvatarLoader$loadUsersAvatar$2(this.$guids, this.$result, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationAvatarLoader$loadUsersAvatar$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005f -> B:5:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Iterator it;
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List I = kotlin.collections.a.I(this.$guids);
            map = this.$result;
            c cVar2 = this.this$0;
            it = I.iterator();
            cVar = cVar2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$4;
            String str = (String) this.L$3;
            it = (Iterator) this.L$2;
            cVar = (c) this.L$1;
            Map map2 = (Map) this.L$0;
            kotlin.b.b(obj);
            map.put(str, obj);
            map = map2;
            if (it.hasNext()) {
                str = (String) it.next();
                this.L$0 = map;
                this.L$1 = cVar;
                this.L$2 = it;
                this.L$3 = str;
                this.L$4 = map;
                this.label = 1;
                obj = cVar.d(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                map2 = map;
                map.put(str, obj);
                map = map2;
                if (it.hasNext()) {
                    return zy11.a;
                }
            }
        }
    }
}
