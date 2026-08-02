package xsna;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vk.media.MediaUtils;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.a1u0;
import xsna.u3e0;

/* compiled from: ExtendedImagesAdapter.kt */
/* loaded from: classes4.dex */
public final class pbq extends jnw {
    public final x64 g;
    public final List<Attachment> h;
    public final m130 i;
    public final g6b j;
    public final pq10 k;
    public final ihk l;
    public final izs<PostingAction, s3q0> m;
    public qor n;
    public final ArrayList o = new ArrayList();
    public final SparseArray<MediaUtils.f> p = new SparseArray<>();
    public a1u0 q;

    public pbq(x64 x64Var, List list, m130 m130Var, g6b g6bVar, pq10 pq10Var, ihk ihkVar, izs izsVar, cpc0 cpc0Var, a1u0 a1u0Var) {
        this.g = x64Var;
        this.h = list;
        this.i = m130Var;
        this.j = g6bVar;
        this.k = pq10Var;
        this.l = ihkVar;
        this.m = izsVar;
        this.q = a1u0Var;
    }

    public static void s(Attachment attachment, d6y0 d6y0Var) {
        int i;
        Image image;
        ArrayList arrayList;
        boolean z = attachment instanceof PhotoAttachment;
        int i2 = jnw.d;
        int i3 = jnw.c;
        if (z) {
            ImageSize k = his0.k((PhotoAttachment) attachment);
            int i4 = k != null ? k.d.b : 0;
            i = k != null ? k.d.c : 0;
            if (i4 > 0) {
                i3 = i4;
            }
            d6y0Var.a = i3;
            if (i > 0) {
                i2 = i;
            }
            d6y0Var.b = i2;
            return;
        }
        if (attachment instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            d6y0Var.a = videoAttachment.k.getWidth() > 0 ? videoAttachment.k.getWidth() : jnw.e;
            d6y0Var.b = videoAttachment.k.getHeight() > 0 ? videoAttachment.k.getHeight() : jnw.f;
            return;
        }
        r4 = null;
        r4 = null;
        ImageSize imageSize = null;
        if (attachment instanceof MarketAlbumAttachment) {
            Photo photo = ((MarketAlbumAttachment) attachment).f.e;
            if (photo != null && (image = photo.y) != null && (arrayList = image.b) != null) {
                imageSize = (ImageSize) ixj0.b(arrayList);
            }
            int i5 = imageSize != null ? imageSize.d.b : 0;
            i = imageSize != null ? imageSize.d.c : 0;
            if (i5 > 0) {
                i3 = i5;
            }
            d6y0Var.a = i3;
            if (i > 0) {
                i2 = i;
            }
            d6y0Var.b = i2;
            return;
        }
        if (attachment instanceof DocumentAttachment) {
            DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
            Image image2 = documentAttachment.s;
            ImageSize imageSize2 = (ImageSize) ixj0.b(image2 != null ? image2.b : null);
            int i6 = imageSize2 != null ? imageSize2.d.b : documentAttachment.l;
            int i7 = imageSize2 != null ? imageSize2.d.c : documentAttachment.m;
            if (i6 > 0) {
                i3 = i6;
            }
            d6y0Var.a = i3;
            if (i7 > 0) {
                i2 = i7;
            }
            d6y0Var.b = i2;
        }
    }

    public final int q() {
        List<Attachment> list = this.h;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.j.f((Attachment) it.next()) && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    public final int r(int i) {
        int i2;
        Attachment attachment = this.h.get(i);
        if (attachment instanceof PhotoAttachment) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            i2 = photoAttachment.l.Hb() ? 11 : photoAttachment.l.Ib() ? 10 : 0;
        } else {
            i2 = attachment instanceof VideoAttachment ? 1 : attachment instanceof MarketAlbumAttachment ? 3 : attachment instanceof DocumentAttachment ? !((DocumentAttachment) attachment).V0() ? 4 : 5 : -1;
        }
        if (i2 == 0) {
            return 13;
        }
        if (i2 == 8) {
            return 14;
        }
        if (i2 == 4 || i2 == 5) {
            return 13;
        }
        return i2;
    }

    public final void t(ce6 ce6Var, int i) {
        Attachment attachment = (Attachment) j5g.b0(i, this.h);
        if (attachment != null) {
            ce6Var.c = attachment;
            ce6Var.m(attachment);
            View view = (View) ce6Var.b;
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            if (BuildInfo.h()) {
                bwt0.Q(view, R.id.posting_ui_test_attachment_tag, new hcc0(attachment.Ab()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [xsna.bba0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [xsna.q5a0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [xsna.ykw] */
    /* JADX WARN: Type inference failed for: r5v9, types: [xsna.ykw] */
    public final ce6 u(int i, ViewGroup viewGroup) {
        mps0 mps0Var;
        pq10 pq10Var = this.k;
        if (i == 1) {
            boolean z = pq10Var.c;
            a1u0 a1u0Var = this.q;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            PreviewAttachmentWrapper previewAttachmentWrapper = new PreviewAttachmentWrapper(viewGroup.getContext(), null, 6);
            com.vk.newsfeed.common.recycler.holders.i iVar = new com.vk.newsfeed.common.recycler.holders.i(previewAttachmentWrapper, false);
            iVar.h0 = a1u0Var instanceof a1u0.a;
            View view = iVar.itemView;
            view.setOnClickListener(null);
            view.setClickable(false);
            previewAttachmentWrapper.setOnClickListener(iVar);
            previewAttachmentWrapper.addView(view, layoutParams);
            mps0 mps0Var2 = new mps0(previewAttachmentWrapper, iVar, z, a1u0Var, ScaleType.FIT_CENTER);
            ((FrameLayout) previewAttachmentWrapper.findViewById(R.id.video_wrap)).setForeground(m33.a(R.drawable.attachment_video_background_border, viewGroup.getContext()));
            mps0Var = mps0Var2;
        } else if (i == 10) {
            PreviewAttachmentWrapper previewAttachmentWrapper2 = new PreviewAttachmentWrapper(viewGroup.getContext(), null, 6);
            previewAttachmentWrapper2.setBackground(m33.a(R.drawable.attachment_background_border, previewAttachmentWrapper2.getContext()));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            RestrictedPhotoView restrictedPhotoView = new RestrictedPhotoView(viewGroup.getContext(), null, 6, 0);
            restrictedPhotoView.setId(R.id.attach);
            previewAttachmentWrapper2.addView(restrictedPhotoView, layoutParams2);
            mps0Var = new bba0(previewAttachmentWrapper2);
        } else if (i != 11) {
            m130 m130Var = this.i;
            if (i == 13) {
                mps0Var = new ykw(this.l, bwt0.I(R.layout.posting_preview_image_item, viewGroup, false), this.m, this.q, pq10Var, m130Var);
            } else if (i != 14) {
                mps0Var = null;
            } else {
                ?? uu90Var = new uu90(this.l, bwt0.I(R.layout.posting_preview_image_item, viewGroup, false), this.m, this.q, pq10Var, m130Var);
                uu90Var.r(u3e0.d.a);
                mps0Var = uu90Var;
            }
        } else {
            PreviewAttachmentWrapper previewAttachmentWrapper3 = new PreviewAttachmentWrapper(viewGroup.getContext(), null, 6);
            previewAttachmentWrapper3.setBackground(m33.a(R.drawable.attachment_background_border, previewAttachmentWrapper3.getContext()));
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            RestrictedBlurredPhotoView restrictedBlurredPhotoView = new RestrictedBlurredPhotoView(viewGroup.getContext(), null, 6);
            int color = viewGroup.getContext().getColor(R.color.vk_white);
            restrictedBlurredPhotoView.setId(R.id.attach);
            restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_56, color, RestrictedPhotoView.u);
            int b = cn70.b(8);
            restrictedBlurredPhotoView.setPadding(b, b, b, b);
            previewAttachmentWrapper3.addView(restrictedBlurredPhotoView, layoutParams3);
            mps0Var = new q5a0(previewAttachmentWrapper3);
        }
        if (mps0Var == null) {
            return null;
        }
        x64 x64Var = this.g;
        if (x64Var != null) {
            mps0Var.D1(pq10Var.a);
            mps0Var.Z1(x64Var);
        }
        this.o.add(mps0Var);
        return mps0Var;
    }
}
