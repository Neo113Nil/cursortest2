package xsna;

import com.vk.dto.common.InstreamAd;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.VKList;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeSuperappScreenItem;
import com.vk.superapp.dto.WidgetsLoadingState;
import com.vk.superapp.ui.SuperAppFragment;
import xsna.g7n0;
import xsna.n9n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vtt implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vtt(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num;
        g7n0.b bVar;
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                wtt wttVar = (wtt) this.e;
                VKList vKList = (VKList) obj;
                cVar.q(cVar.k() + cVar.i());
                cVar.r(vKList.i() > cVar.i());
                wttVar.b.invoke(vKList, Boolean.valueOf(this.c));
                return s3q0.a;
            case 1:
                com.vk.superapp.ui.a aVar = (com.vk.superapp.ui.a) this.e;
                SuperAppFragment superAppFragment = aVar.b;
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.d;
                it80 it80Var = (it80) obj;
                boolean a = it80Var.a();
                T t = it80Var.a;
                if (a || this.c) {
                    aVar.t2((n9n0) t, com.vk.superapp.ui.a.S1().e(), false);
                }
                n9n0 n9n0Var = (n9n0) t;
                String str = null;
                if (epx.f(n9n0Var != null ? n9n0Var.b : null, n9n0.a.b.a)) {
                    if (superAppFragment.isVisible() && superAppFragment.isResumed() && (bVar = superAppFragment.d0.b) != null && bVar.h && bVar.g == WidgetsLoadingState.NETWORK) {
                        SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = bVar.m;
                        if (schemeStat$TypeSuperappScreenItem == null) {
                            schemeStat$TypeSuperappScreenItem = bVar.e();
                        }
                        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP, SchemeStat$TypeAction.a.b(null, null, schemeStat$TypeSuperappScreenItem, 3)).q();
                        bVar.h = false;
                    }
                    if (n9n0Var != null && (num = n9n0Var.a.i) != null) {
                        str = num.toString();
                    }
                    cVar2.s(str);
                    cVar2.r(true ^ (str == null || str.length() == 0));
                }
                return s3q0.a;
            default:
                VideoFile videoFile = (VideoFile) this.d;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.e;
                VideoFile videoFile2 = (VideoFile) obj;
                VideoFileOld copy = videoFile.copy();
                InstreamAd U7 = videoFile2.U7();
                if (this.c) {
                    U7 = null;
                }
                copy.a0 = U7;
                copy.f = videoFile2.w9();
                if (videoFile.T1() && ((Boolean) videoAutoPlay.h0.getValue()).booleanValue()) {
                    copy.w0 = videoFile2.l6();
                }
                return copy;
        }
    }

    public /* synthetic */ vtt(boolean z, com.vk.superapp.ui.a aVar, com.vk.lists.c cVar) {
        this.b = 1;
        this.c = z;
        this.e = aVar;
        this.d = cVar;
    }
}
