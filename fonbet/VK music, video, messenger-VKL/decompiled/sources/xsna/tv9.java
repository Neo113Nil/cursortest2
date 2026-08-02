package xsna;

import android.content.Context;
import android.util.Size;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.sharing.core.view.InterceptingBottomSheetBehavior;
import com.vkontakte.android.R;
import org.webrtc.RenderSynchronizer;
import ru.ok.media.NativeAACCaptureAndEncode;
import ru.ok.proto.okmp.OkmpPublisher;
import xsna.b7d0;
import xsna.by1;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tv9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tv9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = 4;
        Object obj = this.c;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                ikv0.a aVar = new ikv0.a(context);
                float f = 28;
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_info_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), new Size(iah0.a(f), iah0.a(f)), 8);
                aVar.u = new ikv0.d(context.getString(R.string.ecomm_cart_unique_product_amount_exceeded_title), context.getString(R.string.ecomm_cart_unique_product_amount_exceeded_subtitle), (ikv0.d.a) null, i2);
                aVar.n();
                break;
            case 1:
                bpn0 bpn0Var = t65.a;
                t65.a(((fzf) obj).c.getSelectedCellView());
                break;
            case 2:
                ComposeView composeView = ((CommunityRepliesFragment) obj).V;
                if (composeView != null) {
                    xo2.f(composeView, false, true, 300L);
                    break;
                }
                break;
            case 3:
                hal halVar = (hal) obj;
                by1.a J = halVar.J();
                halVar.R(J, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new ur(J, 12));
                halVar.g.d();
                break;
            case 4:
                InterceptingBottomSheetBehavior interceptingBottomSheetBehavior = (InterceptingBottomSheetBehavior) obj;
                interceptingBottomSheetBehavior.X(4);
                if (!interceptingBottomSheetBehavior.n0) {
                    interceptingBottomSheetBehavior.n0 = true;
                    x750 x750Var = interceptingBottomSheetBehavior.l0;
                    if (x750Var != null) {
                        x750Var.invoke();
                        break;
                    }
                }
                break;
            case 5:
                MusicDownloadsHistoryCatalogRootVh musicDownloadsHistoryCatalogRootVh = (MusicDownloadsHistoryCatalogRootVh) obj;
                mzp0 mzp0Var = musicDownloadsHistoryCatalogRootVh.G;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                g3a.a(musicDownloadsHistoryCatalogRootVh.u, musicDownloadsHistoryCatalogRootVh);
                break;
            case 6:
                ((com.vk.music.offline.impl.sync.d) obj).u(o25.a().c());
                break;
            case 7:
                NativeAACCaptureAndEncode.release$lambda$2((NativeAACCaptureAndEncode) obj);
                break;
            case 8:
                ((OkmpPublisher) obj).start();
                break;
            case 9:
                ((q1d0) obj).C();
                break;
            case 10:
                b7d0.a aVar2 = (b7d0.a) obj;
                aVar2.c.e(120, aVar2.b);
                break;
            case 11:
                cxe0 cxe0Var = (cxe0) obj;
                cxe0Var.getClass();
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        try {
                            cxe0Var.b(cxe0Var.c());
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Exception e) {
                            try {
                                L l = L.a;
                                l.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.w(l, L.LogType.e, e, new Object[]{"RateLimitedMessageQueue", "RateLimitedMessageQueue error"}, null, null, 24);
                                }
                                s3q0 s3q0Var2 = s3q0.a;
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (InterruptedException unused2) {
                        return;
                    }
                }
                break;
            case 12:
                ((RenderSynchronizer) obj).lambda$new$0();
                break;
            case 13:
                ((RecyclerView) obj).invalidateItemDecorations();
                break;
            case 14:
                rxo0 rxo0Var = (rxo0) obj;
                rxo0Var.a.stop(rxo0Var.c[2]);
                break;
            default:
                yads.uw2.b((yads.uw2) obj);
                break;
        }
    }

    public /* synthetic */ tv9(uv9 uv9Var, Context context) {
        this.b = 0;
        this.c = context;
    }
}
