package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes6.dex */
public final class mp8 {
    public static CardType a(String str) {
        Map map;
        String str2 = str == null ? "" : str;
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (evu0.J(str)) {
            return CardType.UNKNOWN;
        }
        map = CardType.intervalLookup;
        Set<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            Pair pair = (Pair) entry.getKey();
            CardType cardType = (CardType) entry.getValue();
            mp8 mp8Var = CardType.Companion;
            String str3 = (String) pair.c();
            String str4 = (String) pair.f();
            mp8Var.getClass();
            int length2 = sb2.length();
            int length3 = str3.length();
            if (length2 > length3) {
                length2 = length3;
            }
            int length4 = sb2.length();
            int length5 = str4.length();
            if (length4 > length5) {
                length4 = length5;
            }
            if (new BigInteger(sb2.substring(0, length2)).compareTo(new BigInteger(str3.substring(0, length2))) < 0 || new BigInteger(sb2.substring(0, length4)).compareTo(new BigInteger(str4.substring(0, length4))) > 0) {
                cardType = null;
            }
            if (cardType != null) {
                arrayList.add(cardType);
            }
        }
        Set M0 = a.M0(arrayList);
        return M0.size() > 1 ? CardType.INSUFFICIENT_DIGITS : M0.size() == 1 ? (CardType) a.O(M0) : CardType.UNKNOWN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static CardType b(String str) {
        String upperCase = str != null ? str.toUpperCase(Locale.ROOT) : "";
        switch (upperCase.hashCode()) {
            case -2048371625:
                if (upperCase.equals("DINERSCLUBCARTEBLANCHE")) {
                    return CardType.DINERSCLUB;
                }
                break;
            case -1776311499:
                if (upperCase.equals("UZCARD")) {
                    return CardType.UZCARD;
                }
                break;
            case -1553624974:
                if (upperCase.equals("MASTERCARD")) {
                    return CardType.MASTERCARD;
                }
                break;
            case -799687047:
                if (upperCase.equals("DISCOVERCARD")) {
                    return CardType.DISCOVER;
                }
                break;
            case 73257:
                if (upperCase.equals("JCB")) {
                    return CardType.JCB;
                }
                break;
            case 76342:
                if (upperCase.equals("MIR")) {
                    return CardType.MIR;
                }
                break;
            case 2358463:
                if (upperCase.equals("MAAL")) {
                    return CardType.MAAL;
                }
                break;
            case 2583784:
                if (upperCase.equals("TROY")) {
                    return CardType.TROY;
                }
                break;
            case 2634817:
                if (upperCase.equals("VISA")) {
                    return CardType.VISA;
                }
                break;
            case 232055600:
                if (upperCase.equals("AMERICANEXPRESS")) {
                    return CardType.AMEX;
                }
                break;
            case 486122361:
                if (upperCase.equals("UNIONPAY")) {
                    return CardType.UNIONPAY;
                }
                break;
            case 493599233:
                if (upperCase.equals("BELKART")) {
                    return CardType.BELKART;
                }
                break;
            case 910441480:
                if (upperCase.equals("DINACARD")) {
                    return CardType.DINACARD;
                }
                break;
            case 1336157951:
                if (upperCase.equals("HUMOCARD")) {
                    return CardType.HUMO;
                }
                break;
            case 1545480463:
                if (upperCase.equals("MAESTRO")) {
                    return CardType.MAESTRO;
                }
                break;
            case 2047660103:
                if (upperCase.equals("ELCART")) {
                    return CardType.ELCART;
                }
                break;
        }
        return CardType.UNKNOWN;
    }
}
