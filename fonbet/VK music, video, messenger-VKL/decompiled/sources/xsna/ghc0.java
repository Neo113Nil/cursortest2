package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.StereoRoomAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stereo.StereoRoom;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$AddAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$AttachmentInfo;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$BestFriendEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ChangeOwnerEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ClickAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$MentionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PosterEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PosterInfo;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PrimaryModeEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$SettingsEvent;
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
import java.util.Collections;
import java.util.List;
import xsna.fhc0;

/* compiled from: PostingMetricsCollectorImpl.kt */
/* loaded from: classes18.dex */
public final class ghc0 implements fhc0 {
    public final bpn0 a = new bpn0(new m960(this, 13));
    public final bpn0 b = new bpn0(new cr20(this, 24));
    public final bpn0 c = new bpn0(new l500(this, 29));
    public final bpn0 d = new bpn0(new os30(this, 16));
    public final bpn0 e = new bpn0(new r010(this, 22));
    public final bpn0 f = new bpn0(new qbc0(this, 1));
    public final bpn0 g = new bpn0(new t210(this, 22));
    public final bpn0 h = new bpn0(new sy50(this, 14));
    public c i = new c(null, null);

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public final class a implements fhc0.a {
        public a() {
        }

        @Override // xsna.fhc0.a
        public final void a(GeoAttachment geoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_PLACE, postingMetricsCreationEntryPoint, Collections.singletonList(t64.a(geoAttachment)));
        }

        @Override // xsna.fhc0.a
        public final void b(VideoAttachment videoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_VIDEO, postingMetricsCreationEntryPoint, Collections.singletonList(t64.c(videoAttachment)));
        }

        @Override // xsna.fhc0.a
        public final void c(LinkAttachment linkAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_LINK, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.LINK, 0L, 0L, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void d(PhotoAttachment photoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_MY_PHOTO, postingMetricsCreationEntryPoint, Collections.singletonList(t64.b(photoAttachment)));
        }

        @Override // xsna.fhc0.a
        public final void e(ArticleAttachment articleAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_ARTICLE, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ARTICLE, articleAttachment.f.c.b, r11.b, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void f(PollAttachment pollAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_POLL, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.POLL, pollAttachment.f.c.b, r11.b, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void g(MarketAttachment marketAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType addAttachmentEventType = MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_PRODUCT;
            MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.GOODS;
            Good good = marketAttachment.f;
            q(addAttachmentEventType, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType, good.c.b, good.b, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void h(AudioAttachment audioAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_MUSIC, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO, audioAttachment.f.c.b, r11.b, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void i(VideoAttachment videoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_MY_VIDEO, postingMetricsCreationEntryPoint, Collections.singletonList(t64.c(videoAttachment)));
        }

        @Override // xsna.fhc0.a
        public final void j(PhotoAttachment photoAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_PHOTO, postingMetricsCreationEntryPoint, Collections.singletonList(t64.b(photoAttachment)));
        }

        @Override // xsna.fhc0.a
        public final void k(AlbumAttachment albumAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_ALBUM, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ALBUM, albumAttachment.g.b, albumAttachment.h, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void l(AudioPlaylistAttachment audioPlaylistAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_PLAYLISTS, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO_PLAYLIST, audioPlaylistAttachment.f.c.b, r11.b, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void m(MarketMessageOwnerAttachment marketMessageOwnerAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType addAttachmentEventType = MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_MESSAGE_TO_BC;
            MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.MESSAGE_TO_BC;
            UserId userId = marketMessageOwnerAttachment.f;
            q(addAttachmentEventType, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType, userId != null ? userId.b : 0L, 0L, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void n(SnippetAttachment snippetAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_LINK, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.LINK, 0L, 0L, null, 8, null)));
        }

        @Override // xsna.fhc0.a
        public final void o(Attachment attachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            MobileOfficialAppsConPostingStat$AttachmentInfo mobileOfficialAppsConPostingStat$AttachmentInfo;
            MobileOfficialAppsConPostingStat$AttachmentInfo mobileOfficialAppsConPostingStat$AttachmentInfo2;
            if (attachment instanceof ArticleAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ARTICLE, ((ArticleAttachment) attachment).f.c.b, r11.b, null, 8, null);
            } else if (attachment instanceof GeoAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = t64.a((GeoAttachment) attachment);
            } else if (attachment instanceof VideoAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = t64.c((VideoAttachment) attachment);
            } else if (attachment instanceof AudioAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO, ((AudioAttachment) attachment).f.c.b, r11.b, null, 8, null);
            } else if (attachment instanceof AlbumAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ALBUM, ((AlbumAttachment) attachment).g.b, r11.h, null, 8, null);
            } else if (attachment instanceof PhotoAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = t64.b((PhotoAttachment) attachment);
            } else if (attachment instanceof AudioPlaylistAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO_PLAYLIST, ((AudioPlaylistAttachment) attachment).f.c.b, r11.b, null, 8, null);
            } else if (attachment instanceof PollAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.POLL, ((PollAttachment) attachment).f.c.b, r11.b, null, 8, null);
            } else if (attachment instanceof DocumentAttachment) {
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.DOC, ((DocumentAttachment) attachment).o.b, r11.k, null, 8, null);
            } else if (attachment instanceof MarketAttachment) {
                MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.GOODS;
                Good good = ((MarketAttachment) attachment).f;
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType, good.c.b, good.b, null, 8, null);
            } else {
                if (attachment instanceof SnippetAttachment) {
                    mobileOfficialAppsConPostingStat$AttachmentInfo = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.LINK, 0L, 0L, null, 8, null);
                } else if (attachment instanceof LinkAttachment) {
                    mobileOfficialAppsConPostingStat$AttachmentInfo = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.LINK, 0L, 0L, null, 8, null);
                } else if (attachment instanceof StereoRoomAttachment) {
                    MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType2 = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.STEREO_ROOM;
                    StereoRoom stereoRoom = ((StereoRoomAttachment) attachment).f;
                    mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType2, stereoRoom.e.b, 0L, stereoRoom.b);
                } else if (attachment instanceof AudioArtistAttachment) {
                    mobileOfficialAppsConPostingStat$AttachmentInfo = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ARTIST, 0L, 0L, null, 8, null);
                } else if (attachment instanceof BookingAttachment) {
                    mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ONLINE_BOOKING, 0L, 0L, ((BookingAttachment) attachment).g);
                } else if (attachment instanceof MarketLinkAttachment) {
                    mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.MARKET_LINK, 0L, 0L, ((MarketLinkAttachment) attachment).g);
                } else if (attachment instanceof MarketMessageOwnerAttachment) {
                    MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType3 = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.MESSAGE_TO_BC;
                    UserId userId = ((MarketMessageOwnerAttachment) attachment).f;
                    mobileOfficialAppsConPostingStat$AttachmentInfo2 = new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType3, userId != null ? userId.b : 0L, 0L, null, 8, null);
                } else {
                    mobileOfficialAppsConPostingStat$AttachmentInfo = null;
                    if (!(attachment instanceof ju90)) {
                        com.vk.metrics.eventtracking.b.a.q(new Throwable(qjg.a(attachment).concat(" not supported for posting analytics")));
                    }
                }
                mobileOfficialAppsConPostingStat$AttachmentInfo2 = mobileOfficialAppsConPostingStat$AttachmentInfo;
            }
            if (mobileOfficialAppsConPostingStat$AttachmentInfo2 != null) {
                q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.DELETE_ATTACH, postingMetricsCreationEntryPoint, Collections.singletonList(mobileOfficialAppsConPostingStat$AttachmentInfo2));
            }
        }

        @Override // xsna.fhc0.a
        public final void p(DocumentAttachment documentAttachment, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_DOC, postingMetricsCreationEntryPoint, Collections.singletonList(new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.DOC, documentAttachment.o.b, documentAttachment.k, null, 8, null)));
        }

        public final void q(MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType addAttachmentEventType, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint, List<MobileOfficialAppsConPostingStat$AttachmentInfo> list) {
            if (list.isEmpty()) {
                return;
            }
            MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent = new MobileOfficialAppsConPostingStat$AddAttachmentEvent(addAttachmentEventType, null, list, null, 10, null);
            ghc0 ghc0Var = ghc0.this;
            ghc0.j(ghc0Var, new h(null, null, mobileOfficialAppsConPostingStat$AddAttachmentEvent, null, null, null, null, null, ghc0.k(ghc0Var, postingMetricsCreationEntryPoint), 251));
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public final class b implements fhc0.b {
        public b() {
        }

        @Override // xsna.fhc0.b
        public final void a() {
            i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.SELECTION_MODE_COMMUNITY, null);
        }

        @Override // xsna.fhc0.b
        public final void b() {
            i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.SELECT_PHOTO, null);
        }

        @Override // xsna.fhc0.b
        public final void c() {
            i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.MAKE_VIDEO_FROM_GALLERY, null);
        }

        @Override // xsna.fhc0.b
        public final void d() {
            i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.MAKE_PHOTO_FROM_GALLERY, null);
        }

        @Override // xsna.fhc0.b
        public final void e() {
            i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.SELECT_VIDEO, null);
        }

        @Override // xsna.fhc0.b
        public final void f() {
            i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.CHANGE_DIRECTORY, null);
        }

        @Override // xsna.fhc0.b
        public final void g() {
            i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_CAMERA_FROM_GALLERY, null);
        }

        @Override // xsna.fhc0.b
        public final void h() {
            i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.SELECTION_MODE_PROFILE, null);
        }

        public final void i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType clickAttachmentEventType, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent = new MobileOfficialAppsConPostingStat$ClickAttachmentEvent(clickAttachmentEventType, null, null, 6, null);
            ghc0 ghc0Var = ghc0.this;
            ghc0.j(ghc0Var, new h(null, mobileOfficialAppsConPostingStat$ClickAttachmentEvent, null, null, null, null, null, null, postingMetricsCreationEntryPoint != null ? ghc0.k(ghc0Var, postingMetricsCreationEntryPoint) : null, 253));
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public static final class c {
        public final Integer a;
        public final UserId b;

        public c() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            UserId userId = this.b;
            return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BasePostingMetrics(postId=");
            sb.append(this.a);
            sb.append(", ownerId=");
            return gp.b(sb, this.b, ')');
        }

        public c(UserId userId, Integer num) {
            this.a = num;
            this.b = userId;
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public final class d implements fhc0.c {
        public d() {
        }

        @Override // xsna.fhc0.c
        public final void a() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.SAVE_BEST_FRIENDS_LIST);
        }

        @Override // xsna.fhc0.c
        public final void b() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.ADD_FRIENDS_FROM_CHAT);
        }

        @Override // xsna.fhc0.c
        public final void c() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.UPDATE_POPUP_SAVE);
        }

        @Override // xsna.fhc0.c
        public final void d() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.MORE_CHATS);
        }

        @Override // xsna.fhc0.c
        public final void e() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.CLICK_TO_LOCK_BEST_FRIENDS);
        }

        @Override // xsna.fhc0.c
        public final void f() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.SELECT_FRIEND_FROM_SEARCH);
        }

        @Override // xsna.fhc0.c
        public final void g() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.SELECT_CHAT_FROM_SEARCH);
        }

        @Override // xsna.fhc0.c
        public final void h() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.UPDATE_POPUP_CANCEL);
        }

        @Override // xsna.fhc0.c
        public final void i() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.CLEAR);
        }

        @Override // xsna.fhc0.c
        public final void j() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.EDIT_BEST_FRIENDS);
        }

        @Override // xsna.fhc0.c
        public final void k() {
            l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType.SELECT_BEST_FREINDS);
        }

        public final void l(MobileOfficialAppsConPostingStat$BestFriendEvent.BestFriendEventType bestFriendEventType) {
            ghc0.j(ghc0.this, new h(null, null, null, null, null, null, null, new MobileOfficialAppsConPostingStat$BestFriendEvent(bestFriendEventType), null, 383));
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public final class e {
        public e() {
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public final class f {
        public f() {
        }

        public final void a(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_PLUS, postingMetricsCreationEntryPoint);
        }

        public final void b(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_STORY, postingMetricsCreationEntryPoint);
        }

        public final void c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType navigationEventType, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent = new MobileOfficialAppsConPostingStat$NavigationEvent(navigationEventType);
            ghc0 ghc0Var = ghc0.this;
            ghc0.j(ghc0Var, new h(mobileOfficialAppsConPostingStat$NavigationEvent, null, null, null, null, null, null, null, ghc0.k(ghc0Var, postingMetricsCreationEntryPoint), 254));
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public final class g implements fhc0.d {
        public g() {
        }

        public static /* synthetic */ void e(g gVar, MobileOfficialAppsConPostingStat$PosterEvent.PosterEventType posterEventType, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint, int i) {
            if ((i & 4) != 0) {
                postingMetricsCreationEntryPoint = null;
            }
            gVar.d(posterEventType, null, postingMetricsCreationEntryPoint);
        }

        @Override // xsna.fhc0.d
        public final void a() {
            e(this, MobileOfficialAppsConPostingStat$PosterEvent.PosterEventType.ADD_CUSTOM_BACKGROUND, null, 4);
        }

        @Override // xsna.fhc0.d
        public final void b() {
            e(this, MobileOfficialAppsConPostingStat$PosterEvent.PosterEventType.SELECT_CUSTOM_BACKGROUND, null, 4);
        }

        @Override // xsna.fhc0.d
        public final void c() {
            e(this, MobileOfficialAppsConPostingStat$PosterEvent.PosterEventType.SAVE_CUSTOM_BACKGROUND, null, 4);
        }

        public final void d(MobileOfficialAppsConPostingStat$PosterEvent.PosterEventType posterEventType, MobileOfficialAppsConPostingStat$PosterInfo mobileOfficialAppsConPostingStat$PosterInfo, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            MobileOfficialAppsConPostingStat$PosterEvent mobileOfficialAppsConPostingStat$PosterEvent = new MobileOfficialAppsConPostingStat$PosterEvent(posterEventType, mobileOfficialAppsConPostingStat$PosterInfo);
            ghc0 ghc0Var = ghc0.this;
            ghc0.j(ghc0Var, new h(null, null, null, null, null, null, mobileOfficialAppsConPostingStat$PosterEvent, null, postingMetricsCreationEntryPoint != null ? ghc0.k(ghc0Var, postingMetricsCreationEntryPoint) : null, 191));
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public static final class h {
        public final MobileOfficialAppsConPostingStat$NavigationEvent a;
        public final MobileOfficialAppsConPostingStat$ClickAttachmentEvent b;
        public final MobileOfficialAppsConPostingStat$AddAttachmentEvent c;
        public final MobileOfficialAppsConPostingStat$SettingsEvent d;
        public final MobileOfficialAppsConPostingStat$PrimaryModeEvent e;
        public final MobileOfficialAppsConPostingStat$MentionEvent f;
        public final MobileOfficialAppsConPostingStat$PosterEvent g;
        public final MobileOfficialAppsConPostingStat$BestFriendEvent h;
        public final MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint i;

        public h(MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent, MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent, MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent, MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent, MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent, MobileOfficialAppsConPostingStat$MentionEvent mobileOfficialAppsConPostingStat$MentionEvent, MobileOfficialAppsConPostingStat$PosterEvent mobileOfficialAppsConPostingStat$PosterEvent, MobileOfficialAppsConPostingStat$BestFriendEvent mobileOfficialAppsConPostingStat$BestFriendEvent, MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint, int i) {
            mobileOfficialAppsConPostingStat$NavigationEvent = (i & 1) != 0 ? null : mobileOfficialAppsConPostingStat$NavigationEvent;
            mobileOfficialAppsConPostingStat$ClickAttachmentEvent = (i & 2) != 0 ? null : mobileOfficialAppsConPostingStat$ClickAttachmentEvent;
            mobileOfficialAppsConPostingStat$AddAttachmentEvent = (i & 4) != 0 ? null : mobileOfficialAppsConPostingStat$AddAttachmentEvent;
            mobileOfficialAppsConPostingStat$SettingsEvent = (i & 8) != 0 ? null : mobileOfficialAppsConPostingStat$SettingsEvent;
            mobileOfficialAppsConPostingStat$PrimaryModeEvent = (i & 16) != 0 ? null : mobileOfficialAppsConPostingStat$PrimaryModeEvent;
            mobileOfficialAppsConPostingStat$MentionEvent = (i & 32) != 0 ? null : mobileOfficialAppsConPostingStat$MentionEvent;
            mobileOfficialAppsConPostingStat$PosterEvent = (i & 64) != 0 ? null : mobileOfficialAppsConPostingStat$PosterEvent;
            mobileOfficialAppsConPostingStat$BestFriendEvent = (i & 128) != 0 ? null : mobileOfficialAppsConPostingStat$BestFriendEvent;
            creationEntryPoint = (i & 256) != 0 ? null : creationEntryPoint;
            this.a = mobileOfficialAppsConPostingStat$NavigationEvent;
            this.b = mobileOfficialAppsConPostingStat$ClickAttachmentEvent;
            this.c = mobileOfficialAppsConPostingStat$AddAttachmentEvent;
            this.d = mobileOfficialAppsConPostingStat$SettingsEvent;
            this.e = mobileOfficialAppsConPostingStat$PrimaryModeEvent;
            this.f = mobileOfficialAppsConPostingStat$MentionEvent;
            this.g = mobileOfficialAppsConPostingStat$PosterEvent;
            this.h = mobileOfficialAppsConPostingStat$BestFriendEvent;
            this.i = creationEntryPoint;
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public final class i {
        public i() {
        }

        public static void a(i iVar, MobileOfficialAppsConPostingStat$PrimaryModeEvent.PrimaryModeEventType primaryModeEventType, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            ghc0 ghc0Var = ghc0.this;
            ghc0.j(ghc0Var, new h(null, null, null, null, new MobileOfficialAppsConPostingStat$PrimaryModeEvent(primaryModeEventType, null), null, null, null, ghc0.k(ghc0Var, postingMetricsCreationEntryPoint), 239));
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public final class j implements fhc0.e {
        public j() {
        }

        public static void m(j jVar, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType settingsEventType, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint, String str, Long l, int i) {
            String str2 = (i & 4) != 0 ? null : str;
            Long l2 = (i & 8) != 0 ? null : l;
            ghc0 ghc0Var = ghc0.this;
            ghc0.j(ghc0Var, new h(null, null, null, new MobileOfficialAppsConPostingStat$SettingsEvent(settingsEventType, null, null, null, null, null, str2, l2, null, null, 830, null), null, null, null, null, ghc0.k(ghc0Var, postingMetricsCreationEntryPoint), 247));
        }

        @Override // xsna.fhc0.e
        public final void a(String str, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.ATTACH_COPYRIGHT, postingMetricsCreationEntryPoint, str, null, 8);
        }

        @Override // xsna.fhc0.e
        public final void b(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CLICK_TO_ADVERTISING_MARK, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void c(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.TURN_OFF_NOTIFICATIONS, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void d(long j, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_POSTPONED, postingMetricsCreationEntryPoint, null, Long.valueOf(j), 4);
        }

        @Override // xsna.fhc0.e
        public final void e(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.SELECT_POSTPONED, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void f(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_PRIVACY, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void g(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.DONS_POST_LIFETIME_CHANGE, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void h(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.OPEN_SETTINGS, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void i(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.TURN_ON_NOTIFICATIONS, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void j(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CREATE_COPYRIGHT, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void k(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.SHOW_ALL, postingMetricsCreationEntryPoint, null, null, 12);
        }

        @Override // xsna.fhc0.e
        public final void l(PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.SHOW_DONS_ONLY, postingMetricsCreationEntryPoint, null, null, 12);
        }
    }

    /* compiled from: PostingMetricsCollectorImpl.kt */
    public static final /* synthetic */ class k {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingMetricsCreationEntryPoint.values().length];
            try {
                iArr[PostingMetricsCreationEntryPoint.FeedPlus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.GroupWallButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.ProfilePlusButton.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.ProfileWallButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.ChannelWriteBarButton.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.PostThreeDotMenuEditItem.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.FeedEditDraft.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.FeedEditDraftThreeDots.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.FeedDeleteDraft.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.FeedDeleteDraftThreeDots.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.ListEditDraft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.ListEditDraftThreeDots.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PostingMetricsCreationEntryPoint.CommunityCreationOnboarding.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void j(ghc0 ghc0Var, h hVar) {
        ghc0Var.getClass();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        UserId userId = ghc0Var.i.b;
        Long valueOf = userId != null ? Long.valueOf(userId.b) : null;
        Integer num = ghc0Var.i.a;
        MobileOfficialAppsConPostingStat$ChangeOwnerEvent mobileOfficialAppsConPostingStat$ChangeOwnerEvent = null;
        new bjc(c2, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsConPostingStat$TypePostingItem(c2, mobileOfficialAppsConPostingStat$ChangeOwnerEvent, hVar.a, hVar.b, hVar.c, hVar.d, null, null, null, null, hVar.f, hVar.g, null, null, hVar.h, null, hVar.e, null, num, valueOf, null, hVar.i, null, null, 13808578, null), 2)).q();
    }

    public static final MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint k(ghc0 ghc0Var, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
        switch (k.$EnumSwitchMapping$0[postingMetricsCreationEntryPoint.ordinal()]) {
            case 1:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_PLUS_BUTTON;
            case 2:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.GROUP_WALL_BUTTON;
            case 3:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.PROFILE_PLUS_BUTTON;
            case 4:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.PROFILE_WALL_BUTTON;
            case 5:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.CHANNEL_WRITE_BAR_BUTTON;
            case 6:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.POST_THREE_DOT_MENU_EDIT_ITEM;
            case 7:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_EDIT_DRAFT;
            case 8:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_EDIT_DRAFT_THREE_DOTS;
            case 9:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_DELETE_DRAFT;
            case 10:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_DELETE_DRAFT_THREE_DOTS;
            case 11:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.LIST_EDIT_DRAFT;
            case 12:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.LIST_EDIT_DRAFT_THREE_DOTS;
            case 13:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.COMMUNITY_CREATION_ONBOARDING_BLOCK;
            default:
                return null;
        }
    }

    @Override // xsna.fhc0
    public final f a() {
        return (f) this.a.getValue();
    }

    @Override // xsna.fhc0
    public final a b() {
        return (a) this.c.getValue();
    }

    @Override // xsna.fhc0
    public final void c(UserId userId) {
        c cVar = this.i;
        Integer num = cVar.a;
        cVar.getClass();
        this.i = new c(userId, num);
    }

    @Override // xsna.fhc0
    public final i d() {
        return (i) this.e.getValue();
    }

    @Override // xsna.fhc0
    public final e e() {
        return (e) this.f.getValue();
    }

    @Override // xsna.fhc0
    public final d f() {
        return (d) this.h.getValue();
    }

    @Override // xsna.fhc0
    public final g g() {
        return (g) this.g.getValue();
    }

    @Override // xsna.fhc0
    public final b h() {
        return (b) this.b.getValue();
    }

    @Override // xsna.fhc0
    public final void i(Integer num) {
        c cVar = this.i;
        UserId userId = cVar.b;
        cVar.getClass();
        this.i = new c(userId, num);
    }

    @Override // xsna.fhc0
    public final j x() {
        return (j) this.d.getValue();
    }
}
