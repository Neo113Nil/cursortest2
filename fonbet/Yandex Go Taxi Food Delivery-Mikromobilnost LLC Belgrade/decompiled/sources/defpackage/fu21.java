package defpackage;

import android.content.res.Resources;

/* loaded from: classes15.dex */
public abstract class fu21 extends gu21 {
    @Override // defpackage.gu21
    public final String b(Resources resources) {
        return resources.getString(c());
    }

    public abstract int c();

    public boolean equals(Object obj) {
        return (obj instanceof fu21) && ((fu21) obj).a == this.a;
    }
}
