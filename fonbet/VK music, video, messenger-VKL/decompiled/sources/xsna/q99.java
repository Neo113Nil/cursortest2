package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import java.security.MessageDigest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.oqg;
import xsna.xn50;

/* compiled from: CallSettingsFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class q99 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q99(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((m99) this.receiver).getClass();
                return Boolean.valueOf(m99.m(obj));
            case 1:
                oqg oqgVar = (oqg) obj;
                hqg hqgVar = (hqg) this.receiver;
                if (!(oqgVar instanceof oqg.a)) {
                    int i = hqg.k1;
                    hqgVar.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                z63 z63Var = hqgVar.j1;
                if (z63Var != null) {
                    z63Var.invoke(((oqg.a) oqgVar).a);
                }
                hqgVar.hide();
                return s3q0.a;
            case 2:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 3:
                byte[] bArr = (byte[]) obj;
                m4j0 m4j0Var = (m4j0) this.receiver;
                if (m4j0Var.a == null) {
                    m4j0Var.a = MessageDigest.getInstance("SHA-256");
                }
                MessageDigest messageDigest = m4j0Var.a;
                if (messageDigest == null) {
                    messageDigest = null;
                }
                messageDigest.reset();
                MessageDigest messageDigest2 = m4j0Var.a;
                return (messageDigest2 != null ? messageDigest2 : null).digest(bArr);
            case 4:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 5:
                return ((vpc0) this.receiver).c((PostingState) obj);
            case 6:
                pii0 pii0Var = (pii0) this.receiver;
                pii0Var.getClass();
                xn50.a.c(pii0Var, (nii0) obj);
                return s3q0.a;
            default:
                ((f4z) this.receiver).b((sww0) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q99(Object obj, int i) {
        super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, vpc0.class, "mapConfirmButtonViewState", "mapConfirmButtonViewState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/presentation/model/PostingCreatePostButtonViewState;", 0);
                break;
            default:
                break;
        }
    }
}
