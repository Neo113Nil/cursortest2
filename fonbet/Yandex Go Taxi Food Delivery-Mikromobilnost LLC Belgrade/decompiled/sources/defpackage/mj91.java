package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.legacy.util.Position;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class mj91 {
    public static final reu a = new reu(16, new omy0());

    public static Position a(String str) {
        if (str != null && !str.equals("left")) {
            if (str.equals("right")) {
                return Position.RIGHT;
            }
            z83.j("Unknown position: ".concat(str));
            return Position.LEFT;
        }
        return Position.LEFT;
    }

    public static int b(n0l n0lVar, DisplayMetrics displayMetrics) {
        String str = n0lVar.a;
        int i = n0lVar.b;
        if ("dp".equals(str)) {
            return (int) TypedValue.applyDimension(1, i, displayMetrics);
        }
        if ("sp".equals(n0lVar.a)) {
            return (int) TypedValue.applyDimension(2, i, displayMetrics);
        }
        z83.j("No unit size defined");
        return -1;
    }

    public static float c(ctk ctkVar) {
        if (ctkVar == null) {
            return 1.0f;
        }
        double d = ctkVar.b;
        if (d <= 0.0d) {
            d = 1.0d;
        }
        return (float) d;
    }

    public static void d(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraControl.enableTorch", j, obj);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: zrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i2 = i;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            qp7 qp7Var = (qp7) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            wrb0 wrb0Var = new wrb0(ce5Var, 1);
                            n52Var2.getClass();
                            euy f = qp7Var.f(booleanValue);
                            hh5 hh5Var = new hh5(12, wrb0Var);
                            f.c(new tqs(0, f, hh5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 1:
                            List list2 = (List) obj2;
                            qp7 qp7Var2 = (qp7) list2.get(0);
                            double doubleValue = ((Double) list2.get(1)).doubleValue();
                            wrb0 wrb0Var2 = new wrb0(ce5Var, 4);
                            n52Var2.getClass();
                            euy d = qp7Var2.d((float) doubleValue);
                            sr4 sr4Var = new sr4(17, wrb0Var2);
                            d.c(new tqs(0, d, sr4Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 2:
                            List list3 = (List) obj2;
                            qp7 qp7Var3 = (qp7) list3.get(0);
                            fur furVar = (fur) list3.get(1);
                            wrb0 wrb0Var3 = new wrb0(ce5Var, 5);
                            n52Var2.getClass();
                            euy j2 = qp7Var3.j(furVar);
                            pm5 pm5Var = new pm5(14, wrb0Var3);
                            j2.c(new tqs(0, j2, pm5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 3:
                            qp7 qp7Var4 = (qp7) ((List) obj2).get(0);
                            wrb0 wrb0Var4 = new wrb0(ce5Var, 3);
                            n52Var2.getClass();
                            euy l = qp7Var4.l();
                            hh5 hh5Var2 = new hh5(13, wrb0Var4);
                            l.c(new tqs(0, l, hh5Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        default:
                            List list4 = (List) obj2;
                            qp7 qp7Var5 = (qp7) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            wrb0 wrb0Var5 = new wrb0(ce5Var, 2);
                            n52Var2.getClass();
                            euy k = qp7Var5.k((int) longValue);
                            sr4 sr4Var2 = new sr4(18, wrb0Var5);
                            k.c(new tqs(0, k, sr4Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraControl.setZoomRatio", j, obj);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: zrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i22 = i2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            qp7 qp7Var = (qp7) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            wrb0 wrb0Var = new wrb0(ce5Var, 1);
                            n52Var2.getClass();
                            euy f = qp7Var.f(booleanValue);
                            hh5 hh5Var = new hh5(12, wrb0Var);
                            f.c(new tqs(0, f, hh5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 1:
                            List list2 = (List) obj2;
                            qp7 qp7Var2 = (qp7) list2.get(0);
                            double doubleValue = ((Double) list2.get(1)).doubleValue();
                            wrb0 wrb0Var2 = new wrb0(ce5Var, 4);
                            n52Var2.getClass();
                            euy d = qp7Var2.d((float) doubleValue);
                            sr4 sr4Var = new sr4(17, wrb0Var2);
                            d.c(new tqs(0, d, sr4Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 2:
                            List list3 = (List) obj2;
                            qp7 qp7Var3 = (qp7) list3.get(0);
                            fur furVar = (fur) list3.get(1);
                            wrb0 wrb0Var3 = new wrb0(ce5Var, 5);
                            n52Var2.getClass();
                            euy j2 = qp7Var3.j(furVar);
                            pm5 pm5Var = new pm5(14, wrb0Var3);
                            j2.c(new tqs(0, j2, pm5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 3:
                            qp7 qp7Var4 = (qp7) ((List) obj2).get(0);
                            wrb0 wrb0Var4 = new wrb0(ce5Var, 3);
                            n52Var2.getClass();
                            euy l = qp7Var4.l();
                            hh5 hh5Var2 = new hh5(13, wrb0Var4);
                            l.c(new tqs(0, l, hh5Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        default:
                            List list4 = (List) obj2;
                            qp7 qp7Var5 = (qp7) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            wrb0 wrb0Var5 = new wrb0(ce5Var, 2);
                            n52Var2.getClass();
                            euy k = qp7Var5.k((int) longValue);
                            sr4 sr4Var2 = new sr4(18, wrb0Var5);
                            k.c(new tqs(0, k, sr4Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraControl.startFocusAndMetering", j, obj);
        if (n52Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: zrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i22 = i3;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            qp7 qp7Var = (qp7) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            wrb0 wrb0Var = new wrb0(ce5Var, 1);
                            n52Var2.getClass();
                            euy f = qp7Var.f(booleanValue);
                            hh5 hh5Var = new hh5(12, wrb0Var);
                            f.c(new tqs(0, f, hh5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 1:
                            List list2 = (List) obj2;
                            qp7 qp7Var2 = (qp7) list2.get(0);
                            double doubleValue = ((Double) list2.get(1)).doubleValue();
                            wrb0 wrb0Var2 = new wrb0(ce5Var, 4);
                            n52Var2.getClass();
                            euy d = qp7Var2.d((float) doubleValue);
                            sr4 sr4Var = new sr4(17, wrb0Var2);
                            d.c(new tqs(0, d, sr4Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 2:
                            List list3 = (List) obj2;
                            qp7 qp7Var3 = (qp7) list3.get(0);
                            fur furVar = (fur) list3.get(1);
                            wrb0 wrb0Var3 = new wrb0(ce5Var, 5);
                            n52Var2.getClass();
                            euy j2 = qp7Var3.j(furVar);
                            pm5 pm5Var = new pm5(14, wrb0Var3);
                            j2.c(new tqs(0, j2, pm5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 3:
                            qp7 qp7Var4 = (qp7) ((List) obj2).get(0);
                            wrb0 wrb0Var4 = new wrb0(ce5Var, 3);
                            n52Var2.getClass();
                            euy l = qp7Var4.l();
                            hh5 hh5Var2 = new hh5(13, wrb0Var4);
                            l.c(new tqs(0, l, hh5Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        default:
                            List list4 = (List) obj2;
                            qp7 qp7Var5 = (qp7) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            wrb0 wrb0Var5 = new wrb0(ce5Var, 2);
                            n52Var2.getClass();
                            euy k = qp7Var5.k((int) longValue);
                            sr4 sr4Var2 = new sr4(18, wrb0Var5);
                            k.c(new tqs(0, k, sr4Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraControl.cancelFocusAndMetering", j, obj);
        if (n52Var != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: zrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i22 = i4;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            qp7 qp7Var = (qp7) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            wrb0 wrb0Var = new wrb0(ce5Var, 1);
                            n52Var2.getClass();
                            euy f = qp7Var.f(booleanValue);
                            hh5 hh5Var = new hh5(12, wrb0Var);
                            f.c(new tqs(0, f, hh5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 1:
                            List list2 = (List) obj2;
                            qp7 qp7Var2 = (qp7) list2.get(0);
                            double doubleValue = ((Double) list2.get(1)).doubleValue();
                            wrb0 wrb0Var2 = new wrb0(ce5Var, 4);
                            n52Var2.getClass();
                            euy d = qp7Var2.d((float) doubleValue);
                            sr4 sr4Var = new sr4(17, wrb0Var2);
                            d.c(new tqs(0, d, sr4Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 2:
                            List list3 = (List) obj2;
                            qp7 qp7Var3 = (qp7) list3.get(0);
                            fur furVar = (fur) list3.get(1);
                            wrb0 wrb0Var3 = new wrb0(ce5Var, 5);
                            n52Var2.getClass();
                            euy j2 = qp7Var3.j(furVar);
                            pm5 pm5Var = new pm5(14, wrb0Var3);
                            j2.c(new tqs(0, j2, pm5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 3:
                            qp7 qp7Var4 = (qp7) ((List) obj2).get(0);
                            wrb0 wrb0Var4 = new wrb0(ce5Var, 3);
                            n52Var2.getClass();
                            euy l = qp7Var4.l();
                            hh5 hh5Var2 = new hh5(13, wrb0Var4);
                            l.c(new tqs(0, l, hh5Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        default:
                            List list4 = (List) obj2;
                            qp7 qp7Var5 = (qp7) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            wrb0 wrb0Var5 = new wrb0(ce5Var, 2);
                            n52Var2.getClass();
                            euy k = qp7Var5.k((int) longValue);
                            sr4 sr4Var2 = new sr4(18, wrb0Var5);
                            k.c(new tqs(0, k, sr4Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraControl.setExposureCompensationIndex", j, obj);
        if (n52Var == null) {
            m2vVar5.G(null);
        } else {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: zrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i22 = i5;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            qp7 qp7Var = (qp7) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            wrb0 wrb0Var = new wrb0(ce5Var, 1);
                            n52Var2.getClass();
                            euy f = qp7Var.f(booleanValue);
                            hh5 hh5Var = new hh5(12, wrb0Var);
                            f.c(new tqs(0, f, hh5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 1:
                            List list2 = (List) obj2;
                            qp7 qp7Var2 = (qp7) list2.get(0);
                            double doubleValue = ((Double) list2.get(1)).doubleValue();
                            wrb0 wrb0Var2 = new wrb0(ce5Var, 4);
                            n52Var2.getClass();
                            euy d = qp7Var2.d((float) doubleValue);
                            sr4 sr4Var = new sr4(17, wrb0Var2);
                            d.c(new tqs(0, d, sr4Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 2:
                            List list3 = (List) obj2;
                            qp7 qp7Var3 = (qp7) list3.get(0);
                            fur furVar = (fur) list3.get(1);
                            wrb0 wrb0Var3 = new wrb0(ce5Var, 5);
                            n52Var2.getClass();
                            euy j2 = qp7Var3.j(furVar);
                            pm5 pm5Var = new pm5(14, wrb0Var3);
                            j2.c(new tqs(0, j2, pm5Var), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        case 3:
                            qp7 qp7Var4 = (qp7) ((List) obj2).get(0);
                            wrb0 wrb0Var4 = new wrb0(ce5Var, 3);
                            n52Var2.getClass();
                            euy l = qp7Var4.l();
                            hh5 hh5Var2 = new hh5(13, wrb0Var4);
                            l.c(new tqs(0, l, hh5Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                        default:
                            List list4 = (List) obj2;
                            qp7 qp7Var5 = (qp7) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            wrb0 wrb0Var5 = new wrb0(ce5Var, 2);
                            n52Var2.getClass();
                            euy k = qp7Var5.k((int) longValue);
                            sr4 sr4Var2 = new sr4(18, wrb0Var5);
                            k.c(new tqs(0, k, sr4Var2), ((Context) n52Var2.a.A).getMainExecutor());
                            break;
                    }
                }
            });
        }
    }

    public static final void e(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = view.getWidth();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
