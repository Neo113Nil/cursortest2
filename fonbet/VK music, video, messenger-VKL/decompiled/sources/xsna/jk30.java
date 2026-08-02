package xsna;

import androidx.compose.runtime.a;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.List;
import xsna.i1b0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jk30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jk30(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((lk30) this.c).i((NestedMsg) obj, (MsgFromUser) this.d, 1, (ArrayList) this.e, (uk30) this.f);
                break;
            default:
                i1b0 i1b0Var = (i1b0) this.c;
                final izs izsVar = (izs) this.d;
                final wh50 wh50Var = (wh50) this.e;
                mtk0 mtk0Var = (mtk0) this.f;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(-1429808473, new yzs() { // from class: xsna.e1b0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.yzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1429808473, intValue, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.DefaultOrientationContent.<anonymous>.<anonymous>.<anonymous> (PlayerEqualizerSettingsMviView.kt:143)");
                            }
                            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                            izs izsVar2 = izs.this;
                            boolean J = aVar.J(izsVar2);
                            Object x = aVar.x();
                            if (J || x == a.C0011a.a) {
                                x = new cya0(izsVar2, 1);
                                aVar.R(x);
                            }
                            sup.a(0, aVar, (izs) x, null, booleanValue);
                            if (a690.d(q630.a.a, 16, aVar, 6)) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 3);
                List list = i1b0Var.g;
                wow wowVar = new wow(list);
                nvyVar.e(list.size(), null, new i1b0.b(wowVar), new jai(802480018, new i1b0.c(wowVar, izsVar, mtk0Var), true));
                break;
        }
        return s3q0.a;
    }
}
