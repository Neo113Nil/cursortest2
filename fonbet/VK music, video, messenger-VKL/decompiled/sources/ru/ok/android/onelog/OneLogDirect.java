package ru.ok.android.onelog;

import java.io.IOException;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.utils.Logger;
import xsna.cj80;
import xsna.s3q0;
import xsna.v870;
import xsna.vi80;
import xsna.wni;
import xsna.wzs;
import xsna.xi80;

/* compiled from: OneLogDirect.kt */
/* loaded from: classes9.dex */
public final class OneLogDirect {
    public static final OneLogDirect INSTANCE = new OneLogDirect();

    private OneLogDirect() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flush$lambda$2() {
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
        } catch (Exception unused) {
            Logger.d("api not initialized");
            return null;
        }
    }

    /* renamed from: send-B_83SRM, reason: not valid java name */
    private final void m361sendB_83SRM(OneLogItem oneLogItem, String str, wzs<? super OneLogItem, ? super Exception, s3q0> wzsVar) {
        if (Logger.isLoggingEnable()) {
            Logger.v("will send %s | %s", oneLogItem.collector(), dump(oneLogItem));
        }
        ApiClient apiClient = getApiClient();
        if (apiClient == null) {
            return;
        }
        cj80.a.a().execute(new xi80(str, oneLogItem, apiClient, wzsVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void send_B_83SRM$lambda$1(final String str, final OneLogItem oneLogItem, ApiClient apiClient, wzs wzsVar) {
        try {
            final String applicationParam = OneLogImpl.getInstance().getApplicationParam();
            if (str == null) {
                str = OneLogImpl.getInstance().getPlatformParam();
            }
            final String collector = oneLogItem.collector();
            apiClient.execute((ApiExecutableRequest) new vi80(applicationParam, str, collector) { // from class: ru.ok.android.onelog.OneLogDirect$send$2$request$1
                @Override // xsna.vi80
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 send_PCEVtD0$lambda$0(OneLogItem oneLogItem, Exception exc) {
        oneLogItem.log();
        return s3q0.a;
    }

    public final String dump(OneLogItem oneLogItem) {
        return ItemDumper.dump(oneLogItem);
    }

    public final void flush() {
        cj80.a.a().execute(new v870(1));
    }

    /* renamed from: send-PCEVtD0, reason: not valid java name */
    public final void m362sendPCEVtD0(OneLogItem oneLogItem, String str) {
        m361sendB_83SRM(oneLogItem, str, new wni(8));
    }
}
