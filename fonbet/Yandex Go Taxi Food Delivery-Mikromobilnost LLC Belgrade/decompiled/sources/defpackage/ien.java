package defpackage;

import android.webkit.ValueCallback;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ien {
    void addJavascriptInterface(Object obj, String str);

    boolean canGoBack();

    void clearHistory();

    void destroy();

    void evaluateJavascript(String str, ValueCallback valueCallback);

    void gainFocus();

    String getUserAgentString();

    void goBack();

    void loadUrl(String str, Map map);

    void openKeyboard();

    void setClient(hen henVar);

    void setDatabaseEnabled(boolean z);

    void setDomStorageEnabled(boolean z);

    void setJavaScriptEnabled(boolean z);

    void setMediaPlaybackRequiresUserGesture(boolean z);

    void setUserAgentString(String str);
}
