package xsna;

import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import xsna.lab0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lmd implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lmd(ClipCoauthorListVS clipCoauthorListVS, boolean z, izs izsVar, int i) {
        this.d = clipCoauthorListVS;
        this.c = z;
        this.e = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                pmd.a((ClipCoauthorListVS) this.d, this.c, (izs) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                ((k150) this.d).e((lab0.a) this.e, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lmd(k150 k150Var, lab0.a aVar, boolean z, int i) {
        this.d = k150Var;
        this.e = aVar;
        this.c = z;
    }
}
