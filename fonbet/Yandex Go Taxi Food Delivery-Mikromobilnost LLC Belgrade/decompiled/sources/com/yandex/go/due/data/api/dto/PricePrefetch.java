package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vye0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due/data/api/dto/PricePrefetch;", "", "Companion", "Type", "com/yandex/go/due/data/api/dto/g", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PricePrefetch {
    public static final g Companion = new g();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(5)), null};
    public final Type a;
    public final Boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/data/api/dto/PricePrefetch$Type;", "", "Companion", "com/yandex/go/due/data/api/dto/h", "DONE_BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final h Companion;
        public static final Type DONE_BUTTON;

        static {
            Type type = new Type("DONE_BUTTON", 0);
            DONE_BUTTON = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(6));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PricePrefetch(int i, Type type, Boolean bool) {
        this.a = (i & 1) == 0 ? null : type;
        if ((i & 2) == 0) {
            this.b = Boolean.FALSE;
        } else {
            this.b = bool;
        }
    }

    public PricePrefetch() {
        Boolean bool = Boolean.FALSE;
        this.a = null;
        this.b = bool;
    }
}
