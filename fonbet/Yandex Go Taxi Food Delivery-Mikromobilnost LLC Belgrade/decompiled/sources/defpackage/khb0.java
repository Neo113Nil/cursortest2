package defpackage;

import com.fluttercandies.photo_manager.core.PhotoManagerWriteManager$OperationType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class khb0 {
    public final ArrayList a;
    public final String b;
    public final PhotoManagerWriteManager$OperationType c;

    public khb0(ArrayList arrayList, String str, PhotoManagerWriteManager$OperationType photoManagerWriteManager$OperationType) {
        this.a = arrayList;
        this.b = str;
        this.c = photoManagerWriteManager$OperationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khb0)) {
            return false;
        }
        khb0 khb0Var = (khb0) obj;
        return this.a.equals(khb0Var.a) && this.b.equals(khb0Var.b) && this.c == khb0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WriteOperation(uris=" + this.a + ", targetPath=" + this.b + ", operationType=" + this.c + Extension.C_BRAKE;
    }
}
