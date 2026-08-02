package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.media.pipeline.metrics.ComparableVideoFragmentInfo;
import com.vk.media.pipeline.metrics.MetricsCalculationConfig;
import java.util.List;

/* compiled from: VideoQualityMetricsHandler.kt */
/* loaded from: classes3.dex */
public interface gat0 {
    void a(qts0 qts0Var, int i, int i2);

    qts0 b(Context context, Uri uri, ComparableVideoFragmentInfo comparableVideoFragmentInfo);

    MetricsCalculationConfig c(Context context, Uri uri, List list);
}
