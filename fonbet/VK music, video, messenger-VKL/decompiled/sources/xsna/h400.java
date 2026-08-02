package xsna;

import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LongPollHistoryReporter.kt */
/* loaded from: classes5.dex */
public final class h400 extends wn6<LongPollHistoryReporter.Span, Object> implements LongPollHistoryReporter {
    public static final AtomicBoolean j = new AtomicBoolean(true);
    public static final AtomicBoolean k = new AtomicBoolean(true);
    public final ReporterType i;

    /* compiled from: LongPollHistoryReporter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LongPollHistoryReporter.Span.values().length];
            try {
                iArr[LongPollHistoryReporter.Span.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReporterType.values().length];
            try {
                iArr2[ReporterType.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ReporterType.GROUP_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ReporterType.CHANNEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public h400(String str, ReporterType reporterType) {
        super(str);
        this.i = reporterType;
    }

    @Override // xsna.wn6
    public final void t(mdz<LongPollHistoryReporter.Span> mdzVar, Object obj) {
        if (a.$EnumSwitchMapping$0[mdzVar.b.ordinal()] == 1) {
            v(new com.vk.movika.tools.controls.seekbar.g(12, this, mdzVar));
        }
    }
}
