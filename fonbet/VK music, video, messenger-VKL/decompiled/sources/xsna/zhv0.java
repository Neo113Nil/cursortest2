package xsna;

import com.vk.core.view.components.search.VkSearchView;
import com.vk.newsfeed.impl.writebar.overlay.WriteBarOverlayFragment;
import xsna.bja0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zhv0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zhv0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                aiv0 aiv0Var = (aiv0) obj2;
                gzs gzsVar = (gzs) obj;
                aiv0Var.e = false;
                VkSearchView vkSearchView = aiv0Var.a;
                vkSearchView.clearFocus();
                vkSearchView.d0();
                f4m.j(vkSearchView);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            default:
                bja0.a aVar = (bja0.a) obj2;
                WriteBarOverlayFragment writeBarOverlayFragment = (WriteBarOverlayFragment) obj;
                int i2 = WriteBarOverlayFragment.a0;
                try {
                    aVar.a(4331, writeBarOverlayFragment);
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
                break;
        }
        return s3q0.a;
    }
}
