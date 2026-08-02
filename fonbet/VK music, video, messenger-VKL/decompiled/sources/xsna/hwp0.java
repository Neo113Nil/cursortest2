package xsna;

import android.util.LongSparseArray;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.dto.stickers.ugc.UgcStatus;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.kcl0;

/* compiled from: UGCStickersRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class hwp0 implements kcl0.d {
    public final etj a;
    public final f9t b = new f9t(25);
    public final iwp0 c = new iwp0();
    public final LongSparseArray<List<ewp0>> d = new LongSparseArray<>();
    public final LongSparseArray<UGCChatSettingsModel> e = new LongSparseArray<>();
    public final LinkedHashSet f = new LinkedHashSet();
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    public hwp0(etj etjVar) {
        this.a = etjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, io.reactivex.rxjava3.disposables.c] */
    public static void e(hwp0 hwp0Var, Long l, String str, int i) {
        dz2 dz2Var = null;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        f9t f9tVar = hwp0Var.b;
        if (l != null && !hwp0Var.f.contains(l)) {
            dz2Var = yfb.x(new fdi().L(Collections.singletonList(l), null));
        } else if (str != null) {
            dz2Var = yfb.x(new fdi().L(null, Collections.singletonList(str)));
        }
        if (dz2Var == null) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? subscribe = new io.reactivex.rxjava3.internal.operators.single.j(rsg0.w0(dz2Var).m(asu0.a.c()), new fr60(2, ref$ObjectRef, hwp0Var)).subscribe(new ow40(new kti(hwp0Var, l, str, 5), 22), new pw40(new e750(23), 12));
        hwp0Var.g.b(subscribe);
        ref$ObjectRef.element = subscribe;
    }

    @Override // xsna.kcl0.d
    public final io.reactivex.rxjava3.internal.operators.single.f0 a(final long j) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.fwp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                iwp0 iwp0Var = hwp0.this.c;
                long j2 = j;
                UGCChatSettingsModel a = iwp0Var.a(j2);
                return a == null ? new UGCChatSettingsModel(j2, false, false, false, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null) : a;
            }
        }).q(asu0.a.c());
    }

    @Override // xsna.kcl0.d
    public final List<ewp0> b(long j) {
        List<ewp0> list = this.d.get(j);
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList<ewp0> arrayList = new ArrayList();
        for (Object obj : list) {
            List<UGCStickerModel> list2 = ((ewp0) obj).c;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((UGCStickerModel) it.next()).f != UgcStatus.AGE_RESTRICTED) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (ewp0 ewp0Var : arrayList) {
            List<UGCStickerModel> list3 = ewp0Var.c;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                if (((UGCStickerModel) obj2).f != UgcStatus.AGE_RESTRICTED) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2.add(new ewp0(ewp0Var.a, ewp0Var.b, arrayList3, ewp0Var.d, ewp0Var.e, ewp0Var.f));
        }
        return arrayList2;
    }

    @Override // xsna.kcl0.d
    public final boolean c(long j) {
        List<ewp0> list = this.d.get(j);
        return !(list == null || list.isEmpty());
    }

    @Override // xsna.kcl0.d
    public final io.reactivex.rxjava3.internal.operators.single.y d(long j) {
        tfx tfxVar = new tfx("stickers.hideUGCKeyboardOnboarding", new io.reactivex.rxjava3.internal.operators.mixed.n(29), new zq(25));
        tfx.m(tfxVar, "owner_id", j, 0L, 12);
        return rsg0.w0(yfb.x(tfxVar)).m(asu0.a.c()).l(new s1j0(new l140(21), 6)).l(new sqk0(new emf0(this, j), 3));
    }

    public final void f(UserId userId, boolean z, boolean z2, boolean z3, boolean z4) {
        this.c.a.d(userId);
        this.d.remove(userId.b);
        g(new UGCChatSettingsModel(userId.b, z2, z3, z4, false, z, false, 80, null));
    }

    public final void g(UGCChatSettingsModel uGCChatSettingsModel) {
        this.e.put(uGCChatSettingsModel.b, uGCChatSettingsModel);
        this.c.b.b(new bwp0(uGCChatSettingsModel.b, uGCChatSettingsModel.c, uGCChatSettingsModel.d, uGCChatSettingsModel.e, uGCChatSettingsModel.f, uGCChatSettingsModel.g, uGCChatSettingsModel.h));
    }
}
