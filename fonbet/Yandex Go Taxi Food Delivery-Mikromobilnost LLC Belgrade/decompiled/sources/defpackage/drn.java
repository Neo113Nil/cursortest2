package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes10.dex */
public final class drn extends arn {
    public final /* synthetic */ int f;
    public final ern g;

    public drn(boolean z, ern ernVar, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.a = z;
                this.g = ernVar;
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                ernVar.d(allocate, 16L);
                ernVar.c(32L, allocate, 8);
                this.b = allocate.getLong();
                ernVar.c(40L, allocate, 8);
                this.c = allocate.getLong();
                this.d = ernVar.d(allocate, 54L);
                this.e = ernVar.d(allocate, 56L);
                ernVar.d(allocate, 58L);
                ernVar.d(allocate, 60L);
                ernVar.d(allocate, 62L);
                break;
            default:
                this.a = z;
                this.g = ernVar;
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                ernVar.d(allocate2, 16L);
                this.b = ernVar.e(allocate2, 28L);
                this.c = ernVar.e(allocate2, 32L);
                this.d = ernVar.d(allocate2, 42L);
                this.e = ernVar.d(allocate2, 44L);
                ernVar.d(allocate2, 46L);
                ernVar.d(allocate2, 48L);
                ernVar.d(allocate2, 50L);
                break;
        }
    }

    @Override // defpackage.arn
    public final zqn a(int i, long j) {
        int i2 = this.f;
        ern ernVar = this.g;
        switch (i2) {
            case 0:
                t4n t4nVar = new t4n();
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                long j2 = j + (i * 8);
                t4nVar.a = ernVar.e(allocate, j2);
                t4nVar.b = ernVar.e(allocate, j2 + 4);
                return t4nVar;
            default:
                t4n t4nVar2 = new t4n();
                ByteBuffer allocate2 = ByteBuffer.allocate(8);
                allocate2.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                long j3 = j + (i * 16);
                ernVar.c(j3, allocate2, 8);
                t4nVar2.a = allocate2.getLong();
                ernVar.c(j3 + 8, allocate2, 8);
                t4nVar2.b = allocate2.getLong();
                return t4nVar2;
        }
    }

    @Override // defpackage.arn
    public final brn b(long j) {
        int i = this.f;
        ern ernVar = this.g;
        switch (i) {
            case 0:
                khf0 khf0Var = new khf0();
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                long j2 = (j * this.d) + this.b;
                khf0Var.a = ernVar.e(allocate, j2);
                khf0Var.b = ernVar.e(allocate, 4 + j2);
                khf0Var.c = ernVar.e(allocate, 8 + j2);
                khf0Var.d = ernVar.e(allocate, j2 + 20);
                return khf0Var;
            default:
                khf0 khf0Var2 = new khf0();
                ByteBuffer allocate2 = ByteBuffer.allocate(8);
                allocate2.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                long j3 = (j * this.d) + this.b;
                khf0Var2.a = ernVar.e(allocate2, j3);
                ernVar.c(8 + j3, allocate2, 8);
                khf0Var2.b = allocate2.getLong();
                ernVar.c(16 + j3, allocate2, 8);
                khf0Var2.c = allocate2.getLong();
                ernVar.c(j3 + 40, allocate2, 8);
                khf0Var2.d = allocate2.getLong();
                return khf0Var2;
        }
    }

    @Override // defpackage.arn
    public final crn c() {
        int i = this.f;
        ern ernVar = this.g;
        switch (i) {
            case 0:
                oyp0 oyp0Var = new oyp0();
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                oyp0Var.a = ernVar.e(allocate, this.c + 0 + 28);
                return oyp0Var;
            default:
                oyp0 oyp0Var2 = new oyp0();
                ByteBuffer allocate2 = ByteBuffer.allocate(8);
                allocate2.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                oyp0Var2.a = ernVar.e(allocate2, this.c + 0 + 44);
                return oyp0Var2;
        }
    }
}
