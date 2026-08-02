package defpackage;

import android.webkit.WebBackForwardList;
import java.util.Map;

/* loaded from: classes2.dex */
public interface mn41 {
    boolean a();

    void b(String str);

    WebBackForwardList c();

    boolean canGoBack();

    void clearHistory();

    String d();

    String getUserAgentString();

    void goBack();

    void loadUrl(String str, Map map);

    void onPause();

    void onResume();

    void reload();

    void setAudioMuted(boolean z);

    void stopLoading();
}
