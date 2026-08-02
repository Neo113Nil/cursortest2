package xsna;

import android.graphics.drawable.ColorDrawable;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.t24;

/* compiled from: AttachMusicTopBarController.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class z24 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z24(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                t24.e eVar = ((x24) this.receiver).d;
                if (eVar != null) {
                    eVar.onClick();
                }
                return s3q0.a;
            case 1:
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = (ClassifiedsCatalogRootVh) this.receiver;
                classifiedsCatalogRootVh.getClass();
                vtk0.d().d(classifiedsCatalogRootVh.R(), new hgc(classifiedsCatalogRootVh));
                return s3q0.a;
            case 2:
                ajs ajsVar = (ajs) this.receiver;
                int i = ajs.M;
                ajsVar.itemView.setForeground(new ColorDrawable(dhr0.t.c(R.attr.vk_legacy_button_primary_foreground_disabled)));
                ajsVar.C.setVisibility(8);
                ButtonsSwipeView q6 = ajsVar.q6();
                q6.b();
                q6.q = false;
                ajsVar.E.setVisibility(8);
                ajsVar.F.setVisibility(8);
                if (ajsVar.H) {
                    ajsVar.itemView.requestLayout();
                }
                return s3q0.a;
            case 3:
                return ((MusicCatalogRootVh) this.receiver).I.r;
            case 4:
                ((o0i0) this.receiver).b.Tg();
                return s3q0.a;
            case 5:
                return (Boolean) ((mcy) this.receiver).get();
            case 6:
                return (Boolean) ((mcy) this.receiver).get();
            default:
                ((com.vk.voip.ui.c) this.receiver).getClass();
                return com.vk.voip.ui.c.u.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z24(Object obj, int i) {
        super(0, obj, x24.class, "onLeftButtonClick", "onLeftButtonClick()V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(0, obj, o0i0.class, "onQuickFilterOpenFilterClicked", "onQuickFilterOpenFilterClicked()V", 0);
                break;
            case 7:
                super(0, obj, com.vk.voip.ui.c.class, "getOpponentIcon", "getOpponentIcon()Landroidx/core/graphics/drawable/IconCompat;", 0);
                break;
            default:
                break;
        }
    }
}
