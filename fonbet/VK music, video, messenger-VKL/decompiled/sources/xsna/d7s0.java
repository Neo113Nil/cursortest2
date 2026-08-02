package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import xsna.e7s0;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7s0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d7s0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int dimensionPixelSize;
        switch (this.b) {
            case 0:
                e7s0 e7s0Var = (e7s0) this.c;
                dkt0 dkt0Var = new dkt0((csp) this.d, e7s0Var.a, new e7s0.a(e7s0Var), new ehm0(e7s0Var, 9));
                e7s0Var.b.e.b(new f7s0(dkt0Var));
                return dkt0Var;
            case 1:
                VideoItemListSmallVh videoItemListSmallVh = (VideoItemListSmallVh) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                VkImage vkImage = videoItemListSmallVh.F;
                if (vkImage == null) {
                    vkImage = null;
                }
                vkImage.setVisibility(0);
                VideoOverlayView videoOverlayView = videoItemListSmallVh.J;
                if (videoOverlayView == null) {
                    videoOverlayView = null;
                }
                f4m.j(videoOverlayView);
                VideoOverlayView videoOverlayView2 = videoItemListSmallVh.J;
                if (videoOverlayView2 == null) {
                    videoOverlayView2 = null;
                }
                if (videoOverlayView2.getShowRedesign()) {
                    VkImage vkImage2 = videoItemListSmallVh.F;
                    if (vkImage2 == null) {
                        vkImage2 = null;
                    }
                    vkImage2.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder_alpha));
                } else {
                    VkImage vkImage3 = videoItemListSmallVh.F;
                    if (vkImage3 == null) {
                        vkImage3 = null;
                    }
                    View view = videoItemListSmallVh.D;
                    if (view == null) {
                        view = null;
                    }
                    vkImage3.setPlaceholderImage(m33.a(R.drawable.default_placeholder_6, view.getContext()));
                    VkImage vkImage4 = videoItemListSmallVh.F;
                    if (vkImage4 == null) {
                        vkImage4 = null;
                    }
                    View view2 = videoItemListSmallVh.D;
                    if (view2 == null) {
                        view2 = null;
                    }
                    vkImage4.F0(m33.a(R.drawable.video_placeholder_64, view2.getContext()), ImageView.ScaleType.FIT_XY);
                }
                VkImage vkImage5 = videoItemListSmallVh.F;
                if (vkImage5 == null) {
                    vkImage5 = null;
                }
                Image image = videoFile.getImage();
                if (videoItemListSmallVh.q) {
                    dimensionPixelSize = ImageScreenSize.BIG.h();
                } else {
                    View view3 = videoItemListSmallVh.D;
                    if (view3 == null) {
                        view3 = null;
                    }
                    dimensionPixelSize = view3.getResources().getDimensionPixelSize(videoItemListSmallVh.o.c(videoFile) ? R.dimen.video_catalog_small_content_clip_item_width : R.dimen.video_catalog_small_content_item_width);
                }
                ImageSize Cb = image.Cb(dimensionPixelSize, true, false);
                vkImage5.s0(Cb != null ? Cb.d.d : null);
                return s3q0.a;
            case 2:
                ((izs) this.c).invoke(new wqs0.a(((xrs0) this.d).b));
                return s3q0.a;
            case 3:
                ((zst0) this.c).e(((btt0) this.d).f());
                return s3q0.a;
            case 4:
                d0l d0lVar = (d0l) this.c;
                DateTimePickerState dateTimePickerState = (DateTimePickerState) this.d;
                Long f = d0lVar.f();
                if (f != null) {
                    long longValue = f.longValue();
                    dateTimePickerState.getClass();
                    Date a = com.vk.core.compose.component.datetime.c.a(longValue);
                    int i = DateTimePickerState.a.$EnumSwitchMapping$0[dateTimePickerState.g.ordinal()];
                    if (i == 1) {
                        dateTimePickerState.e(a, (Date) dateTimePickerState.i.getValue());
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((zak0) dateTimePickerState.k).setValue(new DateTimePickerState.DialogState.TimePicker(a, null));
                }
                return s3q0.a;
            default:
                Context context = (Context) this.c;
                com.vk.core.view.components.group.header.f fVar = (com.vk.core.view.components.group.header.f) this.d;
                VkSkeleton vkSkeleton = new VkSkeleton(context, null, 0, 14, 0);
                vkSkeleton.setId(R.id.ds_internal_group_header_left_icon);
                vkSkeleton.setArea(fVar.getArea());
                vkSkeleton.setShimmer(fVar.b);
                vkSkeleton.setShimmerManagedExternally(true);
                vkSkeleton.setType(VkSkeleton.a.b.a);
                return vkSkeleton;
        }
    }
}
