package xsna;

import android.graphics.Bitmap;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sidecontrols.api.AnimatedSharingController;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import xsna.rxp;

/* compiled from: AnimatedSharingControllerImpl.kt */
/* loaded from: classes5.dex */
public final class sl2 implements AnimatedSharingController {
    public static dcj0 b;
    public static com.vk.clips.viewer.vk.a c;
    public static hdm d;
    public static ojh0 e;
    public static com.vk.im.engine.models.c f;
    public static a84 g;
    public static s2f h;
    public static boolean i;
    public static SdkClipVideoFile n;
    public static a o;
    public static boolean p;
    public static final sl2 a = new sl2();
    public static final CopyOnWriteArrayList<AnimatedSharingController.a> j = new CopyOnWriteArrayList<>();
    public static final io.reactivex.rxjava3.disposables.b k = new io.reactivex.rxjava3.disposables.b();
    public static final CopyOnWriteArrayList<Target> l = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<String, Bitmap> m = new ConcurrentHashMap<>();
    public static final AtomicReference<b> q = new AtomicReference<>(b.IDLE);
    public static final d r = new d();
    public static final String s = sl2.class.getSimpleName();

    /* compiled from: AnimatedSharingControllerImpl.kt */
    public static final class a {
        public int a = 0;
        public boolean b = false;
        public boolean c = false;
        public boolean d = false;
        public final AnimatedSharingController.Strategy e;

        public a(AnimatedSharingController.Strategy strategy) {
            this.e = strategy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "CurrentClipState(viewCount=" + this.a + ", likeTriggered=" + this.b + ", rewatchTriggered=" + this.c + ", isAnimating=" + this.d + ", strategy=" + this.e + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimatedSharingControllerImpl.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b IDLE;
        public static final b LOADED;
        public static final b LOADING;

        static {
            b bVar = new b("IDLE", 0);
            IDLE = bVar;
            b bVar2 = new b("LOADING", 1);
            LOADING = bVar2;
            b bVar3 = new b("LOADED", 2);
            LOADED = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: AnimatedSharingControllerImpl.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimatedSharingController.Strategy.values().length];
            try {
                iArr[AnimatedSharingController.Strategy.LIKE_EVERY_TIME_NO_STOP_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimatedSharingController.Strategy.LIKE_AND_REWATCH_ONCE_WITH_STOP_FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AnimatedSharingControllerImpl.kt */
    public static final class d implements z0q {
        @Override // xsna.z0q
        public final void b(rxp rxpVar) {
            if (rxpVar instanceof rxp.a) {
                rxp.a aVar = (rxp.a) rxpVar;
                if (aVar.b) {
                    sl2 sl2Var = sl2.a;
                    SdkClipVideoFile sdkClipVideoFile = aVar.a;
                    sl2Var.getClass();
                    String r1 = sdkClipVideoFile.r1();
                    SdkClipVideoFile sdkClipVideoFile2 = sl2.n;
                    if (!epx.f(sdkClipVideoFile2 != null ? sdkClipVideoFile2.r1() : null, r1)) {
                        sl2.h(sdkClipVideoFile);
                    }
                    a aVar2 = sl2.o;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.b = true;
                    if (sl2.i(aVar2)) {
                        sl2.j(aVar2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(rxpVar instanceof rxp.f)) {
                if (rxpVar instanceof rxp.e) {
                    sl2 sl2Var2 = sl2.a;
                    SdkClipVideoFile sdkClipVideoFile3 = ((rxp.e) rxpVar).a;
                    sl2Var2.getClass();
                    String r12 = sdkClipVideoFile3.r1();
                    SdkClipVideoFile sdkClipVideoFile4 = sl2.n;
                    if (!epx.f(sdkClipVideoFile4 != null ? sdkClipVideoFile4.r1() : null, r12)) {
                        sl2.h(sdkClipVideoFile3);
                    }
                    a aVar3 = sl2.o;
                    if (aVar3 == null) {
                        return;
                    }
                    aVar3.a++;
                    return;
                }
                return;
            }
            sl2 sl2Var3 = sl2.a;
            rxp.f fVar = (rxp.f) rxpVar;
            SdkClipVideoFile sdkClipVideoFile5 = fVar.a;
            long j = fVar.b;
            sl2Var3.getClass();
            String r13 = sdkClipVideoFile5.r1();
            SdkClipVideoFile sdkClipVideoFile6 = sl2.n;
            if (!epx.f(sdkClipVideoFile6 != null ? sdkClipVideoFile6.r1() : null, r13)) {
                sl2.h(sdkClipVideoFile5);
            }
            a aVar4 = sl2.o;
            if (aVar4 == null || aVar4.e == AnimatedSharingController.Strategy.LIKE_EVERY_TIME_NO_STOP_FRAME || aVar4.a < 1 || aVar4.c || j < 1500) {
                return;
            }
            aVar4.c = true;
            if (sl2.i(aVar4)) {
                sl2.j(aVar4);
            }
        }
    }

    public static void f() {
        VideoFile videoFile;
        AttachmentInfo attachmentInfo;
        SdkClipVideoFile sdkClipVideoFile = n;
        if (sdkClipVideoFile != null) {
            s2f s2fVar = h;
            if (s2fVar == null) {
                s2fVar = null;
            }
            videoFile = s2fVar.a(sdkClipVideoFile);
        } else {
            videoFile = null;
        }
        if (videoFile != null) {
            a84 a84Var = g;
            if (a84Var == null) {
                a84Var = null;
            }
            attachmentInfo = a84Var.f(videoFile, null);
        } else {
            attachmentInfo = null;
        }
        if (attachmentInfo != null) {
            new bvt0(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, SchemeStat$TypeView.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(attachmentInfo.d), Long.valueOf(attachmentInfo.c), attachmentInfo.zb(), attachmentInfo.r(), null, 32, null), "", "", null, new MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView(MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView.Event.SHARING_BUTTON_ANIMATED))).q();
        }
    }

    public static List g() {
        return rli0.A(rli0.y(rli0.j(new i5g(l), new x90(1)), 3));
    }

    public static void h(SdkClipVideoFile sdkClipVideoFile) {
        String r1 = sdkClipVideoFile.r1();
        SdkClipVideoFile sdkClipVideoFile2 = n;
        Object obj = null;
        if (epx.f(sdkClipVideoFile2 != null ? sdkClipVideoFile2.r1() : null, r1)) {
            return;
        }
        a aVar = o;
        if (aVar != null && aVar.d) {
            Iterator<AnimatedSharingController.a> it = j.iterator();
            while (it.hasNext()) {
                it.next().c();
                s3q0 s3q0Var = s3q0.a;
            }
            a aVar2 = o;
            if (aVar2 != null) {
                aVar2.d = false;
            }
        }
        n = sdkClipVideoFile;
        AnimatedSharingController.Strategy.a aVar3 = AnimatedSharingController.Strategy.Companion;
        com.vk.im.engine.models.c cVar = f;
        if (cVar == null) {
            cVar = null;
        }
        int i2 = cVar.y().a;
        aVar3.getClass();
        Iterator<E> it2 = AnimatedSharingController.Strategy.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((AnimatedSharingController.Strategy) next).i() == i2) {
                obj = next;
                break;
            }
        }
        AnimatedSharingController.Strategy strategy = (AnimatedSharingController.Strategy) obj;
        if (strategy == null) {
            strategy = AnimatedSharingController.Strategy.LIKE_AND_REWATCH_ONCE_NO_STOP_FRAME;
        }
        o = new a(strategy);
    }

    public static boolean i(a aVar) {
        boolean z;
        if (q.get() == b.LOADED && !aVar.d) {
            List g2 = g();
            if (!(g2 instanceof Collection) || !g2.isEmpty()) {
                Iterator it = g2.iterator();
                while (it.hasNext()) {
                    String str = ((Target) it.next()).f;
                    if (str != null ? m.containsKey(str) : false) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                if (c.$EnumSwitchMapping$0[aVar.e.ordinal()] == 1) {
                    return aVar.b;
                }
                if (!p && (aVar.b || aVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void j(a aVar) {
        AnimatedSharingController.Strategy strategy = aVar.e;
        List g2 = g();
        ArrayList arrayList = new ArrayList();
        Iterator it = g2.iterator();
        while (it.hasNext()) {
            String str = ((Target) it.next()).f;
            Bitmap bitmap = str != null ? m.get(str) : null;
            if (bitmap != null) {
                arrayList.add(bitmap);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (strategy != AnimatedSharingController.Strategy.LIKE_EVERY_TIME_NO_STOP_FRAME) {
            aVar.b = false;
            aVar.c = false;
        }
        aVar.d = true;
        long j2 = c.$EnumSwitchMapping$0[strategy.ordinal()] == 2 ? 0L : 500L;
        Iterator<AnimatedSharingController.a> it2 = j.iterator();
        while (it2.hasNext()) {
            it2.next().b(arrayList, j2, strategy);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // com.vk.sidecontrols.api.AnimatedSharingController
    public final void a(ml2 ml2Var) {
        k.e();
        CopyOnWriteArrayList<AnimatedSharingController.a> copyOnWriteArrayList = j;
        copyOnWriteArrayList.remove(ml2Var);
        if (copyOnWriteArrayList.isEmpty()) {
            q.set(b.IDLE);
            n = null;
            o = null;
        }
    }

    @Override // com.vk.sidecontrols.api.AnimatedSharingController
    public final void b() {
        a aVar = o;
        if (aVar == null) {
            return;
        }
        aVar.d = false;
        if (aVar.e != AnimatedSharingController.Strategy.LIKE_EVERY_TIME_NO_STOP_FRAME) {
            p = true;
        }
        f();
    }

    @Override // com.vk.sidecontrols.api.AnimatedSharingController
    public final void c() {
        AtomicReference<b> atomicReference;
        b bVar = b.IDLE;
        b bVar2 = b.LOADING;
        do {
            atomicReference = q;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                dcj0 dcj0Var = b;
                if (dcj0Var == null) {
                    dcj0Var = null;
                }
                k.b(new io.reactivex.rxjava3.internal.operators.single.r(dcj0Var.c(gkx0.e, 50, s, null, 7).q(asu0.a.c()).l(new ux0(new y90(1), 2)), new r41(new z90(1), 3)).subscribe(new t00(new md(3), 1), new j22(new pl2(0), 1)));
                return;
            }
        } while (atomicReference.get() == bVar);
    }

    @Override // com.vk.sidecontrols.api.AnimatedSharingController
    public final void d(ml2 ml2Var) {
        j.add(ml2Var);
    }

    @Override // com.vk.sidecontrols.api.AnimatedSharingController
    public final void e() {
        a aVar = o;
        if (aVar != null && aVar.e == AnimatedSharingController.Strategy.LIKE_AND_REWATCH_ONCE_WITH_STOP_FRAME) {
            p = true;
            f();
        }
    }
}
