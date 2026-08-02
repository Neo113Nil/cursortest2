package xsna;

import android.content.Context;
import com.vk.camera.editor.stories.impl.base.StoryDrawingManager;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.stat.DrawingStatInfo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BroadcastSharingUtils.kt */
/* loaded from: classes7.dex */
public final class tj8 {
    public final Object a;
    public final Object b;
    public Object c;

    public /* synthetic */ tj8(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public synchronized void a() {
        try {
            io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c;
            if (cVar != null) {
                cVar.dispose();
            }
            this.c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public l1m0 b() {
        v76 v76Var = (v76) this.b;
        u76 u76Var = (u76) this.a;
        tam0 O2 = u76Var.O2();
        if (O2 == null) {
            return null;
        }
        i5g i5gVar = new i5g(v76Var.getStickers());
        String b5 = u76Var.b5();
        boolean z = u76Var.j3().a;
        boolean z2 = u76Var.j3().b;
        boolean z3 = u76Var.j3().c;
        boolean z4 = u76Var.j3().d;
        boolean C2 = v76Var.C2();
        StoryUploadParams storyUploadParams = (StoryUploadParams) this.c;
        CommonUploadParams k3 = u76Var.k3();
        List<uap> list = O2.j.a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object meta = ((uap) it.next()).getMeta();
            StoryDrawingManager.a aVar = meta instanceof StoryDrawingManager.a ? (StoryDrawingManager.a) meta : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        List<StoryDrawingManager.a> R = j5g.R(arrayList);
        ArrayList arrayList2 = new ArrayList(c5g.u(R, 10));
        for (StoryDrawingManager.a aVar2 : R) {
            arrayList2.add(new DrawingStatInfo(aVar2.a.h(), aVar2.b, Integer.toHexString(aVar2.c)));
            C2 = C2;
        }
        return new l1m0(i5gVar, b5, z, z2, z3, z4, C2, O2, storyUploadParams, k3, arrayList2);
    }

    public synchronized void c(dfw0 dfw0Var) {
        try {
            a();
            Integer m = arm0.m(10, dfw0Var.a);
            Long n = arm0.n(dfw0Var.b);
            UserId userId = n != null ? new UserId(n.longValue()) : null;
            if (m != null && userId != null) {
                this.c = io.reactivex.rxjava3.kotlin.c.f(2, hg1.m(rsg0.y0(new gns0(userId, m.intValue(), null), null, null, 3), (Context) this.a, 0L, false, 62), null, new qu(this, 10), new vl1(this, 11));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Object d() {
        return ((Boolean) ((gzs) this.a).invoke()).booleanValue() ? this.b : this.c;
    }

    public tj8(Context context, kbj0 kbj0Var) {
        this.a = context;
        this.b = kbj0Var;
    }
}
