package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.a1;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.eja1;
import defpackage.ffx;
import defpackage.i3y;
import defpackage.ls31;
import defpackage.lz40;
import defpackage.m50;
import defpackage.tje;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/plusdevices/ManagingPlusDevicesHelperActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/yandex/passport/internal/properties/ManagingPlusDevicesPropertiesImpl;", "properties", "Lzy11;", "managingSlothResultCollect", "(Lcom/yandex/passport/internal/properties/ManagingPlusDevicesPropertiesImpl;)V", "viewModelCollect", "goneProgress", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "recreate", "onDestroy", "Lcom/yandex/passport/internal/ui/sloth/plusdevices/e;", "ui", "Lcom/yandex/passport/internal/ui/sloth/plusdevices/e;", "Lm50;", "Lcom/yandex/passport/sloth/data/SlothParams;", "managingPlusDevicesLauncher", "Lm50;", "Llz40;", "", "managingPlusDevicesSlothResults", "Llz40;", "Landroid/os/Handler;", "handler$delegate", "Li3y;", "getHandler", "()Landroid/os/Handler;", "handler", "Lcom/yandex/passport/internal/ui/sloth/plusdevices/m;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/passport/internal/ui/sloth/plusdevices/m;", "viewModel", "", "isGoingToRecreate", "Z", "Companion", "com/yandex/passport/internal/ui/sloth/plusdevices/d", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ManagingPlusDevicesHelperActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private static final long AFTER_TIME_SHOW_PROGRESS = 2000;
    public static final d Companion = new d();
    public static final int RESULT_DEVICE_INVALID = 1111;
    private boolean isGoingToRecreate;
    private e ui;
    private final m50 managingPlusDevicesLauncher = registerForActivityResult(new s(), new com.yandex.passport.internal.links.h(this, 6));
    private final lz40 managingPlusDevicesSlothResults = ffx.c(0, 0, null, 7);

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    private final i3y handler = kotlin.a.a(new a1(21));

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel = kotlin.a.a(new com.yandex.passport.internal.flags.experiments.h(29, this));

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goneProgress() {
        getHandler().removeCallbacksAndMessages(null);
        e eVar = this.ui;
        (eVar != null ? eVar : null).c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$2() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void managingPlusDevicesLauncher$lambda$1(ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity, int i) {
        tje.N(eja1.s(managingPlusDevicesHelperActivity), null, null, new ManagingPlusDevicesHelperActivity$managingPlusDevicesLauncher$lambda$1$$inlined$emitOn$1(managingPlusDevicesHelperActivity.managingPlusDevicesSlothResults, null, i), 3);
    }

    private final void managingSlothResultCollect(ManagingPlusDevicesPropertiesImpl properties) {
        tje.N(eja1.s(this), null, null, new ManagingPlusDevicesHelperActivity$managingSlothResultCollect$$inlined$collectOn$1(this.managingPlusDevicesSlothResults, null, this, properties), 3);
    }

    private final void viewModelCollect() {
        tje.N(eja1.s(this), null, null, new ManagingPlusDevicesHelperActivity$viewModelCollect$$inlined$collectOn$1(getViewModel().x, null, this), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m viewModel_delegate$lambda$3(ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity) {
        return (m) new ls31(managingPlusDevicesHelperActivity).b(m.class);
    }

    public final m getViewModel() {
        return (m) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            com.yandex.passport.internal.ui.c.j(this, new IllegalArgumentException("ManagingPlusDevicesProperties is missing in intent"));
            return;
        }
        ManagingPlusDevicesPropertiesImpl.Companion.getClass();
        ManagingPlusDevicesPropertiesImpl a = com.yandex.passport.internal.properties.j.a(extras);
        PassportTheme theme = a.getTheme();
        GlobalRouterActivity.Companion.getClass();
        int c = com.yandex.passport.internal.ui.router.c.c(theme);
        if (c != getDelegate().getLocalNightMode()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Setting theme to " + theme + " with nightMode=" + c + ", was " + getDelegate().getLocalNightMode(), 8);
            }
            getDelegate().setLocalNightMode(c);
        }
        super.onCreate(savedInstanceState);
        if (isFinishing() || isChangingConfigurations() || this.isGoingToRecreate) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.isGoingToRecreate, 8);
            }
            tje.N(eja1.s(this), null, null, new ManagingPlusDevicesHelperActivity$onCreate$3(this, null), 3);
        }
        e eVar = new e(this);
        this.ui = eVar;
        setContentView(eVar.getRoot());
        managingSlothResultCollect(a);
        viewModelCollect();
        if (savedInstanceState == null) {
            if (a.isForceShowManagingPlusDevices()) {
                getViewModel().X(new j(a));
            } else {
                getViewModel().X(new k(true, a));
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getHandler().removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity
    public void recreate() {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isGoingToRecreate = true", 8);
        }
        this.isGoingToRecreate = true;
        super.recreate();
    }
}
