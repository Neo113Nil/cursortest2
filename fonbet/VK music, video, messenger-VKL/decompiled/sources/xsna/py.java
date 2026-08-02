package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dzenarticle.impl.domain.ReadStatState;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.ecomm.reviews.impl.communities.yclients.i;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import xsna.dug0;
import xsna.f5h0;
import xsna.tj50;
import xsna.wfu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class py implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ py(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        String str;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((ActionButton) obj).f == ActionButton.Type.DonutLevel);
            case 1:
                int i = AllHighlightsFragment.g0;
                qgi0.r((tgi0) obj, "done_button");
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                ((AnimatedCounterView) obj).b();
                return s3q0.a;
            case 3:
                return ((ri4) obj).c;
            case 4:
                qgi0.c((tgi0) obj);
                return s3q0.a;
            case 5:
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT \n            auto_download_track.id, \n            auto_download_track.uid, \n            auto_download_track.mid, \n            auto_download_track.downloading_state, \n            auto_download_track.size_in_bytes, \n            auto_download_track.auto_download_date,\n            auto_download_track.json_raw\n        FROM auto_download_track\n    ");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i2 = (int) V0.getLong(0);
                        UserId b = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i3 = (int) V0.getLong(3);
                        if (i3 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i3 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i3 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i3 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i3 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        arrayList.add(new xf5(i2, b, l2, downloadingState, V0.isNull(4) ? null : Long.valueOf(V0.getLong(4)), V0.isNull(5) ? null : Long.valueOf(V0.getLong(5)), V0.l2(6)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 6:
                uk10 uk10Var = (uk10) j5g.h0(((zk10) obj).a());
                return (uk10Var == null || (str = uk10Var.a) == null) ? "" : str;
            case 7:
                VKList vKList = (VKList) obj;
                Iterator<T> it = vKList.iterator();
                while (it.hasNext()) {
                    uh0.a((VideoFile) it.next());
                }
                return vKList;
            case 8:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 9:
                int i4 = ClipsGridCommonClipsListFragment.q0;
                return ((vee) obj).a;
            case 10:
                return s3q0.a;
            case 11:
                int i5 = naf.k1;
                qgi0.r((tgi0) obj, "ClipsTrendingHashtagBottomSheetButtonAddTestTag");
                return s3q0.a;
            case 12:
                return ((rmf) obj).j;
            case 13:
                return new wfu.a.c((jpe) obj);
            case 14:
                ((ojt) obj).l = f5h0.f.a;
                return s3q0.a;
            case 15:
                int i6 = CommunityAddressesFragment.E0;
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((UploadImageModel) obj).d() == null);
            case 17:
                return new tfu(n34.a(((ery) obj).a()));
            case 18:
                return new i.c(((tj50.a) obj).a(new ol(17), ao8.d));
            case 19:
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            case 20:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_show_attaches, (Context) obj);
            case 21:
                return String.valueOf(((Peer) obj).b);
            case 22:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -4194305, 2097151);
            case 23:
                return DzenArticleState.a((DzenArticleState) obj, null, new ReadStatState(0L, false, false, false, false, false, false, 127, null), null, null, null, false, 123);
            case 24:
                Intent intent = (Intent) obj;
                intent.putExtra("selection_limit", 1);
                intent.putExtra("single_mode", true);
                intent.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                intent.putExtra("camera_enabled", false);
                intent.putExtra("initialize_camera", false);
                intent.putExtra("enable_default_album_entries", false);
                intent.putExtra("prevent_styling", true);
                intent.putExtra("enable_orientation_locker", true);
                intent.putExtra("new_photo_editor_collage_context", true);
                return s3q0.a;
            case 25:
                return new ptk((ExtendedUserProfile) obj, false);
            case 26:
                int i7 = FriendsSelectionFragment.w0;
                return drm0.p0(((pno0) obj).d()).toString();
            case 27:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 28:
                Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                return ((BoundingBox) obj).geoJsonString(true);
            default:
                qgi0.r((tgi0) obj, "vk_banner_action_button_test_tag");
                return s3q0.a;
        }
    }

    public /* synthetic */ py(Object obj, int i) {
        this.b = i;
    }
}
