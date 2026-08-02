package com.vkontakte.android.actionlinks;

import xsna.asp;
import xsna.gzs;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: BaseItem.kt */
/* loaded from: classes7.dex */
public class BaseItem {
    public final Type a;
    public gzs<s3q0> b;
    public gzs<s3q0> c;
    public boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ACTION_LINK;
        public static final Type ACTION_LINK_CARD;
        public static final Type ADD;
        public static final Type EMPTY;
        public static final Type GROUP;
        public static final Type HINT;
        public static final Type LINK;
        public static final Type TIP;
        public static final Type USER;

        static {
            Type type = new Type("LINK", 0);
            LINK = type;
            Type type2 = new Type("USER", 1);
            USER = type2;
            Type type3 = new Type("GROUP", 2);
            GROUP = type3;
            Type type4 = new Type("HINT", 3);
            HINT = type4;
            Type type5 = new Type("ADD", 4);
            ADD = type5;
            Type type6 = new Type("TIP", 5);
            TIP = type6;
            Type type7 = new Type("ACTION_LINK", 6);
            ACTION_LINK = type7;
            Type type8 = new Type("ACTION_LINK_CARD", 7);
            ACTION_LINK_CARD = type8;
            Type type9 = new Type("EMPTY", 8);
            EMPTY = type9;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public BaseItem() {
        throw null;
    }

    public BaseItem(Type type) {
        this.a = type;
        this.b = null;
        this.c = null;
        this.d = true;
    }
}
