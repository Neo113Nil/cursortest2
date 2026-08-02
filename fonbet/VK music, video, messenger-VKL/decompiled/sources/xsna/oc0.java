package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.cbm;
import xsna.io8;
import xsna.ite;
import xsna.nbj;
import xsna.pqc;
import xsna.tlo0;
import xsna.y6u;
import xsna.y6u0;
import xsna.zg00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class oc0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ oc0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        ImageSize Cb;
        switch (this.b) {
            case 0:
                rn rnVar = (rn) obj;
                String str2 = rnVar.a;
                Integer num = rnVar.b;
                if (str2 != null) {
                    t31 t31Var = pc0.a;
                    pc0.e(new t31(str2, num.intValue()));
                }
                return s3q0.a;
            case 1:
                int i = AllHighlightsFragment.g0;
                qgi0.r((tgi0) obj, "edit_button");
                return s3q0.a;
            case 2:
                return "";
            case 3:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, null, 991);
            case 4:
                qgi0.c((tgi0) obj);
                return s3q0.a;
            case 5:
                return io.reactivex.rxjava3.core.q.H((Throwable) obj);
            case 6:
                VkBadge vkBadge = new VkBadge((Context) obj, null, 6);
                vkBadge.setAppearance(new VkBadge.Appearance.a(new x7g(R.attr.vk_ui_icon_accent)));
                return vkBadge;
            case 7:
                return Integer.valueOf(((BookingServicesScreenState.ServiceWrapper) obj).b.m);
            case 8:
                return Long.valueOf(com.vk.core.files.a.I((File) obj));
            case 9:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                return arrayList;
            case 10:
                return Boolean.valueOf(((BaseOkResponseDto) obj).i() == BaseOkResponseDto.OK.i());
            case 11:
                return Boolean.valueOf(((pqc.a) obj) instanceof pqc.a.c);
            case 12:
                return k9q0.r((List) obj);
            case 13:
                return ite.a.b.a;
            case 14:
                int i2 = CommunityAddressesFragment.E0;
                return mcr0.j(Uri.parse(((Group) obj).e), ImageScreenSize.SIZE_28DP);
            case 15:
                return j5g.D0(new nbj.b(), j5g.D0(new nbj.a(), (List) obj));
            case 16:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_unarchive);
            case 17:
                cbm.a aVar = (cbm.a) obj;
                Dialog dialog = aVar.c;
                ProfilesInfo profilesInfo = aVar.e;
                Integer a = aVar.b.a();
                return (dialog == null || profilesInfo == null || a == null) ? io8.a.a : new io8.b(a.intValue(), profilesInfo, dialog, aVar.d);
            case 18:
                vh30 vh30Var = (vh30) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(vh30Var.a.b);
                sb.append(JwtParser.SEPARATOR_CHAR);
                sb.append(vh30Var.b.ordinal());
                return sb.toString();
            case 19:
                return new o9n((ViewGroup) obj);
            case 20:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 21:
                y6u0 y6u0Var = new y6u0((Context) obj);
                tlo0.Companion.getClass();
                y6u0Var.setText(new tlo0.h("Цель «Собираю на новый iPad Pro с миру по нитке голому рубаха"));
                y6u0Var.setLeft(new y6u0.a.b(0.25f));
                return y6u0Var;
            case 22:
                int i3 = FriendsSelectionFragment.w0;
                return s3q0.a;
            case 23:
                return y6u.a.c.b;
            case 24:
                return s3q0.a;
            case 25:
                qgi0.r((tgi0) obj, "more_button");
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                List<UserProfile> list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (UserProfile userProfile : list2) {
                    UserId userId = userProfile.c;
                    Image image = userProfile.O;
                    if (image == null || (Cb = image.Cb(wlz.d, true, false)) == null || (str = Cb.d.d) == null) {
                        str = userProfile.h;
                    }
                    arrayList2.add(new mlz(userId, str, userProfile.e));
                }
                return arrayList2;
            case 28:
                return new zg00.b(((dh00) obj).e);
            default:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
        }
    }

    public /* synthetic */ oc0(wlz wlzVar) {
        this.b = 27;
    }
}
