package com.yandex.go.chargers.order.completion.pre_finish.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wu9;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersFinishProgressResponse;", "", "Companion", "ProgressState", "$serializer", "com/yandex/go/chargers/order/completion/pre_finish/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFinishProgressResponse {
    public static final b Companion = new b();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(23)), null};
    public final ProgressState a;
    public final FormattedText b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersFinishProgressResponse$ProgressState;", "", "Companion", "com/yandex/go/chargers/order/completion/pre_finish/data/model/c", "RUNNING", TlsConstants.TLS_FINISHED, "FAILED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ProgressState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ProgressState[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final ProgressState FAILED;
        public static final ProgressState FINISHED;
        public static final ProgressState RUNNING;

        static {
            ProgressState progressState = new ProgressState("RUNNING", 0);
            RUNNING = progressState;
            ProgressState progressState2 = new ProgressState(TlsConstants.TLS_FINISHED, 1);
            FINISHED = progressState2;
            ProgressState progressState3 = new ProgressState("FAILED", 2);
            FAILED = progressState3;
            ProgressState[] progressStateArr = {progressState, progressState2, progressState3};
            $VALUES = progressStateArr;
            $ENTRIES = kotlin.enums.a.a(progressStateArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(24));
        }

        public static ProgressState valueOf(String str) {
            return (ProgressState) Enum.valueOf(ProgressState.class, str);
        }

        public static ProgressState[] values() {
            return (ProgressState[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChargersFinishProgressResponse(int i, ProgressState progressState, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = progressState;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
    }

    public ChargersFinishProgressResponse() {
        this.a = null;
        this.b = null;
    }
}
