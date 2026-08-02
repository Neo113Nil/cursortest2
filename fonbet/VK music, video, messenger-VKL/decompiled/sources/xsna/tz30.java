package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.formatters.linkparser.LinkType;
import com.vk.im.ui.formatters.spans.dialogitem.MsgBodySpan;
import java.util.LinkedHashMap;

/* compiled from: MsgShortContentFormatter.kt */
/* loaded from: classes2.dex */
public final class tz30 implements pfj0 {
    public final com.vk.im.ui.formatters.a a;
    public final en30 b;
    public final com.vk.im.ui.formatters.b c;
    public final o040 d;

    public tz30(Context context) {
        this.a = new com.vk.im.ui.formatters.a(context);
        this.b = new en30(context);
        this.c = new com.vk.im.ui.formatters.b(context);
        new gdp();
        this.d = new o040();
    }

    public static SpannableStringBuilder c(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : null;
        return spannableStringBuilder == null ? new SpannableStringBuilder(charSequence) : spannableStringBuilder;
    }

    @Override // xsna.pfj0
    public final CharSequence a(com.vk.im.engine.models.messages.a aVar) {
        LinkType linkType = LinkType.TEL;
        String body = aVar.getBody();
        MsgTextFormat a4 = aVar.a4();
        o040 o040Var = this.d;
        CharSequence a = o040Var.a.a(body, a4);
        baz bazVar = o040Var.b;
        LinkedHashMap<LinkType, ij90> linkedHashMap = bazVar.c;
        ij90 ij90Var = linkedHashMap.get(linkType);
        if (ij90Var != null && ij90Var.a(a)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            ij90 ij90Var2 = linkedHashMap.get(linkType);
            if (ij90Var2 != null) {
                ij90Var2.b(spannableStringBuilder, bazVar.b, false);
            }
            baz.b(spannableStringBuilder, bazVar.a, (ohl[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, ohl.class));
            a = spannableStringBuilder;
        }
        o040Var.c.getClass();
        CharSequence i = ucp.i(a);
        if (i.length() > 0) {
            return ine0.q(i);
        }
        CharSequence c = this.a.c(aVar.K0());
        if (c.length() > 0) {
            return c;
        }
        String e = this.b.e(aVar);
        return e.length() > 0 ? e : "";
    }

    public final SpannableStringBuilder b(Msg msg, ProfilesSimpleInfo profilesSimpleInfo, Dialog dialog, UserId userId) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence b = this.a.b(msg);
        if (b.length() > 0) {
            SpannableStringBuilder c = c(b);
            com.vk.im.ui.formatters.spans.dialogitem.b.a(c, MsgBodySpan.Type.ATTACH_TEXT, 0, 6);
            spannableStringBuilder.append((CharSequence) c);
        }
        CharSequence a = this.c.a(msg, profilesSimpleInfo, dialog, userId);
        if (a.length() > 0) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            g2v.c().getClass();
            CharSequence a2 = o040.a(this.d, a, 14);
            if ((msg instanceof MsgFromUser) || (msg instanceof MsgFromChannel)) {
                spannableStringBuilder.append(a2);
            } else {
                SpannableStringBuilder c2 = c(a2);
                com.vk.im.ui.formatters.spans.dialogitem.b.a(c2, MsgBodySpan.Type.SECONDARY_TEXT, 0, 6);
                spannableStringBuilder.append((CharSequence) c2);
            }
        }
        if (spannableStringBuilder.length() == 0) {
            SpannableStringBuilder c3 = c(this.b.d(msg));
            com.vk.im.ui.formatters.spans.dialogitem.b.a(c3, MsgBodySpan.Type.SECONDARY_TEXT, 0, 6);
            spannableStringBuilder.append((CharSequence) c3);
        }
        return spannableStringBuilder;
    }
}
