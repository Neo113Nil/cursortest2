package com.yandex.div.storage;

import android.content.Context;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.database.AndroidDatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import com.yandex.div.storage.util.LazyProvider;
import xsna.e9e0;
import xsna.gzs;
import xsna.kr;

/* compiled from: DivStorageComponent.kt */
/* loaded from: classes7.dex */
public interface DivStorageComponent {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: DivStorageComponent.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DatabaseOpenHelper createInternal$lambda$0(Context context, String str, int i, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
            return new AndroidDatabaseOpenHelper(context, str, i, createCallback, upgradeCallback);
        }

        public final DivStorageComponent create(Context context, HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider, ParsingErrorLogger parsingErrorLogger, e9e0<? extends CardErrorTransformer> e9e0Var, e9e0<DivParsingHistogramReporter> e9e0Var2, String str) {
            return createInternal$div_storage_release(context, histogramReporterDelegate, histogramNameProvider, parsingErrorLogger, e9e0Var, e9e0Var2, str);
        }

        public final InternalStorageComponent createInternal$div_storage_release(Context context, HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider, ParsingErrorLogger parsingErrorLogger, e9e0<? extends CardErrorTransformer> e9e0Var, final e9e0<DivParsingHistogramReporter> e9e0Var2, String str) {
            DivStorageImpl divStorageImpl = new DivStorageImpl(context, new kr(17), str);
            LazyProvider lazyProvider = new LazyProvider(new gzs<DivParsingHistogramProxy>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // xsna.gzs
                public final DivParsingHistogramProxy invoke() {
                    final e9e0<DivParsingHistogramReporter> e9e0Var3 = e9e0Var2;
                    return new DivParsingHistogramProxy(new gzs<DivParsingHistogramReporter>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // xsna.gzs
                        public final DivParsingHistogramReporter invoke() {
                            return e9e0Var3.get();
                        }
                    });
                }
            });
            HistogramRecorder histogramRecorder = new HistogramRecorder(histogramReporterDelegate, histogramNameProvider);
            TemplatesContainer templatesContainer = new TemplatesContainer(divStorageImpl, parsingErrorLogger, histogramRecorder, lazyProvider, histogramNameProvider);
            return new InternalStorageComponent(new DivDataRepositoryImpl(divStorageImpl, templatesContainer, histogramRecorder, histogramNameProvider, lazyProvider, new CardErrorLoggerFactory(e9e0Var, templatesContainer, parsingErrorLogger)), new RawJsonRepositoryImpl(divStorageImpl), divStorageImpl);
        }
    }

    RawJsonRepository getRawJsonRepository();
}
