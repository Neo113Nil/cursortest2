package com.yandex.div.histogram;

import kotlin.Lazy;
import xsna.bpn0;

/* compiled from: DivParsingHistogramReporter.kt */
/* loaded from: classes7.dex */
public interface DivParsingHistogramReporter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: DivParsingHistogramReporter.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Lazy<DefaultDivParsingHistogramReporter> DEFAULT$delegate = new bpn0(DivParsingHistogramReporter$Companion$DEFAULT$2.INSTANCE);

        private Companion() {
        }

        public final DivParsingHistogramReporter getDEFAULT() {
            return DEFAULT$delegate.getValue();
        }
    }
}
