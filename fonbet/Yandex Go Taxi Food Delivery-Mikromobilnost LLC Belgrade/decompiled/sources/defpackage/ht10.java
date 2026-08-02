package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.fintechsdk.features.bdui.api.dependencies.navigation.action.DeeplinkResolution;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.deeplink.DeeplinkResult;
import com.yandex.go.payments.common.a;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView$linearLayoutManager$1;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import io.flutter.plugins.imagepicker.Messages;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.metadata.di.IMetadataComponent;
import ru.rt.ebs.cryptosdk.core.networkClient.di.INetworkClientComponent;
import ru.rt.ebs.cryptosdk.core.networkClient.entities.INetworkClient;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.order.f;

/* loaded from: classes15.dex */
public class ht10 implements qx10, IMetadataComponent, iqs, ca20, qt5, INetworkClientComponent, pdv, jg5, jc70, w9a0, fa80, t52 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public ht10(Bitmap bitmap, byte[] bArr) {
        this.a = 14;
        if (!((bArr != null) ^ (bitmap != null))) {
            ny61.f("You should specify bitmap or bytes");
            throw null;
        }
        this.b = bitmap;
        this.c = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r2 == null) goto L12;
     */
    @Override // defpackage.w9a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(u0k u0kVar, Continuation continuation) {
        if (u0kVar instanceof u19) {
            TaxiOrder b = ((o2y0) this.b).b();
            u19 u19Var = (u19) u0kVar;
            String str = u19Var.a;
            if (str == null) {
                ief iefVar = b.V().K;
                str = iefVar != null ? iefVar.b : null;
            }
            String str2 = b.V().v;
            return ((a) this.c).b(u19Var, str2 != null ? avu0.h(str2) : null, str, (ContinuationImpl) continuation);
        }
        return null;
    }

    @Override // defpackage.pdv
    public jdv acquireLatestImage() {
        return j(((tis0) this.b).acquireLatestImage());
    }

    @Override // defpackage.jc70
    public boolean b() {
        return ((jc70) this.b).b();
    }

    @Override // defpackage.qx10
    public void c(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.b;
        arrayList2.add(0, arrayList);
        ((ce5) this.c).a(arrayList2);
    }

    @Override // defpackage.pdv
    public void close() {
        ((tis0) this.b).close();
    }

    @Override // defpackage.t52
    public void d(int i, boolean z) {
        a3v a3vVar;
        OrganizationsModalView$linearLayoutManager$1 organizationsModalView$linearLayoutManager$1;
        a3v a3vVar2;
        int anchorHeight;
        OrganizationsModalView organizationsModalView = (OrganizationsModalView) this.b;
        organizationsModalView.updateExpandedTopScrimForState(i);
        boolean z2 = i == 6 || i == 4;
        if (i == 4) {
            a3vVar = organizationsModalView.focusCoordinator;
            a3vVar.Td(((AnchorBottomSheetBehavior) this.c).a, OrganizationsModalView.class);
        } else if (i == 6) {
            a3vVar2 = organizationsModalView.focusCoordinator;
            anchorHeight = organizationsModalView.getAnchorHeight();
            a3vVar2.Td(anchorHeight, OrganizationsModalView.class);
        }
        organizationsModalView$linearLayoutManager$1 = organizationsModalView.linearLayoutManager;
        organizationsModalView$linearLayoutManager$1.b0 = !z2;
        if (z2) {
            organizationsModalView.showHeaderAnimated();
        }
    }

    @Override // defpackage.jc70
    public List e(Integer num) {
        List e = ((jc70) this.b).e(null);
        ows0 ows0Var = (ows0) this.c;
        int i = ows0Var.v;
        if (i < 0) {
            return e;
        }
        return kotlin.collections.a.m0(e, ipb1.c(ows0Var, num, i, Integer.valueOf(ows0Var.G(i, ows0Var.b))));
    }

    @Override // defpackage.qx10
    public void g(Messages.FlutterError flutterError) {
        ((ce5) this.c).a(Messages.a(flutterError));
    }

    @Override // defpackage.pdv
    public int getHeight() {
        return ((tis0) this.b).getHeight();
    }

    @Override // ru.rt.ebs.cryptosdk.core.metadata.di.IMetadataComponent
    public IMetadataController getMetadataController() {
        c9v c9vVar = (c9v) this.c;
        if (c9vVar != null) {
            return c9vVar;
        }
        Context context = ((an8) this.b).getContext();
        boolean z = false;
        c9v c9vVar2 = new c9v(new ht10(4, new abe(context, z, z)), new ru.rt.ebs.cryptosdk.core.metadata.data.system.location.a(context), new nwk0());
        this.c = c9vVar2;
        return c9vVar2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.networkClient.di.INetworkClientComponent
    public INetworkClient getNetworkClient() {
        at20 at20Var = (at20) this.c;
        if (at20Var != null) {
            return at20Var;
        }
        h9e h9eVar = new h9e(1, ((boj0) this.b).j(d70.e));
        at20 at20Var2 = new at20();
        at20Var2.a = h9eVar;
        at20Var2.b = EmptySet.a;
        this.c = at20Var2;
        return at20Var2;
    }

    @Override // defpackage.pdv
    public Surface getSurface() {
        return ((tis0) this.b).getSurface();
    }

    @Override // defpackage.pdv
    public int getWidth() {
        return ((tis0) this.b).getWidth();
    }

    @Override // defpackage.pdv
    public int h() {
        return ((tis0) this.b).h();
    }

    @Override // defpackage.t52
    public void i(float f, boolean z, View view) {
        ((OrganizationsModalView) this.b).updateExpandedTopScrimForSlide(f);
    }

    public x4r0 j(jdv jdvVar) {
        q6x0 q6x0Var;
        if (jdvVar == null) {
            return null;
        }
        if (((m6f0) this.c) == null) {
            q6x0Var = q6x0.b;
        } else {
            m6f0 m6f0Var = (m6f0) this.c;
            Pair pair = new Pair(m6f0Var.j, m6f0Var.k.get(0));
            q6x0 q6x0Var2 = q6x0.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            q6x0Var = new q6x0(arrayMap);
        }
        this.c = null;
        return new x4r0(jdvVar, new Size(jdvVar.getWidth(), jdvVar.getHeight()), new bp7(new bx31(null, q6x0Var, jdvVar.G0().getTimestamp())));
    }

    public void k() {
        ((f) this.b).H.t(cta1.d(((o2y0) this.c).c()), "cancel");
        f fVar = (f) this.b;
        o2y0 o2y0Var = (o2y0) this.c;
        fVar.W(o2y0Var, o2y0Var.b().h.b, null);
    }

    @Override // defpackage.pdv
    public int l() {
        return ((tis0) this.b).l();
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        if (!x920Var.a.equals("getDeviceInfo")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        String str = Build.BRAND;
        hashMap.put("brand", str);
        String str2 = Build.DEVICE;
        hashMap.put("device", str2);
        hashMap.put("display", Build.DISPLAY);
        String str3 = Build.FINGERPRINT;
        hashMap.put("fingerprint", str3);
        String str4 = Build.HARDWARE;
        hashMap.put("hardware", str4);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, Build.HOST);
        hashMap.put("id", Build.ID);
        String str5 = Build.MANUFACTURER;
        hashMap.put("manufacturer", str5);
        String str6 = Build.MODEL;
        hashMap.put("model", str6);
        String str7 = Build.PRODUCT;
        hashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str7);
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", scc.g(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", scc.g(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", scc.g(Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", Build.TAGS);
        hashMap.put("type", Build.TYPE);
        String str8 = "unknown";
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!((cvu0.x(str, "generic", false) && cvu0.x(str2, "generic", false)) || cvu0.x(str3, "generic", false) || cvu0.x(str3, "unknown", false) || evu0.y(str4, "goldfish", false) || evu0.y(str4, "ranchu", false) || evu0.y(str6, "google_sdk", false) || evu0.y(str6, "Emulator", false) || evu0.y(str6, "Android SDK built for x86", false) || evu0.y(str5, "Genymotion", false) || evu0.y(str7, "sdk", false) || evu0.y(str7, "vbox86p", false) || evu0.y(str7, "emulator", false) || evu0.y(str7, "simulator", false))));
        FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.b).getSystemAvailableFeatures();
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (featureInfo.name != null) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        hashMap.put("systemFeatures", arrayList2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("baseOS", Build.VERSION.BASE_OS);
        hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        hashMap2.put("codename", Build.VERSION.CODENAME);
        hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap2.put("release", Build.VERSION.RELEASE);
        hashMap2.put("sdkInt", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("version", hashMap2);
        Display defaultDisplay = ((WindowManager) this.c).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("widthPx", Double.valueOf(displayMetrics.widthPixels));
        hashMap3.put("heightPx", Double.valueOf(displayMetrics.heightPixels));
        hashMap3.put("xDpi", Float.valueOf(displayMetrics.xdpi));
        hashMap3.put("yDpi", Float.valueOf(displayMetrics.ydpi));
        hashMap.put("displayMetrics", hashMap3);
        try {
            str8 = Build.getSerial();
        } catch (SecurityException unused) {
        }
        hashMap.put("serialNumber", str8);
        ((ba20) da20Var).success(hashMap);
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        ((Surface) this.b).release();
        ((SurfaceTexture) this.c).release();
    }

    @Override // defpackage.qt5
    public void q(ByteBuffer byteBuffer, yfg yfgVar) {
        ea20 ea20Var = (ea20) this.c;
        fa20 fa20Var = ea20Var.c;
        try {
            ((ca20) this.b).onMethodCall(fa20Var.a(byteBuffer), new ba20(0, this, yfgVar));
        } catch (RuntimeException e) {
            Log.e("MethodChannel#" + ea20Var.b, "Failed to handle method call", e);
            yfgVar.a(fa20Var.c(e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        switch (this.a) {
            case 3:
                c9v c9vVar = (c9v) this.c;
                if (c9vVar != null) {
                    c9vVar.stopLocationTracker();
                }
                this.c = null;
                break;
            default:
                this.c = null;
                break;
        }
    }

    @Override // defpackage.pdv
    public void u(odv odvVar, Executor executor) {
        ((tis0) this.b).u(new h2r(17, this, odvVar), executor);
    }

    @Override // defpackage.pdv
    public jdv w() {
        return j(((tis0) this.b).w());
    }

    @Override // defpackage.pdv
    public void x() {
        ((tis0) this.b).x();
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        DeeplinkResult deeplinkResult;
        wm50 wm50Var = jh5Var.a;
        if (ig5Var instanceof s470) {
            s470 s470Var = (s470) ig5Var;
            lg5 lg5Var = (lg5) this.b;
            vm50 vm50Var = s470Var.c;
            vm50 vm50Var2 = s470Var.d;
            lg5Var.getClass();
            int i = t470.a[DeeplinkResolution.NOT_HANDLED.ordinal()];
            if (i == 1) {
                if (vm50Var != null) {
                    wm50Var.dispatch(vm50Var);
                    return;
                }
                return;
            }
            if (i == 2) {
                if (vm50Var2 != null) {
                    wm50Var.dispatch(vm50Var2);
                    return;
                }
                return;
            }
            if (i != 3) {
                w511.b();
                return;
            }
            sae saeVar = (sae) this.c;
            String str = s470Var.a;
            Boolean bool = s470Var.b;
            saeVar.getClass();
            try {
                Context context = (Context) ((fke) saeVar.b).a();
                if (context == null) {
                    deeplinkResult = DeeplinkResult.FAILURE;
                } else {
                    Uri parse = Uri.parse(str);
                    String scheme = parse.getScheme();
                    if (scheme != null && scheme.length() != 0) {
                        if (!jl40.l(bool, Boolean.TRUE) || jl40.l(parse.getScheme(), Constants.SCHEME)) {
                            context.startActivity(sae.r(parse));
                            deeplinkResult = DeeplinkResult.SUCCESS;
                        } else {
                            deeplinkResult = DeeplinkResult.FAILURE;
                        }
                    }
                    deeplinkResult = DeeplinkResult.FAILURE;
                }
            } catch (ActivityNotFoundException unused) {
                deeplinkResult = DeeplinkResult.NO_APP_FOUND;
            } catch (Exception unused2) {
                deeplinkResult = DeeplinkResult.FAILURE;
            }
            int i2 = t470.b[deeplinkResult.ordinal()];
            if (i2 == 1) {
                if (vm50Var != null) {
                    wm50Var.dispatch(vm50Var);
                }
            } else if (i2 != 2 && i2 != 3) {
                w511.b();
            } else if (vm50Var2 != null) {
                wm50Var.dispatch(vm50Var2);
            }
        }
    }

    public /* synthetic */ ht10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ ht10(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ ht10(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ht10(Object obj, IComponent iComponent, int i) {
        this.a = i;
        this.b = iComponent;
    }

    public /* synthetic */ ht10() {
        this.a = 8;
    }

    public ht10(View view, arg argVar) {
        this.a = 1;
        this.b = argVar;
        TextView textView = (TextView) view.findViewById(e9h0.message_time);
        this.c = textView;
        textView.setVisibility(4);
        textView.setText((CharSequence) null);
    }
}
