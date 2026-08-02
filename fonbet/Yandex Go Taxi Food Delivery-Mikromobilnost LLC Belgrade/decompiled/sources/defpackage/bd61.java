package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.net.taxi.dto.request.ZoneInfoParam;
import com.yandex.go.net.taxi.dto.request.c;
import com.yandex.go.slot.dto.SlotButtonDto$$serializer;
import com.yandex.go.zone.dto.objects.CustomEndpoint$$serializer;
import com.yandex.go.zone.dto.objects.Notification$$serializer;
import com.yandex.go.zone.dto.objects.RequirementOverrideDto$$serializer;
import com.yandex.go.zone.dto.objects.TariffBranding$$serializer;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition$$serializer;
import com.yandex.go.zone.dto.objects.TariffInfoViewSection$$serializer;
import com.yandex.go.zone.dto.objects.VerticalTariffDto$$serializer;
import com.yandex.go.zone.dto.objects.VerticalType;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.dto.objects.ZoneVerticalMulticlass;
import com.yandex.go.zone.dto.objects.v6;
import com.yandex.go.zone.dto.objects.w6;
import com.yandex.go.zone.dto.objects.x6;
import com.yandex.go.zone.dto.response.TariffAction$$serializer;
import com.yandex.go.zone.dto.response.ZoneAcceptance$Default;
import com.yandex.go.zone.dto.response.ZoneAcceptance$Trackable;
import com.yandex.go.zone.dto.response.m;
import com.yandex.go.zone.dto.response.o;
import com.yandex.go.zone.model.ZoneMode;
import com.yandex.go.zone.model.h;
import com.yandex.go.zone.repository.ZoneCacheEntry$$serializer;
import com.yandex.go.zone.repository.ZoneFallbackContainer;
import com.yandex.go.zone.repository.i;
import java.lang.annotation.Annotation;

/* loaded from: classes8.dex */
public final /* synthetic */ class bd61 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ bd61(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m mVar = ZoneAcceptance$Default.Companion;
                return ZoneAcceptance$Default.IconStyle.Companion.serializer();
            case 1:
                return vez0.g("com.yandex.go.zone.dto.response.ZoneAcceptance.Default.IconStyle", ZoneAcceptance$Default.IconStyle.values(), new String[]{"icon_left", "icon_central"}, new Annotation[][]{null, null});
            case 2:
                o oVar = ZoneAcceptance$Trackable.Companion;
                return new p53(SlotButtonDto$$serializer.INSTANCE, 0);
            case 3:
                i iVar = ZoneFallbackContainer.Companion;
                return new k8u(auu0.a, ZoneCacheEntry$$serializer.INSTANCE, 1);
            case 4:
                c cVar = ZoneInfoParam.Companion;
                return new p53(auu0.a, 0);
            case 5:
                c cVar2 = ZoneInfoParam.Companion;
                return jsq0.Companion.serializer(VerticalType.Companion.serializer());
            case 6:
                h hVar = ZoneMode.Companion;
                return new p53(auu0.a, 0);
            case 7:
                return new tmx(Mode.Companion.serializer());
            case 8:
                v6 v6Var = ZoneTariffInfo.Companion;
                return new k8u(auu0.a, Notification$$serializer.INSTANCE, 1);
            case 9:
                v6 v6Var2 = ZoneTariffInfo.Companion;
                return new p53(TariffBranding$$serializer.INSTANCE, 0);
            case 10:
                v6 v6Var3 = ZoneTariffInfo.Companion;
                return new p53(qke.n(auu0.a), 0);
            case 11:
                v6 v6Var4 = ZoneTariffInfo.Companion;
                return new p53(h6w.a, 0);
            case 12:
                v6 v6Var5 = ZoneTariffInfo.Companion;
                return new p53(TariffAction$$serializer.INSTANCE, 0);
            case 13:
                v6 v6Var6 = ZoneTariffInfo.Companion;
                return new p53(CustomEndpoint$$serializer.INSTANCE, 0);
            case 14:
                v6 v6Var7 = ZoneTariffInfo.Companion;
                return new p53(qke.n(auu0.a), 0);
            case 15:
                v6 v6Var8 = ZoneTariffInfo.Companion;
                return new p53(TariffInfoViewSection$$serializer.INSTANCE, 0);
            case 16:
                v6 v6Var9 = ZoneTariffInfo.Companion;
                return new p53(TariffInfoGroupDefinition$$serializer.INSTANCE, 0);
            case 17:
                v6 v6Var10 = ZoneTariffInfo.Companion;
                return new p53(mmw0.a, 0);
            case 18:
                v6 v6Var11 = ZoneTariffInfo.Companion;
                return new p53(mmw0.a, 0);
            case 19:
                v6 v6Var12 = ZoneTariffInfo.Companion;
                return new p53(ugj0.a, 0);
            case 20:
                w6 w6Var = ZoneVertical.Companion;
                return VerticalType.Companion.serializer();
            case 21:
                w6 w6Var2 = ZoneVertical.Companion;
                return new p53(VerticalTariffDto$$serializer.INSTANCE, 0);
            case 22:
                w6 w6Var3 = ZoneVertical.Companion;
                return new p53(RequirementOverrideDto$$serializer.INSTANCE, 0);
            default:
                x6 x6Var = ZoneVerticalMulticlass.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
