package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.api.analytics.PrivacyPostTypeMetricModel;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$AddAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$AttachmentInfo;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ClickAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$CropPhotoClickEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$CropPhotoEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$EditAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PhotoAdditionalInfo;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PhotoSizes;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PrimaryModeEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$RemoteDraftEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$SettingsEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$VkTicket;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.ibc0;

/* compiled from: PostingAnalyticsImpl.kt */
/* loaded from: classes4.dex */
public final class mbc0 implements ibc0 {
    public final bpn0 b = new bpn0(new e550(this, 12));
    public final bpn0 c = new bpn0(new rka0(this, 5));
    public final bpn0 d = new bpn0(new iia0(this, 7));
    public final bpn0 e = new bpn0(new lbc0(this, 0));
    public final bpn0 f = new bpn0(new m130(this, 23));
    public final bpn0 g = new bpn0(new p5y(this, 25));
    public b h = new b(0);

    /* compiled from: PostingAnalyticsImpl.kt */
    public final class a implements ibc0.b {
        public a() {
        }

        public static void O(a aVar, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType addAttachmentEventType, MobileOfficialAppsConPostingStat$AttachmentInfo mobileOfficialAppsConPostingStat$AttachmentInfo, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket, MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo, int i) {
            mbc0.this.c(new f(null, null, new MobileOfficialAppsConPostingStat$AddAttachmentEvent(addAttachmentEventType, (i & 4) != 0 ? null : mobileOfficialAppsConPostingStat$VkTicket, Collections.singletonList(mobileOfficialAppsConPostingStat$AttachmentInfo), (i & 8) == 0 ? mobileOfficialAppsConPostingStat$PhotoAdditionalInfo : null), null, null, null, null, kbc0.c(mbc0.this.h.c), null, null, 14331));
        }

        @Override // xsna.ibc0.b
        public final void A(PostingAttachmentInfo postingAttachmentInfo, o5a0 o5a0Var) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_MY_PHOTO, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.PHOTO), null, o5a0Var != null ? kbc0.d(o5a0Var) : null, 4);
        }

        @Override // xsna.ibc0.b
        public final void B(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.RETRY_UPLOAD_VIDEO, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.VIDEO), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void C(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_VIDEO, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.VIDEO), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void D() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_ACTION_BUTTON, null);
        }

        @Override // xsna.ibc0.b
        public final void E(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.REMEMBER_FOR_FUTURE_POSTS_ATTACH, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ACTION_BUTTON), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void F() {
            mbc0.a(mbc0.this, MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem.EventType.AUDIO_SNIPPET_OFF);
        }

        @Override // xsna.ibc0.b
        public final void G(PostingAttachmentInfo postingAttachmentInfo) {
            MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType addAttachmentEventType = MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_ACTION_BUTTON;
            MobileOfficialAppsConPostingStat$AttachmentInfo b = kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ACTION_BUTTON);
            String str = postingAttachmentInfo.e;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = str != null ? new CommonStat$TypeTrackCodeItem(str) : null;
            String str2 = postingAttachmentInfo.f;
            O(this, addAttachmentEventType, b, new MobileOfficialAppsConPostingStat$VkTicket(commonStat$TypeTrackCodeItem, str2 != null ? new CommonStat$TypeTrackCodeItem(str2) : null), null, 8);
        }

        @Override // xsna.ibc0.b
        public final void H(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.DELETE_ATTACH_POLL, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.POLL), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void I(PostingAttachmentInfo postingAttachmentInfo, boolean z) {
            O(this, z ? MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_PLACE_RECOM : MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_PLACE, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.GEO_PLACE), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void J(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.PRODUCT_DELETE, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.PHOTO), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void K(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.PRODUCT_SELECT, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.PHOTO), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void L(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.DELETE_ATTACH_PLACE, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.GEO_PLACE), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void M() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_MY_VIDEO, null);
        }

        @Override // xsna.ibc0.b
        public final void N(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_POLL, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.POLL), null, null, 12);
        }

        public final void P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType clickAttachmentEventType, MobileOfficialAppsConPostingStat$AttachmentInfo mobileOfficialAppsConPostingStat$AttachmentInfo) {
            MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent = new MobileOfficialAppsConPostingStat$ClickAttachmentEvent(clickAttachmentEventType, null, mobileOfficialAppsConPostingStat$AttachmentInfo != null ? Collections.singletonList(mobileOfficialAppsConPostingStat$AttachmentInfo) : null, 2, null);
            mbc0 mbc0Var = mbc0.this;
            mbc0Var.c(new f(null, mobileOfficialAppsConPostingStat$ClickAttachmentEvent, null, null, null, null, null, kbc0.c(mbc0Var.h.c), null, null, 14333));
        }

        @Override // xsna.ibc0.b
        public final void a() {
            mbc0.a(mbc0.this, MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem.EventType.AUDIO_SNIPPET_ON);
        }

        @Override // xsna.ibc0.b
        public final void b() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.MUSIC_PREVIEW, null);
        }

        @Override // xsna.ibc0.b
        public final void c(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_PLAYLISTS, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO_PLAYLIST), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void d(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_MUSIC, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void e() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_GALLERY, null);
        }

        @Override // xsna.ibc0.b
        public final void f() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_PICKER, null);
        }

        @Override // xsna.ibc0.b
        public final void g() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_PLACE, null);
        }

        @Override // xsna.ibc0.b
        public final void h(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_MY_VIDEO, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.VIDEO), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void i() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_PHOTO, null);
        }

        @Override // xsna.ibc0.b
        public final void j() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_MUSIC, null);
        }

        @Override // xsna.ibc0.b
        public final void k() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.PRODUCT_PHOTO_SELECT, null);
        }

        @Override // xsna.ibc0.b
        public final void l(PostingAttachmentInfo postingAttachmentInfo, o5a0 o5a0Var) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.DELETE_ATTACH_PHOTO, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.PHOTO), null, o5a0Var != null ? kbc0.d(o5a0Var) : null, 4);
        }

        @Override // xsna.ibc0.b
        public final void m(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.REMEMBER_FOR_FUTURE_POSTS_DELETE, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ACTION_BUTTON), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void n() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_PRODUCT, null);
        }

        @Override // xsna.ibc0.b
        public final void o(PostingAttachmentInfo postingAttachmentInfo, o5a0 o5a0Var) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.ATTACH_PHOTO, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.PHOTO), null, kbc0.d(o5a0Var), 4);
        }

        @Override // xsna.ibc0.b
        public final void p() {
            MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent = new MobileOfficialAppsConPostingStat$EditAttachmentEvent(MobileOfficialAppsConPostingStat$EditAttachmentEvent.EditAttachmentEventType.EDIT_PHOTO);
            mbc0 mbc0Var = mbc0.this;
            mbc0Var.c(new f(null, null, null, mobileOfficialAppsConPostingStat$EditAttachmentEvent, null, null, null, kbc0.c(mbc0Var.h.c), null, null, 14327));
        }

        @Override // xsna.ibc0.b
        public final void q() {
            mbc0.a(mbc0.this, MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem.EventType.START_LISTEN_AUDIO_SNIPPET);
        }

        @Override // xsna.ibc0.b
        public final void r() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_MY_PHOTO, null);
        }

        @Override // xsna.ibc0.b
        public final void s() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_POLL, null);
        }

        @Override // xsna.ibc0.b
        public final void t(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.DELETE_ATTACH_MY_VIDEO, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.VIDEO), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void u(PostingAttachmentInfo postingAttachmentInfo) {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.TRANSITION_TO_BUTTON_DETAILS, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ACTION_BUTTON));
        }

        @Override // xsna.ibc0.b
        public final void v(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.DELETE_ATTACH_ALBUM, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.AUDIO_PLAYLIST), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void w() {
            P(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.PRODUCT_PHOTO_SWIPE, null);
        }

        @Override // xsna.ibc0.b
        public final void x() {
            mbc0.a(mbc0.this, MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem.EventType.OPEN_MODAL_AUDIO_SNIPPET);
        }

        @Override // xsna.ibc0.b
        public final void y(PostingAttachmentInfo postingAttachmentInfo) {
            O(this, MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.RETRY_UPLOAD_PHOTO, kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.PHOTO), null, null, 12);
        }

        @Override // xsna.ibc0.b
        public final void z(PostingAttachmentInfo postingAttachmentInfo) {
            MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType addAttachmentEventType = MobileOfficialAppsConPostingStat$AddAttachmentEvent.AddAttachmentEventType.DELETE_ACTION_BUTTON;
            MobileOfficialAppsConPostingStat$AttachmentInfo b = kbc0.b(postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.ACTION_BUTTON);
            String str = postingAttachmentInfo.e;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = str != null ? new CommonStat$TypeTrackCodeItem(str) : null;
            String str2 = postingAttachmentInfo.f;
            O(this, addAttachmentEventType, b, new MobileOfficialAppsConPostingStat$VkTicket(commonStat$TypeTrackCodeItem, str2 != null ? new CommonStat$TypeTrackCodeItem(str2) : null), null, 8);
        }
    }

    /* compiled from: PostingAnalyticsImpl.kt */
    public static final class b {
        public final Integer a;
        public final UserId b;
        public final PostingMetricEntryPoint c;
        public final Integer d;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            UserId userId = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31)) * 31;
            Integer num2 = this.d;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BasePostingMetrics(postId=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", creationEntryPoint=");
            sb.append(this.c);
            sb.append(", creationSessionId=");
            return uqi.b(sb, this.d, ')');
        }

        public b(UserId userId, PostingMetricEntryPoint postingMetricEntryPoint, Integer num, Integer num2) {
            this.a = num;
            this.b = userId;
            this.c = postingMetricEntryPoint;
            this.d = num2;
        }

        public /* synthetic */ b(int i) {
            this(null, PostingMetricEntryPoint.Other, null, null);
        }
    }

    /* compiled from: PostingAnalyticsImpl.kt */
    public final class c implements ibc0.c {
        public c() {
        }

        @Override // xsna.ibc0.c
        public final void a() {
            e(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.OPEN);
        }

        @Override // xsna.ibc0.c
        public final void b() {
            e(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.GO_STAGE_2);
        }

        @Override // xsna.ibc0.c
        public final void c() {
            e(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.GO_STAGE_1);
        }

        @Override // xsna.ibc0.c
        public final void close() {
            e(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLOSE);
        }

        @Override // xsna.ibc0.c
        public final void d() {
            e(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.EXIT_POSTING);
        }

        public final void e(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType navigationEventType) {
            MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent = new MobileOfficialAppsConPostingStat$NavigationEvent(navigationEventType);
            mbc0 mbc0Var = mbc0.this;
            mbc0Var.c(new f(mobileOfficialAppsConPostingStat$NavigationEvent, null, null, null, null, null, null, kbc0.c(mbc0Var.h.c), null, null, 14334));
        }
    }

    /* compiled from: PostingAnalyticsImpl.kt */
    public final class d implements ibc0.d {
        public d() {
        }

        @Override // xsna.ibc0.d
        public final void a() {
            f(MobileOfficialAppsConPostingStat$CropPhotoClickEvent.CropPhotoClickEventType.GET_MORE_INFO);
        }

        @Override // xsna.ibc0.d
        public final void b() {
            f(MobileOfficialAppsConPostingStat$CropPhotoClickEvent.CropPhotoClickEventType.OPEN_CROP_EDITOR);
        }

        @Override // xsna.ibc0.d
        public final void c() {
            f(MobileOfficialAppsConPostingStat$CropPhotoClickEvent.CropPhotoClickEventType.CLOSE_CROP_EDITOR);
        }

        @Override // xsna.ibc0.d
        public final void d() {
            MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent = new MobileOfficialAppsConPostingStat$EditAttachmentEvent(MobileOfficialAppsConPostingStat$EditAttachmentEvent.EditAttachmentEventType.OPEN_EDITOR);
            mbc0 mbc0Var = mbc0.this;
            mbc0Var.c(new f(null, null, null, mobileOfficialAppsConPostingStat$EditAttachmentEvent, null, null, null, kbc0.c(mbc0Var.h.c), null, null, 14327));
        }

        @Override // xsna.ibc0.d
        public final void e(aik aikVar) {
            boolean z = aikVar.a;
            MobileOfficialAppsConPostingStat$CropPhotoEvent.CropPhotoEventType cropPhotoEventType = MobileOfficialAppsConPostingStat$CropPhotoEvent.CropPhotoEventType.CROP_PHOTO;
            boolean z2 = aikVar.b;
            MobileOfficialAppsConPostingStat$CropPhotoEvent.EventSubtype eventSubtype = (z2 && z) ? MobileOfficialAppsConPostingStat$CropPhotoEvent.EventSubtype.MOVED_ZOOMED : z ? MobileOfficialAppsConPostingStat$CropPhotoEvent.EventSubtype.MOVED : z2 ? MobileOfficialAppsConPostingStat$CropPhotoEvent.EventSubtype.ZOOMED : null;
            String str = aikVar.c;
            String str2 = aikVar.d;
            if (str2 == null) {
                str2 = "";
            }
            MobileOfficialAppsConPostingStat$CropPhotoEvent mobileOfficialAppsConPostingStat$CropPhotoEvent = new MobileOfficialAppsConPostingStat$CropPhotoEvent(cropPhotoEventType, eventSubtype, new MobileOfficialAppsConPostingStat$PhotoSizes(str, str2));
            mbc0 mbc0Var = mbc0.this;
            mbc0Var.c(new f(null, null, null, null, null, null, null, kbc0.c(mbc0Var.h.c), null, mobileOfficialAppsConPostingStat$CropPhotoEvent, 6143));
        }

        public final void f(MobileOfficialAppsConPostingStat$CropPhotoClickEvent.CropPhotoClickEventType cropPhotoClickEventType) {
            MobileOfficialAppsConPostingStat$CropPhotoClickEvent mobileOfficialAppsConPostingStat$CropPhotoClickEvent = new MobileOfficialAppsConPostingStat$CropPhotoClickEvent(cropPhotoClickEventType);
            mbc0 mbc0Var = mbc0.this;
            mbc0Var.c(new f(null, null, null, null, null, null, null, kbc0.c(mbc0Var.h.c), mobileOfficialAppsConPostingStat$CropPhotoClickEvent, null, 10239));
        }
    }

    /* compiled from: PostingAnalyticsImpl.kt */
    public final class e implements ibc0.e {
        public e() {
        }

        public static void c(e eVar, MobileOfficialAppsConPostingStat$RemoteDraftEvent.RemoteDraftEventType remoteDraftEventType) {
            mbc0 mbc0Var = mbc0.this;
            mbc0Var.c(new f(null, null, null, null, null, null, new MobileOfficialAppsConPostingStat$RemoteDraftEvent(remoteDraftEventType), kbc0.c(mbc0Var.h.c), null, null, 13567));
        }

        @Override // xsna.ibc0.e
        public final void a() {
            c(this, MobileOfficialAppsConPostingStat$RemoteDraftEvent.RemoteDraftEventType.OPEN_DRAFTS_LIST);
        }

        @Override // xsna.ibc0.e
        public final void b() {
            c(this, MobileOfficialAppsConPostingStat$RemoteDraftEvent.RemoteDraftEventType.EXIT_DRAFT);
        }
    }

    /* compiled from: PostingAnalyticsImpl.kt */
    public static final class f {
        public final MobileOfficialAppsConPostingStat$NavigationEvent a;
        public final MobileOfficialAppsConPostingStat$ClickAttachmentEvent b;
        public final MobileOfficialAppsConPostingStat$AddAttachmentEvent c;
        public final MobileOfficialAppsConPostingStat$EditAttachmentEvent d;
        public final MobileOfficialAppsConPostingStat$SettingsEvent e;
        public final MobileOfficialAppsConPostingStat$PrimaryModeEvent f;
        public final MobileOfficialAppsConPostingStat$RemoteDraftEvent g;
        public final MobileOfficialAppsConPostingStat$TypePostingItem.PostType h;
        public final MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint i;
        public final MobileOfficialAppsConPostingStat$CropPhotoClickEvent j;
        public final MobileOfficialAppsConPostingStat$CropPhotoEvent k;

        public f(MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent, MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent, MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent, MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent, MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent, MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent, MobileOfficialAppsConPostingStat$RemoteDraftEvent mobileOfficialAppsConPostingStat$RemoteDraftEvent, MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint, MobileOfficialAppsConPostingStat$CropPhotoClickEvent mobileOfficialAppsConPostingStat$CropPhotoClickEvent, MobileOfficialAppsConPostingStat$CropPhotoEvent mobileOfficialAppsConPostingStat$CropPhotoEvent, int i) {
            mobileOfficialAppsConPostingStat$NavigationEvent = (i & 1) != 0 ? null : mobileOfficialAppsConPostingStat$NavigationEvent;
            mobileOfficialAppsConPostingStat$ClickAttachmentEvent = (i & 2) != 0 ? null : mobileOfficialAppsConPostingStat$ClickAttachmentEvent;
            mobileOfficialAppsConPostingStat$AddAttachmentEvent = (i & 4) != 0 ? null : mobileOfficialAppsConPostingStat$AddAttachmentEvent;
            mobileOfficialAppsConPostingStat$EditAttachmentEvent = (i & 8) != 0 ? null : mobileOfficialAppsConPostingStat$EditAttachmentEvent;
            mobileOfficialAppsConPostingStat$SettingsEvent = (i & 16) != 0 ? null : mobileOfficialAppsConPostingStat$SettingsEvent;
            mobileOfficialAppsConPostingStat$PrimaryModeEvent = (i & 32) != 0 ? null : mobileOfficialAppsConPostingStat$PrimaryModeEvent;
            mobileOfficialAppsConPostingStat$RemoteDraftEvent = (i & 256) != 0 ? null : mobileOfficialAppsConPostingStat$RemoteDraftEvent;
            mobileOfficialAppsConPostingStat$CropPhotoClickEvent = (i & 4096) != 0 ? null : mobileOfficialAppsConPostingStat$CropPhotoClickEvent;
            mobileOfficialAppsConPostingStat$CropPhotoEvent = (i & 8192) != 0 ? null : mobileOfficialAppsConPostingStat$CropPhotoEvent;
            this.a = mobileOfficialAppsConPostingStat$NavigationEvent;
            this.b = mobileOfficialAppsConPostingStat$ClickAttachmentEvent;
            this.c = mobileOfficialAppsConPostingStat$AddAttachmentEvent;
            this.d = mobileOfficialAppsConPostingStat$EditAttachmentEvent;
            this.e = mobileOfficialAppsConPostingStat$SettingsEvent;
            this.f = mobileOfficialAppsConPostingStat$PrimaryModeEvent;
            this.g = mobileOfficialAppsConPostingStat$RemoteDraftEvent;
            this.h = null;
            this.i = creationEntryPoint;
            this.j = mobileOfficialAppsConPostingStat$CropPhotoClickEvent;
            this.k = mobileOfficialAppsConPostingStat$CropPhotoEvent;
        }
    }

    /* compiled from: PostingAnalyticsImpl.kt */
    public final class g implements ibc0.f {
        public g() {
        }

        @Override // xsna.ibc0.f
        public final void a() {
            MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent = new MobileOfficialAppsConPostingStat$PrimaryModeEvent(MobileOfficialAppsConPostingStat$PrimaryModeEvent.PrimaryModeEventType.RATIO_CHANGE, null, 2, null);
            mbc0 mbc0Var = mbc0.this;
            mbc0Var.c(new f(null, null, null, null, null, mobileOfficialAppsConPostingStat$PrimaryModeEvent, null, kbc0.c(mbc0Var.h.c), null, null, 14303));
        }
    }

    /* compiled from: PostingAnalyticsImpl.kt */
    public final class h implements ibc0.g {

        /* compiled from: PostingAnalyticsImpl.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PrivacyPostTypeMetricModel.values().length];
                try {
                    iArr[PrivacyPostTypeMetricModel.ALL_USERS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PrivacyPostTypeMetricModel.BEST_FRIENDS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PrivacyPostTypeMetricModel.FRIENDS_ONLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public h() {
        }

        public static void m(h hVar, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType settingsEventType, Long l, MobileOfficialAppsConPostingStat$SettingsEvent.PostPrivacy postPrivacy, Integer num, Boolean bool, Boolean bool2, List list, Boolean bool3, int i) {
            Long l2 = (i & 4) != 0 ? null : l;
            mbc0.this.c(new f(null, null, null, null, new MobileOfficialAppsConPostingStat$SettingsEvent(settingsEventType, (i & 8) != 0 ? null : postPrivacy, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3, null, l2, (i & 128) != 0 ? null : list, null, 512, null), null, null, kbc0.c(mbc0.this.h.c), null, null, 14319));
        }

        @Override // xsna.ibc0.g
        public final void a(boolean z, boolean z2) {
            m(this, z ? z2 ? MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.TO_CAROUSEL : MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.TO_CAROUSEL_AUTO : MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.TO_GRID, null, null, null, null, null, null, null, 510);
        }

        @Override // xsna.ibc0.g
        public final void b(PrivacyPostTypeMetricModel privacyPostTypeMetricModel) {
            MobileOfficialAppsConPostingStat$SettingsEvent.PostPrivacy postPrivacy;
            int i = a.$EnumSwitchMapping$0[privacyPostTypeMetricModel.ordinal()];
            if (i == 1) {
                postPrivacy = MobileOfficialAppsConPostingStat$SettingsEvent.PostPrivacy.PUBLIC;
            } else if (i == 2) {
                postPrivacy = MobileOfficialAppsConPostingStat$SettingsEvent.PostPrivacy.BEST_FRIENDS_ONLY;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                postPrivacy = MobileOfficialAppsConPostingStat$SettingsEvent.PostPrivacy.FRIENDS_ONLY;
            }
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_PRIVACY, null, postPrivacy, null, null, null, null, null, 502);
        }

        @Override // xsna.ibc0.g
        public final void c(boolean z) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_DONUT_PRIVACY, null, null, Integer.valueOf(z ? 1 : 0), null, null, null, null, 494);
        }

        @Override // xsna.ibc0.g
        public final void d() {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.OPEN_PRIVACY, null, null, null, null, null, null, null, 510);
        }

        @Override // xsna.ibc0.g
        public final void e() {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.OPEN_POSTPONED, null, null, null, null, null, null, null, 510);
        }

        @Override // xsna.ibc0.g
        public final void f(boolean z) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_STORY, null, null, null, null, null, null, Boolean.valueOf(z), 254);
        }

        @Override // xsna.ibc0.g
        public final void g() {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CLICK_TO_ADVERTISING_MARK, null, null, null, null, null, null, null, 510);
        }

        @Override // xsna.ibc0.g
        public final void h(boolean z) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_COMMENTS, null, null, null, Boolean.valueOf(z), null, null, null, 478);
        }

        @Override // xsna.ibc0.g
        public final void i(long j) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_POSTPONED, Long.valueOf(j), null, null, null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
        }

        @Override // xsna.ibc0.g
        public final void j(boolean z) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.CHANGE_NOTIFICATION, null, null, null, null, Boolean.valueOf(z), null, null, 446);
        }

        @Override // xsna.ibc0.g
        public final void k(ArrayList arrayList) {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.OPEN_MODAL_COOWNERS, null, null, null, null, null, arrayList, null, 382);
        }

        @Override // xsna.ibc0.g
        public final void l() {
            m(this, MobileOfficialAppsConPostingStat$SettingsEvent.SettingsEventType.OPEN_SETTINGS, null, null, null, null, null, null, null, 510);
        }
    }

    public static final void a(mbc0 mbc0Var, MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem.EventType eventType) {
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_MUSIC, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem(eventType), 2)).q();
    }

    @Override // xsna.ibc0
    public final String b() {
        MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint c2 = kbc0.c(this.h.c);
        if (c2 != null) {
            return c2.name().toLowerCase(Locale.ROOT);
        }
        return null;
    }

    public final void c(f fVar) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        UserId userId = this.h.b;
        Long valueOf = userId != null ? Long.valueOf(userId.b) : null;
        b bVar = this.h;
        Integer num = bVar.a;
        MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent = fVar.a;
        MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent = fVar.c;
        MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent = fVar.d;
        MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent = fVar.b;
        MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent = fVar.e;
        MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent = fVar.f;
        MobileOfficialAppsConPostingStat$RemoteDraftEvent mobileOfficialAppsConPostingStat$RemoteDraftEvent = fVar.g;
        MobileOfficialAppsConPostingStat$TypePostingItem.PostType postType = fVar.h;
        MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint = fVar.i;
        new bjc(c2, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsConPostingStat$TypePostingItem(c2, null, mobileOfficialAppsConPostingStat$NavigationEvent, mobileOfficialAppsConPostingStat$ClickAttachmentEvent, mobileOfficialAppsConPostingStat$AddAttachmentEvent, mobileOfficialAppsConPostingStat$SettingsEvent, null, fVar.k, fVar.j, null, null, null, null, mobileOfficialAppsConPostingStat$RemoteDraftEvent, null, null, mobileOfficialAppsConPostingStat$PrimaryModeEvent, mobileOfficialAppsConPostingStat$EditAttachmentEvent, num, valueOf, postType, creationEntryPoint, null, bVar.d != null ? Long.valueOf(r2.intValue()) : null, 4231746, null), 2)).q();
    }

    @Override // xsna.ibc0
    public final ibc0.f d() {
        return (ibc0.f) this.e.getValue();
    }

    @Override // xsna.ibc0
    public final void e(PostingMetricEntryPoint postingMetricEntryPoint, UserId userId, Integer num) {
        this.h = new b(userId, postingMetricEntryPoint, num, Integer.valueOf(qz9.b(System.currentTimeMillis()).l(0, Integer.MAX_VALUE)));
    }

    @Override // xsna.ibc0
    public final String f() {
        UiTracker uiTracker = UiTracker.a;
        return UiTracker.d();
    }

    @Override // xsna.ibc0
    public final Integer g() {
        return this.h.d;
    }

    @Override // xsna.ibc0
    public final ibc0.c h() {
        return (ibc0.c) this.c.getValue();
    }

    @Override // xsna.ibc0
    public final ibc0.e i() {
        return (ibc0.e) this.f.getValue();
    }

    @Override // xsna.ibc0
    public final ibc0.d j() {
        return (ibc0.d) this.g.getValue();
    }

    @Override // xsna.ibc0
    public final ibc0.b u() {
        return (ibc0.b) this.b.getValue();
    }

    @Override // xsna.ibc0
    public final ibc0.g x() {
        return (ibc0.g) this.d.getValue();
    }
}
