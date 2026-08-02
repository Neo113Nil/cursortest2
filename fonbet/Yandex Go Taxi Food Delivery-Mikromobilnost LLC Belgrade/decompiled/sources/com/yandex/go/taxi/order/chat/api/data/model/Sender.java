package com.yandex.go.taxi.order.chat.api.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xiq0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/Sender;", "", "Companion", "Role", "com/yandex/go/taxi/order/chat/api/data/model/g", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Sender {
    public static final g Companion = new g();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(11))};
    public static final Sender d = new Sender("", Role.UNKNOWN);
    public static final i3y e = kotlin.a.a(new xiq0(12));
    public final String a;
    public final Role b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/Sender$Role;", "", "Companion", "com/yandex/go/taxi/order/chat/api/data/model/h", "CLIENT", "DRIVER", "SYSTEM", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Role {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Role[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Role CLIENT;
        public static final h Companion;
        public static final Role DRIVER;
        public static final Role SYSTEM;
        public static final Role UNKNOWN;

        static {
            Role role = new Role("CLIENT", 0);
            CLIENT = role;
            Role role2 = new Role("DRIVER", 1);
            DRIVER = role2;
            Role role3 = new Role("SYSTEM", 2);
            SYSTEM = role3;
            Role role4 = new Role("UNKNOWN", 3);
            UNKNOWN = role4;
            Role[] roleArr = {role, role2, role3, role4};
            $VALUES = roleArr;
            $ENTRIES = kotlin.enums.a.a(roleArr);
            Companion = new h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(13));
        }

        public static Role valueOf(String str) {
            return (Role) Enum.valueOf(Role.class, str);
        }

        public static Role[] values() {
            return (Role[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Sender(int i, String str, Role role) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = Role.UNKNOWN;
        } else {
            this.b = role;
        }
    }

    public final String toString() {
        return "Sender(nickname=" + this.a + ", role=" + this.b + Extension.C_BRAKE;
    }

    public Sender(String str, Role role) {
        this.a = str;
        this.b = role;
    }

    public Sender() {
        this(null, Role.UNKNOWN);
    }
}
