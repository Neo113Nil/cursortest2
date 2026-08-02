package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Episode;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DigestTextItemHolder.kt */
/* loaded from: classes4.dex */
public class uym extends jym implements View.OnClickListener {
    public final View D;
    public final View E;
    public final VkText F;
    public final VkText G;
    public final VkText H;
    public final VkImage I;
    public final VkImageSimple J;
    public final int K;
    public final boolean L;
    public final ShapeDrawable M;
    public final ColorDrawable N;
    public final StringBuilder O;
    public final Object P;

    public uym(ViewGroup viewGroup) {
        super(R.layout.news_digest_text_item, viewGroup);
        this.C = -1;
        View findViewById = this.itemView.findViewById(R.id.digest_list_item);
        this.D = findViewById;
        this.E = this.itemView.findViewById(R.id.digest_name_container);
        this.F = (VkText) this.itemView.findViewById(R.id.digest_name);
        VkText vkText = (VkText) this.itemView.findViewById(R.id.digest_text);
        this.G = vkText;
        this.H = (VkText) this.itemView.findViewById(R.id.digest_time);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.digest_attach_thumb);
        this.I = vkImage;
        this.J = (VkImageSimple) this.itemView.findViewById(R.id.digest_overlay);
        this.K = cn70.b(60);
        this.itemView.getContext();
        cn70.b(44);
        this.L = true;
        ColorDrawable colorDrawable = new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext()));
        this.N = colorDrawable;
        this.O = new StringBuilder();
        this.P = msy.a(LazyThreadSafetyMode.NONE, new nwk((hqj0) this, 3));
        dek0.b(vkImage, null, null, 6);
        findViewById.setOnClickListener(this);
        vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vkImage.setPlaceholderImage(colorDrawable);
        getContext();
        float[] fArr = new float[8];
        Arrays.fill(fArr, 0, 8, cn70.a() * 8.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.M = shapeDrawable;
        shapeDrawable.getPaint().setColor(this.itemView.getContext().getColor(R.color.vk_black_alpha16));
        vkText.setTransformationMethod(new quj0());
    }

    public static String c7(int i, Attachment attachment) {
        Thumb thumb;
        ImageSize Cb;
        Image image;
        ImageSize Cb2;
        Image image2;
        ImageSize Cb3;
        Image image3;
        ImageSize Cb4;
        if (attachment instanceof PhotoAttachment) {
            ImageSize Cb5 = ((PhotoAttachment) attachment).l.y.Cb(i, true, false);
            if (Cb5 != null) {
                return Cb5.d.d;
            }
        } else if (attachment instanceof VideoAttachment) {
            ImageSize Cb6 = ((VideoAttachment) attachment).k.getImage().Cb(i, true, false);
            if (Cb6 != null) {
                return Cb6.d.d;
            }
        } else {
            if (attachment instanceof SnippetAttachment) {
                Photo photo = ((SnippetAttachment) attachment).p;
                if (photo == null || (image3 = photo.y) == null || (Cb4 = image3.Cb(i, true, false)) == null) {
                    return null;
                }
                return Cb4.d.d;
            }
            if (attachment instanceof ArticleAttachment) {
                Photo photo2 = ((ArticleAttachment) attachment).f.l;
                if (photo2 != null && (image2 = photo2.y) != null && (Cb3 = image2.Cb(i, true, false)) != null) {
                    return Cb3.d.d;
                }
            } else if (attachment instanceof PodcastAttachment) {
                Episode episode = ((PodcastAttachment) attachment).f.w;
                if (episode != null && (image = episode.f) != null && (Cb2 = image.Cb(i, true, false)) != null) {
                    return Cb2.d.d;
                }
            } else if (attachment instanceof MarketAttachment) {
                Image image4 = ((MarketAttachment) attachment).f.n;
                if (image4 != null && (Cb = image4.Cb(i, true, false)) != null) {
                    return Cb.d.d;
                }
            } else if (attachment instanceof AudioPlaylistAttachment) {
                Playlist playlist = ((AudioPlaylistAttachment) attachment).f;
                Thumb thumb2 = playlist.m;
                if (thumb2 != null) {
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    return thumb2.Ab(i, false);
                }
                List<Thumb> list = playlist.p;
                if (list != null && (thumb = (Thumb) j5g.a0(list)) != null) {
                    Serializer.c<Thumb> cVar2 = Thumb.CREATOR;
                    return thumb.Ab(i, false);
                }
            }
        }
        return null;
    }

    public static String d7(uym uymVar, Attachment attachment) {
        return c7(uymVar.e7(), attachment);
    }

    @Override // xsna.jym
    public void R6(DigestItem digestItem) {
        u1c0 J0 = J0();
        StringBuilder sb = null;
        ol60 ol60Var = J0 != null ? J0.h : null;
        CharSequence charSequence = (ol60Var instanceof vym ? (vym) ol60Var : null) != null ? null : digestItem.l;
        Post post = digestItem.g;
        int i = post.r;
        ucp ucpVar = ucp.a;
        String str = digestItem.c;
        if (str == null) {
            str = post.o.c;
        }
        this.F.setText(ucp.i(str));
        xo9.A(this.G, charSequence);
        if (i > 0) {
            sb = this.O;
            sb.setLength(0);
            sb.append("· ");
            sb.append(pvo0.i(false, i, false, false));
        }
        xo9.A(this.H, sb);
        f7(digestItem);
        h7();
    }

    public final void T6(int i, Attachment attachment) {
        String d7 = d7(this, attachment);
        if (d7 == null || d7.length() == 0) {
            Y6(i);
            return;
        }
        X6(i);
        VkImage vkImage = this.I;
        vkImage.o0(d7, null);
        bwt0.p0(vkImage, true);
    }

    public boolean U6(Attachment attachment) {
        Image image;
        ImageSize Cb;
        if (attachment instanceof PhotoAttachment) {
            W6(R.drawable.vk_icon_picture_outline_24, attachment);
            return true;
        }
        if (attachment instanceof VideoAttachment) {
            T6(R.drawable.vk_icon_play_24, attachment);
            return true;
        }
        if (attachment instanceof LinkAttachment) {
            Y6(R.drawable.vk_icon_link_24);
            return true;
        }
        if (attachment instanceof SnippetAttachment) {
            SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
            int e7 = e7();
            Photo photo = snippetAttachment.p;
            String str = (photo == null || (image = photo.y) == null || (Cb = image.Cb(e7, true, false)) == null) ? null : Cb.d.d;
            if (str == null || str.length() == 0) {
                Y6(R.drawable.vk_icon_link_24);
                return true;
            }
            if (snippetAttachment.q != null) {
                X6(R.drawable.vk_icon_article_24);
            } else {
                bwt0.p0(this.J, false);
            }
            VkImage vkImage = this.I;
            vkImage.o0(str, null);
            bwt0.p0(vkImage, true);
            return true;
        }
        if (attachment instanceof ArticleAttachment) {
            T6(R.drawable.vk_icon_article_24, attachment);
            return true;
        }
        if (attachment instanceof PodcastAttachment) {
            T6(R.drawable.vk_icon_podcast_24, attachment);
            return true;
        }
        if (attachment instanceof MarketAttachment) {
            W6(R.drawable.vk_icon_market_24, attachment);
            return true;
        }
        if (attachment instanceof PollAttachment) {
            Y6(R.drawable.vk_icon_poll_24);
            return true;
        }
        if (!(attachment instanceof AudioPlaylistAttachment)) {
            return false;
        }
        T6(R.drawable.vk_icon_playlist_24, attachment);
        return true;
    }

    public final void W6(int i, Attachment attachment) {
        String d7 = d7(this, attachment);
        if (d7 == null || d7.length() == 0) {
            Y6(i);
            return;
        }
        bwt0.p0(this.J, false);
        VkImage vkImage = this.I;
        vkImage.o0(d7, null);
        bwt0.p0(vkImage, true);
    }

    public final void X6(int i) {
        baf0 baf0Var = new baf0(m33.a(i, this.itemView.getContext()), -1);
        VkImageSimple vkImageSimple = this.J;
        vkImageSimple.setImageDrawable(baf0Var);
        vkImageSimple.setBackground(this.M);
        bwt0.p0(vkImageSimple, true);
    }

    public final void Y6(int i) {
        VkImageSimple vkImageSimple = this.J;
        omw.d(vkImageSimple, i, R.attr.vk_ui_icon_secondary);
        vkImageSimple.setBackground(null);
        bwt0.p0(vkImageSimple, true);
        VkImage vkImage = this.I;
        vkImage.clear();
        vkImage.setBackground(this.N);
        bwt0.p0(vkImage, true);
    }

    public boolean b7() {
        return this.L;
    }

    public int e7() {
        return this.K;
    }

    public void f7(DigestItem digestItem) {
        i7((b7() || digestItem.f != -1 || (digestItem.e instanceof tfw)) && U6(digestItem.d()));
    }

    public void i7(boolean z) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post post;
        Context context = this.itemView.getContext();
        if (jjc.b()) {
            return;
        }
        if (epx.f(view, this.F) || epx.f(view, this.E)) {
            Post q6 = q6();
            if (q6 != null) {
                gd60.Z0(hd60.a(), context, q6.m, null, null, 12);
                return;
            }
            return;
        }
        NewsEntry t6 = t6();
        Digest digest = t6 instanceof Digest ? (Digest) t6 : null;
        if (digest == null) {
            return;
        }
        String str = digest.j;
        Post q62 = q6();
        if (q62 != null) {
            ?? r0 = this.P;
            if (str == null || str.length() == 0) {
                post = q62;
                NewsfeedRouter.E((NewsfeedRouter) r0.getValue(), this.itemView.getContext(), post, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            } else {
                NewsfeedRouter newsfeedRouter = (NewsfeedRouter) r0.getValue();
                Context context2 = this.itemView.getContext();
                ArrayList arrayList = digest.q;
                String str2 = this.u;
                Digest.Header header = digest.k;
                newsfeedRouter.q(context2, str, arrayList, header != null ? header.c : "", q62.Ab(), str2);
                post = q62;
            }
            b.d dVar = new b.d("digest_post_open");
            dVar.b(digest.o, "track_code");
            dVar.b(post.Bb(), "post_id");
            dVar.e();
        }
    }

    public void h7() {
    }

    public uym(ViewGroup viewGroup, lym lymVar) {
        super(lymVar);
        this.C = -1;
        View findViewById = this.itemView.findViewById(R.id.digest_list_item);
        this.D = findViewById;
        this.E = this.itemView.findViewById(R.id.digest_name_container);
        this.F = (VkText) this.itemView.findViewById(R.id.digest_name);
        VkText vkText = (VkText) this.itemView.findViewById(R.id.digest_text);
        this.G = vkText;
        this.H = (VkText) this.itemView.findViewById(R.id.digest_time);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.digest_attach_thumb);
        this.I = vkImage;
        this.J = (VkImageSimple) this.itemView.findViewById(R.id.digest_overlay);
        this.K = cn70.b(60);
        this.itemView.getContext();
        cn70.b(44);
        this.L = true;
        ColorDrawable colorDrawable = new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext()));
        this.N = colorDrawable;
        this.O = new StringBuilder();
        this.P = msy.a(LazyThreadSafetyMode.NONE, new p3h((iym) this, 9));
        dek0.b(vkImage, null, null, 6);
        findViewById.setOnClickListener(this);
        vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vkImage.setPlaceholderImage(colorDrawable);
        getContext();
        float[] fArr = new float[8];
        Arrays.fill(fArr, 0, 8, cn70.a() * 8.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.M = shapeDrawable;
        shapeDrawable.getPaint().setColor(this.itemView.getContext().getColor(R.color.vk_black_alpha16));
        vkText.setTransformationMethod(new quj0());
    }
}
