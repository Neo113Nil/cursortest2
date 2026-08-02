package xsna;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.network.kbh.state.NetworkState;
import com.vk.voip.dto.RecordType;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* compiled from: DataSourceUtil.java */
/* loaded from: classes12.dex */
public final class cvk implements vaz, zy1, io.reactivex.rxjava3.functions.j {
    public static final dt60 b = new dt60();

    public static void A(ClassLoader classLoader, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(((File) it.next()).getParentFile());
        }
        Field T = f370.T(classLoader, "pathList");
        try {
            Object cast = Object.class.cast(T.get(classLoader));
            com.vk.movika.sdk.android.defaultplayer.utils.c cVar = new com.vk.movika.sdk.android.defaultplayer.utils.c(cast, f370.T(cast, "nativeLibraryDirectories"), List.class);
            synchronized (wl01.class) {
                ArrayList arrayList = new ArrayList((Collection) cVar.d());
                hashSet2.removeAll(arrayList);
                arrayList.addAll(hashSet2);
                cVar.e(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] objArr = (Object[]) f370.S(cast, "makePathElements", Object[].class, List.class, new ArrayList(hashSet2));
            if (arrayList2.isEmpty()) {
                synchronized (wl01.class) {
                    f370.Q(Object.class, cast, "nativeLibraryPathElements").g(Arrays.asList(objArr));
                }
                return;
            }
            zzbh zzbhVar = new zzbh("Error in makePathElements");
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i));
                } catch (Exception unused) {
                }
            }
            throw zzbhVar;
        } catch (Exception e) {
            String name = T.getName();
            String name2 = classLoader.getClass().getName();
            String name3 = Object.class.getName();
            StringBuilder a = xe9.a("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            a.append(name3);
            throw new zzbl(a.toString(), e);
        }
    }

    public static final void i(mtk0 mtk0Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1200962313);
        int i2 = (M.J(mtk0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1200962313, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingCancelConfirmationDialog (BookingCancelConfirmationDialog.kt:19)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new xn7(izsVar, mtk0Var);
                M.R(x);
            }
            xn7 xn7Var = (xn7) x;
            ((zak0) xn7Var.b).setValue(izsVar);
            xn7Var.a(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yn7(mtk0Var, izsVar, i, 0);
        }
    }

    public static final si70 j(Context context, caw cawVar, daw dawVar) {
        return new si70(context, cawVar, dawVar);
    }

    public static void k(@Nullable androidx.media3.datasource.a aVar) {
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final boolean l(File file) {
        try {
            if (file.exists()) {
                return file.isDirectory();
            }
            file.mkdirs();
            return file.isDirectory();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final long m(ljo0 ljo0Var, int i, boolean z, boolean z2) {
        m540 m540Var = ljo0Var.b;
        long j = ljo0Var.c;
        if (m540Var.d(i) >= ljo0Var.b.f) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(swe0.f(ljo0Var.f(i, ljo0Var.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == ljo0Var.j(i)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(swe0.f(r3.b(r0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j & 4294967295L))) & 4294967295L);
    }

    public static final int o(muk0 muk0Var) {
        return System.identityHashCode(muk0Var);
    }

    public static z6p0 p(efj efjVar, float f, iy5 iy5Var, k18 k18Var, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        efj efjVar2;
        if ((i2 & 2) != 0) {
            f = 56;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            iy5Var = rep.a;
        }
        if ((i2 & 8) != 0) {
            k18Var = wep.a;
        }
        k18 k18Var2 = k18Var;
        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 16) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1068899103, i, -1, "com.vk.core.compose.component.placeholder.Placeholder.Top.Avatar.Companion.invoke (Placeholder.kt:109)");
        }
        List singletonList = Collections.singletonList(iy5Var);
        int i3 = 6 | ((i << 6) & 7168);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(204260761, i3, -1, "com.vk.core.compose.component.placeholder.remember (TopAvatarImpl.kt:85)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            efjVar2 = efjVar;
            z6p0 z6p0Var = new z6p0(efjVar2, f2, singletonList, k18Var2, aVar3);
            aVar2.R(z6p0Var);
            x = z6p0Var;
        } else {
            efjVar2 = efjVar;
        }
        z6p0 z6p0Var2 = (z6p0) x;
        ((zak0) z6p0Var2.a).setValue(efjVar2);
        ((zak0) z6p0Var2.b).setValue(new pco(f2));
        ((zak0) z6p0Var2.c).setValue(new wow(singletonList));
        ((zak0) z6p0Var2.d).setValue(k18Var2);
        ((zak0) z6p0Var2.e).setValue(null);
        ((zak0) z6p0Var2.f).setValue(aVar3);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return z6p0Var2;
    }

    public static final long q(File file) {
        try {
            if (file.isDirectory()) {
                return 0L;
            }
            return file.length();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static final void r(gzs gzsVar) {
        if (d6q0.t == NetworkState.UNSTABLE) {
            t();
        } else {
            gzsVar.invoke();
        }
    }

    public static long s(int i, ByteBuffer byteBuffer) {
        int y;
        if (i == 1) {
            y = crx0.y(byteBuffer);
        } else if (i == 2) {
            y = crx0.u(byteBuffer);
        } else {
            if (i != 3) {
                if (i == 4) {
                    return crx0.w(byteBuffer);
                }
                if (i == 8) {
                    return crx0.x(byteBuffer);
                }
                throw new RuntimeException(tgw.b(i, "I don't know how to read ", " bytes"));
            }
            y = crx0.v(byteBuffer);
        }
        return y;
    }

    public static final void t() {
        hew.b.getClass();
        f6q0 b2 = com.vk.toggle.d.H0.b();
        if (b2 == null) {
            f6q0.l.getClass();
            b2 = f6q0.m;
        }
        vk9 vk9Var = new vk9(b2, 5);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            vk9Var.run();
        } else {
            hew.g.post(vk9Var);
        }
    }

    public static final void u(int i, boolean z) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        w(context.getResources().getString(i), z);
    }

    public static final void v(int i, Object... objArr) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        w(context.getResources().getString(i, Arrays.copyOf(objArr, objArr.length)), false);
    }

    public static final void w(final CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            return;
        }
        if (!epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            final int i = z ? 1 : 0;
            pro0.c(new Runnable() { // from class: xsna.bpl
                @Override // java.lang.Runnable
                public final void run() {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    Toast.makeText(context, charSequence, i).show();
                }
            });
        } else {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            Toast.makeText(context, charSequence, z ? 1 : 0).show();
        }
    }

    public static final void z(String str, dcy dcyVar) {
        String sb;
        String str2 = "in the polymorphic scope of '" + dcyVar.l() + '\'';
        if (str == null) {
            sb = air.b(JwtParser.SEPARATOR_CHAR, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder a = xe9.a("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            n6j.b(a, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            a.append(dcyVar.l());
            a.append("' has to be sealed and '@Serializable'.");
            sb = a.toString();
        }
        throw new SerializationException(sb);
    }

    @Override // xsna.zy1
    public /* bridge */ /* synthetic */ boolean D(Object obj) {
        ((Number) obj).longValue();
        return false;
    }

    @Override // xsna.vaz
    public Object a(String str) {
        return new jcp(str);
    }

    @Override // xsna.vaz
    public Object b(String str) {
        return new jvu(str);
    }

    @Override // xsna.vaz
    public Object c(k320 k320Var) {
        return new j420(k320Var);
    }

    @Override // xsna.vaz
    public Object d(String str) {
        return new wn70(str);
    }

    @Override // xsna.vaz
    public Object e(String str) {
        return new ifq0(str);
    }

    @Override // xsna.vaz
    public Object f(String str) {
        return new t3a0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.j
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        RecordType recordType;
        boolean booleanValue = ((Boolean) obj6).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj2).booleanValue();
        boolean booleanValue5 = ((Boolean) obj).booleanValue();
        hd8 hd8Var = (hd8) ((it80) obj4).a;
        if (hd8Var == null || (recordType = hd8Var.f) == null) {
            recordType = RecordType.NOTHING;
        }
        boolean z = false;
        boolean z2 = recordType == RecordType.RECORD;
        boolean z3 = booleanValue5 && booleanValue && !booleanValue2;
        if (booleanValue3 && z2) {
            z = true;
        }
        return new VoipActionsFeatureState.r(z3, z2, booleanValue4, z);
    }

    @Override // xsna.vaz
    public Object h(String str, String str2, boolean z) {
        return new y7o0(str, str2, z);
    }

    @Override // xsna.zy1
    public Object n(frz frzVar) {
        Number next;
        long longValue;
        DialogsHistory dialogsHistory = ((xrm) frzVar).b;
        Iterator<Number> it = dialogsHistory.d().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long longValue2 = next.longValue();
                do {
                    Number next2 = it.next();
                    long longValue3 = next2.longValue();
                    if (longValue2 < longValue3) {
                        next = next2;
                        longValue2 = longValue3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Number number = next;
        Long valueOf = number != null ? Long.valueOf(number.longValue()) : null;
        if (valueOf != null) {
            longValue = valueOf.longValue();
        } else {
            Dialog dialog = (Dialog) j5g.k0(dialogsHistory.k());
            Long Sb = dialog != null ? dialog.Sb() : null;
            longValue = Sb != null ? Sb.longValue() : Long.MAX_VALUE;
        }
        return Long.valueOf(longValue);
    }
}
