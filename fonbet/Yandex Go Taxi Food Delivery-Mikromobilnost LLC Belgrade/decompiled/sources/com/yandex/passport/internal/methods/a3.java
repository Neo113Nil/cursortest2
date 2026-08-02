package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.fsn;
import defpackage.i3y;
import defpackage.vg10;
import defpackage.yhl;

/* loaded from: classes8.dex */
public abstract class a3 implements f {
    public final /* synthetic */ int a;
    public final Object b;
    public final boolean c;

    public a3(boolean z) {
        this.a = 2;
        this.c = z;
        this.b = kotlin.a.a(new fsn(24, this));
    }

    public void a() {
        ((i3y) this.b).getValue();
    }

    public Parcelable b(Bundle bundle) {
        if (this.c) {
            bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
        }
        String str = (String) this.b;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable != null) {
            return parcelable;
        }
        yhl.d(str, "can't get required parcelable ");
        return null;
    }

    @Override // com.yandex.passport.internal.methods.f
    public Object c(Bundle bundle) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                if (this.c) {
                    bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                }
                if (!bundle.containsKey(str)) {
                    return null;
                }
                Parcelable parcelable = bundle.getParcelable(str);
                if (parcelable != null) {
                    return parcelable;
                }
                vg10.d("can't get required parcelable ".concat(str));
                return null;
            default:
                return b(bundle);
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public void d(Bundle bundle, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Parcelable parcelable = (Parcelable) obj;
                if (parcelable != null) {
                    bundle.putParcelable((String) obj2, parcelable);
                    break;
                }
                break;
            default:
                bundle.putParcelable((String) obj2, (Parcelable) obj);
                break;
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
        }
        return (String) obj;
    }

    public /* synthetic */ a3(String str, boolean z, int i) {
        this.a = i;
        this.b = str;
        this.c = z;
    }
}
