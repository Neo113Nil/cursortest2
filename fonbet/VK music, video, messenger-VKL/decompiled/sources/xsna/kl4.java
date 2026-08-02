package xsna;

import android.content.Context;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.attachments.ShitAttachment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AudioBufferingHandlerThread.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl4 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s980 s980Var;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((ml4) this.receiver).isAlive());
            case 1:
                ur9 ur9Var = (ur9) this.receiver;
                int i = ur9.H;
                T t = ur9Var.C;
                ?? r2 = ur9Var.G;
                sr9 sr9Var = (sr9) t;
                if (sr9Var != null) {
                    if (sr9Var.o) {
                        ?? q6 = ur9Var.q6();
                        if (q6 != 0 && (s980Var = ur9Var.y) != 0) {
                            NewsEntry t6 = ur9Var.t6();
                            int h = PostActions.ACTION_IGNORE.h();
                            u1c0 J0 = ur9Var.J0();
                            s980Var.d9(q6, t6, h, J0 != null ? J0.k : 0);
                        }
                    } else if (sr9Var.n) {
                        NewsEntry newsEntry = sr9Var.q;
                        if (newsEntry instanceof ShitAttachment) {
                            ((c1c0) r2.getValue()).J(ur9Var.itemView.getContext(), (ShitAttachment) newsEntry);
                        } else if (newsEntry instanceof PromoPost) {
                            ((c1c0) r2.getValue()).m(ur9Var.itemView.getContext(), (PromoPost) newsEntry);
                        } else if (newsEntry instanceof Html5Entry) {
                            ((c1c0) r2.getValue()).u(ur9Var.itemView.getContext(), (Html5Entry) newsEntry);
                        }
                    } else {
                        NewsEntry newsEntry2 = sr9Var.q;
                        c1c0 c1c0Var = (c1c0) r2.getValue();
                        Context context = ur9Var.itemView.getContext();
                        NewsEntry t62 = ur9Var.t6();
                        String str = ur9Var.u;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        u1c0 J02 = ur9Var.J0();
                        c1c0Var.T(context, newsEntry2, t62, str2, J02 != null ? J02.k : -1);
                    }
                }
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((io.reactivex.rxjava3.core.r) this.receiver).h());
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMS_CODE_DETECTED, null, null, null, null, null, null, 254);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl4(Object obj) {
        super(0, obj, com.vk.registration.funnels.b.class, "onSmsCodeDetected", "onSmsCodeDetected()V", 0);
        this.b = 3;
    }
}
