package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.webkit.JavascriptInterface;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.dating.sdk.js.bridge.api.events.CaptureProtection$Error;
import com.vk.superapp.dating.sdk.js.bridge.api.events.CaptureProtection$Parameters;
import com.vk.superapp.dating.sdk.js.bridge.api.events.CaptureProtection$Response;
import com.vk.superapp.dating.sdk.js.bridge.api.events.GetPermissions$Parameters;
import com.vk.superapp.dating.sdk.js.bridge.api.events.GetPermissions$Response;
import com.vk.superapp.dating.sdk.js.bridge.api.events.NavigateToSettings$Parameters;
import com.vk.superapp.dating.sdk.js.bridge.api.events.NavigateToSettings$Response;
import kotlin.NoWhenBranchMatchedException;
import xsna.p2y;
import xsna.y3y;

/* compiled from: JsDatingSdkDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class b4y implements y3y {
    public final sbg b;
    public final xwv0 c;
    public final com.vk.superapp.base.js.bridge.b d;
    public final bpn0 e = new bpn0(new m2j(this, 21));
    public final bpn0 f = new bpn0(new qbj(this, 21));

    /* compiled from: JsDatingSdkDelegateImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NavigateToSettings$Parameters.Type.values().length];
            try {
                iArr[NavigateToSettings$Parameters.Type.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigateToSettings$Parameters.Type.VPN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PermissionHelper.PermissionResult.values().length];
            try {
                iArr2[PermissionHelper.PermissionResult.NOT_DETERMINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PermissionHelper.PermissionResult.ALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PermissionHelper.PermissionResult.NOT_ALLOWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PermissionHelper.PermissionResult.DONT_ASK_AGAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public b4y(sbg sbgVar, xwv0 xwv0Var, com.vk.superapp.base.js.bridge.b bVar) {
        this.b = sbgVar;
        this.c = xwv0Var;
        this.d = bVar;
    }

    @Override // xsna.x3y
    public final void P(p2y<GetPermissions$Parameters> p2yVar) {
        Activity b;
        GetPermissions$Response.Data.Camera camera;
        GetPermissions$Response.Data.Microphone microphone;
        GetPermissions$Response.Data.Photo photo;
        GetPermissions$Response.Data.PushNotifications pushNotifications;
        GetPermissions$Response.Data.Location location;
        JsMethod jsMethod = new JsMethod("VKWebAppGetPermissions");
        String b2 = p2yVar.b();
        com.vk.superapp.base.js.bridge.b bVar = this.d;
        bVar.k(jsMethod, b2);
        bpn0 bpn0Var = s1l.a;
        xwv0 xwv0Var = this.c;
        boolean P = j5g.P((Iterable) s1l.a.getValue(), xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null);
        bpn0 bpn0Var2 = this.e;
        if (!P) {
            ((vvp) bpn0Var2.getValue()).a(p2yVar);
            return;
        }
        Context context = ((r6y) this.b.c).l;
        if (context == null || (b = gnj.b(context)) == null) {
            ((vvp) bpn0Var2.getValue()).a(p2yVar);
            return;
        }
        PermissionHelper.a.getClass();
        PermissionHelper.PermissionResult p = PermissionHelper.p(b, PermissionHelper.l);
        PermissionHelper.PermissionResult p2 = PermissionHelper.p(b, PermissionHelper.m);
        PermissionHelper.PermissionResult p3 = PermissionHelper.p(b, PermissionHelper.t);
        PermissionHelper.PermissionResult p4 = PermissionHelper.p(b, PermissionHelper.b);
        PermissionHelper.PermissionResult p5 = PermissionHelper.p(b, PermissionHelper.h);
        JsMethod jsMethod2 = new JsMethod("VKWebAppGetPermissions");
        String b3 = p2yVar.b();
        int[] iArr = a.$EnumSwitchMapping$1;
        int i = iArr[p.ordinal()];
        if (i == 1) {
            camera = GetPermissions$Response.Data.Camera.DISABLED_CAN_ASK;
        } else if (i == 2) {
            camera = GetPermissions$Response.Data.Camera.GRANTED;
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            camera = GetPermissions$Response.Data.Camera.DISABLED;
        }
        int i2 = iArr[p2.ordinal()];
        if (i2 == 1) {
            microphone = GetPermissions$Response.Data.Microphone.DISABLED_CAN_ASK;
        } else if (i2 == 2) {
            microphone = GetPermissions$Response.Data.Microphone.GRANTED;
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            microphone = GetPermissions$Response.Data.Microphone.DISABLED;
        }
        GetPermissions$Response.Data.Microphone microphone2 = microphone;
        int i3 = iArr[p3.ordinal()];
        if (i3 == 1) {
            photo = GetPermissions$Response.Data.Photo.DISABLED_CAN_ASK;
        } else if (i3 == 2) {
            photo = GetPermissions$Response.Data.Photo.GRANTED;
        } else {
            if (i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            photo = GetPermissions$Response.Data.Photo.DISABLED;
        }
        GetPermissions$Response.Data.Photo photo2 = photo;
        int i4 = iArr[p4.ordinal()];
        if (i4 == 1) {
            pushNotifications = GetPermissions$Response.Data.PushNotifications.DISABLED_CAN_ASK;
        } else if (i4 == 2) {
            pushNotifications = GetPermissions$Response.Data.PushNotifications.GRANTED;
        } else {
            if (i4 != 3 && i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            pushNotifications = GetPermissions$Response.Data.PushNotifications.DISABLED;
        }
        GetPermissions$Response.Data.PushNotifications pushNotifications2 = pushNotifications;
        int i5 = iArr[p5.ordinal()];
        if (i5 == 1) {
            location = GetPermissions$Response.Data.Location.DISABLED_CAN_ASK;
        } else if (i5 == 2) {
            location = GetPermissions$Response.Data.Location.GRANTED;
        } else {
            if (i5 != 3 && i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            location = GetPermissions$Response.Data.Location.DISABLED;
        }
        com.vk.superapp.base.js.bridge.b.p(bVar, jsMethod2, new GetPermissions$Response(null, new GetPermissions$Response.Data(camera, microphone2, photo2, pushNotifications2, location, null, p2yVar.b(), 32, null), b3, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.y3y, xsna.x3y
    @JavascriptInterface
    public void VKWebAppCaptureProtection(String str) {
        y3y.a.VKWebAppCaptureProtection(this, str);
    }

    @Override // xsna.y3y, xsna.x3y
    @JavascriptInterface
    public void VKWebAppGetPermissions(String str) {
        y3y.a.VKWebAppGetPermissions(this, str);
    }

    @Override // xsna.y3y, xsna.x3y
    @JavascriptInterface
    public void VKWebAppNavigateToSettings(String str) {
        y3y.a.VKWebAppNavigateToSettings(this, str);
    }

    @Override // xsna.x3y
    public final void Z(p2y<CaptureProtection$Parameters> p2yVar) {
        this.d.k(new JsMethod("VKWebAppCaptureProtection"), p2yVar.b());
        if (!(p2yVar.a instanceof p2y.a)) {
            bpn0 bpn0Var = s1l.a;
            xwv0 xwv0Var = this.c;
            if (j5g.P((Iterable) s1l.a.getValue(), xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null)) {
                String b = p2yVar.a().b();
                final boolean c = p2yVar.a().c();
                qro0.c(new gzs() { // from class: xsna.a4y
                    @Override // xsna.gzs
                    public final Object invoke() {
                        VkUiView view;
                        Activity B0;
                        Window window;
                        VkUiView view2;
                        Activity B02;
                        Window window2;
                        boolean z = c;
                        b4y b4yVar = this;
                        if (z) {
                            xwv0 xwv0Var2 = b4yVar.c;
                            if (xwv0Var2 != null && (view2 = xwv0Var2.getView()) != null && (B02 = view2.B0()) != null && (window2 = B02.getWindow()) != null) {
                                window2.addFlags(8192);
                            }
                        } else {
                            xwv0 xwv0Var3 = b4yVar.c;
                            if (xwv0Var3 != null && (view = xwv0Var3.getView()) != null && (B0 = view.B0()) != null && (window = B0.getWindow()) != null) {
                                window.clearFlags(8192);
                            }
                        }
                        return s3q0.a;
                    }
                });
                com.vk.superapp.base.js.bridge.b.p(((a2n0) this.f.getValue()).a, new JsMethod("VKWebAppCaptureProtection"), new CaptureProtection$Response(null, new CaptureProtection$Response.Data(c, b), b, 1, null), null, null, false, null, 60);
                return;
            }
        }
        com.vk.superapp.base.js.bridge.b.o(((vvp) this.e.getValue()).a, new JsMethod("VKWebAppCaptureProtection"), new CaptureProtection$Error(null, new CaptureProtection$Error.Data(CaptureProtection$Error.Data.Type.CLIENT_ERROR, p2yVar.b(), null), 1, null), null, null, 12);
    }

    @Override // xsna.x3y
    public final void w0(p2y<NavigateToSettings$Parameters> p2yVar) {
        this.d.k(new JsMethod("VKWebAppNavigateToSettings"), p2yVar.b());
        bpn0 bpn0Var = s1l.a;
        xwv0 xwv0Var = this.c;
        if (!j5g.P((Iterable) s1l.a.getValue(), xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null)) {
            com.vk.superapp.base.js.bridge.b.o(((vvp) this.e.getValue()).a, new JsMethod("VKWebAppNavigateToSettings"), new pli(7), null, null, 12);
            return;
        }
        NavigateToSettings$Parameters a2 = p2yVar.a();
        NavigateToSettings$Parameters.Type d = a2.d();
        if (d == null) {
            d = NavigateToSettings$Parameters.Type.COMMON;
        }
        a2n0 a2n0Var = (a2n0) this.f.getValue();
        String c = a2.c();
        com.vk.superapp.base.js.bridge.b.p(a2n0Var.a, new JsMethod("VKWebAppNavigateToSettings"), new NavigateToSettings$Response(null, new NavigateToSettings$Response.Data(true, c), c, 1, null), null, null, false, null, 60);
        qro0.c(new com.vk.movika.sdk.base.ui.i(17, this, d));
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
