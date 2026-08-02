package xsna;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.NestedScrollableRecyclerView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipMusicTemplatesCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class m8d implements mba {
    public final /* synthetic */ l8d b;
    public final /* synthetic */ String c;

    public m8d(l8d l8dVar, String str) {
        this.b = l8dVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // xsna.mba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(View view, UIBlock uIBlock, Object obj) {
        NestedScrollableRecyclerView z0;
        ai5 ai5Var;
        String str;
        yg5 yg5Var;
        VideoFile A;
        Activity c = g2u0.c(view);
        if (c == null) {
            return;
        }
        if (!(uIBlock == null ? true : uIBlock instanceof UIBlockVideo)) {
            return;
        }
        UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
        io2 io2Var = null;
        if ((uIBlockVideo != null ? uIBlockVideo.b : null) == null || (z0 = l8d.z0(view)) == null) {
            return;
        }
        NestedScrollableRecyclerView z02 = l8d.z0(view);
        if (z02 != null) {
            RecyclerView.Adapter adapter = z02.getAdapter();
            pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
            if (pd90Var != null) {
                T t = pd90Var.c;
                if (t instanceof ai5) {
                    ai5Var = (ai5) t;
                    if (ai5Var != null) {
                        return;
                    }
                    int itemCount = ai5Var.getItemCount();
                    ArrayList arrayList = new ArrayList();
                    if (itemCount != 0) {
                        j9x it = swe0.q(0, itemCount).iterator();
                        while (it.d) {
                            y9t0 Eh = ai5Var.Eh(it.nextInt());
                            if (Eh != null && (yg5Var = Eh.a) != null && (A = yg5Var.A()) != null) {
                                arrayList.add(g620.f().e0().c(A));
                            }
                        }
                    } else {
                        arrayList.add(g620.f().e0().c(uIBlockVideo.B));
                    }
                    Iterator it2 = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        } else if (epx.f(((SdkVideoFile) it2.next()).r1(), uIBlockVideo.B.r1())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (i == -1) {
                        valueOf = null;
                    }
                    String str2 = uIBlockVideo.z;
                    VideoFile videoFile = uIBlockVideo.B;
                    kwc kwcVar = new kwc(arrayList, (str2 == null || str2.length() == 0 || str2.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str2), valueOf != null ? valueOf.intValue() : 0);
                    String str3 = uIBlockVideo.b;
                    Serializer.c<ClipFeedTab.MusicTemplate> cVar = ClipFeedTab.MusicTemplate.CREATOR;
                    ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
                    if (clipVideoFile == null || (str = clipVideoFile.a1()) == null) {
                        str = "";
                    }
                    ClipFeedTab.CatalogClip.MusicTemplateCatalogClip musicTemplateCatalogClip = new ClipFeedTab.CatalogClip.MusicTemplateCatalogClip(str3, new ClipFeedTab.MusicTemplate(str, this.c, ClipFeedTab.MusicTemplate.IdType.ClipId));
                    ClipsRouter a = g620.f().a();
                    List singletonList = Collections.singletonList(musicTemplateCatalogClip);
                    NestedScrollableRecyclerView z03 = l8d.z0(view);
                    if (z03 != null) {
                        Object findContainingViewHolder = z03.findContainingViewHolder(view);
                        ent0 ent0Var = findContainingViewHolder instanceof ent0 ? (ent0) findContainingViewHolder : null;
                        if (ent0Var != null) {
                            dnt0 q3 = ent0Var.q3();
                            if (q3 instanceof fh5) {
                                io2Var = (fh5) q3;
                            }
                        }
                    }
                    if (io2Var == null) {
                        io2Var = x0a.b((x0a) this.b.D.invoke(view, z0), videoFile, 2);
                    }
                    ClipsRouter.c(a, c, singletonList, io2Var, kwcVar, fpf0.a(ClipFeedTab.CatalogClip.MusicTemplateCatalogClip.class), null, null, true, null, 1888);
                    return;
                }
            }
        }
        ai5Var = null;
        if (ai5Var != null) {
        }
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.mba
    public final void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
    }

    @Override // xsna.mba
    public final void q(int i, UIBlock uIBlock, Object obj) {
    }
}
