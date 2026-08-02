package xsna;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public interface wnz0 extends IInterface {
    void C(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    void Z0(Status status, @Nullable ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;
}
