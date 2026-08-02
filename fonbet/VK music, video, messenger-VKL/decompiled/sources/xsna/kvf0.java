package xsna;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RemoteInput.java */
/* loaded from: classes11.dex */
public final class kvf0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set<String> g;

    /* compiled from: RemoteInput.java */
    public static class a {
        public static void a(RemoteInput.Builder builder, int i) {
            builder.setEditChoicesBeforeSending(i);
        }
    }

    public kvf0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = hashSet;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput[] a(kvf0[] kvf0VarArr) {
        if (kvf0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[kvf0VarArr.length];
        for (int i = 0; i < kvf0VarArr.length; i++) {
            kvf0 kvf0Var = kvf0VarArr[i];
            RemoteInput.Builder addExtras = new RemoteInput.Builder(kvf0Var.a).setLabel(kvf0Var.b).setChoices(kvf0Var.c).setAllowFreeFormInput(kvf0Var.d).addExtras(kvf0Var.f);
            Set<String> set = kvf0Var.g;
            if (set != null) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    addExtras.setAllowDataType(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a.a(addExtras, kvf0Var.e);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
