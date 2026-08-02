package defpackage;

import android.content.Intent;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* loaded from: classes.dex */
public interface om2 {
    void connect(b25 b25Var);

    void disconnect();

    void disconnect(String str);

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    Feature[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(IAccountAccessor iAccountAccessor, Set set);

    Set getScopesForConnectionlessNonSignIn();

    Intent getSignInIntent();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(d25 d25Var);

    boolean providesSignIn();

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
