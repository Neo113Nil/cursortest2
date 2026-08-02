package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final class hk8 {
    public static final fk8 c;
    public static final Map d;
    public final fk8 a;
    public final LinkedHashMap b;

    static {
        List g = scc.g(4, 10);
        List g2 = scc.g(4, 8, 12);
        fk8 fk8Var = new fk8(3, EmptyList.a, scc.g(12, 13, 14, 15, 16, 17, 18, 19), g2);
        c = fk8Var;
        d = b.i(new Pair(CardNetwork.AMEX, new fk8(4, scc.g(new zj8("34", null), new zj8("37", null)), Collections.singletonList(15), g)), new Pair(CardNetwork.DISCOVER, new fk8(3, scc.g(new zj8("6011", null), new zj8("622126", "622925"), new zj8("644", "649"), new zj8("65", null)), Collections.singletonList(16), g2)), new Pair(CardNetwork.JCB, new fk8(3, Collections.singletonList(new zj8("3528", "3589")), Collections.singletonList(16), g2)), new Pair(CardNetwork.MAESTRO, new fk8(3, scc.g(new zj8("50", null), new zj8("56", "59"), new zj8("61", null), new zj8("63", null), new zj8("66", "69")), scc.g(12, 13, 14, 15, 16, 17, 18, 19), g2)), new Pair(CardNetwork.MASTERCARD, new fk8(3, scc.g(new zj8("222100", "272099"), new zj8("51", "55")), Collections.singletonList(16), g2)), new Pair(CardNetwork.MIR, new fk8(3, Collections.singletonList(new zj8("2200", "2204")), scc.g(16, 17, 18, 19), g2)), new Pair(CardNetwork.UNIONPAY, new fk8(3, scc.g(new zj8("35", null), new zj8("62", null), new zj8("88", null)), scc.g(16, 17, 18, 19), g2)), new Pair(CardNetwork.UZCARD, new fk8(3, scc.g(new zj8("860002", "860006"), new zj8("860008", "860009"), new zj8("860011", "860014"), new zj8("860020", null), new zj8("860030", "860031"), new zj8("860033", "860034"), new zj8("860038", null), new zj8("860043", null), new zj8("860048", "860051"), new zj8("860053", null), new zj8("860055", "860060")), Collections.singletonList(16), g2)), new Pair(CardNetwork.VISA, new fk8(3, Collections.singletonList(new zj8("4", null)), scc.g(13, 16, 18, 19), g2)), new Pair(CardNetwork.VISAELECTRON, new fk8(3, scc.g(new zj8("4026", null), new zj8("417500", null), new zj8("4405", null), new zj8("4508", null), new zj8("4844", null), new zj8("4913", null), new zj8("4917", null)), Collections.singletonList(16), g2)), new Pair(CardNetwork.HUMOCARD, new fk8(3, Collections.singletonList(new zj8("9860", null)), scc.g(12, 13, 14, 15, 16, 17, 18, 19), g2)), new Pair(CardNetwork.UNKNOWN, fk8Var));
    }

    public hk8(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((CardNetwork) entry.getKey(), (fk8) entry.getValue());
        }
        fk8 fk8Var = (fk8) linkedHashMap.get(CardNetwork.UNKNOWN);
        this.a = fk8Var == null ? c : fk8Var;
        this.b = linkedHashMap;
    }

    public hk8() {
        this(0);
    }

    public /* synthetic */ hk8(int i) {
        this(b.f());
    }
}
