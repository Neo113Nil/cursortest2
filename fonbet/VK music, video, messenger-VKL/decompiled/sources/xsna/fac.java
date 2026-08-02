package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import java.util.Collections;
import xsna.tlo0;

/* compiled from: ChipActionButtonDisplayItemsFactory.kt */
/* loaded from: classes4.dex */
public final class fac {
    public final a2o a;

    public fac(a2o a2oVar) {
        this.a = a2oVar;
    }

    public final r74 a(NewsEntry newsEntry, NewsEntry newsEntry2, ActionButtonAttachment actionButtonAttachment) {
        String str = actionButtonAttachment.g;
        if (!actionButtonAttachment.Eb()) {
            r74 r74Var = new r74(348, actionButtonAttachment, newsEntry, newsEntry2);
            r74Var.h = (ol60) j5g.a0(Collections.singletonList(new iac(oq.d(tlo0.Companion, str), actionButtonAttachment)));
            return r74Var;
        }
        r74 r74Var2 = new r74(365, actionButtonAttachment, newsEntry, newsEntry2);
        bpn0 bpn0Var = new bpn0(new x84(8));
        String str2 = actionButtonAttachment.m;
        String str3 = str2 == null ? "" : str2;
        tlo0.h d = oq.d(tlo0.Companion, str);
        String str4 = actionButtonAttachment.n;
        r74Var2.h = (ol60) j5g.a0(Collections.singletonList(new uyn(((Boolean) bpn0Var.getValue()).booleanValue() ? this.a.parse(str3) : null, actionButtonAttachment, str3, str4 == null ? "" : str4, d)));
        return r74Var2;
    }
}
