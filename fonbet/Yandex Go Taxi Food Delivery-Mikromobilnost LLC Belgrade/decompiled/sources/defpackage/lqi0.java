package defpackage;

import android.graphics.Paint;
import com.yandex.go.overdraft.data.model.ComparisonType;
import com.yandex.go.overdraft.data.model.RequiredBalance;
import com.yandex.go.overdraft.data.model.d0;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo$ReorderOption$$serializer;
import com.yandex.go.taxi.order.models.api.objects.b1;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment;
import com.ybsdk.core.utils.text.Text;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.BluetoothError;
import ru.yandex.taxi.eatskit.dto.ErrorType;
import ru.yandex.taxi.eatskit.dto.GrantResult;

/* loaded from: classes5.dex */
public final /* synthetic */ class lqi0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ lqi0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        e2j0 reportFormContract_delegate$lambda$2;
        Text.Resource resource = null;
        switch (this.a) {
            case 0:
                return new fqi0(resource, 3);
            case 1:
                return new o4o("flex.feature.document.action.ReloadAction", ysi0.INSTANCE, new Annotation[0]);
            case 2:
                return new p53(auu0.a, 0);
            case 3:
                return new p53(new oke(qoi0.a(kr.class), null, new KSerializer[0]), 0);
            case 4:
                return new oke(qoi0.a(u1m.class), null, new KSerializer[0]);
            case 5:
                return new p53(auu0.a, 0);
            case 6:
                Paint paint = new Paint(1);
                paint.setColor(-1);
                return paint;
            case 7:
                a7u0 a7u0Var = xxi0.a;
                return null;
            case 8:
                return new oke(qoi0.a(ywl.class), null, new KSerializer[0]);
            case 9:
                return "Missing order in db while reorder";
            case 10:
                return "Reorder failed";
            case 11:
                b1 b1Var = ReorderInfo.Companion;
                return new p53(ReorderInfo$ReorderOption$$serializer.INSTANCE, 0);
            case 12:
                a1j0 a1j0Var = b1j0.Companion;
                return new p53(auu0.a, 1);
            case 13:
                a1j0 a1j0Var2 = b1j0.Companion;
                return new p53(auu0.a, 1);
            case 14:
                a1j0 a1j0Var3 = b1j0.Companion;
                return new p53(auu0.a, 1);
            case 15:
                a1j0 a1j0Var4 = b1j0.Companion;
                return new p53(auu0.a, 1);
            case 16:
                return new p53(auu0.a, 1);
            case 17:
                return new p53(auu0.a, 1);
            case 18:
                return new p53(auu0.a, 1);
            case 19:
                return new p53(auu0.a, 1);
            case 20:
                reportFormContract_delegate$lambda$2 = ReportFormFragment.reportFormContract_delegate$lambda$2();
                return reportFormContract_delegate$lambda$2;
            case 21:
                return BluetoothError.Companion.serializer();
            case 22:
                c6j0 c6j0Var = d6j0.Companion;
                return ErrorType.Companion.serializer();
            case 23:
                u6j0 u6j0Var = v6j0.Companion;
                return new p53(auu0.a, 0);
            case 24:
                y6j0 y6j0Var = z6j0.Companion;
                return new p53(auu0.a, 0);
            case 25:
                a8j0 a8j0Var = b8j0.Companion;
                return new p53(auu0.a, 0);
            case 26:
                return new k8u(auu0.a, GrantResult.Companion.serializer(), 1);
            case 27:
                d0 d0Var = RequiredBalance.Companion;
                return ComparisonType.Companion.serializer();
            case 28:
                return new ArrayList();
            default:
                wfj0 wfj0Var = xfj0.Companion;
                return new p53(agj0.a, 0);
        }
    }
}
