package com.yandex.messaging;

import com.yandex.messaging.auth.AuthEnvironment;
import defpackage.k120;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/messaging/MessengerEnvironment;", "", "k120", "TESTING", "ALPHA", "PRODUCTION", "TESTING_TEAM", "ALPHA_TEAM", "PRODUCTION_TEAM", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class MessengerEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessengerEnvironment[] $VALUES;
    public static final MessengerEnvironment ALPHA;
    public static final MessengerEnvironment ALPHA_TEAM;
    public static final MessengerEnvironment PRODUCTION;
    public static final MessengerEnvironment PRODUCTION_TEAM;
    public static final MessengerEnvironment TESTING;
    public static final MessengerEnvironment TESTING_TEAM;

    static {
        MessengerEnvironment messengerEnvironment = new MessengerEnvironment() { // from class: com.yandex.messaging.MessengerEnvironment.TESTING
            private final boolean isModerated = true;

            @Override // com.yandex.messaging.MessengerEnvironment
            public final AuthEnvironment a() {
                return AuthEnvironment.Testing;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String b() {
                return "https://passport-test.yandex.ru";
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final Object c(k120 k120Var) {
                return k120Var.o();
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            /* renamed from: f, reason: from getter */
            public final boolean getIsModerated() {
                return this.isModerated;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String g() {
                return "https://pay-test.mail.yandex.ru/transaction/%s";
            }
        };
        TESTING = messengerEnvironment;
        MessengerEnvironment messengerEnvironment2 = new MessengerEnvironment() { // from class: com.yandex.messaging.MessengerEnvironment.ALPHA
            private final boolean isModerated = true;

            @Override // com.yandex.messaging.MessengerEnvironment
            public final AuthEnvironment a() {
                return AuthEnvironment.Production;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final Object c(k120 k120Var) {
                return k120Var.m();
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            /* renamed from: f, reason: from getter */
            public final boolean getIsModerated() {
                return this.isModerated;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String g() {
                return "https://pay-test.mail.yandex.ru/transaction/%s";
            }
        };
        ALPHA = messengerEnvironment2;
        MessengerEnvironment messengerEnvironment3 = new MessengerEnvironment() { // from class: com.yandex.messaging.MessengerEnvironment.PRODUCTION
            private final boolean isModerated = true;

            @Override // com.yandex.messaging.MessengerEnvironment
            public final AuthEnvironment a() {
                return AuthEnvironment.Production;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final Object c(k120 k120Var) {
                return k120Var.j();
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            /* renamed from: f, reason: from getter */
            public final boolean getIsModerated() {
                return this.isModerated;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String g() {
                return "https://pay.yandex.ru/transaction/%s";
            }
        };
        PRODUCTION = messengerEnvironment3;
        MessengerEnvironment messengerEnvironment4 = new MessengerEnvironment() { // from class: com.yandex.messaging.MessengerEnvironment.TESTING_TEAM
            private final boolean isModerated;

            @Override // com.yandex.messaging.MessengerEnvironment
            public final AuthEnvironment a() {
                return AuthEnvironment.TeamProduction;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String b() {
                return "https://passport-test.yandex-team.ru";
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final Object c(k120 k120Var) {
                return k120Var.l();
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            /* renamed from: f, reason: from getter */
            public final boolean getIsModerated() {
                return this.isModerated;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String g() {
                return "https://pay-test.mail.yandex.ru/transaction/%s";
            }
        };
        TESTING_TEAM = messengerEnvironment4;
        MessengerEnvironment messengerEnvironment5 = new MessengerEnvironment() { // from class: com.yandex.messaging.MessengerEnvironment.ALPHA_TEAM
            private final boolean isModerated;

            @Override // com.yandex.messaging.MessengerEnvironment
            public final AuthEnvironment a() {
                return AuthEnvironment.TeamProduction;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String b() {
                return "https://passport.yandex-team.ru";
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final Object c(k120 k120Var) {
                return k120Var.s();
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            /* renamed from: f, reason: from getter */
            public final boolean getIsModerated() {
                return this.isModerated;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String g() {
                return "https://pay-test.mail.yandex.ru/transaction/%s";
            }
        };
        ALPHA_TEAM = messengerEnvironment5;
        MessengerEnvironment messengerEnvironment6 = new MessengerEnvironment() { // from class: com.yandex.messaging.MessengerEnvironment.PRODUCTION_TEAM
            private final boolean isModerated;

            @Override // com.yandex.messaging.MessengerEnvironment
            public final AuthEnvironment a() {
                return AuthEnvironment.TeamProduction;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String b() {
                return "https://passport.yandex-team.ru";
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final Object c(k120 k120Var) {
                return k120Var.k();
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            /* renamed from: f, reason: from getter */
            public final boolean getIsModerated() {
                return this.isModerated;
            }

            @Override // com.yandex.messaging.MessengerEnvironment
            public final String g() {
                return "https://pay.yandex.ru/transaction/%s";
            }
        };
        PRODUCTION_TEAM = messengerEnvironment6;
        MessengerEnvironment[] messengerEnvironmentArr = {messengerEnvironment, messengerEnvironment2, messengerEnvironment3, messengerEnvironment4, messengerEnvironment5, messengerEnvironment6};
        $VALUES = messengerEnvironmentArr;
        $ENTRIES = kotlin.enums.a.a(messengerEnvironmentArr);
    }

    public static MessengerEnvironment valueOf(String str) {
        return (MessengerEnvironment) Enum.valueOf(MessengerEnvironment.class, str);
    }

    public static MessengerEnvironment[] values() {
        return (MessengerEnvironment[]) $VALUES.clone();
    }

    public abstract AuthEnvironment a();

    public String b() {
        return "https://passport.yandex.ru";
    }

    public abstract Object c(k120 k120Var);

    /* renamed from: f */
    public abstract boolean getIsModerated();

    public abstract String g();
}
