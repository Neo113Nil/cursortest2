package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.log.L;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EduAchievementsHelper.kt */
/* loaded from: classes2.dex */
public final class r5p {
    public final a1w a;
    public final Peer b;
    public io.reactivex.rxjava3.disposables.c d;
    public final io.reactivex.rxjava3.subjects.d<List<EduAchievement>> c = io.reactivex.rxjava3.subjects.d.N0();
    public final bpn0 e = new bpn0(new jrh(this, 9));

    /* compiled from: EduAchievementsHelper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public r5p(a1w a1wVar, Peer peer) {
        this.a = a1wVar;
        this.b = peer;
    }
}
