package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import androidx.exifinterface.media.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/* loaded from: classes10.dex */
public final class b9v implements tsr, ca20 {
    public static boolean c;
    public Context a;
    public ea20 b;

    public b9v() {
        SparseArray sparseArray = r7s.a;
        hoc hocVar = new hoc(0);
        SparseArray sparseArray2 = r7s.a;
        sparseArray2.append(hocVar.c(), hocVar);
        hoc hocVar2 = new hoc(1);
        sparseArray2.append(hocVar2.c(), hocVar2);
        sparseArray2.append(2, new ffu());
        hoc hocVar3 = new hoc(3);
        sparseArray2.append(hocVar3.c(), hocVar3);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.a = ssrVar.a;
        ea20 ea20Var = new ea20(ssrVar.c, "flutter_image_compress");
        this.b = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.b;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
        this.b = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        final Context context;
        String str = x920Var.a;
        if (str != null) {
            final int i = 1;
            switch (str.hashCode()) {
                case -129880033:
                    if (str.equals("compressWithFileAndGetFile")) {
                        final fwd fwdVar = new fwd(x920Var, (ba20) da20Var);
                        Context context2 = this.a;
                        context = context2 != null ? context2 : null;
                        fwd.e.execute(new Runnable() { // from class: ewd
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
                            /* JADX WARN: Type inference failed for: r0v3, types: [byte[], java.io.Serializable] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int i2;
                                int i3;
                                int i4;
                                int i5;
                                int i6;
                                int i7;
                                FileOutputStream fileOutputStream;
                                FileOutputStream fileOutputStream2;
                                int i8;
                                int i9 = i;
                                FileOutputStream fileOutputStream3 = null;
                                fwd fwdVar2 = fwdVar;
                                Context context3 = context;
                                switch (i9) {
                                    case 0:
                                        List list = (List) fwdVar2.c.b;
                                        String str2 = (String) list.get(0);
                                        int intValue = ((Integer) list.get(1)).intValue();
                                        int intValue2 = ((Integer) list.get(2)).intValue();
                                        int intValue3 = ((Integer) list.get(3)).intValue();
                                        int intValue4 = ((Integer) list.get(4)).intValue();
                                        boolean booleanValue = ((Boolean) list.get(5)).booleanValue();
                                        int intValue5 = ((Integer) list.get(6)).intValue();
                                        boolean booleanValue2 = ((Boolean) list.get(7)).booleanValue();
                                        int intValue6 = ((Integer) list.get(8)).intValue();
                                        int intValue7 = ((Integer) list.get(9)).intValue();
                                        n7s n7sVar = (n7s) r7s.a.get(intValue5);
                                        if (n7sVar == null) {
                                            qgb1.b("No support format.");
                                            fwdVar2.a(null);
                                            return;
                                        }
                                        if (booleanValue) {
                                            try {
                                                i4 = new a(new ByteArrayInputStream(g3r.c(new File(str2)))).n();
                                            } catch (Exception unused) {
                                                i4 = 0;
                                            }
                                            i2 = i4;
                                        } else {
                                            i2 = 0;
                                        }
                                        if (i2 == 90 || i2 == 270) {
                                            i3 = intValue;
                                            intValue = intValue2;
                                        } else {
                                            i3 = intValue2;
                                        }
                                        int i10 = intValue4 + i2;
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            try {
                                                n7sVar.b(context3, str2, byteArrayOutputStream, intValue, i3, intValue3, i10, booleanValue2, intValue6, intValue7);
                                                fwdVar2.a(byteArrayOutputStream.toByteArray());
                                            } finally {
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Exception unused2) {
                                            fwdVar2.a(null);
                                        }
                                        return;
                                    default:
                                        List list2 = (List) fwdVar2.c.b;
                                        String str3 = (String) list2.get(0);
                                        int intValue8 = ((Integer) list2.get(1)).intValue();
                                        int intValue9 = ((Integer) list2.get(2)).intValue();
                                        int intValue10 = ((Integer) list2.get(3)).intValue();
                                        String str4 = (String) list2.get(4);
                                        int intValue11 = ((Integer) list2.get(5)).intValue();
                                        if (((Boolean) list2.get(6)).booleanValue()) {
                                            try {
                                                i8 = new a(new File(str3).getAbsolutePath()).n();
                                            } catch (Exception unused3) {
                                                i8 = 0;
                                            }
                                            i5 = i8;
                                        } else {
                                            i5 = 0;
                                        }
                                        int intValue12 = ((Integer) list2.get(7)).intValue();
                                        boolean booleanValue3 = ((Boolean) list2.get(8)).booleanValue();
                                        int intValue13 = ((Integer) list2.get(9)).intValue();
                                        int intValue14 = ((Integer) list2.get(10)).intValue();
                                        n7s n7sVar2 = (n7s) r7s.a.get(intValue12);
                                        if (n7sVar2 == null) {
                                            qgb1.b("No support format.");
                                            fwdVar2.a(null);
                                            return;
                                        }
                                        if (i5 == 90 || i5 == 270) {
                                            i6 = intValue9;
                                            i7 = intValue8;
                                        } else {
                                            i7 = intValue9;
                                            i6 = intValue8;
                                        }
                                        int i11 = intValue11 + i5;
                                        try {
                                            fileOutputStream2 = new FileOutputStream(new File(str4));
                                        } catch (Exception unused4) {
                                            fileOutputStream = null;
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                        try {
                                            n7sVar2.b(context3, str3, fileOutputStream2, i6, i7, intValue10, i11, booleanValue3, intValue13, intValue14);
                                            fwdVar2.a(str4);
                                            fileOutputStream2.close();
                                            return;
                                        } catch (Exception unused5) {
                                            fileOutputStream = fileOutputStream2;
                                            try {
                                                fwdVar2.a(null);
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileOutputStream3 = fileOutputStream;
                                                if (fileOutputStream3 != null) {
                                                    fileOutputStream3.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            fileOutputStream3 = fileOutputStream2;
                                            if (fileOutputStream3 != null) {
                                            }
                                            throw th;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    break;
                case 86054116:
                    if (str.equals("compressWithFile")) {
                        final fwd fwdVar2 = new fwd(x920Var, (ba20) da20Var);
                        Context context3 = this.a;
                        context = context3 != null ? context3 : null;
                        final int i2 = 0;
                        fwd.e.execute(new Runnable() { // from class: ewd
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
                            /* JADX WARN: Type inference failed for: r0v3, types: [byte[], java.io.Serializable] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int i22;
                                int i3;
                                int i4;
                                int i5;
                                int i6;
                                int i7;
                                FileOutputStream fileOutputStream;
                                FileOutputStream fileOutputStream2;
                                int i8;
                                int i9 = i2;
                                FileOutputStream fileOutputStream3 = null;
                                fwd fwdVar22 = fwdVar2;
                                Context context32 = context;
                                switch (i9) {
                                    case 0:
                                        List list = (List) fwdVar22.c.b;
                                        String str2 = (String) list.get(0);
                                        int intValue = ((Integer) list.get(1)).intValue();
                                        int intValue2 = ((Integer) list.get(2)).intValue();
                                        int intValue3 = ((Integer) list.get(3)).intValue();
                                        int intValue4 = ((Integer) list.get(4)).intValue();
                                        boolean booleanValue = ((Boolean) list.get(5)).booleanValue();
                                        int intValue5 = ((Integer) list.get(6)).intValue();
                                        boolean booleanValue2 = ((Boolean) list.get(7)).booleanValue();
                                        int intValue6 = ((Integer) list.get(8)).intValue();
                                        int intValue7 = ((Integer) list.get(9)).intValue();
                                        n7s n7sVar = (n7s) r7s.a.get(intValue5);
                                        if (n7sVar == null) {
                                            qgb1.b("No support format.");
                                            fwdVar22.a(null);
                                            return;
                                        }
                                        if (booleanValue) {
                                            try {
                                                i4 = new a(new ByteArrayInputStream(g3r.c(new File(str2)))).n();
                                            } catch (Exception unused) {
                                                i4 = 0;
                                            }
                                            i22 = i4;
                                        } else {
                                            i22 = 0;
                                        }
                                        if (i22 == 90 || i22 == 270) {
                                            i3 = intValue;
                                            intValue = intValue2;
                                        } else {
                                            i3 = intValue2;
                                        }
                                        int i10 = intValue4 + i22;
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            try {
                                                n7sVar.b(context32, str2, byteArrayOutputStream, intValue, i3, intValue3, i10, booleanValue2, intValue6, intValue7);
                                                fwdVar22.a(byteArrayOutputStream.toByteArray());
                                            } finally {
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Exception unused2) {
                                            fwdVar22.a(null);
                                        }
                                        return;
                                    default:
                                        List list2 = (List) fwdVar22.c.b;
                                        String str3 = (String) list2.get(0);
                                        int intValue8 = ((Integer) list2.get(1)).intValue();
                                        int intValue9 = ((Integer) list2.get(2)).intValue();
                                        int intValue10 = ((Integer) list2.get(3)).intValue();
                                        String str4 = (String) list2.get(4);
                                        int intValue11 = ((Integer) list2.get(5)).intValue();
                                        if (((Boolean) list2.get(6)).booleanValue()) {
                                            try {
                                                i8 = new a(new File(str3).getAbsolutePath()).n();
                                            } catch (Exception unused3) {
                                                i8 = 0;
                                            }
                                            i5 = i8;
                                        } else {
                                            i5 = 0;
                                        }
                                        int intValue12 = ((Integer) list2.get(7)).intValue();
                                        boolean booleanValue3 = ((Boolean) list2.get(8)).booleanValue();
                                        int intValue13 = ((Integer) list2.get(9)).intValue();
                                        int intValue14 = ((Integer) list2.get(10)).intValue();
                                        n7s n7sVar2 = (n7s) r7s.a.get(intValue12);
                                        if (n7sVar2 == null) {
                                            qgb1.b("No support format.");
                                            fwdVar22.a(null);
                                            return;
                                        }
                                        if (i5 == 90 || i5 == 270) {
                                            i6 = intValue9;
                                            i7 = intValue8;
                                        } else {
                                            i7 = intValue9;
                                            i6 = intValue8;
                                        }
                                        int i11 = intValue11 + i5;
                                        try {
                                            fileOutputStream2 = new FileOutputStream(new File(str4));
                                        } catch (Exception unused4) {
                                            fileOutputStream = null;
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                        try {
                                            n7sVar2.b(context32, str3, fileOutputStream2, i6, i7, intValue10, i11, booleanValue3, intValue13, intValue14);
                                            fwdVar22.a(str4);
                                            fileOutputStream2.close();
                                            return;
                                        } catch (Exception unused5) {
                                            fileOutputStream = fileOutputStream2;
                                            try {
                                                fwdVar22.a(null);
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileOutputStream3 = fileOutputStream;
                                                if (fileOutputStream3 != null) {
                                                    fileOutputStream3.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            fileOutputStream3 = fileOutputStream2;
                                            if (fileOutputStream3 != null) {
                                            }
                                            throw th;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    break;
                case 86233094:
                    if (str.equals("compressWithList")) {
                        fwd fwdVar3 = new fwd(x920Var, (ba20) da20Var);
                        Context context4 = this.a;
                        fwd.e.execute(new l7a(21, fwdVar3, context4 != null ? context4 : null));
                        return;
                    }
                    break;
                case 1262746611:
                    if (str.equals("getSystemVersion")) {
                        ((ba20) da20Var).success(Integer.valueOf(Build.VERSION.SDK_INT));
                        return;
                    }
                    break;
                case 2067272455:
                    if (str.equals("showLog")) {
                        c = jl40.l((Boolean) x920Var.b, Boolean.TRUE);
                        ((ba20) da20Var).success(1);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
