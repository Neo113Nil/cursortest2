package ru.rustore.sdk.pushclient.v;

import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import com.vk.push.common.messaging.NotificationPayload;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.bpy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController", f = "NotificationController.kt", l = {39}, m = "showNotification")
/* loaded from: classes9.dex */
public final class d$c extends ContinuationImpl {
    public bpy0 a;
    public NotificationPayload b;
    public Pair c;
    public NotificationAnalyticsPayload d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bpy0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d$c(bpy0 bpy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = bpy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, 0, null, null, this);
    }
}
