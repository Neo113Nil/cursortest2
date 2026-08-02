package xsna;

import com.vk.voip.ui.notifications.incoming.VoipNotificationDisabledReason;
import com.vk.voip.ui.prodstat.analytics.notification.model.VoipNotificationShowFailedReasonAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.jdw0;

/* compiled from: VoipNotificationAnalyticsDelegateImpl.kt */
/* loaded from: classes11.dex */
public final class btw0 implements kdw0<b>, jdw0.b {
    public static final a b = new a();
    public final d3x0 a;

    /* compiled from: VoipNotificationAnalyticsDelegateImpl.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof b;
        }
    }

    /* compiled from: VoipNotificationAnalyticsDelegateImpl.kt */
    /* loaded from: classes7.dex */
    public interface b extends mdw0 {

        /* compiled from: VoipNotificationAnalyticsDelegateImpl.kt */
        public static final class a implements b {
            public final ArrayList a;

            public a(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final List<VoipNotificationDisabledReason> b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ShowFailed(reasonList="), this.a);
            }
        }
    }

    public btw0(d3x0 d3x0Var) {
        this.a = d3x0Var;
    }

    @Override // xsna.jdw0.b
    public final boolean a(mdw0 mdw0Var) {
        if (!(mdw0Var instanceof b)) {
            return false;
        }
        b((b) mdw0Var);
        return true;
    }

    @Override // xsna.kdw0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(b bVar) {
        if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = (ArrayList) ((b.a) bVar).b();
        VoipNotificationShowFailedReasonAnalytics voipNotificationShowFailedReasonAnalytics = arrayList.contains(VoipNotificationDisabledReason.DO_NOT_DISTURB_MODE) ? VoipNotificationShowFailedReasonAnalytics.DO_NOT_DISTURB_MODE : arrayList.contains(VoipNotificationDisabledReason.NOTIFICATIONS_PAUSED) ? VoipNotificationShowFailedReasonAnalytics.NOTIFICATIONS_PAUSED : arrayList.contains(VoipNotificationDisabledReason.CHANNEL_DISABLED) ? VoipNotificationShowFailedReasonAnalytics.CHANNEL_DISABLED : arrayList.contains(VoipNotificationDisabledReason.NOTIFICATIONS_DISABLED) ? VoipNotificationShowFailedReasonAnalytics.NOTIFICATIONS_DISABLED : null;
        if (voipNotificationShowFailedReasonAnalytics != null) {
            this.a.q(voipNotificationShowFailedReasonAnalytics);
        }
    }
}
