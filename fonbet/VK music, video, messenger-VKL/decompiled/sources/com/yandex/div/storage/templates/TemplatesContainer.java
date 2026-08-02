package com.yandex.div.storage.templates;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: TemplatesContainer.kt */
/* loaded from: classes7.dex */
public class TemplatesContainer {
    private final DivStorage divStorage;
    private final ParsingErrorLogger errorLogger;
    private final HistogramRecorder histogramRecorder;
    private final e9e0<DivParsingHistogramProxy> parsingHistogramProxy;
    private final CommonTemplatesPool templatesPool;
    private final String histogramComponentName = null;
    private final Map<String, Object> groupTemplateReferences = new LinkedHashMap();
    private final Map<String, DivParsingEnvironment> templateEnvironments = new LinkedHashMap();
    private final Lazy messageDigest$delegate = new bpn0(new gzs<MessageDigest>() { // from class: com.yandex.div.storage.templates.TemplatesContainer$messageDigest$2
        {
            super(0);
        }

        @Override // xsna.gzs
        public final MessageDigest invoke() {
            ParsingErrorLogger parsingErrorLogger;
            try {
                return MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException e) {
                parsingErrorLogger = TemplatesContainer.this.errorLogger;
                parsingErrorLogger.logError(new IllegalStateException("Storage cannot work with templates!", e));
                return null;
            }
        }
    });

    public TemplatesContainer(DivStorage divStorage, ParsingErrorLogger parsingErrorLogger, HistogramRecorder histogramRecorder, e9e0<DivParsingHistogramProxy> e9e0Var, HistogramNameProvider histogramNameProvider) {
        this.divStorage = divStorage;
        this.errorLogger = parsingErrorLogger;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = e9e0Var;
        this.templatesPool = new CommonTemplatesPool(divStorage, parsingErrorLogger, null, histogramRecorder, e9e0Var);
    }
}
