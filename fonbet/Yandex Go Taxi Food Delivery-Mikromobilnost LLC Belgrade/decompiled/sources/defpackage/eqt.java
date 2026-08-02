package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.panorama.impl.GoPanoramaView;
import defpackage.cwa1;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public final class eqt implements dqt {
    public final Context a;

    public eqt(Context context) {
        this.a = context;
    }

    @Override // defpackage.dqt
    public final View a(aqt aqtVar) {
        GoPanoramaView goPanoramaView = new GoPanoramaView(this.a, null, 0, 6, null);
        goPanoramaView.setPinImageResource(aqtVar.a);
        ub90 ub90Var = aqtVar.b;
        if (ub90Var instanceof sb90) {
            goPanoramaView.showPanoramaByGeo(cwa1.d(((sb90) ub90Var).a));
        } else {
            if (!(ub90Var instanceof tb90)) {
                w511.b();
                return null;
            }
            tb90 tb90Var = (tb90) ub90Var;
            goPanoramaView.showPanoramaById(tb90Var.a, cwa1.d(tb90Var.b));
        }
        goPanoramaView.setFullHeight(aqtVar.c);
        goPanoramaView.setAddPinInCenter(aqtVar.d);
        goPanoramaView.setScalePin(aqtVar.e);
        goPanoramaView.setEnableZoom(true);
        goPanoramaView.setSetMaxZoom(aqtVar.i);
        goPanoramaView.setEnableMove(aqtVar.j);
        goPanoramaView.setEnablePinRotation(aqtVar.k);
        goPanoramaView.setOnPanoramaReadyListener(aqtVar.f);
        goPanoramaView.setChangePinPosition(aqtVar.l);
        goPanoramaView.setZoomChangedCallback(aqtVar.m);
        goPanoramaView.setUserJumpInPanoramaCallback(aqtVar.n);
        goPanoramaView.setCameraDirectionChangedCallback(aqtVar.o);
        goPanoramaView.setOnPanoramaErrorLoad(aqtVar.g);
        View view = aqtVar.h;
        if (view != null) {
            goPanoramaView.setPinView(view);
        }
        return goPanoramaView;
    }

    @Override // defpackage.dqt
    public final View c(final zzs zzsVar, int i, tls tlsVar) {
        final GoPanoramaView goPanoramaView = new GoPanoramaView(this.a, null, 0, 6, null);
        goPanoramaView.setAlpha(0.0f);
        goPanoramaView.setUseTextureView(true);
        goPanoramaView.disableLoadingWheel();
        goPanoramaView.setNoninteractive(true);
        goPanoramaView.setPinImageResource(i);
        goPanoramaView.setSpan(90.0d, 90.0d);
        goPanoramaView.setOnPanoramaReadyListener(new bdp(20, tlsVar, goPanoramaView));
        WeakHashMap weakHashMap = b.a;
        if (goPanoramaView.isAttachedToWindow()) {
            goPanoramaView.showPanoramaByGeo(cwa1.d(zzsVar));
            return goPanoramaView;
        }
        goPanoramaView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.panorama.impl.GoPanoramaViewFactoryImpl$createPanoramaPreview$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                goPanoramaView.removeOnAttachStateChangeListener(this);
                goPanoramaView.showPanoramaByGeo(cwa1.d(zzsVar));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
        return goPanoramaView;
    }
}
