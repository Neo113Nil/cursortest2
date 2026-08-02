package xsna;

import android.content.Context;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.t4p;

/* compiled from: GalleryFragmentImpl.kt */
/* loaded from: classes15.dex */
public final class y3t implements t4p {
    public final /* synthetic */ GalleryFragmentImpl a;
    public final /* synthetic */ Ref$ObjectRef<MediaStoreEntry> b;
    public final /* synthetic */ Integer c;

    public y3t(GalleryFragmentImpl galleryFragmentImpl, Ref$ObjectRef<MediaStoreEntry> ref$ObjectRef, Integer num) {
        this.a = galleryFragmentImpl;
        this.b = ref$ObjectRef;
        this.c = num;
    }

    @Override // xsna.t4p
    public final void a(t4p.a aVar) {
        List<Object> y0;
        List<Object> y02;
        List<Object> y03;
        GalleryFragmentImpl galleryFragmentImpl = this.a;
        if (galleryFragmentImpl.u0 || !galleryFragmentImpl.z0) {
            return;
        }
        Integer num = null;
        boolean z = true;
        if (BuildInfo.t() || BuildInfo.s()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            z = Preference.g(context).getBoolean("saveProcessedImage", true);
        }
        boolean z2 = aVar instanceof t4p.a.b;
        Integer num2 = this.c;
        Ref$ObjectRef<MediaStoreEntry> ref$ObjectRef = this.b;
        if (z2) {
            t4p.a.b bVar = (t4p.a.b) aVar;
            Object obj = bVar.b;
            MediaStoreEntry mediaStoreEntry = bVar.a;
            t4p.a.f fVar = bVar.c;
            bmk0 bmk0Var = new bmk0(fVar.a, fVar.b);
            if (z) {
                com.vk.attachpicker.b bVar2 = galleryFragmentImpl.Q;
                if (bVar2 != null) {
                    bVar2.a(ref$ObjectRef.element, mediaStoreEntry, obj, bmk0Var);
                    return;
                }
                return;
            }
            com.vk.attachpicker.b bVar3 = galleryFragmentImpl.Q;
            if (bVar3 != null) {
                bVar3.t(ref$ObjectRef.element, mediaStoreEntry, obj, bmk0Var);
            }
            GalleryFragmentImpl.eo(galleryFragmentImpl, num2, ref$ObjectRef.element);
            return;
        }
        if (aVar instanceof t4p.a.C3718a) {
            t4p.a.f fVar2 = ((t4p.a.C3718a) aVar).a;
            bmk0 bmk0Var2 = new bmk0(fVar2.a, fVar2.b);
            com.vk.attachpicker.b bVar4 = galleryFragmentImpl.Q;
            if (bVar4 != null) {
                bVar4.r(ref$ObjectRef.element, bmk0Var2);
            }
            GalleryFragmentImpl.eo(galleryFragmentImpl, num2, ref$ObjectRef.element);
            return;
        }
        if (aVar instanceof t4p.a.d) {
            PhotoSmallAdapter photoSmallAdapter = galleryFragmentImpl.c0;
            if (photoSmallAdapter != null && (y03 = photoSmallAdapter.y0()) != null) {
                num = Integer.valueOf(((ArrayList) y03).indexOf(ref$ObjectRef.element));
            }
            GalleryFragmentImpl.eo(galleryFragmentImpl, num, ref$ObjectRef.element);
            return;
        }
        if (aVar instanceof t4p.a.e) {
            if (z) {
                PhotoSmallAdapter photoSmallAdapter2 = galleryFragmentImpl.c0;
                if (photoSmallAdapter2 != null && (y02 = photoSmallAdapter2.y0()) != null) {
                    num = Integer.valueOf(((ArrayList) y02).indexOf(ref$ObjectRef.element));
                }
                GalleryFragmentImpl.eo(galleryFragmentImpl, num, ref$ObjectRef.element);
                return;
            }
            com.vk.attachpicker.b bVar5 = galleryFragmentImpl.Q;
            if (bVar5 != null) {
                bVar5.c(ref$ObjectRef.element);
            }
            PhotoSmallAdapter photoSmallAdapter3 = galleryFragmentImpl.c0;
            if (photoSmallAdapter3 != null && (y0 = photoSmallAdapter3.y0()) != null) {
                num = Integer.valueOf(((ArrayList) y0).indexOf(ref$ObjectRef.element));
            }
            GalleryFragmentImpl.eo(galleryFragmentImpl, num, ref$ObjectRef.element);
        }
    }

    @Override // xsna.t4p
    public final boolean b() {
        return true;
    }
}
