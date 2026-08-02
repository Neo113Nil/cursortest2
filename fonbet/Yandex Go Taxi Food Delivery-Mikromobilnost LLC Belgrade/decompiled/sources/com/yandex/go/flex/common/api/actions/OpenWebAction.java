package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kr;
import defpackage.kz60;
import defpackage.qje;
import defpackage.y570;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/OpenWebAction;", "Lkr;", "Companion", "WebCallback", "AuthType", "$serializer", "com/yandex/go/flex/common/api/actions/g0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OpenWebAction extends kr {
    public static final g0 Companion = new g0();
    public static final i3y[] e;
    public final String a;
    public final AuthType b;
    public final List c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/OpenWebAction$AuthType;", "", "Companion", "com/yandex/go/flex/common/api/actions/f0", "TOKEN", "COOKIES", "NO_AUTH", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class AuthType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AuthType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final AuthType COOKIES;
        public static final f0 Companion;
        public static final AuthType NO_AUTH;
        public static final AuthType TOKEN;

        static {
            AuthType authType = new AuthType("TOKEN", 0);
            TOKEN = authType;
            AuthType authType2 = new AuthType("COOKIES", 1);
            COOKIES = authType2;
            AuthType authType3 = new AuthType("NO_AUTH", 2);
            NO_AUTH = authType3;
            AuthType[] authTypeArr = {authType, authType2, authType3};
            $VALUES = authTypeArr;
            $ENTRIES = kotlin.enums.a.a(authTypeArr);
            Companion = new f0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(18));
        }

        public static AuthType valueOf(String str) {
            return (AuthType) Enum.valueOf(AuthType.class, str);
        }

        public static AuthType[] values() {
            return (AuthType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/OpenWebAction$WebCallback;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/h0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class WebCallback {
        public static final h0 Companion = new h0();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(19))};
        public final String a;
        public final kr b;

        public /* synthetic */ WebCallback(int i, String str, kr krVar) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, OpenWebAction$WebCallback$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = krVar;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new kz60(7)), kotlin.a.b(lazyThreadSafetyMode, new kz60(8)), null};
    }

    public /* synthetic */ OpenWebAction(int i, String str, AuthType authType, List list, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = AuthType.TOKEN;
        } else {
            this.b = authType;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
    }

    public OpenWebAction() {
        AuthType authType = AuthType.TOKEN;
        this.a = "";
        this.b = authType;
        this.c = EmptyList.a;
        this.d = true;
    }
}
