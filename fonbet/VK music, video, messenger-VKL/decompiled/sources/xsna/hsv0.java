package xsna;

import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.followersmode.api.di.FollowersModeComponent;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import kotlin.Pair;
import xsna.r5x0;
import xsna.rhw0;
import xsna.tlw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hsv0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hsv0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                isv0 isv0Var = (isv0) obj;
                return new com.vk.oauth.tinkoff.b((htk0) isv0Var.e.getValue(), (tyo0) isv0Var.f.getValue(), isv0Var.b());
            case 1:
                VkTopBarSearchQueryVh vkTopBarSearchQueryVh = (VkTopBarSearchQueryVh) obj;
                VkTopBarSearchQueryVh.b bVar = vkTopBarSearchQueryVh.r;
                vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(bVar, true, null, false, null, false, null, true, null, VkTopBarSearchQueryVh.a.a(bVar.j, false, null, false, null, null, false, null, 3518), 381));
                gzs<s3q0> gzsVar = vkTopBarSearchQueryVh.e.f;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                Pair<Long, wzs<String, SearchInputMethod, s3q0>> c3 = vkTopBarSearchQueryVh.c.c3();
                vkTopBarSearchQueryVh.o = vkTopBarSearchQueryVh.a(vkTopBarSearchQueryVh.p, c3.d().longValue(), c3.g());
                vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(vkTopBarSearchQueryVh.r, false, null, false, null, false, new VkTopBar.Middle.d((String) vkTopBarSearchQueryVh.q.getValue(vkTopBarSearchQueryVh, VkTopBarSearchQueryVh.s[0]), new tho0((String) null, 0L, 7), true, new mcj0(vkTopBarSearchQueryVh, 28), new bjm0(vkTopBarSearchQueryVh, 17), new h6m0(vkTopBarSearchQueryVh, 25), null, new egt0(vkTopBarSearchQueryVh, 6), ((Boolean) vkTopBarSearchQueryVh.k.getValue()).booleanValue() ? new VkTopBar.Middle.d.b.C0874b(new ufu0(vkTopBarSearchQueryVh, 5), i2) : null, com.vk.core.compose.component.semantics.b.a(null, new jz30(20), 3), 1600), false, null, null, 959));
                vkTopBarSearchQueryVh.Fb();
                return s3q0.a;
            case 2:
                return ((FollowersModeComponent) ((k7m) m7m.f((zvv0) obj)).mo408a(fpf0.a(FollowersModeComponent.class))).b();
            case 3:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i3 = VoipCallServiceFragment.Y;
                rhw0.y yVar = rhw0.y.b;
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, yVar);
                return s3q0.a;
            case 4:
                ((vlw0) obj).C(tlw0.b.b);
                return s3q0.a;
            default:
                ((com.vk.voip.ui.c) obj).getClass();
                return new r5x0.c(com.vk.voip.ui.c.j0());
        }
    }
}
