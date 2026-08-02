package com.yandex.mob.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/mob/api/model/MobEnvironment;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PROD", "TESTING", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobEnvironment[] $VALUES;
    public static final MobEnvironment PROD;
    public static final MobEnvironment TESTING;
    private final String value;

    static {
        MobEnvironment mobEnvironment = new MobEnvironment("PROD", 0, "prod");
        PROD = mobEnvironment;
        MobEnvironment mobEnvironment2 = new MobEnvironment("TESTING", 1, "testing");
        TESTING = mobEnvironment2;
        MobEnvironment[] mobEnvironmentArr = {mobEnvironment, mobEnvironment2};
        $VALUES = mobEnvironmentArr;
        $ENTRIES = a.a(mobEnvironmentArr);
    }

    public MobEnvironment(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobEnvironment valueOf(String str) {
        return (MobEnvironment) Enum.valueOf(MobEnvironment.class, str);
    }

    public static MobEnvironment[] values() {
        return (MobEnvironment[]) $VALUES.clone();
    }
}
