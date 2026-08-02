package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.rnm0;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ag9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ag9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int intValue;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                final dg9 dg9Var = (dg9) obj5;
                final ClipGridParams.Data data = (ClipGridParams.Data) obj4;
                final ClipCameraParams clipCameraParams = (ClipCameraParams) obj3;
                final ActionLink actionLink = (ActionLink) obj2;
                final View view = (View) obj;
                final LaunchContext launchContext = new LaunchContext(false, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855);
                gzs gzsVar = new gzs() { // from class: xsna.bg9
                    @Override // xsna.gzs
                    public final Object invoke() {
                        dg9 dg9Var2 = dg9Var;
                        fee feeVar = dg9Var2.a;
                        ActionLink actionLink2 = ActionLink.this;
                        View view2 = view;
                        if (actionLink2 != null) {
                            return Boolean.valueOf(maz.c(xwk.d().e(), view2.getContext(), actionLink2.e, launchContext, null, null, 24));
                        }
                        ClipGridParams.Data data2 = data;
                        ClipGridParams.OnlyId zb = data2.zb();
                        ClipGridParams.OnlyId.Audio audio = zb instanceof ClipGridParams.OnlyId.Audio ? (ClipGridParams.OnlyId.Audio) zb : null;
                        String str = audio != null ? audio.b : null;
                        ClipCameraParams clipCameraParams2 = clipCameraParams;
                        if (str == null) {
                            feeVar.h2(data2, clipCameraParams2);
                            return s3q0.a;
                        }
                        if (dg9Var2.c != null) {
                            int l = krv0.l(R.attr.vk_ui_icon_accent);
                            view2.getContext();
                            e.b bVar = new e.b(view2, null, null, l, 6);
                            bVar.w = R.layout.ds_internal_context_menu_item;
                            VkContextMenu.c.c(bVar, R.string.clips_use_sound_btn_text, m33.a(R.drawable.vk_icon_music_outline_24, e43.a), false, null, new cg9(dg9Var2, view2, data2, clipCameraParams2, 0), 28);
                            VkContextMenu.c.c(bVar, R.string.clips_select_template_btn_text, m33.a(R.drawable.vk_icon_cards_2_outline_28, e43.a), false, null, new com.vk.newsfeed.common.recycler.holders.attachments.a(dg9Var2, data2, clipCameraParams2), 28);
                            bVar.g(R.attr.vk_ui_icon_accent_themed);
                            bVar.a().i(true);
                        } else if (!j8.d(view2.getContext())) {
                            feeVar.h2(data2, clipCameraParams2);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        return s3q0.a;
                    }
                };
                if (!(data instanceof ClipGridParams.Data.Hashtag)) {
                    gzsVar.invoke();
                } else if (!g620.f().k0().a(view.getContext())) {
                    gzsVar.invoke();
                }
                break;
            case 1:
                UserProfile userProfile = (UserProfile) obj5;
                FriendsItemListVh friendsItemListVh = (FriendsItemListVh) obj4;
                Context context = (Context) obj3;
                Integer num = (Integer) obj;
                userProfile.v = 1;
                jzi0 jzi0Var = friendsItemListVh.g;
                UserId userId = userProfile.c;
                ((HashSet) jzi0Var.a).add(userId);
                boolean remove = ((HashSet) jzi0Var.b).remove(userId);
                friendsItemListVh.d(context, (UIBlockProfile) obj2);
                if (!userProfile.z && (((intValue = num.intValue()) == 1 || intValue == 4) && !remove)) {
                    zls.o(ams.a(), context, false, 6);
                }
                break;
            case 2:
                fw20 fw20Var = (fw20) obj5;
                String str = (String) obj3;
                String str2 = (String) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                fdj0 fdj0Var = fw20Var.e;
                c5f c5fVar = new c5f(fw20Var, 28);
                qcy<Object>[] qcyVarArr = qgi0.a;
                tgi0Var.a(wfi0.v, new ck((String) obj4, c5fVar));
                SheetValue sheetValue = (SheetValue) ((zak0) fdj0Var.b.f).getValue();
                SheetValue sheetValue2 = SheetValue.PartiallyExpanded;
                if (sheetValue == sheetValue2) {
                    tgi0Var.a(wfi0.t, new ck(str, new fg1(13, fdj0Var, fw20Var)));
                } else if (fdj0Var.b.e().f(sheetValue2)) {
                    tgi0Var.a(wfi0.u, new ck(str2, new com.vk.newsfeed.common.recycler.holders.attachments.a(19, fdj0Var, fw20Var)));
                }
                break;
            case 3:
                rnm0 rnm0Var = (rnm0) obj5;
                View view2 = (View) obj4;
                gzs gzsVar2 = (gzs) obj3;
                gzs gzsVar3 = (gzs) obj2;
                List list = (List) obj;
                bpn0 bpn0Var = xfa0.a;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(xfa0.a((PhotosPhotoDto) it.next()));
                }
                ImageViewer.c n = rnm0Var.c.n(view2.getContext(), 0, arrayList, new snm0(rnm0Var, gzsVar2, gzsVar3));
                rnm0.a aVar = rnm0Var.e;
                rnm0Var.e = aVar != null ? rnm0.a.a(aVar, n, 15) : null;
                break;
            default:
                sum0 sum0Var = (sum0) obj5;
                VkSubnavigationBar vkSubnavigationBar = (VkSubnavigationBar) obj;
                sum0.k(vkSubnavigationBar, (sum0.c) obj4, new wow((List) obj3), (izs) obj2);
                vkSubnavigationBar.setVerticalPaddingEnabled(((Boolean) ((zak0) sum0Var.i).getValue()).booleanValue());
                vkSubnavigationBar.setBackground(((Boolean) ((zak0) sum0Var.j).getValue()).booleanValue() ? new ColorDrawable(f870.H(sum0Var.h)) : null);
                break;
        }
        return s3q0.a;
    }
}
