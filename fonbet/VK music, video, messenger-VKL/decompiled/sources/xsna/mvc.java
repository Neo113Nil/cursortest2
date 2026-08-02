package xsna;

import com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipsAdsFeaturesParams;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.HashMap;
import java.util.List;
import xsna.xme;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mvc implements gzs {
    public final /* synthetic */ NewsEntry b;
    public final /* synthetic */ xme c;
    public final /* synthetic */ String d;
    public final /* synthetic */ e8e e;
    public final /* synthetic */ HashMap f;
    public final /* synthetic */ ClipEndOverlayView g;

    public /* synthetic */ mvc(NewsEntry newsEntry, xme xmeVar, String str, e8e e8eVar, HashMap hashMap, ClipEndOverlayView clipEndOverlayView) {
        this.b = newsEntry;
        this.c = xmeVar;
        this.d = str;
        this.e = e8eVar;
        this.f = hashMap;
        this.g = clipEndOverlayView;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ClipsAdsFeaturesParams clipsAdsFeaturesParams;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams2;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams3;
        Owner owner;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams4;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams5;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams6;
        Owner owner2;
        VideoAttachment l;
        int i = ClipEndOverlayView.u;
        NewsEntry newsEntry = this.b;
        String str = null;
        VideoFile videoFile = (newsEntry == null || (l = di60.l(newsEntry)) == null) ? null : l.k;
        ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
        xme.a g = this.c.g(clipVideoFile, this.d);
        boolean z = g instanceof xme.a.c;
        e8e e8eVar = this.e;
        HashMap hashMap = this.f;
        ClipEndOverlayView clipEndOverlayView = this.g;
        if (!z) {
            if (!(g instanceof xme.a.b)) {
                return null;
            }
            e8eVar.getClass();
            Integer valueOf = clipVideoFile != null ? Integer.valueOf(clipVideoFile.c) : null;
            UserId userId = (clipVideoFile == null || (owner = clipVideoFile.v0) == null) ? null : owner.b;
            boolean z2 = (clipVideoFile == null || (clipsAdsFeaturesParams3 = clipVideoFile.S1) == null || (clipsAdsFeaturesParams3.b.isEmpty() && !myc0.f(clipsAdsFeaturesParams3.d))) ? false : true;
            List<String> list = (clipVideoFile == null || (clipsAdsFeaturesParams2 = clipVideoFile.S1) == null) ? null : clipsAdsFeaturesParams2.b;
            if (clipVideoFile != null && (clipsAdsFeaturesParams = clipVideoFile.S1) != null) {
                str = clipsAdsFeaturesParams.d;
            }
            return new ClipEndOverlayAdWrapperView.b.a(newsEntry, new lvc(valueOf, userId, z2, list, str, hashMap), new t5(clipEndOverlayView, 19));
        }
        Object obj = ((xme.a.c) g).a;
        gmc gmcVar = obj instanceof gmc ? (gmc) obj : null;
        if (gmcVar != null) {
            return new ClipEndOverlayAdWrapperView.b.C0697b(gmcVar);
        }
        e8eVar.getClass();
        Integer valueOf2 = clipVideoFile != null ? Integer.valueOf(clipVideoFile.c) : null;
        UserId userId2 = (clipVideoFile == null || (owner2 = clipVideoFile.v0) == null) ? null : owner2.b;
        boolean z3 = (clipVideoFile == null || (clipsAdsFeaturesParams6 = clipVideoFile.S1) == null || (clipsAdsFeaturesParams6.b.isEmpty() && !myc0.f(clipsAdsFeaturesParams6.d))) ? false : true;
        List<String> list2 = (clipVideoFile == null || (clipsAdsFeaturesParams5 = clipVideoFile.S1) == null) ? null : clipsAdsFeaturesParams5.b;
        if (clipVideoFile != null && (clipsAdsFeaturesParams4 = clipVideoFile.S1) != null) {
            str = clipsAdsFeaturesParams4.d;
        }
        return new ClipEndOverlayAdWrapperView.b.a(newsEntry, new lvc(valueOf2, userId2, z3, list2, str, hashMap), new s5(clipEndOverlayView, 23));
    }
}
