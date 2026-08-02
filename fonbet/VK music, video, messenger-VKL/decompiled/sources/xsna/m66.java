package xsna;

import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.libvideo.api.di.VideoProfileNavigationComponent;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.dhr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m66 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m66(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                return m7m.e();
            case 1:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((DonutVideoComponent) r1.getValue()).J();
            case 2:
                return new com.vk.im.ui.formatters.a(((j7b) r1).a);
            case 3:
                return new kw70((wel) r1);
            case 4:
                dhr0.f fVar = (dhr0.f) r1;
                SparseIntArray sparseIntArray = new SparseIntArray();
                int f = e3m.f(R.attr.vk_legacy_accent, fVar);
                u4q0 u4q0Var = zik0.a;
                sparseIntArray.put(R.attr.vk_legacy_accent, f);
                sparseIntArray.put(R.attr.vk_legacy_header_tint, e3m.f(R.attr.vk_legacy_header_tint, fVar));
                sparseIntArray.put(R.attr.vk_legacy_header_text, e3m.f(R.attr.vk_legacy_header_text, fVar));
                sparseIntArray.put(R.attr.vk_ui_text_accent, e3m.f(R.attr.vk_ui_text_accent, fVar));
                sparseIntArray.put(R.attr.vk_ui_icon_accent, e3m.f(R.attr.vk_ui_icon_accent, fVar));
                sparseIntArray.put(R.attr.vk_ui_background_accent, e3m.f(R.attr.vk_ui_background_accent, fVar));
                sparseIntArray.put(R.attr.vk_ui_stroke_accent, e3m.f(R.attr.vk_ui_stroke_accent, fVar));
                sparseIntArray.put(R.attr.toolbar_title_textColor, e3m.f(R.attr.toolbar_title_textColor, fVar));
                return new DialogThemeImpl(sparseIntArray, Collections.singletonList(yol.e(fVar, true)), Collections.singletonList(yol.e(fVar, false)));
            case 5:
                return (x8w) r1;
            case 6:
                return ((VideoProfileNavigationComponent) ((gxw) r1).c().a(fpf0.a(VideoProfileNavigationComponent.class))).q8();
            case 7:
                return ((AuthBridgeComponent) ((pi80) r1).c().a(fpf0.a(AuthBridgeComponent.class))).s().c();
            case 8:
                return new vx70(new u8y(((l7r0) r1).a));
            case 9:
                return LayoutInflater.from(((rot0) r1).a).inflate(R.layout.clips_upload_snackbar, (ViewGroup) null);
            default:
                return new bow0(((VoipCallComponentImpl) r1).b);
        }
    }

    public /* synthetic */ m66(yol yolVar, dhr0.f fVar) {
        this.b = 4;
        this.c = fVar;
    }
}
