package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import androidx.emoji2.emojipicker.EmojiPickerView;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.go.drive.vertical.ui.double_content_modal.DoubleContentModalView;
import com.yandex.go.dynamic.impl.ui.loading.DynamicFeatureLoadingLoadingModalView;
import com.yandex.go.navigator.driving.DrivingModeNotification;
import com.yandex.go.navigator.driving.f;
import com.yandex.go.navigator.driving.w;
import com.yandex.go.settings.email.EmailModalView;
import com.yandex.go.superapp.web_chat.ui.EatsOrderWebChatModalView;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;
import com.yandex.go.taxi.order.driver.profile.view.profile.DriverProfileModalView;
import com.yandex.go.taxi.order.search.ui.driver.DriverAcceptanceGradientView;
import com.yandex.go.trusted_contacts.share_settings.edit.EditContactNameModalView;
import defpackage.cjs0;
import defpackage.cma1;
import defpackage.i3y;
import defpackage.ibm;
import defpackage.kbm;
import flex.engine.a;
import flex.feature.document.fragment.DocumentBottomSheetFragment;
import flex.feature.document.fragment.DocumentDialogFragment;
import ru.yandex.taxi.due_selector.impl.presentation.ui.variants.DueVariantsState;
import ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data.c;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes14.dex */
public final /* synthetic */ class bxl implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bxl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a engine_delegate$lambda$1;
        a engine_delegate$lambda$12;
        zy11 _init_$lambda$1;
        zy11 addLayoutUpdateListener$lambda$0;
        View insetsType$lambda$0;
        zy11 driverFoundAnimatorsSet$lambda$0$1;
        zy11 _init_$lambda$2;
        zy11 onAttachedToWindow$lambda$0;
        View insetsType$lambda$02;
        View insetsType$lambda$03;
        View insetsType$lambda$04;
        View insetsType$lambda$05;
        ztn createEmojiPickerBodyAdapter$lambda$3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                engine_delegate$lambda$1 = DocumentBottomSheetFragment.engine_delegate$lambda$1((DocumentBottomSheetFragment) obj);
                return engine_delegate$lambda$1;
            case 1:
                engine_delegate$lambda$12 = DocumentDialogFragment.engine_delegate$lambda$1((DocumentDialogFragment) obj);
                return engine_delegate$lambda$12;
            case 2:
                return (d0m) ((i3y) obj).getValue();
            case 3:
                _init_$lambda$1 = DoubleContentModalView._init_$lambda$1((DoubleContentModalView) obj);
                return _init_$lambda$1;
            case 4:
                Object systemService = ((FragmentActivity) ((q4g) obj).b).getSystemService("download");
                if (systemService != null) {
                    return (DownloadManager) systemService;
                }
                return null;
            case 5:
                final ibm ibmVar = (ibm) obj;
                return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1
                    @Override // android.graphics.drawable.Drawable.Callback
                    public void invalidateDrawable(Drawable d) {
                        ibm.this.z.setValue(Integer.valueOf(((Number) ibm.this.z.getValue()).intValue() + 1));
                        ibm ibmVar2 = ibm.this;
                        Drawable drawable = ibmVar2.y;
                        i3y i3yVar = kbm.a;
                        ibmVar2.A.setValue(new cjs0((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : cma1.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public void scheduleDrawable(Drawable d, Runnable what, long time) {
                        ((Handler) kbm.a.getValue()).postAtTime(what, time);
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public void unscheduleDrawable(Drawable d, Runnable what) {
                        ((Handler) kbm.a.getValue()).removeCallbacks(what);
                    }
                };
            case 6:
                ((DriveHostView) obj).requestFocus();
                return zy11Var;
            case 7:
                TaxiMapView taxiMapView = (TaxiMapView) obj;
                return new Rect(taxiMapView.getPaddingLeft(), taxiMapView.getPaddingTop(), taxiMapView.getPaddingRight(), taxiMapView.getPaddingBottom());
            case 8:
                addLayoutUpdateListener$lambda$0 = DriverAcceptanceGradientView.addLayoutUpdateListener$lambda$0((DriverAcceptanceGradientView) obj);
                return addLayoutUpdateListener$lambda$0;
            case 9:
                return Integer.valueOf((int) ((avj0) ((zuj0) obj)).b(wug0.driver_avatar_size));
            case 10:
                return g8e.o("current tag = ", ((oim) obj).f);
            case 11:
                insetsType$lambda$0 = DriverProfileModalView.insetsType$lambda$0((DriverProfileModalView) obj);
                return insetsType$lambda$0;
            case 12:
                qjm qjmVar = (qjm) obj;
                ojm ojmVar = (ojm) qjmVar.b.poll();
                qjmVar.c = ojmVar;
                if (ojmVar != null) {
                    ojmVar.a.start();
                }
                return zy11Var;
            case 13:
                driverFoundAnimatorsSet$lambda$0$1 = DriverSectionView.driverFoundAnimatorsSet$lambda$0$1((DriverSectionView) obj);
                return driverFoundAnimatorsSet$lambda$0$1;
            case 14:
                return Float.valueOf(((avj0) ((f) obj).f).b(mrg0.go_design_m_space));
            case 15:
                _init_$lambda$2 = DrivingModeNotification._init_$lambda$2((DrivingModeNotification) obj);
                return _init_$lambda$2;
            case 16:
                ((w) obj).g.getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 17:
                return new qrm((androidx.compose.material3.w) obj);
            case 18:
                ((sls) ((xjg) obj).c).invoke();
                return zy11Var;
            case 19:
                onAttachedToWindow$lambda$0 = DueVariantsState.onAttachedToWindow$lambda$0((DueVariantsState) obj);
                return onAttachedToWindow$lambda$0;
            case 20:
                insetsType$lambda$02 = DynamicFeatureLoadingLoadingModalView.insetsType$lambda$0((DynamicFeatureLoadingLoadingModalView) obj);
                return insetsType$lambda$02;
            case 21:
                nfh nfhVar = (nfh) obj;
                Context context = (Context) nfhVar.a;
                ((sah) ((h9n) nfhVar.c)).getClass();
                Drawable drawable = context.getDrawable(a4h0.go_splash_logo);
                if (drawable != null) {
                    return ffx.e0(drawable);
                }
                return null;
            case 22:
                insetsType$lambda$03 = EatsOrderWebChatModalView.insetsType$lambda$0((EatsOrderWebChatModalView) obj);
                return insetsType$lambda$03;
            case 23:
                zhn zhnVar = (zhn) obj;
                Canvas canvas = zhnVar.b;
                Context context2 = zhnVar.a;
                return sb2.l(canvas, context2, tje.y(f2h0.eboks_objects_overlay_bg, context2), new wa60(0.3f, 0.7f, 0.13f, 0.87f), new wa60(0.4f, 0.6f, 0.49f, 0.51f));
            case 24:
                insetsType$lambda$04 = EditContactNameModalView.insetsType$lambda$0((EditContactNameModalView) obj);
                return insetsType$lambda$04;
            case 25:
                return Boolean.valueOf(((com.yandex.messaging.internal.view.input.edit.a) obj).B.a(tz10.D));
            case 26:
                ((c) obj).f.i();
                return zy11Var;
            case 27:
                insetsType$lambda$05 = EmailModalView.insetsType$lambda$0((EmailModalView) obj);
                return insetsType$lambda$05;
            case 28:
                ((f28) obj).r(new qu(9));
                return zy11Var;
            default:
                createEmojiPickerBodyAdapter$lambda$3 = EmojiPickerView.createEmojiPickerBodyAdapter$lambda$3((EmojiPickerView) obj);
                return createEmojiPickerBodyAdapter$lambda$3;
        }
    }
}
