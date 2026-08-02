package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import android.view.Choreographer;
import android.view.View;
import android.view.WindowManager;
import com.airbnb.lottie.parser.moshi.a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import core.flex.ui.OrientationAwareRecyclerView;
import flex.core.velocity.FpsMonitoringHelper;
import flex.core.velocity.FpsMonitoringHelper$callback$1;
import flex.engine.section.model.ScrollPosition;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import just.adapter.snapping.b;
import kotlin.Result;
import okio.ByteString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.analytics.referrer.analytics.ReferrerSource;
import ru.yandex.taxi.analytics.referrer.d;

/* loaded from: classes.dex */
public final class hzk implements hfm, pjr, mas, InstallReferrerStateListener {
    public Object a;
    public Object b;

    public hzk(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public static int e(OrientationAwareRecyclerView orientationAwareRecyclerView, u0x u0xVar, int i, ScrollPosition scrollPosition, int i2, View view) {
        Integer h = h(orientationAwareRecyclerView, u0xVar, scrollPosition, view.getMeasuredHeight());
        if (h == null) {
            int i3 = b3x.a[scrollPosition.ordinal()];
            int i4 = 0;
            if (i3 != 1) {
                if (i3 == 2) {
                    i4 = (i2 - view.getMeasuredHeight()) / 2;
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return 0;
                    }
                    i4 = i2 - view.getMeasuredHeight();
                }
            }
            h = Integer.valueOf(i + i4);
        }
        return h.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer h(OrientationAwareRecyclerView orientationAwareRecyclerView, u0x u0xVar, ScrollPosition scrollPosition, int i) {
        d2t0 b;
        Float f;
        Float f2;
        Context context = orientationAwareRecyclerView.getContext();
        int measuredHeight = orientationAwareRecyclerView.getMeasuredHeight();
        if (!(u0xVar instanceof a2t0)) {
            return null;
        }
        a2t0 a2t0Var = (a2t0) u0xVar;
        if (a2t0Var.c() != null && scrollPosition == ScrollPosition.TOP) {
            d2t0 c = a2t0Var.c();
            if (c == null || (f2 = c.a) == null) {
                return null;
            }
            return Integer.valueOf(m810.b(f2.floatValue() * context.getResources().getDisplayMetrics().density));
        }
        if (a2t0Var.b() == null || scrollPosition != ScrollPosition.BOTTOM || (b = a2t0Var.b()) == null || (f = b.a) == null) {
            return null;
        }
        return Integer.valueOf((measuredHeight - i) - m810.b(f.floatValue() * context.getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hzk n(String... strArr) {
        String str;
        try {
            ByteString[] byteStringArr = new ByteString[strArr.length];
            yp6 yp6Var = new yp6();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = a.x;
                yp6Var.e0(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str2.charAt(i3);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                        if (i2 < i3) {
                            yp6Var.w0(i2, i3, str2);
                        }
                        yp6Var.x0(str);
                        i2 = i3 + 1;
                    } else {
                        if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                        }
                        yp6Var.x0(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    yp6Var.w0(i2, length, str2);
                }
                yp6Var.e0(34);
                yp6Var.readByte();
                byteStringArr[i] = yp6Var.l0(yp6Var.b);
            }
            return new hzk((String[]) strArr.clone(), ffx.b0(byteStringArr));
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }

    public lxq b() {
        return new lxq((String) this.a, ((HashMap) this.b) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.b)));
    }

    public Serializable f(o3d0 o3d0Var) {
        try {
            iq20 b = ((nle) ((yvi0) this.b).a).b((String) ((qda0) this.a).invoke(o3d0Var));
            pr20 pr20Var = b != null ? b.a : null;
            String K = pr20Var != null ? cvw.K(pr20Var) : null;
            if (K != null) {
                return K;
            }
            throw new IllegalArgumentException(("Host for " + o3d0Var + " is absent!").toString());
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    @Override // defpackage.mas
    public void g(String str) {
        FpsMonitoringHelper fpsMonitoringHelper = (FpsMonitoringHelper) this.b;
        FpsMonitoringHelper$callback$1 fpsMonitoringHelper$callback$1 = fpsMonitoringHelper.g;
        i3y i3yVar = fpsMonitoringHelper.a;
        if (fpsMonitoringHelper.b == 0) {
            ((Choreographer) i3yVar.getValue()).removeFrameCallback(fpsMonitoringHelper$callback$1);
            ((Choreographer) i3yVar.getValue()).postFrameCallback(fpsMonitoringHelper$callback$1);
        }
    }

    public int i() {
        cne0 cne0Var = (cne0) this.b;
        int i = cne0Var.i("show_daily_count", 0);
        long j = cne0Var.j("last_showed_day", 0L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (wf7.e(((jtq0) this.a).b(null), calendar)) {
            return i;
        }
        return 0;
    }

    @Override // defpackage.mas
    public void j(Context context) {
        if (context == null) {
            return;
        }
        FpsMonitoringHelper fpsMonitoringHelper = (FpsMonitoringHelper) this.b;
        fpsMonitoringHelper.getClass();
        fpsMonitoringHelper.e = (Build.VERSION.SDK_INT >= 30 ? context.getDisplay() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay()) != null ? Double.valueOf(r3.getRefreshRate()) : null;
    }

    public void k(String str) {
        vng.z((Context) this.a, str, new mgu(11, this, str));
    }

    public void o(String str) {
        Double d;
        FpsMonitoringHelper fpsMonitoringHelper = (FpsMonitoringHelper) this.b;
        ((Choreographer) fpsMonitoringHelper.a.getValue()).removeFrameCallback(fpsMonitoringHelper.g);
        int i = fpsMonitoringHelper.b;
        fpsMonitoringHelper.b = 0;
        long j = fpsMonitoringHelper.c;
        fpsMonitoringHelper.c = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        long j2 = fpsMonitoringHelper.d;
        fpsMonitoringHelper.d = Long.MIN_VALUE;
        Integer num = null;
        if (i != 0 && j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED && j2 != Long.MIN_VALUE) {
            long j3 = j2 - j;
            if (j3 >= fpsMonitoringHelper.f && (d = fpsMonitoringHelper.e) != null) {
                double doubleValue = d.doubleValue();
                if (doubleValue != 0.0d) {
                    num = Integer.valueOf(y6i0.d(m810.a((i * 100) / ((j3 / 1.0E9d) * doubleValue)), 0, 100));
                }
            }
        }
        if (num != null) {
            ((o631) this.a).f(num.intValue(), String.format("FPSPerformanceMeasurement.%s.hitchRatio", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        xby.l(jst.e, "INSTALL_REFERRER_LISTENER", null, null, "InstallReferrer service disconnected", 6);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.b;
        if (i == 0) {
            d dVar = (d) this.a;
            dVar.getClass();
            try {
                String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                if (installReferrer.length() > 0) {
                    dVar.a.a(installReferrer, ReferrerSource.GOOGLE);
                    SharedPreferences.Editor edit = ((SharedPreferences) dVar.b.b.getValue()).edit();
                    edit.putString("referrer", installReferrer);
                    edit.putBoolean("fetched", true);
                    edit.apply();
                }
            } catch (RemoteException e) {
                xby.l(jst.e, "INSTALL_REFERRER_LISTENER", null, null, g8e.o("InstallReferrer remote call failed: ", e.getMessage()), 6);
            }
        } else if (i == 1) {
            xby.l(jst.e, "INSTALL_REFERRER_LISTENER", null, null, "InstallReferrer service is unavailable", 6);
        } else if (i == 2) {
            xby.l(jst.e, "INSTALL_REFERRER_LISTENER", null, null, "InstallReferrer is not supported", 6);
        }
        installReferrerClient.endConnection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(gki0 gki0Var, u0x u0xVar, int i, int i2) {
        b bVar = (b) this.a;
        bVar.b();
        a2t0 a2t0Var = u0xVar instanceof a2t0 ? (a2t0) u0xVar : null;
        t1t0 e = a2t0Var != null ? a2t0Var.e() : null;
        if (e != null) {
            bVar.c(e);
        }
        gki0Var.r(i, i2);
        if (e != null) {
            bVar.a();
        }
    }

    public void s() {
        com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) this.b;
        plr plrVar = (plr) this.a;
        aVar.i(new u131("handleInsetsInFlex", plrVar.a), new u131("ignoreFitSystemWindows", plrVar.b));
    }

    @Override // defpackage.mas
    public void t(String str) {
        o(str);
    }

    public void v(Annotation annotation) {
        if (((HashMap) this.b) == null) {
            this.b = new HashMap();
        }
        ((HashMap) this.b).put(annotation.annotationType(), annotation);
    }

    public /* synthetic */ hzk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ hzk(Object obj, boolean z) {
        this.b = obj;
    }

    public /* synthetic */ hzk(Object obj) {
        this.b = null;
        this.a = obj;
    }
}
