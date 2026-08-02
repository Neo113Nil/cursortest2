package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.view.Choreographer;
import com.yandex.go.proxyprovision.GeProxyProvisionExperiment;
import com.yandex.go.proxyprovision.api.MapKitDefaultHost;
import com.yandex.go.proxyprovision.d;
import defpackage.shs;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import ru.yandex.taxi.address.experiment.NextButtonShowStrategy;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.TextMetaStyle;
import ru.yandex.taxi.common_models.net.a0;
import ru.yandex.taxi.common_models.net.f;
import ru.yandex.taxi.common_models.net.s;
import ru.yandex.taxi.common_models.net.w;
import ru.yandex.taxi.common_models.net.y;
import ru.yandex.taxi.common_models.net.z;
import ru.yandex.taxi.persuggest.api.GeoObjectType;
import ru.yandex.taxi.promotions.model.c;

/* loaded from: classes9.dex */
public final /* synthetic */ class j8s implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ j8s(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Class<?> returnType;
        switch (this.a) {
            case 0:
                s sVar = FormattedText.f.Companion;
                return FormattedText.LineThroughStyle.Companion.serializer();
            case 1:
                w wVar = FormattedText.h.Companion;
                return FormattedText.FontStyle.Companion.serializer();
            case 2:
                w wVar2 = FormattedText.h.Companion;
                return FormattedText.FontWeight.Companion.serializer();
            case 3:
                w wVar3 = FormattedText.h.Companion;
                return jsq0.Companion.serializer(FormattedText.TextDecoration.Companion.serializer());
            case 4:
                w wVar4 = FormattedText.h.Companion;
                return new p53(f.e, 0);
            case 5:
                w wVar5 = FormattedText.h.Companion;
                return TextMetaStyle.Companion.serializer();
            case 6:
                return vez0.g("ru.yandex.taxi.common_models.net.FormattedText.TextDecoration", FormattedText.TextDecoration.values(), new String[]{"underline", "line_through"}, new Annotation[][]{null, null});
            case 7:
                return new o4o("ru.yandex.taxi.common_models.net.FormattedText.UnderlineTextDecoration", y.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("ru.yandex.taxi.common_models.net.FormattedText.Unknown", z.INSTANCE, new Annotation[0]);
            case 9:
                return new o4o("ru.yandex.taxi.common_models.net.FormattedText.UnknownTextDecoration", a0.INSTANCE, new Annotation[0]);
            case 10:
                return vez0.g("ru.yandex.taxi.common_models.net.FormattedText.VerticalAlignment", FormattedText.VerticalAlignment.values(), new String[]{"baseline", "center", "bottom"}, new Annotation[][]{null, null, null});
            case 11:
                return new coc0();
            case 12:
                return new r8s();
            case 13:
                return new qes0(f1i0.PlaqueSdk_Component_Light, f1i0.PlaqueSdk_Component_Dark);
            case 14:
                return Choreographer.getInstance();
            case 15:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 16:
                try {
                    String[] strArr = ufs.b;
                    Method method = (Method) ufs.w.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 17:
                phs phsVar = shs.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 18:
                phs phsVar2 = shs.Companion;
                return new p53(auu0.a, 0);
            case 19:
                phs phsVar3 = shs.Companion;
                return new p53(auu0.a, 1);
            case 20:
                phs phsVar4 = shs.Companion;
                return new p53(qhs.a, 0);
            case 21:
                rhs rhsVar = shs.a.Companion;
                return new p53(c.a, 0);
            case 22:
                rhs rhsVar2 = shs.a.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 23:
                jks jksVar = kks.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 24:
                jks jksVar2 = kks.Companion;
                return NextButtonShowStrategy.Companion.serializer();
            case 25:
                d dVar = GeProxyProvisionExperiment.Companion;
                return MapKitDefaultHost.Companion.serializer();
            case 26:
                return vez0.g("ru.yandex.taxi.persuggest.api.GeoObjectType", GeoObjectType.values(), new String[]{"address", "organization", "delivery_pickup_point"}, new Annotation[][]{null, null, null});
            case 27:
                return vez0.g("ru.yandex.taxi.common_models.object.GeoObjectType", ru.yandex.taxi.common_models.object.GeoObjectType.values(), new String[]{"organization", "address", "delivery_pickup_point"}, new Annotation[][]{null, null, null});
            case 28:
                long j = zp2.a;
                long j2 = iq2.a;
                long j3 = iq2.f;
                long j4 = jq2.a;
                long b = ldc.b(iq2.d, 0.1f, 0.0f, 0.0f, 0.0f, 14);
                long j5 = iq2.g;
                return new ry2("default", true, j, j2, j, j3, j4, b, j5, ldc.b(j5, 0.5f, 0.0f, 0.0f, 0.0f, 14), j, j, j5, j5, gq2.b, ldc.b(iq2.c, 0.4f, 0.0f, 0.0f, 0.0f, 14), j2, rzo.f(2147483648L), j, zp2.b);
            default:
                long j6 = iq2.h;
                long j7 = iq2.f;
                long j8 = iq2.e;
                long j9 = zp2.a;
                long j10 = jq2.a;
                long j11 = iq2.a;
                long b2 = ldc.b(j11, 0.1f, 0.0f, 0.0f, 0.0f, 14);
                long j12 = iq2.b;
                long b3 = ldc.b(j12, 0.5f, 0.0f, 0.0f, 0.0f, 14);
                long j13 = iq2.g;
                long j14 = gq2.b;
                long b4 = ldc.b(j11, 0.2f, 0.0f, 0.0f, 0.0f, 14);
                long j15 = zp2.b;
                return new ry2("default", false, j6, j7, j8, j9, j10, b2, j12, b3, j13, j9, j13, j12, j14, b4, j15, rzo.f(3204448256L), j9, j15);
        }
    }
}
