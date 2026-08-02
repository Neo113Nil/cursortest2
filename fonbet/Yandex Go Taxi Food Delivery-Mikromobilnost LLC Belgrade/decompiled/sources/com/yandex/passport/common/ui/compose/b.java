package com.yandex.passport.common.ui.compose;

import android.os.Handler;
import android.widget.Toast;
import com.yandex.passport.api.s;
import com.yandex.passport.api.t2;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.push.NotificationsBuilderActivity;
import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity;
import com.yandex.passport.internal.ui.account_upgrade.UpgraderExtras;
import com.yandex.passport.internal.ui.account_upgrade.e;
import com.yandex.passport.internal.ui.account_upgrade.f;
import com.yandex.passport.internal.ui.base.l;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import com.yandex.passport.internal.ui.router.v;
import com.yandex.passport.internal.ui.router.w;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothProperties;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.g;
import com.yandex.passport.internal.ui.sloth.plusdevices.h;
import com.yandex.passport.internal.ui.sloth.plusdevices.i;
import com.yandex.passport.internal.ui.sloth.webcard.d1;
import com.yandex.passport.internal.ui.social.SocialBindingFragment;
import com.yandex.passport.internal.ui.social.SocialFragment;
import com.yandex.passport.internal.ui.social.j;
import com.yandex.passport.internal.ui.social.o;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.sloth.i0;
import com.yandex.passport.sloth.r;
import com.yandex.passport.sloth.u;
import defpackage.jl40;
import defpackage.m3u0;
import defpackage.m50;
import defpackage.oz40;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        Object onResult;
        PassportProcessGlobalComponent passportProcessGlobalComponent;
        m50 m50Var;
        m50 m50Var2;
        UpgraderExtras upgraderExtras;
        w wVar;
        oz40 oz40Var;
        w wVar2;
        boolean z;
        m50 m50Var3;
        Handler handler;
        j listener;
        j listener2;
        SocialConfiguration socialConfiguration;
        com.yandex.passport.internal.ui.social.a listener3;
        SocialConfiguration socialConfiguration2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object invoke = ((wls) ((m3u0) obj2).getValue()).invoke(obj, continuation);
                if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                NotificationsBuilderActivity notificationsBuilderActivity = (NotificationsBuilderActivity) obj2;
                Throwable a = Result.a(((Result) obj).getValue());
                if (a == null || (str = a.getMessage()) == null) {
                    str = "success";
                }
                Toast.makeText(notificationsBuilderActivity, str, 1).show();
                break;
            case 2:
                f fVar = (f) obj;
                AccountUpgraderActivity accountUpgraderActivity = (AccountUpgraderActivity) obj2;
                if (!(fVar instanceof e)) {
                    if (!(fVar instanceof com.yandex.passport.internal.ui.account_upgrade.d)) {
                        w511.b();
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder("Error ");
                        Throwable th = ((com.yandex.passport.internal.ui.account_upgrade.d) fVar).a;
                        sb.append(th);
                        Toast.makeText(accountUpgraderActivity, sb.toString(), 0).show();
                        onResult = accountUpgraderActivity.onResult(new s(th), continuation);
                        if (onResult == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    }
                } else {
                    passportProcessGlobalComponent = accountUpgraderActivity.component;
                    if (((Boolean) passportProcessGlobalComponent.getFlagRepository().b(q.W)).booleanValue()) {
                        m50Var2 = accountUpgraderActivity.standaloneSlothComposeLauncher;
                        upgraderExtras = accountUpgraderActivity.upgraderExtras;
                        m50Var2.a(new StandaloneSlothProperties(p.t((upgraderExtras != null ? upgraderExtras : null).getTheme()), ((e) fVar).a));
                    } else {
                        m50Var = accountUpgraderActivity.standaloneSlothLauncher;
                        m50Var.a(((e) fVar).a);
                    }
                }
                break;
            case 3:
                com.yandex.passport.sloth.ui.c cVar = (com.yandex.passport.sloth.ui.c) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "SlothNetworkStatus " + cVar, 8);
                }
                if (!jl40.l(cVar, com.yandex.passport.sloth.ui.c.a)) {
                    if (!jl40.l(cVar, com.yandex.passport.sloth.ui.c.b) && cVar != null) {
                        w511.b();
                        break;
                    }
                } else {
                    ((t) obj2).a(f2.c);
                }
                break;
            case 4:
                com.yandex.passport.sloth.ui.c cVar3 = (com.yandex.passport.sloth.ui.c) obj;
                com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "SlothNetworkStatus " + cVar3, 8);
                }
                if (!jl40.l(cVar3, com.yandex.passport.sloth.ui.c.a)) {
                    if (!jl40.l(cVar3, com.yandex.passport.sloth.ui.c.b) && cVar3 != null) {
                        w511.b();
                        break;
                    }
                } else {
                    ((com.yandex.passport.internal.ui.bouncer.loading.j) obj2).F.a(f2.c);
                }
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((com.yandex.passport.internal.ui.domik.relogin.c) obj2).c.l(bool);
                break;
            case 6:
                v vVar = (v) obj;
                LoginRouterActivity loginRouterActivity = (LoginRouterActivity) obj2;
                wVar = loginRouterActivity.ui;
                if (wVar != null) {
                    wVar2 = loginRouterActivity.ui;
                    (wVar2 != null ? wVar2 : null).w.setVisibility(8);
                }
                oz40Var = loginRouterActivity.isShowProgressState;
                oz40Var.setValue(Boolean.FALSE);
                loginRouterActivity.startAppropriateActivity(vVar);
                break;
            case 7:
                ((i1) obj2).j(((i0) obj).toString(), WebAmReporter$Companion$EventPlace.USER_MENU);
                break;
            case 8:
                ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity = (ManagingPlusDevicesHelperActivity) obj2;
                i iVar = (i) obj;
                if (!jl40.l(iVar, g.a)) {
                    if (!jl40.l(iVar, g.b)) {
                        if (!(iVar instanceof h)) {
                            if (!(iVar instanceof com.yandex.passport.internal.ui.sloth.plusdevices.f)) {
                                w511.b();
                                break;
                            } else {
                                managingPlusDevicesHelperActivity.setResult(((com.yandex.passport.internal.ui.sloth.plusdevices.f) iVar).a);
                                managingPlusDevicesHelperActivity.finish();
                            }
                        } else {
                            managingPlusDevicesHelperActivity.goneProgress();
                            z = managingPlusDevicesHelperActivity.isGoingToRecreate;
                            if (!z) {
                                m50Var3 = managingPlusDevicesHelperActivity.managingPlusDevicesLauncher;
                                m50Var3.a(((h) iVar).a);
                            }
                        }
                    } else {
                        com.yandex.passport.internal.ui.sloth.menu.d dVar = new com.yandex.passport.internal.ui.sloth.menu.d(2, managingPlusDevicesHelperActivity);
                        handler = managingPlusDevicesHelperActivity.getHandler();
                        handler.postDelayed(new com.yandex.passport.internal.ui.autologin.d(2, dVar), 2000L);
                    }
                } else {
                    managingPlusDevicesHelperActivity.goneProgress();
                }
                break;
            case 9:
                ManagingPlusDevicesSlothActivity managingPlusDevicesSlothActivity = (ManagingPlusDevicesSlothActivity) obj2;
                managingPlusDevicesSlothActivity.setResult(((Number) obj).intValue(), managingPlusDevicesSlothActivity.getIntent());
                managingPlusDevicesSlothActivity.finish();
                break;
            case 10:
                u uVar = (u) obj;
                d1 d1Var = (d1) obj2;
                com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth event: " + uVar, 8);
                }
                if (!(uVar instanceof com.yandex.passport.sloth.q)) {
                    if (uVar instanceof r) {
                        d1Var.A.e("webview.".concat(((r) uVar).a));
                        break;
                    }
                } else {
                    d1Var.A.e("native.show_webview");
                    break;
                }
                break;
            case 11:
                com.yandex.passport.internal.ui.social.s sVar = (com.yandex.passport.internal.ui.social.s) obj;
                SocialBindingFragment socialBindingFragment = (SocialBindingFragment) obj2;
                if (!jl40.l(sVar, com.yandex.passport.internal.ui.social.p.b)) {
                    if (!jl40.l(sVar, com.yandex.passport.internal.ui.social.p.c)) {
                        if (!(sVar instanceof com.yandex.passport.internal.ui.social.r)) {
                            if (!(sVar instanceof o)) {
                                if (!(sVar instanceof com.yandex.passport.internal.ui.social.q)) {
                                    if (!jl40.l(sVar, com.yandex.passport.internal.ui.social.p.a)) {
                                        w511.b();
                                        break;
                                    } else {
                                        socialBindingFragment.onCancel();
                                    }
                                } else {
                                    socialBindingFragment.onErrorCode(((com.yandex.passport.internal.ui.social.q) sVar).a);
                                }
                            } else {
                                listener = socialBindingFragment.getListener();
                                listener.onSocialAccountBound();
                            }
                        } else {
                            l lVar = ((com.yandex.passport.internal.ui.social.r) sVar).a;
                            socialBindingFragment.startActivityForResult(lVar.a(socialBindingFragment.requireContext()), lVar.b);
                        }
                    } else {
                        listener2 = socialBindingFragment.getListener();
                        socialConfiguration = socialBindingFragment.configuration;
                        if (socialConfiguration == null) {
                            socialConfiguration = null;
                        }
                        listener2.showSocialAuth(false, socialConfiguration, false, null);
                    }
                }
                break;
            case 12:
                com.yandex.passport.internal.ui.social.s sVar2 = (com.yandex.passport.internal.ui.social.s) obj;
                SocialFragment socialFragment = (SocialFragment) obj2;
                if (!jl40.l(sVar2, com.yandex.passport.internal.ui.social.p.b)) {
                    if (!jl40.l(sVar2, com.yandex.passport.internal.ui.social.p.c)) {
                        if (!(sVar2 instanceof com.yandex.passport.internal.ui.social.r)) {
                            if (!(sVar2 instanceof o)) {
                                if (!(sVar2 instanceof com.yandex.passport.internal.ui.social.q)) {
                                    if (!jl40.l(sVar2, com.yandex.passport.internal.ui.social.p.a)) {
                                        w511.b();
                                        break;
                                    } else {
                                        socialFragment.onCancel();
                                    }
                                } else {
                                    socialFragment.onErrorCode(((com.yandex.passport.internal.ui.social.q) sVar2).a);
                                }
                            } else {
                                socialFragment.onSuccessAuth(((o) sVar2).a);
                            }
                        } else {
                            l lVar2 = ((com.yandex.passport.internal.ui.social.r) sVar2).a;
                            socialFragment.startActivityForResult(lVar2.a(socialFragment.requireContext()), lVar2.b);
                        }
                    } else {
                        listener3 = socialFragment.getListener();
                        socialConfiguration2 = socialFragment.configuration;
                        if (socialConfiguration2 == null) {
                            socialConfiguration2 = null;
                        }
                        listener3.showSocialAuth(false, socialConfiguration2, false, null);
                    }
                }
                break;
            case 13:
                ((com.yandex.passport.sloth.t) obj2).a.invoke((String) obj);
                break;
            default:
                ((com.yandex.passport.user_id.w) obj2).W(new com.yandex.passport.user_id.models.j((t2) obj));
                break;
        }
        return zy11Var;
    }
}
