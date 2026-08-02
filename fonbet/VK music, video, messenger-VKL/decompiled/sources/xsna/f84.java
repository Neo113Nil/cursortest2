package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.Window;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.clips.attachments.impl.di.ClipsAttachmentsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.im.engine.models.VerificationStatus;
import com.vk.log.L;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.features.SearchFeatures;
import com.vk.video.stability.impl.di.VideoAppStabilityComponentImpl;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.Calendar;
import kotlin.text.Regex;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class f84 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ f84(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        Activity b;
        Window window;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.b) {
            case 0:
                int i = AttachmentsEditorView.C;
                return new i1t0(true, bo.h());
            case 1:
                return new yb4();
            case 2:
                Context context = e43.a;
                return Boolean.valueOf((context != null ? context : null).getResources().getConfiguration().getLayoutDirection() == 0);
            case 3:
                int i2 = ClipFeedListFragment.a2;
                return new v5e();
            case 4:
                qcy<Object>[] qcyVarArr = ClipsAttachmentsComponentImpl.f;
                return new qkq0();
            case 5:
                return new ulu0();
            case 6:
                return new a390();
            case 7:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return new t3f();
            case 8:
                return new kc10();
            case 9:
                iyk0 iyk0Var = hvi.a;
                return null;
            case 10:
                return s3q0.a;
            case 11:
                return new Matrix();
            case 12:
                return "#doStopEnvironment task running";
            case 13:
                return new Regex("^[\\w.-]+\\.cxhub\\.(ru|com)");
            case 14:
                return s3q0.a;
            case 15:
                return new jwx(2, 20);
            case 16:
                SparseArray sparseArray = new SparseArray();
                int b2 = cn70.b(20);
                abg0 abg0Var = dhr0.t;
                sparseArray.put(b2, abg0Var.b(R.drawable.vk_icon_hide_outline_20, R.attr.vk_ui_icon_contrast));
                sparseArray.put(cn70.b(28), abg0Var.b(R.drawable.vk_icon_hide_outline_28, R.attr.vk_ui_icon_contrast));
                return sparseArray;
            case 17:
                return Calendar.getInstance();
            case 18:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 19:
                StickerAttachment.a aVar = StickerAttachment.k;
                t6g0 t6g0Var = t6g0.b;
                return t6g0.d();
            case 20:
                try {
                    c63 c63Var = c63.a;
                    b = c63.b();
                } catch (Exception e) {
                    L.i(e);
                }
                if (b != null && (window = b.getWindow()) != null) {
                    dhr0.a.getClass();
                    Context E = dhr0.E();
                    ikv0.a aVar2 = new ikv0.a(E);
                    aVar2.u = new ikv0.d(E.getString(R.string.new_avatar_upload_error), (String) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), 6);
                    aVar2.p(window);
                    return s3q0.a;
                }
                return s3q0.a;
            case 21:
                return new q73(new ykg());
            case 22:
                try {
                    z = NativeLibLoader.j(NativeLibLoader.a, NativeLib.VK_QR_CODE);
                } catch (UnsatisfiedLinkError unused) {
                }
                return Boolean.valueOf(z);
            case 23:
                return s3q0.a;
            case 24:
                return s3q0.a;
            case 25:
                return VerificationStatus.h();
            case 26:
                qcy<Object>[] qcyVarArr3 = VideoAppStabilityComponentImpl.b;
                return new z1s0();
            case 27:
                int i3 = VideoCatalogRootVh.M0;
                return Boolean.valueOf(fxc0.B().J().r1());
            case 28:
                return tlo0.Companion.serializer();
            default:
                return ((SessionManagementComponent) com.vk.auth.main.f.a.getValue()).J2();
        }
    }
}
