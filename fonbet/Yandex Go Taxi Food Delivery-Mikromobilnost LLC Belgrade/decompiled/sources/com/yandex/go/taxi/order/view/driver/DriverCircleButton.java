package com.yandex.go.taxi.order.view.driver;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.RippleDrawable;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.rate.RateView;
import defpackage.a3y0;
import defpackage.evu0;
import defpackage.gim;
import defpackage.gtq0;
import defpackage.jbm;
import defpackage.jgv;
import defpackage.l8x;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.p7h;
import defpackage.pav;
import defpackage.qim;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.v7i0;
import defpackage.xhm;
import kotlin.Metadata;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/go/taxi/order/view/driver/DriverCircleButton;", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Ltt2;", "appDispatchers", "Lpav;", "imageLoader", "Lxhm;", "driverAnalytics", "Ljgv;", "imageUrlResolver", "<init>", "(Landroid/content/Context;Ltse;Ltt2;Lpav;Lxhm;Ljgv;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lgim;", "onShowButtonCallback", "Lzy11;", "showButton", "(Landroid/graphics/Bitmap;Lgim;)V", "Lqim;", "driver", "show", "(Lqim;Lgim;)V", "Ljava/lang/Runnable;", "clickListener", "setOnClickListener", "(Lqim;Ljava/lang/Runnable;)V", "onDetachedFromWindow", "()V", "Ltse;", "Ltt2;", "Lpav;", "Lxhm;", "Ljgv;", "La3y0;", "logger", "La3y0;", "Ll8x;", "downloadJob", "Ll8x;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DriverCircleButton extends IconCircleButton {
    public static final int $stable = 8;
    private final tt2 appDispatchers;
    private final tse coroutineScope;
    private l8x downloadJob;
    private final xhm driverAnalytics;
    private final pav imageLoader;
    private final jgv imageUrlResolver;
    private final a3y0 logger;

    public DriverCircleButton(Context context, tse tseVar, tt2 tt2Var, pav pavVar, xhm xhmVar, jgv jgvVar) {
        super(context, null, 0, 0, 14, null);
        this.coroutineScope = tseVar;
        this.appDispatchers = tt2Var;
        this.imageLoader = pavVar;
        this.driverAnalytics = xhmVar;
        this.imageUrlResolver = jgvVar;
        this.logger = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "DriverCircleButton");
        setIconPadding(0);
        setIconTintEnable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$0(DriverCircleButton driverCircleButton, qim qimVar, Runnable runnable) {
        driverCircleButton.driverAnalytics.c(qimVar);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String show$lambda$0() {
        return "Missing driver avatar image";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showButton(Bitmap bitmap, gim onShowButtonCallback) {
        if (isAttachedToWindow() && bitmap != null) {
            Resources resources = getResources();
            int color = getContext().getColor(mqg0.component_gray_150);
            setIcon(new RippleDrawable(gtq0.e(color), new BitmapDrawable(resources, bitmap), null));
            setVisibility(0);
            RateView.showDriver$lambda$0(((v7i0) onShowButtonCallback).a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.downloadJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
    }

    public final void setOnClickListener(qim driver, Runnable clickListener) {
        setDebounceClickListener(new p7h(6, this, driver, clickListener));
    }

    public final void show(qim driver, gim onShowButtonCallback) {
        String a = this.imageUrlResolver.a(driver.i);
        if (a == null || evu0.J(a)) {
            setVisibility(8);
            return;
        }
        setTitle(driver.f);
        setBadgeText(driver.d);
        int r = tje.r(mrg0.circle_buttons_circle_size, getContext());
        String a2 = this.imageUrlResolver.a(driver.i);
        if (a2 == null || a2.length() == 0) {
            a3y0.e(this.logger, new String[]{"show", "imageUrl"}, null, new jbm(10), 2);
        } else {
            this.downloadJob = tje.N(this.coroutineScope, null, null, new DriverCircleButton$show$2(this, onShowButtonCallback, a2, r, null), 3);
        }
    }
}
