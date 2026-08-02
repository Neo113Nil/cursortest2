package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.ybsdk.screens.initial.deeplink.SdkUri$InternalQueryParam;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class esp0 {
    public static final /* synthetic */ esp0 a = new esp0();
    public static final ArrayList b;

    static {
        List list;
        List list2;
        SdkUri$InternalQueryParam.Companion.getClass();
        list = SdkUri$InternalQueryParam.paramValues;
        SdkUri$QueryParam.Companion.getClass();
        list2 = SdkUri$QueryParam.paramValues;
        b = a.m0(list2, list);
    }

    public static Uri a(String str) {
        return vfc.m("ybapp", Constants.DEEPLINK, str);
    }

    public static ArrayList b() {
        return b;
    }

    public static Uri c(esp0 esp0Var, String str) {
        esp0Var.getClass();
        return new Uri.Builder().scheme("ybapp").authority("screen.open").path(str).build();
    }
}
