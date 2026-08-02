package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.mih0;

/* compiled from: ClipsFeedPlaylistBadgesMapper.kt */
/* loaded from: classes17.dex */
public final class k8e {
    public final ClipFeedTab a;

    public k8e(ClipFeedTab clipFeedTab) {
        this.a = clipFeedTab;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r5.Z0().b == r2.b) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mih0.l a(SdkClipVideoFile sdkClipVideoFile) {
        List<SdkClipsDraftablePlaylist> d0 = sdkClipVideoFile.d0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = d0.iterator();
        while (true) {
            ClipsPlaylist clipsPlaylist = null;
            if (!it.hasNext()) {
                break;
            }
            SdkClipsDraftablePlaylist sdkClipsDraftablePlaylist = (SdkClipsDraftablePlaylist) it.next();
            ClipFeedTab clipFeedTab = this.a;
            if (clipFeedTab instanceof ClipFeedTab.Playlist) {
                ClipFeedTab.Playlist playlist = (ClipFeedTab.Playlist) clipFeedTab;
                if (epx.f(playlist.Z0().f, sdkClipsDraftablePlaylist.e)) {
                }
                if (clipsPlaylist == null) {
                    arrayList.add(clipsPlaylist);
                }
            }
            clipsPlaylist = new ClipsPlaylist(sdkClipsDraftablePlaylist.b, sdkClipsDraftablePlaylist.c, sdkClipsDraftablePlaylist.d, 0, sdkClipsDraftablePlaylist.e, false, null, 96, null);
            if (clipsPlaylist == null) {
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? new mih0.l.b((ClipsPlaylist) arrayList.get(0)) : new mih0.l.a(arrayList);
    }
}
