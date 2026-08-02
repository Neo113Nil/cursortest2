package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.newtork.d;
import com.vk.dto.common.VideoFile;
import com.vk.profile.community.members.impl.domain.User;
import com.vk.profile.community.members.impl.ui.MembersState;
import com.vk.profile.community.members.impl.ui.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class etp implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ etp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List<User> list;
        switch (this.b) {
            case 0:
                VideoFile videoFile = ((ftp) this.c).a;
                int intValue = ((Integer) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean f = epx.f((com.vk.core.utils.newtork.d) obj3, d.a.a);
                int size = videoFile.Y3().size();
                ArrayList arrayList = new ArrayList(size);
                int i = 0;
                while (i < size) {
                    arrayList.add(new atp(videoFile, i, i == intValue && booleanValue, i == intValue, f));
                    i++;
                }
                return arrayList;
            case 1:
                tyq tyqVar = (tyq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1982687588, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:87)");
                    }
                    tyqVar.g(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1824921792, intValue3, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.footer.<anonymous> (GroupedNotificationListView.kt:222)");
                    }
                    jqu0.a(s200.E(q630.a.a, 16, 8), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 6, 14);
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new f3(izsVar, 4);
                        aVar2.R(x);
                    }
                    vwp.a(0, 1, aVar2, (gzs) x, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                a220 a220Var = (a220) this.c;
                MembersState membersState = (MembersState) obj2;
                com.vk.profile.community.members.impl.ui.c cVar = (com.vk.profile.community.members.impl.ui.c) obj3;
                if (cVar instanceof c.b) {
                    c.b bVar = (c.b) cVar;
                    List<User> list2 = bVar.a;
                    if (bVar.b) {
                        list = list2;
                    } else {
                        ArrayList u0 = j5g.u0(list2, membersState.c);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = u0.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (hashSet.add(((User) next).b)) {
                                arrayList2.add(next);
                            }
                        }
                        list = arrayList2;
                    }
                    return MembersState.a(membersState, false, list, bVar.c, bVar.d, null, null, 16);
                }
                if (cVar instanceof c.e) {
                    return MembersState.a(membersState, ((c.e) cVar).a, null, false, null, null, null, 30);
                }
                if (!(cVar instanceof c.C1634c)) {
                    if (cVar instanceof c.d) {
                        return MembersState.a(membersState, false, EmptyList.b, false, null, null, new MembersState.Error(MembersState.Error.Cause.ACCESS_TO_GROUP_DENIED), 16);
                    }
                    if (cVar instanceof c.f) {
                        return MembersState.a(membersState, false, null, false, null, null, new MembersState.Error(MembersState.Error.Cause.NETWORK_ERROR), 30);
                    }
                    if (cVar instanceof c.a) {
                        return MembersState.a(membersState, false, null, false, null, null, null, 31);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c.C1634c c1634c = (c.C1634c) cVar;
                MembersState a = MembersState.a(membersState, false, null, false, null, c1634c.a, null, 47);
                if (!c1634c.b) {
                    return a;
                }
                qwn qwnVar = a220Var.f;
                if (!qwnVar.c || !qwnVar.b) {
                    return a;
                }
                qwnVar.a();
                return a;
        }
    }
}
