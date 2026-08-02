package xsna;

import android.content.Context;
import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.mvp.holder.video.ProfileBlockFilterVh;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.exr0;
import xsna.i8z;
import xsna.nfd0;
import xsna.sw50;
import xsna.vzw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class prd0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ prd0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId userId;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((qrd0) obj3).o.f((ird0) obj2, ((Integer) obj).intValue());
                return s3q0.a;
            case 1:
                ProfileBlockFilterVh profileBlockFilterVh = (ProfileBlockFilterVh) obj3;
                UIBlock uIBlock = (UIBlock) obj2;
                VkSubnavigationButton vkSubnavigationButton = profileBlockFilterVh.c;
                if (vkSubnavigationButton != null && vkSubnavigationButton.isActivated()) {
                    return s3q0.a;
                }
                profileBlockFilterVh.b.a((UIBlockActionFilter) uIBlock, false);
                return s3q0.a;
            case 2:
                l7l0 l7l0Var = (l7l0) obj3;
                StickerStockItem stickerStockItem = (StickerStockItem) obj2;
                o7l0 o7l0Var = l7l0Var.b;
                StickerStockItem stickerStockItem2 = l7l0Var.d;
                g7l0.Yg(o7l0Var, stickerStockItem2 != null ? stickerStockItem2 : null, stickerStockItem, l7l0Var.f, PackStylesListHolder.State.ERROR, 0, 48);
                return s3q0.a;
            case 3:
                azl azlVar = (azl) obj3;
                tny tnyVar = (tny) obj;
                ((wh50) obj2).setValue(new uco(byc0.b(azlVar.j1((int) (tnyVar.a() >> 32)), azlVar.j1((int) (tnyVar.a() & 4294967295L)))));
                return s3q0.a;
            case 4:
                ((zxm0) obj3).b.h((hyg0) obj, (py8) obj2);
                return s3q0.a;
            case 5:
                String str = (String) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                if (((tho0) obj3).a.c.length() > 0) {
                    qgi0.h(tgi0Var, str);
                }
                qgi0.r(tgi0Var, "TitleTags.INPUT");
                return s3q0.a;
            case 6:
                fpq0 fpq0Var = (fpq0) obj3;
                UserProfileAction.x xVar = (UserProfileAction.x) obj2;
                if (!((ExtendedUserProfile) obj).j0) {
                    fpq0Var.C(new UserProfileAction.d0.e.a(WallGetMode.OWNER));
                }
                if (xVar.b) {
                    jtq0 jtq0Var = fpq0Var.v;
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = jtq0Var.j;
                    if (izsVar == null) {
                        izsVar = null;
                    }
                    egc0 egc0Var = jtq0Var.m;
                    izsVar.invoke(new b.n.a((egc0Var == null ? null : egc0Var).q4()));
                }
                return s3q0.a;
            case 7:
                yks0 yks0Var = (yks0) obj2;
                exr0.a aVar = ((exr0) obj3).a;
                jyr0.a(R.drawable.vk_icon_check_circle_outline_28, R.string.video_subscribed_message, aVar.getActivity());
                wzs<Boolean, String, s3q0> d = aVar.d();
                if (d != null) {
                    Boolean valueOf = Boolean.valueOf(yks0Var.e.U());
                    Owner s = yks0Var.e.s();
                    ((i8z.b.c) d).invoke(valueOf, String.valueOf((s == null || (userId = s.b) == null) ? null : Long.valueOf(userId.b)));
                }
                return s3q0.a;
            case 8:
                k6t0 k6t0Var = (k6t0) obj3;
                DonutLevel donutLevel = (DonutLevel) obj2;
                sw50.n nVar = (sw50.n) k6t0Var.y.getValue();
                Context context = k6t0Var.c;
                List<DonutLevelDto> e = ((DonutGetLevelsResponseDto) obj).e();
                nfd0 nfd0Var = k6t0Var.G;
                nfd0.b bVar = nfd0Var.e;
                boolean z = epx.f(bVar != null ? bVar.c : null, PrivacyRules.f) && (epx.f(nfd0Var.g, DonutLevel.f) || nfd0Var.g == null);
                ArrayList arrayList = new ArrayList();
                if (z) {
                    arrayList.add(DonutLevel.f);
                }
                int h = e43.h(e);
                List<DonutLevelDto> list = e;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                int i2 = 0;
                for (Object obj4 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    DonutLevelDto donutLevelDto = (DonutLevelDto) obj4;
                    arrayList2.add(new DonutLevel(donutLevelDto.getId(), donutLevelDto.getTitle(), donutLevelDto.d(), i2 == h));
                    i2 = i3;
                }
                arrayList.addAll(arrayList2);
                nVar.a(context, donutLevel, arrayList, new r9c0(k6t0Var, 20));
                return s3q0.a;
            case 9:
                ljo0 ljo0Var = (ljo0) obj;
                ((izs) obj3).invoke(ljo0Var);
                ((wh50) obj2).setValue(ljo0Var);
                return s3q0.a;
            case 10:
                p3x0 p3x0Var = (p3x0) obj3;
                b0x0 b0x0Var = (b0x0) obj2;
                if (p3x0Var.a != 0) {
                    b0x0Var.l.c(new vzw0.d(p3x0Var));
                }
                return s3q0.a;
            default:
                com.vk.superapp.widget_settings.p004new.b bVar2 = (com.vk.superapp.widget_settings.p004new.b) obj2;
                if (((WidgetSettingsModalOpenSource) obj3) == WidgetSettingsModalOpenSource.ERROR_DIALOG) {
                    bVar2.e.onNext(Boolean.TRUE);
                }
                bVar2.c.onNext(EmptyList.b);
                return s3q0.a;
        }
    }
}
