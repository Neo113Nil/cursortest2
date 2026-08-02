package xsna;

import android.os.IInterface;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.health.platform.client.request.ReadDataRangeRequest;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.api.generated.calls.dto.CallsGetGroupTokenResponseDto;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.components.chat_profile.tabs.ChatProfileTabsContainerLayout;
import com.vkontakte.android.R;
import java.io.IOException;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;
import xsna.exy0;
import xsna.h8z0;
import xsna.hjz0;
import xsna.u7z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vxb implements c.b, bc80, ivf0, ApiTokenInfoProvider, exy0.a, h8z0.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vxb(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        hjz0.a aVar = (hjz0.a) this.b;
        String str = ((nxy0) this.c).F;
        yil0.d(aVar);
    }

    @Override // xsna.exy0.a
    public void b() {
        cwy0 cwy0Var = (cwy0) this.b;
        xey0 xey0Var = (xey0) this.c;
        u7z0.a aVar = cwy0Var.j;
        if (aVar != null) {
            aVar.e(xey0Var);
        }
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        ChatProfileTabsContainerLayout chatProfileTabsContainerLayout = (ChatProfileTabsContainerLayout) this.b;
        dyn0 dyn0Var = (dyn0) this.c;
        int i2 = ChatProfileTabsContainerLayout.A;
        if (!BuildInfo.t()) {
            gVar.q(dyn0Var.getCurrentList().get(i).a.Y0());
            return;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(chatProfileTabsContainerLayout.getContext());
        appCompatTextView.setText(dyn0Var.getCurrentList().get(i).a.Y0());
        awt0.x(appCompatTextView, cn70.b(8), 0, cn70.b(8), 0, 10);
        appCompatTextView.setTextSize(2, 16.0f);
        appCompatTextView.setTextColor(dhr0.t.c(i == 0 ? R.attr.vk_ui_text_accent : R.attr.vk_ui_text_tertiary));
        gVar.l(appCompatTextView);
    }

    @Override // ru.ok.android.sdk.api.token.ApiTokenInfoProvider
    public ApiTokenInfoProvider.Info getTokenInfo() {
        String s;
        c2p0 c2p0Var = (c2p0) this.b;
        dz2 x = yfb.x(c2p0Var.b.e((UserId) this.c));
        x.n = true;
        UserId f = bnw0.a().f();
        if (fkq0.c(f) && !o25.a().a(f) && (s = o25.a().s(f)) != null) {
            x.l = s;
            x.m = null;
        }
        CallsGetGroupTokenResponseDto callsGetGroupTokenResponseDto = (CallsGetGroupTokenResponseDto) x.u(0L);
        if (callsGetGroupTokenResponseDto == null) {
            throw new IOException("Can't get token result for group");
        }
        String e = callsGetGroupTokenResponseDto.e();
        String d = callsGetGroupTokenResponseDto.d();
        if (d == null) {
            d = (String) c2p0Var.d.invoke();
        }
        return new ApiTokenInfoProvider.Info(e, d);
    }

    @Override // xsna.bc80
    public void onSuccess(Object obj) {
        arg0 arg0Var = (arg0) this.b;
        io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.c;
        r100.a(arg0Var.f, "Review flow completed successfully");
        yVar.onSuccess(new hgg0(null));
    }

    @Override // xsna.ivf0
    public void a(IInterface iInterface, lzi0 lzi0Var) {
        ioi0 ioi0Var = (ioi0) this.b;
        ((gnv) iInterface).E(ioi0Var.c(), (ReadDataRangeRequest) this.c, new d7f0(lzi0Var));
    }
}
