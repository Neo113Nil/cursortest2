package xsna;

import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.s16;
import xsna.wk50;
import xsna.z2d;

/* compiled from: BannerCompanionActionApplier.kt */
/* loaded from: classes17.dex */
public final class m16 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final s16 a;
    public final f4z b;

    public m16(s16 s16Var, f4z f4zVar) {
        this.a = s16Var;
        this.b = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.e)) {
            ClipItemAction.e eVar = (ClipItemAction.e) clipItemAction;
            if (eVar instanceof ClipItemAction.e.a) {
                aVar.b(n2d.b);
                return;
            }
            if (eVar instanceof ClipItemAction.e.f) {
                aVar.b(m2d.b);
                return;
            }
            if (eVar instanceof ClipItemAction.e.b) {
                ClipItemAction.e.b bVar = (ClipItemAction.e.b) clipItemAction;
                aVar.b(new o2d(bVar.b, bVar.c, bVar.d, bVar.e, bVar.f));
                return;
            }
            if (eVar instanceof ClipItemAction.e.c) {
                aVar.b(p2d.b);
                return;
            }
            boolean z = eVar instanceof ClipItemAction.e.d;
            s16 s16Var = this.a;
            if (!z) {
                if (!(eVar instanceof ClipItemAction.e.C0654e)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((z2d.a) z2dVar).b.b;
                io.reactivex.rxjava3.subjects.f<s16.a> fVar = s16Var.a;
                l8 l8Var = new l8(new z43(str, 1), 5);
                fVar.getClass();
                a7f0.a.e(aVar, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, l8Var), null, new com.vk.im.ui.fragments.b(this, 7), null, null, 13);
                return;
            }
            z2d.a aVar2 = (z2d.a) z2dVar;
            String str2 = aVar2.b.b;
            t16 t16Var = aVar2.z;
            io.reactivex.rxjava3.subjects.f<s16.a> fVar2 = s16Var.a;
            ConcurrentHashMap<String, t16> concurrentHashMap = s16Var.b;
            if (t16Var.f != null) {
                concurrentHashMap.put(str2, t16Var);
                fVar2.onNext(new s16.a.d(str2));
            } else {
                concurrentHashMap.remove(str2);
                fVar2.onNext(new s16.a.b(str2));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
