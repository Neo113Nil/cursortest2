package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public final class on71 {
    public static View a(Context context, Class cls, int i, ViewGroup viewGroup) {
        try {
            return (View) cls.cast(LayoutInflater.from(context).inflate(i, viewGroup, false));
        } catch (Exception unused) {
            return null;
        }
    }
}
