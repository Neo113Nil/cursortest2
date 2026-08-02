package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import flex.engine.model.DocumentErrorIssueType;
import flex.engine.state.DocumentState$Tag;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.flutter.plugins.camerax.CameraXError;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ik91 {
    public static final jiu a = new jiu(13);

    public static final void a(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-902032374);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.c(an91.o(c530Var, 16.0f, 20.0f, 16.0f, 0.0f, 8), 0.5f), 12.0f);
            byk0 c = cyk0.c(16.0f);
            b8m b8mVar = yx91.a;
            com.yandex.go.design.compose.loading.b.a(e, c, false, b8mVar, null, null, false, btsVar, 12582912, BuildConfig.API_LEVEL);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(an91.n(c530Var, 16.0f, 10.0f, 16.0f, 20.0f), 0.5f), 12.0f), cyk0.c(16.0f), false, b8mVar, null, null, false, btsVar, 12582912, BuildConfig.API_LEVEL);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new orq0(f530Var, i, 3);
        }
    }

    public static xzl b(mlr mlrVar) {
        ywl ywlVar;
        String str = (String) mlrVar.w("last_document");
        if (str == null || (ywlVar = (ywl) h3m.b.a.get(str)) == null) {
            return null;
        }
        Bundle bundle = (Bundle) mlrVar.w("redirect");
        u1m e = bundle != null ? hk91.e(bundle) : null;
        Long l = (Long) mlrVar.w("lifetime");
        f0m f0mVar = l != null ? new f0m(Long.valueOf(l.longValue())) : f0m.b;
        Boolean bool = (Boolean) mlrVar.w("stale_if_error");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) mlrVar.w("screen_is_broken");
        return new xzl(ywlVar, e, f0mVar, booleanValue, bool2 != null ? bool2.booleanValue() : false);
    }

    public static int c(mlr mlrVar) {
        Integer num = (Integer) mlrVar.w("epoch");
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static e3m d(mlr mlrVar) {
        Bundle bundle;
        DocumentState$Tag documentState$Tag = (DocumentState$Tag) mlrVar.w("state_tag");
        if (documentState$Tag != null) {
            int i = f3m.a[documentState$Tag.ordinal()];
            if (i == 1) {
                zyl zylVar = new zyl(c(mlrVar));
                xzl b = b(mlrVar);
                Bundle bundle2 = (Bundle) mlrVar.w("query");
                return new a3m(zylVar, b, bundle2 != null ? hk91.e(bundle2) : null);
            }
            if (i == 2) {
                Bundle bundle3 = (Bundle) mlrVar.w("query");
                if (bundle3 != null) {
                    u1m e = hk91.e(bundle3);
                    int c = c(mlrVar);
                    xzl b2 = b(mlrVar);
                    String str = (String) mlrVar.w("preview_document");
                    return new b3m(c, b2, e, str != null ? (ywl) h3m.b.a.get(str) : null);
                }
            } else if (i == 3) {
                Bundle bundle4 = (Bundle) mlrVar.w("query");
                if (bundle4 != null) {
                    u1m e2 = hk91.e(bundle4);
                    int c2 = c(mlrVar);
                    xzl b3 = b(mlrVar);
                    String str2 = (String) mlrVar.w("preview_document");
                    return new c3m(c2, b3, e2, str2 != null ? (ywl) h3m.b.a.get(str2) : null);
                }
            } else if (i == 4) {
                xzl b4 = b(mlrVar);
                if (b4 != null && (bundle = (Bundle) mlrVar.w("action_callbacks_config")) != null) {
                    zwl zwlVar = new zwl(bundle.getBoolean("finish_enabled"), bundle.getBoolean("awake_enabled"));
                    Bundle bundle5 = (Bundle) mlrVar.w("previous_lifecycle_callbacks_config");
                    if (bundle5 != null) {
                        zwl zwlVar2 = new zwl(bundle5.getBoolean("finish_enabled"), bundle5.getBoolean("awake_enabled"));
                        int c3 = c(mlrVar);
                        Bundle bundle6 = (Bundle) mlrVar.w("query");
                        return new d3m(c3, b4, bundle6 != null ? hk91.e(bundle6) : null, zwlVar, zwlVar2);
                    }
                }
            } else {
                if (i != 5) {
                    w511.b();
                    return null;
                }
                Bundle bundle7 = (Bundle) mlrVar.w("query");
                if (bundle7 != null) {
                    u1m e3 = hk91.e(bundle7);
                    Bundle bundle8 = (Bundle) mlrVar.w("error");
                    if (bundle8 != null) {
                        String string = bundle8.getString("type");
                        if (string == null) {
                            string = "";
                        }
                        String string2 = bundle8.getString(Constants.KEY_MESSAGE);
                        String str3 = string2 != null ? string2 : "";
                        String string3 = bundle8.getString("issue_code");
                        if (string3 == null) {
                            string3 = "UNKNOWN";
                        }
                        azl azlVar = new azl(string, str3, DocumentErrorIssueType.valueOf(string3));
                        Integer num = (Integer) mlrVar.w("epoch");
                        return new z2m(num != null ? num.intValue() : 1, b(mlrVar), e3, azlVar);
                    }
                }
            }
        }
        return null;
    }

    public static void e(xzl xzlVar, mlr mlrVar) {
        mlrVar.m(h3m.b.b(xzlVar.a), "last_document");
        u1m u1mVar = xzlVar.b;
        if (u1mVar != null) {
            mlrVar.m(hk91.c(u1mVar), "redirect");
        }
        Long l = xzlVar.c.a;
        mlrVar.m(Long.valueOf(l != null ? l.longValue() : 0L), "lifetime");
        mlrVar.m(Boolean.valueOf(xzlVar.d), "stale_if_error");
        mlrVar.m(Boolean.valueOf(xzlVar.e), "screen_is_broken");
    }

    public static void f(e3m e3mVar, mlr mlrVar) {
        if (e3mVar instanceof a3m) {
            a3m a3mVar = (a3m) e3mVar;
            zyl zylVar = a3mVar.a;
            mlrVar.m(Integer.valueOf(zylVar != null ? zylVar.a : 1), "epoch");
            mlrVar.m(DocumentState$Tag.IDLE, "state_tag");
            u1m u1mVar = a3mVar.c;
            if (u1mVar != null) {
                mlrVar.m(hk91.c(u1mVar), "query");
            }
            xzl xzlVar = a3mVar.b;
            if (xzlVar != null) {
                e(xzlVar, mlrVar);
                return;
            }
            return;
        }
        if (e3mVar instanceof b3m) {
            b3m b3mVar = (b3m) e3mVar;
            mlrVar.m(Integer.valueOf(b3mVar.a), "epoch");
            mlrVar.m(DocumentState$Tag.LOADING, "state_tag");
            mlrVar.m(hk91.c(b3mVar.c), "query");
            xzl xzlVar2 = b3mVar.b;
            if (xzlVar2 != null) {
                e(xzlVar2, mlrVar);
            }
            ywl ywlVar = b3mVar.d;
            if (ywlVar != null) {
                mlrVar.m(h3m.b.b(ywlVar), "preview_document");
                return;
            }
            return;
        }
        if (e3mVar instanceof c3m) {
            c3m c3mVar = (c3m) e3mVar;
            mlrVar.m(Integer.valueOf(c3mVar.a), "epoch");
            mlrVar.m(DocumentState$Tag.REFRESHING, "state_tag");
            mlrVar.m(hk91.c(c3mVar.c), "query");
            xzl xzlVar3 = c3mVar.b;
            if (xzlVar3 != null) {
                e(xzlVar3, mlrVar);
            }
            ywl ywlVar2 = c3mVar.d;
            if (ywlVar2 != null) {
                mlrVar.m(h3m.b.b(ywlVar2), "preview_document");
                return;
            }
            return;
        }
        if (!(e3mVar instanceof d3m)) {
            if (!(e3mVar instanceof z2m)) {
                w511.b();
                return;
            }
            z2m z2mVar = (z2m) e3mVar;
            mlrVar.m(Integer.valueOf(z2mVar.a), "epoch");
            mlrVar.m(DocumentState$Tag.FAILED, "state_tag");
            mlrVar.m(hk91.c(z2mVar.c), "query");
            xzl xzlVar4 = z2mVar.b;
            if (xzlVar4 != null) {
                e(xzlVar4, mlrVar);
            }
            azl azlVar = z2mVar.d;
            Bundle bundle = new Bundle();
            bundle.putString("type", azlVar.a);
            bundle.putString(Constants.KEY_MESSAGE, azlVar.b);
            bundle.putString("issue_code", azlVar.c.toString());
            mlrVar.m(bundle, "error");
            return;
        }
        d3m d3mVar = (d3m) e3mVar;
        mlrVar.m(Integer.valueOf(d3mVar.a), "epoch");
        mlrVar.m(DocumentState$Tag.RENDERED, "state_tag");
        u1m u1mVar2 = d3mVar.c;
        if (u1mVar2 != null) {
            mlrVar.m(hk91.c(u1mVar2), "query");
        }
        e(d3mVar.b, mlrVar);
        zwl zwlVar = d3mVar.d;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("finish_enabled", zwlVar.a);
        bundle2.putBoolean("awake_enabled", zwlVar.b);
        mlrVar.m(bundle2, "action_callbacks_config");
        zwl zwlVar2 = d3mVar.e;
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("finish_enabled", zwlVar2.a);
        bundle3.putBoolean("awake_enabled", zwlVar2.b);
        mlrVar.m(bundle3, "previous_lifecycle_callbacks_config");
    }

    public static void g(tt5 tt5Var, final sm7 sm7Var) {
        rs10 j = sm7Var != null ? sm7Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.PendingRecording.withAudioEnabled", j, obj);
        if (sm7Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: qsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    sm7 sm7Var2 = sm7Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            androidx.camera.video.b bVar = (androidx.camera.video.b) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                if (qke.h((Context) sm7Var2.a.A, "android.permission.RECORD_AUDIO") == 0) {
                                    bVar.b(booleanValue);
                                }
                                g = Collections.singletonList(bVar);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            androidx.camera.video.b bVar2 = (androidx.camera.video.b) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                bVar2.h = true;
                                g2 = Collections.singletonList(bVar2);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            List list2 = (List) obj2;
                            try {
                                g3 = Collections.singletonList(((androidx.camera.video.b) list2.get(0)).a(((Context) sm7Var2.a.A).getMainExecutor(), new k9b(12, (jn31) list2.get(1))));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.PendingRecording.asPersistentRecording", j, obj);
        if (sm7Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: qsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            androidx.camera.video.b bVar = (androidx.camera.video.b) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                if (qke.h((Context) sm7Var2.a.A, "android.permission.RECORD_AUDIO") == 0) {
                                    bVar.b(booleanValue);
                                }
                                g = Collections.singletonList(bVar);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            androidx.camera.video.b bVar2 = (androidx.camera.video.b) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                bVar2.h = true;
                                g2 = Collections.singletonList(bVar2);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            List list2 = (List) obj2;
                            try {
                                g3 = Collections.singletonList(((androidx.camera.video.b) list2.get(0)).a(((Context) sm7Var2.a.A).getMainExecutor(), new k9b(12, (jn31) list2.get(1))));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.PendingRecording.start", j, obj);
        if (sm7Var == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: qsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            androidx.camera.video.b bVar = (androidx.camera.video.b) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                if (qke.h((Context) sm7Var2.a.A, "android.permission.RECORD_AUDIO") == 0) {
                                    bVar.b(booleanValue);
                                }
                                g = Collections.singletonList(bVar);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            androidx.camera.video.b bVar2 = (androidx.camera.video.b) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                bVar2.h = true;
                                g2 = Collections.singletonList(bVar2);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            List list2 = (List) obj2;
                            try {
                                g3 = Collections.singletonList(((androidx.camera.video.b) list2.get(0)).a(((Context) sm7Var2.a.A).getMainExecutor(), new k9b(12, (jn31) list2.get(1))));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                    }
                }
            });
        }
    }
}
