package xsna;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.im.Image;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MiniAppAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.qi6;

/* compiled from: PrimaryMiniAppPhotoHolder.kt */
/* loaded from: classes4.dex */
public final class x9d0 extends m56<MiniAppAttachment> {
    public final FrameLayout D;
    public final FixedSizeVKEnhancedImageView E;
    public final long F;
    public e6o G;
    public final qj8 H;

    public x9d0(View view) {
        super(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.container_mini_app_photo);
        this.D = frameLayout;
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = (FixedSizeVKEnhancedImageView) view.findViewById(R.id.image_view_mini_app_photo);
        this.E = fixedSizeVKEnhancedImageView;
        this.F = ViewConfiguration.getDoubleTapTimeout() + 250;
        qj8 qj8Var = new qj8(this, 8);
        this.H = qj8Var;
        View.OnClickListener onClickListener = this.G;
        if (onClickListener == null) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            onClickListener = new uvt0(250L, qj8Var);
        }
        fixedSizeVKEnhancedImageView.setOnClickListener(onClickListener);
        frameLayout.setOnClickListener(onClickListener);
        fixedSizeVKEnhancedImageView.setHeightMode(ImageViewMeasurer.HeightMode.MIN_RATIO);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o e6oVar = new e6o(s6oVar, Long.valueOf(this.F), this.H, s6oVar.e);
        this.G = e6oVar;
        this.E.setOnClickListener(e6oVar);
        this.D.setOnClickListener(e6oVar);
    }

    @Override // xsna.m56
    public final void T6(MiniAppAttachment miniAppAttachment) {
        MiniAppAttachment miniAppAttachment2 = miniAppAttachment;
        s1c0 s1c0Var = this.x;
        f4m.y((s1c0Var == null || s1c0Var.j) ? cn70.b(6) : 0, this.D);
        int a = qi6.a.a(this.itemView.getContext());
        List<NotificationImage.ImageInfo> Ab = miniAppAttachment2.j.Ab();
        ArrayList arrayList = new ArrayList(c5g.u(Ab, 10));
        for (NotificationImage.ImageInfo imageInfo : Ab) {
            arrayList.add(new ImageSize(imageInfo.d, imageInfo.b, imageInfo.c, null, (char) 0, false, 56, null));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        ImageSize y = nr2.y(a, arrayList);
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = this.E;
        if (y != null) {
            Image image = y.d;
            fixedSizeVKEnhancedImageView.e1(image.b, image.c);
        } else {
            fixedSizeVKEnhancedImageView.e1(135, 100);
        }
        fixedSizeVKEnhancedImageView.setLocalImage((fxj0) null);
        fixedSizeVKEnhancedImageView.setRemoteImage((List<? extends fxj0>) arrayList);
        fixedSizeVKEnhancedImageView.setOnHoverListener(null);
        NewsEntry q6 = q6();
        if (q6 != null) {
            fixedSizeVKEnhancedImageView.setViewRatio(di60.s(q6));
        }
    }
}
