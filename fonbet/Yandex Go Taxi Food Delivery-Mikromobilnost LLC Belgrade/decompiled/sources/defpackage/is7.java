package defpackage;

import androidx.camera.video.VideoOutput$SourceState;
import androidx.camera.video.g;
import androidx.camera.video.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class is7 implements dq60 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ is7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dq60
    public final void a(Object obj) {
        lm7 lm7Var;
        EmptyList emptyList;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                if (((js7) this.b).h.get() && (lm7Var = ((js7) this.b).c) != null) {
                    if (list != null) {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        Iterator it = list2.iterator();
                        while (true) {
                            emptyList = arrayList;
                            if (it.hasNext()) {
                                arrayList.add(((yq7) it.next()).a());
                            }
                        }
                    } else {
                        emptyList = EmptyList.a;
                    }
                    try {
                        lm7Var.e(emptyList);
                        LinkedHashSet a = lm7Var.a();
                        ArrayList arrayList2 = new ArrayList(tcc.n(a, 10));
                        Iterator it2 = a.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new yq7(scc.i((String) it2.next()), null));
                        }
                        js7 js7Var = (js7) this.b;
                        List J0 = a.J0(js7Var.g);
                        if (!arrayList2.equals(J0)) {
                            List list3 = J0;
                            Set N0 = a.N0(list3);
                            Set N02 = a.N0(arrayList2);
                            Set g = v4r0.g(N02, N0);
                            Set g2 = v4r0.g(N0, N02);
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(((yq7) it3.next()).a());
                            }
                            try {
                                Iterator it4 = g2.iterator();
                                while (it4.hasNext()) {
                                    js7Var.b(((yq7) it4.next()).a());
                                }
                                us7 us7Var = js7Var.d;
                                if (us7Var != null) {
                                    sgb1.g(3, "CameraPresencePrvdr");
                                    us7Var.a(arrayList4);
                                    arrayList3.add(us7Var);
                                    sgb1.g(3, "CameraPresencePrvdr");
                                }
                                if (!js7Var.i.isEmpty()) {
                                    js7Var.i.size();
                                    sgb1.g(3, "CameraPresencePrvdr");
                                    Iterator it5 = js7Var.i.iterator();
                                    while (it5.hasNext()) {
                                        zqw zqwVar = (zqw) it5.next();
                                        zqwVar.a(arrayList4);
                                        arrayList3.add(zqwVar);
                                    }
                                }
                                js7Var.g = arrayList2;
                                Iterator it6 = g.iterator();
                                while (it6.hasNext()) {
                                    String a2 = ((yq7) it6.next()).a();
                                    us7 us7Var2 = js7Var.d;
                                    if (us7Var2 != null) {
                                        try {
                                            js7Var.c(us7Var2.b(a2).f());
                                        } catch (IllegalArgumentException unused) {
                                            sgb1.g(5, "CameraPresencePrvdr");
                                        }
                                    }
                                }
                                js7Var.a(g, g2);
                                break;
                            } catch (Exception e) {
                                sgb1.e("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e);
                                ArrayList arrayList5 = new ArrayList(tcc.n(list3, 10));
                                Iterator it7 = list3.iterator();
                                while (it7.hasNext()) {
                                    arrayList5.add(((yq7) it7.next()).a());
                                }
                                Iterator it8 = new s2k0(arrayList3).iterator();
                                while (true) {
                                    r2k0 r2k0Var = (r2k0) it8;
                                    if (!r2k0Var.a.hasPrevious()) {
                                        Iterator it9 = g2.iterator();
                                        while (it9.hasNext()) {
                                            String a3 = ((yq7) it9.next()).a();
                                            us7 us7Var3 = js7Var.d;
                                            if (us7Var3 != null) {
                                                try {
                                                    js7Var.c(us7Var3.b(a3).f());
                                                } catch (IllegalArgumentException unused2) {
                                                    sgb1.g(5, "CameraPresencePrvdr");
                                                }
                                            }
                                        }
                                        Iterator it10 = g.iterator();
                                        while (it10.hasNext()) {
                                            js7Var.b(((yq7) it10.next()).a());
                                        }
                                        return;
                                    }
                                    zqw zqwVar2 = (zqw) r2k0Var.a.previous();
                                    try {
                                        zqwVar2.a(arrayList5);
                                    } catch (Exception e2) {
                                        sgb1.e("CameraPresencePrvdr", "Failed to rollback listener: " + zqwVar2, e2);
                                    }
                                }
                            }
                        }
                    } catch (Exception e3) {
                        sgb1.e("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e3);
                        zn7 zn7Var = ((js7) this.b).e;
                        if (zn7Var != null) {
                            zn7Var.c();
                            return;
                        }
                        return;
                    }
                }
                break;
            case 1:
                ((e9e) this.b).accept(obj);
                break;
            case 2:
                ((g) this.b).b.t((Boolean) obj);
                break;
            default:
                androidx.camera.video.a aVar = (androidx.camera.video.a) obj;
                i iVar = (i) this.b;
                if (aVar == null) {
                    ny61.g("StreamInfo can't be null");
                    break;
                } else {
                    int i = aVar.a;
                    if (iVar.w != VideoOutput$SourceState.INACTIVE) {
                        Objects.toString(iVar.s);
                        aVar.toString();
                        sgb1.g(3, "VideoCapture");
                        androidx.camera.video.a aVar2 = iVar.s;
                        iVar.s = aVar;
                        lru0 lru0Var = iVar.i;
                        lru0Var.getClass();
                        int i2 = aVar2.a;
                        Set set = androidx.camera.video.a.e;
                        if ((!set.contains(Integer.valueOf(i2)) && !set.contains(Integer.valueOf(i)) && i2 != i) || (iVar.A && aVar2.c != null && aVar.c == null)) {
                            iVar.P();
                            break;
                        } else {
                            int i3 = aVar2.a;
                            if ((i3 != -1 && i == -1) || (i3 == -1 && i != -1)) {
                                iVar.J(iVar.t, aVar, lru0Var);
                                Object[] objArr = {iVar.t.d()};
                                ArrayList arrayList6 = new ArrayList(1);
                                Object obj2 = objArr[0];
                                Objects.requireNonNull(obj2);
                                arrayList6.add(obj2);
                                iVar.G(Collections.unmodifiableList(arrayList6));
                                iVar.s();
                                break;
                            } else if (aVar2.b != aVar.b) {
                                iVar.J(iVar.t, aVar, lru0Var);
                                Object[] objArr2 = {iVar.t.d()};
                                ArrayList arrayList7 = new ArrayList(1);
                                Object obj3 = objArr2[0];
                                Objects.requireNonNull(obj3);
                                arrayList7.add(obj3);
                                iVar.G(Collections.unmodifiableList(arrayList7));
                                Iterator it11 = iVar.b.iterator();
                                while (it11.hasNext()) {
                                    ((si21) it11.next()).e(iVar);
                                }
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.dq60
    public final void onError(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                js7 js7Var = (js7) obj;
                if (js7Var.h.get()) {
                    sgb1.e("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
                    zn7 zn7Var = js7Var.e;
                    if (zn7Var != null) {
                        zn7Var.c();
                        break;
                    }
                }
                break;
            case 1:
                sgb1.e("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
                break;
            case 2:
                qz40 qz40Var = ((g) obj).b;
                qz40Var.getClass();
                qz40Var.t(new j84(th));
                break;
            default:
                sgb1.g(5, "VideoCapture");
                break;
        }
    }
}
