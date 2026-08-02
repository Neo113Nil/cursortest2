package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerListener;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class hmj implements NavigationLayerListener {
    public final /* synthetic */ imj a;

    public hmj(imj imjVar) {
        this.a = imjVar;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.NavigationLayerListener
    public final void onModeChanged() {
        yeo yeoVar;
        imj imjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onModeChanged"));
            if ((e instanceof zy11) || (yeoVar = imjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = imjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(imj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.NavigationLayerListener
    public final void onSelectedRouteChanged() {
        yeo yeoVar;
        imj imjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onSelectedRouteChanged"));
            if ((e instanceof zy11) || (yeoVar = imjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = imjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(imj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
