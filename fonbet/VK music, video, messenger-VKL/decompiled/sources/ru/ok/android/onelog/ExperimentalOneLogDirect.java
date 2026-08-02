package ru.ok.android.onelog;

import java.io.IOException;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.utils.Logger;
import xsna.cj80;
import xsna.l9q;
import xsna.oh;
import xsna.s3q0;
import xsna.w09;
import xsna.w4b;
import xsna.wzs;

/* compiled from: ExperimentalOneLogDirect.kt */
/* loaded from: classes9.dex */
public final class ExperimentalOneLogDirect {
    public static final ExperimentalOneLogDirect INSTANCE = new ExperimentalOneLogDirect();

    private ExperimentalOneLogDirect() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flush$lambda$3() {
        try {
            OneLogImpl.getInstance().flush();
            Logger.v("flush one-log ");
        } catch (Exception e) {
            Logger.d("error %s", e.getMessage());
        }
    }

    private final ApiClient getApiClient() {
        try {
            return OneLogImpl.getInstance().getApiClient();
        } catch (Exception e) {
            Logger.d("api not initialized with exception: " + e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 send$lambda$1(OneLogItem oneLogItem, Exception exc) {
        cj80.a.a().execute(new oh(oneLogItem, 3));
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void send$lambda$2(final OneLogItem oneLogItem, ApiClient apiClient, wzs wzsVar) {
        try {
            final String applicationParam = OneLogImpl.getInstance().getApplicationParam();
            final String platformParam = OneLogImpl.getInstance().getPlatformParam();
            final String collector = oneLogItem.collector();
            apiClient.execute((ApiExecutableRequest) new ExperimentalOneLogApiRequest(applicationParam, platformParam, collector) { // from class: ru.ok.android.onelog.ExperimentalOneLogDirect$send$2$request$1
                @Override // ru.ok.android.onelog.ExperimentalOneLogApiRequest
                public void writeItems(JsonWriter jsonWriter) throws IOException {
                    jsonWriter.beginArray();
                    ItemDumper.dump(oneLogItem, jsonWriter);
                    jsonWriter.endArray();
                }
            });
            if (Logger.isLoggingEnable()) {
                Logger.v("send %s | %s", oneLogItem.collector(), ItemDumper.dump(oneLogItem));
            }
        } catch (Exception e) {
            if (Logger.isLoggingEnable()) {
                Logger.e("error sending %s exception= %s", ItemDumper.dump(oneLogItem), e.getMessage());
            }
            wzsVar.invoke(oneLogItem, e);
        }
    }

    public final String dump(OneLogItem oneLogItem) {
        return ItemDumper.dump(oneLogItem);
    }

    public final void flush() {
        cj80.a.a().execute(new l9q());
    }

    public final void send(OneLogItem oneLogItem) {
        send(oneLogItem, new w4b(2));
    }

    private final void send(OneLogItem oneLogItem, wzs<? super OneLogItem, ? super Exception, s3q0> wzsVar) {
        if (Logger.isLoggingEnable()) {
            Logger.v("will send %s | %s", oneLogItem.collector(), dump(oneLogItem));
        }
        ApiClient apiClient = getApiClient();
        if (apiClient == null) {
            return;
        }
        cj80.a.a().execute(new w09(oneLogItem, apiClient, wzsVar, 1));
    }
}
