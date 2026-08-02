package xsna;

import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.app.AppContent;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.ui.UIBlockAppContent;
import com.vk.dto.common.data.ApiApplication;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.s3v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class byh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ byh(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                fyh fyhVar = (fyh) this.c;
                com.vk.movika.sdk.base.logic.interactor.h hVar = (com.vk.movika.sdk.base.logic.interactor.h) this.d;
                return new j4g0(new dyh(fyhVar), (ViewGroup) obj, (wm1) this.e, (fa60) this.f, ((Boolean) hVar.invoke()).booleanValue(), cn70.b(16));
            case 1:
                CatalogBlock catalogBlock = (CatalogBlock) this.c;
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) this.d;
                w060 w060Var = (w060) this.e;
                bi20 bi20Var = (bi20) this.f;
                Object zb = catalogBlock.m.zb((String) obj);
                AppContent appContent = zb instanceof AppContent ? (AppContent) zb : null;
                if (appContent == null) {
                    return null;
                }
                Object Ab = catalogExtendedData.Ab(catalogBlock.c, String.valueOf(appContent.c));
                ApiApplication apiApplication = Ab instanceof ApiApplication ? (ApiApplication) Ab : null;
                if (apiApplication == null) {
                    return null;
                }
                w060Var.getClass();
                return new UIBlockAppContent(bi20Var.b(), apiApplication, appContent);
            case 2:
                s0s0 s0s0Var = (s0s0) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                return s0s0Var.h(str, str2, VideoAdvertisementsRepository.AdType.SPORT_ODDS, str3).t0(1L).L(new did0(new ysq(s0s0Var, str, str2, str3, 3), 15), false);
            default:
                s3v0 s3v0Var = (s3v0) this.c;
                s3v0.a aVar = (s3v0.a) this.d;
                gzs gzsVar = (gzs) this.e;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f;
                s3v0Var.c.a(aVar.a, s3v0Var.e(), false);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
        }
    }
}
