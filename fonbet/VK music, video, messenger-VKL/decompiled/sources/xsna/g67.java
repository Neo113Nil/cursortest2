package xsna;

import android.app.Application;
import androidx.activity.ComponentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.music.onboarding.api.di.MusicOnboardingComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.vmoji.storage.impl.di.component.VmojiStorageComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.c2r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g67 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g67(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        androidx.lifecycle.b0 defaultViewModelProviderFactory_delegate$lambda$0;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                k67 k67Var = (k67) obj;
                return new geh0(k67Var.b, new z56(k67Var, i2), new b67(k67Var, 0));
            case 1:
                defaultViewModelProviderFactory_delegate$lambda$0 = ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0((ComponentActivity) obj);
                return defaultViewModelProviderFactory_delegate$lambda$0;
            case 2:
                return new nig(((gxw) obj).b, fxw.b);
            case 3:
                return ((MusicOnboardingComponent) ((LinksBridgeComponentImpl) obj).y.getValue()).e();
            case 4:
                return (NewsfeedMappersComponent) ((g8m) obj).c(fpf0.a(NewsfeedMappersComponent.class));
            case 5:
                PhotosComponentImpl photosComponentImpl = (PhotosComponentImpl) obj;
                nwy nwyVar = photosComponentImpl.c;
                qcy<Object> qcyVar = PhotosComponentImpl.u[2];
                return new fl1((hk1) nwyVar.c(), photosComponentImpl.z8());
            case 6:
                bpn0 bpn0Var = ((aid0) obj).m;
                if (!lhs.d()) {
                    return new ixf0((thd0) bpn0Var.getValue());
                }
                lhs.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
                try {
                    return new ixf0((thd0) bpn0Var.getValue());
                } finally {
                    lhs.b();
                }
            case 7:
                VKApplication vKApplication = (VKApplication) obj;
                VKApplication.a aVar = VKApplication.c;
                r55 r55Var = r55.a;
                c2r0 j = r55.j();
                r55.d();
                bpn0 bpn0Var2 = new bpn0(new fr6(vKApplication, 18));
                yui yuiVar = (yui) j;
                List<c2r0.b> h = yuiVar.h(vKApplication, true);
                if (!(h instanceof Collection) || !h.isEmpty()) {
                    Iterator<T> it = h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            UserId d = ((c2r0.b) it.next()).d();
                            UserId userId = UserId.d;
                            if (epx.f(d, userId)) {
                                yuiVar.b(vKApplication, userId);
                                ((mxi0) bpn0Var2.getValue()).b("InvalidAccountsCleaner", on00.f(new Pair("us_found", "true")));
                            }
                        }
                    }
                }
                return s3q0.a;
            case 8:
                return new esg0((erg0) ((qmr0) obj).e.getValue());
            case 9:
                return Boolean.valueOf(((qks0) ((kzv0) obj).n.getValue()).v0);
            default:
                return new VmojiStorageComponentImpl.a((Application) obj);
        }
    }
}
