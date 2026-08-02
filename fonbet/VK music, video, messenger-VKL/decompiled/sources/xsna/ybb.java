package xsna;

import android.content.Intent;
import android.os.Bundle;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;

/* compiled from: ChannelSendMsgViewAction.kt */
/* loaded from: classes16.dex */
public abstract class ybb implements kj50 {

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class a extends ybb {
        public final int b;
        public final int c;
        public final Intent d;

        public a(int i, int i2, Intent intent) {
            this.b = i;
            this.c = i2;
            this.d = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            Intent intent = this.d;
            return a + (intent == null ? 0 : intent.hashCode());
        }

        public final String toString() {
            return "OnActivityResultAction(reqCode=" + this.b + ", resCode=" + this.c + ", data=" + this.d + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class b extends ybb {
        public final com.vk.movika.sdk.base.observable.a b;

        public b(com.vk.movika.sdk.base.observable.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnBackPressed(result=" + this.b + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class c extends ybb {
        public final Msg b;
        public final ka0 c;

        public c(Msg msg, ka0 ka0Var) {
            this.b = msg;
            this.c = ka0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "OnDeleteMsg(msg=" + this.b + ", callback=" + this.c + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class d extends ybb {
        public final MsgFromChannel b;

        public d(MsgFromChannel msgFromChannel) {
            this.b = msgFromChannel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnEditMsg(msg=" + this.b + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class e extends ybb {
        public final MsgFromChannel b;

        public e(MsgFromChannel msgFromChannel) {
            this.b = msgFromChannel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnEditPublishDate(msg=" + this.b + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class f extends ybb {
        public final MsgFromChannel b;
        public final ChannelMsgSendConfig c;
        public final boolean d;

        public f(MsgFromChannel msgFromChannel, ChannelMsgSendConfig channelMsgSendConfig, boolean z) {
            this.b = msgFromChannel;
            this.c = channelMsgSendConfig;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && this.d == fVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnMsgSendAction(msg=");
            sb.append(this.b);
            sb.append(", config=");
            sb.append(this.c);
            sb.append(", isEditMode=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class g extends ybb {
        public final MsgFromChannel b;

        public g(MsgFromChannel msgFromChannel) {
            this.b = msgFromChannel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnMsgSendPostponedNowAction(message=" + this.b + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class h extends ybb {
        public final long b;
        public final ChannelMsgSendConfig c;
        public final boolean d;
        public final boolean e;

        public h(long j, ChannelMsgSendConfig channelMsgSendConfig, boolean z, boolean z2) {
            this.b = j;
            this.c = channelMsgSendConfig;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && epx.f(this.c, hVar.c) && this.d == hVar.d && this.e == hVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnOpenPostSettingsAction(channelId=");
            sb.append(this.b);
            sb.append(", config=");
            sb.append(this.c);
            sb.append(", isEditMode=");
            sb.append(this.d);
            sb.append(", canPublishPost=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class i extends ybb {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 970911764;
        }

        public final String toString() {
            return "OnPause";
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class j extends ybb {
        public final ChannelMsgSendConfig b;
        public final boolean c;

        public j(ChannelMsgSendConfig channelMsgSendConfig, boolean z) {
            this.b = channelMsgSendConfig;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && this.c == jVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnPostSettingsUpdated(config=");
            sb.append(this.b);
            sb.append(", isSendMsgAfterUpdate=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class k extends ybb {
        public final MsgFromChannel b;
        public final ChannelMsgSendConfig c;

        public k(MsgFromChannel msgFromChannel, ChannelMsgSendConfig channelMsgSendConfig) {
            this.b = msgFromChannel;
            this.c = channelMsgSendConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "OnPostponedMsgRetryAction(msg=" + this.b + ", config=" + this.c + ')';
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class l extends ybb {
        public final Bundle b;

        public l(Bundle bundle) {
            this.b = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            Bundle bundle = this.b;
            if (bundle == null) {
                return 0;
            }
            return bundle.hashCode();
        }

        public final String toString() {
            return uf3.c(new StringBuilder("OnRestoreState(savedState="), this.b, ')');
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class m extends ybb {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 94388687;
        }

        public final String toString() {
            return "OnResume";
        }
    }

    /* compiled from: ChannelSendMsgViewAction.kt */
    public static final class n extends ybb {
        public final Bundle b;

        public n(Bundle bundle) {
            this.b = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return uf3.c(new StringBuilder("OnSaveState(outState="), this.b, ')');
        }
    }
}
