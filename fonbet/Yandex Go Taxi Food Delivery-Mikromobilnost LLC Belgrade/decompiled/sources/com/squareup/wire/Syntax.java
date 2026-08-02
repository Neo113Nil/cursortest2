package com.squareup.wire;

import defpackage.jl40;
import defpackage.k4o;
import defpackage.ny61;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/squareup/wire/Syntax;", "", "string", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PROTO_2", "PROTO_3", "toString", "Companion", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Syntax {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Syntax[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Syntax PROTO_2 = new Syntax("PROTO_2", 0, "proto2");
    public static final Syntax PROTO_3 = new Syntax("PROTO_3", 1, "proto3");
    private final String string;

    private static final /* synthetic */ Syntax[] $values() {
        return new Syntax[]{PROTO_2, PROTO_3};
    }

    static {
        Syntax[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
    }

    private Syntax(String str, int i, String str2) {
        this.string = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Syntax valueOf(String str) {
        return (Syntax) Enum.valueOf(Syntax.class, str);
    }

    public static Syntax[] values() {
        return (Syntax[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.string;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002¨\u0006\b"}, d2 = {"Lcom/squareup/wire/Syntax$Companion;", "", "<init>", "()V", "get", "Lcom/squareup/wire/Syntax;", "string", "", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Syntax get(String string) {
            for (Syntax syntax : Syntax.values()) {
                if (jl40.l(syntax.string, string)) {
                    return syntax;
                }
            }
            ny61.g("unexpected syntax: ".concat(string));
            return null;
        }

        private Companion() {
        }
    }
}
