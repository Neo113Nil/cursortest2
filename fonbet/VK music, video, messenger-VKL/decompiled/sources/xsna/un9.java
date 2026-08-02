package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.common.id.UserId;
import xsna.jnd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class un9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ un9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        xy2 o;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                CameraUIView cameraUIView = (CameraUIView) obj3;
                float f = CameraUIView.w1;
                VkTooltip.a aVar = new VkTooltip.a(cameraUIView.getContext());
                aVar.b = (String) obj2;
                aVar.e = VkTooltip.Appearance.Transparent;
                aVar.h = true;
                aVar.n = new com.vk.movika.sdk.base.hooks.f(cameraUIView, 4);
                aVar.o = 3000L;
                Rect rect = new Rect();
                ((RectF) obj).roundOut(rect);
                aVar.a(rect);
                return s3q0.a;
            case 1:
                o = ((xqu) ((qmd) ((nnd) obj3).c.getValue()).c.getValue()).o(new UserId(Math.abs(fkq0.a(((jnd.a.b) ((jnd.a) obj2)).a).b)), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : 0, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
                ver0.a(rsg0.Z(yfb.x(o)).o(asu0.a.d()).subscribe(new dx3((uh3) obj, 3), new knd(new dh5(7), 0)));
                return s3q0.a;
            default:
                com.vk.clips.sdk.shared.item.static_ads.c cVar = (com.vk.clips.sdk.shared.item.static_ads.c) obj3;
                return new cu0(cVar.h, cVar.k, cVar.n, (uvx) obj2, (emi) obj);
        }
    }
}
