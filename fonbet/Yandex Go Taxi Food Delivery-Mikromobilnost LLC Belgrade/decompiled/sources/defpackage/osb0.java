package defpackage;

import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class osb0 implements fe5 {
    @Override // defpackage.fe5
    public final void a(Object obj) {
        if (!(obj instanceof List)) {
            new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            new AndroidWebKitError((String) list.get(0), (String) list.get(1), (String) list.get(2));
        }
    }
}
