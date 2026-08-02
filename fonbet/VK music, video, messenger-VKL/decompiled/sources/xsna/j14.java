package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachDeleted;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachUnsupported;
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.attaches.AttachWithId;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.im.engine.models.attaches.AttachGroupCallFinished;
import com.vk.im.engine.models.attaches.AttachGroupCallInProgress;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachRoom;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import kotlin.Pair;

/* compiled from: AttachDbUtils.kt */
/* loaded from: classes2.dex */
public final class j14 {
    public static final Object a = pn00.k(new Pair(AttachArticle.class, 1), new Pair(AttachAudio.class, 2), new Pair(AttachAudioMsg.class, 3), new Pair(AttachCall.class, 4), new Pair(AttachGroupCallInProgress.class, 29), new Pair(AttachGroupCallFinished.class, 30), new Pair(AttachDoc.class, 5), new Pair(AttachGift.class, 43), new Pair(AttachGraffiti.class, 8), new Pair(AttachImage.class, 9), new Pair(AttachLink.class, 10), new Pair(AttachMap.class, 11), new Pair(AttachMarket.class, 12), new Pair(AttachPlaylist.class, 15), new Pair(AttachPoll.class, 16), new Pair(AttachSticker.class, 17), new Pair(AttachUgcSticker.class, 38), new Pair(AttachStory.class, 18), new Pair(AttachUnsupported.class, 19), new Pair(AttachVideo.class, 20), new Pair(AttachWall.class, 21), new Pair(AttachWallReply.class, 22), new Pair(AttachPodcastEpisode.class, 23), new Pair(AttachArtist.class, 24), new Pair(AttachDeleted.class, 26), new Pair(AttachEvent.class, 27), new Pair(AttachMiniApp.class, 28), new Pair(AttachCurator.class, 31), new Pair(AttachDonutLink.class, 32), new Pair(AttachWidget.class, 33), new Pair(AttachHighlight.class, 34), new Pair(AttachVideoMsg.class, 35), new Pair(MiniAppSnippetDataAttach.class, 36), new Pair(AttachQuestion.class, 39), new Pair(AttachRoom.class, 40), new Pair(AttachChannelStub.class, 41), new Pair(AttachChannelMessage.class, 42));

    public static long a(Attach attach) {
        if (attach instanceof AttachWithId) {
            return ((AttachWithId) attach).getId();
        }
        if ((attach instanceof AttachCall) || (attach instanceof AttachGroupCall) || (attach instanceof AttachLink) || (attach instanceof AttachMap) || (attach instanceof AttachArtist) || (attach instanceof AttachCurator) || (attach instanceof AttachUnsupported) || (attach instanceof AttachDeleted) || (attach instanceof AttachWall) || (attach instanceof AttachWallReply) || (attach instanceof AttachRoom) || (attach instanceof AttachChannelStub)) {
            return 0L;
        }
        throw new UnsupportedOperationException("Unknown attach type: ".concat(qjg.a(attach)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static int b(Class cls) {
        Integer num = (Integer) a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new UnsupportedOperationException("Unknown attach type: ".concat(cls.getSimpleName()));
    }
}
