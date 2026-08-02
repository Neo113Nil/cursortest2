package xsna;

import com.vk.im.engine.commands.messages.GetRecentClipIdsCmd;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.af20;
import xsna.dcm;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class acm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ acm(Object obj, int i, long j, long j2, int i2) {
        this.b = i2;
        this.f = obj;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                dcm dcmVar = (dcm) this.f;
                Dialog dialog = (Dialog) obj;
                if (dialog.Ub() == 0) {
                    return EmptyList.b;
                }
                GetRecentClipIdsCmd.RecentClipsFilter recentClipsFilter = dcmVar.a.C().a() ? GetRecentClipIdsCmd.RecentClipsFilter.RECENT_INC_AND_OUT_CLIPS : GetRecentClipIdsCmd.RecentClipsFilter.RECENT_ALL_CLIPS;
                f1w f1wVar = dcmVar.b;
                GetRecentClipIdsCmd.RecentClipsFilter recentClipsFilter2 = GetRecentClipIdsCmd.RecentClipsFilter.RECENT_INC_AND_OUT_CLIPS;
                int i = this.c;
                af20.a aVar = (af20.a) bz2.c(new af20(this.d, dialog.Ub(), recentClipsFilter == recentClipsFilter2 ? i * 3 : i, Collections.singletonList(MediaType.CLIP), f1wVar.a()), "DialogClipsContextRepositoryImpl.MessagesGetHistoryClipsApiCmd");
                long j = this.e / 1000;
                ArrayList arrayList = aVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((j8v) obj2).d >= j) {
                        arrayList2.add(obj2);
                    }
                }
                int i2 = dcm.b.$EnumSwitchMapping$0[recentClipsFilter.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return j5g.H0(dcm.d(arrayList2), i);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = i > 2 ? i / 2 : 1;
                int i4 = i - i3;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((j8v) next).b == f1wVar.a().d) {
                        arrayList3.add(next);
                    } else {
                        arrayList4.add(next);
                    }
                }
                Pair pair = new Pair(arrayList3, arrayList4);
                List list = (List) pair.d();
                return j5g.u0(dcm.d(j5g.H0((List) pair.g(), i3)), dcm.d(j5g.H0(list, i4)));
            default:
                ib90 ib90Var = (ib90) this.f;
                int i5 = ib90Var.b;
                boolean z = ib90Var.c;
                int i6 = i5 - (z ? 1 : 0);
                final int i7 = this.c - (z ? 1 : 0);
                final long j2 = this.d;
                final long j3 = this.e;
                nvy.c((nvy) obj, i6, null, new jai(106813418, new zzs() { // from class: xsna.eb90
                    @Override // xsna.zzs
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int intValue = ((Integer) obj4).intValue();
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                        int intValue2 = ((Integer) obj6).intValue();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= aVar2.o(intValue) ? 32 : 16;
                        }
                        if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(106813418, intValue2, -1, "com.vk.clips.design.compose.pager.indicationItems.<anonymous> (PagerIndicator.kt:173)");
                            }
                            ja8.a(hr80.m(txj0.q(rte0.d(q630.a.a, vog0.a), hb90.b), intValue == i7 ? j2 : j3, androidx.compose.ui.graphics.e.a), aVar2, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, true), 6);
                return s3q0.a;
        }
    }
}
