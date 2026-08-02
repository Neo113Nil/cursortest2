package xsna;

import android.content.Context;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: MsgNestedFormatter.kt */
/* loaded from: classes2.dex */
public final class en30 {
    public static final /* synthetic */ qcy<Object>[] c;
    public final Context a;
    public final wqo0 b = new wqo0(new sim(this, 22));

    /* compiled from: MsgNestedFormatter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NestedMsg.Type.values().length];
            try {
                iArr[NestedMsg.Type.FWD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NestedMsg.Type.REPLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(en30.class, "attachFormatter", "getAttachFormatter()Lcom/vk/im/ui/formatters/MsgAttachFormatter;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public en30(Context context) {
        this.a = context;
    }

    public final String a(int i) {
        if (i == 0) {
            return "";
        }
        Context context = this.a;
        return i != 1 ? context.getResources().getQuantityString(R.plurals.vkim_msg_fwd_multiple, i, Integer.valueOf(i)) : context.getString(R.string.vkim_msg_fwd_single);
    }

    public final String b(com.vk.im.engine.models.messages.a aVar, NestedMsg.Type type) {
        int S8 = aVar.S8(type);
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return a(S8);
        }
        if (i == 2) {
            return c(S8);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String c(int i) {
        if (i == 0) {
            return "";
        }
        Context context = this.a;
        return i != 1 ? context.getResources().getQuantityString(R.plurals.vkim_msg_reply_multiple, i, Integer.valueOf(i)) : context.getString(R.string.vkim_msg_reply_single);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String d(Msg msg) {
        return msg instanceof com.vk.im.engine.models.messages.a ? e((com.vk.im.engine.models.messages.a) msg) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String e(com.vk.im.engine.models.messages.a aVar) {
        if (aVar.db()) {
            return a(aVar.S8(NestedMsg.Type.FWD));
        }
        if (!aVar.p3()) {
            return "";
        }
        if (!aVar.da()) {
            return c(aVar.S8(NestedMsg.Type.REPLY));
        }
        StringBuilder sb = new StringBuilder();
        qcy<Object> qcyVar = c[0];
        wqo0 wqo0Var = this.b;
        wqo0Var.getClass();
        sb.append((Object) ((com.vk.im.ui.formatters.a) wqo0Var.get()).b((Msg) aVar));
        sb.append(' ');
        sb.append(this.a.getString(R.string.vkim_msg_reply_single));
        return sb.toString();
    }
}
