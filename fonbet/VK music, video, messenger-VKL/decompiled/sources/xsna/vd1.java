package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoNewsMonothemeDto;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.i;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.log.L;
import com.vk.music.playlist.display.domain.LoadPlaylistTracksRequest;
import com.vk.repository.internal.repos.stickers.database.entity.ImagesConfigsEntity;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.b750;
import xsna.m1j;
import xsna.t7h;
import xsna.tj50;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vd1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ vd1(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ShortVideoShortVideoFullDto d;
        ShortVideoShortVideoNewsMonothemeDto W;
        String d2;
        SdkVideoFile sdkVideoFile;
        int i = 6;
        int i2 = 27;
        AttributeSet attributeSet = null;
        switch (this.b) {
            case 0:
                return AlbumChooseState.a((AlbumChooseState) obj, null, null, 0, false, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            case 1:
                return Long.valueOf(z4g.g((File) obj));
            case 2:
                int i3 = AppearanceSettingsWithBackgroundsFragment.b0;
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                return new nd4(((AudioBooksBoolResponseDto) obj).d().i() == 1);
            case 4:
                ((RequestUserProfile) obj).s.putInt("friend_request_status", 0);
                return s3q0.a;
            case 5:
                return new p7b(new VkCell(((ViewGroup) obj).getContext(), attributeSet, i, r7));
            case 6:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 7:
                Context context = (Context) obj;
                VkText vkText = new VkText(context, null, 6, 0);
                vkText.setTextAppearance(R.style.VkUiTypography_Caption1Medium);
                vkText.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, context));
                vkText.setSingleLine(true);
                return vkText;
            case 8:
                return s3q0.a;
            case 9:
                tj50.a aVar = (tj50.a) obj;
                n7h n7hVar = n7h.b;
                ao8 ao8Var = ao8.d;
                return new t7h.a.C3725a(aVar.a(n7hVar, ao8Var), aVar.a(o7h.b, ao8Var));
            case 10:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `stickers_image_configs`.`hash` AS `hash`, `stickers_image_configs`.`defaultConfig` AS `defaultConfig`, `stickers_image_configs`.`configs` AS `configs` FROM stickers_image_configs");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        String l2 = V0.l2(0);
                        int i4 = (int) V0.getLong(1);
                        String l22 = V0.l2(2);
                        Gson gson = psj.a;
                        arrayList.add(new ImagesConfigsEntity(l2, i4, (List) psj.a.fromJson(l22, new osj().getType())));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 11:
                return m1j.f.a;
            case 12:
                return 8;
            case 13:
                return Boolean.valueOf(((c9k) obj).v);
            case 14:
                yfn yfnVar = (yfn) obj;
                LoadPlaylistTracksRequest loadPlaylistTracksRequest = yfnVar.s;
                return Boolean.valueOf(loadPlaylistTracksRequest.e == LoadPlaylistTracksRequest.State.COMPLETED && loadPlaylistTracksRequest.c == yfnVar.j.size());
            case 15:
                wjs0.a(qwr0.a);
                return s3q0.a;
            case 16:
                return new vz40((ViewGroup) obj);
            case 17:
                nvy.c((nvy) obj, 8, new b40(i2), mfi.a, 4);
                return s3q0.a;
            case 18:
                return new k3s(R.layout.vk_view_default_list_loading, (ViewGroup) obj);
            case 19:
                return ((FStack) obj).zb();
            case 20:
                int i5 = FriendsRecommendationsFragment.b0;
                L.i((Throwable) obj);
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                return (w25) obj;
            case 23:
                SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) obj;
                k720 k720Var = k720.a;
                String str = (String) k720.d.getValue();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Preference.F(currentTimeMillis, "menu_items", str);
                k720.k = (int) currentTimeMillis;
                k720.B = null;
                pro0.f(new wzh(superAppAnimationConfig, 20));
                try {
                    Preference.H("menu_items", (String) k720.f.getValue(), ((Gson) k720.g.getValue()).toJson(superAppAnimationConfig));
                } catch (Throwable unused) {
                }
                return s3q0.a;
            case 24:
                return ((ef00) obj).b;
            case 25:
                tdu tduVar = (tdu) obj;
                tduVar.o(tduVar.I0(4));
                return s3q0.a;
            case 26:
                Counters counters = ((x130) obj).c;
                return Integer.valueOf(counters != null ? counters.c : 0);
            case 27:
                tj50.a aVar2 = (tj50.a) obj;
                d230 d230Var = new d230(true ? 1 : 0);
                ao8 ao8Var2 = ao8.d;
                return new i.a(aVar2.a(d230Var, ao8Var2), aVar2.a(new b40(26), ao8Var2), aVar2.a(new com.vk.movika.sdk.base.observable.e0(28), ao8Var2), aVar2.a(new tr0(i2), ao8Var2));
            case 28:
                ShortVideoGetGridShortVideosResponseDto shortVideoGetGridShortVideosResponseDto = (ShortVideoGetGridShortVideosResponseDto) obj;
                List<ShortVideoGetGridShortVideosFeedItemDto> d3 = shortVideoGetGridShortVideosResponseDto.f().d();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : d3) {
                    if (obj2 instanceof ShortVideoGetGridShortVideosFeedItemDto.ShortVideoFeedItemShortVideoFullDto) {
                        arrayList2.add(obj2);
                    }
                }
                ShortVideoGetGridShortVideosFeedItemDto.ShortVideoFeedItemShortVideoFullDto shortVideoFeedItemShortVideoFullDto = (ShortVideoGetGridShortVideosFeedItemDto.ShortVideoFeedItemShortVideoFullDto) j5g.a0(arrayList2);
                if (shortVideoFeedItemShortVideoFullDto == null || (d = shortVideoFeedItemShortVideoFullDto.d()) == null || (W = d.W()) == null || (d2 = W.d()) == null) {
                    throw new IllegalStateException("MonotopicGridLink Failed to retrieve monotopic header info");
                }
                List<wih0> list = jee.a(shortVideoGetGridShortVideosResponseDto).a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof wih0.a) {
                        arrayList3.add(obj3);
                    }
                }
                wih0.a aVar3 = (wih0.a) j5g.a0(arrayList3);
                if (aVar3 == null || (sdkVideoFile = aVar3.a) == null) {
                    throw new IllegalStateException("MonotopicGridLink Failed to retrieve first monotopic clip info");
                }
                return new Pair(d2, sdkVideoFile);
            default:
                return new b750.c(((tj50.a) obj).a(y650.b, ao8.d));
        }
    }
}
