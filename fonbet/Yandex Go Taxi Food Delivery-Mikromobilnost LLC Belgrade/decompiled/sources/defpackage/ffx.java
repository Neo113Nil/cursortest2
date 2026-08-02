package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.colorspace.a;
import androidx.compose.ui.node.s;
import androidx.core.view.b;
import com.adjust.sdk.Constants;
import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import com.yandex.pulse.histogram.ComponentHistograms;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.c;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public abstract class ffx {
    public static final jb20 b;
    public static final jb20 c;
    public static final jb20 d;
    public static final jb20 e;
    public static final jb20 f;
    public static final jb20 i;
    public static ThreadPoolExecutor j;
    public static final ngd0 a = new ngd0(21);
    public static final wun g = new wun(false);
    public static final wun h = new wun(true);

    static {
        int i2 = 1;
        b = new jb20("COMPLETING_ALREADY", i2);
        c = new jb20("COMPLETING_WAITING_CHILDREN", i2);
        d = new jb20("COMPLETING_RETRY", i2);
        e = new jb20("TOO_LATE_TO_CANCEL", i2);
        f = new jb20("SEALED", i2);
        i = new jb20("NO_VALUE", i2);
    }

    public static final Object A(sbx sbxVar, myi myiVar, InputStream inputStream) {
        yvi0 yvi0Var = new yvi0();
        yvi0Var.a = new tza(inputStream, uza.a);
        tza tzaVar = (tza) yvi0Var.a;
        try {
            cci0 cci0Var = new cci0(yvi0Var, wi9.c.b(16384), sbxVar.a);
            try {
                Object B = new c(sbxVar, WriteMode.OBJ, cci0Var, myiVar.getDescriptor(), null).B(myiVar);
                cci0Var.o();
                cci0Var.E();
                return B;
            } catch (Throwable th) {
                cci0Var.E();
                throw th;
            }
        } finally {
            tzaVar.getClass();
            m67.c.a(tzaVar.c.array());
        }
    }

    public static final zii0 C(e530 e530Var, boolean z, boolean z2) {
        if (!e530Var.getNode().isAttached()) {
            return zii0.e;
        }
        if (z) {
            return qje.N(e530Var, 8).x1();
        }
        s N = qje.N(e530Var, 8);
        return gwk0.o(N).j(N, z2);
    }

    public static final View E(View view) {
        View view2 = null;
        while (view != null) {
            if (!V(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    public static final void F(Throwable th, StringBuilder sb, StackTraceElement[] stackTraceElementArr, String str, String str2, Set set) {
        if (set.contains(th)) {
            sb.append(str2);
            sb.append(str);
            sb.append("[CIRCULAR REFERENCE: ");
            sb.append(th.toString());
            sb.append(']');
            sb.append('\n');
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length - 1;
        for (int length2 = stackTraceElementArr.length - 1; length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2]); length2--) {
            length--;
        }
        int length3 = (stackTrace.length - 1) - length;
        sb.append(str2);
        sb.append(str);
        sb.append(th.toString());
        sb.append('\n');
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                sb.append(str2);
                sb.append("\tat ");
                g(sb, stackTrace[i2]);
                sb.append('\n');
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (length3 != 0) {
            sb.append(str2);
            sb.append("\t... ");
            sb.append(String.valueOf(length3));
            sb.append(" more");
            sb.append('\n');
        }
        for (Throwable th2 : th.getSuppressed()) {
            F(th2, sb, stackTrace, "Suppressed: ", str2.concat("\t"), set);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            F(cause, sb, stackTrace, "Caused by: ", str2, set);
        }
    }

    public static final tpr G(hnr0 hnr0Var, fse fseVar, int i2, BufferOverflow bufferOverflow) {
        return ((i2 == 0 || i2 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? hnr0Var : new gi9(i2, fseVar, hnr0Var, bufferOverflow);
    }

    public static dse H(dse dseVar, ese eseVar) {
        if (jl40.l(dseVar.getKey(), eseVar)) {
            return dseVar;
        }
        return null;
    }

    public static final vku I(int i2, int i3, int i4, String str) {
        Object obj = ComponentHistograms.b;
        return vez0.u().b(i2, i3, i4, str);
    }

    public static vku J(ComponentHistograms componentHistograms, String str, long j2, long j3, int i2) {
        int i3 = Integer.MIN_VALUE;
        int i4 = j2 > 2147483647L ? Integer.MAX_VALUE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        if (j3 > 2147483647L) {
            i3 = Integer.MAX_VALUE;
        } else if (j3 >= -2147483648L) {
            i3 = (int) j3;
        }
        return componentHistograms.b(i4, i3, i2, str);
    }

    public static final boolean K(wkp wkpVar) {
        return jl40.l(wkpVar.getValue(), Boolean.TRUE);
    }

    public static final vku L(int i2, String str) {
        Object obj = ComponentHistograms.b;
        return vez0.u().c(1, i2, i2 + 1, str);
    }

    public static final b6w M(int i2, int i3, View view) {
        int i4 = i3 + i2;
        return W(view) ? y6i0.i(i4 - 1, i2) : y6i0.n(i2, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class N(lfx lfxVar) {
        Class a2 = ((zzb) lfxVar).a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a2;
    }

    public static final vku O(String str) {
        Object obj = ComponentHistograms.b;
        return J(vez0.u(), str, 10L, 180000L, 50);
    }

    public static Object P(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return nu6.e(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static final vku Q(String str) {
        Object obj = ComponentHistograms.b;
        return vez0.u().c(1, 101, 102, str);
    }

    public static Serializable R(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return nu6.g(intent, str, cls);
        }
        Serializable serializableExtra = intent.getSerializableExtra(str);
        if (cls.isInstance(serializableExtra)) {
            return serializableExtra;
        }
        return null;
    }

    public static String S(f50 f50Var) {
        if (f50Var instanceof d50) {
            return "image/*";
        }
        if (f50Var instanceof e50) {
            return "video/*";
        }
        if (f50Var instanceof c50) {
            return null;
        }
        w511.b();
        return null;
    }

    public static int T(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ bArr[length];
        }
    }

    public static final float[] U(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = b64.a(f3, f10, f4 * f9, f14);
        fArr2[4] = b64.a(f4, f8, f10 * f2, f14);
        fArr2[5] = b64.a(f2, f9, f8 * f3, f14);
        fArr2[6] = b64.a(f4, f6, f3 * f7, f14);
        fArr2[7] = b64.a(f2, f7, f4 * f5, f14);
        fArr2[8] = b64.a(f3, f5, f2 * f6, f14);
        return fArr2;
    }

    public static final boolean V(View view) {
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean W(View view) {
        WeakHashMap weakHashMap = b.a;
        return view.getLayoutDirection() == 1;
    }

    public static final am2 X(File file, String str, k8u k8uVar) {
        return new am2(k8uVar, sbx.d, new jb7(new File(file, str), 11));
    }

    public static fse Y(dse dseVar, ese eseVar) {
        return jl40.l(dseVar.getKey(), eseVar) ? EmptyCoroutineContext.a : dseVar;
    }

    public static final float[] Z(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final wta0 a(int i2) {
        return new wta0(i2);
    }

    public static final float[] a0(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final n0 b(int i2, int i3, BufferOverflow bufferOverflow) {
        if (i2 < 0) {
            w511.f(oyr.i(i2, "replay cannot be negative, but was "));
            return null;
        }
        if (i3 < 0) {
            w511.f(oyr.i(i3, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i2 <= 0 && i3 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            vg10.r(bufferOverflow, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new n0(i2, i4, bufferOverflow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ng70 b0(ByteString... byteStringArr) {
        if (byteStringArr.length == 0) {
            return new ng70(new ByteString[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new n43(byteStringArr, false));
        xcc.p(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(-1);
        }
        int length = byteStringArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            arrayList2.set(scc.d(arrayList, byteStringArr[i3]), Integer.valueOf(i4));
            i3++;
            i4++;
        }
        if (((ByteString) arrayList.get(0)).h() <= 0) {
            ny61.g("the empty byte string is not a supported option");
            return null;
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            ByteString byteString = (ByteString) arrayList.get(i5);
            int i6 = i5 + 1;
            int i7 = i6;
            while (i7 < arrayList.size()) {
                ByteString byteString2 = (ByteString) arrayList.get(i7);
                byteString2.getClass();
                if (byteString2.q(byteString, 0, byteString.h())) {
                    if (byteString2.h() == byteString.h()) {
                        vg10.r(byteString2, "duplicate option: ");
                        return null;
                    }
                    if (((Number) arrayList2.get(i7)).intValue() > ((Number) arrayList2.get(i5)).intValue()) {
                        arrayList.remove(i7);
                        ((Number) arrayList2.remove(i7)).intValue();
                    } else {
                        i7++;
                    }
                }
            }
            i5 = i6;
        }
        yp6 yp6Var = new yp6();
        k(0L, yp6Var, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i8 = (int) (yp6Var.b / 4);
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = yp6Var.readInt();
        }
        return new ng70((ByteString[]) Arrays.copyOf(byteStringArr, byteStringArr.length), iArr);
    }

    public static /* synthetic */ n0 c(int i2, int i3, BufferOverflow bufferOverflow, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return b(i2, i3, bufferOverflow);
    }

    public static final Bitmap c0(Drawable drawable, int i2, int i3, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                ny61.g("bitmap is null");
                return null;
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i2 == bitmapDrawable.getBitmap().getWidth() && i3 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i2, i3, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i4, i5, i6, i7);
        return createBitmap;
    }

    public static final ltu0 d(sbx sbxVar, String str) {
        return new ltu0(str, sbxVar.a);
    }

    public static /* synthetic */ Bitmap d0(Drawable drawable, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if ((i4 & 2) != 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        return c0(drawable, i2, i3, null);
    }

    public static final void e(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static Bitmap e0(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return c0(drawable, intrinsicWidth, intrinsicHeight, null);
    }

    public static ugc f(ugc ugcVar) {
        lz41 lz41Var = rzo.c;
        if (cvw.v(ugcVar.b, 12884901888L)) {
            a aVar = (a) ugcVar;
            lz41 lz41Var2 = aVar.d;
            if (!w(lz41Var2, lz41Var)) {
                return new a(aVar.a, aVar.h, lz41Var, Z(s((float[]) vit.w.b, lz41Var2.a(), lz41Var.a()), aVar.i), aVar.k, aVar.n, aVar.e, aVar.f, aVar.g, -1);
            }
        }
        return ugcVar;
    }

    public static String f0(String str) {
        return str.length() <= 127 ? str : str.substring(0, HProv.PP_VERSION_TIMESTAMP);
    }

    public static final void g(StringBuilder sb, StackTraceElement stackTraceElement) {
        sb.append(stackTraceElement.getClassName());
        sb.append(Extension.DOT_CHAR);
        sb.append(stackTraceElement.getMethodName());
        if (stackTraceElement.isNativeMethod()) {
            sb.append("(Native Method)");
            return;
        }
        if (stackTraceElement.getFileName() == null) {
            if (stackTraceElement.getLineNumber() < 0) {
                sb.append("(Unknown Source)");
                return;
            }
            sb.append("(Unknown Source:");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(Extension.C_BRAKE);
            return;
        }
        if (stackTraceElement.getLineNumber() < 0) {
            sb.append(Extension.O_BRAKE);
            sb.append(stackTraceElement.getFileName());
            sb.append(Extension.C_BRAKE);
        } else {
            sb.append(Extension.O_BRAKE);
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(Extension.C_BRAKE);
        }
    }

    public static final Object g0(Object obj) {
        iqv iqvVar;
        mqv mqvVar = obj instanceof mqv ? (mqv) obj : null;
        return (mqvVar == null || (iqvVar = mqvVar.a) == null) ? obj : iqvVar;
    }

    public static final /* synthetic */ String h(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length == 0) {
            return null;
        }
        String className = stackTrace[0].getClassName();
        String f0 = evu0.f0('$', className, className);
        String e0 = evu0.e0('.', f0, f0);
        return e0.length() == 0 ? className : evu0.S("Kt", e0);
    }

    public static final lmw0 h0(lmw0 lmw0Var, RequirementOverrideDto requirementOverrideDto, String str) {
        if (lmw0Var instanceof gmw0) {
            gmw0 gmw0Var = (gmw0) lmw0Var;
            Boolean bool = requirementOverrideDto.b;
            boolean booleanValue = bool != null ? bool.booleanValue() : gmw0Var.n;
            Boolean bool2 = requirementOverrideDto.c;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : gmw0Var.o;
            String str2 = requirementOverrideDto.d;
            if (str2 == null) {
                str2 = lmw0Var.g();
            }
            String str3 = str2;
            f1b0 f1b0Var = requirementOverrideDto.e;
            return gmw0.v(gmw0Var, requirementOverrideDto.f, null, 0, booleanValue, booleanValue2, f1b0Var != null ? uh6.T(f1b0Var, gmw0Var.c, str) : gmw0Var.p, null, null, str3, 8112095);
        }
        if (!(lmw0Var instanceof hmw0)) {
            if ((lmw0Var instanceof fmw0) || (lmw0Var instanceof kmw0)) {
                return lmw0Var;
            }
            w511.b();
            return null;
        }
        hmw0 hmw0Var = (hmw0) lmw0Var;
        Boolean bool3 = requirementOverrideDto.b;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : hmw0Var.n;
        Boolean bool4 = requirementOverrideDto.c;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : hmw0Var.o;
        String str4 = requirementOverrideDto.d;
        if (str4 == null) {
            str4 = lmw0Var.g();
        }
        String str5 = str4;
        f1b0 f1b0Var2 = requirementOverrideDto.e;
        return hmw0.v(hmw0Var, requirementOverrideDto.f, null, 0, booleanValue3, booleanValue4, f1b0Var2 != null ? uh6.T(f1b0Var2, hmw0Var.c, str) : hmw0Var.p, null, str5, 4048863);
    }

    public static final String i(Throwable th) {
        StringBuilder sb = new StringBuilder(512);
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th);
        sb.append(th.toString());
        sb.append('\n');
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\tat ");
            g(sb, stackTraceElement);
            sb.append('\n');
        }
        for (Throwable th2 : th.getSuppressed()) {
            F(th2, sb, stackTrace, "Suppressed: ", "\t", newSetFromMap);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            F(cause, sb, stackTrace, "Caused by: ", "", newSetFromMap);
        }
        return sb.toString();
    }

    public static final void i0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            ny61.g("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static String j(int i2, int i3, String str) {
        if (i2 < 0) {
            return shb1.c("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return shb1.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        ny61.g(oyr.i(i3, "negative size: "));
        return null;
    }

    public static final byte[] j0(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        if (i4 < 0 || bArr.length - i4 < i2 || bArr2.length - i4 < i3) {
            ny61.g("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i2] ^ bArr2[i5 + i3]);
        }
        return bArr3;
    }

    public static void k(long j2, yp6 yp6Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            ny61.g("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((ByteString) arrayList4.get(i9)).h() < i8) {
                ny61.g("Failed requirement.");
                return;
            }
        }
        ByteString byteString = (ByteString) arrayList.get(i3);
        ByteString byteString2 = (ByteString) arrayList4.get(i4 - 1);
        if (i8 == byteString.h()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            ByteString byteString3 = (ByteString) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            byteString = byteString3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (byteString.m(i8) == byteString2.m(i8)) {
            int min = Math.min(byteString.h(), byteString2.h());
            int i11 = 0;
            for (int i12 = i8; i12 < min && byteString.m(i12) == byteString2.m(i12); i12++) {
                i11++;
            }
            long j4 = (yp6Var.b / 4) + j2 + 2 + i11 + 1;
            yp6Var.n0(-i11);
            yp6Var.n0(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                yp6Var.n0(byteString.m(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((ByteString) arrayList4.get(i5)).h()) {
                    yp6Var.n0(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    ny61.r("Check failed.");
                    return;
                }
            }
            yp6 yp6Var2 = new yp6();
            yp6Var.n0(((int) ((yp6Var2.b / 4) + j4)) * (-1));
            k(j4, yp6Var2, i13, arrayList4, i5, i4, arrayList5);
            yp6Var.N1(yp6Var2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((ByteString) arrayList4.get(i15 - 1)).m(i8) != ((ByteString) arrayList4.get(i15)).m(i8)) {
                i14++;
            }
        }
        long j5 = (yp6Var.b / 4) + j2 + 2 + (i14 * 2);
        yp6Var.n0(i14);
        yp6Var.n0(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int m = ((ByteString) arrayList4.get(i16)).m(i8);
            if (i16 == i5 || m != ((ByteString) arrayList4.get(i16 - 1)).m(i8)) {
                yp6Var.n0(m & 255);
            }
        }
        yp6 yp6Var3 = new yp6();
        int i17 = i5;
        while (i17 < i4) {
            byte m2 = ((ByteString) arrayList4.get(i17)).m(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (m2 != ((ByteString) arrayList4.get(i19)).m(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((ByteString) arrayList4.get(i17)).h()) {
                yp6Var.n0(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                yp6Var.n0(((int) ((yp6Var3.b / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                k(j3, yp6Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        yp6Var.N1(yp6Var3);
    }

    public static final byte[] k0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return j0(bArr, 0, 0, bArr2, bArr.length);
        }
        ny61.g("The lengths of x and y should match.");
        return null;
    }

    public static void l(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.g(str);
    }

    public static ThreadPoolExecutor l0() {
        if (j == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kc91());
            j = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return j;
    }

    public static void m(boolean z) {
        if (z) {
            return;
        }
        w511.q();
    }

    public static void n(int i2, int i3) {
        String c2;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                c2 = shb1.c("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    ny61.g(oyr.i(i3, "negative size: "));
                    return;
                }
                c2 = shb1.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(c2);
        }
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(str);
    }

    public static void p(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            ny61.m(j(i2, i3, "index"));
        }
    }

    public static void q(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? j(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? j(i3, i4, "end index") : shb1.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void r(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.r(str);
    }

    public static final float[] s(float[] fArr, float[] fArr2, float[] fArr3) {
        a0(fArr, fArr2);
        a0(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] U = U(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return Z(U, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final /* synthetic */ void t(Set set, Throwable th) {
        boolean contains;
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            String className = stackTrace[i3].getClassName();
            if (set.contains(className)) {
                contains = true;
            } else {
                int G = evu0.G(className, '$', 0, 6);
                contains = G > 0 ? set.contains(gvu0.A0(G, className)) : false;
            }
            if (!contains) {
                break;
            }
            i2 = i3;
        }
        int i4 = i2 + 1;
        if (i4 >= stackTrace.length) {
            th.setStackTrace(new StackTraceElement[0]);
        } else if (i2 >= 0) {
            th.setStackTrace((StackTraceElement[]) f73.n(i4, stackTrace.length, stackTrace));
        }
    }

    public static final void u(View view) {
        view.clearAnimation();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                u(viewGroup.getChildAt(i2));
            }
        }
    }

    public static byte[] v(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static final boolean w(lz41 lz41Var, lz41 lz41Var2) {
        if (lz41Var == lz41Var2) {
            return true;
        }
        return Math.abs(lz41Var.a - lz41Var2.a) < 0.001f && Math.abs(lz41Var.b - lz41Var2.b) < 0.001f;
    }

    public static byte[] x(byte[]... bArr) {
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            if (i2 > Integer.MAX_VALUE - bArr2.length) {
                kbs.v("exceeded size limit");
                return null;
            }
            i2 += bArr2.length;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
        }
        return bArr3;
    }

    public static am2 y(tls tlsVar) {
        ut20 ut20Var = new ut20();
        tlsVar.invoke(ut20Var);
        qc20 qc20Var = ut20Var.a;
        if (qc20Var == null) {
            kbs.j("Parameter designSystem is required for ", qoi0.a(ut20.class), 33);
            return null;
        }
        kaa0 kaa0Var = ut20Var.b;
        if (kaa0Var != null) {
            return new am2(qc20Var, kaa0Var, new yci0());
        }
        kbs.j("Parameter paymentMethodsFacade is required for ", qoi0.a(ut20.class), 33);
        return null;
    }

    public static final f6e z(ugc ugcVar, ugc ugcVar2) {
        return ugcVar == ugcVar2 ? new d6e(ugcVar, ugcVar, 1) : (cvw.v(ugcVar.b, 12884901888L) && cvw.v(ugcVar2.b, 12884901888L)) ? new e6e((a) ugcVar, (a) ugcVar2) : new f6e(ugcVar, ugcVar2, 0);
    }

    public abstract String B(int i2, int i3, byte[] bArr);

    public abstract int D(int i2, int i3, String str, byte[] bArr);
}
