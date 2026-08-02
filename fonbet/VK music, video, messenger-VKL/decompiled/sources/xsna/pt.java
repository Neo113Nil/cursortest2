package xsna;

import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.market.dto.MarketGetCartTotalQuantityResponseDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.reviews.impl.communities.yclients.i;
import com.vk.fave.fragments.FavesFragment;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.photos.root.albumdetails.presentation.views.AlbumDetailsDescriptionView;
import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import xsna.g6f0;
import xsna.my;
import xsna.tj50;
import xsna.ym7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pt(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object wxr0Var;
        int i = 3;
        boolean z = true;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "authorClipCounter");
                return s3q0.a;
            case 1:
                return ((my.a) obj).c;
            case 2:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 3:
                ywu ywuVar = (ywu) obj;
                AlbumDetailsDescriptionView albumDetailsDescriptionView = ywuVar.p;
                return albumDetailsDescriptionView.getVisibility() != 0 ? ywuVar.itemView : albumDetailsDescriptionView;
            case 4:
                int i2 = AllHighlightsFragment.g0;
                qgi0.r((tgi0) obj, "cancel_button");
                return s3q0.a;
            case 5:
                AnimatedCounterView animatedCounterView = (AnimatedCounterView) obj;
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                animatedCounterView.requestLayout();
                animatedCounterView.invalidate();
                return s3q0.a;
            case 6:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                return s3q0.a;
            case 7:
                return new ti4(((tj50.a) obj).a(new ol(i), ao8.d));
            case 8:
                g6f0 g6f0Var = (g6f0) obj;
                return g6f0Var instanceof g6f0.b ? Boolean.valueOf(epx.f(((g6f0.b) g6f0Var).a.c, o25.a().c())) : Boolean.FALSE;
            case 9:
                return ((ym7.c) obj).c;
            case 10:
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof fyr0) {
                    VideoFile videoFile = ((fyr0) bwr0Var).a;
                    uh0.a(videoFile);
                    wxr0Var = new fyr0(videoFile);
                } else {
                    if (!(bwr0Var instanceof wxr0)) {
                        return bwr0Var;
                    }
                    VideoFile videoFile2 = ((wxr0) bwr0Var).a;
                    uh0.a(videoFile2);
                    wxr0Var = new wxr0(videoFile2, null, null, 6);
                }
                return wxr0Var;
            case 11:
                int i3 = CallParticipantsFragment.W;
                return Boolean.valueOf(!((VoipViewModelState) obj).h());
            case 12:
                MarketGetCartTotalQuantityResponseDto marketGetCartTotalQuantityResponseDto = (MarketGetCartTotalQuantityResponseDto) obj;
                int count = marketGetCartTotalQuantityResponseDto.getCount();
                m6d0 b = eno.b(marketGetCartTotalQuantityResponseDto.e());
                String d = marketGetCartTotalQuantityResponseDto.d();
                if (d != null && d.length() != 0) {
                    z = false;
                }
                String d2 = marketGetCartTotalQuantityResponseDto.d();
                if (d2 == null) {
                    d2 = "";
                }
                return new adp0(count, b, z, d2);
            case 13:
                L.j((Throwable) obj, "Catalog");
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                int i4 = ChannelFragment.a1;
                return Boolean.valueOf(((sxp) obj) instanceof wb80);
            case 16:
                L.i((Throwable) obj);
                return s3q0.a;
            case 17:
                return (ClipsDraftPersistentStore.Drafts) ClipsDraftPersistentStore.Drafts.c.a(new JSONObject(((Cursor) obj).getString(0)));
            case 18:
                Serializer.c<ClipsVideoItemLocation> cVar = ClipsVideoItemLocation.CREATOR;
                return e43.m(ClipsVideoItemLocation.a.a((Location) obj));
            case 19:
                qgi0.r((tgi0) obj, "AUTHOR_SUBSCRIBE_BUTTON_TEST_TAG");
                return s3q0.a;
            case 20:
                return Boolean.valueOf(!(((com.vk.photo.editor.features.colorgrading.a) obj).d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            case 21:
                return ((GroupsFieldsDto) obj).k();
            case 22:
                return new i.a(((tj50.a) obj).a(new yy(19), ao8.d));
            case 23:
                return 0;
            case 24:
                return DescriptionState.a((DescriptionState) obj, null, false, 3);
            case 25:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_receive_msgs_disable, (Context) obj);
            case 26:
                return Boolean.valueOf(((p680) obj).c);
            case 27:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM excluded_packs_stickers");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 28:
                tgi0 tgi0Var = (tgi0) obj;
                int i5 = FavesFragment.j0;
                qgi0.r(tgi0Var, "fave_toolbar_back_test_tag");
                qgi0.h(tgi0Var, y8g0.e(R.string.accessibility_toolbar_back));
                return s3q0.a;
            default:
                return fpf0.a(((dcr) obj).getClass());
        }
    }

    public /* synthetic */ pt(uh0 uh0Var) {
        this.b = 10;
    }
}
