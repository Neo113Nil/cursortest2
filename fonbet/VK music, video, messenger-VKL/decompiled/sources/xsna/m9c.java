package xsna;

import androidx.compose.runtime.a;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import xsna.coc;
import xsna.dg70;
import xsna.doc;
import xsna.ln50;
import xsna.loh0;
import xsna.q630;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class m9c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m9c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        CharSequence a;
        int i = this.b;
        q630.a aVar = q630.a.a;
        Object obj3 = null;
        r3 = null;
        String str = null;
        Object obj4 = null;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n9c.a((l9c) obj6, (q630) obj5, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                h7v h7vVar = (h7v) obj6;
                syf syfVar = (syf) obj5;
                el50 el50Var = (el50) obj;
                coc cocVar = (coc) obj2;
                if (cocVar.equals(coc.b.b)) {
                    el50Var.W().c(doc.b.a);
                } else if (cocVar.equals(coc.c.b)) {
                    h7vVar.b(HintId.CLIPS_COAUTHORS_LIST_ONBOARDING.getId());
                } else if (cocVar instanceof coc.d) {
                    sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> W = el50Var.W();
                    UserId userId = ((coc.d) cocVar).b;
                    Iterator<T> it = ((ClipCoauthorListState) el50Var.W().getCurrentState()).c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((ClipCoauthorListItem) next).b.b.equals(userId)) {
                                obj4 = next;
                            }
                        }
                    }
                    ClipCoauthorListItem clipCoauthorListItem = (ClipCoauthorListItem) obj4;
                    if (clipCoauthorListItem != null && clipCoauthorListItem.f) {
                        r6 = true;
                    }
                    W.c(new doc.c(userId, r6));
                } else {
                    if (cocVar instanceof coc.a) {
                        if (!((ClipCoauthorListState) el50Var.W().getCurrentState()).d) {
                            return s3q0.a;
                        }
                        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> W2 = el50Var.W();
                        for (ClipCoauthorListItem clipCoauthorListItem2 : ((ClipCoauthorListState) el50Var.W().getCurrentState()).c) {
                            if (clipCoauthorListItem2.c) {
                                List<ClipCoauthorListItem> list = ((ClipCoauthorListState) el50Var.W().getCurrentState()).c;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj7 : list) {
                                    if (!((ClipCoauthorListItem) obj7).c) {
                                        arrayList.add(obj7);
                                    }
                                }
                                W2.c(new doc.a(clipCoauthorListItem2, arrayList, ((ClipCoauthorListState) el50Var.W().getCurrentState()).e));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (cocVar instanceof coc.f) {
                        if (!((ClipCoauthorListState) el50Var.W().getCurrentState()).d) {
                            return s3q0.a;
                        }
                        el50Var.D(el50Var, new lb(cocVar, 22));
                    } else {
                        if (!(cocVar instanceof coc.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        coc.e eVar = (coc.e) cocVar;
                        Iterator<T> it2 = ((ClipCoauthorListState) el50Var.W().getCurrentState()).c.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (((ClipCoauthorListItem) next2).b.b.equals(eVar.b)) {
                                    obj3 = next2;
                                }
                            }
                        }
                        ClipCoauthorListItem clipCoauthorListItem3 = (ClipCoauthorListItem) obj3;
                        if (clipCoauthorListItem3 != null) {
                            el50Var.D(el50Var, new iz(eVar, 21));
                            el50Var.f(el50Var, new qn50(0), ln50.a.a, new n37(clipCoauthorListItem3, syfVar, el50Var, eVar, 1));
                        }
                    }
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                d1h.a((loh0.c) obj6, (q630) obj5, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                uyh uyhVar = (uyh) obj6;
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj5;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = CommunityReviewsFragment.o0;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1452365301, intValue, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment.onBindViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityReviewsFragment.kt:441)");
                    }
                    q630 d = txj0.d(aVar, 1.0f);
                    CharSequence a2 = tlo0.b.a(uyhVar.a, communityReviewsFragment.requireContext());
                    String obj8 = a2 != null ? a2.toString() : null;
                    tlo0 tlo0Var = uyhVar.b;
                    if (tlo0Var != null && (a = tlo0Var.a(communityReviewsFragment.requireContext())) != null) {
                        str = a.toString();
                    }
                    String str2 = str;
                    boolean z = uyhVar.c;
                    boolean z2 = uyhVar.d;
                    boolean y = aVar2.y(communityReviewsFragment);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new sje(communityReviewsFragment, 10);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar2.y(communityReviewsFragment);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new cwg(communityReviewsFragment, 4);
                        aVar2.R(x2);
                    }
                    tyh.a(d, obj8, str2, z, z2, gzsVar, (gzs) x2, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((rep) obj6).c((q630) obj5, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((f6s) obj6).c7((q6s) obj5, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                lj40 lj40Var = (lj40) obj6;
                izs izsVar = (izs) obj5;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1438467744, intValue2, -1, "com.vk.music.offline.ui.presentation.MusicSettingsView.<anonymous>.<anonymous> (MusicDownloadsSettingsView.kt:60)");
                    }
                    lj40Var.getClass();
                    kj40.f(0, aVar3, d370.N(R.string.downloads_settings_title, 0, aVar3), izsVar, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                fg70.k((dg70.j) obj6, (izs) obj5, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                zol0 zol0Var = (zol0) obj6;
                izs izsVar2 = (izs) obj5;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1031101464, intValue3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreen.<anonymous>.<anonymous> (StorefrontServicesScreen.kt:86)");
                    }
                    rol0.b(zol0Var.b.a, izsVar2, ahn.E(aVar, "storefront_top_bar"), aVar4, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((p4q0) obj6).a((q630) obj5, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ m9c(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
