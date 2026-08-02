package androidx.fragment.app;

import androidx.fragment.app.strictmode.FragmentReuseViolation;
import defpackage.aes;
import defpackage.bes;
import defpackage.des;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.vg10;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class y {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList q;
    public final ArrayList a = new ArrayList();
    public boolean h = true;
    public boolean p = false;

    @Deprecated
    public y() {
    }

    public final void b(des desVar) {
        this.a.add(desVar);
        desVar.d = this.b;
        desVar.e = this.c;
        desVar.f = this.d;
        desVar.g = this.e;
    }

    public final void c(String str) {
        if (!this.h) {
            ny61.r("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.g = true;
            this.i = str;
        }
    }

    public abstract int d();

    public void e(Fragment fragment) {
        b(new des(fragment, 6));
    }

    public void f(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            aes aesVar = bes.a;
            bes.b(new FragmentReuseViolation(fragment, str2));
            bes.a(fragment).getClass();
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            vg10.s("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                ny61.r(unr0.r(sb, fragment.mTag, " now ", str));
                return;
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                kbs.m("Can't add fragment ", fragment, " with tag ", str, " to container view with no id");
                return;
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        b(new des(fragment, i2));
    }

    public y g(Fragment fragment) {
        b(new des(fragment, 4));
        return this;
    }

    public final void h(int i, Fragment fragment, String str) {
        if (i != 0) {
            f(i, fragment, str, 2);
        } else {
            ny61.g("Must use non-zero containerViewId");
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public y(int i) {
    }
}
