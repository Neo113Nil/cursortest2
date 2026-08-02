package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraState;
import androidx.camera.core.f;
import androidx.camera.core.g;
import androidx.camera.core.j;
import androidx.camera.video.b;
import androidx.camera.video.h;
import androidx.camera.video.i;
import io.flutter.plugins.camerax.AspectRatio;
import io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule;
import io.flutter.plugins.camerax.CameraStateErrorCode;
import io.flutter.plugins.camerax.CameraStateType;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.CameraXFlashMode;
import io.flutter.plugins.camerax.InfoSupportedHardwareLevel;
import io.flutter.plugins.camerax.LensFacing;
import io.flutter.plugins.camerax.LiveDataSupportedType;
import io.flutter.plugins.camerax.MeteringMode;
import io.flutter.plugins.camerax.ResolutionStrategyFallbackRule;
import io.flutter.plugins.camerax.VideoQuality;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class hu7 extends bu7 {
    public final pbj d;

    public hu7(pbj pbjVar) {
        this.d = pbjVar;
    }

    @Override // defpackage.bu7, defpackage.vzt0
    public final Object f(byte b, ByteBuffer byteBuffer) {
        if (b != Byte.MIN_VALUE) {
            return super.f(b, byteBuffer);
        }
        Long l = (Long) e(byteBuffer);
        long longValue = l.longValue();
        cu7 cu7Var = (cu7) ((HashMap) ((w4u) this.d.w).b).get(l);
        Object obj = cu7Var != null ? cu7Var.get() : null;
        if (obj == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + longValue);
        }
        return obj;
    }

    @Override // defpackage.bu7, defpackage.vzt0
    public final void k(ckn cknVar, Object obj) {
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof InfoSupportedHardwareLevel) || (obj instanceof AspectRatio) || (obj instanceof CameraStateType) || (obj instanceof LiveDataSupportedType) || (obj instanceof VideoQuality) || (obj instanceof MeteringMode) || (obj instanceof LensFacing) || (obj instanceof CameraXFlashMode) || (obj instanceof ResolutionStrategyFallbackRule) || (obj instanceof AspectRatioStrategyFallbackRule) || (obj instanceof CameraStateErrorCode) || obj == null) {
            super.k(cknVar, obj);
            return;
        }
        boolean z = obj instanceof Size;
        zy11 zy11Var = zy11.a;
        pbj pbjVar = this.d;
        if (z) {
            pbjVar.getClass();
            w4u w4uVar = (w4u) pbjVar.w;
            Size size = (Size) obj;
            qd2 qd2Var = new qd2(27, obj);
            if (pbjVar.b) {
                qd2Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            } else if (w4uVar.k(size)) {
                qd2Var.invoke(new Result(zy11Var));
            } else {
                new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar.i(size)), Long.valueOf(size.getWidth()), Long.valueOf(size.getHeight())), new nd2(15, qd2Var));
            }
        } else {
            int i = 14;
            if (obj instanceof zrj0) {
                pbjVar.getClass();
                w4u w4uVar2 = (w4u) pbjVar.w;
                zrj0 zrj0Var = (zrj0) obj;
                gu7 gu7Var = new gu7(14, obj);
                if (pbjVar.b) {
                    gu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar2.k(zrj0Var)) {
                    gu7Var.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.ResolutionInfo.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar2.i(zrj0Var)), zrj0Var.a.a), new isb0(24, gu7Var));
                }
            } else if (obj instanceof Range) {
                pbjVar.getClass();
                w4u w4uVar3 = (w4u) pbjVar.w;
                Range range = (Range) obj;
                fu7 fu7Var = new fu7(7, obj);
                if (pbjVar.b) {
                    fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar3.k(range)) {
                    fu7Var.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar3.i(range)), Long.valueOf(((Integer) range.getLower()).intValue()), Long.valueOf(((Integer) range.getUpper()).intValue())), new nd2(12, fu7Var));
                }
            } else if (obj instanceof gn31) {
                pbjVar.getClass();
                w4u w4uVar4 = (w4u) pbjVar.w;
                gn31 gn31Var = (gn31) obj;
                fu7 fu7Var2 = new fu7(20, obj);
                if (pbjVar.b) {
                    fu7Var2.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar4.k(gn31Var)) {
                    fu7Var2.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventStart.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar4.i(gn31Var))), new zsb0(6, fu7Var2));
                }
            } else if (obj instanceof dn31) {
                pbjVar.getClass();
                w4u w4uVar5 = (w4u) pbjVar.w;
                dn31 dn31Var = (dn31) obj;
                gu7 gu7Var2 = new gu7(2, obj);
                if (pbjVar.b) {
                    gu7Var2.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar5.k(dn31Var)) {
                    gu7Var2.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventFinalize.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar5.i(dn31Var))), new zsb0(5, gu7Var2));
                }
            } else if (obj instanceof in31) {
                pbjVar.getClass();
                w4u w4uVar6 = (w4u) pbjVar.w;
                in31 in31Var = (in31) obj;
                gu7 gu7Var3 = new gu7(6, obj);
                if (pbjVar.b) {
                    gu7Var3.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar6.k(in31Var)) {
                    gu7Var3.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEvent.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar6.i(in31Var))), new zsb0(4, gu7Var3));
                }
            } else if (obj instanceof s920) {
                pbjVar.getClass();
                w4u w4uVar7 = (w4u) pbjVar.w;
                s920 s920Var = (s920) obj;
                gu7 gu7Var4 = new gu7(7, obj);
                if (pbjVar.b) {
                    gu7Var4.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar7.k(s920Var)) {
                    gu7Var4.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.MeteringPoint.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar7.i(s920Var))), new isb0(12, gu7Var4));
                }
            } else if (obj instanceof pq60) {
                pbjVar.getClass();
                pq60 pq60Var = (pq60) obj;
                if (pbjVar.b) {
                    if (new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))).getValue() instanceof Result.Failure) {
                        Objects.toString(obj);
                    }
                } else if (((w4u) pbjVar.w).k(pq60Var)) {
                    if (new Result(zy11Var).getValue() instanceof Result.Failure) {
                        Objects.toString(obj);
                    }
                } else if (new Result(new Result.Failure(new CameraXError("new-instance-error", "Attempting to create a new Dart instance of Observer, but the class has a nonnull callback method.", ""))).getValue() instanceof Result.Failure) {
                    Objects.toString(obj);
                }
            } else if (obj instanceof ar7) {
                pbjVar.getClass();
                w4u w4uVar8 = (w4u) pbjVar.w;
                ar7 ar7Var = (ar7) obj;
                gu7 gu7Var5 = new gu7(8, obj);
                if (pbjVar.b) {
                    gu7Var5.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar8.k(ar7Var)) {
                    gu7Var5.invoke(new Result(zy11Var));
                } else {
                    long i2 = w4uVar8.i(ar7Var);
                    long m = ar7Var.m();
                    int d = ar7Var.d();
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(i2), Long.valueOf(m), d != 0 ? d != 1 ? d != 2 ? LensFacing.UNKNOWN : LensFacing.EXTERNAL : LensFacing.BACK : LensFacing.FRONT, ar7Var.v()), new nd2(11, gu7Var5));
                }
            } else if (obj instanceof xs7) {
                pbjVar.getClass();
                w4u w4uVar9 = (w4u) pbjVar.w;
                xs7 xs7Var = (xs7) obj;
                gu7 gu7Var6 = new gu7(9, obj);
                if (pbjVar.b) {
                    gu7Var6.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar9.k(xs7Var)) {
                    gu7Var6.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar9.i(xs7Var))), new nd2(i, gu7Var6));
                }
            } else if (obj instanceof i5f0) {
                pbjVar.getClass();
                w4u w4uVar10 = (w4u) pbjVar.w;
                i5f0 i5f0Var = (i5f0) obj;
                fu7 fu7Var3 = new fu7(8, obj);
                if (pbjVar.b) {
                    fu7Var3.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar10.k(i5f0Var)) {
                    fu7Var3.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar10.i(i5f0Var))), new isb0(19, fu7Var3));
                }
            } else if (obj instanceof co7) {
                pbjVar.getClass();
                w4u w4uVar11 = (w4u) pbjVar.w;
                co7 co7Var = (co7) obj;
                fu7 fu7Var4 = new fu7(19, obj);
                if (pbjVar.b) {
                    fu7Var4.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                } else if (w4uVar11.k(co7Var)) {
                    fu7Var4.invoke(new Result(zy11Var));
                } else {
                    new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.Camera.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar11.i(co7Var)), co7Var.b()), new nd2(5, fu7Var4));
                }
            } else if (obj instanceof v3x0) {
                pbjVar.getClass();
                v3x0 v3x0Var = (v3x0) obj;
                if (pbjVar.b) {
                    if (new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))).getValue() instanceof Result.Failure) {
                        Objects.toString(obj);
                    }
                } else if (((w4u) pbjVar.w).k(v3x0Var)) {
                    if (new Result(zy11Var).getValue() instanceof Result.Failure) {
                        Objects.toString(obj);
                    }
                } else if (new Result(new Result.Failure(new CameraXError("new-instance-error", "Attempting to create a new Dart instance of SystemServicesManager, but the class has a nonnull callback method.", ""))).getValue() instanceof Result.Failure) {
                    Objects.toString(obj);
                }
            } else {
                int i3 = 13;
                if (obj instanceof as7) {
                    pbjVar.getClass();
                    w4u w4uVar12 = (w4u) pbjVar.w;
                    as7 as7Var = (as7) obj;
                    gu7 gu7Var7 = new gu7(0, obj);
                    if (pbjVar.b) {
                        gu7Var7.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar12.k(as7Var)) {
                        gu7Var7.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.CameraPermissionsError.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar12.i(as7Var)), as7Var.a, as7Var.b), new nd2(i3, gu7Var7));
                    }
                } else if (obj instanceof jbj) {
                    pbjVar.getClass();
                    jbj jbjVar = (jbj) obj;
                    if (pbjVar.b) {
                        if (new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))).getValue() instanceof Result.Failure) {
                            Objects.toString(obj);
                        }
                    } else if (((w4u) pbjVar.w).k(jbjVar)) {
                        if (new Result(zy11Var).getValue() instanceof Result.Failure) {
                            Objects.toString(obj);
                        }
                    } else if (new Result(new Result.Failure(new CameraXError("new-instance-error", "Attempting to create a new Dart instance of DeviceOrientationManager, but the class has a nonnull callback method.", ""))).getValue() instanceof Result.Failure) {
                        Objects.toString(obj);
                    }
                } else if (obj instanceof g) {
                    if (((oy80) pbjVar.B) == null) {
                        pbjVar.B = new oy80(pbjVar);
                    }
                    oy80 oy80Var = (oy80) pbjVar.B;
                    g gVar = (g) obj;
                    gu7 gu7Var8 = new gu7(10, obj);
                    pbj pbjVar2 = (pbj) oy80Var.b;
                    boolean z2 = pbjVar2.b;
                    w4u w4uVar13 = (w4u) pbjVar2.w;
                    if (z2) {
                        gu7Var8.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar13.k(gVar)) {
                        gu7Var8.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar2.c, "dev.flutter.pigeon.camera_android_camerax.Preview.pigeon_newInstance", pbjVar2.j(), null).z(scc.g(Long.valueOf(w4uVar13.i(gVar)), ((icv) gVar.h).s()), new isb0(17, gu7Var8));
                    }
                } else if (obj instanceof i) {
                    pbjVar.getClass();
                    w4u w4uVar14 = (w4u) pbjVar.w;
                    i iVar = (i) obj;
                    gu7 gu7Var9 = new gu7(11, obj);
                    if (pbjVar.b) {
                        gu7Var9.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar14.k(iVar)) {
                        gu7Var9.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.VideoCapture.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar14.i(iVar))), new zsb0(2, gu7Var9));
                    }
                } else if (obj instanceof androidx.camera.video.g) {
                    pbjVar.getClass();
                    w4u w4uVar15 = (w4u) pbjVar.w;
                    androidx.camera.video.g gVar2 = (androidx.camera.video.g) obj;
                    gu7 gu7Var10 = new gu7(12, obj);
                    if (pbjVar.b) {
                        gu7Var10.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar15.k(gVar2)) {
                        gu7Var10.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.Recorder.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar15.i(gVar2))), new isb0(21, gu7Var10));
                    }
                } else if (obj instanceof lm31) {
                    pbjVar.getClass();
                    w4u w4uVar16 = (w4u) pbjVar.w;
                    lm31 lm31Var = (lm31) obj;
                    gu7 gu7Var11 = new gu7(13, obj);
                    if (pbjVar.b) {
                        gu7Var11.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar16.k(lm31Var)) {
                        gu7Var11.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.VideoOutput.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar16.i(lm31Var))), new zsb0(3, gu7Var11));
                    }
                } else if (obj instanceof jn31) {
                    pbjVar.getClass();
                    jn31 jn31Var = (jn31) obj;
                    if (pbjVar.b) {
                        if (new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))).getValue() instanceof Result.Failure) {
                            Objects.toString(obj);
                        }
                    } else if (((w4u) pbjVar.w).k(jn31Var)) {
                        if (new Result(zy11Var).getValue() instanceof Result.Failure) {
                            Objects.toString(obj);
                        }
                    } else if (new Result(new Result.Failure(new CameraXError("new-instance-error", "Attempting to create a new Dart instance of VideoRecordEventListener, but the class has a nonnull callback method.", ""))).getValue() instanceof Result.Failure) {
                        Objects.toString(obj);
                    }
                } else if (obj instanceof b) {
                    pbjVar.getClass();
                    w4u w4uVar17 = (w4u) pbjVar.w;
                    b bVar = (b) obj;
                    gu7 gu7Var12 = new gu7(15, obj);
                    if (pbjVar.b) {
                        gu7Var12.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar17.k(bVar)) {
                        gu7Var12.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.PendingRecording.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar17.i(bVar))), new isb0(14, gu7Var12));
                    }
                } else if (obj instanceof h) {
                    pbjVar.getClass();
                    w4u w4uVar18 = (w4u) pbjVar.w;
                    h hVar = (h) obj;
                    qd2 qd2Var2 = new qd2(28, obj);
                    if (pbjVar.b) {
                        qd2Var2.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar18.k(hVar)) {
                        qd2Var2.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.Recording.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar18.i(hVar))), new isb0(22, qd2Var2));
                    }
                } else if (obj instanceof w8v) {
                    pbjVar.getClass();
                    w4u w4uVar19 = (w4u) pbjVar.w;
                    w8v w8vVar = (w8v) obj;
                    qd2 qd2Var3 = new qd2(29, obj);
                    if (pbjVar.b) {
                        qd2Var3.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar19.k(w8vVar)) {
                        qd2Var3.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar19.i(w8vVar)), ((icv) w8vVar.h).s()), new isb0(8, qd2Var3));
                    }
                } else if (obj instanceof csj0) {
                    pbjVar.getClass();
                    w4u w4uVar20 = (w4u) pbjVar.w;
                    csj0 csj0Var = (csj0) obj;
                    fu7 fu7Var5 = new fu7(0, obj);
                    if (pbjVar.b) {
                        fu7Var5.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar20.k(csj0Var)) {
                        fu7Var5.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar20.i(csj0Var))), new isb0(26, fu7Var5));
                    }
                } else if (obj instanceof bsj0) {
                    pbjVar.getClass();
                    bsj0 bsj0Var = (bsj0) obj;
                    fu7 fu7Var6 = new fu7(1, obj);
                    boolean z3 = pbjVar.b;
                    w4u w4uVar21 = (w4u) pbjVar.w;
                    if (z3) {
                        fu7Var6.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar21.k(bsj0Var)) {
                        fu7Var6.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar21.i(bsj0Var)), bsj0Var.c, bsj0Var.b), new isb0(25, fu7Var6));
                    }
                } else if (obj instanceof s83) {
                    pbjVar.getClass();
                    s83 s83Var = (s83) obj;
                    fu7 fu7Var7 = new fu7(2, obj);
                    boolean z4 = pbjVar.b;
                    w4u w4uVar22 = (w4u) pbjVar.w;
                    if (z4) {
                        fu7Var7.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar22.k(s83Var)) {
                        fu7Var7.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar22.i(s83Var))), new nd2(4, fu7Var7));
                    }
                } else if (obj instanceof CameraState) {
                    pbjVar.getClass();
                    new et7(pbjVar).a((CameraState) obj, new fu7(3, obj));
                } else if (obj instanceof gvo) {
                    pbjVar.getClass();
                    new v83(pbjVar).f((gvo) obj, new fu7(4, obj));
                } else if (obj instanceof kf61) {
                    pbjVar.getClass();
                    new sm7(pbjVar).h((kf61) obj, new fu7(5, obj));
                } else if (obj instanceof f) {
                    pbjVar.getClass();
                    new sm7(pbjVar).j((f) obj, new fu7(6, obj));
                } else if (obj instanceof j) {
                    pbjVar.getClass();
                    j jVar = (j) obj;
                    fu7 fu7Var8 = new fu7(9, obj);
                    boolean z5 = pbjVar.b;
                    w4u w4uVar23 = (w4u) pbjVar.w;
                    if (z5) {
                        fu7Var8.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
                    } else if (w4uVar23.k(jVar)) {
                        fu7Var8.invoke(new Result(zy11Var));
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.UseCase.pigeon_newInstance", pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar23.i(jVar))), new zsb0(1, fu7Var8));
                    }
                } else if (obj instanceof t7v) {
                    pbjVar.getClass();
                    new n52(pbjVar).g((t7v) obj, new fu7(10, obj));
                } else if (obj instanceof CameraState.a) {
                    pbjVar.t().a((CameraState.a) obj, new fu7(11, obj));
                } else if (obj instanceof fvy) {
                    pbjVar.E().h((fvy) obj, new fu7(12, obj));
                } else if (obj instanceof jdv) {
                    pbjVar.C().h((jdv) obj, new fu7(13, obj));
                } else if (obj instanceof ldv) {
                    pbjVar.D().f((ldv) obj, new fu7(14, obj));
                } else if (obj instanceof idv) {
                    pbjVar.G().e((idv) obj, new fu7(15, obj));
                } else if (obj instanceof qgg0) {
                    pbjVar.H().i((qgg0) obj, new fu7(16, obj));
                } else if (obj instanceof q64) {
                    pbjVar.y().c((q64) obj, new fu7(17, obj));
                } else if (obj instanceof qp7) {
                    pbjVar.s().e((qp7) obj, new fu7(18, obj));
                } else if (obj instanceof eur) {
                    pbjVar.A().d((eur) obj, new fu7(21, obj));
                } else if (obj instanceof fur) {
                    pbjVar.z().f((fur) obj, new fu7(22, obj));
                } else if (obj instanceof nur) {
                    pbjVar.B().g((nur) obj, new fu7(23, obj));
                } else if (obj instanceof CaptureRequest) {
                    pbjVar.u().i((CaptureRequest) obj, new fu7(24, obj));
                } else if (obj instanceof CaptureRequest.Key) {
                    pbjVar.v().j((CaptureRequest.Key) obj, new fu7(25, obj));
                } else if (obj instanceof b48) {
                    pbjVar.w().d((b48) obj, new fu7(26, obj));
                } else if (obj instanceof dm7) {
                    pbjVar.o().d((dm7) obj, new fu7(27, obj));
                } else if (obj instanceof xrj0) {
                    pbjVar.I().g((xrj0) obj, new fu7(28, obj));
                } else if (obj instanceof CameraCharacteristics.Key) {
                    pbjVar.r().j((CameraCharacteristics.Key) obj, new fu7(29, obj));
                } else if (obj instanceof CameraCharacteristics) {
                    pbjVar.q().k((CameraCharacteristics) obj, new gu7(1, obj));
                } else if (obj instanceof pm7) {
                    pbjVar.p().c((pm7) obj, new gu7(3, obj));
                } else if (obj instanceof lzj) {
                    pbjVar.x().e((lzj) obj, new gu7(4, obj));
                } else if (obj instanceof t920) {
                    pbjVar.F().i((t920) obj, new gu7(5, obj));
                }
            }
        }
        if (!((w4u) pbjVar.w).k(obj)) {
            yhl.f("Unsupported value: '", obj, "' of type '", obj.getClass().getName(), "'");
        } else {
            cknVar.write(128);
            k(cknVar, pbjVar.l().l(obj));
        }
    }
}
