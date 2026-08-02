package xsna;

import android.util.SparseBooleanArray;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.i1s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class eih implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eih(fih fihVar, p8u p8uVar, boolean z) {
        this.d = fihVar;
        this.e = p8uVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num;
        switch (this.b) {
            case 0:
                fih fihVar = (fih) this.d;
                p8u p8uVar = (p8u) this.e;
                boolean z = this.c;
                fihVar.q(p8u.i(p8uVar, null, null, null, false, false, null, null, null, null, z ? CommunityProfileContentItem.State.ERROR : p8uVar.w, z ? p8uVar.x : CommunityProfileContentItem.State.ERROR, null, 40959));
                break;
            default:
                i1s0 i1s0Var = (i1s0) this.d;
                com.vk.lists.c cVar = (com.vk.lists.c) this.e;
                fns0 fns0Var = (fns0) obj;
                ArrayList arrayList = fns0Var.a;
                List<Integer> list = fns0Var.b;
                int i = fns0Var.c;
                ArrayList arrayList2 = new ArrayList();
                i1s0.a aVar = i1s0Var.h;
                SparseBooleanArray sparseBooleanArray = i1s0Var.i;
                i1s0.b bVar = i1s0Var.g;
                if (aVar.getItemCount() == 0 && !fxc0.B().J().Q0()) {
                    if (epx.f(i1s0Var.b, i1s0Var.c.I0())) {
                        arrayList2.add(i1s0Var.f);
                    }
                    boolean contains = list.contains(-2);
                    bVar.e = contains;
                    sparseBooleanArray.put(-2, contains);
                    arrayList2.add(bVar);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    VideoAlbum videoAlbum = (VideoAlbum) it.next();
                    PrivacySetting.PrivacyRule privacyRule = videoAlbum.i.isEmpty() ? null : videoAlbum.i.get(0);
                    boolean z2 = privacyRule == null || Collections.singletonList(PrivacyRules.a.d).equals(privacyRule.zb());
                    boolean z3 = list.contains(Integer.valueOf(videoAlbum.b)) || i1s0Var.j.contains(Integer.valueOf(videoAlbum.b));
                    int i2 = videoAlbum.b;
                    arrayList2.add(new i1s0.b(i2, videoAlbum.c, !z2, true, z3 || ((num = i1s0Var.n) != null && i2 == num.intValue())));
                    sparseBooleanArray.put(videoAlbum.b, z3);
                }
                if (this.c) {
                    aVar.setItems(arrayList2);
                } else {
                    aVar.n0(arrayList2);
                }
                cVar.l(i);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ eih(i1s0 i1s0Var, boolean z, com.vk.lists.c cVar) {
        this.d = i1s0Var;
        this.c = z;
        this.e = cVar;
    }
}
