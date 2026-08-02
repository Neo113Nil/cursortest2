package io.reactivex.rxjava3.internal.operators.observable;

import android.content.Context;
import android.util.JsonReader;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.audio.AudioOutput;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.vk.api.generated.account.dto.AccountSetPrivacyResponseDto;
import com.vk.api.generated.apps.dto.AppsGetSecretHashResponseDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsSettingsDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsSuspendResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.database.dto.DatabaseGetSchoolsResponseDto;
import com.vk.api.generated.fave.dto.FaveGetPagesResponseDto;
import com.vk.channels.api.Channel;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.yandex.div.internal.AssertionErrorHandler;
import com.yandex.div.internal.parser.JsonParsers;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.internal.operators.observable.r1;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.factory.HandRecognitionFactory;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.util.Function;
import ru.ok.tensorflow.util.Function2;
import xsna.b03;
import xsna.b0x;
import xsna.by1;
import xsna.d0x;
import xsna.dkh0;
import xsna.f03;
import xsna.fru0;
import xsna.h8g;
import xsna.icq;
import xsna.ihz;
import xsna.l8x;
import xsna.m6o;
import xsna.n3y0;
import xsna.o1y0;
import xsna.o5k;
import xsna.te;
import xsna.vr0;
import xsna.wwx;
import xsna.xk5;
import xsna.xtp0;
import xsna.ym5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class q1 implements b03, f03, AssertionErrorHandler, ihz.a, Function, io.reactivex.rxjava3.functions.l, m6o, o5k.a, io.reactivex.rxjava3.functions.m, ValueValidator, l8x.a, Continuation, Function2 {
    public final /* synthetic */ int b;

    public /* synthetic */ q1(int i) {
        this.b = i;
    }

    public static LinearLayout a(int i, Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    public static /* synthetic */ void f(AtomicReference atomicReference, r1.b bVar) {
        while (!atomicReference.compareAndSet(bVar, null) && atomicReference.get() == bVar) {
        }
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        DetectionSmoother lambda$create$0;
        lambda$create$0 = HandRecognitionFactory.lambda$create$0((Detection) obj, (Long) obj2);
        return lambda$create$0;
    }

    @Override // xsna.m6o
    public double b(double d) {
        float[] fArr = h8g.a;
        return h8g.c(h8g.d, d);
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new icq(ym5Var, n3y0Var);
    }

    @Override // xsna.o5k.a
    public Object d(JsonReader jsonReader) {
        xk5.a aVar = new xk5.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "libraryName":
                    aVar.d(jsonReader.nextString());
                    break;
                case "arch":
                    aVar.b(jsonReader.nextString());
                    break;
                case "buildId":
                    aVar.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AccountSetPrivacyResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountSetPrivacyResponseDto.class).getType())).a();
            case 2:
                return (AppsMiniappsCatalogDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsMiniappsCatalogDto.class).getType())).a();
            case 8:
                return (CallsSettingsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CallsSettingsDto.class).getType())).a();
            case 11:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 13:
                return (CommunitySubscriptionsSuspendResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CommunitySubscriptionsSuspendResponseDto.class).getType())).a();
            case 15:
                return (DatabaseGetSchoolsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, DatabaseGetSchoolsResponseDto.class).getType())).a();
            default:
                return (FaveGetPagesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, FaveGetPagesResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetSecretHashResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        switch (this.b) {
            case 6:
                ((AudioOutput.a) obj).d();
                break;
            default:
                ((by1) obj).A();
                break;
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        boolean lambda$static$1;
        switch (this.b) {
            case 18:
                double doubleValue = ((Double) obj).doubleValue();
                return doubleValue >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE && doubleValue <= 1.0d;
            case 19:
                return ((Long) obj).longValue() >= 0;
            default:
                lambda$static$1 = JsonParsers.lambda$static$1((String) obj);
                return lambda$static$1;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 17:
                int i = DiscoverSearchFragment.s0;
                return obj instanceof fru0;
            default:
                return (obj instanceof d0x) || (obj instanceof o1y0) || (obj instanceof b0x);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return -1;
    }

    public /* synthetic */ q1(vr0 vr0Var) {
        this.b = 10;
    }

    @Override // ru.ok.tensorflow.util.Function
    public Object apply(Object obj) {
        switch (this.b) {
            case 7:
                return Float.valueOf(((Detection) obj).getSize());
            default:
                return ((Channel) obj).u;
        }
    }

    public /* synthetic */ q1(by1.a aVar, String str) {
        this.b = 16;
    }
}
