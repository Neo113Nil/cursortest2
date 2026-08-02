package xsna;

import kotlin.NoWhenBranchMatchedException;
import one.video.calls.sdk.experiments.models.PcapLabelConfig;
import xsna.qc1;

/* loaded from: classes8.dex */
public final class rs90 implements qs90 {
    public final PcapLabelConfig a;
    public final gm70 b;
    public final qc1 c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PcapLabelConfig.Source.values().length];
            try {
                iArr[PcapLabelConfig.Source.NS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PcapLabelConfig.Source.AI_OPUS_BWE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rs90(PcapLabelConfig pcapLabelConfig, gm70 gm70Var, qc1 qc1Var, boolean z) {
        this.a = pcapLabelConfig;
        this.b = gm70Var;
        this.c = qc1Var;
    }

    public final PcapLabelConfig a() {
        PcapLabelConfig pcapLabelConfig = this.a;
        if (pcapLabelConfig != null) {
            int i = a.$EnumSwitchMapping$0[pcapLabelConfig.b.ordinal()];
            if (i == 1) {
                this.b.getClass();
                return null;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(this.c instanceof qc1.a)) {
                return pcapLabelConfig;
            }
        }
        return null;
    }
}
