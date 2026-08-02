package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.tool.view.FlowLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.design.view.newsfeed.discover.description.FeedDiscoverDescriptionView;
import com.vk.feed.design.view.newsfeed.discover.photo.FeedPhotoDiscoverItemView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.am;

/* compiled from: EnhancedPhotoDiscoverGridItemV3Holder.kt */
/* loaded from: classes4.dex */
public final class fmp extends uc6<PhotoDiscoverGridItem> {
    public final com.vk.feed.design.view.newsfeed.discover.photo.a I;
    public final Object J;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fmp(ViewGroup viewGroup, m2c0 m2c0Var, h170 h170Var) {
        super(r0, viewGroup);
        Context context = viewGroup.getContext();
        boolean z = false;
        com.vk.feed.design.view.newsfeed.discover.photo.a aVar = new com.vk.feed.design.view.newsfeed.discover.photo.a(context, null, 0);
        aVar.c = FeedDiscoverDescriptionView.TextStyle.Medium;
        aVar.d = 1;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aVar.e = truncateAt;
        aVar.f = 2;
        aVar.g = truncateAt;
        aVar.l = new FeedPhotoDiscoverItemView.b.a(null, null);
        LayoutInflater.from(context).inflate(R.layout.feed_discover_enhanced_photo, (ViewGroup) aVar, true);
        VkEnhancedImageView vkEnhancedImageView = (VkEnhancedImageView) aVar.findViewById(R.id.discover_grid_item_enhanced_image);
        aVar.h = vkEnhancedImageView;
        vkEnhancedImageView.setSimpleAspectRatio(true);
        vkEnhancedImageView.setScaleType(ScaleType.CENTER_CROP);
        aVar.setId(R.id.discover_photo_item);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        if (((Boolean) h170Var.H.getValue()).booleanValue() && h170Var.h()) {
            z = true;
        }
        aVar.setUseThumbHash(z);
        com.vk.feed.design.view.newsfeed.discover.photo.a aVar2 = (com.vk.feed.design.view.newsfeed.discover.photo.a) this.itemView;
        this.I = aVar2;
        this.J = msy.a(LazyThreadSafetyMode.NONE, new qbj(m2c0Var, 4));
        aVar2.setOnClickListener(this);
        aVar2.setOnLongClickListener(this);
        iut0.o(aVar2, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_go), null);
        iut0.o(aVar2, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
        aVar2.setPlaceholder(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext())));
        aVar2.setDontLoadAgainIfSameResource(true);
        aVar2.d = 1;
        aVar2.e = truncateAt;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView = aVar2.i;
        if (feedDiscoverDescriptionView != null) {
            feedDiscoverDescriptionView.b(1, truncateAt);
        }
        aVar2.f = 2;
        aVar2.g = truncateAt;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView2 = aVar2.i;
        if (feedDiscoverDescriptionView2 != null) {
            feedDiscoverDescriptionView2.a(2, truncateAt);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uc6
    public final void U6(PhotoDiscoverGridItem photoDiscoverGridItem) {
        PhotoDiscoverGridItem photoDiscoverGridItem2 = photoDiscoverGridItem;
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        k4n k4nVar = ol60Var instanceof k4n ? (k4n) ol60Var : null;
        if (k4nVar != null) {
            String str = k4nVar.h;
            List<ean> list = k4nVar.q;
            FeedPhotoDiscoverItemView.b aVar = new FeedPhotoDiscoverItemView.b.a(str, photoDiscoverGridItem2.j.l.P);
            com.vk.feed.design.view.newsfeed.discover.photo.a aVar2 = this.I;
            aVar2.setContent(aVar);
            aVar2.setForeground(k4nVar.o);
            FlowLayout flowLayout = aVar2.k;
            if (flowLayout != null) {
                f4m.j(flowLayout);
                if (flowLayout.getChildCount() != 0) {
                    flowLayout.removeAllViews();
                }
            }
            ?? r2 = this.J;
            ((x1n) r2.getValue()).b();
            if (k4nVar.k) {
                aVar2.setTextStyle(k4nVar.l ? FeedPhotoDiscoverItemView.TextStyle.Small : FeedPhotoDiscoverItemView.TextStyle.Medium);
                DiscoverGridItem.a aVar3 = photoDiscoverGridItem2.g;
                String str2 = aVar3.a;
                String str3 = aVar3.c;
                aVar2.setBottom(new FeedPhotoDiscoverItemView.a.C1047a(str2, str3 != null ? str3.toString() : null));
            } else {
                aVar2.setBottom((FeedPhotoDiscoverItemView.a) null);
                List<ean> list2 = list;
                if (!list2.isEmpty()) {
                    ArrayList<ean> arrayList = ((x1n) r2.getValue()).a.c;
                    arrayList.clear();
                    if (list2 != null && !list2.isEmpty()) {
                        arrayList.addAll(list2);
                    }
                    x1n x1nVar = (x1n) r2.getValue();
                    FlowLayout flowLayout2 = aVar2.k;
                    if (flowLayout2 == null) {
                        flowLayout2 = new FlowLayout(aVar2.getContext());
                        flowLayout2.setId(R.id.discover_grid_item_tags);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 8388691;
                        layoutParams.leftMargin = cn70.b(8);
                        layoutParams.topMargin = cn70.b(2);
                        layoutParams.rightMargin = cn70.b(8);
                        layoutParams.bottomMargin = cn70.b(2);
                        flowLayout2.setLayoutParams(layoutParams);
                        flowLayout2.setRowsStartFromBottom(true);
                        aVar2.k = flowLayout2;
                        aVar2.addView(flowLayout2);
                    }
                    flowLayout2.setVisibility(0);
                    int tagsCount = x1nVar.getTagsCount();
                    for (int i = 0; i < tagsCount; i++) {
                        flowLayout2.addView(x1nVar.a(i, flowLayout2));
                    }
                }
            }
            aVar2.setContentDescription(k4nVar.m);
        }
    }
}
