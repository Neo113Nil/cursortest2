package xsna;

import com.vk.api.base.Document;
import com.vk.api.video.VideoSave;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.VideoPreview;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.nft.Nft;
import com.vk.dto.nft.NftMeta;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
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
import com.vk.im.engine.models.content.PodcastEpisode;
import com.vk.pending.PendingAudioMessageAttachment;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.NftAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PostAttachment;
import com.vkontakte.android.attachments.PostReplyAttachment;
import com.vkontakte.android.attachments.QuestionAttachment;
import com.vkontakte.android.attachments.StoryAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: ImToAppAttachConverter.kt */
/* loaded from: classes2.dex */
public final class wdw {
    public static final Article a(AttachArticle attachArticle) {
        Owner owner = new Owner(attachArticle.d, "", "", null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194288, null);
        int i = (int) attachArticle.e;
        UserId userId = attachArticle.d;
        String str = attachArticle.o;
        long j = attachArticle.i;
        String str2 = attachArticle.g;
        String str3 = attachArticle.h;
        String str4 = attachArticle.j;
        String str5 = attachArticle.k;
        String str6 = attachArticle.f;
        ImageList imageList = attachArticle.n;
        Photo photo = new Photo(rwv.c(imageList));
        photo.l = false;
        photo.n = false;
        photo.o = false;
        photo.q = true;
        photo.s = "";
        String Fb = imageList.Fb();
        photo.s = Fb == null ? "" : Fb;
        String Db = imageList.Db();
        photo.t = Db != null ? Db : "";
        return new Article(i, userId, str, j, str2, str3, owner, str4, str5, str6, (Photo) j5g.a0(e43.o(photo)), attachArticle.m, attachArticle.l, attachArticle.p, attachArticle.q, attachArticle.r, null, attachArticle.s, attachArticle.t, attachArticle.u, 65536, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0815  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Attachment b(Attach attach, ProfilesSimpleInfo profilesSimpleInfo, boolean z, int i) {
        Attachment attachment;
        Attachment attachment2;
        Attachment attachment3;
        Attachment attachment4;
        qtd0 zb;
        String name;
        String str;
        ArrayList arrayList;
        Attachment audioCuratorAttachment;
        VideoPreview videoPreview;
        AttachSyncState attachSyncState;
        Attachment attachment5;
        String str2;
        String str3;
        String url;
        ProfilesSimpleInfo profilesSimpleInfo2 = (i & 2) != 0 ? null : profilesSimpleInfo;
        boolean z2 = (i & 4) != 0 ? true : z;
        int i2 = 2;
        String str4 = "";
        if (attach instanceof AttachImage) {
            AttachImage attachImage = (AttachImage) attach;
            if (attachImage.c != AttachSyncState.DONE) {
                fxj0 fxj0Var = (fxj0) j5g.Z(attachImage.r);
                if (fxj0Var != null && (url = fxj0Var.getUrl()) != null) {
                    str4 = url;
                }
                PendingPhotoAttachment pendingPhotoAttachment = new PendingPhotoAttachment(str4);
                pendingPhotoAttachment.m = attachImage.x;
                pendingPhotoAttachment.l = attachImage.y;
                attachment5 = pendingPhotoAttachment;
            } else {
                ImageList imageList = attachImage.q;
                ArrayList arrayList2 = new ArrayList(c5g.u(imageList, 10));
                for (Image image : imageList.b) {
                    arrayList2.add(new ImageSize(image.getUrl(), image.getWidth(), image.getHeight(), Boolean.valueOf(image.c7()), ImageSize.b.d(image.getWidth(), image.getHeight(), image.c7()), false, 32, null));
                }
                Photo photo = new Photo(new com.vk.dto.common.Image(arrayList2));
                photo.c = (int) attachImage.e;
                photo.d = attachImage.o;
                photo.e = attachImage.d;
                photo.g = (int) (attachImage.k / 1000);
                photo.h = 0;
                photo.j = 0;
                photo.k = 0;
                photo.l = false;
                photo.n = false;
                photo.o = false;
                photo.q = true;
                photo.s = "";
                if (attachImage.r.Jb()) {
                    str2 = attachImage.r.Ab().d;
                } else {
                    Image Ab = attachImage.q.Ab();
                    if (Ab == null || (str2 = Ab.d) == null) {
                        str2 = "";
                    }
                }
                photo.s = str2;
                if (attachImage.r.Jb()) {
                    str4 = attachImage.r.Ab().d;
                } else {
                    Image Ab2 = attachImage.q.Ab();
                    if (Ab2 != null && (str3 = Ab2.d) != null) {
                        str4 = str3;
                    }
                }
                photo.t = str4;
                photo.u = attachImage.s;
                photo.v = attachImage.t;
                photo.f = attachImage.p;
                photo.L = attachImage.v;
                NftMeta nftMeta = attachImage.w;
                photo.N = nftMeta;
                if (nftMeta != null) {
                    Nft zb2 = photo.zb();
                    if (zb2 == null) {
                        UserId userId = nftMeta.b;
                        String str5 = nftMeta.c;
                        String str6 = nftMeta.d;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new ImageSize(nftMeta.m, 0, 0, null, ImageSizeKey.SIZE_KEY_UNDEFINED, false, 8, null));
                        s3q0 s3q0Var = s3q0.a;
                        zb2 = new Nft(userId, str5, str6, new Photo(new com.vk.dto.common.Image(arrayList3)), nftMeta.e, nftMeta.f, nftMeta.n, nftMeta.o, nftMeta.p, nftMeta.q, null, null, null, 7168, null);
                    }
                    attachment5 = new NftAttachment(zb2, null, i2, false ? 1 : 0);
                } else {
                    PhotoAttachment photoAttachment = new PhotoAttachment(photo);
                    photoAttachment.v = attachImage.x;
                    photoAttachment.w = attachImage.y;
                    photoAttachment.x = attachImage.z;
                    attachment5 = photoAttachment;
                }
            }
        } else {
            if (attach instanceof AttachVideo) {
                AttachVideo attachVideo = (AttachVideo) attach;
                VideoFile videoFile = attachVideo.b;
                if (!z2) {
                    videoFile = videoFile.copy();
                    videoFile.b2(VideoCanDownload.NO);
                    videoFile.k4(false);
                    videoFile.u9(false);
                    videoFile.h2(false);
                    videoFile.N6(false);
                    videoFile.pb(false);
                    videoFile.r0(false);
                }
                audioCuratorAttachment = (attachVideo.m.length() != 0 && ((attachSyncState = attachVideo.n) == AttachSyncState.UPLOAD_REQUIRED || attachSyncState == AttachSyncState.REJECTED)) ? new PendingVideoAttachment(videoFile, VideoSave.Target.MESSAGES, attachVideo.b.I0()) : new VideoAttachment(videoFile);
            } else {
                if (attach instanceof AttachDoc) {
                    AttachDoc attachDoc = (AttachDoc) attach;
                    if (attachDoc.c != AttachSyncState.DONE) {
                        String str7 = attachDoc.g;
                        String str8 = attachDoc.r;
                        long j = attachDoc.h;
                        fxj0 fxj0Var2 = (fxj0) j5g.Z(attachDoc.p);
                        attachment3 = new PendingDocumentAttachment(str7, str8, j, fxj0Var2 != null ? fxj0Var2.getUrl() : null, attachDoc.d, (int) attachDoc.e, attachDoc.j);
                    } else {
                        Document document = new Document();
                        document.b = (int) attachDoc.e;
                        document.h = attachDoc.d;
                        document.g = attachDoc.h;
                        document.c = 0;
                        document.l = attachDoc.g;
                        document.m = attachDoc.j.toLowerCase(Locale.ROOT);
                        document.k = attachDoc.k;
                        document.o = attachDoc.s;
                        document.p = "";
                        document.q = "";
                        document.r = null;
                        if (attachDoc.n.b.isEmpty()) {
                            document.d = 0;
                            document.e = 0;
                            document.n = "";
                            ImageList imageList2 = attachDoc.p;
                            ArrayList arrayList4 = new ArrayList(c5g.u(imageList2, 10));
                            for (Image image2 : imageList2.b) {
                                arrayList4.add(new ImageSize(image2.getUrl(), image2.getWidth(), image2.getHeight(), Boolean.valueOf(image2.c7()), ImageSize.b.d(image2.getWidth(), image2.getHeight(), image2.c7()), false, 32, null));
                            }
                            document.t = new com.vk.dto.common.Image(arrayList4);
                        } else {
                            Image image3 = (Image) ixj0.m(attachDoc.n.b);
                            Image Ab3 = attachDoc.n.Ab();
                            document.d = Ab3.b;
                            document.e = Ab3.c;
                            document.n = image3.d;
                            ImageList imageList3 = attachDoc.n;
                            ArrayList arrayList5 = new ArrayList(c5g.u(imageList3, 10));
                            for (Image image4 : imageList3.b) {
                                arrayList5.add(new ImageSize(image4.getUrl(), image4.getWidth(), image4.getHeight(), Boolean.valueOf(image4.c7()), ImageSize.b.d(image4.getWidth(), image4.getHeight(), image4.c7()), false, 32, null));
                            }
                            document.t = new com.vk.dto.common.Image(arrayList5);
                        }
                        if (attachDoc.o.isEmpty()) {
                            document.f = -1;
                            document.s = "";
                        } else {
                            ArrayList arrayList6 = attachDoc.o;
                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                videoPreview = null;
                            } else {
                                videoPreview = (VideoPreview) arrayList6.get(0);
                                for (int i3 = 1; i3 < arrayList6.size(); i3++) {
                                    VideoPreview videoPreview2 = (VideoPreview) arrayList6.get(i3);
                                    int i4 = videoPreview.b * videoPreview.c;
                                    int i5 = videoPreview2.b * videoPreview2.c;
                                    if ((-(i4 < i5 ? -1 : i4 > i5 ? 1 : 0)) < 0) {
                                        videoPreview = videoPreview2;
                                    }
                                }
                            }
                            document.f = -1;
                            document.d = videoPreview.b;
                            document.e = videoPreview.c;
                            document.s = videoPreview.e;
                        }
                        attachment3 = new DocumentAttachment(document);
                    }
                } else if (attach instanceof AttachWall) {
                    AttachWall attachWall = (AttachWall) attach;
                    UserId userId2 = attachWall.d;
                    int i6 = attachWall.e;
                    String str9 = attachWall.m;
                    boolean z3 = attachWall.h;
                    UserId userId3 = attachWall.f;
                    List<Attach> list = attachWall.o;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Attachment b = b((Attach) it.next(), null, false, 6);
                        if (b != null) {
                            arrayList7.add(b);
                        }
                    }
                    attachment3 = new PostAttachment(userId2, i6, str9, z3, userId3, arrayList7);
                } else if (attach instanceof AttachWallReply) {
                    AttachWallReply attachWallReply = (AttachWallReply) attach;
                    attachment3 = new PostReplyAttachment(attachWallReply.d, attachWallReply.g, attachWallReply.e, attachWallReply.f, attachWallReply.j, attachWallReply.k);
                } else if (attach instanceof AttachPlaylist) {
                    attachment3 = new AudioPlaylistAttachment(new Playlist(Playlist.zb(((AttachPlaylist) attach).b, null, null, null, null, -1, 255)));
                } else if (attach instanceof AttachArtist) {
                    AttachArtist attachArtist = (AttachArtist) attach;
                    audioCuratorAttachment = new AudioArtistAttachment(new Artist(attachArtist.b, attachArtist.c, null, null, new com.vk.dto.common.Image(c(attachArtist.g())), false, false, false, attachArtist.i, false, null, 0, null, 7916, null));
                } else if (attach instanceof AttachCurator) {
                    AttachCurator attachCurator = (AttachCurator) attach;
                    audioCuratorAttachment = new AudioCuratorAttachment(new Curator(attachCurator.b, attachCurator.c, null, new com.vk.dto.common.Image(c(attachCurator.g())), null, false, false, null, 244, null));
                } else if (attach instanceof AttachMap) {
                    AttachMap attachMap = (AttachMap) attach;
                    attachment3 = new GeoAttachment(attachMap.e, attachMap.f, attachMap.g, "", attachMap.b, "", 0);
                } else if (attach instanceof AttachAudio) {
                    attachment3 = new AudioAttachment(MusicTrack.zb(((AttachAudio) attach).b, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575));
                } else if (attach instanceof AttachAudioMsg) {
                    AttachAudioMsg attachAudioMsg = (AttachAudioMsg) attach;
                    attachment3 = new PendingAudioMessageAttachment("…", attachAudioMsg.j, 0, UserId.d, 0, "ogg", attachAudioMsg.f, attachAudioMsg.g);
                } else if (attach instanceof AttachLink) {
                    AttachLink attachLink = (AttachLink) attach;
                    attachment3 = new LinkAttachment(attachLink.e, attachLink.f, "", "", null, null, null);
                } else if (attach instanceof AttachArticle) {
                    attachment3 = new ArticleAttachment(a((AttachArticle) attach));
                } else if (attach instanceof AttachPoll) {
                    attachment3 = new PollAttachment(((AttachPoll) attach).d);
                } else {
                    if (attach instanceof AttachPodcastEpisode) {
                        PodcastEpisode podcastEpisode = ((AttachPodcastEpisode) attach).d;
                        attachment = null;
                        attachment3 = new PodcastAttachment(new MusicTrack(podcastEpisode.b, podcastEpisode.c, podcastEpisode.e, null, 0, 0, podcastEpisode.d, null, null, 0, false, false, 0, null, false, null, "", false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -65608, 1048575, null), false ? 1 : 0, i2, false ? 1 : 0);
                    } else {
                        attachment = null;
                        boolean z4 = false;
                        boolean z5 = false;
                        if (attach instanceof AttachStory) {
                            attachment3 = new StoryAttachment(((AttachStory) attach).b, z5 ? 1 : 0, i2, z4 ? 1 : 0);
                        } else if (attach instanceof AttachEvent) {
                            AttachEvent attachEvent = (AttachEvent) attach;
                            UserId userId4 = attachEvent.d;
                            String str10 = attachEvent.e;
                            ImageList imageList4 = attachEvent.h;
                            attachment3 = new EventAttachment(new Owner(userId4, str10, null, null, null, imageList4 != null ? new com.vk.dto.common.Image(c(imageList4)) : null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194268, null), (int) (attachEvent.f / 1000), attachEvent.g, -1, false, null, null, null);
                        } else if (attach instanceof AttachMiniApp) {
                            AttachMiniApp attachMiniApp = (AttachMiniApp) attach;
                            ApiApplication apiApplication = attachMiniApp.b;
                            String str11 = attachMiniApp.c;
                            String str12 = attachMiniApp.d;
                            String str13 = attachMiniApp.f;
                            List<fxj0> O0 = j5g.O0(attachMiniApp.e);
                            ArrayList arrayList8 = new ArrayList(c5g.u(O0, 10));
                            for (fxj0 fxj0Var3 : O0) {
                                arrayList8.add(new NotificationImage.ImageInfo(fxj0Var3.getWidth(), fxj0Var3.getHeight(), fxj0Var3.getUrl()));
                            }
                            attachment3 = new MiniAppAttachment(apiApplication, str11, str12, str13, new NotificationImage(arrayList8), null);
                        } else if (attach instanceof AttachDonutLink) {
                            AttachDonutLink attachDonutLink = (AttachDonutLink) attach;
                            UserId userId5 = attachDonutLink.d;
                            String str14 = attachDonutLink.f;
                            VerifyInfo verifyInfo = new VerifyInfo(attachDonutLink.g, false, false, false, false, false, 62, null);
                            ImageList imageList5 = attachDonutLink.i;
                            Owner owner = new Owner(userId5, str14, null, null, verifyInfo, imageList5 != null ? new com.vk.dto.common.Image(c(imageList5)) : null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194252, null);
                            UserId userId6 = attachDonutLink.d;
                            String str15 = attachDonutLink.h;
                            int i7 = attachDonutLink.j;
                            int i8 = attachDonutLink.k;
                            List<AttachDonutLink.Friend> list2 = attachDonutLink.l;
                            if (list2 != null) {
                                ArrayList arrayList9 = new ArrayList();
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList9.add(new Owner(null, null, null, null, null, new com.vk.dto.common.Image(c(((AttachDonutLink.Friend) it2.next()).c)), null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194271, null));
                                }
                                arrayList = arrayList9;
                            } else {
                                arrayList = null;
                            }
                            attachment3 = new DonutLinkAttachment(owner, userId6, str15, i7, i8, arrayList, attachDonutLink.m, attachDonutLink.n);
                        } else if (attach instanceof AttachMarket) {
                            AttachMarket attachMarket = (AttachMarket) attach;
                            Image image5 = (Image) ixj0.m(attachMarket.q.b);
                            long j2 = attachMarket.e;
                            UserId userId7 = attachMarket.d;
                            String str16 = attachMarket.f;
                            Serializer.c<com.vk.dto.common.Image> cVar = com.vk.dto.common.Image.CREATOR;
                            if (image5 != null && (str = image5.d) != null) {
                                str4 = str;
                            }
                            attachment5 = new MarketAttachment(new Good(j2, userId7, str16, Image.b.c(str4, image5 != null ? image5.b : 0, image5 != null ? image5.c : 0, ImageSizeKey.SIZE_M_0130.i()), attachMarket.l));
                        } else {
                            if (!(attach instanceof AttachQuestion)) {
                                if (attach instanceof AttachChannelMessage) {
                                    AttachChannelMessage attachChannelMessage = (AttachChannelMessage) attach;
                                    long j3 = attachChannelMessage.b.b;
                                    Peer peer = attachChannelMessage.d;
                                    int i9 = (int) attachChannelMessage.c;
                                    String str17 = (profilesSimpleInfo2 == null || (zb = profilesSimpleInfo2.zb(peer)) == null || (name = zb.name()) == null) ? "" : name;
                                    String str18 = attachChannelMessage.e;
                                    String str19 = attachChannelMessage.f;
                                    PostDonut postDonut = attachChannelMessage.k;
                                    List<Attach> list3 = attachChannelMessage.g;
                                    ArrayList arrayList10 = new ArrayList();
                                    Iterator<T> it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        try {
                                            attachment4 = b((Attach) it3.next(), null, false, 6);
                                        } catch (Exception unused) {
                                            attachment4 = null;
                                        }
                                        if (attachment4 != null) {
                                            arrayList10.add(attachment4);
                                        }
                                    }
                                    attachment2 = null;
                                    attachment3 = new ChannelMessageAttachment(j3, peer, i9, str17, str18, str19, arrayList10, null, null, postDonut, 0, null, 3456, null);
                                } else {
                                    attachment2 = null;
                                    attachment3 = null;
                                }
                                if (attachment3 == null) {
                                    return attachment2;
                                }
                                attachment3.c = attach.xb();
                                return attachment3;
                            }
                            AttachQuestion attachQuestion = (AttachQuestion) attach;
                            attachment3 = new QuestionAttachment(attachQuestion.b, attachQuestion.c, attachQuestion.d, attachQuestion.e);
                        }
                    }
                    attachment2 = attachment;
                    if (attachment3 == null) {
                    }
                }
                attachment2 = null;
                if (attachment3 == null) {
                }
            }
            attachment3 = audioCuratorAttachment;
            attachment2 = null;
            if (attachment3 == null) {
            }
        }
        attachment3 = attachment5;
        attachment2 = null;
        if (attachment3 == null) {
        }
    }

    public static ArrayList c(ImageList imageList) {
        ArrayList arrayList = new ArrayList(c5g.u(imageList, 10));
        for (com.vk.dto.common.im.Image image : imageList.b) {
            arrayList.add(new ImageSize(image.getUrl(), image.getWidth(), image.getHeight(), Boolean.valueOf(image.c7()), ImageSize.b.d(image.getWidth(), image.getHeight(), image.c7()), false, 32, null));
        }
        return arrayList;
    }
}
