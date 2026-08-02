package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.dagger.DivStorageModule;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.util.LazyProvider;
import java.util.NoSuchElementException;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: DivStorageModule.kt */
/* loaded from: classes7.dex */
public final class DivStorageModule {
    public static final DivStorageModule INSTANCE = new DivStorageModule();

    private DivStorageModule() {
    }

    public final DivStorageComponent provideDivStorageComponent(ExternalOptional<DivStorageComponent> externalOptional, Context context, HistogramReporterDelegate histogramReporterDelegate, final DivParsingHistogramReporter divParsingHistogramReporter) {
        DivStorageComponent create;
        if (externalOptional.getOptional().a == null) {
            create = DivStorageComponent.Companion.create(context, (r14 & 2) != 0 ? HistogramReporterDelegate.NoOp.INSTANCE : histogramReporterDelegate, (r14 & 4) != 0 ? null : null, (r14 & 8) != 0 ? ParsingErrorLogger.LOG : null, (r14 & 16) == 0 ? null : null, (r14 & 32) != 0 ? new LazyProvider(new gzs<DivParsingHistogramReporter>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$create$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // xsna.gzs
                public final DivParsingHistogramReporter invoke() {
                    return DivParsingHistogramReporter.Companion.getDEFAULT();
                }
            }) : new e9e0() { // from class: xsna.kpn
                @Override // xsna.e9e0
                public final Object get() {
                    DivParsingHistogramReporter provideDivStorageComponent$lambda$0;
                    provideDivStorageComponent$lambda$0 = DivStorageModule.provideDivStorageComponent$lambda$0(DivParsingHistogramReporter.this);
                    return provideDivStorageComponent$lambda$0;
                }
            }, (r14 & 64) != 0 ? "" : null);
            return create;
        }
        DivStorageComponent divStorageComponent = externalOptional.getOptional().a;
        if (divStorageComponent != null) {
            return divStorageComponent;
        }
        throw new NoSuchElementException("No value present");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivParsingHistogramReporter provideDivStorageComponent$lambda$0(DivParsingHistogramReporter divParsingHistogramReporter) {
        return divParsingHistogramReporter;
    }
}
