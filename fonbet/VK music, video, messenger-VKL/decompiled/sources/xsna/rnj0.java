package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.lgj0;
import xsna.wk50;
import xsna.z2d;

/* compiled from: SimilarClipsActionApplier.kt */
/* loaded from: classes17.dex */
public final class rnj0 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final zrx0 a;
    public final yof b;

    public rnj0(zrx0 zrx0Var, yof yofVar) {
        this.a = zrx0Var;
        this.b = yofVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        SdkClipVideoFile sdkClipVideoFile;
        SdkClipVideoFile sdkClipVideoFile2;
        String r;
        io.reactivex.rxjava3.core.x oVar;
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.i0)) {
            ClipItemAction.i0 i0Var = (ClipItemAction.i0) clipItemAction;
            boolean z = i0Var instanceof ClipItemAction.i0.a;
            zrx0 zrx0Var = this.a;
            yof yofVar = this.b;
            if (z) {
                m0d m0dVar = ((z2d.a) z2dVar).b;
                if (yofVar.L().a && (r = m0dVar.a.r()) != null) {
                    String a1 = m0dVar.a.a1();
                    int i = yofVar.L().b;
                    List list = (List) ((m900) zrx0Var.b).get(a1);
                    if (list != null) {
                        oVar = io.reactivex.rxjava3.core.x.k(list);
                    } else {
                        tnj0 tnj0Var = (tnj0) zrx0Var.a;
                        oVar = new io.reactivex.rxjava3.internal.operators.single.o(tnj0Var.a.a(lgj0.a.i(new ogj0(), Integer.valueOf(i), null, "clips_more_shops_similar", r, null, null, tnj0Var.b.invoke(), null, null, null, null, 32690)).l(new cyh0(new xka0(tnj0Var, 12), 1)), new a960(new snj0(0, zrx0Var, a1), 17));
                    }
                    a7f0.a.f(aVar, oVar, new ju(25, aVar, this), null, 5);
                    return;
                }
                return;
            }
            if (!(i0Var instanceof ClipItemAction.i0.b)) {
                if (!(i0Var instanceof ClipItemAction.i0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                z2d.a aVar2 = (z2d.a) z2dVar;
                if (!yofVar.L().d || (sdkClipVideoFile = aVar2.g.d) == null) {
                    return;
                }
                ((wie) zrx0Var.c).b(sdkClipVideoFile);
                return;
            }
            z2d.a aVar3 = (z2d.a) z2dVar;
            if (!yofVar.L().d || (sdkClipVideoFile2 = aVar3.g.d) == null) {
                return;
            }
            wie wieVar = (wie) zrx0Var.c;
            if (wieVar.isEnabled()) {
                wieVar.a(sdkClipVideoFile2);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
