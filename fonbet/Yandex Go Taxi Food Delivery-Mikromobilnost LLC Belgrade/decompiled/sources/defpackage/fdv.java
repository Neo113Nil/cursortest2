package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class fdv implements idv {
    public final /* synthetic */ int a = 0;
    public final ByteBuffer b;
    public final int c;

    public fdv(int i, ByteBuffer byteBuffer) {
        this.c = i;
        this.b = byteBuffer;
    }

    @Override // defpackage.idv
    public final int a() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.idv
    public final int b() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    @Override // defpackage.idv
    public final ByteBuffer h() {
        switch (this.a) {
        }
        return this.b;
    }

    public fdv(ByteBuffer byteBuffer, int i) {
        this.b = byteBuffer;
        this.c = i;
    }
}
