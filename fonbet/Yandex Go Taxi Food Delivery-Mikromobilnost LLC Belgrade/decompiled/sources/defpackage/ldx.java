package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class ldx implements SerialDescriptor {
    public static final ldx b = new ldx();
    public static final String c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ i8u a;

    public ldx() {
        auu0 auu0Var = auu0.a;
        this.a = new i8u("kotlin.collections.LinkedHashMap", auu0.b, rcx.a.getDescriptor());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        return this.a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return this.a.d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        this.a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        this.a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        this.a.g(i);
        return EmptyList.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.a.getClass();
        return EmptyList.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final jl40 getKind() {
        this.a.getClass();
        return ovu0.i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        this.a.i(i);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.a.getClass();
        return false;
    }
}
