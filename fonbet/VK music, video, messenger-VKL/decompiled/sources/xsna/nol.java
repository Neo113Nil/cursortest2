package xsna;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nol implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nol(Object obj, long j, int i, long j2) {
        this.b = i;
        this.e = obj;
        this.c = j;
        this.d = j2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType = (MobileOfficialAppsFeedStat$PickerType) this.e;
                StringBuilder sb = new StringBuilder("Posting tech stats: picker opening [");
                sb.append(mobileOfficialAppsFeedStat$PickerType);
                sb.append("]: (");
                long j = this.c;
                sb.append(j);
                sb.append(", ");
                long j2 = this.d;
                sb.append(j2);
                sb.append("), diff: ");
                return efz.b(j2 - j, " ms", sb);
            default:
                ((kut) this.e).k(this.c, this.d, SelectedDataSource.HUAWEI_HEALTH);
                return s3q0.a;
        }
    }
}
