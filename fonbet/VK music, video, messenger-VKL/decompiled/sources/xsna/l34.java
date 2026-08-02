package xsna;

import android.content.Context;
import android.net.Uri;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.files.a;
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
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.VideoPreview;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.narratives.Narrative;
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
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gbr;
import xsna.l8r;
import xsna.z8r;

/* compiled from: AttachSendUtil.kt */
/* loaded from: classes2.dex */
public final class l34 {
    /* JADX WARN: Multi-variable type inference failed */
    public static Uri a(Context context, b0p0 b0p0Var, Uri uri, String str) {
        if (!HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(uri.getScheme())) {
            return uri;
        }
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        String m = com.vk.core.files.a.m(context2, uri);
        if (m == null) {
            File file = new File(b0p0Var.a(), str);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (!a.b.a(context, uri, file, new k34(ref$ObjectRef))) {
                throw new IllegalStateException("Can't copy " + uri + " into temp file", (Throwable) ref$ObjectRef.element);
            }
            m = file.getAbsolutePath();
        }
        return oeq0.f(uri, b(context, b0p0Var, m));
    }

    public static Uri b(Context context, b0p0 b0p0Var, String str) {
        Uri g = jeq0.g(str);
        return a(context, b0p0Var, g, jeq0.b(g));
    }

    public static Attach c(w2w w2wVar, Attach attach) {
        Attach attachEvent;
        String str;
        Context context = w2wVar.getContext();
        Peer a = mq9.a(w2wVar);
        b0p0 a1 = w2wVar.a1();
        if (attach instanceof AttachImage) {
            AttachImage attachImage = new AttachImage((AttachImage) attach);
            long j = attachImage.e;
            attachEvent = attachImage;
            if (j == 0) {
                Uri b = b(context, a1, ((fxj0) j5g.X(attachImage.r)).getUrl());
                z8r.a a2 = z8r.a(context, b);
                attachImage.r = new ImageList(new Image(a2.a, a2.b, b.toString(), false));
                attachImage.l = new File(b.getPath());
                attachImage.m = DownloadState.DOWNLOADED;
                UserId b2 = com.vk.dto.common.a.b(a);
                attachImage.d = b2;
                attachImage.p = b2;
                attachImage.c = AttachSyncState.UPLOAD_REQUIRED;
                attachEvent = attachImage;
            }
        } else {
            if (attach instanceof AttachVideo) {
                AttachVideo attachVideo = new AttachVideo((AttachVideo) attach);
                long id = attachVideo.getId();
                attachEvent = attachVideo;
                if (id == 0) {
                    Uri b3 = b(context, a1, attachVideo.m);
                    gbr.a b4 = gbr.b(context, b3, true);
                    attachVideo.m = b3.toString();
                    attachVideo.f = new ImageList(new Image(b4.a, b4.b, b3.toString(), false));
                    attachVideo.b.V9(com.vk.dto.common.a.b(a));
                    attachVideo.b.C0(b4.e);
                    attachVideo.o = DownloadState.DOWNLOADED;
                    attachVideo.b.G5(b4.b);
                    attachVideo.b.l8(b4.a);
                    VideoFile videoFile = attachVideo.b;
                    HashMap hashMap = new HashMap(videoFile.w9().b);
                    VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                    String uri = b3.toString();
                    if (uri != null) {
                        str = myc0.f(uri) ? uri : null;
                        if (str != null) {
                            VideoUrlStorage.b bVar = VideoUrlStorage.c;
                            VideoUrlStorage.d.b(hashMap, videoUrl, str);
                        }
                    }
                    videoFile.ua(new VideoUrlStorage(hashMap));
                    attachVideo.c(com.vk.dto.common.a.b(a));
                    attachVideo.n = AttachSyncState.UPLOAD_REQUIRED;
                    attachEvent = attachVideo;
                }
            } else if (attach instanceof AttachVideoMsg) {
                AttachVideoMsg attachVideoMsg = new AttachVideoMsg((AttachVideoMsg) attach);
                long id2 = attachVideoMsg.getId();
                attachEvent = attachVideoMsg;
                if (id2 == 0) {
                    Uri b5 = b(context, a1, attachVideoMsg.h);
                    gbr.a b6 = gbr.b(context, b5, true);
                    attachVideoMsg.h = b5.toString();
                    attachVideoMsg.g = new ImageList(new Image(b6.a, b6.b, b5.toString(), false));
                    attachVideoMsg.b.V9(com.vk.dto.common.a.b(a));
                    attachVideoMsg.b.C0(b6.e);
                    attachVideoMsg.k = DownloadState.DOWNLOAD_REQUIRED;
                    attachVideoMsg.b.G5(b6.b);
                    attachVideoMsg.b.l8(b6.a);
                    VideoFile videoFile2 = attachVideoMsg.b;
                    HashMap hashMap2 = new HashMap(videoFile2.w9().b);
                    VideoUrl videoUrl2 = VideoUrl.EXTERNAL_URL;
                    String uri2 = b5.toString();
                    if (uri2 != null) {
                        str = myc0.f(uri2) ? uri2 : null;
                        if (str != null) {
                            VideoUrlStorage.b bVar2 = VideoUrlStorage.c;
                            VideoUrlStorage.d.b(hashMap2, videoUrl2, str);
                        }
                    }
                    videoFile2.ua(new VideoUrlStorage(hashMap2));
                    attachVideoMsg.c(com.vk.dto.common.a.b(a));
                    attachVideoMsg.j = AttachSyncState.UPLOAD_REQUIRED;
                    attachEvent = attachVideoMsg;
                }
            } else if (attach instanceof AttachDoc) {
                AttachDoc attachDoc = (AttachDoc) attach;
                AttachDoc attachDoc2 = new AttachDoc(attachDoc);
                long j2 = attachDoc2.e;
                attachEvent = attachDoc2;
                if (j2 == 0) {
                    Uri a3 = a(context, a1, jeq0.g(attachDoc2.r), attachDoc.getFileName());
                    l8r.a a4 = l8r.a(context, a3);
                    attachDoc2.r = a3.toString();
                    attachDoc2.f = DownloadState.DOWNLOADED;
                    attachDoc2.g = attachDoc.g.length() > 0 ? attachDoc.g : a4.a;
                    attachDoc2.h = a4.b;
                    attachDoc2.j = attachDoc.j.length() > 0 ? attachDoc.j : a4.c.toLowerCase(Locale.ROOT);
                    if (a4.d || a4.e) {
                        attachDoc2.p = new ImageList(new Image(a4.f, a4.g, a3.toString(), false));
                    } else {
                        attachDoc2.p = new ImageList(null, 1, null);
                    }
                    if (a4.e) {
                        VideoPreview videoPreview = new VideoPreview();
                        videoPreview.b = a4.f;
                        videoPreview.c = a4.g;
                        videoPreview.d = a4.b;
                        videoPreview.e = a3.toString();
                        attachDoc2.o = e43.o(videoPreview);
                    } else {
                        attachDoc2.o = new ArrayList();
                    }
                    attachDoc2.d = com.vk.dto.common.a.b(a);
                    attachDoc2.c = AttachSyncState.UPLOAD_REQUIRED;
                    attachEvent = attachDoc2;
                }
            } else if (attach instanceof AttachAudioMsg) {
                AttachAudioMsg attachAudioMsg = new AttachAudioMsg((AttachAudioMsg) attach);
                long j3 = attachAudioMsg.e;
                attachEvent = attachAudioMsg;
                if (j3 == 0) {
                    Uri b7 = b(context, a1, attachAudioMsg.j);
                    if (!rl3.y0(new String[]{"mp3", "ogg"}).contains(l8r.a(context, b7).c.toLowerCase(Locale.ROOT))) {
                        throw new IllegalArgumentException("Only mp3 & ogg files are supported");
                    }
                    attachAudioMsg.j = b7.toString();
                    attachAudioMsg.d = com.vk.dto.common.a.b(a);
                    attachAudioMsg.c = AttachSyncState.UPLOAD_REQUIRED;
                    attachEvent = attachAudioMsg;
                }
            } else if (attach instanceof AttachGraffiti) {
                AttachGraffiti attachGraffiti = new AttachGraffiti((AttachGraffiti) attach);
                long j4 = attachGraffiti.e;
                attachEvent = attachGraffiti;
                if (j4 == 0) {
                    Uri b8 = b(context, a1, ((fxj0) j5g.X(attachGraffiti.g)).getUrl());
                    z8r.a a5 = z8r.a(context, b8);
                    attachGraffiti.g = new ImageList(new Image(a5.a, a5.b, b8.toString(), false));
                    attachGraffiti.d = com.vk.dto.common.a.b(a);
                    attachGraffiti.c = AttachSyncState.UPLOAD_REQUIRED;
                    attachEvent = attachGraffiti;
                }
            } else if (attach instanceof AttachStory) {
                AttachStory attachStory = (AttachStory) attach;
                AttachStory a6 = AttachStory.a(attachStory, attachStory.b, 0, null, 510);
                StoryEntry storyEntry = a6.b;
                attachEvent = a6;
                if (storyEntry.c == 0) {
                    storyEntry.d = com.vk.dto.common.a.b(a);
                    a6.d = AttachSyncState.UPLOAD_REQUIRED;
                    attachEvent = a6;
                }
            } else if (attach instanceof AttachLink) {
                attachEvent = new AttachLink((AttachLink) attach);
            } else if (attach instanceof AttachAudio) {
                attachEvent = new AttachAudio((AttachAudio) attach);
            } else if (attach instanceof AttachPlaylist) {
                attachEvent = new AttachPlaylist((AttachPlaylist) attach);
            } else if (attach instanceof AttachArtist) {
                attachEvent = new AttachArtist((AttachArtist) attach);
            } else if (attach instanceof AttachCurator) {
                attachEvent = new AttachCurator((AttachCurator) attach);
            } else if (attach instanceof AttachMap) {
                attachEvent = new AttachMap((AttachMap) attach);
            } else if (attach instanceof AttachSticker) {
                attachEvent = new AttachSticker((AttachSticker) attach);
            } else if (attach instanceof AttachUgcSticker) {
                attachEvent = new AttachUgcSticker((AttachUgcSticker) attach);
            } else if (attach instanceof AttachWall) {
                attachEvent = new AttachWall((AttachWall) attach);
            } else if (attach instanceof AttachArticle) {
                attachEvent = new AttachArticle((AttachArticle) attach);
            } else if (attach instanceof AttachWallReply) {
                attachEvent = new AttachWallReply((AttachWallReply) attach);
            } else if (attach instanceof AttachMarket) {
                attachEvent = new AttachMarket((AttachMarket) attach);
            } else if (attach instanceof AttachPoll) {
                attachEvent = new AttachPoll((AttachPoll) attach);
            } else if (attach instanceof AttachPodcastEpisode) {
                attachEvent = new AttachPodcastEpisode((AttachPodcastEpisode) attach);
            } else if (attach instanceof AttachEvent) {
                AttachEvent attachEvent2 = (AttachEvent) attach;
                attachEvent = new AttachEvent(attachEvent2.b, attachEvent2.c, attachEvent2.d, attachEvent2.e, attachEvent2.f, attachEvent2.g, attachEvent2.h);
            } else if (attach instanceof AttachMiniApp) {
                attachEvent = new AttachMiniApp((AttachMiniApp) attach);
            } else if (attach instanceof AttachDonutLink) {
                attachEvent = new AttachDonutLink((AttachDonutLink) attach);
            } else if (attach instanceof AttachQuestion) {
                attachEvent = new AttachQuestion((AttachQuestion) attach);
            } else if (attach instanceof AttachHighlight) {
                AttachHighlight attachHighlight = (AttachHighlight) attach;
                attachEvent = new AttachHighlight(Narrative.zb(attachHighlight.b, null, 2047), attachHighlight.c, attachHighlight.d);
            } else {
                if (!(attach instanceof AttachChannelMessage)) {
                    throw new IllegalArgumentException("Unsupported attach attach: " + attach);
                }
                attachEvent = ((AttachChannelMessage) attach).copy();
            }
        }
        hpt0.f(w2wVar, attachEvent);
        return attachEvent;
    }
}
