package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusResponseDto;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorDecisionState;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorPendingItem;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.im.design.view.placeholder.ImChipPlaceholder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.fnc;
import xsna.gnd;
import xsna.hnd;
import xsna.jdh0;
import xsna.ln50;
import xsna.pnc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tnc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tnc(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                final ClipVideoFile clipVideoFile = (ClipVideoFile) obj5;
                final qmd qmdVar = (qmd) obj4;
                ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType = (ClipCoauthorsDecisionLaunchType) obj3;
                final el50 el50Var = (el50) obj;
                fnc fncVar = (fnc) obj2;
                if (fncVar instanceof fnc.d) {
                    rdi.y(el50Var, new a8(fncVar, 23));
                } else {
                    boolean z = fncVar instanceof fnc.a;
                    ln50.a.b bVar = ln50.a.a;
                    if (z) {
                        List<ClipCoauthorPendingItem> list = ((ClipCoauthorDecisionState) el50Var.W().getCurrentState()).b;
                        final ArrayList arrayList = new ArrayList();
                        for (ClipCoauthorPendingItem clipCoauthorPendingItem : list) {
                            UserId userId = clipCoauthorPendingItem.c ? clipCoauthorPendingItem.b.b : null;
                            if (userId != null) {
                                arrayList.add(userId);
                            }
                        }
                        final int size = ((ClipCoauthorDecisionState) el50Var.W().getCurrentState()).b.size();
                        final boolean z2 = ((fnc.a) fncVar).b;
                        el50Var.f(el50Var, new qn50(0), bVar, new izs() { // from class: xsna.vnc
                            @Override // xsna.izs
                            public final Object invoke(Object obj6) {
                                awg0 awg0Var = (awg0) obj6;
                                final ClipVideoFile clipVideoFile2 = ClipVideoFile.this;
                                int i2 = clipVideoFile2.c;
                                UserId userId2 = clipVideoFile2.b;
                                qmd qmdVar2 = qmdVar;
                                final ArrayList arrayList2 = arrayList;
                                final boolean z3 = z2;
                                io.reactivex.rxjava3.internal.operators.observable.e3 b = qmdVar2.b(i2, userId2, arrayList2, z3);
                                final el50 el50Var2 = el50Var;
                                final int i3 = size;
                                yvg0 b2 = awg0.a.b(awg0Var, b, null, null, new io.reactivex.rxjava3.functions.f() { // from class: xsna.wnc
                                    @Override // io.reactivex.rxjava3.functions.f
                                    public final void accept(Object obj7) {
                                        ClipVideoFile clipVideoFile3 = ClipVideoFile.this;
                                        List<CoOwnerItem> list2 = clipVideoFile3.N1;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator<T> it = list2.iterator();
                                        while (true) {
                                            boolean hasNext = it.hasNext();
                                            boolean z4 = z3;
                                            ArrayList arrayList4 = arrayList2;
                                            if (!hasNext) {
                                                wjs0.a(new fyr0(ClipVideoFile.Kb(clipVideoFile3, false, null, null, arrayList3, null, null, null, 8355839)));
                                                wjs0.a(pwr0.a);
                                                el50 el50Var3 = el50Var2;
                                                el50Var3.W().c(new pnc.b(new hnd.b(z4, arrayList4.size(), i3)));
                                                el50Var3.W().c(pnc.a.a);
                                                return;
                                            }
                                            CoOwnerItem coOwnerItem = (CoOwnerItem) it.next();
                                            if (arrayList4.contains(coOwnerItem.b)) {
                                                coOwnerItem = z4 ? CoOwnerItem.zb(coOwnerItem, CoOwnerItem.StatusDto.APPROVED, null, null, 29) : null;
                                            }
                                            if (coOwnerItem != null) {
                                                arrayList3.add(coOwnerItem);
                                            }
                                        }
                                    }
                                }, 3);
                                return new fvg0(b2.b(), b2.e());
                            }
                        });
                    } else if (fncVar instanceof fnc.b) {
                        List<ClipCoauthorPendingItem> list2 = ((ClipCoauthorDecisionState) el50Var.W().getCurrentState()).b;
                        final ArrayList arrayList2 = new ArrayList();
                        for (ClipCoauthorPendingItem clipCoauthorPendingItem2 : list2) {
                            UserId userId2 = clipCoauthorPendingItem2.c ? clipCoauthorPendingItem2.b.b : null;
                            if (userId2 != null) {
                                arrayList2.add(userId2);
                            }
                        }
                        ClipCoauthorsDecisionLaunchType.DeleteClip deleteClip = clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeleteClip ? (ClipCoauthorsDecisionLaunchType.DeleteClip) clipCoauthorsDecisionLaunchType : null;
                        final UserId userId3 = deleteClip != null ? deleteClip.b : null;
                        el50Var.f(el50Var, new qn50(0), bVar, new izs() { // from class: xsna.unc
                            @Override // xsna.izs
                            public final Object invoke(Object obj6) {
                                awg0 awg0Var = (awg0) obj6;
                                final ClipVideoFile clipVideoFile2 = ClipVideoFile.this;
                                int i2 = clipVideoFile2.c;
                                UserId userId4 = clipVideoFile2.b;
                                qmd qmdVar2 = qmdVar;
                                final ArrayList arrayList3 = arrayList2;
                                io.reactivex.rxjava3.internal.operators.observable.e3 b = qmdVar2.b(i2, userId4, arrayList3, false);
                                final UserId userId5 = userId3;
                                final el50 el50Var2 = el50Var;
                                yvg0 b2 = awg0.a.b(awg0Var, b, null, null, new io.reactivex.rxjava3.functions.f() { // from class: xsna.xnc
                                    @Override // io.reactivex.rxjava3.functions.f
                                    public final void accept(Object obj7) {
                                        ArrayList arrayList4;
                                        List list3 = (List) obj7;
                                        ClipVideoFile clipVideoFile3 = ClipVideoFile.this;
                                        List<CoOwnerItem> list4 = clipVideoFile3.N1;
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator<T> it = list4.iterator();
                                        while (true) {
                                            boolean hasNext = it.hasNext();
                                            arrayList4 = arrayList3;
                                            if (!hasNext) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (!arrayList4.contains(((CoOwnerItem) next).b)) {
                                                arrayList5.add(next);
                                            }
                                        }
                                        ClipVideoFile Kb = ClipVideoFile.Kb(clipVideoFile3, false, null, null, arrayList5, null, null, null, 8355839);
                                        List list5 = list3;
                                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                            Iterator it2 = list5.iterator();
                                            while (it2.hasNext()) {
                                                if (!((ShortVideoSetCoOwnerStatusResponseDto) it2.next()).d()) {
                                                    break;
                                                }
                                            }
                                        }
                                        wjs0.a(new fyr0(Kb));
                                        wjs0.a(pwr0.a);
                                        if (j5g.P(arrayList4, userId5)) {
                                            wjs0.a(new wxr0(Kb, null, null, 6));
                                        }
                                        el50 el50Var3 = el50Var2;
                                        el50Var3.W().c(new pnc.b(new hnd.a(arrayList4.size())));
                                        el50Var3.W().c(pnc.a.a);
                                    }
                                }, 3);
                                return new fvg0(b2.b(), b2.e());
                            }
                        });
                    } else {
                        if (!fncVar.equals(fnc.c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        el50Var.W().c(pnc.a.a);
                    }
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((zse) obj5).g((ite) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 2:
                tlo0 tlo0Var = (tlo0) obj5;
                ImChipPlaceholder imChipPlaceholder = (ImChipPlaceholder) obj4;
                com.vk.movika.sdk.base.model.props.a aVar = (com.vk.movika.sdk.base.model.props.a) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = ImChipPlaceholder.c;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1168816662, intValue, -1, "com.vk.im.design.view.placeholder.ImChipPlaceholder.setChip.<anonymous> (ImChipPlaceholder.kt:44)");
                    }
                    rrv0.a(null, null, kai.c(-1878710674, new qq0(tlo0Var, imChipPlaceholder, aVar, 3), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                qqz.c((gnd.a.C2950a) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                kj40.f(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj5, (izs) obj3, (q630) obj4);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ps70.a((String) obj5, (gzs) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ei80.a((wh50) obj5, (Map) obj4, (String) obj3, (androidx.compose.runtime.a) obj, ne7.I(3511));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                jch0.b((jdh0.a) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ tnc(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
