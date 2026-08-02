package xsna;

import android.os.Trace;
import android.util.SparseIntArray;
import androidx.appcompat.widget.Toolbar;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.music.impl.di.CatalogMusicViewComponentImpl;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.core.ui.themes.ThemeKeyAttributes;
import com.vk.mediapicker.impl.di.MediaPickerComponentImpl;
import com.vk.odnoklassniki.registration.OkRegistrationComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.internal.storage.database.FeatureDatabase_Impl;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.prodstat.analytics.contact.action.VoipContactsActionAnalytics;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.NewsFeedBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class yaa implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yaa(com.vk.core.ui.themes.a aVar, Toolbar toolbar) {
        this.b = 7;
        this.c = toolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CatalogMusicViewComponentImpl.i;
                return ((BridgeComponent) r1.getValue()).Le();
            case 1:
                return ((OkRegistrationComponent) m7m.a(((com.vk.auth.c) r1).a).mo408a(fpf0.a(OkRegistrationComponent.class))).yb();
            case 2:
                return new ei20((FeatureDatabase_Impl) r1);
            case 3:
                return ((ClipsUploadSdkUploaderComponent) m7m.a(((nx50) r1).b).a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).Zb();
            case 4:
                return ((PhotosComponent) ((NewsFeedBridgeComponentImpl) r1).e.getValue()).r4();
            case 5:
                bhl0 bhl0Var = (bhl0) r1;
                Trace.beginSection(ndp0.f("lazy StorageManager.channelPostponedMessagesStorageManager"));
                try {
                    r3b r3bVar = new r3b(bhl0Var.B(), true);
                    bhl0Var.z(r3bVar);
                    return r3bVar;
                } finally {
                    Trace.endSection();
                }
            case 6:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) r1;
                b25 s = storiesComponentImpl.b.s();
                nwy nwyVar = storiesComponentImpl.j;
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                qcy<Object> qcyVar = qcyVarArr2[3];
                tvl0 tvl0Var = (tvl0) nwyVar.c();
                nwy nwyVar2 = storiesComponentImpl.i;
                qcy<Object> qcyVar2 = qcyVarArr2[2];
                return new hul0(s, tvl0Var, (gxh) nwyVar2.c());
            case 7:
                Toolbar toolbar = (Toolbar) r1;
                if (toolbar.getTag(R.id.theme_tag_key) != null) {
                    com.vk.core.ui.themes.a.d(toolbar, ((SparseIntArray) toolbar.getTag(R.id.theme_tag_key)).get(ThemeKeyAttributes.BACKGROUND.h(), 0));
                }
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((qks0) r1).b);
            case 9:
                return new MediaPickerComponentImpl.a(((jau0) r1).b);
            default:
                qcy<Object>[] qcyVarArr3 = VoipAnalyticsInternalComponent.b;
                return new VoipContactsActionAnalytics((iid0) r1);
        }
    }

    public /* synthetic */ yaa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
