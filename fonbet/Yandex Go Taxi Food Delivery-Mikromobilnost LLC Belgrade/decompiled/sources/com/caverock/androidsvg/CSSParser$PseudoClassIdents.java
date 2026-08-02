package com.caverock.androidsvg;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class CSSParser$PseudoClassIdents {
    private static final /* synthetic */ CSSParser$PseudoClassIdents[] $VALUES;
    public static final CSSParser$PseudoClassIdents UNSUPPORTED;
    public static final CSSParser$PseudoClassIdents active;
    private static final Map<String, CSSParser$PseudoClassIdents> cache;
    public static final CSSParser$PseudoClassIdents checked;
    public static final CSSParser$PseudoClassIdents disabled;
    public static final CSSParser$PseudoClassIdents empty;
    public static final CSSParser$PseudoClassIdents enabled;
    public static final CSSParser$PseudoClassIdents first_child;
    public static final CSSParser$PseudoClassIdents first_of_type;
    public static final CSSParser$PseudoClassIdents focus;
    public static final CSSParser$PseudoClassIdents hover;
    public static final CSSParser$PseudoClassIdents indeterminate;
    public static final CSSParser$PseudoClassIdents lang;
    public static final CSSParser$PseudoClassIdents last_child;
    public static final CSSParser$PseudoClassIdents last_of_type;
    public static final CSSParser$PseudoClassIdents link;
    public static final CSSParser$PseudoClassIdents not;
    public static final CSSParser$PseudoClassIdents nth_child;
    public static final CSSParser$PseudoClassIdents nth_last_child;
    public static final CSSParser$PseudoClassIdents nth_last_of_type;
    public static final CSSParser$PseudoClassIdents nth_of_type;
    public static final CSSParser$PseudoClassIdents only_child;
    public static final CSSParser$PseudoClassIdents only_of_type;
    public static final CSSParser$PseudoClassIdents root;
    public static final CSSParser$PseudoClassIdents target;
    public static final CSSParser$PseudoClassIdents visited;

    static {
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents = new CSSParser$PseudoClassIdents("target", 0);
        target = cSSParser$PseudoClassIdents;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents2 = new CSSParser$PseudoClassIdents("root", 1);
        root = cSSParser$PseudoClassIdents2;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents3 = new CSSParser$PseudoClassIdents("nth_child", 2);
        nth_child = cSSParser$PseudoClassIdents3;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents4 = new CSSParser$PseudoClassIdents("nth_last_child", 3);
        nth_last_child = cSSParser$PseudoClassIdents4;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents5 = new CSSParser$PseudoClassIdents("nth_of_type", 4);
        nth_of_type = cSSParser$PseudoClassIdents5;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents6 = new CSSParser$PseudoClassIdents("nth_last_of_type", 5);
        nth_last_of_type = cSSParser$PseudoClassIdents6;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents7 = new CSSParser$PseudoClassIdents("first_child", 6);
        first_child = cSSParser$PseudoClassIdents7;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents8 = new CSSParser$PseudoClassIdents("last_child", 7);
        last_child = cSSParser$PseudoClassIdents8;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents9 = new CSSParser$PseudoClassIdents("first_of_type", 8);
        first_of_type = cSSParser$PseudoClassIdents9;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents10 = new CSSParser$PseudoClassIdents("last_of_type", 9);
        last_of_type = cSSParser$PseudoClassIdents10;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents11 = new CSSParser$PseudoClassIdents("only_child", 10);
        only_child = cSSParser$PseudoClassIdents11;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents12 = new CSSParser$PseudoClassIdents("only_of_type", 11);
        only_of_type = cSSParser$PseudoClassIdents12;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents13 = new CSSParser$PseudoClassIdents("empty", 12);
        empty = cSSParser$PseudoClassIdents13;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents14 = new CSSParser$PseudoClassIdents("not", 13);
        not = cSSParser$PseudoClassIdents14;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents15 = new CSSParser$PseudoClassIdents("lang", 14);
        lang = cSSParser$PseudoClassIdents15;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents16 = new CSSParser$PseudoClassIdents("link", 15);
        link = cSSParser$PseudoClassIdents16;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents17 = new CSSParser$PseudoClassIdents("visited", 16);
        visited = cSSParser$PseudoClassIdents17;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents18 = new CSSParser$PseudoClassIdents("hover", 17);
        hover = cSSParser$PseudoClassIdents18;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents19 = new CSSParser$PseudoClassIdents(ClidProvider.APP_ACTIVE, 18);
        active = cSSParser$PseudoClassIdents19;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents20 = new CSSParser$PseudoClassIdents("focus", 19);
        focus = cSSParser$PseudoClassIdents20;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents21 = new CSSParser$PseudoClassIdents(BackendConfig.Restrictions.ENABLED, 20);
        enabled = cSSParser$PseudoClassIdents21;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents22 = new CSSParser$PseudoClassIdents(BackendConfig.Restrictions.DISABLED, 21);
        disabled = cSSParser$PseudoClassIdents22;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents23 = new CSSParser$PseudoClassIdents("checked", 22);
        checked = cSSParser$PseudoClassIdents23;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents24 = new CSSParser$PseudoClassIdents("indeterminate", 23);
        indeterminate = cSSParser$PseudoClassIdents24;
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents25 = new CSSParser$PseudoClassIdents("UNSUPPORTED", 24);
        UNSUPPORTED = cSSParser$PseudoClassIdents25;
        $VALUES = new CSSParser$PseudoClassIdents[]{cSSParser$PseudoClassIdents, cSSParser$PseudoClassIdents2, cSSParser$PseudoClassIdents3, cSSParser$PseudoClassIdents4, cSSParser$PseudoClassIdents5, cSSParser$PseudoClassIdents6, cSSParser$PseudoClassIdents7, cSSParser$PseudoClassIdents8, cSSParser$PseudoClassIdents9, cSSParser$PseudoClassIdents10, cSSParser$PseudoClassIdents11, cSSParser$PseudoClassIdents12, cSSParser$PseudoClassIdents13, cSSParser$PseudoClassIdents14, cSSParser$PseudoClassIdents15, cSSParser$PseudoClassIdents16, cSSParser$PseudoClassIdents17, cSSParser$PseudoClassIdents18, cSSParser$PseudoClassIdents19, cSSParser$PseudoClassIdents20, cSSParser$PseudoClassIdents21, cSSParser$PseudoClassIdents22, cSSParser$PseudoClassIdents23, cSSParser$PseudoClassIdents24, cSSParser$PseudoClassIdents25};
        cache = new HashMap();
        for (CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents26 : values()) {
            if (cSSParser$PseudoClassIdents26 != UNSUPPORTED) {
                cache.put(cSSParser$PseudoClassIdents26.name().replace('_', LicenseUtility.SEPARATOR), cSSParser$PseudoClassIdents26);
            }
        }
    }

    public static CSSParser$PseudoClassIdents a(String str) {
        CSSParser$PseudoClassIdents cSSParser$PseudoClassIdents = cache.get(str);
        return cSSParser$PseudoClassIdents != null ? cSSParser$PseudoClassIdents : UNSUPPORTED;
    }

    public static CSSParser$PseudoClassIdents valueOf(String str) {
        return (CSSParser$PseudoClassIdents) Enum.valueOf(CSSParser$PseudoClassIdents.class, str);
    }

    public static CSSParser$PseudoClassIdents[] values() {
        return (CSSParser$PseudoClassIdents[]) $VALUES.clone();
    }
}
