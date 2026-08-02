package xsna;

import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.messagetemplates.impl.details.TemplateDetailsFragment;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment.c;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class m2h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2h(VideoFile videoFile, c6s0 c6s0Var) {
        this.b = 7;
        this.c = videoFile;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.b;
        int i2 = 5;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                final CommunityEventsFragment communityEventsFragment = (CommunityEventsFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = CommunityEventsFragment.P;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-418387149, intValue, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsFragment.onCreateView.<anonymous>.<anonymous> (CommunityEventsFragment.kt:86)");
                    }
                    boolean y = aVar.y(communityEventsFragment);
                    Object x = aVar.x();
                    if (y || x == c0012a) {
                        x = new pcg(communityEventsFragment, 3);
                        aVar.R(x);
                    }
                    izs izsVar = (izs) x;
                    boolean y2 = aVar.y(communityEventsFragment);
                    Object x2 = aVar.x();
                    if (y2 || x2 == c0012a) {
                        x2 = communityEventsFragment.new c(null);
                        aVar.R(x2);
                    }
                    r37.a(izsVar, (yzs) x2, kai.c(-1174312883, new zzs() { // from class: xsna.l2h
                        @Override // xsna.zzs
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            CommunityEventsState communityEventsState = (CommunityEventsState) obj5;
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj6;
                            int intValue2 = ((Integer) obj7).intValue();
                            qcy<Object>[] qcyVarArr2 = CommunityEventsFragment.P;
                            if ((intValue2 & 48) == 0) {
                                intValue2 |= aVar2.J(communityEventsState) ? 32 : 16;
                            }
                            if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1174312883, intValue2, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CommunityEventsFragment.kt:107)");
                                }
                                rrv0.d(null, null, null, null, kai.c(-123133624, new bta(3, communityEventsState, CommunityEventsFragment.this), aVar2), aVar2, 24576, 15);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                syl.b((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                f6s f6sVar = (f6s) obj3;
                MotionEvent motionEvent = (MotionEvent) obj;
                Rect rect = (Rect) obj2;
                q6s q6sVar = (q6s) ((zak0) f6sVar.I).getValue();
                if (q6sVar == null) {
                    q6sVar = f6sVar.j7();
                }
                if (q6sVar != null) {
                    NewsEntry newsEntry = q6sVar.h0;
                    if (di60.Q(newsEntry) != null) {
                        if (newsEntry instanceof Post) {
                            Post post = (Post) newsEntry;
                            if (post.Tb() && post.jc()) {
                                z = true;
                                if (!di60.H(newsEntry) && !z) {
                                    r8 = f6sVar.E.b(f6sVar.G, rect, f6sVar, f6sVar.p7(q6sVar, new i4(i2, f6sVar, q6sVar)), motionEvent, q6sVar.g0, q6sVar.h0, f6sVar.u, !f6sVar.F.g());
                                }
                            }
                        }
                        z = false;
                        if (!di60.H(newsEntry)) {
                            r8 = f6sVar.E.b(f6sVar.G, rect, f6sVar, f6sVar.p7(q6sVar, new i4(i2, f6sVar, q6sVar)), motionEvent, q6sVar.g0, q6sVar.h0, f6sVar.u, !f6sVar.F.g());
                        }
                    }
                }
                return Boolean.valueOf(r8);
            case 3:
                ImportContactsFragment importContactsFragment = (ImportContactsFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = ImportContactsFragment.Q;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(565258941, intValue2, -1, "com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment.onCreateView.<anonymous> (ImportContactsFragment.kt:54)");
                    }
                    po40 po40Var = new po40();
                    boolean y3 = aVar2.y(importContactsFragment);
                    Object x3 = aVar2.x();
                    if (y3 || x3 == c0012a) {
                        x3 = new sop(importContactsFragment, 16);
                        aVar2.R(x3);
                    }
                    po40Var.b((izs) x3, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1723824691, intValue3, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidScreen.<anonymous> (LinkVKBidScreen.kt:41)");
                    }
                    boolean J = aVar3.J(izsVar2);
                    Object x4 = aVar3.x();
                    if (J || x4 == c0012a) {
                        x4 = new q0(izsVar2, i2);
                        aVar3.R(x4);
                    }
                    gdz.a((gzs) x4, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((kh00) obj3).l(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                TemplateDetailsFragment templateDetailsFragment = (TemplateDetailsFragment) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr2 = TemplateDetailsFragment.R;
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-145133714, intValue4, -1, "com.vk.messagetemplates.impl.details.TemplateDetailsFragment.onCreateView.<anonymous>.<anonymous> (TemplateDetailsFragment.kt:43)");
                    }
                    nzw nzwVar = templateDetailsFragment.P;
                    qcy<Object> qcyVar = TemplateDetailsFragment.R[0];
                    r8o0 r8o0Var = (r8o0) nzwVar.getValue();
                    TemplateDetailsFragment.b bVar = (TemplateDetailsFragment.b) templateDetailsFragment.Q.getValue();
                    boolean y4 = aVar4.y(bVar);
                    Object x5 = aVar4.x();
                    if (y4 || x5 == c0012a) {
                        TemplateDetailsFragment.c cVar = new TemplateDetailsFragment.c(1, bVar, TemplateDetailsFragment.b.class, "handleEvent", "handleEvent(Lcom/vk/messagetemplates/impl/details/TemplateDetailsEvent;)V", 0);
                        aVar4.R(cVar);
                        x5 = cVar;
                    }
                    q8o0.a(r8o0Var, (izs) ((fcy) x5), aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 7:
                VideoFile videoFile = (VideoFile) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList();
                for (Serializer.StreamParcelableAdapter streamParcelableAdapter : arrayList) {
                    if (streamParcelableAdapter instanceof UIBlockVideo) {
                        UIBlockVideo uIBlockVideo = (UIBlockVideo) streamParcelableAdapter;
                        VideoFile videoFile2 = uIBlockVideo.B;
                        VideoFile videoFile3 = uIBlockVideo.B;
                        if (epx.f(videoFile2.a1(), videoFile.a1())) {
                            if (videoFile.X() || !brm0.v(uIBlockVideo.K, "my/bookmarks", false)) {
                                VideoFileOld copy = videoFile.copy();
                                copy.W = videoFile3.r();
                                boolean z2 = (videoFile3.t9() == null && videoFile3.H1() == null) ? false : true;
                                boolean z3 = (copy.m1 == null && copy.n1 == null) ? false : true;
                                if (z2 && !z3) {
                                    copy.m1 = videoFile3.t9();
                                    copy.n1 = videoFile3.H1();
                                }
                                streamParcelableAdapter = kwp0.b(uIBlockVideo, copy);
                            } else {
                                streamParcelableAdapter = null;
                            }
                        }
                    }
                    if (streamParcelableAdapter != null) {
                        arrayList2.add(streamParcelableAdapter);
                    }
                }
                return new UIBlockList(uIBlockList, arrayList2);
            default:
                ((Integer) obj2).getClass();
                ((vmx0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ m2h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ m2h(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
