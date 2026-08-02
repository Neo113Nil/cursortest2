package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.Image;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import com.yandex.delivery.live.location.impl.data.LiveLocationApi;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.go.sdk_registry.api.SdkLogLevel;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.performer_position.impl.data.PerformerPositionApi;

/* loaded from: classes11.dex */
public final class dab1 implements jm0, ka4, ii6, o0p, qop0, vyu0, ty60, c5c0, gjd0, htl0, e8p0, yqq0, vvv0 {
    public static dab1 a;
    public static volatile rg8 z;
    public static final dab1 b = new dab1();
    public static final dab1 c = new dab1();
    public static final dab1 w = new dab1();
    public static final dab1 x = new dab1();
    public static final dab1 y = new dab1();
    public static final dab1 A = new dab1();
    public static final dab1 B = new dab1();
    public static final dab1 C = new dab1();
    public static final dab1 D = new dab1();
    public static final dab1 E = new dab1();
    public static final dab1 F = new dab1();
    public static final dab1 G = new dab1();
    public static final dab1 H = new dab1();
    public static final ak00 I = new ak00(10);
    public static final dab1 J = new dab1();
    public static final dab1 K = new dab1();
    public static final iw90 L = new iw90();
    public static final dab1 M = new dab1();
    public static final dab1 N = new dab1();
    public static final dab1 O = new dab1();
    public static final dab1 P = new dab1();
    public static final dab1 Q = new dab1();
    public static final dab1 R = new dab1();

    public static final String c(Scenario scenario) {
        if (scenario instanceof Scenario.SbpTokenBinding) {
            return "bind_sbp_token";
        }
        if (scenario instanceof Scenario.CardBinding) {
            return "card_binding";
        }
        if (scenario instanceof Scenario.Payment) {
            return "payment";
        }
        if (scenario instanceof Scenario.SelectMethod) {
            return "select";
        }
        if (scenario instanceof Scenario.TransportCards) {
            return "transport_cards";
        }
        if (scenario instanceof Scenario.Verification) {
            return "verification";
        }
        if (scenario instanceof Scenario.GooglePlayBinding) {
            return "googlepay_binding";
        }
        if (scenario instanceof Scenario.DynamicLinkFlow) {
            return "dynamic_link_flow";
        }
        if (scenario instanceof Scenario.Unbinding) {
            return "unbind_payment_method";
        }
        if (scenario instanceof Scenario.TransportBanner) {
            return "transport_banner";
        }
        if (scenario instanceof Scenario.Widget) {
            return "widget";
        }
        w511.b();
        return null;
    }

    public static IObjectWrapper i(xzv xzvVar) {
        int i = xzvVar.g;
        if (i == -1) {
            Bitmap bitmap = xzvVar.a;
            cvw.l(bitmap);
            return ObjectWrapper.wrap(bitmap);
        }
        if (i != 17) {
            if (i == 35) {
                return ObjectWrapper.wrap(xzvVar.c == null ? null : (Image) xzvVar.c.b);
            }
            if (i != 842094169) {
                throw new MlKitException(oyr.i(xzvVar.g, "Unsupported image format: "), 3);
            }
        }
        ByteBuffer byteBuffer = xzvVar.b;
        cvw.l(byteBuffer);
        return ObjectWrapper.wrap(byteBuffer);
    }

    public static int j(xzv xzvVar) {
        int i = xzvVar.g;
        if (i == -1) {
            Bitmap bitmap = xzvVar.a;
            cvw.l(bitmap);
            return bitmap.getAllocationByteCount();
        }
        if (i == 17 || i == 842094169) {
            ByteBuffer byteBuffer = xzvVar.b;
            cvw.l(byteBuffer);
            return byteBuffer.limit();
        }
        if (i != 35) {
            return 0;
        }
        Image.Plane[] a2 = xzvVar.a();
        cvw.l(a2);
        return (a2[0].getBuffer().limit() * 3) / 2;
    }

    public static LiveLocationApi l(t0k0 t0k0Var) {
        return (LiveLocationApi) t0k0Var.b(LiveLocationApi.class);
    }

    public static nzx0 o() {
        return new nzx0();
    }

    public static PerformerPositionApi p(t0k0 t0k0Var) {
        return (PerformerPositionApi) t0k0Var.b(PerformerPositionApi.class);
    }

    public static void q(String str) {
        f69 f69Var = xi7.a;
        f69.k("reportEvent: " + str + Extension.FIX_SPACE + ((Object) null), Collections.singletonList("Reporter"));
        g4j0.a("reportEvent", b.i(new Pair("name", str), new Pair("params", null)));
    }

    public static hrs0 r(pav pavVar) {
        return new hrs0(pavVar);
    }

    public static grs0 s(pav pavVar) {
        return new grs0(pavVar);
    }

    public static synchronized void t() {
        synchronized (dab1.class) {
            if (a == null) {
                a = new dab1();
            }
        }
    }

    @Override // defpackage.ii6
    public Rect a(Activity activity) {
        h2b1 h2b1Var = ii6.Y0;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } else {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null));
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            h2b1Var.getClass();
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                h2b1Var.getClass();
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // defpackage.ii6
    public Rect d(Activity activity) {
        Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Rect(0, 0, point.x, point.y);
    }

    @Override // defpackage.vyu0
    public void e(uyu0 uyu0Var) {
        uyu0Var.clear();
    }

    @Override // defpackage.vyu0
    public boolean f(Object obj, Object obj2) {
        return false;
    }

    public boolean g() {
        return false;
    }

    public Object h() {
        throw new IllegalStateException("");
    }

    @Override // defpackage.e8p0
    public String k() {
        return "jet";
    }

    public void m(SdkLogLevel sdkLogLevel, String str, String str2, Throwable th) {
        int i;
        hst hstVar = jst.e;
        int i2 = lrt.a[sdkLogLevel.ordinal()];
        if (i2 == 1) {
            i = 5;
        } else if (i2 == 2) {
            i = 10;
        } else if (i2 == 3) {
            i = 15;
        } else {
            if (i2 != 4) {
                w511.b();
                return;
            }
            i = 20;
        }
        hstVar.a(i, str, th, str2);
    }

    public void n(ViewGroup viewGroup, MotionEvent motionEvent) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1 || actionMasked == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }
}
