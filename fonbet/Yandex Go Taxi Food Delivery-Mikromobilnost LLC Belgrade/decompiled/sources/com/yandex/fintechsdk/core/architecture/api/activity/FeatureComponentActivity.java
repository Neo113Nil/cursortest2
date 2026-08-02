package com.yandex.fintechsdk.core.architecture.api.activity;

import android.content.Context;
import android.os.Bundle;
import com.yandex.fintechsdk.entities.theme.Theme;
import defpackage.ige0;
import defpackage.ny61;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\u0016\u0010\nR\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/fintechsdk/core/architecture/api/activity/FeatureComponentActivity;", "", CA20Status.STATUS_REQUEST_C, "Lcom/yandex/fintechsdk/core/architecture/api/activity/ThemedActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreateWithComponent", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "context", "Lcom/yandex/fintechsdk/entities/theme/Theme;", "getThemeOverride", "(Landroid/content/Context;)Lcom/yandex/fintechsdk/entities/theme/Theme;", "Ljava/util/Locale;", "getLocaleOverride", "(Landroid/content/Context;)Ljava/util/Locale;", "onCreate", "resolvedComponent", "Ljava/lang/Object;", "getComponent", "()Ljava/lang/Object;", "component", "Lige0;", "getPreInitHandlers", "()Lige0;", "preInitHandlers", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FeatureComponentActivity<C> extends ThemedActivity {
    private C resolvedComponent;

    @Override // com.yandex.fintechsdk.core.architecture.api.activity.ThemedActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        getPreInitHandlers();
        throw null;
    }

    public final C getComponent() {
        C c = this.resolvedComponent;
        if (c != null) {
            return c;
        }
        ny61.r("Component is not available: accessed before onCreateWithComponent or after finish");
        return null;
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.activity.ThemedActivity
    public final Locale getLocaleOverride(Context context) {
        if (this.resolvedComponent == null) {
            return null;
        }
        getPreInitHandlers();
        throw null;
    }

    public abstract ige0 getPreInitHandlers();

    @Override // com.yandex.fintechsdk.core.architecture.api.activity.ThemedActivity
    public final Theme getThemeOverride(Context context) {
        if (this.resolvedComponent == null) {
            return null;
        }
        getPreInitHandlers();
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) {
        getPreInitHandlers();
        throw null;
    }

    public abstract void onCreateWithComponent(Bundle savedInstanceState);
}
