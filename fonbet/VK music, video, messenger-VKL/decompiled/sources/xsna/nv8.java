package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.files.ExternalDirType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.gx8;

/* compiled from: CacheAnalyzerImpl.kt */
/* loaded from: classes15.dex */
public final class nv8 implements lv8 {
    public final gx8 a;
    public final bpn0 b = new bpn0(new d4(4));

    /* compiled from: CacheAnalyzerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheTarget.values().length];
            try {
                iArr[CacheTarget.PHOTOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheTarget.VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheTarget.DOWNLOADS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheTarget.DOWNLOADED_VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CacheTarget.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CacheTarget.SYSTEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nv8(gx8 gx8Var) {
        this.a = gx8Var;
    }

    @Override // xsna.lv8
    public final io.reactivex.rxjava3.internal.operators.observable.m1 a(List list) {
        io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new mv8(this, list));
        asu0 asu0Var = asu0.a;
        return qVar.r0(asu0Var.c()).a0(asu0Var.d());
    }

    public final long b(CacheTarget cacheTarget) {
        switch (a.$EnumSwitchMapping$0[cacheTarget.ordinal()]) {
            case 1:
                ExternalDirType externalDirType = ExternalDirType.IMAGES;
                com.vk.core.files.a.b.getClass();
                return com.vk.core.files.a.I(seq.b(externalDirType));
            case 2:
                ExternalDirType externalDirType2 = ExternalDirType.VIDEO;
                com.vk.core.files.a.b.getClass();
                return com.vk.core.files.a.I(seq.b(externalDirType2));
            case 3:
                ExternalDirType externalDirType3 = ExternalDirType.DOWNLOADS;
                com.vk.core.files.a.b.getClass();
                return com.vk.core.files.a.I(seq.b(externalDirType3));
            case 4:
                return fxc0.B().s().q();
            case 5:
                List<gx8.a> b = this.a.b(CacheTarget.OTHER);
                ArrayList arrayList = new ArrayList(c5g.u(b, 10));
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((gx8.a) it.next()).u()));
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = Long.valueOf(((Number) next).longValue() + ((Number) it2.next()).longValue());
                }
                return ((Number) next).longValue();
            case 6:
                return 0L;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final long c(List<? extends CacheTarget> list) {
        if (list.isEmpty()) {
            return 0L;
        }
        List<? extends CacheTarget> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(b((CacheTarget) it.next())));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() + ((Number) it2.next()).longValue());
        }
        return ((Number) next).longValue();
    }
}
