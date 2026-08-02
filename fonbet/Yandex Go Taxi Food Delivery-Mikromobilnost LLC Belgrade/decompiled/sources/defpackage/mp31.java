package defpackage;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class mp31 extends uf00 {
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp31(int i, Class cls, int i2, int i3, int i4) {
        super(i, cls, i2, i3);
        this.x = i4;
    }

    @Override // defpackage.uf00
    public final Object b(View view) {
        switch (this.x) {
            case 0:
                return Boolean.valueOf(rp31.c(view));
            case 1:
                return rp31.a(view);
            case 2:
                return tp31.b(view);
            default:
                return Boolean.valueOf(rp31.b(view));
        }
    }

    @Override // defpackage.uf00
    public final void c(View view, Object obj) {
        switch (this.x) {
            case 0:
                rp31.g(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                rp31.f(view, (CharSequence) obj);
                break;
            case 2:
                tp31.d(view, (CharSequence) obj);
                break;
            default:
                rp31.e(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.uf00
    public final boolean f(Object obj, Object obj2) {
        boolean equals;
        switch (this.x) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !equals;
    }
}
