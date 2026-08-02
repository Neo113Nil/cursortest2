package xsna;

import android.util.Size;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ImageMetric.kt */
/* loaded from: classes3.dex */
public final class lkw {
    public qv10 a;
    public String b;
    public Size c;
    public SchemeStat$TypeNetworkImagesItem.ImageFormat d;
    public Long e;
    public Long f;
    public Long g;
    public Boolean h;
    public Boolean i;

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SchemeStat$TypeNetworkImagesItem a() {
        Integer num;
        int intValue;
        Size size;
        String str;
        Integer num2;
        SchemeStat$TypeNetworkImagesItem.Status status;
        SchemeStat$TypeNetworkImagesItem.Status status2;
        qv10 qv10Var = this.a;
        if (qv10Var == null) {
            return null;
        }
        Long l = this.g;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.e;
            if (l2 != null) {
                long longValue2 = longValue - l2.longValue();
                if (longValue2 < 0) {
                    longValue2 = 0;
                }
                num = Integer.valueOf((int) longValue2);
                if (num != null || (intValue = num.intValue()) > qv10Var.d * 2 || (size = this.c) == null || (str = this.b) == null) {
                    return null;
                }
                int i = qv10Var.c;
                int width = size.getWidth();
                int width2 = size.getWidth() * size.getHeight();
                Long l3 = this.g;
                if (l3 != null) {
                    long longValue3 = l3.longValue();
                    Long l4 = this.f;
                    if (l4 != null) {
                        long longValue4 = longValue3 - l4.longValue();
                        num2 = Integer.valueOf((int) (longValue4 >= 0 ? longValue4 : 0L));
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            int i2 = qv10Var.e;
                            int i3 = qv10Var.d;
                            Boolean bool = this.h;
                            if (epx.f(bool, Boolean.TRUE)) {
                                status2 = SchemeStat$TypeNetworkImagesItem.Status.OK;
                            } else {
                                if (!epx.f(bool, Boolean.FALSE)) {
                                    if (bool != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    status = null;
                                    if (status != null) {
                                        return null;
                                    }
                                    return new SchemeStat$TypeNetworkImagesItem(str, i, width2, intValue, intValue2, i2, i3, status, Integer.valueOf(width), this.d, String.valueOf(qv10Var.b), qv10Var.f, null, qv10Var.g, Integer.valueOf(qv10Var.h), qv10Var.i, Integer.valueOf(qv10Var.k), qv10Var.j, 4096, null);
                                }
                                status2 = this.f == null ? SchemeStat$TypeNetworkImagesItem.Status.REQUEST_ERROR : SchemeStat$TypeNetworkImagesItem.Status.PROCESSING_ERROR;
                            }
                            status = status2;
                            if (status != null) {
                            }
                        }
                        return null;
                    }
                }
                num2 = null;
                if (num2 != null) {
                }
                return null;
            }
        }
        num = null;
        if (num != null) {
            return null;
        }
        return null;
    }
}
