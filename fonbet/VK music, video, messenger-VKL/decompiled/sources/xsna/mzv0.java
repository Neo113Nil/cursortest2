package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import one.video.exo.offline.DownloadInfo;
import xsna.ikv0;

/* compiled from: VkVideoBridge.kt */
/* loaded from: classes7.dex */
public final class mzv0 implements hu70 {
    public final LinkedHashSet b = new LinkedHashSet();
    public final /* synthetic */ ikv0.d c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ io.reactivex.rxjava3.disposables.b e;
    public final /* synthetic */ kzv0 f;

    public mzv0(ikv0.d dVar, Context context, io.reactivex.rxjava3.disposables.b bVar, kzv0 kzv0Var) {
        this.c = dVar;
        this.d = context;
        this.e = bVar;
        this.f = kzv0Var;
    }

    @Override // xsna.hu70
    @SuppressLint({"SetTextI18n"})
    public final void kg(Map<String, ? extends DownloadInfo> map) {
        ezs0 ezs0Var = this.f.j;
        ug50<ikv0.d.b> ug50Var = this.c.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends DownloadInfo> entry : map.entrySet()) {
            if (entry.getValue().c != DownloadInfo.State.STATE_COMPLETED && entry.getValue().c != DownloadInfo.State.STATE_FAILED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, ? extends DownloadInfo> entry2 : map.entrySet()) {
            if (entry2.getValue().c == DownloadInfo.State.STATE_FAILED) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        boolean isEmpty = linkedHashMap2.isEmpty();
        Context context = this.d;
        LinkedHashSet linkedHashSet = this.b;
        if (!isEmpty && linkedHashMap.isEmpty() && linkedHashMap2.size() == linkedHashSet.size()) {
            ArrayList arrayList = new ArrayList(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getKey());
            }
            if (!j5g.d0(arrayList, linkedHashSet).isEmpty()) {
                ug50Var.k(new ikv0.d.b(context.getString(R.string.exo_download_failed)));
                return;
            }
        }
        if (linkedHashMap.isEmpty() && !linkedHashSet.isEmpty()) {
            ug50Var.k(new ikv0.d.b(context.getString(j5g.d0(map.keySet(), linkedHashSet).isEmpty() ? R.string.video_download_progress_snack_canceled : R.string.video_download_progress_snack_complete)));
            i0q0.i(2000L, new ou5(this.e, 17));
            return;
        }
        if (!ezs0Var.G()) {
            ug50Var.k(new ikv0.d.b(context.getString(R.string.video_download_failed_low_disk_space)));
            ezs0Var.z(this);
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        long j = 0;
        long j2 = 0;
        while (it2.hasNext()) {
            j2 += ((DownloadInfo) it2.next()).d;
        }
        if (j2 <= 0) {
            ug50Var.k(new ikv0.d.b(context.getString(R.string.video_download_progress_soon)));
            return;
        }
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            j += w8o.a((DownloadInfo) it3.next());
        }
        linkedHashSet.addAll(linkedHashMap.keySet());
        ug50Var.k(new ikv0.d.b(context.getResources().getQuantityString(R.plurals.video_download_progress_snack, linkedHashMap.size(), Integer.valueOf(linkedHashMap.size()), String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(j2 / 1000000.0f)}, 1))) + " (" + ((int) ((j2 / j) * 100.0d)) + "%)"));
    }
}
