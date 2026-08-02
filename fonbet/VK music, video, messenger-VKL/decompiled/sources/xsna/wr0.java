package xsna;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.view.components.divider.VkSeparator;
import com.vk.core.view.components.text.VkText;
import com.vk.debug.ui.dev.DebugDevHintsFragment;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.users.User;
import com.vk.log.L;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.i;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import java.util.ArrayList;
import java.util.List;
import xsna.mkq;
import xsna.tj50;
import xsna.vre;
import xsna.yzx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wr0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wr0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 24;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return ((AdditionalSettingsState.Data) obj).o;
            case 1:
                return Boolean.valueOf(((yj40) obj) instanceof uq3);
            case 2:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return Boolean.TRUE;
            case 3:
                Context context = (Context) obj;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                View vkSeparator = new VkSeparator(context, null, 6);
                vkSeparator.setId(R.id.clip_badge_trailing_separator);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(cn70.b(3), cn70.b(0), cn70.b(5), cn70.b(0));
                vkSeparator.setLayoutParams(marginLayoutParams);
                linearLayout.addView(vkSeparator);
                VkText vkText = new VkText(context, null, 6, 0);
                vkText.setId(R.id.clip_badge_trailing_label);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.setMargins(cn70.b(0), cn70.b(0), cn70.b(2), cn70.b(0));
                vkText.setLayoutParams(marginLayoutParams2);
                vkText.setSingleLine(true);
                vkText.setIncludeFontPadding(false);
                vkText.setTextAppearance(R.style.VkUiTypography_Caption1Medium);
                linearLayout.addView(vkText);
                return linearLayout;
            case 4:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 5:
                return Long.valueOf(((Peer) obj).b);
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "checkout_form_field_input");
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                int i3 = gne.j1;
                qgi0.r((tgi0) obj, "clips_not_interested_action_icon_tag");
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((vre.b) obj).m != null);
            case 11:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_back_icon");
                return s3q0.a;
            case 12:
                qgi0.r((tgi0) obj, "priority_block_ads_promotion_btn");
                return s3q0.a;
            case 13:
                int i4 = DebugDevHintsFragment.W;
                return ((pno0) obj).d().toString();
            case 14:
                tj50.a aVar = (tj50.a) obj;
                xr0 xr0Var = new xr0(26);
                ao8 ao8Var = ao8.d;
                return new i.a(aVar.a(xr0Var, ao8Var), aVar.a(new sd4(20), ao8Var), aVar.a(new z13(16), ao8Var), aVar.a(new od3(29), ao8Var), aVar.a(new io3(14), ao8Var), aVar.a(new dh5(i), ao8Var), aVar.a(new cj1(23), ao8Var), aVar.a(new byo(i2), ao8Var));
            case 15:
                tj50.a aVar2 = (tj50.a) obj;
                sc scVar = new sc(i);
                ao8 ao8Var2 = ao8.d;
                return new mkq.b(aVar2.a(scVar, ao8Var2), aVar2.a(new tc(21), ao8Var2));
            case 16:
                return s3q0.a;
            case 17:
                ucp ucpVar = ucp.a;
                ucp.i((Editable) obj);
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 19:
                List<UsersUserFullDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (UsersUserFullDto usersUserFullDto : list) {
                    arrayList.add(new ba7(usersUserFullDto.s1(), usersUserFullDto.r2(), rq.a(usersUserFullDto, new StringBuilder(), ' ')));
                }
                return arrayList;
            case 20:
                return s3q0.a;
            case 21:
                User user = (User) obj;
                return Boolean.valueOf((user.i || user.j || user.ka()) ? false : true);
            case 22:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.g);
            case 23:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 24:
                b5w b5wVar = (b5w) obj;
                StringBuilder sb = new StringBuilder("{id=");
                sb.append(b5wVar.a);
                sb.append(", type=");
                sb.append(b5wVar.b);
                sb.append(", pl=(");
                return i5s.a(sb, b5wVar.c, ")}");
            case 25:
                int i5 = ImStickerView.p;
                return s3q0.a;
            case 26:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 27:
                int i6 = ItemsDialogWrapper.S;
                qgi0.r((tgi0) obj, "items_toolbar_title");
                return s3q0.a;
            case 28:
                return new yzx.b(((tj50.a) obj).a(qzx.b, ao8.d));
            default:
                qgi0.r((tgi0) obj, "geo_picker_item_subtitle");
                return s3q0.a;
        }
    }
}
