package xsna;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
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
import com.vk.dto.attaches.AttachMarketRejectInfo;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.attaches.VideoPreview;
import com.vk.dto.attaches.WidgetDataAttach;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Currency;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryUploadParams;
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
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniAppButton;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.camera.PhotoParams;
import com.vk.im.engine.models.camera.UploadParams;
import com.vk.im.engine.models.camera.VideoParams;
import com.vk.im.engine.models.content.PodcastEpisode;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.pending.PendingAudioMessageAttachment;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingGraffitiAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingStoryAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarusiaChatScreenSharingAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.MiniAppSnippetAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PostAttachment;
import com.vkontakte.android.attachments.PostReplyAttachment;
import com.vkontakte.android.attachments.QuestionAttachment;
import com.vkontakte.android.attachments.StoryAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VmojiAttachment;
import com.vkontakte.android.attachments.WidgetAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* compiled from: AppToImAttachConverter.kt */
/* loaded from: classes2.dex */
public final class ca3 {
    public static String a(String str) {
        return (str == null || str.length() == 0) ? "" : (brm0.B(str, "http", true) || brm0.B(str, X3.i.b, true) || brm0.B(str, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, true)) ? str : new Uri.Builder().scheme(X3.i.b).path(str).build().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Attach b(Attachment attachment) {
        Attach attach;
        Attach c;
        Image image;
        ArrayList arrayList;
        Iterator it;
        AttachDonutLink.Friend friend;
        VerifyInfo verifyInfo;
        Attach attachMiniApp;
        String str;
        String str2;
        Attach attachCurator;
        Image image2;
        Object failure;
        AttachEvent attachEvent;
        String str3;
        String str4;
        Currency currency;
        Currency currency2;
        AttachWithId attachWithId;
        AttachWithId attachWithId2;
        AttachWithId attachWithId3;
        if (attachment instanceof PendingPhotoAttachment) {
            c = c((PendingPhotoAttachment) attachment);
        } else if (attachment instanceof PendingVideoAttachment) {
            PendingVideoAttachment pendingVideoAttachment = (PendingVideoAttachment) attachment;
            VideoFile videoFile = pendingVideoAttachment.k;
            if (videoFile != null) {
                String a = a(videoFile.w9().Ab(VideoUrl.EXTERNAL_URL));
                VideoFile videoFile2 = pendingVideoAttachment.k;
                AttachVideo attachVideo = new AttachVideo(videoFile2, d(videoFile2.getImage()), d(pendingVideoAttachment.k.e1()), 0L, null, 0, 0, 0L, 0, 0L, null, a, AttachSyncState.UPLOAD_REQUIRED, null, null, 26616, null);
                attachVideo.setId(0L);
                c = attachVideo;
            }
            c = null;
        } else {
            if (attachment instanceof PendingDocumentAttachment) {
                PendingDocumentAttachment pendingDocumentAttachment = (PendingDocumentAttachment) attachment;
                AttachDoc attachDoc = new AttachDoc();
                String str5 = pendingDocumentAttachment.f;
                if (str5 == null) {
                    str5 = "";
                }
                attachDoc.g = str5;
                attachDoc.h = pendingDocumentAttachment.n;
                String str6 = pendingDocumentAttachment.i;
                attachDoc.j = str6 != null ? str6 : "";
                attachDoc.r = a(pendingDocumentAttachment.g);
                attachDoc.c = AttachSyncState.UPLOAD_REQUIRED;
                attachWithId3 = attachDoc;
            } else if (attachment instanceof PendingStoryAttachment) {
                PendingStoryAttachment pendingStoryAttachment = (PendingStoryAttachment) attachment;
                CameraVideoEncoderParameters cameraVideoEncoderParameters = pendingStoryAttachment.f.c;
                VideoParams videoParams = cameraVideoEncoderParameters != null ? new VideoParams(cameraVideoEncoderParameters.b, cameraVideoEncoderParameters.i, cameraVideoEncoderParameters.d, cameraVideoEncoderParameters.e, cameraVideoEncoderParameters.f, cameraVideoEncoderParameters.h, cameraVideoEncoderParameters.g, cameraVideoEncoderParameters.j, cameraVideoEncoderParameters.k, cameraVideoEncoderParameters.l, cameraVideoEncoderParameters.r, cameraVideoEncoderParameters.s, cameraVideoEncoderParameters.t, cameraVideoEncoderParameters.u, cameraVideoEncoderParameters.m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 98304, null) : null;
                StoryUploadParams storyUploadParams = pendingStoryAttachment.g;
                CommonUploadParams commonUploadParams = pendingStoryAttachment.h;
                UploadParams uploadParams = new UploadParams(storyUploadParams, commonUploadParams, nf9.b.d(commonUploadParams, storyUploadParams));
                File file = pendingStoryAttachment.f.b;
                c = new AttachStory(uploadParams, videoParams, file != null ? new PhotoParams(file) : null);
            } else {
                boolean z = false;
                r6 = 0;
                int i = 0;
                z = false;
                if (attachment instanceof PendingGraffitiAttachment) {
                    String a2 = a(((PendingGraffitiAttachment) attachment).h);
                    AttachGraffiti attachGraffiti = new AttachGraffiti();
                    attachGraffiti.g = new ImageList(new com.vk.dto.common.im.Image(-1, -1, a2, false));
                    attachWithId3 = attachGraffiti;
                } else {
                    if (attachment instanceof StoryAttachment) {
                        StoryEntry storyEntry = ((StoryAttachment) attachment).f;
                        attachMiniApp = new AttachStory(storyEntry, 0, AttachSyncState.DONE, new ImageList(null, 1, null), ImageList.a.c(-1, -1, storyEntry.l), null, null, null, 0L, 480, null);
                    } else if (attachment instanceof NarrativeAttachment) {
                        attachWithId3 = new AttachHighlight(((NarrativeAttachment) attachment).f, 0, null, 6, null);
                    } else if (attachment instanceof PhotoAttachment) {
                        PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
                        Photo photo = photoAttachment.l;
                        if (!photo.y.b.isEmpty()) {
                            AttachImage attachImage = new AttachImage();
                            attachImage.e = photoAttachment.f;
                            attachImage.o = photoAttachment.h;
                            attachImage.d = photoAttachment.g;
                            attachImage.p = photoAttachment.i;
                            attachImage.k = 1000 * photoAttachment.j;
                            attachImage.q = d(photo.y);
                            String str7 = photoAttachment.m;
                            if (str7 == null) {
                                str7 = "";
                            }
                            attachImage.s = str7;
                            String str8 = photoAttachment.n;
                            attachImage.t = str8 != null ? str8 : "";
                            attachImage.v = photo.L;
                            attachImage.y = photoAttachment.w;
                            attachImage.x = photoAttachment.v;
                            attachImage.z = photoAttachment.x;
                            attachWithId2 = attachImage;
                            c = attachWithId2;
                        }
                        c = null;
                    } else if (attachment instanceof VideoAttachment) {
                        VideoAttachment videoAttachment = (VideoAttachment) attachment;
                        if (videoAttachment.k != null) {
                            VideoFile videoFile3 = videoAttachment.k;
                            attachWithId2 = new AttachVideo(videoFile3, d(videoFile3.getImage()), d(videoAttachment.k.e1()), 0L, null, 0, 0, 0L, 0, 0L, null, null, null, null, null, 32760, null);
                            c = attachWithId2;
                        }
                        c = null;
                    } else if (attachment instanceof PendingAudioMessageAttachment) {
                        PendingAudioMessageAttachment pendingAudioMessageAttachment = (PendingAudioMessageAttachment) attachment;
                        String a3 = a(pendingAudioMessageAttachment.g);
                        AttachAudioMsg attachAudioMsg = new AttachAudioMsg();
                        attachAudioMsg.j = a3;
                        attachAudioMsg.C0(pendingAudioMessageAttachment.x);
                        attachAudioMsg.g = pendingAudioMessageAttachment.y;
                        attachWithId2 = attachAudioMsg;
                        c = attachWithId2;
                    } else if (attachment instanceof AudioAttachment) {
                        attachWithId3 = new AttachAudio(((AudioAttachment) attachment).f);
                    } else if (attachment instanceof GeoAttachment) {
                        GeoAttachment geoAttachment = (GeoAttachment) attachment;
                        AttachMap attachMap = new AttachMap();
                        attachMap.f = geoAttachment.g;
                        attachMap.e = geoAttachment.f;
                        String str9 = geoAttachment.h;
                        if (str9 == null) {
                            str9 = "";
                        }
                        attachMap.g = str9;
                        attachMap.h = "";
                        attachMap.i = "";
                        attachWithId3 = attachMap;
                    } else {
                        if (attachment instanceof DocumentAttachment) {
                            DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
                            String str10 = documentAttachment.g;
                            String str11 = documentAttachment.q;
                            String a4 = a(str10);
                            boolean B = brm0.B(a4, X3.i.b, false);
                            AttachDoc attachDoc2 = new AttachDoc();
                            attachDoc2.e = documentAttachment.k;
                            attachDoc2.d = documentAttachment.o;
                            String str12 = documentAttachment.f;
                            if (str12 == null) {
                                str12 = "";
                            }
                            attachDoc2.g = str12;
                            attachDoc2.j = documentAttachment.i;
                            attachDoc2.i = 8;
                            attachDoc2.h = documentAttachment.n;
                            attachDoc2.k = B ? "" : a4;
                            if (!B) {
                                a4 = "";
                            }
                            attachDoc2.r = a4;
                            attachDoc2.l = str11 == null ? "" : str11;
                            if (TextUtils.isEmpty(documentAttachment.h)) {
                                attachDoc2.o = new ArrayList();
                            } else {
                                attachDoc2.n = new ImageList(new com.vk.dto.common.im.Image(documentAttachment.l, documentAttachment.m, documentAttachment.h, false));
                            }
                            if (TextUtils.isEmpty(str11)) {
                                attachDoc2.o = new ArrayList();
                            } else {
                                VideoPreview videoPreview = new VideoPreview();
                                if (str11 == null) {
                                    str11 = "";
                                }
                                videoPreview.e = str11;
                                videoPreview.b = documentAttachment.l;
                                videoPreview.c = documentAttachment.m;
                                videoPreview.d = -1L;
                                attachDoc2.o = e43.o(videoPreview);
                            }
                            String str13 = documentAttachment.j;
                            attachDoc2.s = str13 != null ? str13 : "";
                            attachWithId = attachDoc2;
                        } else {
                            if (attachment instanceof MarketAttachment) {
                                AttachMarket attachMarket = new AttachMarket();
                                Good good = ((MarketAttachment) attachment).f;
                                attachMarket.e = good.b;
                                String str14 = good.d;
                                if (str14 == null) {
                                    str14 = "";
                                }
                                attachMarket.f = str14;
                                String str15 = good.e;
                                if (str15 == null) {
                                    str15 = "";
                                }
                                attachMarket.g = str15;
                                attachMarket.d = good.c;
                                Price price = good.h;
                                attachMarket.h = price != null ? price.b : 0L;
                                attachMarket.i = price != null ? price.c : 0L;
                                if (price != null && (currency2 = price.d) != null) {
                                    i = currency2.b;
                                }
                                attachMarket.j = i;
                                attachMarket.k = (price == null || (currency = price.d) == null) ? "" : currency.c;
                                if (price == null || (str3 = price.e) == null) {
                                    str3 = "";
                                }
                                attachMarket.l = str3;
                                if (price == null || (str4 = price.f) == null) {
                                    str4 = "";
                                }
                                attachMarket.m = str4;
                                MarketRejectInfo marketRejectInfo = good.e0;
                                attachMarket.o = marketRejectInfo == null ? null : new AttachMarketRejectInfo(marketRejectInfo.b, marketRejectInfo.c, marketRejectInfo.d, marketRejectInfo.e, marketRejectInfo.f, marketRejectInfo.g);
                                attachMarket.p = good.V;
                                attachMarket.s = good.g0;
                                attachMarket.t = good.h0;
                                attachMarket.u = good.i0;
                                xuo0.a.getClass();
                                attachMarket.v = xuo0.a();
                                String str16 = good.k0;
                                if (str16 == null) {
                                    str16 = "";
                                }
                                attachMarket.w = str16;
                                attachMarket.q = new ImageList(null, 1, null);
                                Image image3 = good.n;
                                if (image3 != null) {
                                    Iterator it2 = image3.Fb().iterator();
                                    while (it2.hasNext()) {
                                        ImageSize imageSize = (ImageSize) it2.next();
                                        ImageList imageList = attachMarket.q;
                                        com.vk.dto.common.im.Image image4 = imageSize.d;
                                        imageList.zb(new com.vk.dto.common.im.Image(image4.b, image4.c, image4.d, imageSize.c7()));
                                    }
                                }
                                attachMarket.r = "";
                                attachEvent = attachMarket;
                            } else if (attachment instanceof PostAttachment) {
                                PostAttachment postAttachment = (PostAttachment) attachment;
                                AttachWall attachWall = new AttachWall();
                                attachWall.e = postAttachment.g;
                                attachWall.h = postAttachment.j;
                                attachWall.f = postAttachment.h;
                                attachWall.d = postAttachment.f;
                                attachWall.m = postAttachment.i;
                                attachWall.n = "";
                                List<Attachment> list = postAttachment.k;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    try {
                                        failure = b((Attachment) it3.next());
                                    } catch (Throwable th) {
                                        failure = new Result.Failure(th);
                                    }
                                    if (failure instanceof Result.Failure) {
                                        failure = null;
                                    }
                                    Attach attach2 = (Attach) failure;
                                    if (attach2 != null) {
                                        arrayList2.add(attach2);
                                    }
                                }
                                attachWall.o = new ArrayList(arrayList2);
                                attachWithId3 = attachWall;
                            } else if (attachment instanceof PostReplyAttachment) {
                                PostReplyAttachment postReplyAttachment = (PostReplyAttachment) attachment;
                                AttachWallReply attachWallReply = new AttachWallReply();
                                attachWallReply.e = postReplyAttachment.h;
                                attachWallReply.f = postReplyAttachment.i;
                                attachWallReply.g = postReplyAttachment.g;
                                attachWallReply.d = postReplyAttachment.f;
                                attachWallReply.j = postReplyAttachment.j;
                                attachWallReply.k = postReplyAttachment.k;
                                attachWithId3 = attachWallReply;
                            } else if (attachment instanceof ArticleAttachment) {
                                Article article = ((ArticleAttachment) attachment).f;
                                if (article.i != null) {
                                    AttachArticle attachArticle = new AttachArticle();
                                    attachArticle.e = article.b;
                                    attachArticle.d = article.c;
                                    String str17 = article.d;
                                    if (str17 == null) {
                                        str17 = "";
                                    }
                                    attachArticle.o = str17;
                                    String str18 = article.i;
                                    if (str18 == null) {
                                        str18 = "";
                                    }
                                    attachArticle.j = str18;
                                    String str19 = article.f;
                                    if (str19 == null) {
                                        str19 = "";
                                    }
                                    attachArticle.g = str19;
                                    String str20 = article.g;
                                    if (str20 == null) {
                                        str20 = "";
                                    }
                                    attachArticle.h = str20;
                                    String str21 = article.k;
                                    attachArticle.f = str21 != null ? str21 : "";
                                    Photo photo2 = article.l;
                                    if (photo2 != null && (image2 = photo2.y) != null) {
                                        attachArticle.n = d(image2);
                                    }
                                    attachArticle.m = article.m;
                                    attachArticle.l = article.n;
                                    attachArticle.p = article.o;
                                    attachArticle.q = article.p;
                                    attachArticle.r = article.q;
                                    attachWithId3 = attachArticle;
                                }
                                c = null;
                            } else if (attachment instanceof AudioPlaylistAttachment) {
                                attachWithId3 = new AttachPlaylist(Playlist.zb(((AudioPlaylistAttachment) attachment).f, null, null, null, null, -1, 255), 0, null, null, 0L, 30, null);
                            } else {
                                if (attachment instanceof AudioArtistAttachment) {
                                    Artist artist = ((AudioArtistAttachment) attachment).f;
                                    String str22 = artist.b;
                                    String str23 = artist.c;
                                    String str24 = str23 == null ? "" : str23;
                                    Image image5 = artist.f;
                                    attachCurator = new AttachArtist(str22, str24, e(image5 != null ? image5.b : null), artist.g, null, 0, null, artist.j, artist.k, null, null, 1648, null);
                                } else if (attachment instanceof AudioCuratorAttachment) {
                                    Curator curator = ((AudioCuratorAttachment) attachment).f;
                                    String str25 = curator.b;
                                    String str26 = curator.c;
                                    String str27 = str26 == null ? "" : str26;
                                    Image image6 = curator.e;
                                    attachCurator = new AttachCurator(str25, str27, e(image6 != null ? image6.b : null), curator.f, null, 0, null, 112, null);
                                } else if (attachment instanceof GraffitiAttachment) {
                                    GraffitiAttachment graffitiAttachment = (GraffitiAttachment) attachment;
                                    AttachGraffiti attachGraffiti2 = new AttachGraffiti();
                                    attachGraffiti2.e = graffitiAttachment.f;
                                    attachGraffiti2.d = graffitiAttachment.g;
                                    attachGraffiti2.f = new ImageList(new com.vk.dto.common.im.Image(graffitiAttachment.i, graffitiAttachment.j, graffitiAttachment.h, false));
                                    String str28 = graffitiAttachment.k;
                                    attachGraffiti2.h = str28 != null ? str28 : "";
                                    attachWithId3 = attachGraffiti2;
                                } else if (attachment instanceof LinkAttachment) {
                                    String str29 = ((LinkAttachment) attachment).f.b;
                                    attachWithId3 = new AttachLink(str29 != null ? str29 : "");
                                } else {
                                    if (attachment instanceof FwdMessagesAttachment) {
                                        return null;
                                    }
                                    if (attachment instanceof PollAttachment) {
                                        attachWithId3 = new AttachPoll(0, null, ((PollAttachment) attachment).f, 0L, 11, null);
                                    } else if (attachment instanceof PodcastAttachment) {
                                        MusicTrack musicTrack = ((PodcastAttachment) attachment).f;
                                        int i2 = musicTrack.b;
                                        UserId userId = musicTrack.c;
                                        String str30 = musicTrack.h;
                                        String str31 = str30 == null ? "" : str30;
                                        String str32 = musicTrack.d;
                                        int i3 = musicTrack.g;
                                        Episode episode = musicTrack.w;
                                        attachWithId = new AttachPodcastEpisode(0, null, new PodcastEpisode(i2, userId, str31, str32, i3, episode != null ? episode.h : null, episode != null ? episode.j : null, episode != null ? episode.f : null, episode != null ? episode.k : false, null), 3, null);
                                    } else if (attachment instanceof EventAttachment) {
                                        EventAttachment eventAttachment = (EventAttachment) attachment;
                                        Serializer.c<Peer> cVar = Peer.CREATOR;
                                        Peer b = Peer.a.b(eventAttachment.f.b.b);
                                        Owner owner = eventAttachment.f;
                                        String str33 = owner.c;
                                        long j = eventAttachment.g * 1000;
                                        String str34 = eventAttachment.h;
                                        Image image7 = owner.g;
                                        attachEvent = new AttachEvent(0, null, b, str33, j, str34, image7 != null ? d(image7) : null, 3, null);
                                    } else if (attachment instanceof MiniAppAttachment) {
                                        MiniAppAttachment miniAppAttachment = (MiniAppAttachment) attachment;
                                        ApiApplication apiApplication = miniAppAttachment.f;
                                        String str35 = miniAppAttachment.i;
                                        MiniAppAttachment.Button button = miniAppAttachment.k;
                                        String str36 = miniAppAttachment.g;
                                        String str37 = miniAppAttachment.h;
                                        NotificationImage notificationImage = miniAppAttachment.j;
                                        ImageList imageList2 = new ImageList(null, 1, null);
                                        List<NotificationImage.ImageInfo> Ab = notificationImage.Ab();
                                        ArrayList arrayList3 = new ArrayList(c5g.u(Ab, 10));
                                        for (NotificationImage.ImageInfo imageInfo : Ab) {
                                            int i4 = imageInfo.b;
                                            String str38 = imageInfo.d;
                                            if (str38 == null) {
                                                str38 = "";
                                            }
                                            arrayList3.add(new com.vk.dto.common.im.Image(i4, i4, str38, false));
                                        }
                                        Iterator it4 = arrayList3.iterator();
                                        while (it4.hasNext()) {
                                            imageList2.zb((com.vk.dto.common.im.Image) it4.next());
                                        }
                                        String str39 = (button == null || (str2 = button.b) == null) ? str35 : str2;
                                        if (button != null && (str = button.b) != null) {
                                            str35 = str;
                                        }
                                        AttachMiniAppButton.State.a aVar = AttachMiniAppButton.State.Companion;
                                        String str40 = button != null ? button.c : null;
                                        aVar.getClass();
                                        attachMiniApp = new AttachMiniApp(apiApplication, str36, str37, imageList2, str39, new AttachMiniAppButton(str35, AttachMiniAppButton.State.a.a(str40)), 0, null, null, 448, null);
                                    } else if (attachment instanceof DonutLinkAttachment) {
                                        DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) attachment;
                                        UserId userId2 = donutLinkAttachment.g;
                                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                                        Peer b2 = Peer.a.b(userId2.b);
                                        Owner owner2 = donutLinkAttachment.f;
                                        String str41 = owner2 != null ? owner2.c : null;
                                        if (owner2 != null && (verifyInfo = owner2.f) != null) {
                                            z = verifyInfo.b;
                                        }
                                        boolean z2 = z;
                                        String str42 = donutLinkAttachment.h;
                                        if (owner2 == null || (image = owner2.g) == null) {
                                            image = Image.d;
                                        }
                                        ImageList d = d(image);
                                        int i5 = donutLinkAttachment.i;
                                        int i6 = donutLinkAttachment.j;
                                        List<Owner> list2 = donutLinkAttachment.k;
                                        if (list2 != null) {
                                            ArrayList arrayList4 = new ArrayList();
                                            Iterator it5 = list2.iterator();
                                            while (it5.hasNext()) {
                                                Owner owner3 = (Owner) it5.next();
                                                Image image8 = owner3.g;
                                                if (image8 != null) {
                                                    it = it5;
                                                    friend = new AttachDonutLink.Friend(owner3.b.b, d(image8));
                                                } else {
                                                    it = it5;
                                                    friend = null;
                                                }
                                                if (friend != null) {
                                                    arrayList4.add(friend);
                                                }
                                                it5 = it;
                                            }
                                            arrayList = arrayList4;
                                        } else {
                                            arrayList = null;
                                        }
                                        attachWithId = new AttachDonutLink(0, null, userId2, b2, str41, z2, str42, d, i5, i6, arrayList, donutLinkAttachment.l, donutLinkAttachment.m, 3, null);
                                    } else if (attachment instanceof WidgetAttachment) {
                                        WidgetAttachment widgetAttachment = (WidgetAttachment) attachment;
                                        attachWithId3 = new WidgetDataAttach(widgetAttachment.f, widgetAttachment.g, widgetAttachment.h, 0, null, null, 56, null);
                                    } else if (attachment instanceof MarusiaChatScreenSharingAttachment) {
                                        c = c(new PendingPhotoAttachment(((MarusiaChatScreenSharingAttachment) attachment).f.toString()));
                                    } else if (attachment instanceof VmojiAttachment) {
                                        String str43 = new LinkAttachment(((VmojiAttachment) attachment).f).f.b;
                                        attachWithId3 = new AttachLink(str43 != null ? str43 : "");
                                    } else if (attachment instanceof MiniAppSnippetAttachment) {
                                        MiniAppSnippetAttachment miniAppSnippetAttachment = (MiniAppSnippetAttachment) attachment;
                                        long j2 = miniAppSnippetAttachment.f;
                                        Integer num = miniAppSnippetAttachment.g;
                                        String str44 = miniAppSnippetAttachment.h;
                                        String str45 = miniAppSnippetAttachment.i;
                                        Serializer.c<MiniAppSnippetDataAttach> cVar3 = MiniAppSnippetDataAttach.CREATOR;
                                        String str46 = miniAppSnippetAttachment.j;
                                        MiniAppSnippetDataAttach.Type type = MiniAppSnippetDataAttach.Type.GAME;
                                        if (!str46.equals(type.h())) {
                                            type = MiniAppSnippetDataAttach.Type.APP;
                                        }
                                        attachWithId3 = new MiniAppSnippetDataAttach(j2, str45, type, null, null, miniAppSnippetAttachment.k, null, null, null, num, str44, 0, null, null, 14808, null);
                                    } else if (attachment instanceof QuestionAttachment) {
                                        QuestionAttachment questionAttachment = (QuestionAttachment) attachment;
                                        attachWithId3 = new AttachQuestion(questionAttachment.f, questionAttachment.g, questionAttachment.h, questionAttachment.i);
                                    } else {
                                        if (!(attachment instanceof ChannelMessageAttachment)) {
                                            throw new IllegalArgumentException("Unknown attachment type ".concat(attachment.getClass().getSimpleName()));
                                        }
                                        ChannelMessageAttachment channelMessageAttachment = (ChannelMessageAttachment) attachment;
                                        UserId userId3 = new UserId(channelMessageAttachment.f);
                                        long j3 = channelMessageAttachment.h;
                                        Peer peer = channelMessageAttachment.g;
                                        String str47 = channelMessageAttachment.j;
                                        String str48 = channelMessageAttachment.k;
                                        List<Attachment> list3 = channelMessageAttachment.l;
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator<T> it6 = list3.iterator();
                                        while (it6.hasNext()) {
                                            try {
                                                attach = b((Attachment) it6.next());
                                            } catch (Exception unused) {
                                                attach = null;
                                            }
                                            if (attach != null) {
                                                arrayList5.add(attach);
                                            }
                                        }
                                        attachWithId3 = new AttachChannelMessage(userId3, j3, peer, str47, str48, arrayList5, channelMessageAttachment.m, channelMessageAttachment.n, channelMessageAttachment.p, channelMessageAttachment.o, null, null, 3072, null);
                                    }
                                }
                                c = attachCurator;
                            }
                            c = attachEvent;
                        }
                        c = attachWithId;
                    }
                    c = attachMiniApp;
                }
            }
            c = attachWithId3;
        }
        if (c instanceof gtx0) {
            ((gtx0) c).m0(attachment.c);
        }
        return c;
    }

    public static AttachImage c(PendingPhotoAttachment pendingPhotoAttachment) {
        String path;
        Uri parse = Uri.parse(a(pendingPhotoAttachment.f));
        AttachImage attachImage = new AttachImage();
        attachImage.y = pendingPhotoAttachment.l;
        attachImage.x = pendingPhotoAttachment.m;
        attachImage.r = new ImageList(new com.vk.dto.common.im.Image(-1, -1, parse.toString(), false));
        if (X3.i.b.equals(parse.getScheme()) && (path = parse.getPath()) != null && path.length() != 0) {
            attachImage.l = new File(parse.getPath());
            attachImage.m = DownloadState.DOWNLOADED;
        }
        return attachImage;
    }

    public static ImageList d(Image image) {
        ArrayList Fb = image.Fb();
        ArrayList arrayList = new ArrayList(c5g.u(Fb, 10));
        Iterator it = Fb.iterator();
        while (it.hasNext()) {
            ImageSize imageSize = (ImageSize) it.next();
            com.vk.dto.common.im.Image image2 = imageSize.d;
            arrayList.add(new com.vk.dto.common.im.Image(image2.b, image2.c, image2.d, imageSize.c7()));
        }
        return new ImageList(new ArrayList(arrayList));
    }

    public static ImageList e(List list) {
        if (list == null) {
            return new ImageList(null, 1, null);
        }
        List<ImageSize> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ImageSize imageSize : list2) {
            com.vk.dto.common.im.Image image = imageSize.d;
            arrayList.add(new com.vk.dto.common.im.Image(image.b, image.c, image.d, imageSize.c7()));
        }
        return new ImageList(new ArrayList(arrayList));
    }
}
