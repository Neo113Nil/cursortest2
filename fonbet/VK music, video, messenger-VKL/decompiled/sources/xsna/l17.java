package xsna;

import android.os.SystemClock;
import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.StereoRoomAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.model.PostingMetricsEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.LinksParsingMetaData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PublicationState;
import com.vk.newsfeed.posting.impl.domain.model.StoryRepostData;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$AttachmentInfo;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ParsedLinksEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.BookingAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;
import xsna.efc0;
import xsna.epx;
import xsna.fmc0;
import xsna.pmi0;
import xsna.ssk0;
import xsna.t2e;
import xsna.w17;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l17 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l17(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020c  */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint;
        MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint2;
        boolean z;
        MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType;
        PostingState postingState;
        final MobileOfficialAppsConPostingStat$AttachmentInfo mobileOfficialAppsConPostingStat$AttachmentInfo;
        Object obj2;
        long j;
        long j2;
        int i;
        String str;
        String str2;
        int i2 = this.b;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i2) {
            case 0:
                View view = (View) obj7;
                yvj yvjVar = (yvj) obj6;
                wh50 wh50Var = (wh50) obj4;
                wh50 wh50Var2 = (wh50) obj3;
                Float f = (Float) obj;
                f.floatValue();
                ((wh50) obj5).setValue(f);
                if (!((Boolean) wh50Var.getValue()).booleanValue()) {
                    cl40.a(view, MusicHapticEvent.SOFT);
                    wh50Var.setValue(Boolean.TRUE);
                    eyx eyxVar = (eyx) wh50Var2.getValue();
                    if (eyxVar != null) {
                        eyxVar.b(null);
                    }
                    wh50Var2.setValue(myc0.h(yvjVar, null, null, new w17.c(view, null), 3));
                }
                break;
            case 1:
                q2e.e((zlq) obj6, (q2e) obj5, (View) obj7, (VideoFile) obj4, (za) obj3, new t2e.a((List) obj));
                break;
            default:
                ube0 ube0Var = (ube0) obj7;
                WallOwner wallOwner = (WallOwner) obj6;
                PostingMetricsEntryPoint postingMetricsEntryPoint = (PostingMetricsEntryPoint) obj5;
                PostingState postingState2 = (PostingState) obj3;
                NewsEntry newsEntry = (NewsEntry) obj;
                efc0.a aVar = ube0Var.a;
                aVar.a(new com.vk.newsfeed.posting.impl.domain.model.s(SystemClock.elapsedRealtime()));
                UserId userId = wallOwner.b;
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                List<ParsedAttachment> list = ((LinksParsingMetaData) obj4).c;
                ArrayList arrayList = new ArrayList();
                for (ParsedAttachment parsedAttachment : list) {
                    Attachment attachment = parsedAttachment.b;
                    boolean z2 = attachment instanceof ArticleAttachment;
                    if (z2) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ARTICLE;
                    } else if (attachment instanceof GeoAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.GEO;
                    } else if (attachment instanceof VideoAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.VIDEO;
                    } else if (attachment instanceof AudioAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO;
                    } else if (attachment instanceof AlbumAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ALBUM;
                    } else if (attachment instanceof PhotoAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.PHOTO;
                    } else if (attachment instanceof AudioPlaylistAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO_PLAYLIST;
                    } else if (attachment instanceof PollAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.POLL;
                    } else if (attachment instanceof DocumentAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.DOC;
                    } else if (attachment instanceof MarketAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.GOODS;
                    } else if ((attachment instanceof SnippetAttachment) || (attachment instanceof LinkAttachment)) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.LINK;
                    } else if (attachment instanceof StereoRoomAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.STEREO_ROOM;
                    } else if (attachment instanceof AudioArtistAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ARTIST;
                    } else if (attachment instanceof BookingAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ONLINE_BOOKING;
                    } else if (attachment instanceof MarketLinkAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.MARKET_LINK;
                    } else if (attachment instanceof MarketMessageOwnerAttachment) {
                        attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.MESSAGE_TO_BC;
                    } else {
                        postingState = postingState2;
                        mobileOfficialAppsConPostingStat$AttachmentInfo = null;
                        if (mobileOfficialAppsConPostingStat$AttachmentInfo == null) {
                            final String str3 = parsedAttachment.c;
                            obj2 = new Object(str3, mobileOfficialAppsConPostingStat$AttachmentInfo) { // from class: com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ParsedLinkAttachment

                                @pmi0("attachment_info")
                                private final MobileOfficialAppsConPostingStat$AttachmentInfo attachmentInfo;

                                @pmi0("url")
                                private final String url;

                                {
                                    this.url = str3;
                                    this.attachmentInfo = mobileOfficialAppsConPostingStat$AttachmentInfo;
                                }

                                public final boolean equals(Object obj8) {
                                    if (this == obj8) {
                                        return true;
                                    }
                                    if (!(obj8 instanceof MobileOfficialAppsConPostingStat$ParsedLinkAttachment)) {
                                        return false;
                                    }
                                    MobileOfficialAppsConPostingStat$ParsedLinkAttachment mobileOfficialAppsConPostingStat$ParsedLinkAttachment = (MobileOfficialAppsConPostingStat$ParsedLinkAttachment) obj8;
                                    return epx.f(this.url, mobileOfficialAppsConPostingStat$ParsedLinkAttachment.url) && epx.f(this.attachmentInfo, mobileOfficialAppsConPostingStat$ParsedLinkAttachment.attachmentInfo);
                                }

                                public final int hashCode() {
                                    return this.attachmentInfo.hashCode() + (this.url.hashCode() * 31);
                                }

                                public final String toString() {
                                    return "ParsedLinkAttachment(url=" + this.url + ", attachmentInfo=" + this.attachmentInfo + ')';
                                }
                            };
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            arrayList.add(obj2);
                        }
                        postingState2 = postingState;
                    }
                    MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType2 = attachmentType;
                    if (z2) {
                        postingState = postingState2;
                        j = ((ArticleAttachment) attachment).f.c.b;
                    } else {
                        postingState = postingState2;
                        if (attachment instanceof GeoAttachment) {
                            j = UserId.d.b;
                        } else if (attachment instanceof VideoAttachment) {
                            j = ((VideoAttachment) attachment).k.I0().b;
                        } else if (attachment instanceof AudioAttachment) {
                            j = ((AudioAttachment) attachment).f.c.b;
                        } else if (attachment instanceof AlbumAttachment) {
                            j = ((AlbumAttachment) attachment).g.b;
                        } else if (attachment instanceof PhotoAttachment) {
                            j = ((PhotoAttachment) attachment).g.b;
                        } else if (attachment instanceof AudioPlaylistAttachment) {
                            j = ((AudioPlaylistAttachment) attachment).f.c.b;
                        } else if (attachment instanceof PollAttachment) {
                            j = ((PollAttachment) attachment).f.c.b;
                        } else if (attachment instanceof DocumentAttachment) {
                            j = ((DocumentAttachment) attachment).o.b;
                        } else if (attachment instanceof MarketAttachment) {
                            j = ((MarketAttachment) attachment).f.c.b;
                        } else if (attachment instanceof StereoRoomAttachment) {
                            j = ((StereoRoomAttachment) attachment).f.e.b;
                        } else if (attachment instanceof MarketMessageOwnerAttachment) {
                            UserId userId2 = ((MarketMessageOwnerAttachment) attachment).f;
                            j = userId2 != null ? userId2.b : UserId.d.b;
                        } else {
                            j = UserId.d.b;
                        }
                    }
                    long j3 = j;
                    if (z2) {
                        i = ((ArticleAttachment) attachment).f.b;
                    } else if (attachment instanceof VideoAttachment) {
                        i = ((VideoAttachment) attachment).k.o0();
                    } else if (attachment instanceof AudioAttachment) {
                        i = ((AudioAttachment) attachment).f.b;
                    } else if (attachment instanceof AlbumAttachment) {
                        i = ((AlbumAttachment) attachment).h;
                    } else if (attachment instanceof PhotoAttachment) {
                        i = ((PhotoAttachment) attachment).f;
                    } else if (attachment instanceof AudioPlaylistAttachment) {
                        i = ((AudioPlaylistAttachment) attachment).f.b;
                    } else if (attachment instanceof PollAttachment) {
                        i = ((PollAttachment) attachment).f.b;
                    } else if (attachment instanceof DocumentAttachment) {
                        i = ((DocumentAttachment) attachment).k;
                    } else {
                        j2 = attachment instanceof MarketAttachment ? ((MarketAttachment) attachment).f.b : 0L;
                        long j4 = j2;
                        if (!(attachment instanceof GeoAttachment)) {
                            StringBuilder sb = new StringBuilder();
                            GeoAttachment geoAttachment = (GeoAttachment) attachment;
                            sb.append(geoAttachment.f);
                            sb.append(',');
                            sb.append(geoAttachment.g);
                            str2 = sb.toString();
                        } else if (attachment instanceof StereoRoomAttachment) {
                            str2 = ((StereoRoomAttachment) attachment).f.b;
                        } else if (attachment instanceof BookingAttachment) {
                            str2 = ((BookingAttachment) attachment).g;
                        } else if (attachment instanceof MarketLinkAttachment) {
                            str2 = ((MarketLinkAttachment) attachment).g;
                        } else {
                            str = null;
                            mobileOfficialAppsConPostingStat$AttachmentInfo = new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType2, j3, j4, str);
                            if (mobileOfficialAppsConPostingStat$AttachmentInfo == null) {
                            }
                            if (obj2 == null) {
                            }
                            postingState2 = postingState;
                        }
                        str = str2;
                        mobileOfficialAppsConPostingStat$AttachmentInfo = new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType2, j3, j4, str);
                        if (mobileOfficialAppsConPostingStat$AttachmentInfo == null) {
                        }
                        if (obj2 == null) {
                        }
                        postingState2 = postingState;
                    }
                    j2 = i;
                    long j42 = j2;
                    if (!(attachment instanceof GeoAttachment)) {
                    }
                    str = str2;
                    mobileOfficialAppsConPostingStat$AttachmentInfo = new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType2, j3, j42, str);
                    if (mobileOfficialAppsConPostingStat$AttachmentInfo == null) {
                    }
                    if (obj2 == null) {
                    }
                    postingState2 = postingState;
                }
                PostingState postingState3 = postingState2;
                long j5 = userId.b;
                switch (ssk0.a.$EnumSwitchMapping$0[postingMetricsEntryPoint.ordinal()]) {
                    case 1:
                        creationEntryPoint = MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_PLUS_BUTTON;
                        creationEntryPoint2 = creationEntryPoint;
                        break;
                    case 2:
                        creationEntryPoint = MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.GROUP_WALL_BUTTON;
                        creationEntryPoint2 = creationEntryPoint;
                        break;
                    case 3:
                        creationEntryPoint = MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.PROFILE_PLUS_BUTTON;
                        creationEntryPoint2 = creationEntryPoint;
                        break;
                    case 4:
                        creationEntryPoint = MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.PROFILE_WALL_BUTTON;
                        creationEntryPoint2 = creationEntryPoint;
                        break;
                    case 5:
                        creationEntryPoint = MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.CHANNEL_WRITE_BAR_BUTTON;
                        creationEntryPoint2 = creationEntryPoint;
                        break;
                    case 6:
                        creationEntryPoint = MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.POST_THREE_DOT_MENU_EDIT_ITEM;
                        creationEntryPoint2 = creationEntryPoint;
                        break;
                    default:
                        creationEntryPoint2 = null;
                        break;
                }
                new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0), new MobileOfficialAppsConPostingStat$TypePostingItem(c, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsConPostingStat$ParsedLinksEvent(arrayList), null, null, null, Long.valueOf(j5), null, creationEntryPoint2, null, null, 14123006, null), 2)).q();
                PostingState.Editing editing = (PostingState.Editing) postingState3;
                PostEditingReason postEditingReason = editing.h;
                PostEditableData postEditableData = editing.i;
                PostingContext postingContext = editing.c;
                boolean z3 = postEditingReason instanceof PostEditingReason.EditExistingPost;
                ube0Var.d.c(postingContext.b.b);
                StoryRepostData storyRepostData = (tuk0.c(editing) && postEditableData.o == null && postEditableData.B) ? new StoryRepostData(postingContext.b.b, postEditableData.i, postEditableData.p) : null;
                boolean Ja = editing.h.Ja();
                GroupWallPostingSettings groupWallPostingSettings = editing.d.h;
                boolean z4 = false;
                boolean z5 = true;
                if (groupWallPostingSettings == null || !groupWallPostingSettings.b) {
                    z = false;
                } else {
                    z = false;
                    z4 = true;
                }
                if (!fkq0.b(wallOwner.b) && !((Boolean) ube0Var.g.getValue()).booleanValue()) {
                    z5 = z;
                }
                aVar.e(new fmc0.m.g(z3, Ja, z4, z5, postingContext.l, newsEntry, editing.h, postEditableData.b, postingContext.e, postingContext.m, storyRepostData));
                aVar.a(new e.g(PublicationState.Success));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l17(zlq zlqVar, q2e q2eVar, View view, VideoFile videoFile, za zaVar) {
        this.b = 1;
        this.d = zlqVar;
        this.e = q2eVar;
        this.c = view;
        this.f = videoFile;
        this.g = zaVar;
    }
}
