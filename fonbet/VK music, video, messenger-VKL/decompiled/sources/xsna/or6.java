package xsna;

import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import java.io.Serializable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class or6 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ or6(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, Long l, long j) {
        this.d = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.e = l;
        this.c = j;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qr6 qr6Var = (qr6) this.d;
                Exception exc = (Exception) this.e;
                StringBuilder sb = new StringBuilder("UPLOAD_TRACE doUpload: chunk upload failed for attach ");
                sb.append(qr6Var.o);
                sb.append(" at offset ");
                sb.append(this.c);
                sb.append(", sessionId=");
                ResumableAttachUploadInfo resumableAttachUploadInfo = qr6Var.p;
                if (resumableAttachUploadInfo == null) {
                    resumableAttachUploadInfo = null;
                }
                sb.append(resumableAttachUploadInfo.k());
                sb.append(", error=");
                sb.append(exc.getClass().getSimpleName());
                sb.append(": ");
                sb.append(exc.getMessage());
                return sb.toString();
            default:
                MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = (MobileOfficialAppsFeedStat$FeedTimeRange) this.d;
                Long l = (Long) this.e;
                StringBuilder sb2 = new StringBuilder("Posting tech stats: publishing success: (");
                sb2.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.b() : null);
                sb2.append(" ns, ");
                sb2.append(mobileOfficialAppsFeedStat$FeedTimeRange != null ? mobileOfficialAppsFeedStat$FeedTimeRange.a() : null);
                sb2.append(" ns), diff: ");
                sb2.append(l != null ? Long.valueOf(this.c - l.longValue()) : null);
                sb2.append(" ms");
                return sb2.toString();
        }
    }

    public /* synthetic */ or6(qr6 qr6Var, long j, Exception exc) {
        this.d = qr6Var;
        this.c = j;
        this.e = exc;
    }
}
