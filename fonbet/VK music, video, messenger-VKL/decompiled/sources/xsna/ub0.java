package xsna;

import com.huawei.hms.hihealth.data.ActivitySummary;
import com.huawei.hms.hihealth.data.SampleSection;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class ub0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int aab;
        aab = ActivitySummary.aab((SampleSection) obj, (SampleSection) obj2);
        return aab;
    }
}
