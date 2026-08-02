package xsna;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.superapp.browser.internal.ui.menu.action.OtherAction;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import xsna.h8u;
import xsna.i8z;
import xsna.ne10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vf1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vf1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        UserId userId;
        int i = this.b;
        Long l = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((gg1) obj2).C(a.d.a((a.d) obj));
                return s3q0.a;
            case 1:
                L.e("[Push][Onboarding]: Dialog passed");
                ((d83) obj2).b.a((PromoSessionInfo) obj);
                return s3q0.a;
            case 2:
                ((izs) obj2).invoke(((gq7) obj).b);
                return s3q0.a;
            case 3:
                tca tcaVar = (tca) obj;
                androidx.recyclerview.widget.r rVar = ((lca) obj2).j;
                if (rVar != null) {
                    rVar.x(tcaVar);
                }
                return s3q0.a;
            case 4:
                return ((wgb) obj2).s + ": loadRecommendations: finished, load source: network, loaded=" + ((List) obj).size();
            case 5:
                fxj fxjVar = (fxj) obj;
                ((uxj) obj2).l.e(fxjVar.c, true ^ fxjVar.d);
                return s3q0.a;
            case 6:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_dialogs_list_time_etc), ((vlm) obj).f);
            case 7:
                ((g8u) obj2).n.b(((h8u.a) obj).b);
                return s3q0.a;
            case 8:
                GroupCellVh groupCellVh = (GroupCellVh) obj2;
                GroupSubscriptionState groupSubscriptionState = (GroupSubscriptionState) obj;
                Group group = groupCellVh.p;
                if (group != null) {
                    groupCellVh.a(groupSubscriptionState, group);
                }
                return s3q0.a;
            case 9:
                myc0.h((yvj) obj2, null, null, new dxu((fxu) obj, null), 3);
                return s3q0.a;
            case 10:
                AttachVideo attachVideo = (AttachVideo) obj2;
                Context context = (Context) obj;
                String T7 = attachVideo.b.T7();
                if (T7 != null && T7.length() != 0) {
                    g2v.c().k().p(context, T7, attachVideo.getFileName() + ".mp4");
                }
                return s3q0.a;
            case 11:
                Object obj3 = (Context) obj;
                ne10.a aVar = ((ne10) obj2).b;
                if (obj3 instanceof ey50) {
                    ((ey50) obj3).Y().S(aVar);
                }
                return s3q0.a;
            case 12:
                d98 d98Var = new d98((Activity) obj, new d140((e140) obj2));
                d98Var.d.setBackground(null);
                return d98Var;
            case 13:
                ho60 ho60Var = (ho60) obj2;
                mh60 mh60Var = (mh60) obj;
                return ((Boolean) ho60Var.f.getValue()).booleanValue() ? new sc60(ho60Var, mh60Var) : new q070(ho60Var, mh60Var);
            case 14:
                ArrayList arrayList = new ArrayList();
                ArrayList<qnf0> arrayList2 = ((com.vk.reefton.trackers.f) obj2).d;
                arrayList.addAll(arrayList2);
                arrayList2.clear();
                ((vof0) obj).a(new pnw(arrayList));
                return s3q0.a;
            case 15:
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = (SchemeStatSak$EventScreen) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (schemeStatSak$EventScreen != null) {
                    ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList4 = frf0.g.a.get(schemeStatSak$EventScreen);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList4.clear();
                }
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.RESTORE_ACCOUNT, arrayList3, null, null, 28);
                return s3q0.a;
            case 16:
                ((izs) obj2).invoke((MusicDto) obj);
                return s3q0.a;
            case 17:
                ((vrq0) obj2).p.B((f.c.r) obj);
                return s3q0.a;
            case 18:
                yks0 yks0Var = (yks0) obj;
                wzs<Boolean, String, s3q0> d = ((exr0) obj2).a.d();
                if (d != null) {
                    Boolean valueOf = Boolean.valueOf(yks0Var.e.U());
                    Owner s = yks0Var.e.s();
                    if (s != null && (userId = s.b) != null) {
                        l = Long.valueOf(userId.b);
                    }
                    ((i8z.b.c) d).invoke(valueOf, String.valueOf(l));
                }
                return s3q0.a;
            case 19:
                ((com.vk.superapp.browser.internal.ui.menu.action.n) obj2).i.d((OtherAction) obj);
                return s3q0.a;
            default:
                Context context2 = (Context) obj2;
                VkCellSkeleton vkCellSkeleton = (VkCellSkeleton) obj;
                int i2 = VkCellSkeleton.n;
                VkTextSkeleton vkTextSkeleton = new VkTextSkeleton(context2, null, 6, 0);
                vkTextSkeleton.setId(R.id.ds_internal_cell_skeleton_middle_subtitle);
                vkTextSkeleton.setArea(vkCellSkeleton.getArea());
                vkTextSkeleton.setShimmer(vkCellSkeleton.b);
                vkTextSkeleton.setShimmerManagedExternally(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size_l, context2));
                layoutParams.setMarginEnd(e3m.a(R.dimen.vk_ui_spacing_size_l, context2));
                layoutParams.topMargin = e3m.a(R.dimen.vk_ui_spacing_size2_xs, context2);
                vkTextSkeleton.setLayoutParams(layoutParams);
                vkTextSkeleton.setIncludeFontPadding(false);
                vkTextSkeleton.setTextAppearance(e3m.g(R.attr.vk_ui_typography_footnote, context2));
                return vkTextSkeleton;
        }
    }
}
