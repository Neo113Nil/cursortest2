package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.ParcelFormatException;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class d3 implements f {
    public static final d3 b = new d3(0);
    public static final d3 c = new d3(1);
    public static final d3 w = new d3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ d3(int i) {
        this.a = i;
    }

    @Override // com.yandex.passport.internal.methods.f
    public final Object c(Bundle bundle) {
        switch (this.a) {
            case 0:
                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("passport-account-list");
                if (parcelableArrayList != null) {
                    return parcelableArrayList;
                }
                throw new ParcelFormatException("Invalid parcelable PassportAccountImpl in the bundle");
            case 1:
                return new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
            case 2:
                return zy11.a;
            default:
                return Integer.valueOf(bundle.getInt("UPLOAD_DIARY_RESULT_KEY"));
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public final void d(Bundle bundle, Object obj) {
        switch (this.a) {
            case 0:
                bundle.putParcelableArrayList("passport-account-list", new ArrayList<>((List) obj));
                break;
            case 1:
                PassportUidImpl passportUidImpl = (PassportUidImpl) obj;
                bundle.putLong("passport-uid", passportUidImpl.getValue());
                bundle.putInt(WebViewActivity.KEY_ENVIRONMENT, passportUidImpl.getEnvironment().getInteger());
                break;
            case 2:
                break;
            default:
                bundle.putInt("UPLOAD_DIARY_RESULT_KEY", ((Number) obj).intValue());
                break;
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public final String getKey() {
        switch (this.a) {
            case 0:
                return "passport-account-list";
            case 1:
                return "passport-uid";
            case 2:
                return "";
            default:
                return "UPLOAD_DIARY_RESULT_KEY";
        }
    }
}
