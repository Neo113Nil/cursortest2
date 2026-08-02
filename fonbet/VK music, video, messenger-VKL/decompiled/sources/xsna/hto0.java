package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.group_selector.ui.VoipGroupSelectorFragment;
import com.vk.voip.ui.group_selector.ui.b;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bjw0;
import xsna.gm50;
import xsna.hqs0;
import xsna.jto0;
import xsna.oap;
import xsna.tlo0;
import xsna.u8r0;
import xsna.v2a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hto0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hto0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkPlaceholder.c bVar;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((i0b0) obj3).invoke(jto0.b.a((jto0.b) obj2, null, null, null, null, false, null, false, false, false, ((Boolean) obj).booleanValue(), null, false, false, false, null, false, 65023));
                return s3q0.a;
            case 1:
                u8r0 u8r0Var = (u8r0) obj3;
                Integer num = (Integer) obj2;
                v2a.a aVar = (v2a.a) obj;
                if (epx.f(aVar, v2a.a.C3866a.a)) {
                    return u8r0Var.i(num);
                }
                if (!(aVar instanceof v2a.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                v2a.a.b bVar2 = (v2a.a.b) aVar;
                return io.reactivex.rxjava3.core.q.T(new u8r0.a.b.C3792a(bVar2.a, bVar2.b));
            case 2:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new hqs0.a((m7a) obj3, (hqs0) obj2, null), 3));
            case 3:
                com.vk.libvideo.offline.ui.a aVar2 = (com.vk.libvideo.offline.ui.a) obj3;
                Uri uri = (Uri) obj2;
                com.vk.libvideo.design.view.overlay.b bVar3 = (com.vk.libvideo.design.view.overlay.b) obj;
                if (!bVar3.c) {
                    return new VideoOverlayView.c.k(bVar3);
                }
                s290 s290Var = (s290) aVar2.t.getValue();
                s290Var.getClass();
                return new VideoOverlayView.c.f(bVar3, s290Var.b(new oap.b(uri)), null);
            case 4:
                e8u0 e8u0Var = (e8u0) obj3;
                a630.d1(e8u0Var.b, e8u0Var.a, (MusicTrack) obj2, true);
                return s3q0.a;
            case 5:
                return t5v0.b(((Number) ((List) obj3).get(((Integer) obj).intValue())).intValue() / 1000, (Context) obj2);
            case 6:
                ((izs) obj3).invoke((tho0) obj2);
                return s3q0.a;
            case 7:
                mov0 mov0Var = (mov0) obj2;
                ((bqu0) obj3).dismiss();
                mov0Var.c.j(JsApiMethodType.SHOW_GOODS_ORDER_BOX, VkAppsErrors.b((Throwable) obj));
                i0q0.f(new kcj0(mov0Var, 29));
                return s3q0.a;
            case 8:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj3;
                int i2 = VoipCallServiceFragment.Y;
                Throwable th = ((bjw0.c.a) obj).b;
                boolean a = h03.a(th);
                VkPlaceholder vkPlaceholder = ((VoipCallServiceFragment.c) obj2).c;
                if (a) {
                    bVar = new VkPlaceholder.c.C0860c(new ulw(dhr0.M() ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56), null, null, null, 30);
                } else {
                    bVar = new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_error_triangle_outline_56), new x7g(R.attr.vk_ui_icon_accent_themed), null, 12);
                }
                vkPlaceholder.setTop(bVar);
                tlo0.f h = a ? tq.h(tlo0.Companion, R.string.voip_vkapp_services_error_network) : null;
                tlo0.a aVar3 = tlo0.Companion;
                String g = j03.g(voipCallServiceFragment.requireContext(), th, R.string.error);
                aVar3.getClass();
                vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, h), new VkPlaceholder.b.C0859b(14, new tlo0.h(g))));
                vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.retry), (gzs) new pis0(voipCallServiceFragment, 16), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, 284), null, null, null, 8));
                return s3q0.a;
            case 9:
                int i3 = VoipGroupSelectorFragment.R;
                gm50.a.a((VoipGroupSelectorFragment) obj3, ((b.C2051b) obj).a, new tzq0((sow0) obj2, 11));
                return s3q0.a;
            default:
                int i4 = c2x0.o1;
                ((ImageView) obj3).setImageBitmap((Bitmap) obj);
                View view = ((c2x0) obj2).g1;
                if (view != null) {
                    view.setEnabled(true);
                }
                return s3q0.a;
        }
    }
}
