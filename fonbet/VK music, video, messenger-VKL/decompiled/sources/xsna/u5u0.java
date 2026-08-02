package xsna;

import com.google.android.gms.tasks.Task;
import com.vk.api.generated.superApp.dto.SuperAppGetAllWidgetSettingsResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetItemDto;
import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetSettingDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetTextBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetSettingsDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.miniwidgets.DefaultMiniWidget;
import com.vk.superapp.ui.widgets.miniwidgets.ExchangeMiniWidget;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.j9w0;
import xsna.uu1;
import xsna.wnx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class u5u0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ u5u0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MiniWidgetItem.HeaderIconAlign headerIconAlign;
        MiniWidgetItem defaultMiniWidget;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return j9w0.a.a;
            case 2:
                return Boolean.valueOf(((it80) obj).a != 0);
            case 3:
                int i = VoipPastCallsFragment.a0;
                qgi0.r((tgi0) obj, "VoipPastCalls.Header");
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                Task task = (Task) obj;
                while (!task.isComplete()) {
                }
                if (task.isSuccessful()) {
                    return (String) task.getResult();
                }
                Exception exception = task.getException();
                if (exception == null) {
                    throw new IllegalStateException("ApiException is null");
                }
                throw exception;
            case 6:
                SuperAppGetAllWidgetSettingsResponseDto superAppGetAllWidgetSettingsResponseDto = (SuperAppGetAllWidgetSettingsResponseDto) obj;
                ArrayList arrayList = new ArrayList();
                boolean f = superAppGetAllWidgetSettingsResponseDto.d().f();
                int e = superAppGetAllWidgetSettingsResponseDto.d().e();
                List<SuperAppMiniWidgetSettingDto> d = superAppGetAllWidgetSettingsResponseDto.d().d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (SuperAppMiniWidgetSettingDto superAppMiniWidgetSettingDto : d) {
                    WebImage a = wnx0.a(superAppMiniWidgetSettingDto.d());
                    String e2 = superAppMiniWidgetSettingDto.e();
                    SuperAppMiniWidgetItemDto f2 = superAppMiniWidgetSettingDto.f();
                    SuperAppMiniWidgetItemDto.HeaderIconAlignDto k = f2.k();
                    int i2 = k == null ? -1 : wnx0.a.$EnumSwitchMapping$0[k.ordinal()];
                    if (i2 == -1) {
                        headerIconAlign = MiniWidgetItem.HeaderIconAlign.UNKNOWN;
                    } else if (i2 == 1) {
                        headerIconAlign = MiniWidgetItem.HeaderIconAlign.TOP;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        headerIconAlign = MiniWidgetItem.HeaderIconAlign.BOTTOM;
                    }
                    MiniWidgetItem.HeaderIconAlign headerIconAlign2 = headerIconAlign;
                    if (wnx0.a.$EnumSwitchMapping$1[f2.o().ordinal()] == 1) {
                        String i3 = f2.o().i();
                        String p = f2.p();
                        Boolean B = f2.B();
                        boolean booleanValue = B != null ? B.booleanValue() : true;
                        WebAction m = ks20.m(f2.d());
                        List<SuperAppUniversalWidgetImageItemDto> j = f2.j();
                        WebImage a2 = j != null ? wnx0.a(j) : null;
                        String i4 = f2.i();
                        String str = i4 == null ? "" : i4;
                        String g = f2.g();
                        String str2 = g == null ? "" : g;
                        String e3 = f2.e();
                        defaultMiniWidget = new ExchangeMiniWidget(i3, m, a2, headerIconAlign2, p, booleanValue, str, str2, e3 == null ? "" : e3, Double.parseDouble(String.valueOf(f2.f())));
                    } else {
                        String i5 = f2.o().i();
                        String p2 = f2.p();
                        Boolean B2 = f2.B();
                        boolean booleanValue2 = B2 != null ? B2.booleanValue() : true;
                        WebAction m2 = ks20.m(f2.d());
                        List<SuperAppUniversalWidgetImageItemDto> j2 = f2.j();
                        WebImage a3 = j2 != null ? wnx0.a(j2) : null;
                        SuperAppUniversalWidgetTextBlockDto n = f2.n();
                        String d2 = n != null ? n.d() : null;
                        String str3 = d2 == null ? "" : d2;
                        SuperAppUniversalWidgetTextBlockDto l = f2.l();
                        String d3 = l != null ? l.d() : null;
                        defaultMiniWidget = new DefaultMiniWidget(i5, m2, a3, headerIconAlign2, p2, booleanValue2, epx.f(f2.u(), Boolean.TRUE), str3, d3 == null ? "" : d3);
                    }
                    arrayList2.add(new uu1.a(a, e2, defaultMiniWidget));
                }
                uu1.b bVar = new uu1.b(f, e, arrayList2);
                for (SuperAppWidgetSettingsDto superAppWidgetSettingsDto : superAppGetAllWidgetSettingsResponseDto.e()) {
                    String f3 = superAppWidgetSettingsDto.f();
                    String str4 = f3 == null ? "" : f3;
                    String e4 = superAppWidgetSettingsDto.e();
                    String title = superAppWidgetSettingsDto.getTitle();
                    String description = superAppWidgetSettingsDto.getDescription();
                    arrayList.add(new qnx0(str4, e4, title, description == null ? "" : description, wnx0.a(superAppWidgetSettingsDto.d()), superAppWidgetSettingsDto.g(), superAppWidgetSettingsDto.i()));
                }
                return new uu1(bVar, arrayList);
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ u5u0(com.vk.superapp.widget_settings.p004new.b bVar) {
        this.b = 6;
    }
}
