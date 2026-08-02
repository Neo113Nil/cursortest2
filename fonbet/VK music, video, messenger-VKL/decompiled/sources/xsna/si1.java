package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.tab.presentation.TabView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class si1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ si1(int i, MusicHidingToolbarVh musicHidingToolbarVh) {
        this.b = 2;
        this.c = i;
        this.d = musicHidingToolbarVh;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                xi1.e((String) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((dr20) this.d).b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                MusicHidingToolbarVh musicHidingToolbarVh = (MusicHidingToolbarVh) this.d;
                oop0 oop0Var = (oop0) ((TabView) obj2);
                boolean z = ((Integer) obj).intValue() == this.c;
                oop0Var.setTransparent(musicHidingToolbarVh.p < 127.5f);
                oop0Var.setTabSelected(z);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((ne60) this.d).i(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                ((rgg0) this.d).b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ si1(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
