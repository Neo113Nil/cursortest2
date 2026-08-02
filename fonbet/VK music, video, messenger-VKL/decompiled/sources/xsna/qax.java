package xsna;

import android.app.Activity;
import com.vk.api.base.Document;
import com.vk.log.L;
import com.vk.pending.PendingDocumentAttachment;
import com.vkontakte.android.R;
import io.jsonwebtoken.Header;
import org.chromium.base.IntentUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class qax implements Runnable {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ qax() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context] */
    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        switch (this.b) {
            case 0:
                IntentUtils.sForceTrustedIntentForTesting = false;
                break;
            default:
                L.a.getClass();
                String z = L.z();
                if (z != null) {
                    c63 c63Var = c63.a;
                    Activity b = c63.b();
                    if (b == null) {
                        b = null;
                    }
                    if (b == null) {
                        ?? r1 = e43.a;
                        activity = r1 != 0 ? r1 : null;
                    } else {
                        activity = b;
                    }
                    Document document = new Document();
                    document.k = z;
                    document.m = Header.COMPRESSION_ALGORITHM;
                    kbj0.e(nr4.b(), activity, new PendingDocumentAttachment(document), false, null, false, null, 60);
                    break;
                } else {
                    cvk.u(R.string.settings_upload_debug_disabled, false);
                    break;
                }
        }
    }

    public /* synthetic */ qax(mnh0 mnh0Var) {
    }
}
