package xsna;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollInfo;
import org.json.JSONObject;

/* compiled from: PollWebInterface.kt */
/* loaded from: classes15.dex */
public final class otb0 implements ntb0, ouf0 {
    public final Object b;
    public final Object c;

    public /* synthetic */ otb0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public PollInfo a(JSONObject jSONObject) {
        Serializer.c<PollInfo> cVar = PollInfo.CREATOR;
        return new PollInfo(jSONObject.getInt("id"), new UserId(jSONObject.getLong("owner_id")), jSONObject.getInt("is_board") == 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        rm01 rm01Var = (rm01) obj;
        ce01 ce01Var = new ce01((cm01) this.b, (TaskCompletionSource) obj2);
        ixz0 ixz0Var = (ixz0) rm01Var.getService();
        ApiMetadata zza = zzff.zza(rm01Var.getContext());
        String[] strArr = (String[]) this.c;
        Parcel zza2 = ixz0Var.zza();
        com.google.android.gms.internal.cast.zzc.zze(zza2, ce01Var);
        zza2.writeStringArray(strArr);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        ixz0Var.zzd(6, zza2);
    }

    @Override // xsna.ntb0
    public void pollChanged(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        i0q0.f(new ni0(13, this, str));
    }

    @Override // xsna.ntb0
    public void pollStatistic(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        i0q0.f(new mh3(21, this, str));
    }
}
