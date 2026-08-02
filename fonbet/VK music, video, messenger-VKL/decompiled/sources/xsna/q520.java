package xsna;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.photos.dto.PhotosGetResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.utils.newtork.d;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.media.MediaFilteringStrategy;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vk.video.ui.discovery.minimizable.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import xsna.lct0;
import xsna.qr60;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q520 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ q520(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        boolean z = true;
        r2 = true;
        boolean z2 = true;
        z = true;
        z = true;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return ((Playlist) obj).y;
            case 2:
                return new tt70(5, 0L, rli0.A(rli0.y(rli0.p(new i5g((List) obj), new jz30(z ? 1 : 0)), 2)));
            case 3:
                qgi0.r((tgi0) obj, "downloads_settings_appbar_back_btn");
                return s3q0.a;
            case 4:
                int intValue = ((Integer) obj).intValue();
                if (intValue != 28 && intValue != 8 && intValue != 14) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 6:
                RectF rectF = hl60.m;
                Rect rect = hl60.l;
                if (((View) obj).getGlobalVisibleRect(rect)) {
                    rectF.set(rect);
                } else {
                    rectF.setEmpty();
                }
                return rectF;
            case 7:
                qgi0.r((tgi0) obj, "audioBookChapterProgressTime");
                return s3q0.a;
            case 8:
                return Boolean.valueOf(epx.f((com.vk.core.utils.newtork.d) obj, d.a.a));
            case 9:
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) == null) {
                    return null;
                }
                return dqu.a(groupsGroupFullDto);
            case 10:
                int i = PhotoGalleryView.m;
                return Boolean.TRUE;
            case 11:
                return (PhotosPhotoDto) j5g.Y(((PhotosGetResponseDto) obj).d());
            case 12:
                return ((l3b0) obj).e;
            case 13:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "playlist_menu_image");
                rgi0.a(tgi0Var);
                return s3q0.a;
            case 14:
                return new PendingPhotoAttachment((String) obj);
            case 15:
                Throwable th = (Throwable) obj;
                j03.l(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 16:
                mwc0 mwc0Var = (mwc0) obj;
                return new qvc0(new qr60.a.f(mwc0Var.a, mwc0Var.b, mwc0Var.d));
            case 17:
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (!uIBlockList.y.isEmpty()) {
                    ArrayList<UIBlock> arrayList = uIBlockList.y;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        for (UIBlock uIBlock : arrayList) {
                            if (uIBlock.e != CatalogDataType.DATA_TYPE_SEARCH_AUTHORS || uIBlock.d != CatalogViewType.LIST_WITH_NOTIFICATION_STATE) {
                            }
                        }
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 18:
                return ((Set) obj).toString();
            case 19:
                return new smr0(obj != null ? (String) obj : null);
            case 20:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 21:
                Intent intent = (Intent) obj;
                intent.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                intent.putExtra("camera_enabled", true);
                intent.putExtra("long_previews", true);
                intent.putExtra("short_divider", true);
                intent.putExtra("prevent_styling_photo", false);
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC);
                intent.putExtra("single_mode", true);
                return s3q0.a;
            case 22:
                return new Result((ProfileNavigationInfo) obj);
            case 23:
                qgi0.g((tgi0) obj);
                return s3q0.a;
            case 24:
                return new h420((f420) obj, 0);
            case 25:
                ((Integer) obj).getClass();
                float f = mcp0.a;
                return Boolean.FALSE;
            case 26:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 27:
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                j03.l(th2);
                return s3q0.a;
            case 28:
                int i2 = ((sxr0) obj).a;
                return i2 != -1 ? i2 != 1 ? io.reactivex.rxjava3.internal.operators.observable.g0.b : io.reactivex.rxjava3.core.q.T(c.o0.g.b) : io.reactivex.rxjava3.core.q.T(c.o0.m.b);
            default:
                return new lct0.a(((tj50.a) obj).a(new w9l0(11), ao8.d));
        }
    }

    public /* synthetic */ q520(Object obj, int i) {
        this.b = i;
    }
}
