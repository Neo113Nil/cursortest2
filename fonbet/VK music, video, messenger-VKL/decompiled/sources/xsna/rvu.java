package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.music.player.StartPlayVkMixSource;
import java.util.HashMap;

/* compiled from: HdrToSdrToneMapper.kt */
/* loaded from: classes3.dex */
public final class rvu implements yt60, jxa0, ouf0 {
    public final Object b;
    public Object c;
    public Object d;

    public /* synthetic */ rvu(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.yt60
    public zt60 Z() {
        return (wx60) this.c;
    }

    public void a(com.vk.music.player.playback.e eVar) {
        pxa0 pxa0Var = (pxa0) this.c;
        this.d = (eVar != null ? eVar.a : null) instanceof StartPlayVkMixSource ? new n4v0(eVar, pxa0Var, (t4v0) this.b) : new lkl(eVar, pxa0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        String str = (String) this.c;
        String str2 = (String) this.d;
        ms01 ms01Var = (ms01) obj;
        a401 a401Var = (a401) this.b;
        HashMap hashMap = a401Var.r;
        long incrementAndGet = a401Var.g.incrementAndGet();
        exc0.k("Not connected to device", a401Var.e());
        try {
            hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource);
            ApiMetadata zza = zzff.zza(ms01Var.getContext());
            nwz0 nwz0Var = (nwz0) ms01Var.getService();
            Parcel zza2 = nwz0Var.zza();
            zza2.writeString(str);
            zza2.writeString(str2);
            zza2.writeLong(incrementAndGet);
            com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
            nwz0Var.zzd(9, zza2);
        } catch (RemoteException e) {
            hashMap.remove(Long.valueOf(incrementAndGet));
            taskCompletionSource.setException(e);
        }
    }

    @Override // xsna.yt60
    public au60 d0() {
        return (my60) this.b;
    }

    @Override // xsna.yt60
    public xt60 h1() {
        return (tx60) this.d;
    }

    @Override // xsna.jxa0
    public boolean p() {
        throw null;
    }

    public rvu(f100 f100Var) {
        this.b = f100Var;
    }

    public rvu(t4v0 t4v0Var, pxa0 pxa0Var) {
        this.b = t4v0Var;
        this.c = pxa0Var;
        this.d = new t370();
    }
}
