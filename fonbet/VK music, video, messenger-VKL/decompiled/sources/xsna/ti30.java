package xsna;

import com.ironsource.X3;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.b;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ti30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ti30(int i, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = serializable;
        this.f = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0184  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Integer num;
        CommunityProfileContent.InitialPosition initialPosition;
        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar;
        Iterator it;
        Object obj2;
        Iterator it2;
        Object obj3;
        Object obj4;
        CommunityProfileContentItem s;
        int i = this.b;
        boolean z = true;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                w2w w2wVar = (w2w) obj8;
                ui30 ui30Var = (ui30) obj7;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj6;
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj5;
                gtx0 L = w2wVar.I0().o().L(ui30Var.c);
                if (!(L instanceof MsgFromUser) || !((com.vk.im.engine.models.messages.a) L).D3(AttachVideoMsg.class, false)) {
                    return s3q0.a;
                }
                MsgFromUser msgFromUser = (MsgFromUser) L;
                jjx jjxVar = new jjx(ui30Var, 9);
                msgFromUser.getClass();
                Attach Q7 = com.vk.im.engine.models.messages.a.Q7(msgFromUser, jjxVar, true);
                if (Q7 instanceof AttachVideoMsg) {
                    AttachVideoMsg attachVideoMsg = (AttachVideoMsg) Q7;
                    if (attachVideoMsg.J3()) {
                        List<Peer.Type> list = com.vk.im.engine.utils.a.b;
                        if (!com.vk.im.engine.utils.a.i(attachVideoMsg.b.getDuration())) {
                            return s3q0.a;
                        }
                        ref$BooleanRef.element = true;
                        ref$LongRef.element = msgFromUser.c;
                        attachVideoMsg.m = 0;
                        w2wVar.I0().o().s0(Q7);
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            case 1:
                String str = (String) obj8;
                v100 v100Var = (v100) obj7;
                r820 r820Var = (r820) obj6;
                v95 v95Var = (v95) obj5;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof hwr0) {
                    if (epx.f(((hwr0) bwr0Var).a.zb(), str)) {
                        v100Var.invoke();
                    }
                } else if (bwr0Var instanceof jwr0) {
                    jwr0 jwr0Var = (jwr0) bwr0Var;
                    if (epx.f(jwr0Var.a.zb(), str)) {
                        r820Var.invoke(jwr0Var.a);
                    }
                } else if (bwr0Var instanceof iwr0) {
                    StringBuilder sb = new StringBuilder();
                    iwr0 iwr0Var = (iwr0) bwr0Var;
                    long j = iwr0Var.b;
                    int i2 = iwr0Var.a;
                    if (epx.f(r11.b(sb, j, '_', i2), str)) {
                        v95Var.invoke(Long.valueOf(iwr0Var.b), Integer.valueOf(i2));
                    }
                }
                return s3q0.a;
            default:
                ynq0 ynq0Var = (ynq0) obj8;
                ContentTab contentTab = (ContentTab) obj7;
                Integer num2 = (Integer) obj6;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj5;
                List list2 = (List) obj;
                boolean z2 = contentTab != null;
                boolean z3 = num2 == null;
                ynq0Var.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z4 = list2.size() > 1 && z3 && bwd0.d(extendedUserProfile);
                int i3 = 0;
                for (Object obj9 : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    ExtendedUserProfile.m mVar = (ExtendedUserProfile.m) obj9;
                    boolean z5 = (z4 && mVar.a.equals(X3.i.Z) && ynq0Var.f.m(HintId.USER_PROFILE_MAIN_WALL_TAB_ONBOARDING)) ? z : false;
                    if (mVar == null) {
                        s = null;
                    } else {
                        clj cljVar = ynq0Var.n;
                        String str2 = mVar.a;
                        Iterator<T> it3 = cljVar.b.values().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj4 = it3.next();
                                if (epx.f(((wmq0) obj4).v(), str2)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        wmq0 wmq0Var = (wmq0) obj4;
                        s = wmq0Var != null ? wmq0Var.s(mVar, z2, z5) : null;
                    }
                    if (s != null) {
                        arrayList.add(s);
                    }
                    i3 = i4;
                    z = true;
                }
                if (contentTab != null) {
                    Iterator it4 = arrayList.iterator();
                    int i5 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (!epx.f(((CommunityProfileContentItem) next).a.d(), contentTab.d())) {
                                i5++;
                            }
                        } else {
                            i5 = -1;
                        }
                    }
                    num = i5 == -1 ? null : Integer.valueOf(i5);
                } else {
                    num = null;
                }
                if (num2 != null) {
                    final int intValue = num2.intValue();
                    Integer g = i7o0.g(arrayList, new izs() { // from class: xsna.xnq0
                        @Override // xsna.izs
                        public final Object invoke(Object obj10) {
                            Integer d = ((CommunityProfileContentItem) obj10).a.d();
                            return Boolean.valueOf(d != null && d.intValue() == intValue);
                        }
                    });
                    if (g != null) {
                        initialPosition = new CommunityProfileContent.InitialPosition(g.intValue(), num2.intValue() == R.string.profile_content_tab_clips ? CommunityProfileContent.InitialPosition.ScrollToContentType.NONE : CommunityProfileContent.InitialPosition.ScrollToContentType.SMOOTH);
                        izsVar = ynq0Var.i;
                        if (izsVar == null) {
                            izsVar = null;
                        }
                        UserProfile userProfile = extendedUserProfile.a;
                        UserId userId = userProfile.c;
                        String str3 = userProfile.e;
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = null;
                            } else {
                                obj2 = it.next();
                                if (((CommunityProfileContentItem) obj2).g()) {
                                }
                            }
                        }
                        CommunityProfileContentItem communityProfileContentItem = (CommunityProfileContentItem) obj2;
                        ContentTab contentTab2 = communityProfileContentItem == null ? communityProfileContentItem.a : null;
                        boolean d = bwd0.d(extendedUserProfile);
                        it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = null;
                            } else {
                                obj3 = it2.next();
                                if (((CommunityProfileContentItem) obj3).h == 17) {
                                }
                            }
                        }
                        izsVar.invoke(new b.e(new CommunityProfileContent(userId, (List) arrayList, contentTab2, str3, ((CommunityProfileContentItem) obj3) == null ? false : d, num, initialPosition, false, extendedUserProfile.B1, (Pair) extendedUserProfile.U1, 128)));
                        return s3q0.a;
                    }
                }
                initialPosition = null;
                izsVar = ynq0Var.i;
                if (izsVar == null) {
                }
                UserProfile userProfile2 = extendedUserProfile.a;
                UserId userId2 = userProfile2.c;
                String str32 = userProfile2.e;
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                CommunityProfileContentItem communityProfileContentItem2 = (CommunityProfileContentItem) obj2;
                if (communityProfileContentItem2 == null) {
                }
                boolean d2 = bwd0.d(extendedUserProfile);
                it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                izsVar.invoke(new b.e(new CommunityProfileContent(userId2, (List) arrayList, contentTab2, str32, ((CommunityProfileContentItem) obj3) == null ? false : d2, num, initialPosition, false, extendedUserProfile.B1, (Pair) extendedUserProfile.U1, 128)));
                return s3q0.a;
        }
    }

    public /* synthetic */ ti30(sd9 sd9Var, String str, v100 v100Var, r820 r820Var, v95 v95Var) {
        this.b = 1;
        this.c = str;
        this.d = v100Var;
        this.e = r820Var;
        this.f = v95Var;
    }
}
