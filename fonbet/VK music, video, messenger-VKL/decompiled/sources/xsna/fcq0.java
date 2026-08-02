package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: UploadMenuClicked.kt */
/* loaded from: classes16.dex */
public final class fcq0 implements q1a {
    public final String b;
    public final int c;

    public fcq0(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcq0)) {
            return false;
        }
        fcq0 fcq0Var = (fcq0) obj;
        return epx.f(this.b, fcq0Var.b) && this.c == fcq0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadMenuClicked(blockId=");
        io.reactivex.rxjava3.processors.b.b(sb, this.b, ", uploadTaskId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // xsna.q1a
    public final BlockId w() {
        return new BlockId.Simple(this.b);
    }
}
