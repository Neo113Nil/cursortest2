package xsna;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class y570 implements a.f, ServiceConnection {
    @Override // com.google.android.gms.common.api.a.f
    public final void connect(@NonNull rd6.c cVar) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final String getEndpointPackageName() {
        exc0.i(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    @Nullable
    public final String getLastDisconnectMessage() {
        return null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnected() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnecting() {
        Thread.currentThread();
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean providesSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect(@NonNull String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void onUserSignOut(@NonNull rd6.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void getRemoteService(@Nullable com.google.android.gms.common.internal.b bVar, @Nullable Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}
