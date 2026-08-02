package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.photos.dto.PhotosPhotoUploadDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.clips.favorites.impl.ui.folders.renaming.view.ClipsFolderNameFormField;
import com.vk.clips.playlists.playlist_ui.model.PlaylistHeaderIconState;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.drafts.DraftsFeedRecyclerPaginatedView;
import com.vk.newsfeed.impl.helpers.a;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.gfc;
import xsna.mvu;
import xsna.qdd;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ve0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ve0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                L.e("AdDelegate", String.valueOf(((Throwable) obj).getMessage()));
                return s3q0.a;
            case 1:
                PhotosPhotoUploadDto photosPhotoUploadDto = (PhotosPhotoUploadDto) obj;
                return new ncq0(photosPhotoUploadDto.e(), photosPhotoUploadDto.d(), null, null, null, 28);
            case 2:
                return Boolean.valueOf(obj instanceof c860);
            case 3:
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        CatalogDataType catalogDataType = ((UIBlock) it.next()).e;
                        if (catalogDataType == CatalogDataType.DATA_TYPE_GROUPS_ITEMS || catalogDataType == CatalogDataType.DATA_TYPE_GROUPS) {
                            r1 = true;
                        }
                    }
                }
                return Boolean.valueOf(r1);
            case 4:
                return Boolean.valueOf(epx.f(((ke7) obj).g, Boolean.TRUE));
            case 5:
                return lw7.a;
            case 6:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 7:
                int i = BroadcastScheduledFragment.U;
                return Boolean.valueOf(((it80) obj).a != 0);
            case 8:
                return Boolean.valueOf(((UIBlock) obj) instanceof UIBlockMarketItem);
            case 9:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 10:
                return new gfc.e(((tj50.a) obj).a(yec.b, ao8.d));
            case 11:
                return new qdd.c.C3559c((hda) obj);
            case 12:
                String str = (String) obj;
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                return o260Var.a(str);
            case 13:
                ClipsDraftPersistentStore.d((ClipsDraftPersistentStore) obj);
                ClipsDraftPersistentStore.s();
                return s3q0.a;
            case 14:
                int i2 = ClipsFolderNameFormField.p;
                qgi0.r((tgi0) obj, "clips_favorites_folder_name_edit_text");
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((nmv) obj) instanceof ClipsGridHeaderEntry.b);
            case 16:
                return PlaylistHeaderIconState.None;
            case 17:
                mvu mvuVar = (mvu) obj;
                if (mvuVar instanceof mvu.b) {
                    return rsg0.w0(yfb.x(new ngj0().A(((mvu.b) mvuVar).a))).l(new ur(new zj(14), 9));
                }
                if (mvuVar instanceof mvu.a) {
                    return io.reactivex.rxjava3.core.x.k(EmptyList.b);
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                int i3 = z5h.j1;
                qgi0.r((tgi0) obj, "InviteLinkComAvatar");
                return s3q0.a;
            case 19:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 20:
                return new g.d(((tj50.a) obj).a(new pe1(18), ao8.d));
            case 21:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return m33.a(R.drawable.vk_icon_arrow_uturn_left_outline_28, (Context) obj);
            case 22:
                return new Pair((List) obj, Boolean.TRUE);
            case 23:
                Throwable th = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"DialogThemeLoader", ms9.b("Load error for default theme ", th)});
                }
                return s3q0.a;
            case 24:
                int i4 = DraftsFeedRecyclerPaginatedView.a0;
                qgi0.r((tgi0) obj, "drafts_feed_empty_state_placeholder_title");
                return s3q0.a;
            case 25:
                return Boolean.TRUE;
            case 26:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 27:
                return (WebGroup) j5g.Y((List) obj);
            case 28:
                return (kiu) ((it80) obj).a;
            default:
                return new a.C1382a(true, ((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
        }
    }
}
