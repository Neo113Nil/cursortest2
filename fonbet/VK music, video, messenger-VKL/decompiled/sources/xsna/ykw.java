package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.feed.design.view.posting.preview.image.attach.PostingPreviewImage;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.step1.views.RemoveButtonType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1u0;
import xsna.m8v0;
import xsna.tlo0;
import xsna.u3e0;

/* compiled from: ImagePostingHolder.kt */
/* loaded from: classes4.dex */
public class ykw extends ce6 implements blc0, w8i, khk, zzo, View.OnAttachStateChangeListener {
    public final ihk e;
    public final izs<PostingAction, s3q0> f;
    public final pq10 g;
    public final m130 h;
    public final Handler i;
    public PhotoAttachment j;
    public final String k;
    public final String l;
    public final h7v m;
    public final PostingPreviewImage n;
    public final h4d0 o;
    public boolean p;
    public x64 q;
    public final nhk r;
    public final mwf0 s;
    public final zjc0 t;
    public a1u0 u;
    public u3e0 v;

    public ykw() {
        throw null;
    }

    public ykw(ihk ihkVar, View view, izs izsVar, a1u0 a1u0Var, pq10 pq10Var, m130 m130Var) {
        super(view);
        this.e = ihkVar;
        this.f = izsVar;
        this.g = pq10Var;
        this.h = m130Var;
        this.i = new Handler(Looper.getMainLooper());
        this.k = HintId.FEED_POSTING_EDIT_PHOTO_BUTTON.getId();
        this.l = HintId.FEED_POSTING_CROP_ZOOM.getId();
        bpn0 bpn0Var = pla.a;
        this.m = ((wvw) (bpn0Var == null ? null : bpn0Var).getValue()).b();
        PreviewAttachmentWrapper previewAttachmentWrapper = (PreviewAttachmentWrapper) view.findViewById(R.id.posting_preview_image_wrapper);
        PostingPreviewImage postingPreviewImage = (PostingPreviewImage) view.findViewById(R.id.posting_preview_image);
        this.n = postingPreviewImage;
        this.o = new h4d0(this, postingPreviewImage, e3m.a(R.dimen.posting_grid_carousel_max_height, view.getContext()), a1u0Var instanceof a1u0.b);
        this.r = new nhk();
        this.s = new mwf0(previewAttachmentWrapper, new be6(this, 8), RemoveButtonType.IMAGE);
        zjc0 zjc0Var = new zjc0(previewAttachmentWrapper, a1u0Var);
        previewAttachmentWrapper.setOnSpinnerErrorClick(new cfl(this, 19));
        previewAttachmentWrapper.setOnSpinnerCancelClick(new ufk(this, 9));
        this.t = zjc0Var;
        this.u = a1u0Var;
        this.v = u3e0.d.a;
        view.setOnClickListener(this);
        view.addOnAttachStateChangeListener(this);
        postingPreviewImage.setBadgeBackground(new gko(R.drawable.crop_icon_container_bg));
        postingPreviewImage.setOnBadgeClickListener(new xkw(0, this, ykw.class, "onActionIconClick", "onActionIconClick()V", 0, 0));
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.s.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.q = x64Var;
    }

    @Override // xsna.khk
    public final void b() {
        PhotoAttachment photoAttachment = this.j;
        if (photoAttachment != null) {
            this.e.a(photoAttachment);
        }
    }

    @Override // xsna.khk
    public final boolean c() {
        if (!n()) {
            return false;
        }
        View badgeAnchor = this.n.getBadgeAnchor();
        Hint p = this.m.p(this.l);
        if (p == null) {
            return true;
        }
        int i = m8v0.M;
        m8v0.a.a(badgeAnchor, String.valueOf(p.c), null, VkTooltip$MarkerStyle.Style4, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.BottomRight, null, new b4r(7), new ak(27), null, null, null, new gmj(this, 18), null, 0, false, null, null, false, null, !dhr0.M(), 8379556);
        return true;
    }

    @Override // xsna.zzo
    public final void g() {
        Hint p = pla.e().b().p(this.k);
        if (p != null) {
            pla.e().b().s(p);
        }
        if (n()) {
            q();
            this.p = true;
        }
    }

    @Override // xsna.zzo
    public final boolean h() {
        if (!n() || !this.p) {
            return false;
        }
        this.i.postDelayed(new nx3(this, 8), 600L);
        q();
        this.p = false;
        return true;
    }

    @Override // xsna.ce6
    public final void m(Attachment attachment) {
        boolean z = this.p;
        PostingPreviewImage postingPreviewImage = this.n;
        if (!z || !n()) {
            postingPreviewImage.setBadge(null);
        }
        boolean z2 = attachment instanceof LocalPhotoAttachment;
        nhk nhkVar = this.r;
        final h4d0 h4d0Var = this.o;
        if (z2) {
            LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) attachment;
            this.j = localPhotoAttachment;
            nhkVar.getClass();
            h4d0Var.b.setImageState(nhk.a(localPhotoAttachment));
            m900<String, ImageSize> m900Var = ImageSize.e;
            final int i = localPhotoAttachment.z;
            final int i2 = localPhotoAttachment.A;
            h4d0Var.a(Uri.parse(new ImageSize(localPhotoAttachment.y.ba().f().toString(), localPhotoAttachment.z, localPhotoAttachment.A, Boolean.FALSE, ImageSize.b.c(i, i2), false, 32, null).d.d), new izs() { // from class: xsna.g4d0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    h4d0 h4d0Var2 = h4d0.this;
                    if (!h4d0Var2.f) {
                        w3d0 w3d0Var = h4d0Var2.b.t;
                        w3d0Var.setBackground(null);
                        w3d0Var.setImageBitmap(bitmap);
                        jhk jhkVar = w3d0Var.m;
                        jhkVar.e = bitmap;
                        jhkVar.c = i;
                        jhkVar.d = i2;
                        jhkVar.c();
                    }
                    return s3q0.a;
                }
            }, new y510(16));
            if (!n()) {
                postingPreviewImage.setBadge(null);
                return;
            } else {
                if (this.p) {
                    return;
                }
                p();
                return;
            }
        }
        if (attachment instanceof PhotoAttachment) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            this.j = photoAttachment;
            nhkVar.getClass();
            h4d0Var.b.setImageState(nhk.a(photoAttachment));
            Photo photo = photoAttachment.l;
            ImageSize imageSize = photo.J;
            ImageSize imageSize2 = photo.K;
            if (imageSize2 != null) {
                o(Collections.singletonList(imageSize2));
            } else if (imageSize != null) {
                o(Collections.singletonList(imageSize));
            } else {
                ArrayList arrayList = photo.y.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                        arrayList2.add(next);
                    }
                }
                o(arrayList2);
            }
            if (!n()) {
                postingPreviewImage.setBadge(null);
            } else {
                if (this.p) {
                    return;
                }
                p();
            }
        }
    }

    public final boolean n() {
        return this.g.d && !((Boolean) this.h.invoke()).booleanValue();
    }

    public final void o(List<ImageSize> list) {
        final h4d0 h4d0Var = this.o;
        h4d0Var.a.r(u3e0.d.a);
        ImageSize imageSize = (ImageSize) ixj0.b(list);
        if (imageSize != null) {
            Image image = imageSize.d;
            Uri parse = Uri.parse(image.d);
            final int i = image.b;
            final int i2 = image.c;
            h4d0Var.a(parse, new izs() { // from class: xsna.f4d0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    h4d0 h4d0Var2 = h4d0.this;
                    h4d0Var2.f = true;
                    w3d0 w3d0Var = h4d0Var2.b.t;
                    w3d0Var.setBackground(null);
                    w3d0Var.setImageBitmap(bitmap);
                    jhk jhkVar = w3d0Var.m;
                    jhkVar.e = bitmap;
                    jhkVar.c = i;
                    jhkVar.d = i2;
                    jhkVar.c();
                    h4d0Var2.a.r(h4d0Var2.d ? u3e0.a.a : u3e0.c.a);
                    return s3q0.a;
                }
            }, new d410(h4d0Var, 24));
        }
    }

    @Override // xsna.ce6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.q;
        if (x64Var != null) {
            x64Var.a(this.c);
        } else {
            super.onClick(view);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.i.removeCallbacksAndMessages(null);
    }

    public final void p() {
        this.n.setBadge(new PostingPreviewImage.Badge.b(new gko(R.drawable.vk_icon_crop_outline_20), PostingPreviewImage.Badge.IconStyle.Medium, tq.h(tlo0.Companion, R.string.photo_editor_crop_button)));
    }

    public final void q() {
        this.n.setBadge(new PostingPreviewImage.Badge.a(new gko(R.drawable.vk_icon_crop_outline_20), tq.h(tlo0.Companion, R.string.photo_editor_crop_button), PostingPreviewImage.Badge.IconStyle.Medium, new tlo0.f(R.string.photo_editor_crop_button)));
    }

    public final void r(u3e0 u3e0Var) {
        this.t.a(u3e0Var);
        a1u0 a1u0Var = this.u;
        boolean z = true;
        if (!(a1u0Var instanceof a1u0.a)) {
            if (!(a1u0Var instanceof a1u0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (a1u0Var.a || !(u3e0Var instanceof u3e0.b)) {
                z = false;
            }
        }
        this.s.a(z);
        this.v = u3e0Var;
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
