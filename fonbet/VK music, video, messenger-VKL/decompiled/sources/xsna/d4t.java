package xsna;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.toggle.features.StoriesFeatures;
import java.util.Collections;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class d4t implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d4t(com.vk.attachpicker.fragment.gallery.c cVar, GalleryRecyclerView galleryRecyclerView, View view, com.vk.attachpicker.b bVar, PhotoSmallAdapter photoSmallAdapter) {
        this.c = cVar;
        this.d = galleryRecyclerView;
        this.e = view;
        this.f = bVar;
        this.g = photoSmallAdapter;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        StoryCameraParams storyCameraParams;
        WebStoryBox webStoryBox;
        switch (this.b) {
            case 0:
                com.vk.attachpicker.fragment.gallery.c cVar = (com.vk.attachpicker.fragment.gallery.c) this.c;
                GalleryRecyclerView galleryRecyclerView = (GalleryRecyclerView) this.d;
                View view = (View) this.e;
                com.vk.attachpicker.b bVar = (com.vk.attachpicker.b) this.f;
                PhotoSmallAdapter photoSmallAdapter = (PhotoSmallAdapter) this.g;
                int intValue = ((Integer) obj).intValue();
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj2;
                if (((Boolean) cVar.c.invoke()).booleanValue() || cVar.m) {
                    GalleryFragmentImpl galleryFragmentImpl = cVar.a;
                    StoriesFeatures storiesFeatures = StoriesFeatures.TRIM_VIDEO;
                    storiesFeatures.getClass();
                    if (com.vk.toggle.b.A.a(storiesFeatures) && (mediaStoreEntry instanceof MediaStoreVideoEntry)) {
                        long j = ((MediaStoreVideoEntry) mediaStoreEntry).q;
                        if (j >= 5000 && ((storyCameraParams = cVar.h) == null || (webStoryBox = storyCameraParams.u) == null || !webStoryBox.Db())) {
                            nf9.b.l(j);
                            galleryFragmentImpl.C7(mediaStoreEntry, new nvg(cVar, 26), new tb4(25));
                        }
                    }
                    FragmentActivity activity = galleryFragmentImpl.getActivity();
                    if (activity != null) {
                        List singletonList = Collections.singletonList(mediaStoreEntry);
                        t4t t4tVar = cVar.b;
                        if (r34.a(activity, singletonList, t4tVar.d, t4tVar.e)) {
                            cVar.c(galleryRecyclerView, view, intValue, mediaStoreEntry);
                        }
                    }
                } else {
                    bVar.f(intValue - photoSmallAdapter.K0(), null, mediaStoreEntry);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((srs0) this.c).g((BlockId.CompositeId) this.d, (kjz) this.e, (izs) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ d4t(srs0 srs0Var, BlockId.CompositeId compositeId, kjz kjzVar, izs izsVar, q630 q630Var, int i) {
        this.c = srs0Var;
        this.d = compositeId;
        this.e = kjzVar;
        this.f = izsVar;
        this.g = q630Var;
    }
}
