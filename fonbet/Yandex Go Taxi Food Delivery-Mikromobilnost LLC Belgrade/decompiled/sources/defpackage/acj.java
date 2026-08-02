package defpackage;

import android.os.Build;
import android.os.SystemClock;
import androidx.compose.foundation.gestures.i;
import com.yandex.go.explorer.impl.data.models.CellItemDto$$serializer;
import com.yandex.go.explorer.impl.data.models.DiscoveredCellsResponse;
import com.yandex.go.explorer.impl.data.models.d;
import com.yandex.go.loyalty.api.data.model.common.ColorSettings$$serializer;
import com.yandex.go.payments.paymentdomain.data.DomainConfigDto;
import com.yandex.go.payments.paymentdomain.data.DomainConfigPublicKeyDto$$serializer;
import com.yandex.go.payments.paymentdomain.data.DomainConfigSignatureDto$$serializer;
import com.yandex.go.payments.paymentdomain.data.a;
import defpackage.f0k;
import java.lang.annotation.Annotation;
import kotlin.Result;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.net.taxi.dto.objects.b;
import ru.yandex.taxi.net.taxi.dto.objects.c;
import ru.yandex.taxi.plus.api.dto.state.plaque.DisplayWidgetRules;

/* loaded from: classes6.dex */
public final /* synthetic */ class acj implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ acj(jyl jylVar) {
        this.a = 21;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object failure;
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                i3y i3yVar = bcj.a;
                try {
                    if (cvu0.x(str2, str, false)) {
                        failure = bcj.a(str2);
                    } else {
                        failure = bcj.a(str + " " + str2);
                    }
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                String str3 = (String) (failure instanceof Result.Failure ? null : failure);
                return str3 == null ? "Unknown" : str3;
            case 1:
                return new cn();
            case 2:
                ycj ycjVar = Dialog.Companion;
                return new p53(b.a, 0);
            case 3:
                return vez0.g("ru.yandex.taxi.net.taxi.dto.objects.Dialog.Action", Dialog.Action.values(), new String[]{"back_to_driving_screen", "go_to_edit_destination"}, new Annotation[][]{null, null});
            case 4:
                c cVar = Dialog.a.Companion;
                return Dialog.Action.Companion.serializer();
            case 5:
                return new eij(new t8j0());
            case 6:
                jlj jljVar = klj.Companion;
                return new p53(rlj.a, 0);
            case 7:
                d dVar = DiscoveredCellsResponse.Companion;
                return new p53(CellItemDto$$serializer.INSTANCE, 0);
            case 8:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 9:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 10:
                mzj mzjVar = ru.yandex.taxi.plus.api.dto.state.plaque.d.Companion;
                return new p53(ColorSettings$$serializer.INSTANCE, 0);
            case 11:
                yzj yzjVar = f0k.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 12:
                c0k c0kVar = f0k.a.Companion;
                return new p53(auu0.a, 0);
            case 13:
                s0k s0kVar = DisplayWidgetRules.Companion;
                return DisplayWidgetRules.Type.Companion.serializer();
            case 14:
                return vez0.g("ru.yandex.taxi.plus.api.dto.state.plaque.DisplayWidgetRules.Type", DisplayWidgetRules.Type.values(), new String[]{"fit", "fill", "fix"}, new Annotation[][]{null, null, null});
            case 15:
                zy11Var = zy11.a;
                return zy11Var;
            case 16:
                return new njl(new t8j0());
            case 17:
                return new oke(qoi0.a(tg2.class), null, new KSerializer[0]);
            case 18:
                return new oke(qoi0.a(tg2.class), null, new KSerializer[0]);
            case 19:
                return oul.a;
            case 20:
                return Long.valueOf(SystemClock.uptimeMillis());
            case 21:
                return Boolean.FALSE;
            case 22:
                return new ryl();
            case 23:
                return null;
            case 24:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 25:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 26:
                a aVar = DomainConfigDto.Companion;
                return new p53(DomainConfigSignatureDto$$serializer.INSTANCE, 0);
            case 27:
                a aVar2 = DomainConfigDto.Companion;
                return new p53(DomainConfigPublicKeyDto$$serializer.INSTANCE, 0);
            case 28:
                float f = i.a;
                return Boolean.TRUE;
            default:
                float f2 = i.a;
                return zy11.a;
        }
    }

    public /* synthetic */ acj(int i) {
        this.a = i;
    }
}
