package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketCreateItemReviewResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.channels.impl.comments.g;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import com.vk.dto.attaches.Attach;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.bg7;
import xsna.dmz;
import xsna.go20;
import xsna.tj50;
import xsna.tlo0;
import xsna.ujm;
import xsna.zg00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d37 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ d37(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Map unmodifiableMap;
        RetrieveBytesResponse.BlockstoreData blockstoreData;
        byte[] bArr;
        s3q0 onCreate$lambda$8;
        switch (this.b) {
            case 0:
                return new l4j(R.layout.vk_pay_checkout_connection_secure_item, (ViewGroup) obj);
            case 1:
                RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) obj;
                if (retrieveBytesResponse == null || (unmodifiableMap = Collections.unmodifiableMap(retrieveBytesResponse.d)) == null || (blockstoreData = (RetrieveBytesResponse.BlockstoreData) unmodifiableMap.get("metaInf")) == null || (bArr = blockstoreData.b) == null) {
                    return bg7.c.a.c;
                }
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.get();
                return new bg7.c.a(wrap.getInt(), wrap.getLong());
            case 2:
                L.C("CallSettingsFeature", (Throwable) obj);
                return s3q0.a;
            case 3:
                return Boolean.valueOf(epx.f(((UIBlock) obj).b, "video_kids_filter_fake_placeholder"));
            case 4:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, new g.a(false), null, false, 13);
            case 5:
                return ((User) obj).Cb(UserNameCase.NOM);
            case 6:
                return ((VkPaginationList) obj).b;
            case 7:
                return ClipsEntryPointsViewState.c.a;
            case 8:
                int i = CommunityAddressesFragment.E0;
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 9:
                MarketCreateItemReviewResponseDto marketCreateItemReviewResponseDto = (MarketCreateItemReviewResponseDto) obj;
                return new cak(marketCreateItemReviewResponseDto.e(), marketCreateItemReviewResponseDto.d());
            case 10:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_return_to_dialog, (Context) obj);
            case 11:
                return air.b('\'', "'", (String) obj);
            case 12:
                int i2 = ujm.n;
                return ujm.a.a((ViewGroup) obj);
            case 13:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 14:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                y6u0 y6u0Var = new y6u0((Context) obj);
                tlo0.Companion.getClass();
                y6u0Var.setText(new tlo0.h("Купить билеты"));
                return y6u0Var;
            case 17:
                int i3 = FriendsImportFragment.a0;
                L.i((Throwable) obj);
                return s3q0.a;
            case 18:
                onCreate$lambda$8 = FullScreenWebViewDisplay.onCreate$lambda$8((m180) obj);
                return onCreate$lambda$8;
            case 19:
                L.e((Throwable) obj);
                return s3q0.a;
            case 20:
                Integer m = arm0.m(10, ((File) obj).getName());
                return Integer.valueOf(m != null ? m.intValue() : 0);
            case 21:
                qpv qpvVar = (qpv) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(qpvVar.c);
                sb.append(qpvVar.a);
                sb.append(qpvVar.d);
                sb.append(qpvVar.b);
                return sb.toString();
            case 22:
                return dmz.c.a;
            case 23:
                tj50.a aVar = (tj50.a) obj;
                oc0 oc0Var = new oc0(28);
                ao8 ao8Var = ao8.d;
                return new zg00.a(aVar.a(new rvq(5), ao8Var), aVar.a(oc0Var, ao8Var));
            case 24:
                k720 k720Var = k720.a;
                k720.Y(null);
                pro0.f(new y620(true, r1));
                k720.n = 0L;
                return s3q0.a;
            case 25:
                ((zak0) go20.q).setValue((go20.f) obj);
                return s3q0.a;
            case 26:
                qgi0.r((tgi0) obj, "ModalTags.INPUT");
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((Attach) obj) instanceof MiniAppSnippetDataAttach);
            default:
                qgi0.r((tgi0) obj, "downloads_image_test_tag");
                return s3q0.a;
        }
    }
}
