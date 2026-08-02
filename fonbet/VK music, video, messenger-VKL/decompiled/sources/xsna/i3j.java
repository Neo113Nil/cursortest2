package xsna;

import android.app.Activity;
import androidx.compose.runtime.a;
import com.vk.bridges.ImageViewer;
import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.reviews.impl.communities.yclients.i;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.cvj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class i3j implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i3j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                fm50 fm50Var = (fm50) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-126281050, intValue, -1, "com.vk.ecomm.reviews.impl.communities.yclients.ConnectYClientsReviewsContent.ThemedContent.<anonymous> (ConnectYClientsReviewsContent.kt:40)");
                }
                if (fm50Var instanceof i.a) {
                    aVar.K(352713725);
                    com.vk.ecomm.reviews.impl.communities.yclients.h.a(0, aVar, izsVar, null, ((Boolean) jk50.c(((i.a) fm50Var).a, aVar).getValue()).booleanValue());
                    aVar.j();
                } else if (fm50Var instanceof i.d) {
                    aVar.K(353026484);
                    com.vk.ecomm.reviews.impl.communities.yclients.h.c(0, aVar, izsVar, null);
                    aVar.j();
                } else {
                    if (fm50Var instanceof i.c) {
                        aVar.K(353226496);
                        com.vk.ecomm.reviews.impl.communities.yclients.h.b(0, aVar, izsVar, null, ((Boolean) jk50.c(((i.c) fm50Var).a, aVar).getValue()).booleanValue());
                    } else {
                        aVar.K(351155324);
                    }
                    aVar.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                izs izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-328242339, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.author.compose.modal.Modal.<anonymous>.<anonymous>.<anonymous> (Modal.kt:53)");
                    }
                    if (fxc0.B().J().l1()) {
                        i = 973144122;
                        i2 = R.string.video_upload_picker_create_channel;
                    } else {
                        i = 973256156;
                        i2 = R.string.video_upload_picker_create_group;
                    }
                    String a = zq.a(aVar2, i, i2, aVar2, 0);
                    boolean J = aVar2.J(izsVar2);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new tzo(izsVar2, 4);
                        aVar2.R(x);
                    }
                    qzu0.a.getClass();
                    qiu0.a(a, (gzs) x, null, qzu0.b(aVar2), null, null, 0, null, CellButton$IconBackgroundStyle.Circle, null, null, false, aVar2, 100667392, 7924);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                cvj0 cvj0Var = (cvj0) this.c;
                int intValue3 = ((Integer) obj).intValue();
                List list = (List) obj2;
                Activity activity = (Activity) obj3;
                ImageViewer d = myc0.d();
                cvj0.e eVar = (cvj0.e) cvj0Var.b0.getValue();
                String str = cvj0Var.v;
                String str2 = cvj0Var.u;
                MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint = MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.NEWS_ITEM;
                boolean K = bwt0.K(cvj0Var.S);
                String Bb = cvj0Var.q6() instanceof Post ? ((Post) cvj0Var.q6()).Bb() : null;
                s1c0 s1c0Var = cvj0Var.x;
                return ImageViewer.f(d, intValue3, list, activity, eVar, str, str2, mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, K, Bb, s1c0Var != null ? s1c0Var.H : true, Tensorflow.FRAME_HEIGHT);
        }
    }
}
