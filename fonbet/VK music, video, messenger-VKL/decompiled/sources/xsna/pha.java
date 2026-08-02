package xsna;

import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import com.vk.messagetemplates.impl.keyboard.ButtonState;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pha implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pha(ButtonState buttonState, q630 q630Var, izs izsVar, int i) {
        this.b = 3;
        this.e = buttonState;
        this.c = q630Var;
        this.f = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                qha.a((MusicTabsFiltersView.f) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.d | 1);
                ((hna) this.e).a((spg0) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                ((rfj) this.e).d((Map) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(this.d | 1);
                n6k.a((ButtonState) this.e, this.c, (izs) this.f, (androidx.compose.runtime.a) obj, I4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int I5 = ne7.I(this.d | 1);
                o7t.f((h8t) this.e, (i8t) this.f, this.c, (androidx.compose.runtime.a) obj, I5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int I6 = ne7.I(this.d | 1);
                ((HorizontalPagerView.BlockView) this.e).e((HorizontalPagerView.BlockView.c) this.f, this.c, (androidx.compose.runtime.a) obj, I6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int I7 = ne7.I(this.d | 1);
                gbh0.h(this.e, (gzs) this.f, this.c, (androidx.compose.runtime.a) obj, I7);
                break;
            default:
                ((Integer) obj2).getClass();
                int I8 = ne7.I(this.d | 1);
                ndt0.j((pdt0) this.e, (gzs) this.f, this.c, (androidx.compose.runtime.a) obj, I8);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pha(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }
}
