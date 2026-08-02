package xsna;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzac;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public interface axz0 extends IInterface {
    void F1(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException;

    void Q(long j) throws RemoteException;

    void S0(int i, long j) throws RemoteException;

    void a(int i) throws RemoteException;

    void e(int i) throws RemoteException;

    void i(String str, String str2) throws RemoteException;

    void o0(zzac zzacVar) throws RemoteException;

    void q() throws RemoteException;

    void w0(String str, byte[] bArr) throws RemoteException;

    void w1(com.google.android.gms.cast.internal.zza zzaVar) throws RemoteException;

    void zzc(int i) throws RemoteException;

    void zzd(int i) throws RemoteException;

    void zzf(int i) throws RemoteException;

    void zzg(int i) throws RemoteException;

    void zzh(int i) throws RemoteException;
}
