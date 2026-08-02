package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetRecommendationsResponseDto;
import com.vk.core.preference.Preference;
import com.vk.core.store.entity.models.StoriesEventsStack;
import com.vk.dto.common.data.ApiApplication;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.log.L;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.newsfeed.posting.geo_picker.presentation.c;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.GroupAdminLevel;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.go20;
import xsna.ptd0;
import xsna.rb20;
import xsna.tj50;
import xsna.ve10;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qcw implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qcw(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                int i = ImSettingsDialogThemeFragment.c0;
                return !((Boolean) obj).booleanValue() ? io.reactivex.rxjava3.core.a.k(new Exception("changes not saved")) : io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 1:
                return (LocationSearchState.a) ((oyz) obj);
            case 2:
                return new c.f((List) obj);
            case 3:
                return s3q0.a;
            case 4:
                return ve10.a.c.a;
            case 5:
                return oc4.d((AudioAudioDto) obj);
            case 6:
                wmi0.a.m("key_menu_games_list", (List) obj);
                k720 k720Var = k720.a;
                String str = (String) k720.b.getValue();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Preference.F(currentTimeMillis, "menu_items", str);
                k720.i = (int) currentTimeMillis;
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((rb20) obj) instanceof rb20.a);
            case 8:
                ((zak0) go20.p).setValue((go20.c) obj);
                return s3q0.a;
            case 9:
                if (obj instanceof ApiApplication) {
                    return (ApiApplication) obj;
                }
                return null;
            case 10:
                return ((dc70) obj).b;
            case 11:
                return Boolean.valueOf(((ib50) obj).a.Vb());
            case 12:
                return Integer.valueOf(((List) obj).size());
            case 13:
                return ana0.a((ana0) obj, null, null, null, true, false, null, null, null, null, null, null, null, 16351);
            case 14:
                PlacePickerState placePickerState = (PlacePickerState) obj;
                boolean z2 = placePickerState.l;
                List<yqa0> list = placePickerState.c;
                boolean z3 = placePickerState.m;
                String str2 = placePickerState.e;
                List<yqa0> list2 = placePickerState.b;
                PlacePickerState.LoadingState loadingState = placePickerState.f;
                if (loadingState == PlacePickerState.LoadingState.RELOADING) {
                    return c.e.a;
                }
                if (list2.isEmpty() && loadingState == PlacePickerState.LoadingState.ERROR) {
                    return c.C1414c.a;
                }
                if (drm0.p0(str2).toString().length() > 0 && !list2.isEmpty()) {
                    return new c.g(z3, list);
                }
                if (drm0.p0(str2).toString().length() > 0) {
                    return c.b.a;
                }
                boolean z4 = placePickerState.k;
                return (z4 || z2) ? new c.f(z4, z2) : !list2.isEmpty() ? new c.d(list) : c.a.a;
            case 15:
                List<AudioAudioDto> d = ((AudioGetRecommendationsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                return arrayList;
            case 16:
                return PlaylistScreenState.a((PlaylistScreenState) obj, PlaylistScreenInfoDataState.Failed.b, null, false, false, null, null, null, 1915);
            case 17:
                L.l("Failed to sync last author");
                return s3q0.a;
            case 18:
                PostingState.Editing editing = (PostingState.Editing) obj;
                GroupWallPostingSettings groupWallPostingSettings = editing.x().h;
                boolean z5 = groupWallPostingSettings != null ? groupWallPostingSettings.b && groupWallPostingSettings.e != GroupAdminLevel.MODERATOR : editing.getContext().d;
                PostEditingReason postEditingReason = editing.h;
                boolean z6 = ((postEditingReason instanceof PostEditingReason.EditExistingPost) && !((PostEditingReason.EditExistingPost) postEditingReason).b && editing.j.o == null && editing.i.o == null) ? false : true;
                if (z5 && z6) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                return ptd0.b.a;
            case 20:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -1, 2043);
            case 21:
                return Boolean.valueOf(((sy40) obj).e.d);
            case 22:
                float floatValue = ((Float) obj).floatValue();
                return Float.valueOf(floatValue * floatValue * floatValue * floatValue * floatValue);
            case 23:
                qgi0.r((tgi0) obj, "RootTags.TOOLBAR_TITLE");
                return s3q0.a;
            case 24:
                return new plv(((Integer) obj).intValue());
            case 25:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 26:
                return new ywi0.e(((tj50.a) obj).a(new j5n(25), ao8.d));
            case 27:
                tdu tduVar = (tdu) obj;
                tduVar.Y0(f370.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                tduVar.A(4.0f);
                tduVar.B(4.0f);
                return s3q0.a;
            case 28:
                return io.reactivex.rxjava3.core.x.k(((StoriesEventsStack) obj).d());
            default:
                return new Pair(null, (Throwable) obj);
        }
    }
}
