package xsna;

import android.os.Bundle;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$SharingConversationItem;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$SharingItemType;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeModalSharingClick;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeModalSharingClose;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeModalSharingOpen;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoModalSharingClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAwayItem;
import com.vk.stat.scheme.SchemeStat$TypeAwayMarket;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeShareItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import xsna.kbj0;
import xsna.qfq;

/* compiled from: SharingAnalyticsDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class ibj0 implements gbj0, w8i {
    public final boolean b;
    public final boolean c;
    public final AttachmentInfo d;
    public final int e;
    public final Integer f;
    public final MobileOfficialAppsSharingStat$TypeEventSource g;
    public final Object h;
    public final SchemeStat$EventItem i;
    public SchemeStat$TypeShareItem j;
    public final MobileOfficialAppsSharingStat$SharingItemType k;
    public final Object l;

    /* compiled from: SharingAnalyticsDelegateImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ScreenModeVideoStatMapper.UnifiedStatScreenMode.values().length];
            try {
                iArr[ScreenModeVideoStatMapper.UnifiedStatScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenModeVideoStatMapper.UnifiedStatScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenModeVideoStatMapper.UnifiedStatScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenModeVideoStatMapper.UnifiedStatScreenMode.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Peer.Type.values().length];
            try {
                iArr2[Peer.Type.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Peer.Type.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Peer.Type.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ibj0(boolean z, boolean z2, AttachmentInfo attachmentInfo, int i, Integer num, MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource) {
        SchemeStat$EventItem.Type type;
        this.b = z;
        this.c = z2;
        this.d = attachmentInfo;
        this.e = i;
        this.f = num;
        this.g = mobileOfficialAppsSharingStat$TypeEventSource;
        hbj0 hbj0Var = new hbj0(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, hbj0Var);
        int i2 = attachmentInfo.b;
        Bundle bundle = attachmentInfo.f;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType = null;
        if (i2 == 30) {
            type = SchemeStat$EventItem.Type.VIDEO;
        } else if (i2 == 31) {
            type = SchemeStat$EventItem.Type.POST;
        } else if (i2 == 39) {
            type = SchemeStat$EventItem.Type.CHAT_SCREENSHOT;
        } else if (i2 != 41) {
            switch (i2) {
                case 1:
                    type = SchemeStat$EventItem.Type.ALBUM;
                    break;
                case 2:
                    type = SchemeStat$EventItem.Type.APP;
                    break;
                case 3:
                    type = SchemeStat$EventItem.Type.ARTICLE;
                    break;
                case 4:
                    type = SchemeStat$EventItem.Type.ARTIST;
                    break;
                case 5:
                    type = SchemeStat$EventItem.Type.MUSIC;
                    break;
                case 6:
                    type = SchemeStat$EventItem.Type.CHRONICLE;
                    break;
                case 7:
                    type = SchemeStat$EventItem.Type.CLIP;
                    break;
                case 8:
                    type = SchemeStat$EventItem.Type.DOCUMENT;
                    break;
                case 9:
                    type = SchemeStat$EventItem.Type.EVENT;
                    break;
                case 10:
                    type = SchemeStat$EventItem.Type.GRAFFITI;
                    break;
                case 11:
                    int i3 = bundle.getInt("type_link", 0);
                    if (i3 == 1) {
                        type = SchemeStat$EventItem.Type.PROFILE_QUESTION;
                        break;
                    } else if (i3 == 2) {
                        type = SchemeStat$EventItem.Type.COMMENT;
                        break;
                    } else {
                        type = SchemeStat$EventItem.Type.LINK;
                        break;
                    }
                case 12:
                    type = SchemeStat$EventItem.Type.MARKET;
                    break;
                case 13:
                    type = SchemeStat$EventItem.Type.MARKET_ITEM_ALBUM;
                    break;
                case 14:
                    type = SchemeStat$EventItem.Type.MINI_APP;
                    break;
                case 15:
                    type = SchemeStat$EventItem.Type.NARRATIVE;
                    break;
                case 16:
                    type = SchemeStat$EventItem.Type.NOTE;
                    break;
                case 17:
                    type = SchemeStat$EventItem.Type.PAGE;
                    break;
                case 18:
                case 22:
                    type = SchemeStat$EventItem.Type.PHOTO;
                    break;
                case 19:
                    type = SchemeStat$EventItem.Type.PLAYLIST;
                    break;
                case 20:
                    type = SchemeStat$EventItem.Type.PODCAST;
                    break;
                case 21:
                    type = SchemeStat$EventItem.Type.POLL;
                    break;
                default:
                    switch (i2) {
                        case 24:
                            type = SchemeStat$EventItem.Type.PROFILE;
                            break;
                        case 25:
                            type = SchemeStat$EventItem.Type.STICKERS;
                            break;
                        case 26:
                            type = SchemeStat$EventItem.Type.STORY;
                            break;
                        default:
                            type = null;
                            break;
                    }
            }
        } else {
            type = SchemeStat$EventItem.Type.MATCHED_PLAYLIST;
        }
        this.i = new SchemeStat$EventItem(type == null ? SchemeStat$EventItem.Type.CLICK_ITEM : type, Long.valueOf(attachmentInfo.d), Long.valueOf(attachmentInfo.c), attachmentInfo.zb(), attachmentInfo.r(), null, 32, null);
        int i4 = bundle.getInt("type_link", 0);
        if (i4 == 3) {
            mobileOfficialAppsSharingStat$SharingItemType = MobileOfficialAppsSharingStat$SharingItemType.EPISODE;
        } else if (i4 == 4) {
            mobileOfficialAppsSharingStat$SharingItemType = MobileOfficialAppsSharingStat$SharingItemType.CALL_LONG;
        } else if (i4 == 5) {
            mobileOfficialAppsSharingStat$SharingItemType = MobileOfficialAppsSharingStat$SharingItemType.CALL_SHORT;
        }
        this.k = mobileOfficialAppsSharingStat$SharingItemType;
        this.l = msy.a(lazyThreadSafetyMode, new xqf0(2));
        m(z);
    }

    public static MobileOfficialAppsSharingStat$TypeModalSharingClick.ScreenMode f(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        int i = a.$EnumSwitchMapping$0[unifiedStatScreenMode.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsSharingStat$TypeModalSharingClick.ScreenMode.DISCOVERY;
        }
        if (i == 2) {
            return MobileOfficialAppsSharingStat$TypeModalSharingClick.ScreenMode.FULLSCREEN_LANDSCAPE;
        }
        if (i == 3) {
            return MobileOfficialAppsSharingStat$TypeModalSharingClick.ScreenMode.FULLSCREEN_PORTRAIT;
        }
        if (i == 4) {
            return MobileOfficialAppsSharingStat$TypeModalSharingClick.ScreenMode.PREVIEW;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void l(ibj0 ibj0Var, SchemeStat$TypeShareItem.ShareType shareType, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype eventSubtype, int i) {
        if ((i & 1) != 0) {
            shareType = null;
        }
        ibj0Var.k(shareType, eventSubtype, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gbj0
    public final void a() {
        SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(this.i, null, new MobileOfficialAppsSharingStat$TypeModalSharingClose(MobileOfficialAppsSharingStat$TypeModalSharingClose.Event.MODAL_SHARING_CLOSE, null, 2, 0 == true ? 1 : 0));
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), a2).q();
    }

    @Override // xsna.gbj0
    public final void b(Target target, Integer num) {
        k(SchemeStat$TypeShareItem.ShareType.MESSAGE, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SHARE_TO_MESSAGE_UNDO, target, Integer.valueOf(num.intValue() + 1));
    }

    @Override // xsna.gbj0
    public final void c(r9l r9lVar) {
        if (r9lVar instanceof bcj0) {
            if (!this.b) {
                m(true);
            }
            i(SchemeStat$TypeShareItem.ShareType.EXTERNAL_DIALOG, null);
        }
        r9lVar.b(new jbj0(2, this, ibj0.class, "onActionClick", "onActionClick(ILjava/lang/String;)V", 0));
    }

    @Override // xsna.gbj0
    public final void d(Target target, Integer num) {
        k(SchemeStat$TypeShareItem.ShareType.MESSAGE, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SHARE_TO_MESSAGE, target, Integer.valueOf(num.intValue() + 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gbj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(HashMap hashMap) {
        MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType conversationType;
        MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType conversationType2;
        MobileOfficialAppsSharingStat$SharingConversationItem mobileOfficialAppsSharingStat$SharingConversationItem;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(hashMap.size()));
        for (Map.Entry entry : hashMap.entrySet()) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getKey()).intValue() + 1), entry.getValue());
        }
        SchemeStat$TypeShareItem.ShareType shareType = SchemeStat$TypeShareItem.ShareType.MESSAGE;
        MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype eventSubtype = MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SHARE_TO_MESSAGE;
        if (shareType != null) {
            this.j = new SchemeStat$TypeShareItem(shareType, null, this.i, null, null, 24, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            Target target = (Target) entry2.getValue();
            Dialog dialog = target.i;
            Peer.Type bc = dialog != null ? dialog.bc() : null;
            int i = bc == null ? -1 : a.$EnumSwitchMapping$1[bc.ordinal()];
            if (i == 1) {
                conversationType = MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType.USER;
            } else if (i == 2) {
                conversationType = MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType.COMMUNITY;
            } else if (i != 3) {
                conversationType2 = null;
                mobileOfficialAppsSharingStat$SharingConversationItem = conversationType2 != null ? new MobileOfficialAppsSharingStat$SharingConversationItem(target.c.b, conversationType2, intValue) : null;
                if (mobileOfficialAppsSharingStat$SharingConversationItem == null) {
                    arrayList.add(mobileOfficialAppsSharingStat$SharingConversationItem);
                }
            } else {
                conversationType = MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType.CHAT;
            }
            conversationType2 = conversationType;
            if (conversationType2 != null) {
            }
            if (mobileOfficialAppsSharingStat$SharingConversationItem == null) {
            }
        }
        MobileOfficialAppsSharingStat$TypeModalSharingClick.Event event = MobileOfficialAppsSharingStat$TypeModalSharingClick.Event.MODAL_SHARING_CLICK;
        ScreenModeVideoStatMapper screenModeVideoStatMapper = (ScreenModeVideoStatMapper) this.l.getValue();
        AttachmentInfo attachmentInfo = this.d;
        h(MobileOfficialAppsSharingStat$TypeModalSharingClick.a.a(event, eventSubtype, null, null, this.k, arrayList, (MobileOfficialAppsSharingStat$TypeModalSharingClick.ScreenMode) screenModeVideoStatMapper.a((int) attachmentInfo.d, attachmentInfo.c, new tq(this, 23)), null, VersionConstants.PRODUCT_MAJOR_VERSION));
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(int i, String str) {
        switch (i) {
            case 1:
                l(this, SchemeStat$TypeShareItem.ShareType.OWN_WALL, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.REPOST, 12);
                break;
            case 2:
                l(this, SchemeStat$TypeShareItem.ShareType.COMMUNITY_WALL, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.REPOST_COMMUNITY, 12);
                break;
            case 3:
                anm0 anm0Var = (anm0) this.h.getValue();
                MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.SHARE_TO_STORY;
                UiTracker uiTracker = UiTracker.a;
                anm0.d(anm0Var, eventType, UiTracker.c(), null, null, null, 60);
                l(this, SchemeStat$TypeShareItem.ShareType.STORY, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SHARE_TO_STORY, 12);
                break;
            case 4:
                j();
                break;
            case 5:
                i(SchemeStat$TypeShareItem.ShareType.EXTERNAL_DIALOG, str);
                break;
            case 6:
                l(this, null, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.CREATE_DUET, 13);
                break;
            case 7:
                l(this, SchemeStat$TypeShareItem.ShareType.CREATE_CHAT, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.CHAT_CREATE, 12);
                break;
            case 13:
                l(this, null, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.DOWNLOAD, 13);
                break;
            case 14:
                l(this, null, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SEND_TELEGRAM, 13);
                break;
            case 15:
                l(this, null, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SEND_WHATSAPP, 13);
                break;
            case 17:
                l(this, null, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SEND_TELEGRAM, 13);
                break;
            case 18:
                l(this, null, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SEND_MAX, 13);
                break;
        }
    }

    public final void h(SchemeStat$TypeClick.b bVar) {
        SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(this.i, this.f, bVar);
        UiTracker uiTracker = UiTracker.a;
        bjc bjcVar = new bjc(UiTracker.c(), a2);
        int i = this.d.b;
        bjcVar.c = i == 30 || i == 11;
        bjcVar.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(SchemeStat$TypeShareItem.ShareType shareType, String str) {
        this.j = null;
        SchemeStat$TypeAwayMarket schemeStat$TypeAwayMarket = null;
        SchemeStat$TypeAwayItem schemeStat$TypeAwayItem = new SchemeStat$TypeAwayItem(SchemeStat$TypeAwayItem.Type.TYPE_SHARE_ITEM, schemeStat$TypeAwayMarket, new SchemeStat$TypeShareItem(shareType, str, this.i, null, null, 24, null), 0 == true ? 1 : 0, 10, null);
        UiTracker uiTracker = UiTracker.a;
        UiTracker.h.a(new UiTracker.AwayParams(UiTracker.AwayParams.Type.EXTERNAL_APP, null, schemeStat$TypeAwayItem));
        if (str != null) {
            MobileOfficialAppsSharingStat$TypeModalSharingClick.Event event = MobileOfficialAppsSharingStat$TypeModalSharingClick.Event.MODAL_SHARING_EXTERNAL_CLICK;
            MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype eventSubtype = MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.SEND_SYSTEM;
            MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem = new MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem(str);
            ScreenModeVideoStatMapper screenModeVideoStatMapper = (ScreenModeVideoStatMapper) this.l.getValue();
            AttachmentInfo attachmentInfo = this.d;
            h(MobileOfficialAppsSharingStat$TypeModalSharingClick.a.a(event, eventSubtype, null, null, this.k, null, (MobileOfficialAppsSharingStat$TypeModalSharingClick.ScreenMode) screenModeVideoStatMapper.a((int) attachmentInfo.d, attachmentInfo.c, new sq(this, 22)), mobileOfficialAppsSharingStat$TypeSharingExternalInfoItem, 160));
            nr4.b().d(new kbj0.a(this.e, shareType, null, null, str, 44));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void j() {
        AttachmentInfo attachmentInfo = this.d;
        if (attachmentInfo.b != 30) {
            l(this, SchemeStat$TypeShareItem.ShareType.COPY_LINK, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype.COPY_LINK, 12);
            return;
        }
        this.j = new SchemeStat$TypeShareItem(SchemeStat$TypeShareItem.ShareType.COPY_LINK, null, this.i, null, null, 24, null);
        if (attachmentInfo.b != 30 || (!BuildInfo.q() && !BuildInfo.s())) {
            attachmentInfo = null;
        }
        h(MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.a.a(MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.Event.MODAL_SHARING_CLICK, MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.EventSubtype.COPY_LINK, this.k, attachmentInfo != null ? (MobileOfficialAppsVideoStat$TypeScreenMode) ((ScreenModeVideoStatMapper) this.l.getValue()).a((int) attachmentInfo.d, attachmentInfo.c, new qq(21)) : null, null, 204));
    }

    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void k(SchemeStat$TypeShareItem.ShareType shareType, MobileOfficialAppsSharingStat$TypeModalSharingClick.EventSubtype eventSubtype, Target target, Integer num) {
        Dialog dialog;
        UserId userId;
        if (shareType != null) {
            this.j = new SchemeStat$TypeShareItem(shareType, null, this.i, null, null, 24, null);
        }
        ArrayList arrayList = new ArrayList();
        MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType conversationType = null;
        Long valueOf = (target == null || (userId = target.c) == null) ? null : Long.valueOf(userId.b);
        Long valueOf2 = num != null ? Long.valueOf(num.intValue()) : null;
        Peer.Type bc = (target == null || (dialog = target.i) == null) ? null : dialog.bc();
        int i = bc == null ? -1 : a.$EnumSwitchMapping$1[bc.ordinal()];
        if (i == 1) {
            conversationType = MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType.USER;
        } else if (i == 2) {
            conversationType = MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType.COMMUNITY;
        } else if (i == 3) {
            conversationType = MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType.CHAT;
        }
        MobileOfficialAppsSharingStat$SharingConversationItem.ConversationType conversationType2 = conversationType;
        if (valueOf != null && conversationType2 != null && valueOf2 != null) {
            arrayList.add(new MobileOfficialAppsSharingStat$SharingConversationItem(valueOf.longValue(), conversationType2, valueOf2.longValue()));
        }
        MobileOfficialAppsSharingStat$TypeModalSharingClick.Event event = MobileOfficialAppsSharingStat$TypeModalSharingClick.Event.MODAL_SHARING_CLICK;
        ScreenModeVideoStatMapper screenModeVideoStatMapper = (ScreenModeVideoStatMapper) this.l.getValue();
        AttachmentInfo attachmentInfo = this.d;
        h(MobileOfficialAppsSharingStat$TypeModalSharingClick.a.a(event, eventSubtype, valueOf, num, this.k, arrayList, (MobileOfficialAppsSharingStat$TypeModalSharingClick.ScreenMode) screenModeVideoStatMapper.a((int) attachmentInfo.d, attachmentInfo.c, new jh(this, 22)), null, 128));
    }

    @Override // xsna.gbj0
    public final void k2(qfq qfqVar) {
        if (qfqVar instanceof qfq.d) {
            i(SchemeStat$TypeShareItem.ShareType.SMS, null);
        } else if (qfqVar instanceof qfq.c) {
            i(SchemeStat$TypeShareItem.ShareType.EMAIL, null);
        } else if (qfqVar instanceof qfq.b) {
            j();
        } else if (qfqVar instanceof qfq.e) {
            i(SchemeStat$TypeShareItem.ShareType.EXTERNAL_DIALOG, null);
        } else {
            if (!(qfqVar instanceof qfq.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i(SchemeStat$TypeShareItem.ShareType.EXTERNAL_APP, ((qfq.a) qfqVar).g);
        }
        s3q0 s3q0Var = s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void m(boolean z) {
        if (this.c) {
            return;
        }
        MobileOfficialAppsSharingStat$TypeModalSharingOpen.Event event = z ? MobileOfficialAppsSharingStat$TypeModalSharingOpen.Event.MODAL_SHARING_EXTERNAL_OPEN : MobileOfficialAppsSharingStat$TypeModalSharingOpen.Event.MODAL_SHARING_OPEN;
        AttachmentInfo attachmentInfo = this.d;
        if (attachmentInfo.b != 30 || (!BuildInfo.q() && !BuildInfo.s())) {
            attachmentInfo = null;
        }
        h(new MobileOfficialAppsSharingStat$TypeModalSharingOpen(event, this.k, attachmentInfo != null ? (MobileOfficialAppsSharingStat$TypeModalSharingOpen.ScreenMode) ((ScreenModeVideoStatMapper) this.l.getValue()).a((int) attachmentInfo.d, attachmentInfo.c, new rq(24)) : null, this.g));
    }

    @Override // xsna.gbj0
    public final void reset() {
        this.j = null;
    }

    @Override // xsna.gbj0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        SchemeStat$TypeShareItem schemeStat$TypeShareItem = this.j;
        if (schemeStat$TypeShareItem != null) {
            uiTrackingScreen.a(schemeStat$TypeShareItem);
        }
        this.j = null;
        uiTrackingScreen.f = this.i;
    }
}
