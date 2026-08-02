package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeFrescoImageViewLegacy;
import com.vk.feed.tool.view.newsfeed.photo.BlurredImageWrapper;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.qi6;

/* compiled from: SingleDocumentThumbnailHolder.kt */
/* loaded from: classes4.dex */
public final class rtj0 extends ufw<DocumentAttachment> implements View.OnClickListener {
    public static final /* synthetic */ int J = 0;
    public final iun E;
    public final BlurredImageWrapper F;
    public final FixedSizeFrescoImageViewLegacy G;
    public final View H;
    public e6o I;

    /* compiled from: SingleDocumentThumbnailHolder.kt */
    public static final class a {
        public static rtj0 a(ViewGroup viewGroup) {
            Context context = viewGroup.getContext();
            BlurredImageWrapper blurredImageWrapper = new BlurredImageWrapper(viewGroup.getContext(), null, 6);
            blurredImageWrapper.setId(R.id.attach);
            blurredImageWrapper.setPadding(0, e3m.a(R.dimen.newsfeed_single_photo_top_space, context), 0, 0);
            FrameLayout frameLayout = new FrameLayout(context);
            iun iunVar = new iun(frameLayout, true);
            iunVar.E.setCornerRadius(0);
            frameLayout.addView(iunVar.itemView, new FrameLayout.LayoutParams(-1, -1, 1));
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setId(R.id.play_button);
            bwt0.p0(appCompatImageView, false);
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
            appCompatImageView.setImageResource(R.drawable.vk_icon_play_24);
            appCompatImageView.setBackgroundResource(R.drawable.bg_gif_label);
            frameLayout.addView(appCompatImageView, new FrameLayout.LayoutParams(cn70.b(40), cn70.b(40), 17));
            blurredImageWrapper.addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
            return new rtj0(iunVar, blurredImageWrapper);
        }
    }

    public rtj0(iun iunVar, BlurredImageWrapper blurredImageWrapper) {
        super(blurredImageWrapper);
        this.E = iunVar;
        BlurredImageWrapper blurredImageWrapper2 = (BlurredImageWrapper) blurredImageWrapper.findViewById(R.id.attach);
        this.F = blurredImageWrapper2;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = (FixedSizeFrescoImageViewLegacy) blurredImageWrapper.findViewById(R.id.att_doc_thumb);
        this.G = fixedSizeFrescoImageViewLegacy;
        this.H = blurredImageWrapper.findViewById(R.id.play_button);
        ViewGroup.LayoutParams layoutParams = fixedSizeFrescoImageViewLegacy.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        View.OnClickListener onClickListener = this.I;
        blurredImageWrapper2.setOnClickListener(onClickListener == null ? this : onClickListener);
        abg0 abg0Var = dhr0.t;
        blurredImageWrapper2.b(abg0Var.c(R.attr.vk_ui_background_content));
        blurredImageWrapper2.setBlurPostprocessor(edg0.a);
        blurredImageWrapper2.setBlurPlaceholderColor(abg0Var.c(R.attr.vk_ui_background_secondary));
        awt0.x(blurredImageWrapper2, 0, 0, 0, 0, 10);
        blurredImageWrapper2.setCornersPainter(new xso0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, krv0.l(R.attr.vk_ui_background_content), 0, 24));
        fixedSizeFrescoImageViewLegacy.setHeightMode(ImageViewMeasurer.HeightMode.MIN_RATIO);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.E.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.I = a2;
        this.F.setOnClickListener(a2);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        ArrayList arrayList;
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        int a2 = qi6.a.a(this.itemView.getContext());
        Image image = documentAttachment.s;
        if (image == null || (arrayList = image.b) == null) {
            arrayList = null;
        } else {
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
        }
        boolean z = documentAttachment.b;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.G;
        fixedSizeFrescoImageViewLegacy.setWrapContent(z);
        ImageSize y = nr2.y(a2, arrayList);
        if (y != null) {
            com.vk.dto.common.im.Image image2 = y.d;
            fixedSizeFrescoImageViewLegacy.r(image2.b, image2.c);
        } else {
            fixedSizeFrescoImageViewLegacy.r(135, 100);
        }
        this.F.a(ixj0.n(arrayList));
        bwt0.p0(this.H, documentAttachment.x5() && documentAttachment.V0());
    }

    @Override // xsna.m56, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        this.E.a6(u1c0Var);
    }

    @Override // xsna.ufw, xsna.bnw
    public final void b5(anw anwVar) {
        this.E.D = anwVar;
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        this.E.onClick(view);
    }
}
