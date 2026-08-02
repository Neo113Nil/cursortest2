package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: MsgFtsFormatter.kt */
/* loaded from: classes2.dex */
public final class zi30 {
    public static final zi30 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final wqo0 c;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(zi30.class, "strBuilder", "getStrBuilder()Ljava/lang/StringBuilder;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new zi30();
        c = new wqo0(new com.vk.movika.sdk.base.ui.g0(28));
    }

    public static void a(StringBuilder sb, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) it.next();
            sb.append(aVar.getBody().toLowerCase(Locale.ROOT));
            sb.append(' ');
            a(sb, aVar.q7());
        }
    }

    public static StringBuilder b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        return (StringBuilder) wqo0Var.get();
    }
}
