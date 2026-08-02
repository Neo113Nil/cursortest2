package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.eb60;
import xsna.qn60;

/* compiled from: DropPhotoRestrictionEditorAction.kt */
/* loaded from: classes4.dex */
public final class gmo implements qn60.b {
    public final Photo a;
    public final pn60 b;

    /* compiled from: DropPhotoRestrictionEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public gmo(Photo photo, pn60 pn60Var) {
        this.a = photo;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Post post;
        ArrayList<EntryAttachment> arrayList;
        List<EntryAttachment> N7;
        Photo photo = this.a;
        HashSet c = aVar.c(new eb60.a(photo.e));
        if (c == null) {
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (NewsEntry) it.next();
            if (parcelable instanceof NewsEntryWithAttachments) {
                Iterator<T> it2 = ((NewsEntryWithAttachments) parcelable).Gb().iterator();
                while (it2.hasNext()) {
                    Attachment attachment = ((EntryAttachment) it2.next()).b;
                    if (attachment instanceof PhotoAttachment) {
                        PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
                        if (epx.f(photoAttachment.l.e, photo.e)) {
                            Photo photo2 = photoAttachment.l;
                            if (photo2.c == photo.c) {
                                photo2.L = null;
                            }
                        }
                    }
                }
            }
            if ((parcelable instanceof fsx0) && (N7 = ((fsx0) parcelable).N7()) != null) {
                Iterator<T> it3 = N7.iterator();
                while (it3.hasNext()) {
                    Attachment attachment2 = ((EntryAttachment) it3.next()).b;
                    if (attachment2 instanceof PhotoAttachment) {
                        PhotoAttachment photoAttachment2 = (PhotoAttachment) attachment2;
                        if (epx.f(photoAttachment2.l.e, photo.e)) {
                            Photo photo3 = photoAttachment2.l;
                            if (photo3.c == photo.c) {
                                photo3.L = null;
                            }
                        }
                    }
                }
            }
            if ((parcelable instanceof Post) && (post = ((Post) parcelable).D) != null && (arrayList = post.z) != null) {
                Iterator<T> it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Attachment attachment3 = ((EntryAttachment) it4.next()).b;
                    if (attachment3 instanceof PhotoAttachment) {
                        PhotoAttachment photoAttachment3 = (PhotoAttachment) attachment3;
                        if (epx.f(photoAttachment3.l.e, photo.e)) {
                            Photo photo4 = photoAttachment3.l;
                            if (photo4.c == photo.c) {
                                photo4.L = null;
                            }
                        }
                    }
                }
            }
            if (parcelable instanceof PromoPost) {
                Iterator<T> it5 = ((PromoPost) parcelable).n.z.iterator();
                while (it5.hasNext()) {
                    Attachment attachment4 = ((EntryAttachment) it5.next()).b;
                    if (attachment4 instanceof PhotoAttachment) {
                        PhotoAttachment photoAttachment4 = (PhotoAttachment) attachment4;
                        if (epx.f(photoAttachment4.l.e, photo.e)) {
                            Photo photo5 = photoAttachment4.l;
                            if (photo5.c == photo.c) {
                                photo5.L = null;
                            }
                        }
                    }
                }
            }
        }
        aVar.f(c, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
