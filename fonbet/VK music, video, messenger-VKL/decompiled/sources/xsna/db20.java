package xsna;

import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.metrics.eventtracking.Event;

/* compiled from: MessageRequestReporterImpl.kt */
/* loaded from: classes5.dex */
public final class db20 implements cb20 {
    public static final db20 a = new db20();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessageRequestReporterImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a REJECTED;
        public static final a WITH_BANNER;
        public static final a WITH_BOTTOM_PANEL;
        private final String param;

        static {
            a aVar = new a("WITH_BOTTOM_PANEL", 0, "bottom_panel");
            WITH_BOTTOM_PANEL = aVar;
            a aVar2 = new a("WITH_BANNER", 1, "conversation_banner");
            WITH_BANNER = aVar2;
            a aVar3 = new a("REJECTED", 2, "rejected");
            REJECTED = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.param = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String h() {
            return this.param;
        }
    }

    @Override // xsna.cb20
    public final void a(Dialog dialog) {
        a aVar;
        if (dialog.Xb() == MsgRequestStatus.REJECTED) {
            aVar = a.REJECTED;
        } else if (dialog.Xb() == MsgRequestStatus.PENDING) {
            aVar = a.WITH_BOTTOM_PANEL;
        } else {
            InfoBar zb = dialog.zb();
            aVar = (zb == null || !epx.f(zb.b, "message_request_banner")) ? null : a.WITH_BANNER;
        }
        if (aVar == null) {
            return;
        }
        el3 el3Var = Event.b;
        Event.a b = h5s.b("vkm_message_request_open");
        b.b("peer_id", dialog.Sb());
        b.c("indicator", aVar.h());
        b.j(thp0.c);
        b.h();
        com.vk.metrics.eventtracking.b.a.k(b.e());
    }
}
