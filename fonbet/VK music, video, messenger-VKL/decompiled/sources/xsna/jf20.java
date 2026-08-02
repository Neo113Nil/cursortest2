package xsna;

import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.reporters.api.msg.MessagesHistoryMergeReporter;

/* compiled from: MessagesHistoryMergeReporterImpl.kt */
/* loaded from: classes5.dex */
public final class jf20 extends wn6<MessagesHistoryMergeReporter.Span, MessagesHistoryMergeReporter.MeasuringPoint> implements MessagesHistoryMergeReporter {
    public final ReporterType i;
    public final int j;

    /* compiled from: MessagesHistoryMergeReporterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MessagesHistoryMergeReporter.Span.values().length];
            try {
                iArr[MessagesHistoryMergeReporter.Span.ROOT.ordinal()] = 1;
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

    public jf20(String str, ReporterType reporterType, int i) {
        super(str);
        this.i = reporterType;
        this.j = i;
    }

    @Override // xsna.wn6
    public final void t(mdz<MessagesHistoryMergeReporter.Span> mdzVar, Object obj) {
        if (a.$EnumSwitchMapping$0[mdzVar.b.ordinal()] == 1) {
            v(new uk(14, this, mdzVar));
        }
    }
}
