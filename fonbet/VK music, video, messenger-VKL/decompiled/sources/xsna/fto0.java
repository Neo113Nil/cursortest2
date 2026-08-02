package xsna;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.gestures.Orientation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.health.platform.client.proto.ByteString;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.zzpd;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.vendor.pushes.FirebasePushService;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.el50;

/* compiled from: TileMode.kt */
@vby
/* loaded from: classes11.dex */
public final class fto0 implements q701, i920 {
    public static final jai f;
    public static final jai g;
    public static final jai h;
    public static final jai i;
    public static final int[] b = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] c = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] d = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] e = {R.attr.name, R.attr.pathData};
    public static final dzl j = new dzl(1.0f, 1.0f);
    public static final fto0 k = new fto0();
    public static final i0r l = new i0r(22);
    public static final /* synthetic */ fto0 m = new fto0();

    static {
        byte b2 = 0;
        f = new jai(280450281, new u8c(b2, 1), false);
        g = new jai(-831708473, new zpb(b2, 3), false);
        h = new jai(1922341163, new u8c(b2, 2), false);
        i = new jai(-1398478681, new zpb(b2, 4), false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(gzs gzsVar, wzs wzsVar, ContinuationImpl continuationImpl) {
        vz1 vz1Var;
        int i2;
        if (continuationImpl instanceof vz1) {
            vz1Var = (vz1) continuationImpl;
            int i3 = vz1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vz1Var.label = i3 - Integer.MIN_VALUE;
                Object obj = vz1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = vz1Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    zz1 zz1Var = new zz1(gzsVar, wzsVar, null);
                    vz1Var.label = 1;
                    if (zvj.d(zz1Var, vz1Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }
        vz1Var = new vz1(continuationImpl);
        Object obj2 = vz1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = vz1Var.label;
        if (i2 != 0) {
        }
        return s3q0.a;
    }

    public static boolean c(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle2 == null ? bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
    }

    public static final UserId d(Peer peer) {
        if (peer.Ab(Peer.Type.GROUP)) {
            return new UserId(peer.d);
        }
        return null;
    }

    public static final Object e(Collection collection, spj spjVar) {
        return collection.isEmpty() ? EmptyList.b : new bu5((zrl[]) collection.toArray(new zrl[0])).a(spjVar);
    }

    public static final float f(l7l l7lVar, float f2, float f3) {
        return ((sq2) l7lVar.a().b(new sq2(f2), new sq2(f3))).a;
    }

    public static final s1a g(eea eeaVar, CatalogBlockData catalogBlockData) {
        t1a<? super CatalogBlockState> t1aVar = eeaVar.d.get(((CatalogBlockState) catalogBlockData.b.getValue()).getClass());
        if (t1aVar != null) {
            return t1aVar.a(new s1i0(eeaVar, catalogBlockData));
        }
        return null;
    }

    public static bhe0 h(FirebasePushService firebasePushService, boolean z, String str) {
        Context applicationContext = firebasePushService.getApplicationContext();
        if (!z) {
            return new mae0(applicationContext, str);
        }
        ExecutorService executorService = oa01.c;
        if (executorService == null) {
            executorService = null;
        }
        ExecutorService executorService2 = executorService;
        xhe0 e2 = dm10.e();
        ui70 d2 = z4g.d();
        v801 v801Var = FirebasePushService.d;
        if (v801Var != null) {
            return new xf00(applicationContext, executorService2, e2, d2, v801Var);
        }
        throw new IllegalArgumentException("Method initLibverify was not called on FirebasePushService!");
    }

    public static final q630 i(q630 q630Var, d12 d12Var, Orientation orientation, wzs wzsVar) {
        return q630Var.g(new ygo(d12Var, wzsVar, orientation));
    }

    public static String j(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i2 = 0; i2 < byteString.size(); i2++) {
            byte c2 = byteString.c(i2);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static m7l k() {
        return new m7l(new fqr());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair l(ClipFeedListFragment clipFeedListFragment, Window window) {
        Pair pair;
        Pair pair2;
        Fragment fragment;
        Context context;
        Dialog dialog;
        View view;
        List<Fragment> f2;
        Window window2;
        Dialog dialog2;
        FragmentManager childFragmentManager = clipFeedListFragment.getChildFragmentManager();
        if (childFragmentManager == null || (f2 = childFragmentManager.c.f()) == null || !(!f2.isEmpty())) {
            pair = new Pair(clipFeedListFragment, window);
        } else {
            Fragment fragment2 = (Fragment) j5g.i0(clipFeedListFragment.getChildFragmentManager().c.f());
            androidx.fragment.app.d dVar = fragment2 instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) fragment2 : null;
            if (dVar == null || (dialog2 = dVar.s) == null || (window2 = dialog2.getWindow()) == null) {
                FragmentActivity activity = fragment2.getActivity();
                window2 = activity != null ? activity.getWindow() : null;
            }
            if (window2 != null) {
                pair2 = new Pair(fragment2, window2);
                fragment = (Fragment) pair2.d();
                Window window3 = (Window) pair2.g();
                if (fragment != null || (view = fragment.getView()) == null || (context = view.getContext()) == null) {
                    androidx.fragment.app.d dVar2 = !(fragment instanceof androidx.fragment.app.d) ? (androidx.fragment.app.d) fragment : null;
                    context = (dVar2 != null || (dialog = dVar2.s) == null) ? null : dialog.getContext();
                    if (context == null) {
                        Context context2 = e43.a;
                        context = context2 != null ? context2 : null;
                    }
                }
                return new Pair(bwt0.u(context), window3);
            }
            pair = new Pair(clipFeedListFragment, window);
        }
        pair2 = pair;
        fragment = (Fragment) pair2.d();
        Window window32 = (Window) pair2.g();
        if (fragment != null) {
        }
        if (!(fragment instanceof androidx.fragment.app.d)) {
        }
        if (dVar2 != null) {
        }
        if (context == null) {
        }
        return new Pair(bwt0.u(context), window32);
    }

    public static lqv m(lg90 lg90Var, long j2, androidx.compose.runtime.a aVar, int i2) {
        if ((i2 & 2) != 0) {
            j2 = wnj.a(aVar);
        }
        long j3 = j2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1649375005, 196616, -1, "com.vk.core.compose.component.context.menu.ContextMenuItem.Right.Icon.Companion.invoke (ContextMenuItem.kt:127)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1456007674, 70, -1, "com.vk.core.compose.component.context.menu.remember (IconImpl.kt:66)");
        }
        lqv a = qqv.a(lg90Var, j3, 9205357640488583168L, aVar, 8);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static final boolean n(FragmentImpl fragmentImpl) {
        return fragmentImpl.getParentFragment() != null ? !lbs.r(fragmentImpl) : (fragmentImpl.isHidden() || fragmentImpl.Mn()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(ArrayList arrayList, ContinuationImpl continuationImpl) {
        du5 du5Var;
        int i2;
        Iterator it;
        if (continuationImpl instanceof du5) {
            du5Var = (du5) continuationImpl;
            int i3 = du5Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                du5Var.label = i3 - Integer.MIN_VALUE;
                Object obj = du5Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = du5Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    it = arrayList.iterator();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) du5Var.L$0;
                    kotlin.a.a(obj);
                }
                while (it.hasNext()) {
                    eyx eyxVar = (eyx) it.next();
                    du5Var.L$0 = it;
                    du5Var.label = 1;
                    if (eyxVar.y(du5Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
        }
        du5Var = new du5(continuationImpl);
        Object obj2 = du5Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = du5Var.label;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return s3q0.a;
    }

    public static String p(InputStream inputStream) {
        Charset charset = emb.b;
        try {
            e8f0 e8f0Var = new e8f0(mq9.d(inputStream));
            try {
                String p3 = e8f0Var.p3(charset);
                e8f0Var.close();
                inputStream.close();
                return p3;
            } finally {
            }
        } finally {
        }
    }

    public static final void q(HashMap hashMap, izs izsVar) {
        int i2;
        HashMap hashMap2 = new HashMap(999);
        loop0: while (true) {
            i2 = 0;
            for (Object obj : hashMap.keySet()) {
                hashMap2.put(obj, hashMap.get(obj));
                i2++;
                if (i2 == 999) {
                    break;
                }
            }
            izsVar.invoke(hashMap2);
            hashMap2.clear();
        }
        if (i2 > 0) {
            izsVar.invoke(hashMap2);
        }
    }

    public static final void r(x500 x500Var, izs izsVar) {
        x500 x500Var2 = new x500(999);
        int size = x500Var.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            x500Var2.put(x500Var.keyAt(i2), x500Var.valueAt(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                izsVar.invoke(x500Var2);
                x500Var2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            izsVar.invoke(x500Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, xsna.lm50] */
    public static final void s(eea eeaVar, izs izsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = eeaVar.b.getCurrentState();
        CatalogSectionState catalogSectionState = (CatalogSectionState) el50.a.b(eeaVar, new w8t0(1, ref$ObjectRef, izsVar));
        CatalogSectionState catalogSectionState2 = (CatalogSectionState) ref$ObjectRef.element;
        if (epx.f(catalogSectionState2.d, catalogSectionState.d)) {
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(catalogSectionState2.d);
        for (CatalogBlockData catalogBlockData : catalogSectionState.d) {
            if (catalogBlockData.c != null) {
                hashSet.remove(catalogBlockData);
            } else {
                catalogBlockData.c = g(eeaVar, catalogBlockData);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((CatalogBlockData) it.next()).clear();
        }
    }

    public static final q630 t(q630 q630Var, float f2) {
        return f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? q630Var : rdu.c(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, null, 524031);
    }

    public static final boolean u(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return false;
        }
        boolean z = recyclerView.computeVerticalScrollOffset() != 0;
        if (z) {
            recyclerView.scrollToPosition(0);
        }
        return z;
    }

    public static String v(int i2) {
        return i2 == 0 ? "Clamp" : i2 == 1 ? "Repeated" : i2 == 2 ? "Mirror" : i2 == 3 ? "Decal" : DeviceInfo.STR_TYPE_UNKNOWN;
    }

    public static final String w(String str) {
        StringBuilder b2 = v1v.b(str, '_');
        b2.append(o25.a().c().b);
        return b2.toString();
    }

    @Override // xsna.i920
    public frz a(frz frzVar, frz frzVar2, Object obj) {
        xrm xrmVar = (xrm) frzVar2;
        DialogsHistory dialogsHistory = ((xrm) frzVar).b;
        DialogsHistory dialogsHistory2 = xrmVar.b;
        DialogsHistory dialogsHistory3 = new DialogsHistory(t0w.a(dialogsHistory, dialogsHistory2, (gkx0) obj));
        ArrayList arrayList = new ArrayList();
        Iterator<com.vk.im.engine.models.dialogs.Dialog> it = dialogsHistory3.iterator();
        while (it.hasNext()) {
            com.vk.im.engine.models.dialogs.Dialog next = it.next();
            if (next.Kb().d()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((com.vk.im.engine.models.dialogs.Dialog) it2.next()).Zb().b));
        }
        dialogsHistory3.d().removeAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(c5g.u(dialogsHistory2, 10));
        Iterator<com.vk.im.engine.models.dialogs.Dialog> it3 = dialogsHistory2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Long.valueOf(it3.next().Zb().b));
        }
        return new xrm(dialogsHistory3, j5g.S0(arrayList3), fsk.l(dialogsHistory3), xrmVar.e);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpd.zze());
    }
}
