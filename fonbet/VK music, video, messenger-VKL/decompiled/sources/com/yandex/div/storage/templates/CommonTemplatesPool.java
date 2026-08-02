package com.yandex.div.storage.templates;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div2.nb;
import java.util.concurrent.ConcurrentHashMap;
import xsna.e9e0;

/* compiled from: TemplatesContainer.kt */
/* loaded from: classes7.dex */
final class CommonTemplatesPool {
    private final ConcurrentHashMap<String, nb> commonTemplates = new ConcurrentHashMap<>();
    private final DivStorage divStorage;
    private final DivParsingEnvironment env;
    private final String histogramComponent;
    private final HistogramRecorder histogramRecorder;
    private final e9e0<DivParsingHistogramProxy> parsingHistogramProxy;

    public CommonTemplatesPool(DivStorage divStorage, ParsingErrorLogger parsingErrorLogger, String str, HistogramRecorder histogramRecorder, e9e0<DivParsingHistogramProxy> e9e0Var) {
        DivParsingEnvironment createEmptyEnv;
        this.divStorage = divStorage;
        this.histogramComponent = str;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = e9e0Var;
        createEmptyEnv = TemplatesContainerKt.createEmptyEnv(parsingErrorLogger);
        this.env = createEmptyEnv;
    }
}
