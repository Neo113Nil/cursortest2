package com.yandex.div.histogram;

import xsna.t11;
import xsna.u11;

/* compiled from: HistogramFilter.kt */
/* loaded from: classes7.dex */
public interface HistogramFilter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: HistogramFilter.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final HistogramFilter ON = new t11(19);
        private static final HistogramFilter OFF = new u11(21);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean OFF$lambda$1(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ON$lambda$0(String str) {
            return true;
        }

        public final HistogramFilter getOFF() {
            return OFF;
        }

        public final HistogramFilter getON() {
            return ON;
        }
    }

    boolean report(String str);
}
