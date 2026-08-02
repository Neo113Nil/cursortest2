package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.PhotoStackView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;

/* compiled from: TaggedPhotosHolder.kt */
/* loaded from: classes4.dex */
public final class p1o0 extends qi6<Photos> implements View.OnClickListener, w8i {
    public final h3f0 C;
    public final Object D;
    public final PhotoStackView E;
    public final TextView F;
    public final int G;
    public final int H;
    public Photos I;

    public p1o0(ViewGroup viewGroup, h3f0 h3f0Var) {
        super(R.layout.holder_photos_tagged, viewGroup);
        this.C = h3f0Var;
        this.D = msy.a(LazyThreadSafetyMode.NONE, new jcf0(this, 11));
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.photos_tagged_images);
        photoStackView.setReverseStack(true);
        photoStackView.setOverlapOffset(0.55f);
        photoStackView.setMarginBetweenImages(2.0f);
        photoStackView.setRoundedImages(false);
        photoStackView.setRoundedCut(false);
        photoStackView.setCornerRadiusImages(6.0f);
        photoStackView.setDrawBorder(true);
        photoStackView.setExtraCounterTextSize(16.0f);
        this.E = photoStackView;
        this.F = (TextView) this.itemView.findViewById(R.id.photos_tagged_text);
        this.G = iah0.a(40);
        this.H = 3;
        View findViewById = this.itemView.findViewById(R.id.separator);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.itemView.setBackground(null);
        jjc.f(this, this.itemView);
    }

    @Override // xsna.qi6
    public final void E6(Photos photos) {
        String str;
        Photo photo;
        ImageSize Db;
        Photos photos2 = photos;
        this.I = photos2;
        ArrayList<EntryAttachment> arrayList = photos2.q;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Attachment attachment = ((EntryAttachment) it.next()).b;
            String str2 = null;
            PhotoAttachment photoAttachment = attachment instanceof PhotoAttachment ? (PhotoAttachment) attachment : null;
            if (photoAttachment != null && (photo = photoAttachment.l) != null && (Db = photo.Db(this.G, false)) != null) {
                str2 = Db.d.d;
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        int size = arrayList2.size();
        int i = this.H;
        boolean z = size > i;
        int size2 = (arrayList2.size() - i) + 1;
        PhotoStackView photoStackView = this.E;
        photoStackView.z = z;
        if (z) {
            photoStackView.m(size2);
        }
        photoStackView.requestLayout();
        photoStackView.invalidate();
        if (z) {
            i--;
        }
        photoStackView.r(i, arrayList2);
        Owner owner = photos2.o;
        if (owner == null || (str = owner.c) == null) {
            str = "";
        }
        this.F.setText(y8g0.f(R.string.photos_tagged_look, str));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NewsfeedRouter newsfeedRouter = (NewsfeedRouter) this.D.getValue();
        Context context = this.itemView.getContext();
        Photos photos = this.I;
        if (photos == null) {
            photos = null;
        }
        newsfeedRouter.a0(context, photos, this.C, this.w, this.u);
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.zb(PostInteract.Type.open_photo_popup);
        }
    }
}
