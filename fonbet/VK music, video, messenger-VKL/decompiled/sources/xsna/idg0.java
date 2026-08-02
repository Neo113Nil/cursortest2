package xsna;

import android.content.Context;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.photo.Photo;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: RestrictionsDelegate.kt */
/* loaded from: classes6.dex */
public final class idg0 {
    public final bpn0 a;
    public final ArrayList b;
    public final a c = new a();

    /* compiled from: RestrictionsDelegate.kt */
    public final class a implements bd70<Photo> {
        public final SparseArray<gzs<s3q0>> b = new SparseArray<>();

        public a() {
        }

        public final void a(izs<? super PhotoAttachment, Boolean> izsVar) {
            gzs<s3q0> gzsVar;
            int i = 0;
            for (Object obj : idg0.this.b) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                AttachmentWithMedia attachmentWithMedia = (AttachmentWithMedia) obj;
                if ((attachmentWithMedia instanceof PhotoAttachment) && izsVar.invoke(attachmentWithMedia).booleanValue() && (gzsVar = this.b.get(i)) != null) {
                    gzsVar.invoke();
                }
                i = i2;
            }
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Photo photo) {
            Photo photo2 = photo;
            if (i == 130) {
                a(new pb00(photo2, 21));
            } else {
                if (i != 131) {
                    return;
                }
                a(new l850(photo2, 5));
            }
        }
    }

    public idg0(bpn0 bpn0Var, ArrayList arrayList) {
        this.a = bpn0Var;
        this.b = arrayList;
    }

    public final FrameLayout a(fnw fnwVar, int i, btm btmVar) {
        RestrictionButton restrictionButton;
        AttachmentWithMedia attachmentWithMedia = (AttachmentWithMedia) j5g.b0(i, this.b);
        String str = null;
        PhotoAttachment photoAttachment = attachmentWithMedia instanceof PhotoAttachment ? (PhotoAttachment) attachmentWithMedia : null;
        if (photoAttachment != null) {
            Photo photo = photoAttachment.l;
            if (photo.Ib()) {
                Context context = fnwVar.getContext();
                RestrictedBlurredPhotoView restrictedBlurredPhotoView = new RestrictedBlurredPhotoView(context, null, 6);
                int b = cn70.b(32);
                restrictedBlurredPhotoView.setPadding(b, b, b, b);
                restrictedBlurredPhotoView.setTextTopMargin(cn70.b(8));
                PhotoRestriction photoRestriction = photo.L;
                restrictedBlurredPhotoView.setText(photoRestriction != null ? photoRestriction.c : null);
                restrictedBlurredPhotoView.setForceText(true);
                if (photo.Hb()) {
                    restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_56, -1, RestrictedPhotoView.u);
                    restrictedBlurredPhotoView.setTextColor(-1);
                    restrictedBlurredPhotoView.setButtonTopMargin(cn70.b(20));
                    PhotoRestriction photoRestriction2 = photo.L;
                    if (photoRestriction2 != null && (restrictionButton = photoRestriction2.e) != null) {
                        str = restrictionButton.c;
                    }
                    restrictedBlurredPhotoView.setButtonText(str);
                    restrictedBlurredPhotoView.setButtonClickListener(new hdg0(0, this, photo));
                    ImageSize imageSize = (ImageSize) ixj0.b(photo.y.b);
                    if (imageSize == null) {
                        imageSize = ImageSize.f;
                    }
                    HashSet hashSet = iah0.a;
                    int i2 = context.getResources().getDisplayMetrics().widthPixels;
                    restrictedBlurredPhotoView.g(i2, an10.b(i2 / imageSize.E0()));
                    restrictedBlurredPhotoView.h(photoAttachment.Ib(), photo.P);
                } else {
                    restrictedBlurredPhotoView.c(R.drawable.vk_icon_do_not_disturb_outline_56, e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary, context), RestrictedPhotoView.u);
                    restrictedBlurredPhotoView.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, context));
                    restrictedBlurredPhotoView.setBackgroundColor(context.getColor(R.color.white_alpha8));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                if (photo.Hb()) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    frameLayout.addView(restrictedBlurredPhotoView, layoutParams);
                } else {
                    frameLayout.addView(restrictedBlurredPhotoView, -1, -1);
                }
                this.c.b.put(i, btmVar);
                return frameLayout;
            }
        }
        return null;
    }
}
