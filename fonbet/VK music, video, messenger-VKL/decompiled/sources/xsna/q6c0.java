package xsna;

import android.net.Uri;
import android.os.Bundle;
import com.vk.newsfeed.impl.fragments.PostPreviewFragment;
import java.util.Set;

/* compiled from: PostPreviewFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class q6c0 extends oz50 implements ies {
    public q6c0() {
        super(PostPreviewFragment.class, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(long j, String str, String str2, boolean z, boolean z2) throws IllegalArgumentException {
        String str3;
        String str4;
        Long n;
        String str5;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Params is empty");
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        String str6 = null;
        if (queryParameterNames.contains("owner_id")) {
            try {
                str3 = parse.getQueryParameter("owner_id");
            } catch (Exception unused) {
                str3 = null;
            }
            if ((str3 != null ? arm0.m(10, str3) : null) != null) {
                str4 = null;
                if (str4 != null) {
                    str = str4;
                }
                if (j == 0) {
                    try {
                        str6 = parse.getQueryParameter("app_id");
                    } catch (Exception unused2) {
                    }
                    j = (str6 == null || (n = arm0.n(str6)) == null) ? 0L : n.longValue();
                }
                if (j != 0) {
                    throw new IllegalArgumentException("Wrong application id");
                }
                Bundle bundle = this.j;
                bundle.putLong("appId", j);
                bundle.putString("params", str);
                bundle.putBoolean("is_internal", z);
                bundle.putBoolean("is_game", z2);
                if (str2 != null) {
                    bundle.putString("ref", str2);
                    return;
                }
                return;
            }
        }
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("owner_id", String.valueOf(t11.b().b));
        for (String str7 : queryParameterNames) {
            if (!epx.f(str7, "owner_id")) {
                try {
                    str5 = parse.getQueryParameter(str7);
                } catch (Exception unused3) {
                    str5 = null;
                }
                if (str5 == null) {
                    str5 = "";
                }
                builder.appendQueryParameter(str7, str5);
            }
        }
        str4 = builder.build().toString();
        if (str4 != null) {
        }
        if (j == 0) {
        }
        if (j != 0) {
        }
    }
}
