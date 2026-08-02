package xsna;

import com.vk.dto.actionlinks.ActionLink;

/* compiled from: ChatActionLinkSnippetViewConfig.kt */
/* loaded from: classes7.dex */
public final class pmb {
    public int a;
    public final Object b;

    public pmb() {
        h0u[] h0uVarArr = new h0u[4];
        for (int i = 0; i < 4; i++) {
            h0uVarArr[i] = new h0u();
        }
        this.b = h0uVarArr;
    }

    public pmb(ActionLink actionLink, int i) {
        this.b = actionLink;
        this.a = i;
    }
}
