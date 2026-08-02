package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.VideoAlbumData;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.id1;

/* compiled from: AlbumChooseAnalyticsMiddleware.kt */
/* loaded from: classes7.dex */
public final class dd1 implements h7f0<AlbumChooseState, cd1, on50, ll50<on50, bwj, dwj>, jl50<AlbumChooseState>, id1> {
    public final AlbumChooseArguments b;
    public final sl50<AlbumChooseState, cd1, on50, ll50<on50, bwj, dwj>, jl50<AlbumChooseState>, id1> c;
    public final MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.EventSubtype d;

    /* compiled from: AlbumChooseAnalyticsMiddleware.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlbumChooseArguments.EntryPoint.values().length];
            try {
                iArr[AlbumChooseArguments.EntryPoint.VIDEO_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlbumChooseArguments.EntryPoint.VIDEO_EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dd1(AlbumChooseArguments albumChooseArguments, sl50<AlbumChooseState, cd1, on50, ll50<on50, bwj, dwj>, jl50<AlbumChooseState>, id1> sl50Var) {
        MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.EventSubtype eventSubtype;
        this.b = albumChooseArguments;
        this.c = sl50Var;
        int i = a.$EnumSwitchMapping$0[albumChooseArguments.d().ordinal()];
        if (i == 1) {
            eventSubtype = MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.EventSubtype.NEW_VIDEO;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eventSubtype = MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.EventSubtype.EDIT_VIDEO;
        }
        this.d = eventSubtype;
        a(MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.EventType.ADD_VIDEO_START, null);
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void K(lj50 lj50Var) {
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        VideoAlbumData videoAlbumData;
        id1 id1Var = (id1) pk50Var;
        if (id1Var instanceof id1.a) {
            Long l = null;
            if (((id1.a) id1Var).a == null) {
                a(MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.EventType.ADD_VIDEO_CANCEL, null);
                return;
            }
            List<VideoAlbumData> list = this.c.getCurrentState().b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((VideoAlbumData) obj).f) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != 1) {
                arrayList = null;
            }
            if (arrayList != null && (videoAlbumData = (VideoAlbumData) j5g.a0(arrayList)) != null) {
                l = Long.valueOf(videoAlbumData.b);
            }
            a(MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.EventType.ADD_VIDEO_END, l);
        }
    }

    public final void a(MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.EventType eventType, Long l) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, l, Long.valueOf(this.b.q().b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick(eventType, this.d), 2)).q();
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.c.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
