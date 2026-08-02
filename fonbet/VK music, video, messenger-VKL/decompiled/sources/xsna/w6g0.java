package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.common.links.LinksParserData;
import com.vk.core.serialize.Serializer;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.b;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.StereoRoomAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.NoteAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.StoryAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import xsna.f5h0;

/* compiled from: RepostCompactHolder.kt */
/* loaded from: classes4.dex */
public final class w6g0 extends qi6<Post> implements View.OnClickListener, View.OnAttachStateChangeListener, i7o {
    public static final int W = iah0.a(60.0f);
    public static final int X = iah0.a(72.0f);
    public static final int Y = iah0.a(24.0f);
    public final p870 C;
    public final NewsfeedRouter D;
    public final kdg0 E;
    public final h170 F;
    public final VKCircleImageView G;
    public final TextView H;
    public final View I;
    public final TextView J;
    public final TextView K;
    public final FrameLayout L;
    public final VKImageView M;
    public final ImageView N;
    public final StringBuilder O;
    public final ShapeDrawable P;
    public final ColorStateList Q;
    public final ColorStateList R;
    public final a S;
    public final vpa T;
    public final io.reactivex.rxjava3.disposables.b U;
    public e6o V;

    public w6g0(ViewGroup viewGroup, p870 p870Var, NewsfeedRouter newsfeedRouter, kdg0 kdg0Var, h170 h170Var) {
        super(R.layout.news_item_repost_compact, viewGroup);
        this.C = p870Var;
        this.D = newsfeedRouter;
        this.E = kdg0Var;
        this.F = h170Var;
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.container);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.photo);
        this.G = vKCircleImageView;
        this.H = (TextView) this.itemView.findViewById(R.id.name);
        this.I = this.itemView.findViewById(R.id.icon);
        this.J = (TextView) this.itemView.findViewById(R.id.time);
        TextView textView = (TextView) this.itemView.findViewById(R.id.text);
        this.K = textView;
        this.L = (FrameLayout) this.itemView.findViewById(R.id.container);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.attach_thumb);
        this.M = vKImageView;
        this.N = (ImageView) this.itemView.findViewById(R.id.overlay);
        this.O = new StringBuilder();
        abg0 abg0Var = dhr0.t;
        this.Q = ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary));
        this.R = ColorStateList.valueOf(-1);
        a aVar = new a();
        this.S = aVar;
        this.T = new vpa();
        this.U = new io.reactivex.rxjava3.disposables.b();
        float a2 = iah0.a(6.0f);
        float[] fArr = new float[8];
        Arrays.fill(fArr, 0, 8, a2);
        vKCircleImageView.setPlaceholderImage(abg0Var.a(R.drawable.user_placeholder));
        RoundingParams roundingParams = vKCircleImageView.getHierarchy().c;
        if (roundingParams != null) {
            roundingParams.c(gbg0.a(this.itemView.getResources(), 0.5f), abg0Var.c(R.attr.vk_ui_field_border_alpha));
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(abg0Var.c(R.attr.vk_ui_background));
        njt hierarchy = vKImageView.getHierarchy();
        RoundingParams roundingParams2 = new RoundingParams();
        roundingParams2.f(a2);
        hierarchy.u(roundingParams2);
        vKImageView.setActualScaleType(f5h0.f.a);
        vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vKImageView.setPlaceholderImage(shapeDrawable);
        vKImageView.setOnLoadCallback(aVar);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.P = shapeDrawable2;
        shapeDrawable2.getPaint().setColor(viewGroup.getContext().getColor(R.color.vk_black_alpha35));
        textView.setTransformationMethod(new quj0());
        int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.post_side_padding) - cn70.b(8);
        awt0.x(viewGroup2, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        View view = this.itemView;
        View.OnClickListener onClickListener = this.V;
        view.setOnClickListener(onClickListener == null ? this : onClickListener);
        this.itemView.addOnAttachStateChangeListener(this);
    }

    public static boolean T6(Post post) {
        if (!epx.f(post.t, "video")) {
            return false;
        }
        Attachment Ib = post.Ib();
        VideoAttachment videoAttachment = Ib instanceof VideoAttachment ? (VideoAttachment) Ib : null;
        return (videoAttachment != null ? videoAttachment.k : null) instanceof MusicVideoFile;
    }

    public static MusicVideoFile X6(Post post) {
        Attachment Ib = post.Ib();
        VideoAttachment videoAttachment = Ib instanceof VideoAttachment ? (VideoAttachment) Ib : null;
        VideoFile videoFile = videoAttachment != null ? videoAttachment.k : null;
        if (videoFile instanceof MusicVideoFile) {
            return (MusicVideoFile) videoFile;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x02a5, code lost:
    
        if (xsna.lrp.a(r3) == false) goto L140;
     */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E6(Post post) {
        String f;
        String str;
        ej90 ej90Var;
        CharSequence charSequence;
        String str2;
        String quantityString;
        int i;
        ImageSize Cb;
        ImageSize Fb;
        ImageSize Cb2;
        String str3;
        ImageSize Fb2;
        boolean z;
        Image image;
        ImageSize Cb3;
        Post post2 = post;
        Flags flags = post2.l;
        ArrayList<EntryAttachment> arrayList = post2.z;
        Owner owner = post2.o;
        J0();
        boolean T6 = T6(post2);
        int i2 = Y;
        String str4 = null;
        if (T6) {
            MusicVideoFile X6 = X6(post2);
            if (X6 != null) {
                List<Artist> list = X6.B1;
                Artist artist = list != null ? (Artist) j5g.a0(list) : null;
                if (artist != null && (image = artist.f) != null && (Cb3 = image.Cb(i2, true, false)) != null) {
                    f = Cb3.d.d;
                }
            }
            f = null;
        } else {
            f = owner.f(i2);
        }
        this.G.o0(f, null);
        ucp ucpVar = ucp.a;
        if (T6(post2)) {
            MusicVideoFile X62 = X6(post2);
            if (X62 != null) {
                List<Artist> list2 = X62.B1;
                Artist artist2 = list2 != null ? (Artist) j5g.a0(list2) : null;
                if (artist2 != null) {
                    str = artist2.c;
                }
            }
            str = null;
        } else {
            str = owner.c;
        }
        this.H.setText(ucp.i(str));
        VerifyInfo verifyInfo = owner.f;
        boolean z2 = verifyInfo != null && verifyInfo.b;
        boolean z3 = (verifyInfo != null && verifyInfo.c) || flags.zb(8388608L);
        boolean z4 = z2 || z3;
        View view = this.I;
        if (z4) {
            view.setBackground(VerifyInfoHelper.h(VerifyInfoHelper.a, new VerifyInfo(z2, z3, false, false, false, false, 60, null), this.itemView.getContext(), null, 28));
        }
        bwt0.p0(view, z4);
        if (((Boolean) this.F.E.getValue()).booleanValue()) {
            cn70.b(6);
            Bundle bundle = post2.K;
            float f2 = post2.N.d;
            ObsceneTextFilter obsceneTextFilter = o25.a().i().U;
            LinksParserData.HashtagService hashtagService = LinksParserData.HashtagService.Posts;
            String str5 = post2.s;
            LinksParserData linksParserData = new LinksParserData(43787, bundle, 0, 0, (String) null, (String) null, 0, 0, hashtagService, (saz) null, 0, (taz) null, obsceneTextFilter == ObsceneTextFilter.ENABLED, 1788);
            vdz vdzVar = new vdz(0);
            CharSequence i3 = ucp.i(xwk.d().a().o(str5, linksParserData, vdzVar));
            boolean z5 = vdzVar.a;
            Pattern pattern = n420.a;
            ej90Var = new ej90(i3, i3, n420.b(post2.s));
            flags.Ab(68719476736L, z5);
        } else {
            ej90Var = post2.P;
        }
        boolean zb = post2.l.zb(68719476736L);
        CharSequence charSequence2 = ej90Var != null ? ej90Var.a : null;
        if (charSequence2 != null && charSequence2.length() != 0) {
            charSequence = ej90Var.a;
        } else if (arrayList.isEmpty()) {
            charSequence = null;
        } else {
            StringBuilder sb = this.O;
            sb.setLength(0);
            Attachment Ib = post2.Ib();
            int size = post2.Gb().size();
            if (Ib instanceof AudioAttachment) {
                MusicTrack musicTrack = ((AudioAttachment) Ib).f;
                str2 = U6(musicTrack.h, musicTrack.d, " — ");
            } else if (Ib instanceof VideoAttachment) {
                str2 = ((VideoAttachment) Ib).k.getTitle();
            } else if (Ib instanceof AudioPlaylistAttachment) {
                AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) Ib;
                str2 = U6(c9b0.g(this.itemView.getContext(), audioPlaylistAttachment.f), audioPlaylistAttachment.f.h, " — ");
            } else if (Ib instanceof DocumentAttachment) {
                str2 = ((DocumentAttachment) Ib).f;
            } else if (Ib instanceof GeoAttachment) {
                if (size == 1) {
                    GeoAttachment geoAttachment = (GeoAttachment) Ib;
                    str2 = U6(geoAttachment.h, geoAttachment.i, ", ");
                } else {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    ((GeoAttachment) Ib).getClass();
                    str2 = context.getString(R.string.attach_place);
                }
            } else if (Ib instanceof MarketAlbumAttachment) {
                str2 = ((MarketAlbumAttachment) Ib).f.d;
            } else if (Ib instanceof MarketAttachment) {
                str2 = ((MarketAttachment) Ib).f.d;
            } else if (Ib instanceof PollAttachment) {
                str2 = ((PollAttachment) Ib).f.d;
            } else if (Ib instanceof LinkAttachment) {
                str2 = ((LinkAttachment) Ib).g;
            } else if (Ib instanceof SnippetAttachment) {
                str2 = ((SnippetAttachment) Ib).g;
            } else if (Ib instanceof AudioArtistAttachment) {
                AudioArtistAttachment audioArtistAttachment = (AudioArtistAttachment) Ib;
                Context context2 = this.itemView.getContext();
                audioArtistAttachment.getClass();
                str2 = U6(context2.getString(R.string.attach_artist), audioArtistAttachment.f.c, " ");
            } else if (Ib instanceof ArticleAttachment) {
                str2 = ((ArticleAttachment) Ib).f.f;
            } else if (Ib instanceof EventAttachment) {
                EventAttachment eventAttachment = (EventAttachment) Ib;
                int i4 = eventAttachment.g;
                Owner owner2 = eventAttachment.f;
                str2 = i4 > 0 ? U6(owner2.c, pvo0.i(false, i4, false, false), ", ") : U6(owner2.c, eventAttachment.h, ", ");
            } else if (Ib != null) {
                int zb2 = Ib.zb();
                Context context3 = e43.a;
                if (context3 == null) {
                    context3 = null;
                }
                str2 = context3.getString(zb2);
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                if (Ib instanceof GeoAttachment) {
                    i = 1;
                    if (size == 1) {
                        sb.append((CharSequence) str2);
                    }
                } else {
                    i = 1;
                }
                if (size != i) {
                    SparseIntArray sparseIntArray = lrp.a;
                }
                sb.append((CharSequence) str2);
            }
            String str6 = "";
            if (sb.length() > 0 && size > 1) {
                List<EntryAttachment> subList = size > 1 ? arrayList.subList(1, size) : arrayList;
                SparseIntArray sparseIntArray2 = lrp.a;
                int size2 = subList.size();
                if (size2 <= 0) {
                    quantityString = "";
                } else {
                    Context context4 = e43.a;
                    if (context4 == null) {
                        context4 = null;
                    }
                    Resources resources = context4.getResources();
                    boolean a2 = lrp.a(subList);
                    int i5 = R.plurals.num_attach_short;
                    if (a2) {
                        int i6 = lrp.a.get(subList.get(0).b.Ab());
                        if (i6 != 0) {
                            i5 = i6;
                        }
                        Context context5 = e43.a;
                        if (context5 == null) {
                            context5 = null;
                        }
                        quantityString = context5.getResources().getQuantityString(i5, size2);
                    } else {
                        quantityString = resources.getQuantityString(R.plurals.num_attach_short, size2);
                    }
                }
                sb.append(' ');
                sb.append(x6(R.string.newsfeed_repost_attachments_and_more, Integer.valueOf(subList.size()), quantityString));
            }
            if (sb.length() == 0 && !arrayList.isEmpty()) {
                SparseIntArray sparseIntArray3 = lrp.a;
                int size3 = post2.Gb().size();
                Attachment Ib2 = post2.Ib();
                if (Ib2 != null && size3 > 0) {
                    if (size3 == 1) {
                        Context context6 = e43.a;
                        if (context6 == null) {
                            context6 = null;
                        }
                        str6 = context6.getString(Ib2.zb());
                    } else if (lrp.a(arrayList)) {
                        int Ab = Ib2.Ab();
                        Context context7 = e43.a;
                        if (context7 == null) {
                            context7 = null;
                        }
                        Resources resources2 = context7.getResources();
                        str6 = Ab != 0 ? Ab != 1 ? Ab != 2 ? Ab != 3 ? Ab != 8 ? Ab != 17 ? resources2.getQuantityString(R.plurals.num_attach_other, size3, Integer.valueOf(size3)) : resources2.getQuantityString(R.plurals.num_attach_geo, size3, Integer.valueOf(size3)) : resources2.getQuantityString(R.plurals.num_attach_poll, size3, Integer.valueOf(size3)) : resources2.getQuantityString(R.plurals.num_attach_document, size3, Integer.valueOf(size3)) : resources2.getQuantityString(R.plurals.num_attach_audio, size3, Integer.valueOf(size3)) : resources2.getQuantityString(R.plurals.num_attach_video, size3, Integer.valueOf(size3)) : resources2.getQuantityString(R.plurals.num_attach_photo, size3, Integer.valueOf(size3));
                    } else {
                        Context context8 = e43.a;
                        if (context8 == null) {
                            context8 = null;
                        }
                        str6 = context8.getString(R.string.attachments);
                    }
                }
                sb.append(str6);
            }
            charSequence = ucp.i(sb);
        }
        TextView textView = this.K;
        textView.setText(charSequence);
        if (zb) {
            if (ej90Var == null) {
                com.vk.metrics.eventtracking.b.a.a(new Throwable("parsedText is null"));
            } else {
                this.U.b(itg0.l(this.T.b(ej90Var, new t0c0(this.C, post2))));
            }
        }
        textView.setContentDescription(ej90Var != null ? ej90Var.c : null);
        Attachment Ib3 = post2.Ib();
        VKImageView vKImageView = this.M;
        vKImageView.setPostprocessor(null);
        if (Ib3 == null) {
            z = false;
        } else {
            a aVar = this.S;
            aVar.getClass();
            aVar.b = new WeakReference<>(this);
            aVar.c = Ib3;
            boolean z6 = Ib3 instanceof PhotoAttachment;
            ImageView imageView = this.N;
            int i7 = W;
            if (z6) {
                PhotoAttachment photoAttachment = (PhotoAttachment) Ib3;
                Photo photo = photoAttachment.l;
                PhotoRestriction photoRestriction = photo.L;
                if (photoRestriction == null) {
                    bwt0.p0(imageView, false);
                    ImageSize Cb4 = photo.y.Cb(i7, true, false);
                    vKImageView.load(Cb4 != null ? Cb4.d.d : null);
                } else {
                    boolean z7 = photoRestriction.d;
                    imageView.setImageDrawable(this.E.a(photoRestriction));
                    imageView.setBackground(null);
                    bwt0.p0(imageView, true);
                    String Ib4 = z7 ? photoAttachment.Ib() : null;
                    vKImageView.setPostprocessor(z7 ? edg0.a : null);
                    vKImageView.load(Ib4);
                }
            } else if (Ib3 instanceof VideoAttachment) {
                W6(R.drawable.vk_icon_play_28);
                ImageSize Cb5 = ((VideoAttachment) Ib3).k.getImage().Cb(i7, true, false);
                vKImageView.load(Cb5 != null ? Cb5.d.d : null);
            } else if (Ib3 instanceof SnippetAttachment) {
                SnippetAttachment snippetAttachment = (SnippetAttachment) Ib3;
                Photo photo2 = snippetAttachment.p;
                String str7 = (photo2 == null || (Fb2 = photo2.Fb(i7, false)) == null) ? null : Fb2.d.d;
                if (str7 == null || str7.length() == 0) {
                    R6(snippetAttachment);
                } else {
                    W6(R.drawable.vk_icon_link_outline_28);
                    vKImageView.load(str7);
                }
            } else if (Ib3 instanceof ArticleAttachment) {
                ArticleAttachment articleAttachment = (ArticleAttachment) Ib3;
                String f3 = articleAttachment.f.f(i7);
                if (f3 == null || f3.length() == 0) {
                    R6(articleAttachment);
                } else {
                    W6(R.drawable.vk_icon_article_outline_28);
                    vKImageView.load(f3);
                }
            } else if (Ib3 instanceof AudioAttachment) {
                AudioAttachment audioAttachment = (AudioAttachment) Ib3;
                String Kb = audioAttachment.f.Kb(i7);
                if (Kb == null || Kb.length() == 0) {
                    R6(audioAttachment);
                } else {
                    W6(R.drawable.vk_icon_music_outline_28);
                    vKImageView.load(Kb);
                }
            } else if (Ib3 instanceof AudioPlaylistAttachment) {
                AudioPlaylistAttachment audioPlaylistAttachment2 = (AudioPlaylistAttachment) Ib3;
                Thumb thumb = audioPlaylistAttachment2.f.m;
                if (thumb != null) {
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    str3 = thumb.Ab(i7, false);
                } else {
                    str3 = null;
                }
                if (str3 == null || str3.length() == 0) {
                    R6(audioPlaylistAttachment2);
                } else {
                    W6(R.drawable.vk_icon_playlist_outline_28);
                    vKImageView.load(str3);
                }
            } else if (Ib3 instanceof AudioArtistAttachment) {
                AudioArtistAttachment audioArtistAttachment2 = (AudioArtistAttachment) Ib3;
                Image image2 = audioArtistAttachment2.f.f;
                String str8 = (image2 == null || (Cb2 = image2.Cb(i7, true, false)) == null) ? null : Cb2.d.d;
                if (str8 == null || str8.length() == 0) {
                    R6(audioArtistAttachment2);
                } else {
                    W6(R.drawable.vk_icon_music_mic_outline_28);
                    vKImageView.load(str8);
                }
            } else if (Ib3 instanceof MarketAttachment) {
                MarketAttachment marketAttachment = (MarketAttachment) Ib3;
                String h9 = marketAttachment.h9();
                if (h9 == null || h9.length() == 0) {
                    R6(marketAttachment);
                } else {
                    W6(R.drawable.vk_icon_market_outline_28);
                    vKImageView.load(h9);
                }
            } else if (Ib3 instanceof MarketAlbumAttachment) {
                MarketAlbumAttachment marketAlbumAttachment = (MarketAlbumAttachment) Ib3;
                Photo photo3 = marketAlbumAttachment.f.e;
                String str9 = (photo3 == null || (Fb = photo3.Fb(i7, false)) == null) ? null : Fb.d.d;
                if (str9 == null || str9.length() == 0) {
                    R6(marketAlbumAttachment);
                } else {
                    W6(R.drawable.vk_icon_market_outline_28);
                    vKImageView.load(str9);
                }
            } else if (Ib3 instanceof EventAttachment) {
                EventAttachment eventAttachment2 = (EventAttachment) Ib3;
                String f4 = eventAttachment2.f.f(i7);
                if (f4 == null || f4.length() == 0) {
                    R6(eventAttachment2);
                } else {
                    W6(R.drawable.vk_icon_link_outline_28);
                    vKImageView.load(f4);
                }
            } else if (Ib3 instanceof GraffitiAttachment) {
                GraffitiAttachment graffitiAttachment = (GraffitiAttachment) Ib3;
                String str10 = graffitiAttachment.h;
                if (str10 == null || str10.length() == 0) {
                    R6(graffitiAttachment);
                } else {
                    bwt0.p0(imageView, false);
                    vKImageView.load(str10);
                }
            } else if (Ib3 instanceof StickerAttachment) {
                StickerAttachment stickerAttachment = (StickerAttachment) Ib3;
                String h92 = stickerAttachment.h9();
                if (h92.length() == 0) {
                    R6(stickerAttachment);
                } else {
                    bwt0.p0(imageView, false);
                    vKImageView.load(h92);
                }
            } else {
                if (Ib3 instanceof DocumentAttachment) {
                    DocumentAttachment documentAttachment = (DocumentAttachment) Ib3;
                    if (documentAttachment.Ib()) {
                        Image image3 = documentAttachment.s;
                        String str11 = (image3 == null || (Cb = image3.Cb(i7, true, false)) == null) ? null : Cb.d.d;
                        if (str11 == null || str11.length() == 0) {
                            R6(documentAttachment);
                        } else {
                            bwt0.p0(imageView, false);
                            vKImageView.load(str11);
                        }
                    }
                }
                R6(Ib3);
            }
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        FrameLayout frameLayout = this.L;
        if (z) {
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(X);
            }
            bwt0.p0(frameLayout, true);
        } else {
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(0);
            }
            bwt0.p0(frameLayout, false);
        }
        if (T6(post2) && fkq0.d(owner.b)) {
            MusicVideoFile X63 = X6(post2);
            if (X63 != null) {
                str4 = b.C0795b.d(X63.F1, X63.E1);
            }
        } else {
            int i8 = post2.r;
            if (i8 > 0) {
                str4 = pvo0.k(i8, this.itemView.getResources(), false);
            }
        }
        this.J.setText(str4);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.V = a2;
        this.itemView.setOnClickListener(a2);
    }

    public final void R6(Attachment attachment) {
        boolean z = attachment instanceof PhotoAttachment;
        int i = R.drawable.vk_icon_picture_outline_28;
        if (!z && !(attachment instanceof GraffitiAttachment) && !(attachment instanceof StickerAttachment)) {
            if (attachment instanceof VideoAttachment) {
                i = R.drawable.vk_icon_video_outline_28;
            } else if (attachment instanceof AudioAttachment) {
                i = R.drawable.vk_icon_music_outline_28;
            } else if (attachment instanceof DocumentAttachment) {
                if (!((DocumentAttachment) attachment).Ib()) {
                    i = R.drawable.vk_icon_document_outline_28;
                }
            } else if ((attachment instanceof NoteAttachment) || (attachment instanceof ArticleAttachment)) {
                i = R.drawable.vk_icon_article_outline_28;
            } else if (attachment instanceof PollAttachment) {
                i = R.drawable.vk_icon_poll_square_outline_28;
            } else {
                boolean z2 = attachment instanceof PodcastAttachment;
                i = R.drawable.vk_icon_podcast_outline_28;
                if (!z2) {
                    if ((attachment instanceof MarketAttachment) || (attachment instanceof MarketAlbumAttachment)) {
                        i = R.drawable.vk_icon_market_outline_28;
                    } else if ((attachment instanceof NarrativeAttachment) || (attachment instanceof StoryAttachment)) {
                        i = R.drawable.vk_icon_story_outline_28;
                    } else if (attachment instanceof AudioPlaylistAttachment) {
                        i = R.drawable.vk_icon_playlist_outline_28;
                    } else if (attachment instanceof AudioArtistAttachment) {
                        i = R.drawable.vk_icon_music_mic_outline_28;
                    } else if (attachment instanceof GeoAttachment) {
                        i = R.drawable.vk_icon_place_outline_28;
                    } else if (!(attachment instanceof StereoRoomAttachment)) {
                        i = R.drawable.vk_icon_link_outline_28;
                    }
                }
            }
        }
        ImageView imageView = this.N;
        imageView.setImageResource(i);
        imageView.setImageTintList(this.Q);
        imageView.setBackground(null);
        bwt0.p0(imageView, true);
        this.M.clear();
    }

    public final String U6(CharSequence charSequence, CharSequence charSequence2, String str) {
        if ((charSequence2 == null || charSequence2.length() == 0) && (charSequence == null || charSequence.length() == 0)) {
            return null;
        }
        StringBuilder sb = this.O;
        sb.setLength(0);
        if (charSequence != null && charSequence.length() != 0) {
            sb.append(charSequence);
        }
        if (charSequence2 != null && charSequence2.length() != 0) {
            if (sb.length() > 0) {
                sb.append((CharSequence) str);
            }
            sb.append(charSequence2);
        }
        String sb2 = sb.toString();
        sb.setLength(0);
        return sb2;
    }

    public final void W6(int i) {
        ImageView imageView = this.N;
        imageView.setImageResource(i);
        imageView.setImageTintList(this.R);
        imageView.setBackground(this.P);
        bwt0.p0(imageView, true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6;
        if (jjc.b() || (q6 = q6()) == null) {
            return;
        }
        Integer num = q6.u;
        Integer num2 = q6.v;
        if (num == null || num2 == null) {
            i6().sa(new NewsfeedExternalAction.b.a(q6, this.u, this.v, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME, t6()));
            return;
        }
        this.D.Y(q6.n, num2.intValue(), num.intValue(), this.itemView.getContext(), q6.m);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.U.e();
    }

    /* compiled from: RepostCompactHolder.kt */
    public static final class a implements b780 {
        public WeakReference<w6g0> b;
        public Attachment c;

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            w6g0 w6g0Var;
            Attachment attachment;
            WeakReference<w6g0> weakReference = this.b;
            if (weakReference == null || (w6g0Var = weakReference.get()) == null || (attachment = this.c) == null) {
                return;
            }
            w6g0Var.R6(attachment);
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
