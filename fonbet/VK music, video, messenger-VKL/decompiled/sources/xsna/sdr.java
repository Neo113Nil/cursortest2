package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.jgt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sdr implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sdr(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, io.reactivex.rxjava3.disposables.c] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object obj2;
        dbs0 y0t0Var;
        switch (this.b) {
            case 0:
                udr udrVar = (udr) this.c;
                defpackage.v vVar = (defpackage.v) this.d;
                SearchQuickFilterItem searchQuickFilterItem = (SearchQuickFilterItem) this.e;
                Iterator it = udrVar.b.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((rju0) obj2).t.isChecked()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                rju0 rju0Var = (rju0) obj2;
                Iterator<T> it2 = searchQuickFilterItem.n.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (epx.f(rju0Var != null ? rju0Var.getTitle() : null, ((SearchQuickInnerFilterItem) next).b)) {
                            obj = next;
                        }
                    }
                }
                vVar.invoke(obj);
                return s3q0.a;
            case 1:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) this.d;
                j05 j05Var = (j05) this.e;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ref$ObjectRef.element;
                if (cVar != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.internal.operators.observable.j2 j2Var = new io.reactivex.rxjava3.internal.operators.observable.j2(new io.reactivex.rxjava3.internal.operators.observable.y(io.reactivex.rxjava3.core.q.P(0L, 100L, TimeUnit.MILLISECONDS).t0(12L).U(new ed(new r3h(j05Var, 17), 17)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a));
                asu0 asu0Var = asu0.a;
                ?? subscribe = j2Var.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new defpackage.i0(new o9(25, j05Var, ref$ObjectRef), 24), new is1(new fj1(26), 28));
                bVar.b(subscribe);
                ref$ObjectRef.element = subscribe;
                return s3q0.a;
            case 2:
                com.vk.photo.editor.features.mlenhance.c cVar2 = (com.vk.photo.editor.features.mlenhance.c) this.c;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                View view = cVar2.h;
                if (view != null) {
                    fyt0.d(view, null, 7);
                }
                View view2 = cVar2.i;
                if (view2 != null) {
                    fyt0.d(view2, new l49(cVar2, ref$ObjectRef2, bitmap, 6), 3);
                }
                return s3q0.a;
            case 3:
                ((vh40) this.c).j((Context) this.d, (Playlist) this.e);
                return s3q0.a;
            case 4:
                ((SearchAuthorCellVh) this.c).k.e(false, (Context) this.d, (UIBlockSearchAuthor) this.e, false);
                return s3q0.a;
            case 5:
                File file = (File) this.c;
                xti0 xti0Var = (xti0) this.d;
                Integer num = (Integer) this.e;
                StringBuilder sb = new StringBuilder("createFromAppendFile(directory: ");
                sb.append(file);
                sb.append(", sessionKey: ");
                sb.append(xti0Var);
                sb.append(", batchNum: ");
                return oq.b(sb, num, ")");
            case 6:
                jgt0 jgt0Var = (jgt0) this.c;
                jgt0.b bVar2 = (jgt0.b) this.d;
                gzs gzsVar = (gzs) this.e;
                d3b0 d3b0Var = jgt0Var.b;
                if (bVar2.a == jgt0.a.AUDIO && bVar2.d) {
                    ((k640) jgt0Var.g.getValue()).b();
                }
                switch (jgt0.c.$EnumSwitchMapping$0[bVar2.a.ordinal()]) {
                    case 1:
                        if (!fxc0.B().J().l0()) {
                            y0t0Var = new y0t0(d3b0Var);
                            break;
                        } else {
                            y0t0Var = new x0t0(d3b0Var);
                            break;
                        }
                    case 2:
                        y0t0Var = new d1t0(d3b0Var);
                        break;
                    case 3:
                        y0t0Var = new q0t0(d3b0Var);
                        break;
                    case 4:
                        y0t0Var = new c1t0(d3b0Var);
                        break;
                    case 5:
                        y0t0Var = new e1t0(d3b0Var);
                        break;
                    case 6:
                        y0t0Var = zms0.a;
                        break;
                    case 7:
                        y0t0Var = new c4s0(!epx.f(jgt0Var.e.k, Boolean.TRUE));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                jgt0Var.c.bk(y0t0Var);
                gzsVar.invoke();
                return s3q0.a;
            default:
                nst0 nst0Var = (nst0) this.c;
                zos0 zos0Var = (zos0) this.d;
                gzs gzsVar2 = (gzs) this.e;
                com.vk.libvideo.api.promo.stats.a aVar = (com.vk.libvideo.api.promo.stats.a) nst0Var.c.getValue();
                String str = zos0Var != null ? zos0Var.b : null;
                if (str == null) {
                    str = "";
                }
                aVar.d(str);
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
        }
    }
}
