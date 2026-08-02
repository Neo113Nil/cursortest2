package ru.rustore.sdk.pushclient.a;

import com.vk.push.common.AppInfo;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

@b6l(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk", f = "VkpnsClientSdk.kt", l = {151, 153, 157, 159}, m = "onUpdate")
/* loaded from: classes9.dex */
public final class m extends ContinuationImpl {
    public h a;
    public AppInfo b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return h.b(this.d, this);
    }
}
