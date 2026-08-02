package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean handleDownloadHelperCallbackMessage;
        boolean handleDownloadHelperCallbackMessage2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                handleDownloadHelperCallbackMessage = ((DownloadHelper$MediaPreparer) obj).handleDownloadHelperCallbackMessage(message);
                return handleDownloadHelperCallbackMessage;
            default:
                handleDownloadHelperCallbackMessage2 = ((YandexDownloadHelper$MediaPreparer) obj).handleDownloadHelperCallbackMessage(message);
                return handleDownloadHelperCallbackMessage2;
        }
    }
}
