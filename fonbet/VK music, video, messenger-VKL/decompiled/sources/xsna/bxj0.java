package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.statEvents.dto.StatEventsBaseResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerResponseDto;
import com.vk.api.generated.video.dto.VideoGetStatsTokenResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import ru.ok.tracer.opentelemetry.record.OpenTelemetryRecorderProvider;
import xsna.t4a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bxj0 implements f03, b03, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ bxj0(int i) {
        this.b = i;
    }

    public static StringBuilder a(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static boolean b(Class cls, String str) {
        return str.equals(t4a.a.b(fpf0.a(cls)));
    }

    public static /* synthetic */ boolean c(AtomicReference atomicReference, OpenTelemetryRecorderProvider openTelemetryRecorderProvider) {
        while (!atomicReference.compareAndSet(null, openTelemetryRecorderProvider)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return EmptyList.b;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (StatEventsBaseResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StatEventsBaseResponseDto.class).getType())).a();
            default:
                return (StoriesGetVideoUploadServerResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, StoriesGetVideoUploadServerResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetStatsTokenResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }
}
