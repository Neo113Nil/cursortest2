package defpackage;

import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.SurfaceHolderCallbackCompat;
import io.flutter.embedding.android.a;
import io.flutter.embedding.engine.renderer.f;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class jrr implements ctr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jrr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    @Override // defpackage.ctr
    public final void onFlutterUiDisplayed() {
        lrr lrrVar;
        Set set;
        FlutterSurfaceView flutterSurfaceView;
        f fVar;
        f fVar2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                lrrVar = aVar.host;
                lrrVar.onFlutterUiDisplayed();
                aVar.isFlutterUiDisplayed = true;
                aVar.isFirstFrameRendered = true;
                break;
            case 1:
                ((f) obj).d = true;
                break;
            case 2:
                FlutterView flutterView = (FlutterView) obj;
                flutterView.isFlutterUiDisplayed = true;
                set = flutterView.flutterUiDisplayListeners;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ctr) it.next()).onFlutterUiDisplayed();
                }
                break;
            default:
                SurfaceHolderCallbackCompat surfaceHolderCallbackCompat = (SurfaceHolderCallbackCompat) obj;
                flutterSurfaceView = surfaceHolderCallbackCompat.flutterSurfaceView;
                flutterSurfaceView.setAlpha(1.0f);
                fVar = surfaceHolderCallbackCompat.flutterRenderer;
                if (fVar != null) {
                    fVar2 = surfaceHolderCallbackCompat.flutterRenderer;
                    fVar2.a.removeIsDisplayingFlutterUiListener(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ctr
    public final void onFlutterUiNoLongerDisplayed() {
        lrr lrrVar;
        Set set;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                lrrVar = aVar.host;
                lrrVar.onFlutterUiNoLongerDisplayed();
                aVar.isFlutterUiDisplayed = false;
                break;
            case 1:
                ((f) obj).d = false;
                break;
            case 2:
                FlutterView flutterView = (FlutterView) obj;
                flutterView.isFlutterUiDisplayed = false;
                set = flutterView.flutterUiDisplayListeners;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ctr) it.next()).onFlutterUiNoLongerDisplayed();
                }
                break;
        }
    }
}
