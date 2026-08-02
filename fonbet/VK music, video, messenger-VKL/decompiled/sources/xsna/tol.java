package xsna;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.textclassifier.TextClassification;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.newsfeed.api.data.NewsfeedSearchList;
import com.vk.superapp.api.dto.story.actions.WebActionSticker;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.erx;
import xsna.orx;
import xsna.qn60;
import xsna.vol;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tol implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tol(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 2;
        int i2 = 27;
        int i3 = 1;
        int i4 = 0;
        switch (this.b) {
            case 0:
                vco0 vco0Var = (vco0) this.c;
                Context context = (Context) this.d;
                jdo0 jdo0Var = (jdo0) this.e;
                boj bojVar = (boj) obj;
                List<uco0> list = vco0Var.a;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    uco0 uco0Var = list.get(i5);
                    if (uco0Var instanceof edo0) {
                        edo0 edo0Var = (edo0) uco0Var;
                        boj.b(bojVar, new hq5(edo0Var, 5), ((edo0) uco0Var).c == 0 ? null : new jai(-1930700965, new vol.a(edo0Var), true), new cm(12, edo0Var, jdo0Var), 6);
                    } else if (uco0Var instanceof kdo0) {
                        kdo0 kdo0Var = (kdo0) uco0Var;
                        if (context != null) {
                            int i6 = kdo0Var.c;
                            TextClassification textClassification = kdo0Var.b;
                            if (i6 < 0) {
                                dv4 dv4Var = new dv4(textClassification, 11);
                                Drawable icon = textClassification.getIcon();
                                boj.b(bojVar, dv4Var, icon != null ? new jai(-1123224187, new bdo0(icon), true) : null, new q2m0(i, context, textClassification), 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i6);
                                boj.b(bojVar, new bn7(remoteAction, 14), ((i6 == 0) || remoteAction.shouldShowIcon()) ? new jai(-1261173016, new cdo0(remoteAction), true) : null, new wt30(remoteAction, i2), 6);
                            }
                        }
                    } else if (uco0Var instanceof ido0) {
                        bojVar.a.add(fei.b);
                    }
                }
                return s3q0.a;
            case 1:
                return DzenArticleState.a((DzenArticleState) obj, null, null, null, null, new xi0((zu50) this.c, (cw50) this.d, (fe0) this.e), false, 95);
            case 2:
                z4w z4wVar = (z4w) this.c;
                String str = (String) this.d;
                Peer peer = (Peer) this.e;
                int intValue = ((Integer) obj).intValue();
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                io.reactivex.rxjava3.core.x n = hg1.n(a1wVar.C(z4wVar, new s8j(str, o25.a().L())), z4wVar.getContext(), false, null, 62);
                asu0 asu0Var = asu0.a;
                z4wVar.e.b(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(n.q(asu0Var.c()), new nu0(new com.vk.libvideo.b(17, z4wVar, str), 26)), new ju1(new x4w(peer, intValue, z4wVar), i2)).m(asu0Var.d()).h(new wnt(new cqv(z4wVar, i3), i)).subscribe(new wf1(new v4w(z4wVar, i4), 28)));
                return s3q0.a;
            case 3:
                drx drxVar = (drx) this.c;
                String str2 = (String) this.d;
                erx erxVar = (erx) this.e;
                GroupsGetFriendsInvitationListResponseDto groupsGetFriendsInvitationListResponseDto = (GroupsGetFriendsInvitationListResponseDto) obj;
                drxVar.T(new orx.d.e(false));
                ArrayList W = drxVar.W(groupsGetFriendsInvitationListResponseDto.i());
                List<UserId> d = frx.d(erxVar);
                lps lpsVar = erxVar instanceof erx.c ? ((erx.c) erxVar).c : null;
                drxVar.T(new orx.d.g(str2, s101.j(d.size(), Integer.valueOf(lpsVar != null ? lpsVar.a : Integer.MAX_VALUE), s101.i(W, d)), groupsGetFriendsInvitationListResponseDto.g()));
                return s3q0.a;
            case 4:
                NewsfeedSearchList newsfeedSearchList = (NewsfeedSearchList) this.c;
                qn60.c cVar = (qn60.c) obj;
                return new vy60(cVar.a, cVar.b, newsfeedSearchList, newsfeedSearchList.i(), (SpannableString) this.d, (String) this.e);
            case 5:
                Post post = (Post) this.c;
                Context context2 = (Context) this.d;
                Runnable runnable = (Runnable) this.e;
                ce60.b.getClass();
                p870.f().e(100, post);
                p870.f().e(105, (Post) obj);
                iuc0 iuc0Var = iuc0.b;
                iuc0.j0(context2, iuc0.i0(post.m));
                if (runnable != null) {
                    runnable.run();
                }
                return s3q0.a;
            case 6:
                WebActionSticker webActionSticker = (WebActionSticker) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                i700 i700Var = (i700) obj;
                int i7 = webActionSticker.b;
                return i7 != 0 ? new s690(i7, webActionSticker.c, i700Var, str3, str4) : new v800(i700Var, str3, i7, str4);
            default:
                ConstraintLayout constraintLayout = (ConstraintLayout) this.c;
                hcp0 hcp0Var = (hcp0) this.d;
                df30 df30Var = (df30) this.e;
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                Context context3 = constraintLayout.getContext();
                int i8 = R.dimen.video_topshelf_content_margin_horizontal;
                int a = e3m.a(R.dimen.video_topshelf_content_margin_horizontal, context3);
                Context context4 = constraintLayout.getContext();
                if (hcp0Var.u.e) {
                    i8 = R.dimen.video_topshelf_tablet_margins_horizontal;
                }
                int a2 = e3m.a(i8, context4);
                bVar.k = wbp0.a(df30Var);
                if (hcp0Var.u.e) {
                    bVar.t = 0;
                }
                bVar.setMargins(a2, 0, a2, a);
                return s3q0.a;
        }
    }
}
