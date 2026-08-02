package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public abstract class u701 extends zzbn implements v701 {
    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ArrayList arrayList;
        switch (i) {
            case 1:
                zzaw zzawVar = (zzaw) zzbo.zza(parcel, zzaw.CREATOR);
                com.google.android.gms.measurement.internal.zzq zzqVar = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                ((cd01) this).a1(zzawVar, zzqVar);
                parcel2.writeNoException();
                break;
            case 2:
                zzkw zzkwVar = (zzkw) zzbo.zza(parcel, zzkw.CREATOR);
                com.google.android.gms.measurement.internal.zzq zzqVar2 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                ((cd01) this).f1(zzkwVar, zzqVar2);
                parcel2.writeNoException();
                break;
            case 4:
                com.google.android.gms.measurement.internal.zzq zzqVar3 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                ((cd01) this).E0(zzqVar3);
                parcel2.writeNoException();
                break;
            case 5:
                zzaw zzawVar2 = (zzaw) zzbo.zza(parcel, zzaw.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                zzbo.zzc(parcel);
                cd01 cd01Var = (cd01) this;
                exc0.i(zzawVar2);
                exc0.f(readString);
                cd01Var.I1(readString, true);
                cd01Var.g(new wc01(cd01Var, zzawVar2, readString));
                parcel2.writeNoException();
                break;
            case 6:
                com.google.android.gms.measurement.internal.zzq zzqVar4 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                ((cd01) this).M0(zzqVar4);
                parcel2.writeNoException();
                break;
            case 7:
                com.google.android.gms.measurement.internal.zzq zzqVar5 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                boolean zzg = zzbo.zzg(parcel);
                zzbo.zzc(parcel);
                cd01 cd01Var2 = (cd01) this;
                cd01Var2.H1(zzqVar5);
                String str = zzqVar5.b;
                exc0.i(str);
                qj01 qj01Var = cd01Var2.a;
                try {
                    List<uj01> list = (List) qj01Var.d().q(new zc01(cd01Var2, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (uj01 uj01Var : list) {
                        if (!zzg && sk01.T(uj01Var.c)) {
                        }
                        arrayList.add(new zzkw(uj01Var));
                    }
                } catch (InterruptedException e) {
                    e = e;
                    qj01Var.e().i.c("Failed to get user properties. appId", k901.r(str), e);
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    qj01Var.e().i.c("Failed to get user properties. appId", k901.r(str), e);
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                zzaw zzawVar3 = (zzaw) zzbo.zza(parcel, zzaw.CREATOR);
                String readString2 = parcel.readString();
                zzbo.zzc(parcel);
                byte[] u1 = ((cd01) this).u1(zzawVar3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(u1);
                break;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                zzbo.zzc(parcel);
                ((cd01) this).e1(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                break;
            case 11:
                com.google.android.gms.measurement.internal.zzq zzqVar6 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                String f0 = ((cd01) this).f0(zzqVar6);
                parcel2.writeNoException();
                parcel2.writeString(f0);
                break;
            case 12:
                zzac zzacVar = (zzac) zzbo.zza(parcel, zzac.CREATOR);
                com.google.android.gms.measurement.internal.zzq zzqVar7 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                ((cd01) this).D1(zzacVar, zzqVar7);
                parcel2.writeNoException();
                break;
            case 13:
                zzac zzacVar2 = (zzac) zzbo.zza(parcel, zzac.CREATOR);
                zzbo.zzc(parcel);
                cd01 cd01Var3 = (cd01) this;
                exc0.i(zzacVar2);
                exc0.i(zzacVar2.d);
                exc0.f(zzacVar2.b);
                cd01Var3.I1(zzacVar2.b, true);
                cd01Var3.g(new ob01(cd01Var3, new zzac(zzacVar2), 0));
                parcel2.writeNoException();
                break;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                boolean zzg2 = zzbo.zzg(parcel);
                com.google.android.gms.measurement.internal.zzq zzqVar8 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                List j1 = ((cd01) this).j1(readString6, readString7, zzg2, zzqVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(j1);
                break;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                boolean zzg3 = zzbo.zzg(parcel);
                zzbo.zzc(parcel);
                List s1 = ((cd01) this).s1(readString8, readString9, readString10, zzg3);
                parcel2.writeNoException();
                parcel2.writeTypedList(s1);
                break;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                com.google.android.gms.measurement.internal.zzq zzqVar9 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                List l0 = ((cd01) this).l0(readString11, readString12, zzqVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(l0);
                break;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                zzbo.zzc(parcel);
                List N0 = ((cd01) this).N0(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(N0);
                break;
            case 18:
                com.google.android.gms.measurement.internal.zzq zzqVar10 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                ((cd01) this).I0(zzqVar10);
                parcel2.writeNoException();
                break;
            case 19:
                Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                com.google.android.gms.measurement.internal.zzq zzqVar11 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                ((cd01) this).x(bundle, zzqVar11);
                parcel2.writeNoException();
                break;
            case 20:
                com.google.android.gms.measurement.internal.zzq zzqVar12 = (com.google.android.gms.measurement.internal.zzq) zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzq.CREATOR);
                zzbo.zzc(parcel);
                ((cd01) this).G0(zzqVar12);
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
