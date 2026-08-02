package xsna;

import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.music.player.api.BottomPlayerAppearance;
import xsna.zjq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class eet implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eet(Object obj, Object obj2, izs izsVar, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.d = izsVar;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                get.a((xdt) this.e, (rha) this.f, this.d, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                ksx.a((String) this.e, this.c, (String) this.f, this.d, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(1);
                com.vk.music.informer.mvi.b.a(this.d, (BottomPlayerAppearance) this.e, (MusicPlayerInformerViewState.a) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(4097);
                ((siq0) this.e).k((zjq0.a.b) this.f, this.d, this.c, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ eet(String str, q630 q630Var, String str2, izs izsVar, int i) {
        this.b = 1;
        this.e = str;
        this.c = q630Var;
        this.f = str2;
        this.d = izsVar;
    }

    public /* synthetic */ eet(izs izsVar, BottomPlayerAppearance bottomPlayerAppearance, MusicPlayerInformerViewState.a aVar, q630 q630Var, int i) {
        this.b = 2;
        this.d = izsVar;
        this.e = bottomPlayerAppearance;
        this.f = aVar;
        this.c = q630Var;
    }
}
