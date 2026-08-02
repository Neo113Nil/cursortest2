package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;

/* loaded from: classes10.dex */
public final class lt1 implements pp0 {
    public final pp0 a;
    public final l83 b;

    public lt1(pp0 pp0Var, l83 l83Var) {
        this.a = pp0Var;
        this.b = l83Var;
    }

    @Override // yads.pp0
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // yads.pp0
    public final int b(int i) {
        return this.a.b(i);
    }

    @Override // yads.pp0
    public final nx0 c() {
        return this.a.c();
    }

    @Override // yads.pp0
    public final int d() {
        return this.a.d();
    }

    @Override // yads.pp0
    public final void disable() {
        this.a.disable();
    }

    @Override // yads.pp0
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt1)) {
            return false;
        }
        lt1 lt1Var = (lt1) obj;
        return this.a.equals(lt1Var.a) && this.b.equals(lt1Var.b);
    }

    @Override // yads.pp0
    public final int f() {
        return this.a.f();
    }

    @Override // yads.pp0
    public final Object g() {
        return this.a.g();
    }

    @Override // yads.pp0
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.pp0
    public final void i() {
        this.a.i();
    }

    @Override // yads.pp0
    public final void a() {
        this.a.a();
    }

    @Override // yads.pp0
    public final l83 b() {
        return this.b;
    }

    @Override // yads.pp0
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // yads.pp0
    public final int a(long j, List list) {
        return this.a.a(j, list);
    }

    @Override // yads.pp0
    public final boolean b(int i, long j) {
        return this.a.b(i, j);
    }

    @Override // yads.pp0
    public final nx0 a(int i) {
        return this.a.a(i);
    }

    @Override // yads.pp0
    public final int a(nx0 nx0Var) {
        return this.a.a(nx0Var);
    }

    @Override // yads.pp0
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // yads.pp0
    public final void a(float f) {
        this.a.a(f);
    }

    @Override // yads.pp0
    public final boolean a(long j, cu cuVar, List list) {
        return this.a.a(j, cuVar, list);
    }

    @Override // yads.pp0
    public final void a(long j, long j2, long j3, List list, zk1[] zk1VarArr) {
        this.a.a(j, j2, j3, list, zk1VarArr);
    }
}
