package xsna;

import com.vk.log.L;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCreateChannelClick;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangeAuthor;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: ClipsAuthorsStatControllerImpl.kt */
/* loaded from: classes14.dex */
public final class sid implements rid {
    public final lbk a;

    /* compiled from: ClipsAuthorsStatControllerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsCoreNavStat$EventScreen.values().length];
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_EDITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sid(lbk lbkVar) {
        this.a = lbkVar;
    }

    @Override // xsna.rid
    public final void a() {
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_EDITOR, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CHANNEL, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoCreateChannelClick(CommonVideoStat$TypeVideoCreateChannelClick.EventType.CLICK_CREATE_CHANNEL, null, CommonVideoStat$TypeVideoCreateChannelClick.Source.CLIP_EDITING_BLOCK, 2, null), 2)).q();
    }

    @Override // xsna.rid
    public final void b(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        MobileOfficialAppsClipsStat$ChangeAuthor mobileOfficialAppsClipsStat$ChangeAuthor;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.CHANGE_AUTHOR;
        int i = a.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()];
        if (i == 1) {
            mobileOfficialAppsClipsStat$ChangeAuthor = new MobileOfficialAppsClipsStat$ChangeAuthor(MobileOfficialAppsClipsStat$ChangeAuthor.NavScreen.CLIPS_CAMERA);
        } else if (i == 2) {
            mobileOfficialAppsClipsStat$ChangeAuthor = new MobileOfficialAppsClipsStat$ChangeAuthor(MobileOfficialAppsClipsStat$ChangeAuthor.NavScreen.CLIPS_EDITOR);
        } else if (i != 3) {
            L.l("ClipsAuthorsStatControllerImpl", "Not mapping for apply author stat!");
            rdi.E();
            mobileOfficialAppsClipsStat$ChangeAuthor = null;
        } else {
            mobileOfficialAppsClipsStat$ChangeAuthor = new MobileOfficialAppsClipsStat$ChangeAuthor(MobileOfficialAppsClipsStat$ChangeAuthor.NavScreen.CLIPS_PUBLISH);
        }
        MobileOfficialAppsClipsStat$ChangeAuthor mobileOfficialAppsClipsStat$ChangeAuthor2 = mobileOfficialAppsClipsStat$ChangeAuthor;
        lbk lbkVar = this.a;
        kbk context = lbkVar.getContext();
        int i2 = context != null ? context.b : -1;
        kbk context2 = lbkVar.getContext();
        if (context2 == null || (creationEntryPoint = context2.a) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        new kze(mobileOfficialAppsCoreNavStat$EventScreen, new MobileOfficialAppsClipsStat$TypeClipPublishItem(eventType, new MobileOfficialAppsClipsStat$ClipsCreateContext(i2, creationEntryPoint), null, null, null, null, mobileOfficialAppsClipsStat$ChangeAuthor2, null, null, null, null, 1980, null)).q();
    }
}
