package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.m1n;

/* compiled from: ClipTrendsCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class tdd extends FunctionReferenceImpl implements wzs<View, UIBlockVideo, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(View view, UIBlockVideo uIBlockVideo) {
        MusicTrack musicTrack;
        boolean z;
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem;
        Serializer.StreamParcelableAdapter streamParcelableAdapter;
        String str;
        ai5 c;
        UserId userId;
        View view2 = view;
        UIBlockVideo uIBlockVideo2 = uIBlockVideo;
        wqc wqcVar = (wqc) this.receiver;
        wqcVar.getClass();
        VideoFile videoFile = uIBlockVideo2.B;
        oqc oqcVar = wqcVar.a;
        String str2 = uIBlockVideo2.b;
        m1n m1nVar = (m1n) oqcVar.a.get(str2);
        m1n.b bVar = m1nVar instanceof m1n.b ? (m1n.b) m1nVar : null;
        String str3 = bVar != null ? bVar.a : null;
        boolean z2 = videoFile instanceof ClipVideoFile;
        ClipVideoFile clipVideoFile = z2 ? (ClipVideoFile) videoFile : null;
        if (!(m1nVar instanceof m1n.d) || clipVideoFile == null || (musicTrack = clipVideoFile.D1) == null || !musicTrack.X) {
            musicTrack = null;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TRENDS_CATALOG;
        MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.EventType.OPEN_TREND;
        if (clipVideoFile != null) {
            z = z2;
            mobileOfficialAppsClipsStat$TypeClipsClipItem = new MobileOfficialAppsClipsStat$TypeClipsClipItem(clipVideoFile.c, clipVideoFile.b.b, clipVideoFile.W);
        } else {
            z = z2;
            mobileOfficialAppsClipsStat$TypeClipsClipItem = null;
        }
        new iid0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem(eventType, (musicTrack == null || (userId = musicTrack.c) == null) ? null : Long.valueOf(userId.b), musicTrack != null ? Integer.valueOf(musicTrack.b) : null, str3, mobileOfficialAppsClipsStat$TypeClipsClipItem), 3)).q();
        m1n m1nVar2 = (m1n) oqcVar.a.get(str2);
        if (m1nVar2 instanceof m1n.b) {
            streamParcelableAdapter = new ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip(str2, new ClipFeedTab.Hashtag(((m1n.b) m1nVar2).a, true, null, 4, null));
        } else if (m1nVar2 instanceof m1n.d) {
            ClipVideoFile clipVideoFile2 = z ? (ClipVideoFile) videoFile : null;
            MusicTrack musicTrack2 = clipVideoFile2 != null ? clipVideoFile2.D1 : null;
            StringBuilder sb = new StringBuilder();
            if (musicTrack2 == null || (str = musicTrack2.e) == null) {
                str = "";
            }
            sb.append(str);
            sb.append(' ');
            sb.append(s490.c(musicTrack2 != null ? musicTrack2.u : null));
            streamParcelableAdapter = new ClipFeedTab.CatalogClip.TrendingMusicCatalogClip(str2, new ClipFeedTab.Music(musicTrack2 != null ? musicTrack2.d : null, drm0.p0(sb.toString()).toString(), ((m1n.d) m1nVar2).a, true));
        } else {
            streamParcelableAdapter = null;
        }
        if (streamParcelableAdapter != null && (c = wqc.c(view2)) != null) {
            ClipsRouter a = g620.f().a();
            Context context = view2.getContext();
            List singletonList = Collections.singletonList(streamParcelableAdapter);
            kwc a2 = wqc.a(uIBlockVideo2, c);
            io2 b = wqc.b(view2);
            if (b == null) {
                b = x0a.b((x0a) wqcVar.b.invoke(view2, (ViewGroup) view2.getParent()), videoFile, 2);
            }
            ClipsRouter.c(a, context, singletonList, b, a2, null, null, null, true, null, 1904);
        }
        return s3q0.a;
    }
}
