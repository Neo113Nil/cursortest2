package xsna;

import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.h7u0;
import xsna.hv70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jrc implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jrc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        switch (this.b) {
            case 0:
                lrc lrcVar = (lrc) this.c;
                Context context = (Context) this.d;
                ((Integer) obj3).getClass();
                int i = ((e520) obj2).a;
                if (i == R.id.draft_go_to_clips_editor) {
                    lrcVar.g.invoke();
                } else if (i == R.id.draft_delete) {
                    lrcVar.e.invoke();
                    v40 v40Var = new v40(lrcVar, 14);
                    h7u0.a aVar = new h7u0.a(context);
                    aVar.g0(R.string.delete_clip_confirm);
                    aVar.U(R.string.delete_clip_confirm_message);
                    aVar.c0(R.string.delete, new hu3(v40Var, 1));
                    aVar.W(R.string.cancel, null);
                    aVar.m();
                }
                lrcVar.dismiss();
                return s3q0.a;
            case 1:
                dh7 dh7Var = (dh7) this.c;
                vg7 vg7Var = (vg7) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar2.K(-134149655);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-134149655, intValue, -1, "com.vk.core.tool.compose.blur.control.blurModifier.<anonymous> (ModifierFlow.kt:41)");
                }
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    float e = dh7Var.e();
                    float e2 = dh7Var.e();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    x = RenderEffect.createBlurEffect(e, e2, Shader.TileMode.CLAMP);
                    aVar2.R(x);
                }
                RenderEffect a = w630.a(x);
                mdu a2 = udu.a(aVar2);
                Object x2 = aVar2.x();
                if (x2 == c0012a) {
                    x2 = androidx.compose.runtime.k.b(zhf0.e);
                    aVar2.R(x2);
                }
                wh50 wh50Var = (wh50) x2;
                q630 d = rte0.d(q630Var, vog0.b(dh7Var.d()));
                boolean J = aVar2.J(vg7Var) | aVar2.y(a2);
                Object x3 = aVar2.x();
                if (J || x3 == c0012a) {
                    x3 = new go6(vg7Var, a2, wh50Var, 4);
                    aVar2.R(x3);
                }
                q630 o = egi.o(d, (izs) x3);
                zhf0 zhf0Var = (zhf0) wh50Var.getValue();
                Iterator<T> it = vg7Var.a.getValue().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj4 = it.next();
                        if (((lg7) obj4).a.equals(zhf0Var)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                lg7 lg7Var = (lg7) obj4;
                q630 m = hr80.m(qri.a(o, a5x.a, new jzi(1, lg7Var != null ? lg7Var.b : null, a)), l5g.c(14, dh7Var.c(), dh7Var.a()), androidx.compose.ui.graphics.e.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return m;
            default:
                hv70.a aVar3 = (hv70.a) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-705190600, intValue2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesContentScreen.<anonymous>.<anonymous>.<anonymous> (OfflinePodcastEpisodesMviComposeComponent.kt:186)");
                    }
                    Object x4 = aVar4.x();
                    if (x4 == a.C0011a.a) {
                        x4 = new uq50(wh50Var2, 5);
                        aVar4.R(x4);
                    }
                    cv70.c(aVar3, (gzs) x4, aVar4, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }
}
