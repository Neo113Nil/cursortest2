package ru.rustore.sdk.pushclient.a;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.push.common.analytics.AnalyticsSender;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

@b6l(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk", f = "VkpnsClientSdk.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "sendInitAnalyticsEvent")
/* loaded from: classes9.dex */
public final class p extends ContinuationImpl {
    public h a;
    public AnalyticsSender b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return h.c(this.d, this);
    }
}
