package com.yandex.div.storage;

import android.content.Context;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.database.AndroidDatabaseOpenHelper;
import com.yandex.div.storage.database.c;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import defpackage.d7y;
import defpackage.eg90;
import defpackage.fsw;
import defpackage.glu;
import defpackage.hlu;
import defpackage.mlu;
import defpackage.sls;
import defpackage.v2l;
import defpackage.xw91;
import defpackage.y7l;
import defpackage.yvf0;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivStorageComponent;", "", "Lcom/yandex/div/storage/DivDataRepository;", "b", "()Lcom/yandex/div/storage/DivDataRepository;", "repository", "Lcom/yandex/div/storage/d;", "a", "()Lcom/yandex/div/storage/d;", "rawJsonRepository", "Companion", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DivStorageComponent {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015Je\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/storage/DivStorageComponent$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lmlu;", "histogramReporter", "Lglu;", "histogramNameProvider", "Leg90;", "errorLogger", "Lyvf0;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "cardErrorTransformer", "Lv2l;", "parsingHistogramReporter", "", "databaseNamePrefix", "Lcom/yandex/div/storage/DivStorageComponent;", "g", "(Landroid/content/Context;Lmlu;Lglu;Leg90;Lyvf0;Lyvf0;Ljava/lang/String;)Lcom/yandex/div/storage/DivStorageComponent;", "Lfsw;", CoreConstants.PushMessage.SERVICE_TYPE, "(Landroid/content/Context;Lmlu;Lglu;Leg90;Lyvf0;Lyvf0;Ljava/lang/String;)Lfsw;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public static DivStorageComponent h(Companion companion, Context context, mlu mluVar, glu gluVar, eg90 eg90Var, yvf0 yvf0Var, yvf0 yvf0Var2, String str, int i, Object obj) {
            return companion.i(context, (i & 2) != 0 ? xw91.z : mluVar, (i & 4) != 0 ? null : gluVar, (i & 8) != 0 ? eg90.a : eg90Var, (i & 16) == 0 ? yvf0Var : null, (i & 32) != 0 ? new d7y(DivStorageComponent$Companion$create$1.w) : yvf0Var2, (i & 64) != 0 ? "" : str);
        }

        private static final com.yandex.div.storage.database.c k(Context context, String str, int i, c.a aVar, c.InterfaceC0036c interfaceC0036c) {
            return new AndroidDatabaseOpenHelper(context, str, i, aVar, interfaceC0036c);
        }

        public final DivStorageComponent a(Context context) {
            return h(this, context, null, null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD, null);
        }

        public final DivStorageComponent b(Context context, mlu mluVar) {
            return h(this, context, mluVar, null, null, null, null, null, HProv.PP_SAME_MEDIA, null);
        }

        public final DivStorageComponent c(Context context, mlu mluVar, glu gluVar) {
            return h(this, context, mluVar, gluVar, null, null, null, null, 120, null);
        }

        public final DivStorageComponent d(Context context, mlu mluVar, glu gluVar, eg90 eg90Var) {
            return h(this, context, mluVar, gluVar, eg90Var, null, null, null, 112, null);
        }

        public final DivStorageComponent e(Context context, mlu mluVar, glu gluVar, eg90 eg90Var, yvf0 yvf0Var) {
            return h(this, context, mluVar, gluVar, eg90Var, yvf0Var, null, null, 96, null);
        }

        public final DivStorageComponent f(Context context, mlu mluVar, glu gluVar, eg90 eg90Var, yvf0 yvf0Var, yvf0 yvf0Var2) {
            return h(this, context, mluVar, gluVar, eg90Var, yvf0Var, yvf0Var2, null, 64, null);
        }

        public final DivStorageComponent g(Context context, mlu histogramReporter, glu histogramNameProvider, eg90 errorLogger, yvf0 cardErrorTransformer, yvf0 parsingHistogramReporter, String databaseNamePrefix) {
            return i(context, histogramReporter, histogramNameProvider, errorLogger, cardErrorTransformer, parsingHistogramReporter, databaseNamePrefix);
        }

        public final fsw i(Context context, mlu histogramReporter, glu histogramNameProvider, eg90 errorLogger, yvf0 cardErrorTransformer, final yvf0 parsingHistogramReporter, String databaseNamePrefix) {
            DivStorageImpl divStorageImpl = new DivStorageImpl(context, new y7l(8), databaseNamePrefix);
            d7y d7yVar = new d7y(new sls() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DivParsingHistogramProxy invoke() {
                    final yvf0 yvf0Var = yvf0.this;
                    return new DivParsingHistogramProxy(new sls() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1.1
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final v2l invoke() {
                            return (v2l) yvf0.this.get();
                        }
                    });
                }
            });
            hlu hluVar = new hlu(histogramReporter, histogramNameProvider);
            TemplatesContainer templatesContainer = new TemplatesContainer(divStorageImpl, errorLogger, hluVar, d7yVar, histogramNameProvider);
            return new fsw(new a(divStorageImpl, templatesContainer, hluVar, histogramNameProvider, d7yVar, new CardErrorLoggerFactory(cardErrorTransformer, templatesContainer, errorLogger)), new e(divStorageImpl), divStorageImpl);
        }
    }

    /* renamed from: a */
    d getRawJsonRepository();

    /* renamed from: b */
    DivDataRepository getRepository();
}
