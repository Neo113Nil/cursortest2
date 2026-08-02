package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes11.dex */
public final class au2 implements fh81 {
    public final List a;

    public au2(Uri uri) {
        this.a = uri.getPathSegments();
    }

    @Override // defpackage.fh81
    public int a(long j) {
        return -1;
    }

    @Override // defpackage.fh81
    public long b(int i) {
        return 0L;
    }

    public boolean c() {
        return this.a.size() > 1;
    }

    @Override // defpackage.fh81
    public List d(long j) {
        return this.a;
    }

    @Override // defpackage.fh81
    public int a() {
        return 1;
    }
}
