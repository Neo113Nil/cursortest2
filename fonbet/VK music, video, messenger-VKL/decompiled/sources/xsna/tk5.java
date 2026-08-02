package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import xsna.v2z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tk5 implements v2z.a {
    public static androidx.fragment.app.a b(FragmentManager fragmentManager, FragmentManager fragmentManager2) {
        fragmentManager.getClass();
        return new androidx.fragment.app.a(fragmentManager2);
    }

    public static String c(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    @Override // xsna.v2z.a
    public String a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }
}
