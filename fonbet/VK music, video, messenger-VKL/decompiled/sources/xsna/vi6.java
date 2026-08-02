package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.common.VideoFile;
import com.vk.dto.user.RequestUserProfile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.exceptions.BadVideoFileException;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.nqs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vi6 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vi6(com.vk.lists.c cVar, boolean z, yi6 yi6Var) {
        this.d = cVar;
        this.c = z;
        this.e = yi6Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                uuk<nqs> uukVar = ((yi6) this.e).b;
                VkPaginationList vkPaginationList = (VkPaginationList) obj;
                if (vkPaginationList.b.isEmpty()) {
                    cVar.r(false);
                } else {
                    cVar.l(vkPaginationList.c);
                    cVar.r(true);
                }
                Iterable iterable = vkPaginationList.b;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new nqs.a((RequestUserProfile) it.next()));
                }
                if (this.c) {
                    uukVar.setItems(arrayList);
                } else {
                    uukVar.n0(arrayList);
                }
                return s3q0.a;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.d;
                cme0 cme0Var = (cme0) this.e;
                int intValue = ((Integer) obj).intValue();
                if (intValue >= 0 && intValue < arrayList2.size()) {
                    cme0Var.f = true;
                    cme0Var.f((rne0) arrayList2.get(intValue), this.c);
                }
                return s3q0.a;
            default:
                Throwable th = (Throwable) obj;
                return ((th instanceof BadVideoFileException) && this.c) ? VideoAutoPlay.r1((VideoAutoPlay) this.d, (VideoFile) this.e, 0, true, 2) : io.reactivex.rxjava3.core.x.i(th);
        }
    }

    public /* synthetic */ vi6(ArrayList arrayList, cme0 cme0Var, boolean z) {
        this.d = arrayList;
        this.e = cme0Var;
        this.c = z;
    }

    public /* synthetic */ vi6(boolean z, VideoAutoPlay videoAutoPlay, VideoFile videoFile) {
        this.c = z;
        this.d = videoAutoPlay;
        this.e = videoFile;
    }
}
