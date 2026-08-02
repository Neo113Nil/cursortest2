package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.view.NestedScrollableRecyclerView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.m1n;

/* compiled from: ClipDiscoverCatalogRouter.kt */
/* loaded from: classes16.dex */
public final class wqc {
    public final oqc a;
    public final pv7 b = new pv7((byte) 0, 1);

    public wqc(oqc oqcVar) {
        this.a = oqcVar;
    }

    public static kwc a(UIBlockVideo uIBlockVideo, ai5 ai5Var) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        List A = rli0.A(new tlp0(new bli0(new vqc(ai5Var, null)), new uqc(0, uIBlockVideo, ref$IntRef)));
        if (A.isEmpty()) {
            A = Collections.singletonList(g620.f().e0().c(uIBlockVideo.B));
        }
        List list = A;
        String str = uIBlockVideo.z;
        return new kwc(list, (str == null || str.length() == 0 || str.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str), ref$IntRef.element);
    }

    public static fh5 b(View view) {
        NestedScrollableRecyclerView d = d(view);
        if (d != null) {
            Object findContainingViewHolder = d.findContainingViewHolder(view);
            ent0 ent0Var = findContainingViewHolder instanceof ent0 ? (ent0) findContainingViewHolder : null;
            if (ent0Var != null) {
                dnt0 q3 = ent0Var.q3();
                if (q3 instanceof fh5) {
                    return (fh5) q3;
                }
            }
        }
        return null;
    }

    public static ai5 c(View view) {
        NestedScrollableRecyclerView d = d(view);
        if (d != null) {
            RecyclerView.Adapter adapter = d.getAdapter();
            pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
            if (pd90Var != null) {
                T t = pd90Var.c;
                if (t instanceof ai5) {
                    return (ai5) t;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        return (com.vk.core.view.NestedScrollableRecyclerView) r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NestedScrollableRecyclerView d(View view) {
        View rootView = view.getRootView();
        while (true) {
            boolean z = view instanceof NestedScrollableRecyclerView;
            if (z || view == null || view.equals(rootView)) {
                break;
            }
            view = (View) view.getParent();
        }
        return null;
    }

    public final void e(View view, UIBlockVideo uIBlockVideo) {
        Object unknownCatalogClip;
        String str;
        ClipsRouter a = g620.f().a();
        Context context = view.getContext();
        String str2 = uIBlockVideo.b;
        VideoFile videoFile = uIBlockVideo.B;
        oqc oqcVar = this.a;
        m1n m1nVar = (m1n) oqcVar.a.get(str2);
        boolean z = m1nVar instanceof m1n.b ? ((m1n.b) m1nVar).b : m1nVar instanceof m1n.d ? ((m1n.d) m1nVar).c : false;
        m1n m1nVar2 = (m1n) oqcVar.a.get(str2);
        if (m1nVar2 instanceof m1n.b) {
            unknownCatalogClip = new ClipFeedTab.CatalogClip.HashtagCatalogClip(str2, new ClipFeedTab.Hashtag(((m1n.b) m1nVar2).a, z, null, 4, null));
        } else if (m1nVar2 instanceof m1n.a) {
            m1n.a aVar = (m1n.a) m1nVar2;
            unknownCatalogClip = new ClipFeedTab.CatalogClip.CompilationCatalogClip(str2, new ClipFeedTab.Compilation(aVar.a, null, aVar.b, null, 8, null));
        } else if (m1nVar2 instanceof m1n.d) {
            ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
            MusicTrack musicTrack = clipVideoFile != null ? clipVideoFile.D1 : null;
            String str3 = musicTrack != null ? musicTrack.d : null;
            StringBuilder sb = new StringBuilder();
            if (musicTrack == null || (str = musicTrack.e) == null) {
                str = "";
            }
            sb.append(str);
            sb.append(' ');
            sb.append(s490.c(musicTrack != null ? musicTrack.u : null));
            unknownCatalogClip = new ClipFeedTab.CatalogClip.MusicCatalogClip(str2, new ClipFeedTab.Music(str3, drm0.p0(sb.toString()).toString(), ((m1n.d) m1nVar2).a, z));
        } else if (m1nVar2 instanceof m1n.c) {
            m1n.c cVar = (m1n.c) m1nVar2;
            unknownCatalogClip = new ClipFeedTab.CatalogClip.MaskCatalogClip(str2, new ClipFeedTab.Mask(cVar.b, cVar.a));
        } else {
            unknownCatalogClip = new ClipFeedTab.CatalogClip.UnknownCatalogClip(str2, new ClipFeedTab.SingleClip(g620.f().e0().c(videoFile), null, null, false, false, null, null, null, 254, null));
        }
        List singletonList = Collections.singletonList(unknownCatalogClip);
        ai5 c = c(view);
        if (c == null) {
            return;
        }
        kwc a2 = a(uIBlockVideo, c);
        io2 b = b(view);
        if (b == null) {
            b = x0a.b((x0a) this.b.invoke(view, (ViewGroup) view.getParent()), videoFile, 2);
        }
        ClipsRouter.c(a, context, singletonList, b, a2, null, null, null, false, null, 2032);
    }
}
