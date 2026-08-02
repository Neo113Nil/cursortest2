package defpackage;

import com.yandex.go.tariffcard.experiment.GradientTypeDto;
import com.yandex.go.tariffcard.experiment.HeaderGradientConfigDto;
import com.yandex.go.tariffcard.experiment.d;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.m;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.o;
import com.yandex.plus.pay.api.google.model.GooglePlayPurchase;
import defpackage.kmu;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.eatskit.dto.GrantResult;
import ru.yandex.taxi.surge.models.dto.i;
import ru.yandex.taxi.surge.models.dto.q;

/* loaded from: classes2.dex */
public final /* synthetic */ class mvt implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ mvt(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        switch (this.a) {
            case 0:
                return new p53(auu0.a, 0);
            case 1:
                _childSerializers$_anonymous_ = GooglePlayPurchase._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_$0 = GooglePlayPurchase._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 3:
                q qVar = i.e.Companion;
                return new p53(txt.e, 0);
            case 4:
                qxt qxtVar = rxt.Companion;
                return FormattedText.FontWeight.Companion.serializer();
            case 5:
                return new ssp0("com.yandex.plus.core.graphql.gradient.GradientResponse", qoi0.a(fzt.class), new lfx[]{qoi0.a(bzt.class), qoi0.a(ezt.class)}, new KSerializer[]{zyt.a, czt.a}, new Annotation[0]);
            case 6:
                return new p53(gxt.a, 0);
            case 7:
                return new p53(gxt.a, 0);
            case 8:
                return vez0.g("com.yandex.go.tariffcard.experiment.GradientTypeDto", GradientTypeDto.values(), new String[]{"custom", "clear"}, new Annotation[][]{null, null});
            case 9:
                return vez0.g("ru.yandex.taxi.eatskit.dto.GrantResult", GrantResult.values(), new String[]{"GRANTED", "DENIED", "DONT_ASK_AGAIN", "UNAVAILABLE"}, new Annotation[][]{null, null, null, null});
            case 10:
                return new atd(new pqd(new gby(), new icd0()), new aku0());
            case 11:
                return new xxw();
            case 12:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemContentDto.Unsupported", m.INSTANCE, new Annotation[0]);
            case 13:
                o oVar = GroupItemDto.Companion;
                return new p53(HubItemAnalyticsV2$$serializer.INSTANCE, 0);
            case 14:
                return new u3u();
            case 15:
                return new p53(auu0.a, 0);
            case 16:
                e8u e8uVar = g8u.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 17:
                d dVar = HeaderGradientConfigDto.Companion;
                return GradientTypeDto.Companion.serializer();
            case 18:
                d dVar2 = HeaderGradientConfigDto.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, new p53(auu0Var, 0), 1);
            case 19:
                int i = kt6.V;
                return zy11.a;
            case 20:
                zy11Var = zy11.a;
                return zy11Var;
            case 21:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 22:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 23:
                khu khuVar = lhu.Companion;
                return new p53(auu0.a, 1);
            case 24:
                khu khuVar2 = lhu.Companion;
                return new p53(auu0.a, 1);
            case 25:
                return new o4o("flex.feature.document.action.HideKeyboardAction", aiu.INSTANCE, new Annotation[0]);
            case 26:
                return new p53(auu0.a, 1);
            case 27:
                return new p53(auu0.a, 1);
            case 28:
                amu amuVar = bmu.Companion;
                return new p53(gmu.a, 0);
            default:
                mmu mmuVar = kmu.b.Companion;
                return new p53(far.a, 0);
        }
    }
}
