package xsna;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes11.dex */
public final class mok {

    @NonNull
    public final Intent a;

    @Nullable
    public final Bundle b;

    public mok(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    /* compiled from: CustomTabsIntent.java */
    public static final class a {
        public final Intent a;
        public final dok b;

        @Nullable
        public Bundle c;

        @Nullable
        public Bundle d;
        public int e;
        public final boolean f;

        public a() {
            this.a = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            this.b = new dok();
            this.e = 0;
            this.f = true;
        }

        @NonNull
        public final mok a() {
            Intent intent = this.a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f);
            dok dokVar = this.b;
            Integer num = dokVar.a;
            Integer num2 = dokVar.b;
            Bundle bundle2 = new Bundle();
            if (num != null) {
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
            }
            if (num2 != null) {
                bundle2.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
            }
            intent.putExtras(bundle2);
            Bundle bundle3 = this.d;
            if (bundle3 != null) {
                intent.putExtras(bundle3);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.e);
            return new mok(intent, this.c);
        }

        public a(@Nullable ook ookVar) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            this.a = intent;
            this.b = new dok();
            this.e = 0;
            this.f = true;
            if (ookVar != null) {
                intent.setPackage(ookVar.c.getPackageName());
                kok kokVar = ookVar.b;
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", kokVar);
                intent.putExtras(bundle);
            }
        }
    }
}
