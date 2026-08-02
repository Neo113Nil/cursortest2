package xsna;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import xsna.esu;
import xsna.nsg0;

/* compiled from: IHealthDataSdkService.java */
/* loaded from: classes12.dex */
public abstract class fnv extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public /* synthetic */ fnv(int i) {
        this.a = i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.a) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
                }
                if (i != 1598968902) {
                    jov jovVar = null;
                    ymv ymvVar = null;
                    anv anvVar = null;
                    if (i == 1) {
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof jov)) {
                                iov iovVar = new iov();
                                iovVar.a = readStrongBinder;
                                jovVar = iovVar;
                            } else {
                                jovVar = (jov) queryLocalInterface;
                            }
                        }
                        m0v m0vVar = (m0v) this;
                        m0vVar.f(readString);
                        m0vVar.e.execute(new w09(m0vVar, readString2, jovVar, 2));
                        break;
                    } else if (i == 2) {
                        String readString3 = parcel.readString();
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof anv)) {
                                zmv zmvVar = new zmv();
                                zmvVar.a = readStrongBinder2;
                                anvVar = zmvVar;
                            } else {
                                anvVar = (anv) queryLocalInterface2;
                            }
                        }
                        m0v m0vVar2 = (m0v) this;
                        m0vVar2.f(readString3);
                        m0vVar2.e.execute(new i0(5, m0vVar2, anvVar));
                        break;
                    } else if (i == 3) {
                        String readString4 = parcel.readString();
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
                            if (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof ymv)) {
                                xmv xmvVar = new xmv();
                                xmvVar.a = readStrongBinder3;
                                ymvVar = xmvVar;
                            } else {
                                ymvVar = (ymv) queryLocalInterface3;
                            }
                        }
                        m0v m0vVar3 = (m0v) this;
                        m0vVar3.f(readString4);
                        m0vVar3.e.execute(new oh(ymvVar, 4));
                        break;
                    } else {
                        break;
                    }
                } else {
                    parcel2.writeString("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
                    break;
                }
                break;
            case 1:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("ru.vk.provider.install.rapid.RapidTokenCallback");
                }
                if (i != 1598968902) {
                    if (i == 1) {
                        String readString5 = parcel.readString();
                        int readInt = parcel.readInt();
                        nsg0.a aVar = (nsg0.a) this;
                        osg0 osg0Var = aVar.b;
                        MaxMessengerAnalytics maxMessengerAnalytics = osg0Var.b;
                        maxMessengerAnalytics.b();
                        par0.a.getClass();
                        par0.a("DefaultClientSeamlessInstallFlow On get Token success. State: " + readInt);
                        l1i l1iVar = aVar.e;
                        if (readString5 == null) {
                            maxMessengerAnalytics.g();
                            par0.a("DefaultClientSeamlessInstallFlow On get Token success, but token is null");
                            l1iVar.invoke();
                        } else if (readInt != 0) {
                            maxMessengerAnalytics.p();
                            par0.a("DefaultClientSeamlessInstallFlow On get Token success, but state is not ready_to_install");
                            l1iVar.invoke();
                        } else {
                            aVar.f.invoke(readString5);
                            osg0Var.a();
                        }
                        parcel2.writeNoException();
                        break;
                    } else if (i == 2) {
                        int readInt2 = parcel.readInt();
                        nsg0.a aVar2 = (nsg0.a) this;
                        par0.a.getClass();
                        par0.a("DefaultClientSeamlessInstallFlow On get Token error. Reason " + readInt2);
                        osg0 osg0Var2 = aVar2.b;
                        osg0Var2.b.m(readInt2);
                        osg0Var2.a();
                        aVar2.e.invoke();
                        parcel2.writeNoException();
                        break;
                    } else {
                        break;
                    }
                } else {
                    parcel2.writeString("ru.vk.provider.install.rapid.RapidTokenCallback");
                    break;
                }
            default:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
                }
                if (i != 1598968902) {
                    if (i == 1) {
                        esu.a aVar3 = (esu.a) this;
                        esu esuVar = esu.this;
                        esuVar.d.invoke();
                        inj.b(esuVar.b, aVar3.e);
                    } else if (i != 2) {
                        break;
                    } else {
                        int readInt3 = parcel.readInt();
                        String readString6 = parcel.readString();
                        esu.a aVar4 = (esu.a) this;
                        esu esuVar2 = esu.this;
                        esuVar2.e.invoke(RemoteProviderErrors.INSTANCE.toRuStoreException(readInt3, readString6));
                        inj.b(esuVar2.b, aVar4.e);
                    }
                    parcel2.writeNoException();
                    break;
                } else {
                    parcel2.writeString("ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
                    break;
                }
                break;
        }
        return true;
    }
}
