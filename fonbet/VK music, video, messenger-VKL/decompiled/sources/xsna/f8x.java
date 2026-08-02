package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.sessionrooms.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.admin.ActivateRoomsParams;
import xsna.g8x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class f8x implements MediaCodecUtil.c, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f8x(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
    public int a(Object obj) {
        Context context = (Context) this.b;
        androidx.media3.common.a aVar = (androidx.media3.common.a) this.c;
        hq10 hq10Var = (hq10) obj;
        String str = hq10Var.b;
        return ((str.equals(aVar.n) || str.equals(MediaCodecUtil.c(aVar))) && hq10Var.c(context, aVar, false) && hq10Var.d(aVar)) ? 1 : 0;
    }

    public void b(String str, wlv wlvVar, g8x g8xVar) {
        int i;
        g8x g8xVar2 = (g8x) this.b;
        g8x.d dVar = (g8x.d) this.c;
        rez0 rez0Var = g8xVar.g;
        pjz0 b = rez0Var != null ? rez0Var.b(str) : null;
        if (b == null) {
            iaz0 iaz0Var = iaz0.c;
            dVar.c(g8xVar);
            return;
        }
        ArrayList arrayList = b.d;
        if (wlvVar != null && (i = ((iaz0) wlvVar).a) != 2001 && i != 3003) {
            dVar.c(g8xVar);
            return;
        }
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            qhz0 qhz0Var = ((lgz0) obj).v0;
            if (qhz0Var != null && !TextUtils.isEmpty(qhz0Var.a)) {
                z = true;
                break;
            }
        }
        arrayList.size();
        g8xVar2.m = new g8x.a(z);
        dVar.f(g8xVar);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        hnm0 hnm0Var = (hnm0) this.b;
        StoriesContainer storiesContainer = (StoriesContainer) this.c;
        StoriesContainer h = hnm0Var.h(storiesContainer.f);
        if (h != null) {
            yVar.onSuccess(h);
        } else {
            yVar.onSuccess(storiesContainer);
        }
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        com.vk.voip.ui.sessionrooms.d dVar = (com.vk.voip.ui.sessionrooms.d) this.b;
        Collection collection = (Collection) this.c;
        dVar.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        if (D != null) {
            ActivateRoomsParams.Builder builder = new ActivateRoomsParams.Builder();
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a.b) it.next()).a);
            }
            D.activateRooms(builder.setRoomIds(arrayList).build(), new qbc0(bVar, 11), new ie90(bVar, 13));
        }
    }
}
