package com.yandex.div.storage;

import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.e9e0;
import xsna.jgp;

/* compiled from: DivDataRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class DivDataRepositoryImpl implements DivDataRepository {
    private final CardErrorLoggerFactory cardErrorFactory;
    private final e9e0<DivParsingHistogramProxy> divParsingHistogramProxy;
    private final DivStorage divStorage;
    private final HistogramRecorder histogramRecorder;
    private final TemplatesContainer templateContainer;
    private final Map<String, Object> inMemoryData = new LinkedHashMap();
    private Map<String, ? extends List<? extends DivDataRepositoryException>> cardsWithErrors = jgp.b;

    public DivDataRepositoryImpl(DivStorage divStorage, TemplatesContainer templatesContainer, HistogramRecorder histogramRecorder, HistogramNameProvider histogramNameProvider, e9e0<DivParsingHistogramProxy> e9e0Var, CardErrorLoggerFactory cardErrorLoggerFactory) {
        this.divStorage = divStorage;
        this.templateContainer = templatesContainer;
        this.histogramRecorder = histogramRecorder;
        this.divParsingHistogramProxy = e9e0Var;
        this.cardErrorFactory = cardErrorLoggerFactory;
    }
}
