package xsna;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.base.Document;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.video.VideoAlbum;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.RepostAttachmentInfo;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MiniAppSnippetAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.WidgetAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Attachments.java */
@Deprecated
/* loaded from: classes5.dex */
public final class z74 {
    public static volatile gu50 a;
    public static final s84 b = new s84();

    @NonNull
    public static AttachmentInfo a(@NonNull Document document, boolean z) {
        Attachment pendingDocumentAttachment = z ? new PendingDocumentAttachment(document) : new DocumentAttachment(document);
        UserId userId = document.h;
        long j = document.b;
        String str = document.o;
        b.getClass();
        AttachmentInfo.b j2 = s84.j(8, pendingDocumentAttachment, userId, j, str);
        Bundle bundle = j2.e;
        bundle.putString("thumbUrl", document.n);
        bundle.putString("extension", document.m);
        bundle.putLong("size", document.g);
        return j2.a();
    }

    @NonNull
    public static AttachmentInfo b(@NonNull Article article) {
        return b.c(article);
    }

    @NonNull
    public static AttachmentInfo c(@NonNull VideoFile videoFile, @Nullable String str) {
        return b.f(videoFile, str);
    }

    @NonNull
    public static AttachmentInfo d(@NonNull ApiApplication apiApplication, @NonNull String str, Long l) {
        LinkAttachment linkAttachment = new LinkAttachment(str);
        UserId userId = UserId.d;
        long j = apiApplication.b.b;
        b.getClass();
        AttachmentInfo.b j2 = s84.j(11, linkAttachment, userId, j, null);
        boolean booleanValue = apiApplication.zb().booleanValue();
        Bundle bundle = j2.e;
        bundle.putBoolean("is_html_game", booleanValue);
        bundle.putParcelable("app_id", apiApplication.b);
        bundle.putString("link", str);
        if (l != null) {
            bundle.putLong("user_id", l.longValue());
        }
        return j2.a();
    }

    public static AttachmentInfo e(@Nullable Artist artist) {
        ArrayList<? extends Parcelable> arrayList;
        Image image;
        if (artist == null || (image = artist.f) == null) {
            arrayList = null;
        } else {
            Thumb[] thumbArr = {new Thumb(image)};
            arrayList = new ArrayList<>();
            Collections.addAll(arrayList, thumbArr);
        }
        AudioArtistAttachment audioArtistAttachment = new AudioArtistAttachment(artist);
        UserId userId = UserId.d;
        b.getClass();
        AttachmentInfo.b j = s84.j(4, audioArtistAttachment, userId, 0L, null);
        Bundle bundle = j.e;
        bundle.putString("artist", artist == null ? "" : artist.c);
        bundle.putString("artistId", artist != null ? artist.b : "");
        bundle.putParcelableArrayList("thumbs", arrayList);
        return j.a();
    }

    public static AttachmentInfo f(@Nullable Curator curator) {
        ArrayList<? extends Parcelable> arrayList;
        Image image;
        if (curator == null || (image = curator.e) == null) {
            arrayList = null;
        } else {
            Thumb[] thumbArr = {new Thumb(image)};
            arrayList = new ArrayList<>();
            Collections.addAll(arrayList, thumbArr);
        }
        AudioCuratorAttachment audioCuratorAttachment = new AudioCuratorAttachment(curator);
        UserId userId = UserId.d;
        b.getClass();
        AttachmentInfo.b j = s84.j(34, audioCuratorAttachment, userId, 0L, null);
        Bundle bundle = j.e;
        bundle.putString("curator", curator == null ? "" : curator.c);
        bundle.putString("curatorId", curator == null ? "" : curator.b);
        bundle.putString("link", curator != null ? curator.f : "");
        bundle.putParcelableArrayList("thumbs", arrayList);
        return j.a();
    }

    @NonNull
    public static AttachmentInfo g(@NonNull MusicTrack musicTrack) {
        boolean Vb = musicTrack.Vb();
        s84 s84Var = b;
        if (Vb) {
            PodcastAttachment podcastAttachment = new PodcastAttachment(musicTrack, null);
            UserId userId = musicTrack.c;
            long j = musicTrack.b;
            String str = musicTrack.r;
            s84Var.getClass();
            AttachmentInfo.b j2 = s84.j(20, podcastAttachment, userId, j, str);
            Bundle bundle = j2.e;
            bundle.putParcelable("thumb", musicTrack.Jb());
            bundle.putString("title", musicTrack.d);
            bundle.putString("artist", musicTrack.h);
            return j2.a();
        }
        AudioAttachment audioAttachment = new AudioAttachment(musicTrack);
        UserId userId2 = musicTrack.c;
        long j3 = musicTrack.b;
        String str2 = musicTrack.r;
        s84Var.getClass();
        AttachmentInfo.b j4 = s84.j(5, audioAttachment, userId2, j3, str2);
        Bundle bundle2 = j4.e;
        bundle2.putParcelable("thumb", musicTrack.Jb());
        bundle2.putString("title", musicTrack.d);
        bundle2.putString("artist", musicTrack.h);
        return j4.a();
    }

    @NonNull
    public static AttachmentInfo h(@NonNull Playlist playlist) {
        ArrayList<? extends Parcelable> arrayList;
        Playlist m = xx1.m(playlist);
        Thumb thumb = m.m;
        if (thumb != null) {
            arrayList = new ArrayList<>();
            Collections.addAll(arrayList, thumb);
        } else {
            List<Thumb> list = m.p;
            if (list != null) {
                arrayList = new ArrayList<>();
                arrayList.addAll(list);
            } else {
                arrayList = null;
            }
        }
        AudioPlaylistAttachment audioPlaylistAttachment = new AudioPlaylistAttachment(m);
        UserId userId = m.c;
        long j = m.b;
        String str = m.x;
        b.getClass();
        AttachmentInfo.b j2 = s84.j(19, audioPlaylistAttachment, userId, j, str);
        Bundle bundle = j2.e;
        bundle.putParcelableArrayList("thumbs", arrayList);
        bundle.putString("title", m.h);
        return j2.a();
    }

    @NonNull
    public static AttachmentInfo i(@NonNull VideoAlbum videoAlbum) {
        b.getClass();
        String Eb = videoAlbum.Eb();
        Bundle bundle = new Bundle();
        long j = videoAlbum.c.b;
        long j2 = videoAlbum.b;
        bundle.putParcelable("attachments", new LinkAttachment(Eb));
        bundle.putString("link", Eb);
        bundle.putString("trackCode", videoAlbum.n);
        return new AttachmentInfo(50, j, j2, null, bundle);
    }

    public static AttachmentInfo j(@NonNull String str, @NonNull String str2) {
        WidgetAttachment widgetAttachment = new WidgetAttachment(str, str2, "");
        UserId userId = UserId.d;
        b.getClass();
        return s84.j(37, widgetAttachment, userId, 0L, null).a();
    }

    public static AttachmentInfo k(@NonNull do0 do0Var) {
        MiniAppSnippetAttachment miniAppSnippetAttachment = new MiniAppSnippetAttachment(do0Var.a, do0Var.c, do0Var.d, do0Var.b, "action_app", do0Var.e);
        UserId userId = UserId.d;
        b.getClass();
        return s84.j(42, miniAppSnippetAttachment, userId, 0L, null).a();
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    public static String l(@Nullable AttachmentInfo attachmentInfo, @Nullable ActionsInfo actionsInfo) {
        if (attachmentInfo == null) {
            return actionsInfo != null ? actionsInfo.c : "";
        }
        StringBuilder sb = new StringBuilder(i5s.a(new StringBuilder("https://"), a0a.d, DomExceptionUtils.SEPARATOR));
        int i = attachmentInfo.b;
        if (i != 1) {
            if (i != 15) {
                if (i != 24) {
                    if (i == 26) {
                        sb.append("story");
                        sb.append(attachmentInfo.c);
                        sb.append(BundleUtil.UNDERLINE_TAG);
                        sb.append(attachmentInfo.d);
                    } else if (i != 3) {
                        if (i == 4) {
                            sb.append("artist/");
                            sb.append(attachmentInfo.f.getString("artistId"));
                        } else {
                            if (i != 5) {
                                if (i != 7) {
                                    if (i == 8) {
                                        sb.append("doc");
                                        sb.append(attachmentInfo.c);
                                        sb.append(BundleUtil.UNDERLINE_TAG);
                                        sb.append(attachmentInfo.d);
                                    } else if (i != 11) {
                                        if (i == 12) {
                                            return attachmentInfo.zb();
                                        }
                                        if (i == 39) {
                                            return actionsInfo == null ? attachmentInfo.f.getString("link") : actionsInfo.c;
                                        }
                                        if (i != 40) {
                                            if (i != 49 && i != 50) {
                                                switch (i) {
                                                    case 18:
                                                        sb.append("photo");
                                                        sb.append(attachmentInfo.c);
                                                        sb.append(BundleUtil.UNDERLINE_TAG);
                                                        sb.append(attachmentInfo.d);
                                                        break;
                                                    case 19:
                                                        sb.append("audio?z=audio_playlist");
                                                        sb.append(attachmentInfo.c);
                                                        sb.append(BundleUtil.UNDERLINE_TAG);
                                                        sb.append(attachmentInfo.d);
                                                        if (attachmentInfo.e != null) {
                                                            sb.append(DomExceptionUtils.SEPARATOR);
                                                            sb.append(attachmentInfo.e);
                                                            break;
                                                        }
                                                        break;
                                                    case 20:
                                                        sb.append("podcast");
                                                        sb.append(attachmentInfo.c);
                                                        sb.append(BundleUtil.UNDERLINE_TAG);
                                                        sb.append(attachmentInfo.d);
                                                        break;
                                                    case 21:
                                                        boolean z = attachmentInfo.f.getBoolean("is_board", false);
                                                        UserId userId = new UserId(attachmentInfo.c);
                                                        int i2 = (int) attachmentInfo.d;
                                                        bpn0 bpn0Var = csb0.a;
                                                        return csb0.a(i2, userId, z);
                                                    default:
                                                        switch (i) {
                                                            case 30:
                                                                break;
                                                            case 31:
                                                            case 32:
                                                                if (attachmentInfo.zb() == null) {
                                                                    sb.append("wall");
                                                                    sb.append(attachmentInfo.c);
                                                                    sb.append(BundleUtil.UNDERLINE_TAG);
                                                                    sb.append(attachmentInfo.d);
                                                                    break;
                                                                } else {
                                                                    return attachmentInfo.zb();
                                                                }
                                                            case 33:
                                                                sb.append("wall");
                                                                sb.append(attachmentInfo.c);
                                                                sb.append(BundleUtil.UNDERLINE_TAG);
                                                                sb.append(attachmentInfo.f.getInt("postId"));
                                                                sb.append("?reply=");
                                                                sb.append(attachmentInfo.d);
                                                                int i3 = attachmentInfo.f.getInt("parent_comment_id", 0);
                                                                if (i3 != 0) {
                                                                    sb.append("&thread=");
                                                                    sb.append(i3);
                                                                    break;
                                                                }
                                                                break;
                                                            case 34:
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException("Unsupported type:" + attachmentInfo.b);
                                                        }
                                                }
                                            }
                                        }
                                    }
                                }
                                return attachmentInfo.f.getString("link");
                            }
                            sb.append("audio");
                            sb.append(m(attachmentInfo));
                        }
                    }
                }
                return attachmentInfo.f.getString("link");
            }
            sb.append("narrative");
            sb.append(attachmentInfo.c);
            sb.append(BundleUtil.UNDERLINE_TAG);
            sb.append(attachmentInfo.d);
            return sb.toString();
        }
        try {
            Uri parse = Uri.parse(attachmentInfo.zb());
            return TextUtils.isEmpty(parse.getHost()) ? parse.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).authority(a0a.d).build().toString() : parse.toString();
        } catch (Exception unused) {
            return attachmentInfo.zb();
        }
    }

    public static String m(AttachmentInfo attachmentInfo) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(attachmentInfo.c);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(attachmentInfo.d);
        String str2 = attachmentInfo.e;
        if (str2 != null) {
            str = BundleUtil.UNDERLINE_TAG + str2;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    public static String n(@Nullable AttachmentInfo attachmentInfo) {
        LinkAttachment linkAttachment;
        String str;
        String string;
        String string2;
        if (attachmentInfo == null) {
            return "";
        }
        int i = attachmentInfo.b;
        Bundle bundle = attachmentInfo.f;
        if (3 == i && attachmentInfo.c == 0) {
            return bundle.getString("link");
        }
        if (4 == i) {
            return "artist" + bundle.getString("artistId");
        }
        if (34 == i) {
            return "curator" + bundle.getString("curatorId");
        }
        if (49 == i) {
            ChannelMessageAttachment channelMessageAttachment = (ChannelMessageAttachment) bundle.getParcelable("attachments");
            return "channel_message" + channelMessageAttachment.f + BundleUtil.UNDERLINE_TAG + channelMessageAttachment.h;
        }
        if ((11 == i || 24 == i) && (linkAttachment = (LinkAttachment) bundle.getParcelable("attachments")) != null && (str = linkAttachment.f.b) != null) {
            return str;
        }
        if (40 == i && (string2 = bundle.getString("link")) != null) {
            return string2;
        }
        if (1 == i && (string = bundle.getString("link")) != null) {
            return string;
        }
        StringBuilder e = fw3.e(RepostAttachmentInfo.a.a(i, bundle.getBoolean("is_board", false)));
        e.append(m(attachmentInfo));
        return e.toString();
    }
}
