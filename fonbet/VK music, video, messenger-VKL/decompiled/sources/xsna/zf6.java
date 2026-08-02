package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import com.navigation.vk.RouterComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.rvn;
import xsna.ug5;
import xsna.ysa.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zf6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zf6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        p180 onBackPressedDispatcher_delegate$lambda$0;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((QrWebToAppComponent) ((k7m) m7m.f((dg6) obj)).a(fpf0.a(QrWebToAppComponent.class))).getHandler();
            case 1:
                k67 k67Var = (k67) obj;
                Context context = k67Var.b;
                long j = k67Var.f;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                return new ehe0(context, j == timeUnit.toMillis(0L) ? ug5.b.b : j == timeUnit.toMillis(1L) ? ug5.c.b : j == timeUnit.toMillis(5L) ? ug5.a.b : j == timeUnit.toMillis(30L) ? ug5.d.b : ug5.a.b);
            case 2:
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return new dng((ProfileFragmentProviderComponent) obj);
            case 3:
                return ((ysa) obj).new b();
            case 4:
                return ((NotificationsComponent) ((hlg) obj).b.getValue()).b();
            case 5:
                onBackPressedDispatcher_delegate$lambda$0 = ComponentActivity.onBackPressedDispatcher_delegate$lambda$0((ComponentActivity) obj);
                return onBackPressedDispatcher_delegate$lambda$0;
            case 6:
                List<Map.Entry> D0 = j5g.D0(new rvn.b(), ((rvn) obj).a.entrySet());
                int e = on00.e(c5g.u(D0, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Map.Entry entry : D0) {
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    linkedHashMap.put(pair.i(), pair.j());
                }
                return linkedHashMap;
            case 7:
                return ((BridgeComponent) ((gxw) obj).c().a(fpf0.a(BridgeComponent.class))).H2();
            case 8:
                return ((RouterComponent) ((LinksBridgeComponentImpl) obj).a.getValue()).a();
            case 9:
                return Boolean.valueOf(p1p0.a(((r360) obj).d().e().getNetworkType()));
            case 10:
                return (AttachmentMappersComponent) ((g8m) obj).c(fpf0.a(AttachmentMappersComponent.class));
            case 11:
                PhotosComponentImpl photosComponentImpl = (PhotosComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = PhotosComponentImpl.u;
                ysg0<m7a0> a = photosComponentImpl.p7().a();
                nwy nwyVar = photosComponentImpl.n;
                qcy<Object> qcyVar = PhotosComponentImpl.u[13];
                return new h8a0(a, (aga0) nwyVar.c());
            case 12:
                bpn0 bpn0Var = ((aid0) obj).r;
                if (!lhs.d()) {
                    return new ixf0((thd0) bpn0Var.getValue());
                }
                lhs.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
                try {
                    return new ixf0((thd0) bpn0Var.getValue());
                } finally {
                    lhs.b();
                }
            case 13:
                VKApplication vKApplication = (VKApplication) obj;
                VKApplication.a aVar = VKApplication.c;
                if (!BuildInfo.h()) {
                    vKApplication = null;
                }
                if (vKApplication != null) {
                    return vKApplication.getExternalFilesDir(null);
                }
                return null;
            case 14:
                gdr0 gdr0Var = (gdr0) obj;
                try {
                    Field declaredField = LayoutInflater.class.getDeclaredField("mPrivateFactory");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(gdr0Var);
                    LayoutInflater.Factory2 factory2 = obj2 instanceof LayoutInflater.Factory2 ? (LayoutInflater.Factory2) obj2 : null;
                    declaredField.setAccessible(false);
                    return factory2;
                } catch (NoSuchFieldException e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                    return null;
                }
            default:
                return new GeoComponentImpl.a(((jau0) obj).b);
        }
    }
}
