package xsna;

import android.text.TextUtils;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.attaches.WidgetDataAttach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.content.PodcastEpisode;
import java.util.Collection;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* compiled from: Validation.java */
/* loaded from: classes2.dex */
public final class zir0 {

    /* compiled from: Validation.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MsgIdType.values().length];
            a = iArr;
            try {
                iArr[MsgIdType.LOCAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MsgIdType.CNV_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void a(Collection<? extends Attach> collection) {
        for (Attach attach : collection) {
            if (attach instanceof AttachImage) {
                AttachImage attachImage = (AttachImage) attach;
                if (attachImage.e != 0) {
                    if (attachImage.o == 0) {
                        throw new IllegalArgumentException("albumId must be <> 0");
                    }
                    if (attachImage.q.b.isEmpty()) {
                        throw new IllegalArgumentException("imageList is null or empty");
                    }
                } else if (attachImage.r.b.isEmpty()) {
                    throw new IllegalArgumentException("local image list should not be empty");
                }
            } else if (attach instanceof AttachVideo) {
                AttachVideo attachVideo = (AttachVideo) attach;
                if (attachVideo.getId() != 0) {
                    if (attachVideo.b.getDuration() < 0 && attachVideo.b.getDuration() != -1) {
                        throw new IllegalArgumentException("durationInSeconds is invalid. Given: " + attachVideo.b.getDuration());
                    }
                    if (attachVideo.b.getWidth() < 0 && attachVideo.b.getWidth() != -1) {
                        throw new IllegalArgumentException("width is invalid. Given: " + attachVideo.b.getWidth());
                    }
                    if (attachVideo.b.getHeight() < 0 && attachVideo.b.getHeight() != -1) {
                        throw new IllegalArgumentException("height is invalid. Given: " + attachVideo.b.getHeight());
                    }
                } else if (attachVideo.m.isEmpty()) {
                    throw new IllegalArgumentException("fileUri is null or empty");
                }
            } else if (attach instanceof AttachAudio) {
                AttachAudio attachAudio = (AttachAudio) attach;
                long j = attachAudio.f;
                MusicTrack musicTrack = attachAudio.b;
                if (j != 0) {
                    int i = musicTrack.f;
                    if (i < 0 && i != -1) {
                        throw new IllegalArgumentException("durationInSeconds is invalid. Given: " + musicTrack.f);
                    }
                } else {
                    String str = musicTrack.i;
                    if (str == null) {
                        str = "";
                    }
                    if (str.isEmpty()) {
                        throw new IllegalArgumentException("fileUri is null or empty");
                    }
                }
            } else if (attach instanceof AttachSticker) {
                AttachSticker attachSticker = (AttachSticker) attach;
                if (attachSticker.e <= 0) {
                    throw new IllegalArgumentException("stickerId is <= 0. Given: " + attachSticker.e);
                }
                if (attachSticker.f <= 0) {
                    throw new IllegalArgumentException("stickerProductId <= 0. Given: " + attachSticker.f);
                }
            } else if (attach instanceof AttachUgcSticker) {
                AttachUgcSticker attachUgcSticker = (AttachUgcSticker) attach;
                if (attachUgcSticker.e <= 0) {
                    throw new IllegalArgumentException("stickerId is <= 0. Given: " + attachUgcSticker.e);
                }
                if (attachUgcSticker.d.b <= 0) {
                    throw new IllegalArgumentException("stickerOwnerId <= 0. Given: " + attachUgcSticker.d);
                }
            } else if (attach instanceof AttachWallReply) {
                AttachWallReply attachWallReply = (AttachWallReply) attach;
                if (attachWallReply.g == 0) {
                    throw new IllegalArgumentException("id must be <> 0");
                }
                if (attachWallReply.d.b == 0) {
                    throw new IllegalArgumentException("ownerId must be <> 0");
                }
                if (attachWallReply.e == 0) {
                    throw new IllegalArgumentException("replyId must be <> 0");
                }
            } else if (attach instanceof AttachWall) {
                AttachWall attachWall = (AttachWall) attach;
                if (attachWall.e == 0) {
                    throw new IllegalArgumentException("id must be <> 0");
                }
                if (attachWall.d.b == 0) {
                    throw new IllegalArgumentException("ownerId must be <> 0");
                }
            } else if (attach instanceof AttachPlaylist) {
                AttachPlaylist attachPlaylist = (AttachPlaylist) attach;
                if (attachPlaylist.f == 0) {
                    throw new IllegalArgumentException("id must be <> 0");
                }
                if (attachPlaylist.e.b == 0) {
                    throw new IllegalArgumentException("OwnerId must be <> 0");
                }
            } else if (attach instanceof AttachDoc) {
                AttachDoc attachDoc = (AttachDoc) attach;
                if (attachDoc.e != 0) {
                    if (attachDoc.i <= 0) {
                        throw new IllegalArgumentException("type must be > 0. Given: " + attachDoc.i);
                    }
                    if (attachDoc.h < 0) {
                        throw new IllegalArgumentException("size must be >= 0. Given: " + attachDoc.h);
                    }
                } else if (attachDoc.r.isEmpty()) {
                    throw new IllegalArgumentException("fileUri is null or empty");
                }
            } else if (attach instanceof AttachMarket) {
                if (((AttachMarket) attach).e == 0) {
                    throw new IllegalArgumentException("id must be <> 0");
                }
            } else if (attach instanceof AttachAudioMsg) {
                AttachAudioMsg attachAudioMsg = (AttachAudioMsg) attach;
                if (attachAudioMsg.j.isEmpty()) {
                    throw new IllegalArgumentException("fileUri is null or empty");
                }
                if (attachAudioMsg.f <= 0) {
                    throw new IllegalArgumentException("duration is negative");
                }
            } else if (attach instanceof AttachGraffiti) {
                AttachGraffiti attachGraffiti = (AttachGraffiti) attach;
                if (attachGraffiti.e != 0) {
                    if (attachGraffiti.f.b.isEmpty()) {
                        throw new IllegalArgumentException("imageList must be not null and not empty");
                    }
                } else if (attachGraffiti.g.b.isEmpty()) {
                    throw new IllegalArgumentException("fileUri is null or empty");
                }
            } else if (attach instanceof AttachStory) {
                AttachStory attachStory = (AttachStory) attach;
                StoryEntry storyEntry = attachStory.b;
                long j2 = storyEntry.c;
                if (j2 == 0 && attachStory.i == null && attachStory.h == null) {
                    throw new IllegalArgumentException("Either photo params or video params should be nonnull!");
                }
                if (j2 == 0) {
                    continue;
                } else {
                    if (storyEntry.d.b == 0) {
                        throw new IllegalStateException("ownerId should be != 0 ");
                    }
                    if (storyEntry.o == null) {
                        throw new IllegalStateException("access key is null");
                    }
                }
            } else if (attach instanceof AttachHighlight) {
                AttachHighlight attachHighlight = (AttachHighlight) attach;
                if (attachHighlight.b.b != 0 && attachHighlight.g.b == 0) {
                    throw new IllegalStateException("ownerId should be != 0 ");
                }
            } else if (attach instanceof AttachLink) {
                if (TextUtils.isEmpty(((AttachLink) attach).e)) {
                    throw new IllegalArgumentException("Empty url for snippet attach");
                }
            } else if (attach instanceof AttachMap) {
                continue;
            } else if (attach instanceof AttachArticle) {
                if (TextUtils.isEmpty(((AttachArticle) attach).j)) {
                    throw new IllegalArgumentException("url must be empty");
                }
            } else if (attach instanceof AttachPoll) {
                Poll poll = ((AttachPoll) attach).d;
                if (poll.b <= 0) {
                    throw new IllegalArgumentException("Illegal poll's id value " + poll.b);
                }
            } else if (attach instanceof AttachPodcastEpisode) {
                PodcastEpisode podcastEpisode = ((AttachPodcastEpisode) attach).d;
                int i2 = podcastEpisode.b;
                UserId userId = podcastEpisode.c;
                if (i2 <= 0) {
                    throw new IllegalArgumentException("Illegal podcast episode's id value " + podcastEpisode.b);
                }
                if (userId.b == 0) {
                    throw new IllegalArgumentException(b4q.b(userId, "Illegal podcast episode's ownerId value "));
                }
            } else if (attach instanceof AttachArtist) {
                AttachArtist attachArtist = (AttachArtist) attach;
                if (TextUtils.isEmpty(attachArtist.b)) {
                    throw new IllegalArgumentException("Illegal artist's id value " + attachArtist.b);
                }
            } else if (attach instanceof AttachCurator) {
                AttachCurator attachCurator = (AttachCurator) attach;
                if (TextUtils.isEmpty(attachCurator.b)) {
                    throw new IllegalArgumentException("Illegal curator's id value " + attachCurator.b);
                }
            } else if (attach instanceof AttachEvent) {
                if (((AttachEvent) attach).getId() <= 0) {
                    throw new IllegalStateException("id must be > 0");
                }
            } else if (attach instanceof AttachMiniApp) {
                if (((AttachMiniApp) attach).b.b.b == 0) {
                    throw new IllegalArgumentException("app id must be <> 0");
                }
            } else if (attach instanceof AttachDonutLink) {
                if (((AttachDonutLink) attach).d.b == 0) {
                    throw new IllegalStateException("id must be != 0");
                }
            } else if (attach instanceof AttachWidget) {
                if (!((JSONObject) ((AttachWidget) attach).f.getValue()).has(DatabaseHelper.ITEM_COLUMN_NAME)) {
                    throw new IllegalArgumentException("Widget must have content");
                }
            } else if (attach instanceof WidgetDataAttach) {
                WidgetDataAttach widgetDataAttach = (WidgetDataAttach) attach;
                if (widgetDataAttach.b.isEmpty() || widgetDataAttach.c.isEmpty()) {
                    throw new IllegalArgumentException("WidgetDataAttach must have layout and payload");
                }
            } else if (attach instanceof AttachVideoMsg) {
                AttachVideoMsg attachVideoMsg = (AttachVideoMsg) attach;
                if (attachVideoMsg.getId() != 0) {
                    if (attachVideoMsg.b.getDuration() < 0 && attachVideoMsg.b.getDuration() != -1) {
                        throw new IllegalArgumentException("durationInSeconds is invalid. Given: " + attachVideoMsg.b.getDuration());
                    }
                    if (attachVideoMsg.b.getWidth() < 0 && attachVideoMsg.b.getWidth() != -1) {
                        throw new IllegalArgumentException("width is invalid. Given: " + attachVideoMsg.b.getWidth());
                    }
                    if (attachVideoMsg.b.getHeight() < 0 && attachVideoMsg.b.getHeight() != -1) {
                        throw new IllegalArgumentException("height is invalid. Given: " + attachVideoMsg.b.getHeight());
                    }
                } else if (attachVideoMsg.h.isEmpty()) {
                    throw new IllegalArgumentException("fileUri is null or empty");
                }
            } else if (attach instanceof AttachChannelMessage) {
                AttachChannelMessage attachChannelMessage = (AttachChannelMessage) attach;
                if (attachChannelMessage.b.b >= 0) {
                    throw new IllegalArgumentException("Wrong channel Id");
                }
                if (attachChannelMessage.c == 0) {
                    throw new IllegalArgumentException("Wrong channel msg Id");
                }
            } else {
                if (!(attach instanceof MiniAppSnippetDataAttach)) {
                    throw new IllegalArgumentException("Unsupported attachRef: " + attach);
                }
                MiniAppSnippetDataAttach miniAppSnippetDataAttach = (MiniAppSnippetDataAttach) attach;
                if (miniAppSnippetDataAttach.b == 0 || miniAppSnippetDataAttach.d().isEmpty()) {
                    throw new IllegalArgumentException("MiniAppSnippet must have appId and template fields");
                }
            }
        }
    }

    public static boolean b(int i) {
        return i > 0;
    }
}
