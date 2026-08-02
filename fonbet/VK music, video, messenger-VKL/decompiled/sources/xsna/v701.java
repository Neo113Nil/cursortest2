package xsna;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public interface v701 extends IInterface {
    void D1(zzac zzacVar, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    void E0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    void G0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    void I0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    void M0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    List N0(String str, @Nullable String str2, @Nullable String str3) throws RemoteException;

    void a1(zzaw zzawVar, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    void e1(long j, @Nullable String str, @Nullable String str2, String str3) throws RemoteException;

    @Nullable
    String f0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    void f1(zzkw zzkwVar, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    List j1(@Nullable String str, @Nullable String str2, boolean z, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    List l0(@Nullable String str, @Nullable String str2, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;

    List s1(String str, @Nullable String str2, @Nullable String str3, boolean z) throws RemoteException;

    @Nullable
    byte[] u1(zzaw zzawVar, String str) throws RemoteException;

    void x(Bundle bundle, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException;
}
