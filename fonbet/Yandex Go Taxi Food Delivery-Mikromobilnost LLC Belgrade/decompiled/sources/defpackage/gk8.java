package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.contract.CardNetwork;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final class gk8 {
    public static final List c = scc.g(4, 10);
    public static final List d = scc.g(4, 8, 12);
    public final ek8 a;
    public final Map b;

    public gk8() {
        List g = scc.g(12, 13, 14, 15, 16, 17, 18, 19);
        EmptyList emptyList = EmptyList.a;
        List list = d;
        ek8 ek8Var = new ek8(3, emptyList, g, list);
        this.a = ek8Var;
        this.b = b.i(new Pair(CardNetwork.AMEX, new ek8(4, scc.g(new yj8("34", null), new yj8("37", null)), Collections.singletonList(15), c)), new Pair(CardNetwork.DISCOVER, new ek8(3, scc.g(new yj8("6011", null), new yj8("622126", "622925"), new yj8("644", "649"), new yj8("65", null)), Collections.singletonList(16), list)), new Pair(CardNetwork.JCB, new ek8(3, Collections.singletonList(new yj8("3528", "3589")), Collections.singletonList(16), list)), new Pair(CardNetwork.MAESTRO, new ek8(3, scc.g(new yj8("50", null), new yj8("56", "59"), new yj8("61", null), new yj8("63", null), new yj8("66", "69")), scc.g(12, 13, 14, 15, 16, 17, 18, 19), list)), new Pair(CardNetwork.MASTERCARD, new ek8(3, scc.g(new yj8("222100", "272099"), new yj8("51", "55")), Collections.singletonList(16), list)), new Pair(CardNetwork.MIR, new ek8(3, Collections.singletonList(new yj8("2200", "2204")), scc.g(16, 17, 18, 19), list)), new Pair(CardNetwork.UNIONPAY, new ek8(3, scc.g(new yj8("35", null), new yj8("62", null), new yj8("88", null)), scc.g(16, 17, 18, 19), list)), new Pair(CardNetwork.UZCARD, new ek8(3, scc.g(new yj8("860002", "860006"), new yj8("860008", "860009"), new yj8("860011", "860014"), new yj8("860020", null), new yj8("860030", "860031"), new yj8("860033", "860034"), new yj8("860038", null), new yj8("860043", null), new yj8("860048", "860051"), new yj8("860053", null), new yj8("860055", "860060")), Collections.singletonList(16), list)), new Pair(CardNetwork.VISA, new ek8(3, Collections.singletonList(new yj8("4", null)), scc.g(13, 16, 18, 19), list)), new Pair(CardNetwork.VISAELECTRON, new ek8(3, scc.g(new yj8("4026", null), new yj8("417500", null), new yj8("4405", null), new yj8("4508", null), new yj8("4844", null), new yj8("4913", null), new yj8("4917", null)), Collections.singletonList(16), list)), new Pair(CardNetwork.HUMOCARD, new ek8(3, Collections.singletonList(new yj8("9860", null)), scc.g(12, 13, 14, 15, 16, 17, 18, 19), list)), new Pair(CardNetwork.UNKNOWN, ek8Var));
    }
}
