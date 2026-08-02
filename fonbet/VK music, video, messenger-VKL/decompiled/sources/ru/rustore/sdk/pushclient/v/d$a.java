package ru.rustore.sdk.pushclient.v;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.bpy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController", f = "NotificationController.kt", l = {64}, m = "downloadImage")
/* loaded from: classes9.dex */
public final class d$a extends ContinuationImpl {
    public bpy0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bpy0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d$a(bpy0 bpy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = bpy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
