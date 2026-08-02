package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChannelMessagesLinkLongClickHandler.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class j3b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        yer yerVar;
        switch (this.b) {
            case 0:
                d3b.a((d3b) this.receiver);
                break;
            case 1:
                ((i9b) this.receiver).o();
                break;
            case 2:
                com.vk.feed.settings.impl.presentation.filtered.tab.a aVar = (com.vk.feed.settings.impl.presentation.filtered.tab.a) this.receiver;
                int i = com.vk.feed.settings.impl.presentation.filtered.tab.a.q;
                aVar.getClass();
                if (!jjc.b() && (yerVar = (yer) aVar.m) != null) {
                    UserId userId = yerVar.a;
                    v34 v34Var = aVar.o;
                    if (v34Var != null) {
                        b.f fVar = new b.f(userId);
                        NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) v34Var.c;
                        int i2 = NewsfeedFilterListFragment2.X;
                        newsfeedFilterListFragment2.getFeature().C(fVar);
                    }
                    e40 e40Var = aVar.p;
                    if (e40Var != null) {
                        e40Var.a(new f.a.c(userId));
                    }
                }
                break;
            case 3:
                jl4 jl4Var = ((mjx) this.receiver).i;
                if (jl4Var != null) {
                    jl4Var.invoke();
                }
                break;
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CALLIN_CALL_TAP, null, null, null, null, null, null, 254);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3b(Object obj, int i) {
        super(0, obj, i9b.class, "unarchiveChannel", "unarchiveChannel()V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(0, obj, com.vk.registration.funnels.b.class, "onVerificationCallInMakeCallTap", "onVerificationCallInMakeCallTap()V", 0);
                break;
            default:
                break;
        }
    }
}
