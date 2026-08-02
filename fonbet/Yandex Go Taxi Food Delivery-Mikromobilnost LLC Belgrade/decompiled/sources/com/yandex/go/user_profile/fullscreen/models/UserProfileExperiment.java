package com.yandex.go.user_profile.fullscreen.models;

import defpackage.c6z;
import defpackage.gn11;
import defpackage.gs21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.w511;
import defpackage.w96;
import defpackage.xvz;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment;", "Lw96;", "Lc6z;", "Companion", "UserProfileStatusParams", "com/yandex/go/user_profile/fullscreen/models/f", "fs21", "Type", "LogoutButtonParams", "com/yandex/go/user_profile/fullscreen/models/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UserProfileExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] h;
    public static final UserProfileExperiment i;
    public final String b;
    public final List c;
    public final Type d;
    public final LogoutButtonParams e;
    public final boolean f;
    public final Map g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment$Type;", "", "Companion", "com/yandex/go/user_profile/fullscreen/models/g", "WEB", "NATIVE", "AM", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Type AM;
        public static final g Companion;
        public static final Type NATIVE;
        public static final Type UNKNOWN;
        public static final Type WEB;

        static {
            Type type = new Type("WEB", 0);
            WEB = type;
            Type type2 = new Type("NATIVE", 1);
            NATIVE = type2;
            Type type3 = new Type("AM", 2);
            AM = type3;
            Type type4 = new Type("UNKNOWN", 3);
            UNKNOWN = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(0));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new gn11(24)), kotlin.a.b(lazyThreadSafetyMode, new gn11(25)), null, null, kotlin.a.b(lazyThreadSafetyMode, new gn11(26))};
        i = new UserProfileExperiment(0);
    }

    public UserProfileExperiment(int i2, String str, List list, Type type, LogoutButtonParams logoutButtonParams, boolean z, Map map) {
        this.b = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i2 & 4) == 0) {
            this.d = Type.UNKNOWN;
        } else {
            this.d = type;
        }
        if ((i2 & 8) == 0) {
            LogoutButtonParams.Companion.getClass();
            this.e = LogoutButtonParams.c;
        } else {
            this.e = logoutButtonParams;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i2 & 32) == 0) {
            this.g = kotlin.collections.b.f();
        } else {
            this.g = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileExperiment)) {
            return false;
        }
        UserProfileExperiment userProfileExperiment = (UserProfileExperiment) obj;
        return jl40.l(this.b, userProfileExperiment.b) && jl40.l(this.c, userProfileExperiment.c) && this.d == userProfileExperiment.d && jl40.l(this.e, userProfileExperiment.e) && this.f == userProfileExperiment.f && jl40.l(this.g, userProfileExperiment.g);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.g;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.f;
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.e((this.e.hashCode() + ((this.d.hashCode() + unr0.c(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31, 31, this.f);
    }

    public final boolean i() {
        Type type = Type.UNKNOWN;
        Type type2 = this.d;
        if (type2 == type) {
            boolean z = this.f;
            if (z) {
                type2 = Type.WEB;
            } else {
                if (z) {
                    w511.b();
                    return false;
                }
                type2 = Type.NATIVE;
            }
        }
        int i2 = i.a[type2.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        w511.b();
        return false;
    }

    public final String toString() {
        StringBuilder r = xvz.r("UserProfileExperiment(profileLink=", this.b, ", statuses=", this.c, ", type=");
        r.append(this.d);
        r.append(", logoutParams=");
        r.append(this.e);
        r.append(", enabled=");
        r.append(this.f);
        r.append(", l10n=");
        r.append(this.g);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment$LogoutButtonParams;", "", "Companion", "com/yandex/go/user_profile/fullscreen/models/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LogoutButtonParams {
        public static final b Companion = new b();
        public static final LogoutButtonParams c = new LogoutButtonParams(0);
        public final boolean a;
        public final String b;

        public /* synthetic */ LogoutButtonParams(int i, String str, boolean z) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public LogoutButtonParams(int i) {
            this.a = false;
            this.b = "";
        }

        public LogoutButtonParams() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment$UserProfileStatusParams;", "", "Companion", "$serializer", "com/yandex/go/user_profile/fullscreen/models/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class UserProfileStatusParams {
        public static final h Companion = new h();
        public final String a;
        public final FormattedText b;
        public final f c;

        public /* synthetic */ UserProfileStatusParams(int i, String str, FormattedText formattedText, f fVar) {
            this.a = (i & 1) == 0 ? "fallback_status" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = e.INSTANCE;
            } else {
                this.c = fVar;
            }
        }

        public UserProfileStatusParams() {
            FormattedText formattedText = FormattedText.c;
            e eVar = e.INSTANCE;
            this.a = "fallback_status";
            this.b = formattedText;
            this.c = eVar;
        }
    }

    public UserProfileExperiment() {
        this(0);
    }

    public UserProfileExperiment(String str, List list, Type type, LogoutButtonParams logoutButtonParams, boolean z, Map map) {
        this.b = str;
        this.c = list;
        this.d = type;
        this.e = logoutButtonParams;
        this.f = z;
        this.g = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserProfileExperiment(int i2) {
        this("", EmptyList.a, r3, LogoutButtonParams.c, false, kotlin.collections.b.f());
        Type type = Type.UNKNOWN;
        LogoutButtonParams.Companion.getClass();
    }
}
