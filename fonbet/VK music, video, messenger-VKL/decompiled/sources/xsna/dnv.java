package xsna;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public interface dnv extends IInterface {
    void A(i101 i101Var) throws RemoteException;

    void A1(vnv vnvVar, int i, euz0 euz0Var) throws RemoteException;

    void C1(ssz0 ssz0Var) throws RemoteException;

    @NonNull
    ynv H0() throws RemoteException;

    @NonNull
    yov I() throws RemoteException;

    void L0(vq01 vq01Var) throws RemoteException;

    void N(yb01 yb01Var) throws RemoteException;

    void O0(@NonNull vnv vnvVar) throws RemoteException;

    void U0(boolean z) throws RemoteException;

    void Y0(od01 od01Var) throws RemoteException;

    void clear() throws RemoteException;

    void d0(@NonNull vnv vnvVar) throws RemoteException;

    @NonNull
    CameraPosition h() throws RemoteException;

    void i1(j501 j501Var) throws RemoteException;

    boolean k0(MapStyleOptions mapStyleOptions) throws RemoteException;

    void n(ug01 ug01Var) throws RemoteException;

    void p(ca01 ca01Var) throws RemoteException;

    zzaa r(PolygonOptions polygonOptions) throws RemoteException;

    void r0() throws RemoteException;

    void t(tq01 tq01Var) throws RemoteException;

    void u(int i) throws RemoteException;

    com.google.android.gms.internal.maps.zzx w(MarkerOptions markerOptions) throws RemoteException;

    boolean x1() throws RemoteException;

    void y1(t601 t601Var) throws RemoteException;

    void z(js01 js01Var) throws RemoteException;
}
