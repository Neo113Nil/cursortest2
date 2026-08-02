package com.yandex.passport.internal.ui.authbytrack;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.u;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.h;
import com.yandex.passport.internal.analytics.v;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.entities.TrackId;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.SocialRegistrationProperties;
import com.yandex.passport.internal.properties.WebAmProperties;
import com.yandex.passport.internal.properties.i;
import com.yandex.passport.internal.properties.w;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.authbytrack.acceptdialog.AcceptAuthFragmentDialog;
import com.yandex.passport.internal.ui.m;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.util.p;
import defpackage.ds31;
import defpackage.ls31;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.tje;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/yandex/passport/internal/ui/authbytrack/AuthByTrackActivity;", "Lcom/yandex/passport/internal/ui/BaseActivity;", "<init>", "()V", "", "displayName", "Lzy11;", "showAccountDialog", "(Ljava/lang/String;)V", "Lcom/yandex/passport/internal/ui/EventError;", "error", "showErrorDialog", "(Lcom/yandex/passport/internal/ui/EventError;)V", "Lcom/yandex/passport/common/core/Uid;", "uid", "finishWithAccount", "(Lcom/yandex/passport/common/core/Uid;)V", "Lcom/yandex/passport/internal/ModernAccount;", "account", "showFinishRegistration", "(Lcom/yandex/passport/internal/ModernAccount;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/yandex/passport/internal/analytics/v;", "reporter", "Lcom/yandex/passport/internal/analytics/v;", "Lcom/yandex/passport/internal/ui/authbytrack/f;", "viewModel", "Lcom/yandex/passport/internal/ui/authbytrack/f;", "Lcom/yandex/passport/internal/entities/TrackId;", "trackId", "Lcom/yandex/passport/internal/entities/TrackId;", "Lcom/yandex/passport/internal/properties/LoginProperties;", "loginProperties", "Lcom/yandex/passport/internal/properties/LoginProperties;", "Lcom/yandex/passport/internal/flags/j;", "flagRepository", "Lcom/yandex/passport/internal/flags/j;", "Companion", "com/yandex/passport/internal/ui/authbytrack/d", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthByTrackActivity extends BaseActivity {
    public static final int $stable = 8;
    public static final d Companion = new d();
    private static final int REQUEST_FINISH_REGISTRATION = 1;
    private j flagRepository;
    private LoginProperties loginProperties;
    private v reporter;
    private TrackId trackId;
    private f viewModel;

    private final void finishWithAccount(Uid uid) {
        PassportUidImpl A = p.A(uid);
        PassportLoginAction passportLoginAction = PassportLoginAction.EMPTY;
        f fVar = this.viewModel;
        if (fVar == null) {
            fVar = null;
        }
        ModernAccount modernAccount = (ModernAccount) fVar.B.d();
        if (modernAccount != null) {
            com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.B(new u(A, a0.g0(modernAccount), passportLoginAction, null, null)));
        } else {
            ny61.r("no account data");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f onCreate$lambda$0() {
        return new f(com.yandex.passport.internal.di.a.a().getAuthorizeByForwardTrackUseCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(AuthByTrackActivity authByTrackActivity, ModernAccount modernAccount) {
        v vVar = authByTrackActivity.reporter;
        if (vVar == null) {
            vVar = null;
        }
        TrackId trackId = authByTrackActivity.trackId;
        if (trackId == null) {
            trackId = null;
        }
        vVar.getClass();
        vVar.c(h.d, new Pair("track_id", v.b(trackId)));
        LoginProperties loginProperties = authByTrackActivity.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        j jVar = authByTrackActivity.flagRepository;
        j jVar2 = jVar != null ? jVar : null;
        boolean z = modernAccount.getPrimaryAliasType() == 6;
        boolean z2 = loginProperties.getFilter().get(PassportAccountType.SOCIAL);
        boolean booleanValue = ((Boolean) jVar2.b(q.h)).booleanValue();
        WebAmProperties webAmProperties = loginProperties.getWebAmProperties();
        if ((webAmProperties != null ? webAmProperties.getIgnoreBackToNativeFallback() : false) || ((Boolean) jVar2.b(q.w)).booleanValue() || !z || (z2 && !booleanValue)) {
            boolean z3 = modernAccount.getPrimaryAliasType() == 5;
            boolean z4 = loginProperties.getFilter().get(PassportAccountType.LITE);
            if (!z3 || z4) {
                authByTrackActivity.finishWithAccount(modernAccount.getUid());
                return;
            }
        }
        authByTrackActivity.showFinishRegistration(modernAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(AuthByTrackActivity authByTrackActivity, EventError eventError) {
        v vVar = authByTrackActivity.reporter;
        if (vVar == null) {
            vVar = null;
        }
        TrackId trackId = authByTrackActivity.trackId;
        TrackId trackId2 = trackId != null ? trackId : null;
        vVar.getClass();
        vVar.c(h.e, new Pair("track_id", v.b(trackId2)), new Pair(Constants.KEY_MESSAGE, eventError.getErrorCode()), new Pair("error", Log.getStackTraceString(eventError.getException())));
        authByTrackActivity.showErrorDialog(eventError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(AuthByTrackActivity authByTrackActivity, Boolean bool) {
        f fVar = authByTrackActivity.viewModel;
        if (fVar == null) {
            fVar = null;
        }
        TrackId trackId = authByTrackActivity.trackId;
        if (trackId == null) {
            trackId = null;
        }
        fVar.getClass();
        tje.N(ds31.a(fVar), null, null, new AuthByTrackViewModel$authorizeByTrackId$1(fVar, trackId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(AuthByTrackActivity authByTrackActivity, Boolean bool) {
        v vVar = authByTrackActivity.reporter;
        if (vVar == null) {
            vVar = null;
        }
        TrackId trackId = authByTrackActivity.trackId;
        vVar.a(trackId != null ? trackId : null);
        authByTrackActivity.finish();
    }

    private final void showAccountDialog(String displayName) {
        String str;
        v vVar = this.reporter;
        if (vVar == null) {
            vVar = null;
        }
        TrackId trackId = this.trackId;
        TrackId trackId2 = trackId != null ? trackId : null;
        vVar.getClass();
        vVar.c(h.c, new Pair("track_id", v.b(trackId2)));
        AcceptAuthFragmentDialog.Companion.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("display_name", displayName);
        AcceptAuthFragmentDialog acceptAuthFragmentDialog = new AcceptAuthFragmentDialog();
        acceptAuthFragmentDialog.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        str = AcceptAuthFragmentDialog.FRAGMENT_TAG;
        acceptAuthFragmentDialog.show(supportFragmentManager, str);
    }

    private final void showErrorDialog(EventError error) {
        m mVar = new m(this);
        f fVar = this.viewModel;
        if (fVar == null) {
            fVar = null;
        }
        mVar.d(fVar.C.b(error.getErrorCode()));
        final int i = 0;
        mVar.e(R.string.passport_reg_try_again, new DialogInterface.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authbytrack.a
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = i;
                AuthByTrackActivity authByTrackActivity = this.b;
                switch (i3) {
                    case 0:
                        AuthByTrackActivity.showErrorDialog$lambda$5(authByTrackActivity, dialogInterface, i2);
                        break;
                    default:
                        AuthByTrackActivity.showErrorDialog$lambda$6(authByTrackActivity, dialogInterface, i2);
                        break;
                }
            }
        });
        int i2 = R.string.passport_reg_cancel;
        final int i3 = 1;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authbytrack.a
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                int i32 = i3;
                AuthByTrackActivity authByTrackActivity = this.b;
                switch (i32) {
                    case 0:
                        AuthByTrackActivity.showErrorDialog$lambda$5(authByTrackActivity, dialogInterface, i22);
                        break;
                    default:
                        AuthByTrackActivity.showErrorDialog$lambda$6(authByTrackActivity, dialogInterface, i22);
                        break;
                }
            }
        };
        mVar.i = getText(i2);
        mVar.j = onClickListener;
        mVar.a().setOnCancelListener(new com.yandex.passport.internal.ui.e(i3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorDialog$lambda$5(AuthByTrackActivity authByTrackActivity, DialogInterface dialogInterface, int i) {
        f fVar = authByTrackActivity.viewModel;
        if (fVar == null) {
            fVar = null;
        }
        TrackId trackId = authByTrackActivity.trackId;
        if (trackId == null) {
            trackId = null;
        }
        fVar.getClass();
        tje.N(ds31.a(fVar), null, null, new AuthByTrackViewModel$authorizeByTrackId$1(fVar, trackId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorDialog$lambda$6(AuthByTrackActivity authByTrackActivity, DialogInterface dialogInterface, int i) {
        v vVar = authByTrackActivity.reporter;
        if (vVar == null) {
            vVar = null;
        }
        TrackId trackId = authByTrackActivity.trackId;
        vVar.a(trackId != null ? trackId : null);
        authByTrackActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorDialog$lambda$7(AuthByTrackActivity authByTrackActivity, DialogInterface dialogInterface) {
        v vVar = authByTrackActivity.reporter;
        if (vVar == null) {
            vVar = null;
        }
        TrackId trackId = authByTrackActivity.trackId;
        vVar.a(trackId != null ? trackId : null);
        authByTrackActivity.finish();
    }

    private final void showFinishRegistration(ModernAccount account) {
        v vVar = this.reporter;
        if (vVar == null) {
            vVar = null;
        }
        TrackId trackId = this.trackId;
        if (trackId == null) {
            trackId = null;
        }
        vVar.getClass();
        vVar.c(h.f, new Pair("track_id", v.b(trackId)));
        com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
        LoginProperties loginProperties = this.loginProperties;
        if (loginProperties == null) {
            loginProperties = null;
        }
        LoginProperties.a aVar = new LoginProperties.a();
        aVar.b(loginProperties);
        LoginProperties loginProperties2 = this.loginProperties;
        if (loginProperties2 == null) {
            loginProperties2 = null;
        }
        Filter filter = loginProperties2.getFilter();
        Filter.a aVar2 = new Filter.a();
        aVar2.d(filter);
        aVar2.a = p.x(account.getUid().getEnvironment());
        aVar.b = aVar2.a();
        SocialRegistrationProperties.a aVar3 = new SocialRegistrationProperties.a();
        aVar3.a = p.A(account.getUid());
        SocialRegistrationProperties.Companion.getClass();
        aVar.G = w.b(aVar3);
        LoginProperties.Companion.getClass();
        startActivityForResult(com.yandex.passport.internal.ui.router.c.b(cVar, this, a0.b0(i.b(aVar)), null, 28), 1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        TrackId trackId;
        if (requestCode == 1) {
            if (resultCode != -1 || data == null) {
                v vVar = this.reporter;
                if (vVar == null) {
                    vVar = null;
                }
                TrackId trackId2 = this.trackId;
                trackId = trackId2 != null ? trackId2 : null;
                vVar.getClass();
                vVar.c(h.g, new Pair("track_id", v.b(trackId)));
                finish();
            } else {
                v vVar2 = this.reporter;
                if (vVar2 == null) {
                    vVar2 = null;
                }
                TrackId trackId3 = this.trackId;
                trackId = trackId3 != null ? trackId3 : null;
                vVar2.getClass();
                vVar2.c(h.h, new Pair("track_id", v.b(trackId)));
                finishWithAccount(p.B(a0.e(data.getExtras()).a));
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passport_activity_progress);
        com.yandex.passport.legacy.d.b(this, (ProgressBar) findViewById(R.id.progress), R.color.passport_progress_bar);
        this.reporter = com.yandex.passport.internal.di.a.a().getAuthByTrackReporter();
        this.flagRepository = com.yandex.passport.internal.di.a.a().getFlagRepository();
        com.yandex.passport.internal.entities.p pVar = TrackId.Companion;
        Bundle extras = getIntent().getExtras();
        pVar.getClass();
        Parcelable e = oo31.e(extras, p.class, "track_id");
        if (e == null) {
            ny61.r("can't get required parcelable track_id");
            return;
        }
        this.trackId = (TrackId) e;
        i iVar = LoginProperties.Companion;
        Bundle extras2 = getIntent().getExtras();
        iVar.getClass();
        this.loginProperties = i.a(extras2);
        final int i = 0;
        f fVar = (f) com.yandex.passport.internal.u.a(this, f.class, new b(i));
        this.viewModel = fVar;
        fVar.B.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.authbytrack.c
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i2 = i;
                AuthByTrackActivity authByTrackActivity = this.b;
                switch (i2) {
                    case 0:
                        AuthByTrackActivity.onCreate$lambda$1(authByTrackActivity, (ModernAccount) obj);
                        break;
                    case 1:
                        AuthByTrackActivity.onCreate$lambda$2(authByTrackActivity, (EventError) obj);
                        break;
                    case 2:
                        AuthByTrackActivity.onCreate$lambda$3(authByTrackActivity, (Boolean) obj);
                        break;
                    default:
                        AuthByTrackActivity.onCreate$lambda$4(authByTrackActivity, (Boolean) obj);
                        break;
                }
            }
        });
        f fVar2 = this.viewModel;
        if (fVar2 == null) {
            fVar2 = null;
        }
        final int i2 = 1;
        fVar2.b.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.authbytrack.c
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i22 = i2;
                AuthByTrackActivity authByTrackActivity = this.b;
                switch (i22) {
                    case 0:
                        AuthByTrackActivity.onCreate$lambda$1(authByTrackActivity, (ModernAccount) obj);
                        break;
                    case 1:
                        AuthByTrackActivity.onCreate$lambda$2(authByTrackActivity, (EventError) obj);
                        break;
                    case 2:
                        AuthByTrackActivity.onCreate$lambda$3(authByTrackActivity, (Boolean) obj);
                        break;
                    default:
                        AuthByTrackActivity.onCreate$lambda$4(authByTrackActivity, (Boolean) obj);
                        break;
                }
            }
        });
        com.yandex.passport.internal.ui.authbytrack.acceptdialog.c cVar = (com.yandex.passport.internal.ui.authbytrack.acceptdialog.c) new ls31(this).b(com.yandex.passport.internal.ui.authbytrack.acceptdialog.c.class);
        final int i3 = 2;
        cVar.A.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.authbytrack.c
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i22 = i3;
                AuthByTrackActivity authByTrackActivity = this.b;
                switch (i22) {
                    case 0:
                        AuthByTrackActivity.onCreate$lambda$1(authByTrackActivity, (ModernAccount) obj);
                        break;
                    case 1:
                        AuthByTrackActivity.onCreate$lambda$2(authByTrackActivity, (EventError) obj);
                        break;
                    case 2:
                        AuthByTrackActivity.onCreate$lambda$3(authByTrackActivity, (Boolean) obj);
                        break;
                    default:
                        AuthByTrackActivity.onCreate$lambda$4(authByTrackActivity, (Boolean) obj);
                        break;
                }
            }
        });
        final int i4 = 3;
        cVar.B.n(this, new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.authbytrack.c
            public final /* synthetic */ AuthByTrackActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i22 = i4;
                AuthByTrackActivity authByTrackActivity = this.b;
                switch (i22) {
                    case 0:
                        AuthByTrackActivity.onCreate$lambda$1(authByTrackActivity, (ModernAccount) obj);
                        break;
                    case 1:
                        AuthByTrackActivity.onCreate$lambda$2(authByTrackActivity, (EventError) obj);
                        break;
                    case 2:
                        AuthByTrackActivity.onCreate$lambda$3(authByTrackActivity, (Boolean) obj);
                        break;
                    default:
                        AuthByTrackActivity.onCreate$lambda$4(authByTrackActivity, (Boolean) obj);
                        break;
                }
            }
        });
        if (savedInstanceState == null) {
            v vVar = this.reporter;
            if (vVar == null) {
                vVar = null;
            }
            TrackId trackId = this.trackId;
            if (trackId == null) {
                trackId = null;
            }
            vVar.getClass();
            vVar.c(h.b, new Pair("track_id", v.b(trackId)));
            TrackId trackId2 = this.trackId;
            String displayName = (trackId2 != null ? trackId2 : null).getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            showAccountDialog(displayName);
        }
    }
}
