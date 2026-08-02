package xsna;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import com.vk.im.engine.models.messages.Msg;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MessagesAttachesDownloadStorage.kt */
/* loaded from: classes2.dex */
public final class ld20 implements l64, ouf0 {
    public final Object b;
    public final Object c;

    public /* synthetic */ ld20(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        rm01 rm01Var = (rm01) obj;
        uf01 uf01Var = new uf01((cm01) this.b, (TaskCompletionSource) obj2);
        ixz0 ixz0Var = (ixz0) rm01Var.getService();
        ApiMetadata zza = zzff.zza(rm01Var.getContext());
        String[] strArr = (String[]) this.c;
        Parcel zza2 = ixz0Var.zza();
        com.google.android.gms.internal.cast.zzc.zze(zza2, uf01Var);
        zza2.writeStringArray(strArr);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        ixz0Var.zzd(7, zza2);
    }

    @Override // xsna.l64
    public Attach b(int i) {
        return ((d040) this.c).b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.l64
    public void c(AttachWithDownload attachWithDownload, DownloadState downloadState, File file) {
        w2w w2wVar = (w2w) this.b;
        d040 o = w2wVar.I0().o();
        bzp S0 = w2wVar.S0();
        attachWithDownload.A6(downloadState);
        attachWithDownload.a3(file);
        if (!(attachWithDownload instanceof htx0)) {
            o.s0(attachWithDownload);
            S0.O(attachWithDownload);
            return;
        }
        List<Msg> Y = o.Y(attachWithDownload.getClass(), attachWithDownload.q(), Long.valueOf(((htx0) attachWithDownload).getId()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : Y) {
            if (obj instanceof com.vk.im.engine.models.messages.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.vk.im.engine.models.messages.a) it.next()).u8(new com.vk.im.engine.internal.storage.delegates.messages.b(attachWithDownload, 7), new ya(2, downloadState, file));
        }
        List<Msg> list = Y;
        o.a(list);
        S0.G(null, list);
        S0.O(attachWithDownload);
    }

    public ld20(w2w w2wVar) {
        this.b = w2wVar;
        this.c = w2wVar.I0().o();
    }

    public ld20(lu70 lu70Var, String str, defpackage.h hVar) {
        this.b = str;
        this.c = hVar;
    }
}
