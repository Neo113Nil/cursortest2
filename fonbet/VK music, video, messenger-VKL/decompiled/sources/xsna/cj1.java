package xsna;

import android.content.Context;
import android.os.Parcel;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.clips.interests.impl.feature.ClipsInterestsState;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.button.group.VkCellButtonGroupLayout;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.b;
import com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.libvideo.bottomsheet.about.delegate.o;
import com.vk.log.L;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.toggle.b;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.qr60;
import xsna.ycu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cj1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ cj1(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        JSONObject a;
        JSONArray optJSONArray;
        int i = 3;
        switch (this.b) {
            case 0:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                Parcel obtain = Parcel.obtain();
                try {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    Serializer.g gVar = new Serializer.g(obtain);
                    gVar.i0(photoAlbum);
                    obtain.setDataPosition(0);
                    Serializer.StreamParcelable G = gVar.G(PhotoAlbum.class.getClassLoader());
                    obtain.recycle();
                    r12.f--;
                    return (PhotoAlbum) G;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            case 1:
                int i2 = kd5.$EnumSwitchMapping$0[((VideoNotificationsStatus) obj).ordinal()];
                if (i2 == 1) {
                    return o.a.C1219a.a;
                }
                if (i2 == 2) {
                    return o.a.c.a;
                }
                if (i2 == 3) {
                    return o.a.b.a;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                return Boolean.valueOf(((mka0) obj).c == null);
            case 3:
                int i3 = BasePhotoListFragment.m0;
                qgi0.r((tgi0) obj, "toolbar_title");
                return s3q0.a;
            case 4:
                return tav0.a(((JSONObject) obj).optJSONObject("items"), new oj(i)).b;
            case 5:
                hkr0 hkr0Var = (hkr0) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(hkr0Var.a);
                sb.append(hkr0Var.b);
                sb.append(hkr0Var.d);
                sb.append(hkr0Var.c);
                return sb.toString();
            case 6:
                L.e("CallPrimaryActions", "State received: " + ((k9d0) obj));
                return s3q0.a;
            case 7:
                Context context = (Context) obj;
                VkCellButtonGroupLayout vkCellButtonGroupLayout = new VkCellButtonGroupLayout(context, null, 6);
                vkCellButtonGroupLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                for (int i4 = 0; i4 < 3; i4++) {
                    VkGroupItem vkGroupItem = new VkGroupItem(context, null, 6);
                    vkGroupItem.setText("Button");
                    VkGroupItem.a(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_attach_24));
                    VkGroupItem.b(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_dropdown_outline_16), VkGroupItem.IconType.Dropdown, 2);
                    vkGroupItem.setCount(1);
                    vkGroupItem.setCounterAppearance(VkCounter.CounterAppearance.Appearance.Neutral);
                    vkGroupItem.setCounterMode(VkCounter.Mode.Tertiary);
                    vkGroupItem.setOnClickListener(new o44(0));
                    vkCellButtonGroupLayout.addView(vkGroupItem, vkCellButtonGroupLayout.generateLayoutParams((AttributeSet) null));
                }
                return vkCellButtonGroupLayout;
            case 8:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                b.a aVar = (b.a) obj;
                if (aVar == null || !puq.c(aVar, 3) || (a = puq.a(aVar)) == null || (optJSONArray = a.optJSONArray("priority_ids")) == null) {
                    return null;
                }
                return dz5.E(optJSONArray);
            case 11:
                TextView textView = (TextView) obj;
                textView.setTextAppearance(R.style.VkUiTypography_Caption2);
                textView.setTextSize(11.0f);
                textView.setMaxLines(5);
                return s3q0.a;
            case 12:
                return new ClipsInterestsViewState.a(0, ((ClipsInterestsState.c) obj).b);
            case 13:
                return new s930();
            case 14:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_avatar");
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((vzh) obj).c);
            case 17:
                return ((pno0) obj).d().toString();
            case 18:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_archive, (Context) obj);
            case 19:
                L.i((Throwable) obj);
                return s3q0.a;
            case 20:
                DialogTheme dialogTheme = (DialogTheme) ((it80) obj).a;
                return dialogTheme == null ? io.reactivex.rxjava3.internal.operators.single.a0.b : io.reactivex.rxjava3.core.x.k(dialogTheme);
            case 21:
                f9n f9nVar = (f9n) obj;
                return new i8n(new qr60.a.f(f9nVar.a, f9nVar.b, f9nVar.d), null, null);
            case 22:
                qgi0.r((tgi0) obj, "donut_new_banner_settings_button");
                return s3q0.a;
            case 23:
                return ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h) obj).c.b;
            case 24:
                return String.valueOf(((FaveTag) obj).b);
            case 25:
                am amVar = (am) obj;
                int i5 = FeedDigestHeader.n;
                amVar.u(true);
                amVar.o(true);
                return s3q0.a;
            case 26:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 27:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return Boolean.valueOf(((com.vk.ecomm.market.good.b) obj) instanceof b.C0946b);
            case 28:
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return (GroupsGroupFullDto) j5g.Y(d);
                }
                return null;
            default:
                cdu cduVar = (cdu) obj;
                int i6 = cduVar.b;
                return new ycu.c(i6 > 0, i6 < e43.h(cduVar.c));
        }
    }
}
