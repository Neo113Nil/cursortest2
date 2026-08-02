package xsna;

import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ProfileNameSpannableFormatter.kt */
/* loaded from: classes2.dex */
public final class qyd0 {
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(qyd0.class, "nameFormatter", "getNameFormatter()Lcom/vk/im/ui/formatters/DisplayNameFormatter;", 0), b09.a(0, qyd0.class, "emojiFormatter", "getEmojiFormatter()Lcom/vk/im/ui/formatters/EmojiFormatter;", fpf0.a)};
    public static final qyd0 a = new qyd0();
    public static final wqo0 c = new wqo0(new ia90(4));
    public static final wqo0 d = new wqo0(new nh(24));
    public static final ConcurrentHashMap<qtd0, CharSequence> e = new ConcurrentHashMap<>();

    public static CharSequence a(qtd0 qtd0Var) {
        if (qtd0Var == null) {
            return "…";
        }
        ConcurrentHashMap<qtd0, CharSequence> concurrentHashMap = e;
        CharSequence charSequence = concurrentHashMap.get(qtd0Var);
        if (charSequence == null) {
            a.getClass();
            qcy<Object>[] qcyVarArr = b;
            qcy<Object> qcyVar = qcyVarArr[1];
            wqo0 wqo0Var = d;
            wqo0Var.getClass();
            gdp gdpVar = (gdp) wqo0Var.get();
            qcy<Object> qcyVar2 = qcyVarArr[0];
            wqo0 wqo0Var2 = c;
            wqo0Var2.getClass();
            DisplayNameFormatter displayNameFormatter = (DisplayNameFormatter) wqo0Var2.get();
            displayNameFormatter.getClass();
            String e2 = displayNameFormatter.e(qtd0Var, UserNameCase.NOM);
            gdpVar.getClass();
            charSequence = gdp.a(e2);
            CharSequence putIfAbsent = concurrentHashMap.putIfAbsent(qtd0Var, charSequence);
            if (putIfAbsent != null) {
                charSequence = putIfAbsent;
            }
        }
        return charSequence;
    }
}
