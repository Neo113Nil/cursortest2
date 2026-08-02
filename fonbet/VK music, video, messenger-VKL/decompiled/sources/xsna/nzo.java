package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Environment;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.geo.impl.model.BoundingBox;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: EditButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class nzo implements wq5 {
    public static final nzo b = new nzo();

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(gzs gzsVar, wzs wzsVar, ContinuationImpl continuationImpl) {
        uz1 uz1Var;
        int i;
        if (continuationImpl instanceof uz1) {
            uz1Var = (uz1) continuationImpl;
            int i2 = uz1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uz1Var.label = i2 - Integer.MIN_VALUE;
                Object obj = uz1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uz1Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    yz1 yz1Var = new yz1(gzsVar, wzsVar, null);
                    uz1Var.label = 1;
                    if (zvj.d(yz1Var, uz1Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }
        uz1Var = new uz1(continuationImpl);
        Object obj2 = uz1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uz1Var.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    public static ArrayList c(Context context) {
        File[] externalFilesDirs = context.getExternalFilesDirs(Environment.DIRECTORY_MUSIC);
        if (externalFilesDirs == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(externalFilesDirs.length);
        for (File file : externalFilesDirs) {
            if (file != null) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static lzo0 d(int i, int i2, androidx.compose.runtime.a aVar, String str, boolean z) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2004111657, i, -1, "com.vk.core.compose.component.context.menu.ContextMenuItem.Middle.Title.Companion.invoke (ContextMenuItem.kt:81)");
        }
        us2 b2 = ws2.b(str, aVar, i & 14);
        int i3 = i & 8176;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2016740939, i3, -1, "com.vk.core.compose.component.context.menu.ContextMenuItem.Middle.Title.Companion.invoke (ContextMenuItem.kt:88)");
        }
        int i4 = ((i3 << 3) & 7168) | 6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2127513795, i4, -1, "com.vk.core.compose.component.context.menu.remember (TitleImpl.kt:69)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new lzo0(b2, z);
            aVar.R(x);
        }
        lzo0 lzo0Var = (lzo0) x;
        ((zak0) lzo0Var.a).setValue(b2);
        ((zak0) lzo0Var.b).setValue(null);
        ((zak0) lzo0Var.c).setValue(Boolean.valueOf(z));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return lzo0Var;
    }

    public static BoundingBox f(BoundingBox boundingBox, int i, int i2) {
        if (i == 0 || i2 == 0) {
            return null;
        }
        float f = i / i2;
        float a0 = boundingBox.a0();
        float F = boundingBox.F();
        if (a0 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || F <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return null;
        }
        float f2 = a0 / F;
        return f == f2 ? boundingBox : f2 > f ? new BoundingBox(boundingBox.d, boundingBox.a0(), (F * f2) / f, (zcl) null) : new BoundingBox(boundingBox.d, (a0 * f) / f2, F, (zcl) null);
    }

    public static final long g(float f, float f2) {
        return an10.c(f * f2);
    }

    public static final rh00 h(va0 va0Var, izs izsVar, androidx.compose.runtime.a aVar) {
        lb0 lb0Var;
        int i = 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1408504823, 0, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        wh50 c = androidx.compose.runtime.k.c(va0Var, aVar, 0);
        wh50 c2 = androidx.compose.runtime.k.c(izsVar, aVar, 0);
        Object[] objArr = new Object[0];
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = new ob0(i);
            aVar.R(x);
        }
        String str = (String) crx0.A(objArr, (gzs) x, aVar, 48);
        pqo pqoVar = wtz.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1418020823, 6, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        sb0 sb0Var = (sb0) aVar.r(wtz.a);
        if (sb0Var == null) {
            aVar.K(1213380307);
            Object obj2 = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(obj2 instanceof ContextWrapper)) {
                    obj2 = null;
                    break;
                }
                if (obj2 instanceof sb0) {
                    break;
                }
                obj2 = ((ContextWrapper) obj2).getBaseContext();
            }
            sb0Var = (sb0) obj2;
        } else {
            aVar.K(1213379439);
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (sb0Var == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        lb0 activityResultRegistry = sb0Var.getActivityResultRegistry();
        Object x2 = aVar.x();
        if (x2 == obj) {
            x2 = new ib0();
            aVar.R(x2);
        }
        ib0 ib0Var = (ib0) x2;
        Object x3 = aVar.x();
        if (x3 == obj) {
            x3 = new rh00(ib0Var, c);
            aVar.R(x3);
        }
        rh00 rh00Var = (rh00) x3;
        boolean y = aVar.y(ib0Var) | aVar.y(activityResultRegistry) | aVar.J(str) | aVar.y(va0Var) | aVar.J(c2);
        Object x4 = aVar.x();
        if (y || x4 == obj) {
            lb0Var = activityResultRegistry;
            Object pb0Var = new pb0(ib0Var, lb0Var, str, va0Var, c2);
            str = str;
            aVar.R(pb0Var);
            x4 = pb0Var;
        } else {
            lb0Var = activityResultRegistry;
        }
        bap.a(lb0Var, str, va0Var, (izs) x4, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return rh00Var;
    }

    public static final void i(VKList vKList, Set set) {
        Iterator<T> it = vKList.iterator();
        while (it.hasNext()) {
            Photo photo = (Photo) it.next();
            if (set.contains(Integer.valueOf(photo.c))) {
                photo.L = null;
            }
        }
    }

    public static final ExtractedText j(tho0 tho0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = tho0Var.a.c;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = tho0Var.b;
        extractedText.selectionStart = qko0.f(j);
        extractedText.selectionEnd = qko0.e(j);
        extractedText.flags = !drm0.E(tho0Var.a.c, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(String str, final yzs yzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final String str2;
        androidx.compose.runtime.a M = aVar.M(-992990331);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-992990331, i2, -1, "com.vk.profile.design.compose.user.UserFriendsContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (VkProfileFriendsInfo.kt:107)");
            }
            str2 = str;
            if (as.a((i2 & 112) | 8, yzsVar, fwu0.l(null, str2, null, null, M, (i2 << 3) & 112, 61), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ydv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    nzo.this.e(str2, yzsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
