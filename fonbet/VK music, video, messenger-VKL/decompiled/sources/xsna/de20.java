package xsna;

import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.reporters.api.msg.MessagesEmptyHistoryMergeReporter;

/* compiled from: MessagesEmptyHistoryMergeReporterImpl.kt */
/* loaded from: classes5.dex */
public final class de20 extends wn6<MessagesEmptyHistoryMergeReporter.Span, MessagesEmptyHistoryMergeReporter.MeasuringPoint> implements MessagesEmptyHistoryMergeReporter {
    public final ReporterType i;
    public final boolean j;

    /* compiled from: MessagesEmptyHistoryMergeReporterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MessagesEmptyHistoryMergeReporter.Span.values().length];
            try {
                iArr[MessagesEmptyHistoryMergeReporter.Span.ROOT.ordinal()] = 1;
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

    public de20(String str, ReporterType reporterType) {
        super(str);
        this.i = reporterType;
        this.j = true;
    }

    @Override // xsna.wn6
    public final void t(mdz<MessagesEmptyHistoryMergeReporter.Span> mdzVar, Object obj) {
        if (a.$EnumSwitchMapping$0[mdzVar.b.ordinal()] == 1) {
            v(new com.vk.movika.sdk.base.ui.l(15, this, mdzVar));
        }
    }
}
