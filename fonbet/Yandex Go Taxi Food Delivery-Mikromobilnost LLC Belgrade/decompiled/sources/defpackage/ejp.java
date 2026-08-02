package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Looper;
import android.os.Trace;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.cloudwebrtc.webrtc.record.FrameCapturer;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewView;
import com.yandex.go.navigator.gas_stations.overview.h;
import com.yandex.go.taxi.order.comment.FeedbackCommentModalView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView;
import com.ybsdk.core.analytics.performance.FirstDrawListener$drawListener$1;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;
import flex.engine.a;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.favorites.housemissing.HouseMissingModalView;
import ru.yandex.taxi.favorites.housemissing.b;
import ru.yandex.taxi.order.view.HorizontalButtonsView;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes15.dex */
public final /* synthetic */ class ejp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ejp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
        f8v f8vVar = (f8v) this.b;
        synchronized (f8vVar.P) {
            try {
                f8vVar.R = null;
                jdv jdvVar = f8vVar.Q;
                if (jdvVar != null) {
                    f8vVar.Q = null;
                    f8vVar.e(jdvVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                ((ljp) this.b).r(new qu(9));
                return;
            case 1:
                mqq mqqVar = (mqq) this.b;
                ((a) ((h3y) mqqVar.b).get()).w(true);
                r0 r0Var = ((hqq) ((h3y) mqqVar.c).get()).a;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                return;
            case 2:
                ((FeedbackCommentModalView) this.b).exit();
                return;
            case 3:
                awu awuVar = (awu) ((v1b) this.b).c;
                if (awuVar != null) {
                    awuVar.cancel();
                    return;
                }
                return;
            case 4:
                z0r z0rVar = (z0r) this.b;
                a1r a1rVar = z0rVar.x;
                String str = z0rVar.a;
                z83.g(null, a1rVar.e, Looper.myLooper());
                w53 w53Var = a1rVar.a;
                zq60 zq60Var = (zq60) w53Var.get(str);
                if (zq60Var != null) {
                    zq60Var.d(z0rVar);
                    if (zq60Var.isEmpty()) {
                        w53Var.remove(str);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                FirstDrawListener$drawListener$1.onDraw$lambda$0((adr) this.b);
                return;
            case 6:
                ((FloatingTitleToolbarComponent) this.b).initScrollTracker();
                return;
            case 7:
                ((nsr) this.b).b.e.prefetchDefaultFontManager();
                return;
            case 8:
                return;
            case 9:
                ryr ryrVar = (ryr) this.b;
                synchronized (ryrVar.w) {
                    try {
                        if (ryrVar.A == null) {
                            return;
                        }
                        try {
                            ozr d = ryrVar.d();
                            int i2 = d.f;
                            if (i2 == 2) {
                                synchronized (ryrVar.w) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + Extension.C_BRAKE);
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                qyr qyrVar = ryrVar.c;
                                Context context = ryrVar.a;
                                qyrVar.getClass();
                                Typeface a = ep11.a(context, new ozr[]{d}, 0);
                                MappedByteBuffer n = pw21.n(ryrVar.a, d.a);
                                if (n == null || a == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    wjm wjmVar = new wjm(a, ilb1.c(n));
                                    Trace.endSection();
                                    synchronized (ryrVar.w) {
                                        try {
                                            etn etnVar = ryrVar.A;
                                            if (etnVar != null) {
                                                etnVar.b(wjmVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    ryrVar.b();
                                    return;
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (ryrVar.w) {
                                try {
                                    etn etnVar2 = ryrVar.A;
                                    if (etnVar2 != null) {
                                        etnVar2.a(th2);
                                    }
                                    ryrVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 10:
                Iterator it = ((FragmentManager) this.b).o.iterator();
                while (it.hasNext()) {
                    ((ucs) it.next()).onBackStackChangeCancelled();
                }
                return;
            case 11:
                ((FrameCapturer) this.b).lambda$onFrame$0();
                return;
            case 12:
                cfs cfsVar = (cfs) this.b;
                Window window = cfsVar.a.getWindow();
                if (window == null) {
                    xby.l(jst.e, "FramesListener.FailedToGetWindow", null, null, "Failed to get activity window when remove listener", 6);
                    return;
                }
                try {
                    window.removeOnFrameMetricsAvailableListener(cfsVar.p);
                    cfsVar.n = false;
                    return;
                } catch (Exception e) {
                    xby.l(jst.e, "FramesListener.FailedToRemoveListener", null, e, "Failed to get activity window at stop", 2);
                    return;
                }
            case 13:
                FullScreenBannerPage.fullyVisibleViewChecker$lambda$0((FullScreenBannerPage) this.b);
                return;
            case 14:
                FullscreenDestinationSearchModalView.animateShow$lambda$0$0$0((AddressInputView) this.b);
                return;
            case 15:
                FundIncomeWidgetView.setupChartTouchArea$lambda$2((FundIncomeWidgetView) this.b);
                return;
            case 16:
                GasStationsFiltersModalView._init_$clearAllFilters((rus) this.b);
                return;
            case 17:
                GasStationsOverviewView.onAttachedToWindow$onBackPressed((h) this.b);
                return;
            case 18:
                apf apfVar = (apf) this.b;
                tdj tdjVar = (tdj) apfVar.w;
                ArrayDeque arrayDeque = (ArrayDeque) apfVar.c;
                if (tdjVar != null) {
                    arrayDeque.addFirst(tdjVar);
                    apfVar.k();
                    return;
                } else {
                    if (arrayDeque.isEmpty()) {
                        return;
                    }
                    apfVar.l((tdj) arrayDeque.remove());
                    return;
                }
            case 19:
                com.yandex.go.payments.cards.nfc.navigation.a aVar = (com.yandex.go.payments.cards.nfc.navigation.a) this.b;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context2 = aVar.a;
                intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                if (intent.resolveActivity(context2.getPackageManager()) != null) {
                    context2.startActivity(intent);
                    return;
                }
                return;
            case 20:
                ((mw2) this.b).invoke();
                return;
            case 21:
                PlaceholderView placeholderView = (PlaceholderView) this.b;
                if (xw31.n(placeholderView.getContext())) {
                    int v = xw31.v();
                    int[] iArr = new int[2];
                    placeholderView.getLocationOnScreen(iArr);
                    i = v - (placeholderView.getWidth() + iArr[0]);
                } else {
                    int[] iArr2 = new int[2];
                    placeholderView.getLocationOnScreen(iArr2);
                    i = -iArr2[0];
                }
                placeholderView.setStartOffset(i);
                placeholderView.setShimmering(true);
                return;
            case 22:
                ((zeu) this.b).a();
                return;
            case 23:
                ((h2t) this.b).i();
                return;
            case 24:
                HorizontalButtonsView.renderInfoState$lambda$0((t6j) this.b);
                return;
            case 25:
                HouseMissingModalView._init_$onCloseButtonClicked((b) this.b);
                return;
            case 26:
                HubFooterView.animateVisibility$lambda$1((HubFooterView) this.b);
                return;
            case 27:
                b();
                return;
            case 28:
                wjm wjmVar2 = (wjm) this.b;
                j63 j63Var = new j63();
                SharedPreferences sharedPreferences = (SharedPreferences) wjmVar2.b;
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    if (entry.getValue() instanceof Long) {
                        Long l = (Long) entry.getValue();
                        long longValue = l.longValue();
                        u3c.a.getClass();
                        if (longValue > System.currentTimeMillis()) {
                            ((ConcurrentHashMap) wjmVar2.c).put(entry.getKey(), l);
                        }
                    }
                    j63Var.add(entry.getKey());
                }
                if (j63Var.isEmpty()) {
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                r53 r53Var = new r53(j63Var);
                while (r53Var.hasNext()) {
                    edit.remove((String) r53Var.next());
                }
                edit.apply();
                return;
            default:
                throw new RuntimeException((Exception) this.b);
        }
    }
}
