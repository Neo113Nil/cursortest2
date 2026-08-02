package defpackage;

import android.os.Bundle;
import androidx.view.f;

/* loaded from: classes10.dex */
public final class d550 implements Comparable {
    public final f a;
    public final Bundle b;
    public final boolean c;
    public final int w;
    public final boolean x;
    public final int y;

    public d550(f fVar, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.a = fVar;
        this.b = bundle;
        this.c = z;
        this.w = i;
        this.x = z2;
        this.y = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d550 d550Var) {
        boolean z = d550Var.x;
        boolean z2 = d550Var.c;
        Bundle bundle = d550Var.b;
        boolean z3 = this.c;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.w - d550Var.w;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size() - bundle.size();
            if (size > 0) {
                return 1;
            }
            if (size < 0) {
                return -1;
            }
        }
        boolean z4 = this.x;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.y - d550Var.y;
        }
        return -1;
    }
}
