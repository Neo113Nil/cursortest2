package xsna;

import android.content.Intent;
import android.os.Bundle;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.MsgFromChannel;

/* compiled from: ChannelSendMsgViewEvent.kt */
/* loaded from: classes16.dex */
public abstract class bcb implements yn50 {

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class a extends bcb {
        public final int a;
        public final int b;
        public final Intent c;

        public a(int i, int i2, Intent intent) {
            this.a = i;
            this.b = i2;
            this.c = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            Intent intent = this.c;
            return a + (intent == null ? 0 : intent.hashCode());
        }

        public final String toString() {
            return "OnActivityResultEvent(reqCode=" + this.a + ", resCode=" + this.b + ", data=" + this.c + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class b extends bcb {
        public final izs<Boolean, s3q0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super Boolean, s3q0> izsVar) {
            this.a = izsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return up.c(new StringBuilder("OnBackPressed(result="), this.a, ')');
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class c extends bcb {
        public final MsgFromChannel a;

        public c(MsgFromChannel msgFromChannel) {
            this.a = msgFromChannel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnEditMsgEvent(msg=" + this.a + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class d extends bcb {
        public final MsgFromChannel a;

        public d(MsgFromChannel msgFromChannel) {
            this.a = msgFromChannel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnEditPublishDateEvent(msg=" + this.a + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class e extends bcb {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1961382260;
        }

        public final String toString() {
            return "OnPauseEvent";
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class f extends bcb {
        public final ChannelMsgSendConfig a;
        public final boolean b;

        public f(ChannelMsgSendConfig channelMsgSendConfig, boolean z) {
            this.a = channelMsgSendConfig;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnPostSettingsUpdateEvent(config=");
            sb.append(this.a);
            sb.append(", isSendMsgAfterUpdate=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class g extends bcb {
        public final Bundle a;

        public g(Bundle bundle) {
            this.a = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            Bundle bundle = this.a;
            if (bundle == null) {
                return 0;
            }
            return bundle.hashCode();
        }

        public final String toString() {
            return uf3.c(new StringBuilder("OnRestoreState(savedState="), this.a, ')');
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class h extends bcb {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1428737829;
        }

        public final String toString() {
            return "OnResumeEvent";
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class i extends bcb {
        public final Bundle a;

        public i(Bundle bundle) {
            this.a = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return uf3.c(new StringBuilder("OnSaveState(outState="), this.a, ')');
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class j extends bcb {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -264071609;
        }

        public final String toString() {
            return "OnSendSuccessEvent";
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class k extends bcb {
        public final MsgFromChannel a;
        public final ChannelMsgSendConfig b;

        public k(MsgFromChannel msgFromChannel, ChannelMsgSendConfig channelMsgSendConfig) {
            this.a = msgFromChannel;
            this.b = channelMsgSendConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && epx.f(this.b, kVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OnShowDatePickerAndSendEvent(msg=" + this.a + ", config=" + this.b + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewEvent.kt */
    public static final class l extends bcb {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 127957914;
        }

        public final String toString() {
            return "OnStartSendingEvent";
        }
    }
}
