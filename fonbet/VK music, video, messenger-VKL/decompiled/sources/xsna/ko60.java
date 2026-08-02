package xsna;

import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.ads.core.domain.MediationProviderParser;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.newsfeed.posting.impl.domain.model.CropCarouselType;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.sharing.im_engine_impl.di.SharingImEngineComponentImpl;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.features.SearchFeatures;
import com.vk.video.ui.share.api.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import xsna.w1s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ko60 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ko60(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // xsna.gzs
    public final Object invoke() {
        MediationProviderParser initialize$lambda$220$lambda$76;
        ?? failure;
        switch (this.b) {
            case 0:
                return new w5r0();
            case 1:
                d6q0.a.getClass();
                Iterator<ny1> it = d6q0.d.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                ysa0.a.hide();
                return s3q0.a;
            case 2:
                return CropCarouselType.FIRST.toString();
            case 3:
                return s3q0.a;
            case 4:
                initialize$lambda$220$lambda$76 = ServiceProvider.initialize$lambda$220$lambda$76();
                return initialize$lambda$220$lambda$76;
            case 5:
                qcy<Object>[] qcyVarArr = SharingImEngineComponentImpl.m;
                return new wbj0();
            case 6:
                return new pao0(R.string.vk_auth_sign_up_terms_new_custom, R.string.vk_auth_sign_up_terms_new_custom_single, R.string.vk_auth_sign_up_terms_new);
            case 7:
                return s3q0.a;
            case 8:
                return new DisplayNameFormatter(null, 3, null);
            case 9:
                return new com.vk.libvideo.tracker.b(new w1s0.a());
            case 10:
                int i = VideoCatalogRootVh.M0;
                try {
                    b.d i2 = com.vk.toggle.b.A.i(SearchFeatures.SEARCH_VIDEO_CATEGORY);
                    ArrayList K = f370.K(new JSONArray(i2 != null ? i2.c.toString() : null));
                    failure = new ArrayList();
                    Iterator it2 = K.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof String) {
                            failure.add(next);
                        }
                    }
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                EmptyList emptyList = EmptyList.b;
                boolean z = failure instanceof Result.Failure;
                EmptyList emptyList2 = failure;
                if (z) {
                    emptyList2 = emptyList;
                }
                return emptyList2;
            case 11:
                return b.a.a.getSTUB();
            case 12:
                return s3q0.a;
            case 13:
                return ((QueueSyncComponent) ((k7m) m7m.f(rau0.b)).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 14:
                return Integer.valueOf(iah0.a(8.0f));
            case 15:
                return tlo0.Companion.serializer();
            case 16:
                tzv0 b = com.vk.toggle.d.B.b();
                if (b != null) {
                    return b;
                }
                tzv0.b.getClass();
                return tzv0.c;
            default:
                return Boolean.valueOf(SakFeatures.Type.VKC_SMARTFLOW_OK_ANDROID.h());
        }
    }

    public /* synthetic */ ko60(AppCompatActivity appCompatActivity) {
        this.b = 1;
    }
}
