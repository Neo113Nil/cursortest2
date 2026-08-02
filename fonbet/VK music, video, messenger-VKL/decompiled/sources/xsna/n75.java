package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AuthorActionHandler.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class n75 extends FunctionReferenceImpl implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        q75 q75Var = (q75) this.receiver;
        VideoFile videoFile = q75Var.b.e;
        Owner s = videoFile.s();
        UserId userId = s != null ? s.b : null;
        if (videoFile.x0() || userId == null) {
            q75Var.b();
        } else {
            fxc0.B().Y().q(q75Var.a, userId, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY, new vl1(q75Var, 6));
        }
        return s3q0.a;
    }
}
