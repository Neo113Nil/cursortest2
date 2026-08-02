package xsna;

import android.graphics.Paint;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.statEvents.dto.StatEventsBaseResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x9 implements f03 {
    public static int a(int i, int i2, int i3) {
        return CodedOutputStream.n(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static Paint c(boolean z) {
        Paint paint = new Paint();
        paint.setAntiAlias(z);
        return paint;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StatEventsBaseResponseDto.class).getType());
    }
}
