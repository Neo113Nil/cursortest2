package xsna;

import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SinglePrefsStorageImpl.kt */
/* loaded from: classes11.dex */
public final class nvj0 {
    public final File a;

    public nvj0(File file) {
        this.a = file;
    }

    public final List<String> a() {
        try {
            return nbr.q(this.a);
        } catch (IOException unused) {
            return EmptyList.b;
        }
    }
}
