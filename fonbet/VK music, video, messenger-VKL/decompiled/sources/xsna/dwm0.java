package xsna;

import android.telephony.SubscriptionManager;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.utils.dto.UtilsCheckScreenNameResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C5328yl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dwm0 implements io.reactivex.rxjava3.functions.l, f03, b03, FunctionWithThrowable {
    public final /* synthetic */ int b;

    public /* synthetic */ dwm0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        List a;
        switch (this.b) {
            case 0:
                return (Integer) obj;
            default:
                a = C5328yl.a((SubscriptionManager) obj);
                return a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UtilsCheckScreenNameResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    public /* synthetic */ dwm0(xsq xsqVar) {
        this.b = 0;
    }
}
