package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.yandex.go.taxi.order.details.v2.analytics.perf.a;
import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.sharing.RideCardSharingView;
import defpackage.cvu0;
import defpackage.hnk0;
import defpackage.qnk0;
import defpackage.tje;
import defpackage.xby;
import defpackage.zbb1;
import java.io.File;
import java.util.List;

/* loaded from: classes14.dex */
public final class fnk0 implements bnk0 {
    public final /* synthetic */ RideCardSharingView a;

    public fnk0(RideCardSharingView rideCardSharingView) {
        this.a = rideCardSharingView;
    }

    @Override // defpackage.bnk0
    public final void nf(final qnk0 qnk0Var) {
        a aVar;
        bkk0 bkk0Var;
        final RideCardSharingView rideCardSharingView = this.a;
        aVar = rideCardSharingView.perfAnalyticsTracer;
        RideCardState$ProcessingStep rideCardState$ProcessingStep = qnk0Var.b;
        List list = qnk0Var.a;
        aVar.f(rideCardState$ProcessingStep, list.size());
        bkk0Var = rideCardSharingView.itemsAdapter;
        bkk0Var.submitList(list, new Runnable() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.presentation.sharing.a
            @Override // java.lang.Runnable
            public final void run() {
                com.yandex.go.taxi.order.details.v2.analytics.perf.a aVar2;
                hnk0 hnk0Var;
                Bitmap bitmap;
                File[] listFiles;
                RideCardSharingView rideCardSharingView2 = RideCardSharingView.this;
                aVar2 = rideCardSharingView2.perfAnalyticsTracer;
                qnk0 qnk0Var2 = qnk0Var;
                aVar2.e(qnk0Var2.b, qnk0Var2.a.size());
                hnk0Var = rideCardSharingView2.interactor;
                RideCardState$ProcessingStep rideCardState$ProcessingStep2 = qnk0Var2.b;
                Context context = hnk0Var.a;
                if (rideCardState$ProcessingStep2 == RideCardState$ProcessingStep.READY) {
                    rideCardSharingView2.measure(View.MeasureSpec.makeMeasureSpec(tje.t(context).widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    rideCardSharingView2.layout(0, 0, rideCardSharingView2.getMeasuredWidth(), rideCardSharingView2.getMeasuredHeight());
                    if (rideCardSharingView2.getMeasuredWidth() == 0 || rideCardSharingView2.getMeasuredHeight() == 0) {
                        bitmap = null;
                    } else {
                        bitmap = Bitmap.createBitmap(rideCardSharingView2.getMeasuredWidth(), rideCardSharingView2.getMeasuredHeight(), Bitmap.Config.RGB_565);
                        rideCardSharingView2.draw(new Canvas(bitmap));
                    }
                    if (bitmap == null) {
                        return;
                    }
                    File externalCacheDir = context.getExternalCacheDir();
                    if (externalCacheDir == null) {
                        externalCacheDir = context.getCacheDir();
                    }
                    File file = new File(externalCacheDir, "screenshots");
                    if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (cvu0.x(file2.getName(), "order_share_screenshot", false)) {
                                try {
                                    file2.delete();
                                } catch (SecurityException e) {
                                    xby.d.k(e, "Unable to delete screenshot " + file2.getName());
                                }
                            }
                        }
                    }
                    String str = hnk0Var.g.b().a;
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        char charAt = str.charAt(i);
                        if (Character.isLetterOrDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() == 0) {
                        sb2 = "unknown";
                    }
                    Uri c = zbb1.c(context, bitmap, "order_share_screenshot_" + sb2 + "_" + SystemClock.elapsedRealtime());
                    bitmap.recycle();
                    tje.N(hnk0Var.h, null, null, new RideCardSharingViewInteractor$shareOrderAndExit$1(hnk0Var, c, null), 3);
                }
            }
        });
    }
}
