package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.ParcelFormatException;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class e3 implements f {
    public static final e3 b = new e3(0);
    public static final e3 c = new e3(1);
    public static final e3 w = new e3(2);
    public static final e3 x = new e3(3);
    public final /* synthetic */ int a;

    public /* synthetic */ e3(int i) {
        this.a = i;
    }

    public List a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("push_platforms");
        if (stringArrayList == null) {
            throw new ParcelFormatException("Missing PushPlatform list in bundle");
        }
        ArrayList arrayList = new ArrayList(tcc.n(stringArrayList, 10));
        for (String str : stringArrayList) {
            try {
                arrayList.add(PushPlatform.valueOf(str));
            } catch (IllegalArgumentException unused) {
                throw new ParcelFormatException(g8e.o("Invalid PushPlatform value: ", str));
            }
        }
        return arrayList;
    }

    @Override // com.yandex.passport.internal.methods.f
    public final Object c(Bundle bundle) {
        switch (this.a) {
            case 0:
                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("passport-available-accounts");
                if (parcelableArrayList != null) {
                    return parcelableArrayList;
                }
                throw new ParcelFormatException("Invalid parcelable PassportAvailableAccountImpl in the bundle");
            case 1:
                if (!bundle.containsKey(WebViewActivity.KEY_ENVIRONMENT) || !bundle.containsKey("passport-uid")) {
                    return null;
                }
                int i = bundle.getInt(WebViewActivity.KEY_ENVIRONMENT);
                return new PassportUidImpl(PassportEnvironmentImpl.from(i), bundle.getLong("passport-uid"));
            case 2:
                Bundle bundle2 = bundle.getBundle("push-data-key");
                if (bundle2 != null) {
                    return bundle2;
                }
                ny61.r("can't get required bundle push-data-key");
                return null;
            default:
                return a(bundle);
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public final void d(Bundle bundle, Object obj) {
        switch (this.a) {
            case 0:
                bundle.putParcelableArrayList("passport-available-accounts", new ArrayList<>((List) obj));
                break;
            case 1:
                PassportUidImpl passportUidImpl = (PassportUidImpl) obj;
                if (passportUidImpl != null) {
                    bundle.putLong("passport-uid", passportUidImpl.getValue());
                    bundle.putInt(WebViewActivity.KEY_ENVIRONMENT, passportUidImpl.getEnvironment().getInteger());
                    break;
                }
                break;
            case 2:
                bundle.putBundle("push-data-key", (Bundle) obj);
                break;
            default:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PushPlatform) it.next()).name());
                }
                bundle.putStringArrayList("push_platforms", new ArrayList<>(arrayList));
                break;
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public final String getKey() {
        switch (this.a) {
            case 0:
                return "passport-available-accounts";
            case 1:
                return "passport-uid";
            case 2:
                return "push-data-key";
            default:
                return "push_platforms";
        }
    }
}
