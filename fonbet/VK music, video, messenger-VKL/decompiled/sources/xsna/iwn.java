package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.tlo0;

/* compiled from: DonutActionButtonRedesignedHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class iwn implements gn60<ActionButtonAttachment, wm60> {
    public final a2o b;
    public final bpn0 c = new bpn0(new cj4(17));

    public iwn(a2o a2oVar) {
        this.b = a2oVar;
    }

    public final List a(ActionButtonAttachment actionButtonAttachment) {
        String str = actionButtonAttachment.m;
        String str2 = str == null ? "" : str;
        tlo0.h d = oq.d(tlo0.Companion, actionButtonAttachment.g);
        DonutPriceTemplate parse = ((Boolean) this.c.getValue()).booleanValue() ? this.b.parse(str2) : null;
        String str3 = actionButtonAttachment.n;
        return Collections.singletonList(new jwn(parse, actionButtonAttachment, str2, str3 == null ? "" : str3, d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((ActionButtonAttachment) pair);
    }
}
