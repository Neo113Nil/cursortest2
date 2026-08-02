package xsna;

import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: LongPollHistoryReporter.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class i400 extends PropertyReference1Impl {
    public static final i400 b = new i400(LongPollHistoryReporter.Span.class, "value", "getValue()Ljava/lang/String;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return ((LongPollHistoryReporter.Span) obj).h();
    }
}
