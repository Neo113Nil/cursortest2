package ru.rustore.sdk.pushclient.messaging.service;

import com.vk.push.common.Logger;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class b extends Lambda implements gzs<s3q0> {
    final /* synthetic */ RuStoreMessagingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RuStoreMessagingService ruStoreMessagingService) {
        super(0);
        this.this$0 = ruStoreMessagingService;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        RuStoreMessagingService ruStoreMessagingService = this.this$0;
        int i = RuStoreMessagingService.k;
        Logger.DefaultImpls.info$default(ruStoreMessagingService.a(), "Stop service immediately", null, 2, null);
        ruStoreMessagingService.stopSelf(ruStoreMessagingService.h);
        return s3q0.a;
    }
}
