package xsna;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import xsna.j6t0;
import xsna.m5i;
import xsna.q7c0;
import xsna.tlo0;
import xsna.u7c0;

/* compiled from: PostAttachmentsViewFactory.kt */
/* loaded from: classes15.dex */
public final class i0c0 {
    public static final List<String> a = e43.l("avi", "mp4", "mkv", "flv", "webm", "wmv", "m4v", "m4p", "3gp");
    public static final List<String> b = e43.l("jpg", "jpeg", "png", "svg", "gif", "tif", "tiff", "bmp", "eps", "raw");

    /* compiled from: PostAttachmentsViewFactory.kt */
    public interface a {
        boolean N1();

        void a();

        int b();
    }

    public static String a(Context context, q7c0 q7c0Var, u7c0.a aVar, int i) {
        Image image;
        w64 l;
        Pair pair;
        ImageSize Cb;
        ImageSize Cb2;
        ImageSize a2;
        String str = null;
        if (q7c0Var != null && aVar != null) {
            List<Attachment> list = aVar.b;
            m5i b2 = b(context, q7c0Var, (Attachment) j5g.a0(list));
            if (q7c0Var.equals(q7c0.b.e.a)) {
                float f = j6t0.a;
                Object a0 = j5g.a0(list);
                VideoAttachment videoAttachment = a0 instanceof VideoAttachment ? (VideoAttachment) a0 : null;
                if (videoAttachment != null && (a2 = j6t0.a.a(videoAttachment, i)) != null) {
                    str = a2.d.d;
                }
            } else if (q7c0Var.equals(q7c0.b.c.a)) {
                Attachment attachment = (Attachment) j5g.a0(list);
                if (attachment != null) {
                    if (attachment instanceof PhotoAttachment) {
                        Photo photo = ((PhotoAttachment) attachment).l;
                        if (photo.y.E0() > 1.0f) {
                            ImageSize Fb = photo.Fb(i, true);
                            pair = new Pair(Float.valueOf(Fb.E0()), Fb.d.d);
                        } else {
                            ImageSize Db = photo.Db(i, true);
                            pair = new Pair(Float.valueOf(Db.E0()), Db.d.d);
                        }
                    } else if (attachment instanceof DocumentAttachment) {
                        Image image2 = ((DocumentAttachment) attachment).s;
                        if ((image2 != null ? image2.E0() : 1.0f) > 1.0f) {
                            Float valueOf = Float.valueOf(image2 != null ? image2.E0() : 1.0f);
                            if (image2 != null && (Cb2 = image2.Cb(i, true, true)) != null) {
                                str = Cb2.d.d;
                            }
                            pair = new Pair(valueOf, str);
                        } else {
                            Float valueOf2 = Float.valueOf(image2 != null ? image2.E0() : 1.0f);
                            if (image2 != null && (Cb = image2.Cb(i, false, true)) != null) {
                                str = Cb.d.d;
                            }
                            pair = new Pair(valueOf2, str);
                        }
                    } else {
                        pair = new Pair(Float.valueOf(1.0f), null);
                    }
                    str = (String) pair.j();
                }
            } else if (q7c0Var.equals(q7c0.b.a.a)) {
                float f2 = zc1.a;
                Object a02 = j5g.a0(list);
                AlbumAttachment albumAttachment = a02 instanceof AlbumAttachment ? (AlbumAttachment) a02 : null;
                if (albumAttachment != null) {
                    str = albumAttachment.l.Fb(i, true).d.d;
                }
            } else if (q7c0Var instanceof q7c0.b.C3552b) {
                float f3 = bfu.a;
                Attachment attachment2 = (Attachment) j5g.b0(aVar.d, list);
                if (attachment2 != null && (l = egi.l(i, attachment2)) != null) {
                    str = l.a;
                }
            } else if (q7c0Var.equals(q7c0.b.d.a)) {
                y9c0 y9c0Var = aVar.c;
                ImageSize imageSize = (ImageSize) ixj0.d((y9c0Var == null || (image = y9c0Var.b) == null) ? null : image.b, i, true);
                if (imageSize != null) {
                    str = imageSize.d.d;
                }
            }
            if (str == null) {
                return b2.b;
            }
        }
        return str;
    }

    public static m5i b(Context context, q7c0 q7c0Var, Attachment attachment) {
        String str;
        Object failure;
        m5i m5iVar;
        String str2;
        Artist artist;
        m5i m5iVar2;
        m5i m5iVar3;
        m5i m5iVar4 = null;
        m5iVar4 = null;
        StringBuilder sb = null;
        m5iVar4 = null;
        m5iVar4 = null;
        m5iVar4 = null;
        m5iVar4 = null;
        m5iVar4 = null;
        m5iVar4 = null;
        m5iVar4 = null;
        if (q7c0Var instanceof q7c0.a.g) {
            PollAttachment pollAttachment = attachment instanceof PollAttachment ? (PollAttachment) attachment : null;
            if (pollAttachment != null) {
                m5iVar3 = new m5i.g(R.drawable.vk_icon_poll_outline_24, null, oq.d(tlo0.Companion, pollAttachment.f.d), pollAttachment.f.i ? new tlo0.f(R.string.poll_anonym) : new tlo0.f(R.string.poll_open), false, null, 112);
                m5iVar4 = m5iVar3;
            }
        } else {
            str = "";
            if (q7c0Var instanceof q7c0.a.C3551a) {
                ArticleAttachment articleAttachment = attachment instanceof ArticleAttachment ? (ArticleAttachment) attachment : null;
                if (articleAttachment != null) {
                    String h9 = articleAttachment.h9();
                    tlo0.a aVar = tlo0.Companion;
                    Article article = articleAttachment.f;
                    String str3 = article.f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    tlo0.h d = oq.d(aVar, str3);
                    Owner owner = article.h;
                    if (owner != null) {
                        String str4 = owner.h;
                        if (str4 == null || str4.length() == 0) {
                            str = context.getString(R.string.article_author, owner.c);
                        } else {
                            String str5 = owner.i;
                            if (str5 == null || str5.length() == 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(owner.h);
                                String str6 = owner.n;
                                if (str6 == null || str6.length() == 0) {
                                    sb2 = null;
                                }
                                if (sb2 != null) {
                                    sb2.append(' ');
                                    String str7 = owner.n;
                                    sb2.append(str7 != null ? Character.valueOf(erm0.x0(str7)) : null);
                                    sb2.append(JwtParser.SEPARATOR_CHAR);
                                    sb = sb2;
                                }
                                str = context.getString(R.string.article_author_from, sb);
                            } else {
                                str = context.getString(R.string.article_author_from, owner.h + ' ' + owner.i);
                            }
                        }
                    }
                    m5iVar2 = new m5i.a(R.drawable.vk_icon_articles_outline_28, h9, d, new tlo0.h(str), false, null, 112);
                    m5iVar4 = m5iVar2;
                }
            } else if (q7c0Var instanceof q7c0.a.f) {
                AudioPlaylistAttachment audioPlaylistAttachment = attachment instanceof AudioPlaylistAttachment ? (AudioPlaylistAttachment) attachment : null;
                if (audioPlaylistAttachment != null) {
                    String h92 = audioPlaylistAttachment.h9();
                    tlo0.a aVar2 = tlo0.Companion;
                    Playlist playlist = audioPlaylistAttachment.f;
                    String str8 = playlist.h;
                    m5iVar2 = new m5i.f(R.drawable.vk_icon_playlist_outline_24, h92, oq.d(aVar2, str8 != null ? str8 : ""), new tlo0.d(R.plurals.audio_playlist_quantity, playlist.v), false, null, 112);
                    m5iVar4 = m5iVar2;
                }
            } else if (q7c0Var instanceof q7c0.a.h) {
                AudioAttachment audioAttachment = attachment instanceof AudioAttachment ? (AudioAttachment) attachment : null;
                if (audioAttachment != null) {
                    MusicTrack musicTrack = audioAttachment.f;
                    String Kb = musicTrack.Kb(cn70.b(40));
                    tlo0.a aVar3 = tlo0.Companion;
                    String str9 = musicTrack.d;
                    if (str9 == null) {
                        str9 = "";
                    }
                    tlo0.h d2 = oq.d(aVar3, str9);
                    List<Artist> list = musicTrack.t;
                    m5iVar = new m5i.h(R.drawable.vk_icon_music_outline_24, Kb, d2, tlo0.a.c(R.string.track_artist_from, ((list == null || (artist = (Artist) j5g.a0(list)) == null || (str2 = artist.c) == null) && (str2 = musicTrack.h) == null) ? "" : str2), musicTrack.B(), null, 96);
                    m5iVar4 = m5iVar;
                }
            } else if (q7c0Var instanceof q7c0.a.d) {
                if (attachment instanceof LinkAttachment) {
                    LinkAttachment linkAttachment = (LinkAttachment) attachment;
                    SnippetAttachment snippetAttachment = linkAttachment.n;
                    String h93 = snippetAttachment != null ? snippetAttachment.h9() : null;
                    String str10 = linkAttachment.g;
                    try {
                        failure = Uri.parse(((LinkAttachment) attachment).f.b).getAuthority();
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    String str11 = (String) (failure instanceof Result.Failure ? null : failure);
                    if (str11 == null) {
                        str11 = linkAttachment.f.b;
                    }
                    m5iVar4 = new m5i.d(h93, str10, str11);
                } else if (attachment instanceof MiniAppAttachment) {
                    MiniAppAttachment miniAppAttachment = (MiniAppAttachment) attachment;
                    m5iVar4 = new m5i.d(miniAppAttachment.h9(), miniAppAttachment.g, miniAppAttachment.h);
                } else if (attachment instanceof SnippetAttachment) {
                    SnippetAttachment snippetAttachment2 = (SnippetAttachment) attachment;
                    String h94 = snippetAttachment2.h9();
                    String str12 = snippetAttachment2.g;
                    String str13 = snippetAttachment2.h;
                    if (drm0.N(str13)) {
                        str13 = snippetAttachment2.i;
                    }
                    m5iVar4 = new m5i.d(h94, str12, drm0.N(str13) ? null : str13);
                }
            } else if (q7c0Var instanceof q7c0.a.c) {
                GeoAttachment geoAttachment = attachment instanceof GeoAttachment ? (GeoAttachment) attachment : null;
                if (geoAttachment != null) {
                    tlo0.a aVar4 = tlo0.Companion;
                    String str14 = geoAttachment.h;
                    if (str14 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        double d3 = 100000;
                        sb3.append(String.valueOf(Math.rint(geoAttachment.f * d3) / d3));
                        sb3.append(" x ");
                        sb3.append(String.valueOf(Math.rint(geoAttachment.g * d3) / d3));
                        str14 = sb3.toString();
                    }
                    tlo0.h d4 = oq.d(aVar4, str14);
                    String str15 = geoAttachment.i;
                    m5iVar3 = new m5i.c(R.drawable.vk_icon_location_map_outline_24, null, d4, str15 != null ? new tlo0.h(str15) : null, false, null, 112);
                    m5iVar4 = m5iVar3;
                }
            } else {
                boolean z = q7c0Var instanceof q7c0.a.b;
                int i = R.drawable.vk_icon_picture_outline_24;
                if (z) {
                    DocumentAttachment documentAttachment = attachment instanceof DocumentAttachment ? (DocumentAttachment) attachment : null;
                    if (documentAttachment != null) {
                        String str16 = documentAttachment.i;
                        if (a.contains(str16)) {
                            i = R.drawable.vk_icon_video_outline_24;
                        } else if (!b.contains(str16)) {
                            i = R.drawable.vk_icon_document_outline_24;
                        }
                        m5iVar2 = new m5i.b(i, null, oq.d(tlo0.Companion, documentAttachment.f), new tlo0.h(dun.s6(documentAttachment.n, context.getResources())), false, null, 112);
                        m5iVar4 = m5iVar2;
                    }
                } else if (q7c0Var instanceof q7c0.a.e) {
                    NarrativeAttachment narrativeAttachment = attachment instanceof NarrativeAttachment ? (NarrativeAttachment) attachment : null;
                    if (narrativeAttachment != null) {
                        Narrative narrative = narrativeAttachment.f;
                        if (narrative.h) {
                            i = R.drawable.vk_icon_delete_outline_24;
                        } else if (!narrative.Ab()) {
                            i = R.drawable.vk_icon_lock_outline_24;
                        }
                        int i2 = i;
                        Serializer.c<Narrative> cVar = Narrative.CREATOR;
                        int b2 = cn70.b(40);
                        HighlightCover highlightCover = narrative.e;
                        m5iVar = new m5i.e(i2, highlightCover != null ? highlightCover.e(b2) : null, oq.d(tlo0.Companion, narrative.d), narrative.i ? new tlo0.d(R.plurals.narrative_quantity, narrative.l.size()) : narrative.h ? new tlo0.f(R.string.narrative_deleted_story) : new tlo0.f(R.string.narrative_private_story), false, RoundingParams.a(), 16);
                        m5iVar4 = m5iVar;
                    }
                }
            }
        }
        return m5iVar4 == null ? m5i.i.h : m5iVar4;
    }
}
