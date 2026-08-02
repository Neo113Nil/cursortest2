package xsna;

import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes12.dex */
public interface z65 {
    void onIgniteServiceAuthenticated(String str);

    void onIgniteServiceAuthenticationFailed(String str);

    void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder);

    void onIgniteServiceConnectionFailed(String str);

    void onOdtUnsupported();
}
