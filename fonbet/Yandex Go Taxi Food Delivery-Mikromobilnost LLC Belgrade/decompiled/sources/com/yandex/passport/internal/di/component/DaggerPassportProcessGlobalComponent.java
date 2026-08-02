package com.yandex.passport.internal.di.component;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ebs.t;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.data.network.ad;
import com.yandex.passport.data.network.d8;
import com.yandex.passport.data.network.d9;
import com.yandex.passport.data.network.e9;
import com.yandex.passport.data.network.ea;
import com.yandex.passport.data.network.ec;
import com.yandex.passport.data.network.f3;
import com.yandex.passport.data.network.f9;
import com.yandex.passport.data.network.fa;
import com.yandex.passport.data.network.g1;
import com.yandex.passport.data.network.ga;
import com.yandex.passport.data.network.h7;
import com.yandex.passport.data.network.i7;
import com.yandex.passport.data.network.j4;
import com.yandex.passport.data.network.j8;
import com.yandex.passport.data.network.k4;
import com.yandex.passport.data.network.k7;
import com.yandex.passport.data.network.k8;
import com.yandex.passport.data.network.le;
import com.yandex.passport.data.network.m1;
import com.yandex.passport.data.network.m4;
import com.yandex.passport.data.network.mb;
import com.yandex.passport.data.network.mc;
import com.yandex.passport.data.network.n2;
import com.yandex.passport.data.network.nb;
import com.yandex.passport.data.network.nc;
import com.yandex.passport.data.network.o6;
import com.yandex.passport.data.network.o9;
import com.yandex.passport.data.network.oc;
import com.yandex.passport.data.network.p9;
import com.yandex.passport.data.network.pa;
import com.yandex.passport.data.network.pb;
import com.yandex.passport.data.network.r0;
import com.yandex.passport.data.network.r9;
import com.yandex.passport.data.network.rd;
import com.yandex.passport.data.network.s1;
import com.yandex.passport.data.network.sa;
import com.yandex.passport.data.network.t4;
import com.yandex.passport.data.network.t7;
import com.yandex.passport.data.network.ta;
import com.yandex.passport.data.network.td;
import com.yandex.passport.data.network.token.o1;
import com.yandex.passport.data.network.token.s0;
import com.yandex.passport.data.network.u7;
import com.yandex.passport.data.network.v8;
import com.yandex.passport.data.network.w7;
import com.yandex.passport.data.network.y3;
import com.yandex.passport.data.network.z0;
import com.yandex.passport.data.network.z1;
import com.yandex.passport.data.network.z4;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.core.auth.Authenticator;
import com.yandex.passport.internal.core.sync.SyncAdapter;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.methods.performer.k1;
import com.yandex.passport.internal.methods.performer.n1;
import com.yandex.passport.internal.network.requester.ImageLoadingClient;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.SetCurrentAccountPropertiesImpl;
import com.yandex.passport.internal.properties.UserMenuProperties;
import com.yandex.passport.internal.report.nd;
import com.yandex.passport.internal.report.reporters.f0;
import com.yandex.passport.internal.report.reporters.h;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.internal.report.reporters.p0;
import com.yandex.passport.internal.report.reporters.q0;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.social.esia.EsiaInternalBindProperties;
import com.yandex.passport.internal.social.esia.SocialismUrlProvider$ActualTheme;
import com.yandex.passport.internal.social.esia.a0;
import com.yandex.passport.internal.social.esia.z;
import com.yandex.passport.internal.ui.authsdk.e;
import com.yandex.passport.internal.ui.authsdk.f;
import com.yandex.passport.internal.ui.authsdk.g;
import com.yandex.passport.internal.ui.authsdk.p;
import com.yandex.passport.internal.ui.authsdk.q;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.chooser.a;
import com.yandex.passport.internal.ui.bouncer.chooser.w;
import com.yandex.passport.internal.ui.bouncer.error.i;
import com.yandex.passport.internal.ui.bouncer.model.c1;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import com.yandex.passport.internal.ui.bouncer.model.e1;
import com.yandex.passport.internal.ui.bouncer.model.f1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.h1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.n0;
import com.yandex.passport.internal.ui.bouncer.o;
import com.yandex.passport.internal.ui.challenge.delete.a1;
import com.yandex.passport.internal.ui.challenge.delete.b1;
import com.yandex.passport.internal.ui.challenge.delete.i0;
import com.yandex.passport.internal.ui.challenge.delete.j0;
import com.yandex.passport.internal.ui.challenge.delete.k0;
import com.yandex.passport.internal.ui.challenge.delete.l0;
import com.yandex.passport.internal.ui.challenge.logout.LogoutBehaviour;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s;
import com.yandex.passport.internal.ui.sloth.authsdk.d0;
import com.yandex.passport.internal.ui.sloth.authsdk.e0;
import com.yandex.passport.internal.ui.sloth.authsdk.g0;
import com.yandex.passport.internal.ui.sloth.authsdk.k;
import com.yandex.passport.internal.ui.sloth.authsdk.l;
import com.yandex.passport.internal.ui.sloth.authsdk.u;
import com.yandex.passport.internal.ui.sloth.authsdk.v;
import com.yandex.passport.internal.ui.sloth.b;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationProperties;
import com.yandex.passport.internal.ui.sloth.ebs.c;
import com.yandex.passport.internal.ui.sloth.ebs.d;
import com.yandex.passport.internal.ui.sloth.ebs.m0;
import com.yandex.passport.internal.ui.sloth.m;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNProperties;
import com.yandex.passport.internal.usecase.h0;
import com.yandex.passport.internal.usecase.j1;
import com.yandex.passport.internal.usecase.l1;
import com.yandex.passport.internal.usecase.o0;
import com.yandex.passport.internal.usecase.p1;
import com.yandex.passport.internal.usecase.t1;
import com.yandex.passport.internal.usecase.u1;
import com.yandex.passport.internal.usecase.ui.t0;
import com.yandex.passport.internal.usecase.ui.v0;
import com.yandex.passport.internal.usecase.ui.x;
import com.yandex.passport.internal.usecase.ui.x0;
import com.yandex.passport.internal.usecase.w0;
import com.yandex.passport.internal.usecase.y;
import com.yandex.passport.internal.usecase.y0;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.n;
import com.yandex.passport.sloth.ui.r;
import defpackage.cfw0;
import defpackage.cma1;
import defpackage.cui;
import defpackage.di00;
import defpackage.ei00;
import defpackage.eqh;
import defpackage.f551;
import defpackage.i5m;
import defpackage.ju9;
import defpackage.kdv0;
import defpackage.my0;
import defpackage.n3w;
import defpackage.n4j0;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qd21;
import defpackage.qxu0;
import defpackage.st41;
import defpackage.tls;
import defpackage.usx0;
import defpackage.v7p;
import defpackage.vw2;
import defpackage.wi7;
import defpackage.xvf0;
import defpackage.yr31;
import defpackage.yvf0;
import io.appmetrica.analytics.IReporterYandex;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class DaggerPassportProcessGlobalComponent {

    /* loaded from: classes15.dex */
    public static final class AuthSdkActivityComponentImpl implements e {
        private final AuthSdkActivityComponentImpl authSdkActivityComponentImpl;
        private yvf0 authSdkUiProvider;
        private yvf0 errorSlabDetailsUiProvider;
        private yvf0 errorSlabMessageUiProvider;
        private yvf0 errorSlabUiProvider;
        private yvf0 getActivityProvider;
        private yvf0 getProgressPropertiesProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;

        private AuthSdkActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, f fVar) {
            this.authSdkActivityComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(fVar);
        }

        private void initialize(f fVar) {
            int i = 0;
            xvf0 b = i5m.b(cma1.i(new g(fVar, i)));
            this.getActivityProvider = b;
            this.errorSlabDetailsUiProvider = new com.yandex.passport.internal.ui.bouncer.error.e(b, i);
            xvf0 b2 = i5m.b(cma1.i(new g(fVar, 1)));
            this.getProgressPropertiesProvider = b2;
            yvf0 yvf0Var = this.getActivityProvider;
            q0 q0Var = new q0(yvf0Var, b2, 2);
            this.errorSlabMessageUiProvider = q0Var;
            xvf0 b3 = i5m.b(cma1.i(new i(yvf0Var, this.errorSlabDetailsUiProvider, q0Var, i)));
            this.errorSlabUiProvider = b3;
            this.authSdkUiProvider = i5m.b(cma1.i(new q(this.getActivityProvider, b3, this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider, this.passportProcessGlobalComponentImpl.provideAnalyticalIdentifiersProvider, this.passportProcessGlobalComponentImpl.provideClipboardControllerProvider)));
        }

        @Override // com.yandex.passport.internal.ui.authsdk.e
        public j getFlagRepository() {
            return (j) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get();
        }

        public ProgressPropertiesImpl getProgressProperties() {
            return (ProgressPropertiesImpl) this.getProgressPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.authsdk.e
        public h getReporter() {
            return (h) this.passportProcessGlobalComponentImpl.authSdkReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.authsdk.e
        public p getUi() {
            return (p) this.authSdkUiProvider.get();
        }
    }

    /* loaded from: classes15.dex */
    public static final class AuthSdkSlothComponentImpl implements com.yandex.passport.internal.ui.sloth.authsdk.i {
        private final AuthSdkSlothComponentImpl authSdkSlothComponentImpl;
        private yvf0 authSdkSlothSlabProvider;
        private yvf0 authSdkSlothUiProvider;
        private yvf0 getActivityProvider;
        private yvf0 getParametersProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothSslErrorHandlerProvider;
        private yvf0 slothStringRepositoryImplProvider;
        private yvf0 slothUiDependenciesFactoryProvider;
        private yvf0 standaloneWishConsumerProvider;

        private AuthSdkSlothComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, d0 d0Var) {
            this.authSdkSlothComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(d0Var);
        }

        private void initialize(d0 d0Var) {
            this.getActivityProvider = i5m.b(cma1.i(new e0(d0Var, 0)));
            this.slothStringRepositoryImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothDebugInformationDelegateImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            int i = 1;
            this.slothNetworkStatusImplProvider = new q0(this.getActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i);
            this.slothSslErrorHandlerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 20);
            this.slothUiDependenciesFactoryProvider = new m(this.getActivityProvider, this.slothStringRepositoryImplProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, this.slothDebugInformationDelegateImplProvider, this.slothNetworkStatusImplProvider, this.passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, this.slothSslErrorHandlerProvider, this.passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, 22)));
            this.standaloneWishConsumerProvider = b;
            xvf0 b2 = i5m.b(cma1.i(new c1(this.slothUiDependenciesFactoryProvider, b, 3)));
            this.authSdkSlothSlabProvider = b2;
            this.authSdkSlothUiProvider = i5m.b(cma1.i(new b1(b2, 4)));
            this.getParametersProvider = i5m.b(cma1.i(new e0(d0Var, i)));
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.i
        public SlothParams getParams() {
            return (SlothParams) this.getParametersProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.i
        public g0 getUi() {
            return (g0) this.authSdkSlothUiProvider.get();
        }
    }

    /* loaded from: classes15.dex */
    public static final class AuthSdkSlothComposeComponentBuilder implements com.yandex.passport.internal.ui.sloth.authsdk.j {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private SlothParams setSlothParams;

        private AuthSdkSlothComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.j
        public k build() {
            q5z.f(SlothParams.class, this.setSlothParams);
            q5z.f(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            q5z.f(Activity.class, this.setActivity);
            return new AuthSdkSlothComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new l(), this.setSlothParams, this.setProgressProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.j
        public AuthSdkSlothComposeComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.j
        public AuthSdkSlothComposeComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.j
        public AuthSdkSlothComposeComponentBuilder setSlothParams(SlothParams slothParams) {
            slothParams.getClass();
            this.setSlothParams = slothParams;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class AuthSdkSlothComposeComponentImpl implements k {
        private final AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl;
        private final l authSdkSlothComposeModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 providePerformConfigurationProvider;
        private yvf0 setActivityProvider;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final SlothParams setSlothParams;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private AuthSdkSlothComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, l lVar, SlothParams slothParams, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.authSdkSlothComposeComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.authSdkSlothComposeModule = lVar;
            this.setSlothParams = slothParams;
            this.setProgressProperties = gVar;
            initialize(eVar, lVar, slothParams, gVar, activity);
        }

        private u authSdkSlothComposeStoreFactory() {
            return new u(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get(), uid());
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, l lVar, SlothParams slothParams, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.providePerformConfigurationProvider = new com.yandex.passport.internal.ui.bouncer.f(lVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 5);
            this.setActivityProvider = n3w.a(activity);
        }

        private Uid uid() {
            l lVar = this.authSdkSlothComposeModule;
            SlothParams slothParams = this.setSlothParams;
            lVar.getClass();
            Uid uid = ((n) slothParams.getVariant()).x;
            q5z.i(uid);
            return uid;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.k
        public SlothParams getSlothParams() {
            return this.setSlothParams;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.k
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss4_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.authSdkSlothComposeComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.k
        public v getViewModelFactory() {
            return new v(authSdkSlothComposeStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.k
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class BiometricVerificationComponentBuilder implements c {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private BiometricVerificationProperties setProperties;

        private BiometricVerificationComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.c
        public d build() {
            q5z.f(BiometricVerificationProperties.class, this.setProperties);
            q5z.f(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            q5z.f(Activity.class, this.setActivity);
            return new BiometricVerificationComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.sloth.ebs.e(), this.setProperties, this.setProgressProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.c
        public BiometricVerificationComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.c
        public BiometricVerificationComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.c
        public BiometricVerificationComponentBuilder setProperties(BiometricVerificationProperties biometricVerificationProperties) {
            biometricVerificationProperties.getClass();
            this.setProperties = biometricVerificationProperties;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class BiometricVerificationComponentImpl implements d {
        private final BiometricVerificationComponentImpl biometricVerificationComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 providePerformConfigurationProvider;
        private yvf0 setActivityProvider;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final BiometricVerificationProperties setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private BiometricVerificationComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.ebs.e eVar2, BiometricVerificationProperties biometricVerificationProperties, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.biometricVerificationComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = biometricVerificationProperties;
            this.setProgressProperties = gVar;
            initialize(eVar, eVar2, biometricVerificationProperties, gVar, activity);
        }

        private com.yandex.passport.internal.ui.sloth.ebs.e0 biometricVerificationStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.ebs.e0(this.passportProcessGlobalComponentImpl.setApplicationContext, com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.setProperties, (t) this.passportProcessGlobalComponentImpl.providePassportBiometricApiProvider.get(), (com.yandex.passport.internal.usecase.d) this.passportProcessGlobalComponentImpl.biometricTrackInitUseCaseProvider.get(), (y0) this.passportProcessGlobalComponentImpl.makeJwtTokenUseCaseProvider.get(), (l1) this.passportProcessGlobalComponentImpl.startBiometricSessionUseCaseProvider.get(), (com.yandex.passport.internal.usecase.f) this.passportProcessGlobalComponentImpl.checkAgeByTrackIdUseCaseProvider.get(), cryptoSdkInitializationStorage(), (com.yandex.passport.internal.report.reporters.v) this.passportProcessGlobalComponentImpl.ebsReporterProvider.get());
        }

        private com.yandex.passport.internal.usecase.l cryptoSdkInitializationStorage() {
            return new com.yandex.passport.internal.usecase.l(this.passportProcessGlobalComponentImpl.setApplicationContext);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.ebs.e eVar2, BiometricVerificationProperties biometricVerificationProperties, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.providePerformConfigurationProvider = new com.yandex.passport.internal.ui.bouncer.f(eVar2, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 6);
            this.setActivityProvider = n3w.a(activity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.d
        public t getBiometricApi() {
            return (t) this.passportProcessGlobalComponentImpl.providePassportBiometricApiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.d
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.setProgressProperties;
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.d
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss5_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.biometricVerificationComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.d
        public m0 getViewModelFactory() {
            return new m0(biometricVerificationStoreFactory(), (t) this.passportProcessGlobalComponentImpl.providePassportBiometricApiProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.d
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class BouncerActivityComponentImpl implements com.yandex.passport.internal.ui.bouncer.c {
        private yvf0 accountDeleteDialogProvider;
        private yvf0 accountSlabProvider;
        private yvf0 addNewSlabProvider;
        private yvf0 baseSlothUiSettingsProvider;
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final com.yandex.passport.internal.ui.bouncer.d bouncerActivityModule;
        private yvf0 bouncerActivityRendererProvider;
        private yvf0 bouncerActivityUiProvider;
        private yvf0 bouncerComposeViewProvider;
        private yvf0 bouncerMasterChooserSlabProvider;
        private yvf0 bouncerSlothComposeSlabProvider;
        private yvf0 bouncerSlothSlabProvider;
        private yvf0 bouncerSlothWishConsumerProvider;
        private yvf0 bouncerWishSourceProvider;
        private yvf0 createProfileSlabProvider;
        private yvf0 customLogoSlabProvider;
        private yvf0 errorSlabDetailsUiProvider;
        private yvf0 errorSlabMessageUiProvider;
        private yvf0 errorSlabProvider;
        private yvf0 errorSlabUiProvider;
        private yvf0 fallbackSlabProvider;
        private yvf0 getActivityProvider;
        private yvf0 getBouncerActivityProvider;
        private yvf0 getBouncerMasterChooserComponentBuilderProvider;
        private yvf0 getBouncerSlothComposeComponentBuilderProvider;
        private yvf0 getComponentActivityProvider;
        private yvf0 getLoginPropertiesProvider;
        private yvf0 getProgressPropertiesProvider;
        private yvf0 getRendererComponentBuilderProvider;
        private yvf0 getTimeTrackerProvider;
        private yvf0 loadingSlabProvider;
        private yvf0 loadingUiProvider;
        private yvf0 loadingWithBackgroundSlabProvider;
        private yvf0 loadingWithBackgroundUiProvider;
        private yvf0 memberAccountSlabProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 phonishSlabProvider;
        private yvf0 provideAppThemeProvider;
        private yvf0 provideBouncerRendererProvider;
        private yvf0 provideRendererProvider;
        private yvf0 provideSlothWebViewSettingsProvider;
        private yvf0 roundaboutAccountProcessingProvider;
        private yvf0 roundaboutAdapterProvider;
        private yvf0 roundaboutBottomsheetUiProvider;
        private yvf0 roundaboutFullscreenUiProvider;
        private yvf0 roundaboutInnerSlabProvider;
        private yvf0 roundaboutInnerUiProvider;
        private yvf0 roundaboutSlabProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothSslErrorHandlerProvider;
        private yvf0 slothStringRepositoryImplProvider;
        private yvf0 slothUiDependenciesFactoryProvider;
        private yvf0 waitConnectionSlabProvider;
        private yvf0 waitConnectionUiProvider;
        private yvf0 webUrlCheckerProvider;
        private yvf0 webViewControllerProvider;
        private yvf0 webViewSlabProvider;
        private yvf0 webViewUiProvider;
        private yvf0 whiteLabelLogoSlabProvider;
        private yvf0 wrongAccountSlabProvider;
        private yvf0 yandexLogoSlabProvider;

        private BouncerActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.bouncer.d dVar) {
            this.bouncerActivityComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityModule = dVar;
            initialize(dVar);
        }

        private void initialize(com.yandex.passport.internal.ui.bouncer.d dVar) {
            int i = 2;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.e(dVar, i)));
            this.getComponentActivityProvider = b;
            int i2 = 1;
            this.bouncerWishSourceProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.m(b, i2)));
            int i3 = 0;
            this.getActivityProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.e(dVar, i3)));
            this.slothStringRepositoryImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothDebugInformationDelegateImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            this.slothNetworkStatusImplProvider = new q0(this.getActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i2);
            this.slothSslErrorHandlerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 20);
            this.slothUiDependenciesFactoryProvider = new m(this.getActivityProvider, this.slothStringRepositoryImplProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, this.slothDebugInformationDelegateImplProvider, this.slothNetworkStatusImplProvider, this.passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, this.slothSslErrorHandlerProvider, this.passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.e(dVar, 4)));
            this.getProgressPropertiesProvider = b2;
            this.baseSlothUiSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(b2, b.a, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 7)));
            this.bouncerSlothWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.bouncerWishSourceProvider, 13)));
            int i4 = 3;
            xvf0 b3 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.e(dVar, i4)));
            this.getLoginPropertiesProvider = b3;
            xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.h(dVar, b3, i2)));
            this.provideSlothWebViewSettingsProvider = b4;
            this.bouncerSlothSlabProvider = i5m.b(cma1.i(new q(this.slothUiDependenciesFactoryProvider, this.baseSlothUiSettingsProvider, this.bouncerSlothWishConsumerProvider, b4, this.passportProcessGlobalComponentImpl.setPropertiesProvider)));
            xvf0 b5 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.e(dVar, i2)));
            this.getBouncerActivityProvider = b5;
            this.bouncerActivityUiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.m(b5, i3)));
            this.createProfileSlabProvider = new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getActivityProvider, this.bouncerWishSourceProvider, this.passportProcessGlobalComponentImpl.createProfileReporterProvider, 6);
            yvf0 yvf0Var = this.getActivityProvider;
            yvf0 yvf0Var2 = this.bouncerWishSourceProvider;
            int i5 = 11;
            this.addNewSlabProvider = new q0(yvf0Var, yvf0Var2, i5);
            int i6 = 9;
            xvf0 b6 = i5m.b(cma1.i(new q0(yvf0Var, yvf0Var2, i6)));
            this.accountDeleteDialogProvider = b6;
            yvf0 yvf0Var3 = this.getActivityProvider;
            yvf0 yvf0Var4 = this.bouncerWishSourceProvider;
            com.yandex.passport.internal.ui.bouncer.roundabout.items.d dVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.d(yvf0Var3, yvf0Var4, b6, i2);
            this.phonishSlabProvider = dVar2;
            com.yandex.passport.internal.ui.bouncer.roundabout.items.d dVar3 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.d(yvf0Var3, yvf0Var4, b6, i3);
            this.accountSlabProvider = dVar3;
            int i7 = 12;
            q0 q0Var = new q0(yvf0Var3, yvf0Var4, i7);
            this.memberAccountSlabProvider = q0Var;
            xvf0 b7 = i5m.b(cma1.i(new qd21(this.createProfileSlabProvider, this.addNewSlabProvider, dVar2, dVar3, q0Var, 13)));
            this.roundaboutAdapterProvider = b7;
            this.roundaboutInnerUiProvider = i5m.b(cma1.i(new c1(this.getActivityProvider, b7, i)));
            this.whiteLabelLogoSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, i7)));
            int i8 = 10;
            this.yandexLogoSlabProvider = i5m.b(cma1.i(new q0(this.getActivityProvider, this.passportProcessGlobalComponentImpl.bindUiLanguageProvider, i8)));
            xvf0 b8 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, i6)));
            this.customLogoSlabProvider = b8;
            this.roundaboutInnerSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.j(this.roundaboutInnerUiProvider, this.bouncerWishSourceProvider, this.whiteLabelLogoSlabProvider, this.yandexLogoSlabProvider, b8, this.passportProcessGlobalComponentImpl.setPropertiesProvider)));
            this.roundaboutFullscreenUiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, i5)));
            this.roundaboutBottomsheetUiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, i8)));
            xvf0 b9 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.chooser.m(this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider, this.roundaboutAdapterProvider, this.passportProcessGlobalComponentImpl.bouncerReporterProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, 4)));
            this.roundaboutAccountProcessingProvider = b9;
            this.roundaboutSlabProvider = i5m.b(cma1.i(new m(this.getBouncerActivityProvider, this.roundaboutInnerSlabProvider, this.roundaboutFullscreenUiProvider, this.roundaboutBottomsheetUiProvider, b9, this.bouncerWishSourceProvider, this.passportProcessGlobalComponentImpl.bouncerReporterProvider, this.passportProcessGlobalComponentImpl.badgesReporterProvider)));
            xvf0 b10 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getActivityProvider, this.getProgressPropertiesProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, i2)));
            this.loadingUiProvider = b10;
            this.loadingSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.loading.d(b10, this.bouncerWishSourceProvider, i3)));
            xvf0 b11 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getActivityProvider, this.getProgressPropertiesProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, i)));
            this.loadingWithBackgroundUiProvider = b11;
            this.loadingWithBackgroundSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.loading.d(b11, this.bouncerWishSourceProvider, i2)));
            yvf0 yvf0Var5 = this.getActivityProvider;
            com.yandex.passport.internal.ui.bouncer.error.e eVar = new com.yandex.passport.internal.ui.bouncer.error.e(yvf0Var5, i3);
            this.errorSlabDetailsUiProvider = eVar;
            q0 q0Var2 = new q0(yvf0Var5, this.getProgressPropertiesProvider, i);
            this.errorSlabMessageUiProvider = q0Var2;
            xvf0 b12 = i5m.b(cma1.i(new i(yvf0Var5, eVar, q0Var2, i3)));
            this.errorSlabUiProvider = b12;
            this.errorSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.j(b12, this.bouncerWishSourceProvider, this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider, this.passportProcessGlobalComponentImpl.provideAnalyticalIdentifiersProvider, this.passportProcessGlobalComponentImpl.provideClipboardControllerProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider)));
            this.fallbackSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getBouncerActivityProvider, this.bouncerWishSourceProvider, this.passportProcessGlobalComponentImpl.bouncerReporterProvider, i3)));
            xvf0 b13 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getActivityProvider, this.getProgressPropertiesProvider, i8)));
            this.webViewUiProvider = b13;
            this.webViewControllerProvider = i5m.b(cma1.i(new b1(b13, i)));
            this.webUrlCheckerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.urlCheckerProvider, 15);
            this.webViewSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.common.web.h(this.webViewUiProvider, this.getActivityProvider, this.webViewControllerProvider, this.passportProcessGlobalComponentImpl.provideEventReporterProvider, this.webUrlCheckerProvider, 0)));
            this.wrongAccountSlabProvider = i5m.b(cma1.i(new q0(this.errorSlabUiProvider, this.bouncerWishSourceProvider, i4)));
            com.yandex.passport.internal.ui.bouncer.fallback.d dVar4 = new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getActivityProvider, this.getProgressPropertiesProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, i4);
            this.waitConnectionUiProvider = dVar4;
            this.waitConnectionSlabProvider = i5m.b(cma1.i(new i(dVar4, this.bouncerWishSourceProvider, this.slothNetworkStatusImplProvider)));
            this.getTimeTrackerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.e(dVar, 5)));
            yvf0 yvf0Var6 = new yvf0() { // from class: com.yandex.passport.internal.di.component.DaggerPassportProcessGlobalComponent.BouncerActivityComponentImpl.1
                @Override // defpackage.yvf0
                public a get() {
                    return new BouncerMasterChooserComponentBuilder(BouncerActivityComponentImpl.this.passportProcessGlobalComponentImpl, BouncerActivityComponentImpl.this.bouncerActivityComponentImpl);
                }
            };
            this.getBouncerMasterChooserComponentBuilderProvider = yvf0Var6;
            this.bouncerMasterChooserSlabProvider = new com.yandex.passport.internal.ui.bouncer.chooser.m(this.getBouncerActivityProvider, this.bouncerWishSourceProvider, yvf0Var6, this.passportProcessGlobalComponentImpl.createProfileReporterProvider, 0);
            this.getBouncerSlothComposeComponentBuilderProvider = new yvf0() { // from class: com.yandex.passport.internal.di.component.DaggerPassportProcessGlobalComponent.BouncerActivityComponentImpl.2
                @Override // defpackage.yvf0
                public com.yandex.passport.internal.ui.bouncer.sloth.b get() {
                    return new BouncerSlothComposeComponentBuilder(BouncerActivityComponentImpl.this.passportProcessGlobalComponentImpl, BouncerActivityComponentImpl.this.bouncerActivityComponentImpl);
                }
            };
            this.bouncerSlothComposeSlabProvider = new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getActivityProvider, this.passportProcessGlobalComponentImpl.provideIsWhiteLabelProvider, this.getBouncerSlothComposeComponentBuilderProvider, 8);
            this.bouncerActivityRendererProvider = i5m.b(cma1.i(new ju9(this.getActivityProvider, this.bouncerSlothSlabProvider, this.bouncerActivityUiProvider, this.bouncerWishSourceProvider, this.roundaboutSlabProvider, this.loadingSlabProvider, this.loadingWithBackgroundSlabProvider, this.errorSlabProvider, this.fallbackSlabProvider, this.webViewSlabProvider, this.wrongAccountSlabProvider, this.waitConnectionSlabProvider, this.passportProcessGlobalComponentImpl.bouncerReporterProvider, this.getTimeTrackerProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, this.getProgressPropertiesProvider, this.bouncerMasterChooserSlabProvider, this.bouncerSlothComposeSlabProvider)));
            yvf0 yvf0Var7 = new yvf0() { // from class: com.yandex.passport.internal.di.component.DaggerPassportProcessGlobalComponent.BouncerActivityComponentImpl.3
                @Override // defpackage.yvf0
                public com.yandex.passport.internal.ui.bouncer.u get() {
                    return new RendererComponentBuilder(BouncerActivityComponentImpl.this.passportProcessGlobalComponentImpl, BouncerActivityComponentImpl.this.bouncerActivityComponentImpl);
                }
            };
            this.getRendererComponentBuilderProvider = yvf0Var7;
            this.provideAppThemeProvider = new com.yandex.passport.internal.ui.bouncer.f(dVar, this.getLoginPropertiesProvider, 0);
            this.bouncerComposeViewProvider = i5m.b(cma1.i(new o(yvf0Var7, this.getBouncerActivityProvider, this.passportProcessGlobalComponentImpl.provideIsWhiteLabelProvider, this.provideAppThemeProvider, this.getTimeTrackerProvider, this.passportProcessGlobalComponentImpl.bouncerReporterProvider, 0)));
            xvf0 b14 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g(dVar, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, this.bouncerActivityRendererProvider, this.bouncerComposeViewProvider, 0)));
            this.provideBouncerRendererProvider = b14;
            this.provideRendererProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.h(dVar, b14, 0)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.yandex.passport.common.ui.progress.g progressProperties() {
            com.yandex.passport.internal.ui.bouncer.d dVar = this.bouncerActivityModule;
            LoginProperties loginProperties = (LoginProperties) this.getLoginPropertiesProvider.get();
            dVar.getClass();
            return com.yandex.passport.api.mapper.b.a(loginProperties.getVisualProperties().getProgressProperties());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.yandex.passport.internal.ui.sloth.g slothDebugInformationDelegateImpl() {
            return new com.yandex.passport.internal.ui.sloth.g((com.yandex.passport.internal.util.e) this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.yandex.passport.internal.sloth.l slothNetworkStatusImpl() {
            return new com.yandex.passport.internal.sloth.l((Activity) this.getActivityProvider.get(), (com.yandex.passport.common.coroutine.e) this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.yandex.passport.internal.ui.sloth.k slothStringRepositoryImpl() {
            return new com.yandex.passport.internal.ui.sloth.k(new com.yandex.passport.internal.ui.g());
        }

        public a getBouncerMasterChooserComponentBuilder() {
            return new BouncerMasterChooserComponentBuilder(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.c
        public com.yandex.passport.internal.ui.bouncer.p getBouncerRenderer() {
            return (com.yandex.passport.internal.ui.bouncer.p) this.provideBouncerRendererProvider.get();
        }

        public com.yandex.passport.internal.ui.bouncer.sloth.b getBouncerSlothComposeComponentBuilder() {
            return new BouncerSlothComposeComponentBuilder(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl);
        }

        public LoginProperties getLoginProperties() {
            return (LoginProperties) this.getLoginPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.c
        public com.yandex.passport.common.mvi.f getRenderer() {
            return (com.yandex.passport.common.mvi.f) this.provideRendererProvider.get();
        }

        public com.yandex.passport.internal.ui.bouncer.u getRendererComponentBuilder() {
            return new RendererComponentBuilder(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.c
        public com.yandex.passport.internal.ui.bouncer.t getWishSource() {
            return (com.yandex.passport.internal.ui.bouncer.t) this.bouncerWishSourceProvider.get();
        }
    }

    /* loaded from: classes15.dex */
    public static final class BouncerChallengeComponentBuilder implements com.yandex.passport.internal.ui.bouncer.challenge.a {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.v setWebCase;

        private BouncerChallengeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.a
        public com.yandex.passport.internal.ui.bouncer.challenge.b build() {
            q5z.f(com.yandex.passport.internal.ui.challenge.v.class, this.setWebCase);
            return new BouncerChallengeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), this.setWebCase);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.a
        public BouncerChallengeComponentBuilder setWebCase(com.yandex.passport.internal.ui.challenge.v vVar) {
            vVar.getClass();
            this.setWebCase = vVar;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class BouncerChallengeComponentImpl implements com.yandex.passport.internal.ui.bouncer.challenge.b {
        private final BouncerChallengeComponentImpl bouncerChallengeComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.internal.ui.challenge.v setWebCase;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private BouncerChallengeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.v vVar) {
            this.bouncerChallengeComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setWebCase = vVar;
        }

        private com.yandex.passport.internal.ui.bouncer.challenge.n bouncerChallengeStoreFactory() {
            return new com.yandex.passport.internal.ui.bouncer.challenge.n(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.setWebCase);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.b
        public c0 getEventReporter() {
            return (c0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.b
        public com.yandex.passport.internal.ui.common.web.d getUrlChecker() {
            return new com.yandex.passport.internal.ui.common.web.d(this.passportProcessGlobalComponentImpl.urlChecker());
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.b
        public com.yandex.passport.internal.ui.bouncer.challenge.p getViewModelFactory() {
            return new com.yandex.passport.internal.ui.bouncer.challenge.p(bouncerChallengeStoreFactory());
        }
    }

    /* loaded from: classes15.dex */
    public static final class BouncerMasterChooserComponentImpl implements com.yandex.passport.internal.ui.bouncer.chooser.b {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final BouncerMasterChooserComponentImpl bouncerMasterChooserComponentImpl;
        private final com.yandex.passport.internal.ui.bouncer.chooser.c bouncerMasterChooserModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final Boolean setCreateMasterEnterPhoneNumberOption;
        private final List<d1> setMasters;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private BouncerMasterChooserComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl, com.yandex.passport.internal.ui.bouncer.chooser.c cVar, com.yandex.passport.internal.ui.common.e eVar, List<d1> list, Boolean bool) {
            this.bouncerMasterChooserComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
            this.storeFactoryModule = eVar;
            this.setMasters = list;
            this.setCreateMasterEnterPhoneNumberOption = bool;
            this.bouncerMasterChooserModule = cVar;
        }

        private com.yandex.passport.internal.ui.bouncer.chooser.v bouncerMasterChooserStoreFactory() {
            return new com.yandex.passport.internal.ui.bouncer.chooser.v(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.passportProcessGlobalComponentImpl.findMasterUidAccountUseCase(), this.setMasters, this.setCreateMasterEnterPhoneNumberOption.booleanValue());
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public AccountListBranding getBranding() {
            com.yandex.passport.internal.ui.bouncer.chooser.c cVar = this.bouncerMasterChooserModule;
            LoginProperties loginProperties = (LoginProperties) this.bouncerActivityComponentImpl.getLoginPropertiesProvider.get();
            cVar.getClass();
            AccountListBranding branding = loginProperties.getVisualProperties().getAccountListProperties().getBranding();
            q5z.i(branding);
            return branding;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.bouncerActivityComponentImpl.progressProperties();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public com.yandex.passport.common.ui.lang.b getUiLanguageProvider() {
            return (com.yandex.passport.common.ui.lang.b) this.passportProcessGlobalComponentImpl.bindUiLanguageProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public w getViewModelFactory() {
            return new w(bouncerMasterChooserStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class BouncerModelComponentImpl implements f1 {
        private yvf0 accountSortUseCaseProvider;
        private yvf0 additionalInfoSaverProvider;
        private yvf0 bouncerActorsProvider;
        private yvf0 bouncerEventsProvider;
        private yvf0 bouncerMiddlewaresProvider;
        private final BouncerModelComponentImpl bouncerModelComponentImpl;
        private yvf0 bouncerModelProvider;
        private yvf0 bouncerReducerProvider;
        private yvf0 bouncerWishMapperProvider;
        private yvf0 challengeFinishMiddlewareProvider;
        private yvf0 challengeStartMiddlewareProvider;
        private yvf0 checkConnectionMiddlewareProvider;
        private yvf0 createProfileActorProvider;
        private yvf0 deleteAccountActorProvider;
        private yvf0 deleteBlockedMiddlewareProvider;
        private yvf0 finishRegistrationActorProvider;
        private yvf0 getChildrenInfoUseCaseProvider;
        private yvf0 getClientTokenActorProvider;
        private yvf0 getInitialStateProvider;
        private yvf0 getTimeTrackerProvider;
        private yvf0 loadAccountsMiddlewareProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 processEventActorProvider;
        private yvf0 processFallbackResultMiddlewareProvider;
        private yvf0 reloginActorProvider;
        private yvf0 restartActorProvider;
        private yvf0 routeActorProvider;
        private yvf0 selectAccountByUidActorProvider;
        private yvf0 selectAccountMiddlewareProvider;
        private yvf0 setCurrentAccountMiddlewareProvider;
        private yvf0 showMansionMiddlewareProvider;
        private yvf0 slothSessionFactoryProvider;
        private yvf0 socialActionActorProvider;
        private yvf0 socialActionResultActorProvider;
        private yvf0 sortAccountsMiddlewareProvider;
        private yvf0 startSlothMiddlewareProvider;
        private yvf0 verifyResultActorProvider;

        private BouncerModelComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.bouncer.j jVar) {
            this.bouncerModelComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(jVar);
        }

        private void initialize(com.yandex.passport.internal.ui.bouncer.j jVar) {
            this.bouncerReducerProvider = i5m.c(com.yandex.passport.internal.ui.bouncer.model.i1.a);
            int i = 4;
            this.deleteAccountActorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider, i)));
            this.getClientTokenActorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.chooser.m(this.passportProcessGlobalComponentImpl.getClientTokenUseCaseProvider, this.passportProcessGlobalComponentImpl.findMasterUidAccountUseCaseProvider, this.passportProcessGlobalComponentImpl.authByMuidTokenUseCaseProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, 1)));
            this.verifyResultActorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.chooser.m(this.passportProcessGlobalComponentImpl.flagRepositoryProvider, this.passportProcessGlobalComponentImpl.provideBaseUrlDispatcherProvider, this.passportProcessGlobalComponentImpl.currentAccountManagerProvider, this.passportProcessGlobalComponentImpl.accountFilterRepositoryProvider, 3)));
            int i2 = 5;
            this.finishRegistrationActorProvider = i5m.b(cma1.i(new q0(this.passportProcessGlobalComponentImpl.getUpgradeUrlUseCaseProvider, this.passportProcessGlobalComponentImpl.accountUpgradeReporterProvider, i2)));
            this.processEventActorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.passportProcessGlobalComponentImpl.bindPhoneNumberReporterProvider, this.passportProcessGlobalComponentImpl.loadAccountsUseCaseProvider, this.passportProcessGlobalComponentImpl.socialActionReporterProvider, i)));
            this.routeActorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.currentAccountManagerProvider, i2)));
            this.restartActorProvider = i5m.c(n0.a);
            this.reloginActorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, i2)));
            int i3 = 7;
            this.selectAccountByUidActorProvider = i5m.b(cma1.i(new q0(this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider, this.passportProcessGlobalComponentImpl.memberAccountRepositoryProvider, i3)));
            this.createProfileActorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.findMasterUidAccountUseCaseProvider, 3)));
            this.socialActionResultActorProvider = i5m.c(h1.a);
            int i4 = 8;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.setApplicationContextProvider, i4)));
            this.socialActionActorProvider = b;
            this.bouncerActorsProvider = i5m.b(cma1.i(new wi7(b, this.deleteAccountActorProvider, this.getClientTokenActorProvider, this.verifyResultActorProvider, this.finishRegistrationActorProvider, this.processEventActorProvider, this.routeActorProvider, this.restartActorProvider, this.reloginActorProvider, this.selectAccountByUidActorProvider, this.createProfileActorProvider, this.socialActionResultActorProvider)));
            this.getChildrenInfoUseCaseProvider = new q0(this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider, this.passportProcessGlobalComponentImpl.provideDatabaseHelperProvider, 14);
            this.loadAccountsMiddlewareProvider = i5m.b(cma1.i(new o(this.passportProcessGlobalComponentImpl.loadAccountsUseCaseProvider, this.getChildrenInfoUseCaseProvider, this.passportProcessGlobalComponentImpl.getAllowedBadgesUseCaseProvider, this.passportProcessGlobalComponentImpl.getBadgesForAccountUseCaseProvider, this.passportProcessGlobalComponentImpl.getNotLoggedInMembersUseCaseProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, 1)));
            q0 q0Var = new q0(this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, 13);
            this.accountSortUseCaseProvider = q0Var;
            int i5 = 1;
            this.sortAccountsMiddlewareProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.j(i5, q0Var)));
            int i6 = 6;
            this.selectAccountMiddlewareProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.badgesReporterProvider, i6)));
            this.showMansionMiddlewareProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.chooser.m(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, this.passportProcessGlobalComponentImpl.bindPhoneNumberReporterProvider, this.passportProcessGlobalComponentImpl.immediateAccountsRetrieverProvider, 2)));
            this.slothSessionFactoryProvider = i5m.b(cma1.i(new q0(this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, this.passportProcessGlobalComponentImpl.slothBouncerPerformConfigurationProvider, i4)));
            this.additionalInfoSaverProvider = i5m.c(com.yandex.passport.internal.ui.bouncer.model.b.a);
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.k(jVar, i5)));
            this.getTimeTrackerProvider = b2;
            int i7 = 0;
            xvf0 b3 = i5m.b(cma1.i(new c1(this.additionalInfoSaverProvider, b2, i7)));
            this.bouncerEventsProvider = b3;
            this.startSlothMiddlewareProvider = i5m.b(cma1.i(new c1(this.slothSessionFactoryProvider, b3, i5)));
            this.processFallbackResultMiddlewareProvider = i5m.b(cma1.i(new q0(this.bouncerEventsProvider, this.passportProcessGlobalComponentImpl.bouncerReporterProvider, i6)));
            this.challengeStartMiddlewareProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.challengeHelperProvider, 2)));
            this.challengeFinishMiddlewareProvider = i5m.c(com.yandex.passport.internal.ui.bouncer.model.middleware.f.a);
            this.setCurrentAccountMiddlewareProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.setCurrentAccountUseCaseProvider, i3)));
            this.deleteBlockedMiddlewareProvider = i5m.b(cma1.i(new q0(this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider, this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider, 4)));
            xvf0 c = i5m.c(com.yandex.passport.internal.ui.bouncer.model.middleware.o.a);
            this.checkConnectionMiddlewareProvider = c;
            this.bouncerMiddlewaresProvider = i5m.b(cma1.i(new kdv0(this.loadAccountsMiddlewareProvider, this.sortAccountsMiddlewareProvider, this.selectAccountMiddlewareProvider, this.showMansionMiddlewareProvider, this.startSlothMiddlewareProvider, this.processFallbackResultMiddlewareProvider, this.challengeStartMiddlewareProvider, this.challengeFinishMiddlewareProvider, this.setCurrentAccountMiddlewareProvider, this.deleteBlockedMiddlewareProvider, c)));
            this.bouncerWishMapperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.bindPhoneNumberReporterProvider, i5)));
            xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.k(jVar, i7)));
            this.getInitialStateProvider = b4;
            this.bouncerModelProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.j(this.bouncerReducerProvider, this.bouncerActorsProvider, this.bouncerMiddlewaresProvider, this.bouncerWishMapperProvider, this.bouncerEventsProvider, b4)));
        }

        @Override // com.yandex.passport.internal.ui.bouncer.model.f1
        public e1 getModel() {
            return (e1) this.bouncerModelProvider.get();
        }
    }

    /* loaded from: classes15.dex */
    public static final class BouncerSlothComposeComponentBuilder implements com.yandex.passport.internal.ui.bouncer.sloth.b {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.sloth.ui.b1 slothUiInteractor;

        private BouncerSlothComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.sloth.b
        public com.yandex.passport.internal.ui.bouncer.sloth.c build() {
            q5z.f(com.yandex.passport.sloth.ui.b1.class, this.slothUiInteractor);
            return new BouncerSlothComposeComponentImpl(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl, new com.yandex.passport.internal.ui.bouncer.sloth.d(), this.slothUiInteractor);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.sloth.b
        public BouncerSlothComposeComponentBuilder slothUiInteractor(com.yandex.passport.sloth.ui.b1 b1Var) {
            b1Var.getClass();
            this.slothUiInteractor = b1Var;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class BouncerSlothComposeComponentImpl implements com.yandex.passport.internal.ui.bouncer.sloth.c {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final BouncerSlothComposeComponentImpl bouncerSlothComposeComponentImpl;
        private final com.yandex.passport.internal.ui.bouncer.sloth.d bouncerSlothComposeModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.sloth.ui.b1 slothUiInteractor;

        private BouncerSlothComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl, com.yandex.passport.internal.ui.bouncer.sloth.d dVar, com.yandex.passport.sloth.ui.b1 b1Var) {
            this.bouncerSlothComposeComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
            this.slothUiInteractor = b1Var;
            this.bouncerSlothComposeModule = dVar;
        }

        private com.yandex.passport.internal.ui.sloth.f slothComposeUiReporterImpl() {
            return new com.yandex.passport.internal.ui.sloth.f(this.passportProcessGlobalComponentImpl.getSlothReportDelegate());
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.bouncerActivityComponentImpl.progressProperties();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothComposeUIReporter() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.f slothComposeUiReporterImpl = slothComposeUiReporterImpl();
            dVar.getClass();
            return slothComposeUiReporterImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.g slothDebugInformationDelegateImpl = this.bouncerActivityComponentImpl.slothDebugInformationDelegateImpl();
            dVar.getClass();
            return slothDebugInformationDelegateImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public r getSlothNetworkStatus() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.sloth.l slothNetworkStatusImpl = this.bouncerActivityComponentImpl.slothNetworkStatusImpl();
            dVar.getClass();
            return slothNetworkStatusImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.b1 getSlothUiInteractor() {
            return this.slothUiInteractor;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.h getSlothUrlProvider() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) this.passportProcessGlobalComponentImpl.slothUrlProviderImplProvider.get();
            dVar.getClass();
            return oVar;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.data.c0 getSlothVariant() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.sloth.ui.b1 b1Var = this.slothUiInteractor;
            dVar.getClass();
            com.yandex.passport.sloth.data.c0 c0Var = ((com.yandex.passport.sloth.b1) b1Var).a;
            q5z.i(c0Var);
            return c0Var;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.bouncerActivityComponentImpl.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.q getSlothWishConsumer() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = (com.yandex.passport.internal.ui.bouncer.sloth.i) this.bouncerActivityComponentImpl.bouncerSlothWishConsumerProvider.get();
            dVar.getClass();
            return iVar;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.a getStringRepository() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.k slothStringRepositoryImpl = this.bouncerActivityComponentImpl.slothStringRepositoryImpl();
            dVar.getClass();
            return slothStringRepositoryImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public st41 getWebViewSslErrorHandler() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            Context context = this.passportProcessGlobalComponentImpl.setApplicationContext;
            dVar.getClass();
            return new com.yandex.passport.internal.ui.sloth.h(context);
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class Builder implements PassportProcessGlobalComponent.Builder {
        private com.yandex.passport.internal.di.module.h networkModule;
        private com.yandex.passport.internal.di.module.n serviceModule;
        private Context setApplicationContext;
        private IReporterYandex setIReporterInternal;
        private com.yandex.passport.internal.properties.p setProperties;

        private Builder() {
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public PassportProcessGlobalComponent build() {
            q5z.f(Context.class, this.setApplicationContext);
            q5z.f(IReporterYandex.class, this.setIReporterInternal);
            q5z.f(com.yandex.passport.internal.properties.p.class, this.setProperties);
            if (this.networkModule == null) {
                this.networkModule = new com.yandex.passport.internal.di.module.h();
            }
            if (this.serviceModule == null) {
                this.serviceModule = new com.yandex.passport.internal.di.module.n();
            }
            return new PassportProcessGlobalComponentImpl(new com.yandex.passport.internal.di.module.a(), new com.yandex.passport.internal.di.module.e(), this.networkModule, this.serviceModule, this.setApplicationContext, this.setIReporterInternal, this.setProperties);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder networkModule(com.yandex.passport.internal.di.module.h hVar) {
            hVar.getClass();
            this.networkModule = hVar;
            return this;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder serviceModule(com.yandex.passport.internal.di.module.n nVar) {
            nVar.getClass();
            this.serviceModule = nVar;
            return this;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder setApplicationContext(Context context) {
            context.getClass();
            this.setApplicationContext = context;
            return this;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder setIReporterInternal(IReporterYandex iReporterYandex) {
            iReporterYandex.getClass();
            this.setIReporterInternal = iReporterYandex;
            return this;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder setProperties(com.yandex.passport.internal.properties.p pVar) {
            pVar.getClass();
            this.setProperties = pVar;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class DeleteAccountComponentBuilder implements com.yandex.passport.internal.ui.challenge.delete.a {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.internal.ui.challenge.delete.d setDeleteAccountProperties;

        private DeleteAccountComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.a
        public com.yandex.passport.internal.ui.challenge.delete.b build() {
            q5z.f(com.yandex.passport.internal.ui.challenge.delete.d.class, this.setDeleteAccountProperties);
            q5z.f(Activity.class, this.setActivity);
            return new DeleteAccountComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.challenge.delete.c(), this.setDeleteAccountProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.a
        public DeleteAccountComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.a
        public DeleteAccountComponentBuilder setDeleteAccountProperties(com.yandex.passport.internal.ui.challenge.delete.d dVar) {
            dVar.getClass();
            this.setDeleteAccountProperties = dVar;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class DeleteAccountComponentImpl implements com.yandex.passport.internal.ui.challenge.delete.b {
        private final DeleteAccountComponentImpl deleteAccountComponentImpl;
        private final com.yandex.passport.internal.ui.challenge.delete.c deleteAccountModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 providePerformConfigurationProvider;
        private yvf0 setActivityProvider;
        private final com.yandex.passport.internal.ui.challenge.delete.d setDeleteAccountProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private DeleteAccountComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.delete.c cVar, com.yandex.passport.internal.ui.challenge.delete.d dVar, Activity activity) {
            this.deleteAccountComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.deleteAccountModule = cVar;
            this.setDeleteAccountProperties = dVar;
            initialize(eVar, cVar, dVar, activity);
        }

        private com.yandex.passport.internal.ui.challenge.delete.o deleteAccountStoreFactory() {
            return new com.yandex.passport.internal.ui.challenge.delete.o(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), uid(), getTheme(), (com.yandex.passport.internal.core.accounts.d) this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.usecase.ui.r) this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider.get(), (com.yandex.passport.internal.account.b) this.passportProcessGlobalComponentImpl.currentAccountStorageProvider.get(), (com.yandex.passport.internal.usecase.ui.t) this.passportProcessGlobalComponentImpl.deletePhonishForeverUseCaseProvider.get(), (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get());
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.delete.c cVar, com.yandex.passport.internal.ui.challenge.delete.d dVar, Activity activity) {
            this.providePerformConfigurationProvider = new com.yandex.passport.internal.ui.bouncer.f(cVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 1);
            this.setActivityProvider = n3w.a(activity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.yandex.passport.common.ui.progress.g progressProperties() {
            com.yandex.passport.internal.ui.challenge.delete.c cVar = this.deleteAccountModule;
            com.yandex.passport.internal.ui.challenge.delete.d dVar = this.setDeleteAccountProperties;
            cVar.getClass();
            return dVar.b;
        }

        private Uid uid() {
            com.yandex.passport.internal.ui.challenge.delete.c cVar = this.deleteAccountModule;
            com.yandex.passport.internal.ui.challenge.delete.d dVar = this.setDeleteAccountProperties;
            cVar.getClass();
            return dVar.a;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.b
        public com.yandex.passport.internal.ui.challenge.delete.d getProperties() {
            return this.setDeleteAccountProperties;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.b
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.deleteAccountComponentImpl);
        }

        public AppTheme getTheme() {
            com.yandex.passport.internal.ui.challenge.delete.c cVar = this.deleteAccountModule;
            com.yandex.passport.internal.ui.challenge.delete.d dVar = this.setDeleteAccountProperties;
            cVar.getClass();
            AppTheme appTheme = dVar.c;
            q5z.i(appTheme);
            return appTheme;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.b
        public com.yandex.passport.internal.ui.challenge.delete.t getViewModelFactory() {
            return new com.yandex.passport.internal.ui.challenge.delete.t(deleteAccountStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.b
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class DeleteForeverActivityComponentImpl implements i0 {
        private yvf0 baseSlothUiSettingsProvider;
        private yvf0 challengeUiProvider;
        private final DeleteForeverActivityComponentImpl deleteForeverActivityComponentImpl;
        private yvf0 deleteForeverSlothSlabProvider;
        private yvf0 deleteForeverSlothUiProvider;
        private yvf0 getActivityProvider;
        private yvf0 getProgressPropertiesProvider;
        private yvf0 getPropertiesProvider;
        private yvf0 loadingUiProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideSlothWebViewSettingsProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothSslErrorHandlerProvider;
        private yvf0 slothStringRepositoryImplProvider;
        private yvf0 slothUiDependenciesFactoryProvider;
        private yvf0 standaloneWishConsumerProvider;
        private yvf0 webUrlCheckerProvider;
        private yvf0 webViewControllerProvider;
        private yvf0 webViewSlabProvider;
        private yvf0 webViewUiProvider;

        private DeleteForeverActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, j0 j0Var) {
            this.deleteForeverActivityComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(j0Var);
        }

        private void initialize(j0 j0Var) {
            int i = 0;
            this.getActivityProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.j(i, j0Var)));
            this.getProgressPropertiesProvider = i5m.b(cma1.i(new k0(j0Var, i)));
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getActivityProvider, this.getProgressPropertiesProvider, 10)));
            this.webViewUiProvider = b;
            int i2 = 2;
            this.webViewControllerProvider = i5m.b(cma1.i(new b1(b, i2)));
            this.webUrlCheckerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.urlCheckerProvider, 15);
            this.webViewSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.common.web.h(this.webViewUiProvider, this.getActivityProvider, this.webViewControllerProvider, this.passportProcessGlobalComponentImpl.provideEventReporterProvider, this.webUrlCheckerProvider, 0)));
            this.challengeUiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, 14)));
            this.loadingUiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getActivityProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getProgressPropertiesProvider, 9)));
            this.slothStringRepositoryImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothDebugInformationDelegateImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            int i3 = 1;
            this.slothNetworkStatusImplProvider = new q0(this.getActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i3);
            this.slothSslErrorHandlerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 20);
            this.slothUiDependenciesFactoryProvider = new m(this.getActivityProvider, this.slothStringRepositoryImplProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, this.slothDebugInformationDelegateImplProvider, this.slothNetworkStatusImplProvider, this.passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, this.slothSslErrorHandlerProvider, this.passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            this.baseSlothUiSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getProgressPropertiesProvider, b.a, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 7)));
            this.standaloneWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, 22)));
            xvf0 b2 = i5m.b(cma1.i(new k0(j0Var, i3)));
            this.getPropertiesProvider = b2;
            xvf0 b3 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(j0Var, b2, i2)));
            this.provideSlothWebViewSettingsProvider = b3;
            xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g(this.slothUiDependenciesFactoryProvider, this.baseSlothUiSettingsProvider, this.standaloneWishConsumerProvider, b3)));
            this.deleteForeverSlothSlabProvider = b4;
            this.deleteForeverSlothUiProvider = i5m.b(cma1.i(new b1(b4, i)));
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.i0
        public a1 getDeleteForeverSlothUi() {
            return (a1) this.deleteForeverSlothUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.i0
        public com.yandex.passport.internal.usecase.k0 getGetLocationIdUseCase() {
            return (com.yandex.passport.internal.usecase.k0) this.passportProcessGlobalComponentImpl.getLocationIdUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.common.c getLoader() {
            return (com.yandex.passport.internal.ui.common.c) this.loadingUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.i0
        public PassportDeleteAccountPropertiesImpl getProperties() {
            return (PassportDeleteAccountPropertiesImpl) this.getPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.challenge.p getUi() {
            return (com.yandex.passport.internal.ui.challenge.p) this.challengeUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.common.web.g getWebSlab() {
            return (com.yandex.passport.internal.ui.common.web.g) this.webViewSlabProvider.get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class DeleteForeverComponentBuilder implements l0 {
        private com.yandex.passport.internal.ui.challenge.k challengeData;
        private Boolean isChallengeNeeded;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.delete.f1 viewModel;

        private DeleteForeverComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.l0
        public com.yandex.passport.internal.ui.challenge.delete.m0 build() {
            q5z.f(com.yandex.passport.internal.ui.challenge.k.class, this.challengeData);
            q5z.f(Boolean.class, this.isChallengeNeeded);
            q5z.f(com.yandex.passport.internal.ui.challenge.delete.f1.class, this.viewModel);
            return new DeleteForeverComponentImpl(this.passportProcessGlobalComponentImpl, this.challengeData, this.isChallengeNeeded, this.viewModel);
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.l0
        public DeleteForeverComponentBuilder challengeData(com.yandex.passport.internal.ui.challenge.k kVar) {
            kVar.getClass();
            this.challengeData = kVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.l0
        public DeleteForeverComponentBuilder isChallengeNeeded(boolean z) {
            this.isChallengeNeeded = Boolean.valueOf(z);
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.l0
        public DeleteForeverComponentBuilder viewModel(com.yandex.passport.internal.ui.challenge.delete.f1 f1Var) {
            f1Var.getClass();
            this.viewModel = f1Var;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class DeleteForeverComponentImpl implements com.yandex.passport.internal.ui.challenge.delete.m0 {
        private yvf0 challengeDataProvider;
        private final DeleteForeverComponentImpl deleteForeverComponentImpl;
        private yvf0 deleteForeverModelProvider;
        private yvf0 isChallengeNeededProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 viewModelProvider;

        private DeleteForeverComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.k kVar, Boolean bool, com.yandex.passport.internal.ui.challenge.delete.f1 f1Var) {
            this.deleteForeverComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(kVar, bool, f1Var);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.k kVar, Boolean bool, com.yandex.passport.internal.ui.challenge.delete.f1 f1Var) {
            this.challengeDataProvider = n3w.a(kVar);
            this.viewModelProvider = n3w.a(f1Var);
            this.isChallengeNeededProvider = n3w.a(bool);
            this.deleteForeverModelProvider = new usx0(this.challengeDataProvider, this.viewModelProvider, this.passportProcessGlobalComponentImpl.challengeHelperProvider, this.isChallengeNeededProvider, this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider, this.passportProcessGlobalComponentImpl.deletePhonishForeverUseCaseProvider, this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider, this.passportProcessGlobalComponentImpl.currentAccountStorageProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider);
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.m0
        public yvf0 getSessionProvider() {
            return this.deleteForeverModelProvider;
        }
    }

    /* loaded from: classes2.dex */
    public static final class DomikComponentImpl implements com.yandex.passport.internal.ui.domik.di.a {
        private yvf0 authRouterProvider;
        private final DomikComponentImpl domikComponentImpl;
        private yvf0 domikDesignProvider;
        private yvf0 domikRouterProvider;
        private yvf0 getCommonViewModelProvider;
        private yvf0 getLoginPropertiesProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 phonishReporterProvider;
        private yvf0 regRouterProvider;

        private DomikComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.domik.di.b bVar) {
            this.domikComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(bVar);
        }

        private void initialize(com.yandex.passport.internal.ui.domik.di.b bVar) {
            int i = 0;
            this.getCommonViewModelProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.domik.di.c(bVar, i)));
            this.getLoginPropertiesProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.domik.di.c(bVar, 1)));
            this.phonishReporterProvider = new q0(this.passportProcessGlobalComponentImpl.eventReporterProvider, this.passportProcessGlobalComponentImpl.reportingFeatureProvider, i);
            this.domikRouterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.common.web.h(this.getCommonViewModelProvider, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, this.getLoginPropertiesProvider, this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider, this.phonishReporterProvider, 1)));
            this.domikDesignProvider = i5m.c(com.yandex.passport.internal.ui.domik.l.a);
            this.regRouterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getCommonViewModelProvider, 17)));
            this.authRouterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getCommonViewModelProvider, 16)));
        }

        private ta phonishToNeophonishRequest() {
            return new ta((com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.common.network.l0) this.passportProcessGlobalComponentImpl.provideRetryingOkHttpUseCaseProvider.get(), (com.yandex.passport.internal.network.c) this.passportProcessGlobalComponentImpl.provideBackendReporterWrapperProvider.get(), requestFactory(), (com.yandex.passport.data.network.core.o) this.passportProcessGlobalComponentImpl.provideMasterTokenTombstoneManagerProvider.get());
        }

        private sa requestFactory() {
            return new sa((com.yandex.passport.data.network.core.p) this.passportProcessGlobalComponentImpl.requestCreatorProvider.get(), (com.yandex.passport.data.network.core.h) this.passportProcessGlobalComponentImpl.commonBackendQueryProvider.get());
        }

        private x0 upgradePhonishUseCase() {
            return new x0((com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), phonishToNeophonishRequest(), (com.yandex.passport.internal.network.mappers.b) this.passportProcessGlobalComponentImpl.environmentDataMapperProvider.get(), getPhonishReporter(), (h0) this.passportProcessGlobalComponentImpl.getClientTokenUseCaseProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), this.passportProcessGlobalComponentImpl.fetchAndSaveModernAccountUseCase());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.k getDomikDesignProvider() {
            return (com.yandex.passport.internal.ui.domik.k) this.domikDesignProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.q getDomikRouter() {
            return (com.yandex.passport.internal.ui.domik.q) this.domikRouterProvider.get();
        }

        public LoginProperties getLoginProperties() {
            return (LoginProperties) this.getLoginPropertiesProvider.get();
        }

        public p0 getPhonishReporter() {
            return new p0((com.yandex.passport.internal.report.j) this.passportProcessGlobalComponentImpl.eventReporterProvider.get(), (com.yandex.passport.internal.features.a) this.passportProcessGlobalComponentImpl.reportingFeatureProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.smsauth.b newAuthBySmsViewModel() {
            return new com.yandex.passport.internal.ui.domik.smsauth.b((com.yandex.passport.internal.network.mappers.b) this.passportProcessGlobalComponentImpl.environmentDataMapperProvider.get(), (mc) this.passportProcessGlobalComponentImpl.smsCodeVerificationRequestProvider.get(), (com.yandex.passport.internal.helper.f) this.passportProcessGlobalComponentImpl.domikLoginHelperProvider.get(), (com.yandex.passport.internal.ui.domik.q) this.domikRouterProvider.get(), (b0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (com.yandex.passport.internal.usecase.ui.i0) this.passportProcessGlobalComponentImpl.requestSmsUseCaseProvider2.get(), getPhonishReporter(), (LoginProperties) this.getLoginPropertiesProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.call.e newCallConfirmViewModel() {
            return new com.yandex.passport.internal.ui.domik.call.e((com.yandex.passport.internal.helper.f) this.passportProcessGlobalComponentImpl.domikLoginHelperProvider.get(), (mc) this.passportProcessGlobalComponentImpl.smsCodeVerificationRequestProvider.get(), (com.yandex.passport.internal.ui.domik.q) this.domikRouterProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.passportProcessGlobalComponentImpl.environmentDataMapperProvider.get(), (com.yandex.passport.internal.ui.domik.r) this.regRouterProvider.get(), (b0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (v0) this.passportProcessGlobalComponentImpl.startRegistrationUseCaseProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.extaction.b newExternalActionViewModel() {
            return new com.yandex.passport.internal.ui.domik.extaction.b((com.yandex.passport.internal.usecase.authorize.b) this.passportProcessGlobalComponentImpl.authByCookieUseCaseProvider.get(), (c0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get(), (com.yandex.passport.internal.ui.domik.q) this.domikRouterProvider.get(), (com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), (b0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.identifier.d newIdentifierCredentialManagerViewModel() {
            return new com.yandex.passport.internal.ui.domik.identifier.d();
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.phone_number.a newPhoneNumberViewModel() {
            return new com.yandex.passport.internal.ui.domik.phone_number.a((com.yandex.passport.internal.ui.domik.r) this.regRouterProvider.get(), (b0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (v0) this.passportProcessGlobalComponentImpl.startRegistrationUseCaseProvider.get(), getPhonishReporter(), (LoginProperties) this.getLoginPropertiesProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.relogin.c newReloginViewModel() {
            return new com.yandex.passport.internal.ui.domik.relogin.c((com.yandex.passport.internal.ui.domik.q) this.domikRouterProvider.get(), (com.yandex.passport.internal.ui.domik.b) this.authRouterProvider.get(), (b0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (com.yandex.passport.internal.usecase.ui.i0) this.passportProcessGlobalComponentImpl.requestSmsUseCaseProvider2.get(), (t0) this.passportProcessGlobalComponentImpl.startAuthorizationUseCaseProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.sms.b newSmsViewModel() {
            return new com.yandex.passport.internal.ui.domik.sms.b((com.yandex.passport.internal.helper.f) this.passportProcessGlobalComponentImpl.domikLoginHelperProvider.get(), (c0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get(), (com.yandex.passport.internal.ui.domik.q) this.domikRouterProvider.get(), (mc) this.passportProcessGlobalComponentImpl.smsCodeVerificationRequestProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.passportProcessGlobalComponentImpl.environmentDataMapperProvider.get(), (b0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (com.yandex.passport.internal.usecase.ui.i0) this.passportProcessGlobalComponentImpl.requestSmsUseCaseProvider.get(), (com.yandex.passport.internal.ui.domik.r) this.regRouterProvider.get(), getPhonishReporter(), (LoginProperties) this.getLoginPropertiesProvider.get(), (com.yandex.passport.internal.core.accounts.d) this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.username.b newUsernameInputViewModel() {
            return new com.yandex.passport.internal.ui.domik.username.b(upgradePhonishUseCase(), (com.yandex.passport.internal.ui.domik.q) this.domikRouterProvider.get());
        }
    }

    /* loaded from: classes15.dex */
    public static final class EsiaBindComponentImpl implements com.yandex.passport.internal.social.esia.h {
        private final EsiaBindComponentImpl esiaBindComponentImpl;
        private final com.yandex.passport.internal.social.esia.i esiaBindModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final SocialismUrlProvider$ActualTheme setActualTheme;
        private final EsiaInternalBindProperties setEsiaInternalBindProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private EsiaBindComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.social.esia.i iVar, EsiaInternalBindProperties esiaInternalBindProperties, SocialismUrlProvider$ActualTheme socialismUrlProvider$ActualTheme) {
            this.esiaBindComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.esiaBindModule = iVar;
            this.setEsiaInternalBindProperties = esiaInternalBindProperties;
            this.setActualTheme = socialismUrlProvider$ActualTheme;
        }

        private z esiaBindStoreFactory() {
            return new z(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), (y) this.passportProcessGlobalComponentImpl.getAuthorizationUrlUseCaseProvider.get(), (com.yandex.passport.common.ui.lang.b) this.passportProcessGlobalComponentImpl.bindUiLanguageProvider.get(), socialismUrlProvider(), (com.yandex.passport.internal.report.reporters.y) this.passportProcessGlobalComponentImpl.esiaBindingReporterProvider.get(), esiaReturnUrlProvider());
        }

        private com.yandex.passport.internal.social.esia.k0 esiaReturnUrlProvider() {
            com.yandex.passport.internal.social.esia.i iVar = this.esiaBindModule;
            Context context = this.passportProcessGlobalComponentImpl.setApplicationContext;
            iVar.getClass();
            return new com.yandex.passport.internal.social.esia.k0(context);
        }

        private com.yandex.passport.internal.social.esia.l0 socialismUrlProvider() {
            return new com.yandex.passport.internal.social.esia.l0((com.yandex.passport.data.network.core.h) this.passportProcessGlobalComponentImpl.commonBackendQueryProvider.get());
        }

        @Override // com.yandex.passport.internal.social.esia.h
        public com.yandex.passport.internal.report.reporters.y getEsiaBindingReporter() {
            return (com.yandex.passport.internal.report.reporters.y) this.passportProcessGlobalComponentImpl.esiaBindingReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.social.esia.h
        public a0 getViewModelFactory() {
            return new a0(esiaBindStoreFactory(), this.setEsiaInternalBindProperties, this.setActualTheme, (j) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get());
        }
    }

    /* loaded from: classes15.dex */
    public static final class LogoutActivityComponentImpl implements com.yandex.passport.internal.ui.challenge.logout.b {
        private yvf0 challengeUiProvider;
        private yvf0 getActivityProvider;
        private yvf0 getProgressPropertiesProvider;
        private yvf0 loadingUiProvider;
        private final LogoutActivityComponentImpl logoutActivityComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 webUrlCheckerProvider;
        private yvf0 webViewControllerProvider;
        private yvf0 webViewSlabProvider;
        private yvf0 webViewUiProvider;

        private LogoutActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.logout.c cVar) {
            this.logoutActivityComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(cVar);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.logout.c cVar) {
            this.getActivityProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.j(0, cVar)));
            int i = 2;
            this.getProgressPropertiesProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.j(i, cVar)));
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getActivityProvider, this.getProgressPropertiesProvider, 10)));
            this.webViewUiProvider = b;
            this.webViewControllerProvider = i5m.b(cma1.i(new b1(b, i)));
            this.webUrlCheckerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.urlCheckerProvider, 15);
            this.webViewSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.common.web.h(this.webViewUiProvider, this.getActivityProvider, this.webViewControllerProvider, this.passportProcessGlobalComponentImpl.provideEventReporterProvider, this.webUrlCheckerProvider, 0)));
            this.challengeUiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, 14)));
            this.loadingUiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getActivityProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getProgressPropertiesProvider, 9)));
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.common.c getLoader() {
            return (com.yandex.passport.internal.ui.common.c) this.loadingUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.challenge.p getUi() {
            return (com.yandex.passport.internal.ui.challenge.p) this.challengeUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.common.web.g getWebSlab() {
            return (com.yandex.passport.internal.ui.common.web.g) this.webViewSlabProvider.get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class LogoutBottomSheetActivityComponentBuilder implements com.yandex.passport.internal.ui.challenge.logout.bottomsheet.l {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;

        private LogoutBottomSheetActivityComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.l
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.m build() {
            return new LogoutBottomSheetActivityComponentImpl(this.passportProcessGlobalComponentImpl);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LogoutBottomSheetActivityComponentImpl implements com.yandex.passport.internal.ui.challenge.logout.bottomsheet.m {
        private final LogoutBottomSheetActivityComponentImpl logoutBottomSheetActivityComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;

        private LogoutBottomSheetActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.logoutBottomSheetActivityComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        private LogoutBottomSheetActivity injectLogoutBottomSheetActivity(LogoutBottomSheetActivity logoutBottomSheetActivity) {
            logoutBottomSheetActivity.flagRepository = (j) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get();
            logoutBottomSheetActivity.logoutReporter = logoutReporterImpl();
            return logoutBottomSheetActivity;
        }

        private com.yandex.passport.internal.report.reporters.g0 logoutReporterImpl() {
            return new com.yandex.passport.internal.report.reporters.g0((com.yandex.passport.internal.report.j) this.passportProcessGlobalComponentImpl.eventReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.m
        public void inject(LogoutBottomSheetActivity logoutBottomSheetActivity) {
            injectLogoutBottomSheetActivity(logoutBottomSheetActivity);
        }
    }

    /* loaded from: classes15.dex */
    public static final class LogoutBottomSheetComposeComponentBuilder implements com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.logout.v setProperties;

        private LogoutBottomSheetComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r
        public s build() {
            q5z.f(com.yandex.passport.internal.ui.challenge.logout.v.class, this.setProperties);
            return new LogoutBottomSheetComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.t(), new com.yandex.passport.internal.ui.common.e(), this.setProperties);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r
        public LogoutBottomSheetComposeComponentBuilder setProperties(com.yandex.passport.internal.ui.challenge.logout.v vVar) {
            vVar.getClass();
            this.setProperties = vVar;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class LogoutBottomSheetComposeComponentImpl implements s {
        private final LogoutBottomSheetComposeComponentImpl logoutBottomSheetComposeComponentImpl;
        private final com.yandex.passport.internal.ui.challenge.logout.bottomsheet.t logoutBottomSheetComposeModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.internal.ui.challenge.logout.v setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private LogoutBottomSheetComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.logout.bottomsheet.t tVar, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.logout.v vVar) {
            this.logoutBottomSheetComposeComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = vVar;
            this.logoutBottomSheetComposeModule = tVar;
        }

        private com.yandex.passport.internal.ui.challenge.logout.bottomsheet.i0 logoutBottomSheetComposeStoreFactory() {
            return new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.i0(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), (com.yandex.passport.internal.core.accounts.d) this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider.get(), (j) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get(), (com.yandex.passport.internal.core.accounts.t) this.passportProcessGlobalComponentImpl.memberAccountRepositoryProvider.get(), this.setProperties, this.passportProcessGlobalComponentImpl.whiteLabelBoolean());
        }

        private com.yandex.passport.internal.report.reporters.g0 logoutReporterImpl() {
            return new com.yandex.passport.internal.report.reporters.g0((com.yandex.passport.internal.report.j) this.passportProcessGlobalComponentImpl.eventReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s
        public j getFlagRepository() {
            return (j) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s
        public f0 getLogoutReporter() {
            com.yandex.passport.internal.ui.challenge.logout.bottomsheet.t tVar = this.logoutBottomSheetComposeModule;
            com.yandex.passport.internal.report.reporters.g0 logoutReporterImpl = logoutReporterImpl();
            tVar.getClass();
            return logoutReporterImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.k0 getViewModelFactory() {
            return new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.k0(logoutBottomSheetComposeStoreFactory());
        }
    }

    /* loaded from: classes2.dex */
    public static final class LogoutComponentBuilder implements com.yandex.passport.internal.ui.challenge.logout.e {
        private LogoutBehaviour behaviour;
        private com.yandex.passport.internal.ui.challenge.k challengeData;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.logout.g0 viewModel;

        private LogoutComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.e
        public LogoutComponentBuilder behaviour(LogoutBehaviour logoutBehaviour) {
            logoutBehaviour.getClass();
            this.behaviour = logoutBehaviour;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.e
        public com.yandex.passport.internal.ui.challenge.logout.f build() {
            q5z.f(com.yandex.passport.internal.ui.challenge.k.class, this.challengeData);
            q5z.f(com.yandex.passport.internal.ui.challenge.logout.g0.class, this.viewModel);
            q5z.f(LogoutBehaviour.class, this.behaviour);
            return new LogoutComponentImpl(this.passportProcessGlobalComponentImpl, this.challengeData, this.viewModel, this.behaviour);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.e
        public LogoutComponentBuilder challengeData(com.yandex.passport.internal.ui.challenge.k kVar) {
            kVar.getClass();
            this.challengeData = kVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.e
        public LogoutComponentBuilder viewModel(com.yandex.passport.internal.ui.challenge.logout.g0 g0Var) {
            g0Var.getClass();
            this.viewModel = g0Var;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class LogoutComponentImpl implements com.yandex.passport.internal.ui.challenge.logout.f {
        private yvf0 behaviourProvider;
        private yvf0 challengeDataProvider;
        private final LogoutComponentImpl logoutComponentImpl;
        private yvf0 logoutModelProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 viewModelProvider;

        private LogoutComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.k kVar, com.yandex.passport.internal.ui.challenge.logout.g0 g0Var, LogoutBehaviour logoutBehaviour) {
            this.logoutComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(kVar, g0Var, logoutBehaviour);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.k kVar, com.yandex.passport.internal.ui.challenge.logout.g0 g0Var, LogoutBehaviour logoutBehaviour) {
            this.challengeDataProvider = n3w.a(kVar);
            this.viewModelProvider = n3w.a(g0Var);
            this.behaviourProvider = n3w.a(logoutBehaviour);
            this.logoutModelProvider = new com.yandex.passport.internal.ui.challenge.logout.u(this.challengeDataProvider, this.viewModelProvider, this.passportProcessGlobalComponentImpl.challengeHelperProvider, this.passportProcessGlobalComponentImpl.logoutUseCaseProvider, this.behaviourProvider, this.passportProcessGlobalComponentImpl.findModernAccountUseCaseProvider, this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.f
        public yvf0 getSessionProvider() {
            return this.logoutModelProvider;
        }
    }

    /* loaded from: classes15.dex */
    public static final class LogoutComposeComponentBuilder implements com.yandex.passport.internal.ui.challenge.logout.j {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private LogoutBehaviour setLogoutBehaviour;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private AppTheme setTheme;
        private Uid setUid;

        private LogoutComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public com.yandex.passport.internal.ui.challenge.logout.k build() {
            q5z.f(Uid.class, this.setUid);
            q5z.f(AppTheme.class, this.setTheme);
            q5z.f(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            q5z.f(LogoutBehaviour.class, this.setLogoutBehaviour);
            return new LogoutComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), this.setUid, this.setTheme, this.setProgressProperties, this.setLogoutBehaviour);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public LogoutComposeComponentBuilder setLogoutBehaviour(LogoutBehaviour logoutBehaviour) {
            logoutBehaviour.getClass();
            this.setLogoutBehaviour = logoutBehaviour;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public LogoutComposeComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public LogoutComposeComponentBuilder setTheme(AppTheme appTheme) {
            appTheme.getClass();
            this.setTheme = appTheme;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public LogoutComposeComponentBuilder setUid(Uid uid) {
            uid.getClass();
            this.setUid = uid;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class LogoutComposeComponentImpl implements com.yandex.passport.internal.ui.challenge.logout.k {
        private final LogoutComposeComponentImpl logoutComposeComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final LogoutBehaviour setLogoutBehaviour;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final AppTheme setTheme;
        private final Uid setUid;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private LogoutComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, Uid uid, AppTheme appTheme, com.yandex.passport.common.ui.progress.g gVar, LogoutBehaviour logoutBehaviour) {
            this.logoutComposeComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setUid = uid;
            this.setTheme = appTheme;
            this.setLogoutBehaviour = logoutBehaviour;
            this.setProgressProperties = gVar;
        }

        private com.yandex.passport.internal.ui.challenge.i challengeChecker() {
            return new com.yandex.passport.internal.ui.challenge.i((com.yandex.passport.internal.ui.challenge.n) this.passportProcessGlobalComponentImpl.challengeHelperProvider.get());
        }

        private com.yandex.passport.internal.ui.challenge.logout.f0 logoutStoreFactory() {
            return new com.yandex.passport.internal.ui.challenge.logout.f0(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), challengeChecker(), (com.yandex.passport.internal.usecase.v0) this.passportProcessGlobalComponentImpl.logoutUseCaseProvider.get(), (com.yandex.passport.internal.usecase.q) this.passportProcessGlobalComponentImpl.findModernAccountUseCaseProvider.get(), (com.yandex.passport.internal.usecase.ui.r) this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider.get(), this.setUid, this.setTheme, this.setLogoutBehaviour);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.k
        public c0 getEventReporter() {
            return (c0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.k
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.setProgressProperties;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.k
        public com.yandex.passport.internal.ui.challenge.logout.o getViewModelFactory() {
            return new com.yandex.passport.internal.ui.challenge.logout.o(logoutStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.k
        public com.yandex.passport.internal.ui.common.web.d getWebUrlChecker() {
            return new com.yandex.passport.internal.ui.common.web.d(this.passportProcessGlobalComponentImpl.urlChecker());
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.k
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class ManagingPlusDevicesComponentBuilder implements com.yandex.passport.internal.ui.sloth.plusdevices.a {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private com.yandex.passport.internal.ui.sloth.plusdevices.o setProperties;

        private ManagingPlusDevicesComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.a
        public com.yandex.passport.internal.ui.sloth.plusdevices.b build() {
            q5z.f(com.yandex.passport.internal.ui.sloth.plusdevices.o.class, this.setProperties);
            q5z.f(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            q5z.f(Activity.class, this.setActivity);
            return new ManagingPlusDevicesComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.sloth.plusdevices.n(), this.setProperties, this.setProgressProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.a
        public ManagingPlusDevicesComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.a
        public ManagingPlusDevicesComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.a
        public ManagingPlusDevicesComponentBuilder setProperties(com.yandex.passport.internal.ui.sloth.plusdevices.o oVar) {
            oVar.getClass();
            this.setProperties = oVar;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class ManagingPlusDevicesComponentImpl implements com.yandex.passport.internal.ui.sloth.plusdevices.b {
        private final ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 providePerformConfigurationProvider;
        private yvf0 setActivityProvider;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final com.yandex.passport.internal.ui.sloth.plusdevices.o setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private ManagingPlusDevicesComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.plusdevices.n nVar, com.yandex.passport.internal.ui.sloth.plusdevices.o oVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.managingPlusDevicesComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = oVar;
            this.setProgressProperties = gVar;
            initialize(eVar, nVar, oVar, gVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.plusdevices.n nVar, com.yandex.passport.internal.ui.sloth.plusdevices.o oVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.providePerformConfigurationProvider = new com.yandex.passport.internal.ui.bouncer.f(nVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 9);
            this.setActivityProvider = n3w.a(activity);
        }

        private com.yandex.passport.internal.ui.sloth.plusdevices.h0 managingPlusDevicesStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.plusdevices.h0(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.setProperties, (com.yandex.passport.internal.report.reporters.h0) this.passportProcessGlobalComponentImpl.managingPlusDevicesReporterProvider.get(), (p1) this.passportProcessGlobalComponentImpl.tryAddPlusDeviceUseCaseProvider.get(), (com.yandex.passport.internal.usecase.k0) this.passportProcessGlobalComponentImpl.getLocationIdUseCaseProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.b
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.setProgressProperties;
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.b
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss2_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.managingPlusDevicesComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.b
        public com.yandex.passport.internal.ui.sloth.plusdevices.j0 getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.plusdevices.j0(managingPlusDevicesStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.b
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class PassportProcessGlobalComponentImpl implements PassportProcessGlobalComponent {
        private yvf0 accountFilterRepositoryProvider;
        private yvf0 accountLastActionHelperProvider;
        private yvf0 accountLoadingReporterProvider;
        private yvf0 accountSharingConfigStorageProvider;
        private yvf0 accountSharingReporterProvider;
        private yvf0 accountSynchronizerProvider;
        private yvf0 accountTrackerProvider;
        private yvf0 accountUpdateReporterProvider;
        private yvf0 accountUpgradeLaunchUseCaseProvider;
        private yvf0 accountUpgradeReporterProvider;
        private yvf0 accountUpgraderViewModelProvider;
        private yvf0 accountsBackuperProvider;
        private yvf0 accountsChangesAnnouncerProvider;
        private yvf0 accountsChangesSelfAnnouncerProvider;
        private yvf0 accountsSaverProvider;
        private yvf0 announcementReporterProvider;
        private yvf0 announcingHelperProvider;
        private yvf0 appBackgroundStateWrapperImplProvider;
        private yvf0 appBindReporterProvider;
        private yvf0 applicationDetailsProviderImplProvider;
        private yvf0 authByCookieUseCaseProvider;
        private yvf0 authByMuidTokenUseCaseProvider;
        private yvf0 authByTrackReporterProvider;
        private yvf0 authQrUseCaseProvider;
        private yvf0 authSdkProviderHelperProvider;
        private yvf0 authSdkReporterProvider;
        private yvf0 authenticatorProvider;
        private yvf0 authorizationInTrackHelperProvider;
        private yvf0 authorizationReporterProvider;
        private yvf0 authorizationResultDataMapperProvider;
        private yvf0 authorizeByCodeUseCaseProvider;
        private yvf0 authorizeByMailOAuthTaskIdUseCaseProvider;
        private yvf0 authorizeByMasterTokenUseCaseProvider;
        private yvf0 authorizeByPasswordRequestProvider;
        private yvf0 authorizeByPasswordUseCaseProvider;
        private yvf0 authorizeByXTokenRequestProvider;
        private yvf0 autoLoginParametersConfigStorageProvider;
        private yvf0 autoLoginReporterProvider;
        private yvf0 autoLoginUseCaseProvider;
        private yvf0 backendReporterProvider;
        private yvf0 backendReporterWrapperImplProvider;
        private yvf0 backendUrlDispatcherImplProvider;
        private yvf0 badgesReporterProvider;
        private yvf0 badgesStorageProvider;
        private yvf0 baseUrlDispatcherImplProvider;
        private yvf0 beginChangePasswordFlowCommandPerformerProvider;
        private yvf0 bindAppBackgroundStateWrapperProvider;
        private yvf0 bindApplicationDetailsProvider;
        private yvf0 bindDeviceInfoProvider;
        private yvf0 bindNetworkWrapperProvider;
        private yvf0 bindPhoneNumberReporterProvider;
        private yvf0 bindUiLanguageProvider;
        private yvf0 biometricTrackInitRequestProvider;
        private yvf0 biometricTrackInitUseCaseProvider;
        private yvf0 bootstrapHelperProvider;
        private yvf0 bouncerReporterProvider;
        private yvf0 challengeHelperProvider;
        private yvf0 challengeReporterProvider;
        private yvf0 changePasswordUseCaseProvider;
        private yvf0 checkAgeByTrackIdRequestProvider;
        private yvf0 checkAgeByTrackIdUseCaseProvider;
        private yvf0 checkLocationIdUseCaseProvider;
        private yvf0 checkVpnBlockRequestProvider;
        private yvf0 checkVpnStatusUseCaseProvider;
        private yvf0 clientTokenDroppingInteractorProvider;
        private yvf0 clientTokenDroppingWrapperProvider;
        private yvf0 clipboardControllerImplProvider;
        private yvf0 commonBackendQueryProvider;
        private yvf0 commonConfigPrefsProvider;
        private yvf0 commonDecryptUseCaseProvider;
        private yvf0 commonEncryptUseCaseProvider;
        private final com.yandex.passport.internal.di.module.a commonModule;
        private yvf0 commonParamsProvider;
        private yvf0 completeStatusRequestProvider;
        private yvf0 configReporterProvider;
        private yvf0 configStatusStorageProvider;
        private yvf0 configStorageProvider;
        private yvf0 connectionTypeImplProvider;
        private yvf0 contextUtilsProvider;
        private yvf0 cookieByTokenReporterProvider;
        private yvf0 coroutineDispatchersImplProvider;
        private yvf0 coroutineScopesImplProvider;
        private yvf0 corruptedAccountRepairerProvider;
        private yvf0 countrySuggestionRequestProvider;
        private yvf0 countrySuggestionUseCaseProvider;
        private yvf0 createProfileReporterProvider;
        private yvf0 currentAccountAnalyticsHelperProvider;
        private yvf0 currentAccountManagerProvider;
        private yvf0 currentAccountStorageProvider;
        private yvf0 dataStoreManagerImplProvider;
        private yvf0 debugOnlyGetSmsVerificationHashPerformerProvider;
        private yvf0 delayedAccountProvider;
        private yvf0 delayedAccountReporterProvider;
        private yvf0 deleteAccountUseCaseProvider;
        private yvf0 deletePhonishForeverUseCaseProvider;
        private yvf0 dependenciesReporterProvider;
        private yvf0 deviceAuthorizationCommitRequestProvider;
        private yvf0 deviceAuthorizationHelperProvider;
        private yvf0 deviceAuthorizationSubmitRequestProvider;
        private yvf0 deviceInfoProviderImplProvider;
        private yvf0 diaryArgumentsRecorderProvider;
        private yvf0 diaryEntityRecorderProvider;
        private yvf0 diaryRecorderProvider;
        private yvf0 diaryReporterProvider;
        private yvf0 diaryUploadDaoWrapperProvider;
        private yvf0 diaryUploadUseCaseProvider;
        private yvf0 disableAutoLoginUseCaseProvider;
        private yvf0 disablePhonishRequestProvider;
        private yvf0 domikLoginHelperProvider;
        private yvf0 domikStatefulReporterProvider;
        private yvf0 ebsConfigStorageProvider;
        private yvf0 ebsReporterProvider;
        private yvf0 encryptReporterProvider;
        private yvf0 environmentDataMapperProvider;
        private yvf0 environmentReporterProvider;
        private yvf0 esiaBindingReporterProvider;
        private yvf0 eventReporterProvider;
        private yvf0 executeCheckVpnStatusPerformerProvider;
        private yvf0 experimentHolderReporterProvider;
        private yvf0 experimentReporterProvider;
        private yvf0 experimentsFetcherProvider;
        private yvf0 experimentsFilterProvider;
        private yvf0 experimentsOverridesProvider;
        private yvf0 experimentsParserProvider;
        private yvf0 experimentsRequestProvider;
        private yvf0 experimentsUpdaterProvider;
        private yvf0 factoryProvider;
        private yvf0 featureFlagResolverProvider;
        private yvf0 fetchAndSaveModernAccountUseCaseProvider;
        private yvf0 fetchAuthCookieUseCaseProvider;
        private yvf0 fetchModernAccountUseCaseProvider;
        private yvf0 filterRulesStorageProvider;
        private yvf0 findMasterUidAccountUseCaseProvider;
        private yvf0 findModernAccountUseCaseProvider;
        private yvf0 finishWithItemCommandPerformerProvider;
        private yvf0 flagRepositoryProvider;
        private yvf0 getAccountSubtitlePerformerProvider;
        private yvf0 getAllUserInfoUseCaseProvider;
        private yvf0 getAllowedBadgesUseCaseProvider;
        private yvf0 getAntirobotAnswerUseCaseProvider;
        private yvf0 getAppAccountVisibilityConfigUseCaseProvider;
        private yvf0 getAuthorizationUrlReporterProvider;
        private yvf0 getAuthorizationUrlUseCaseProvider;
        private yvf0 getBadgesForAccountUseCaseProvider;
        private yvf0 getBadgesSpecificationRequestProvider;
        private yvf0 getChallengeRequestProvider;
        private yvf0 getChallengeUseCaseProvider;
        private yvf0 getChildCodeByUidParentRequestProvider;
        private yvf0 getClientOrMasterTokenByMasterTokenRequestProvider;
        private yvf0 getClientTokenUseCaseProvider;
        private yvf0 getCodeByCookieRequestProvider;
        private yvf0 getCodeByMasterTokenRequestProvider;
        private yvf0 getConfigRequestProvider;
        private yvf0 getConfigUseCaseProvider;
        private yvf0 getCookieByTokenRequestProvider;
        private yvf0 getCookieByTokenUseCaseProvider;
        private yvf0 getCustomEulaStringsCommandPerformerProvider;
        private yvf0 getDeviceCodeRequestProvider;
        private yvf0 getLocationIdUseCaseProvider;
        private yvf0 getMasterTokenByCodeRequestProvider;
        private yvf0 getMasterTokenByCookieRequestProvider;
        private yvf0 getMasterTokenByDeviceCodeRequestProvider;
        private yvf0 getMasterTokenByMailishSocialTaskIdRequestProvider;
        private yvf0 getMasterTokenByMasterTokenUseCaseProvider;
        private yvf0 getMasterTokenByMemberTokenRequestProvider;
        private yvf0 getMasterTokenByTrackIdRequestProvider;
        private yvf0 getMasterTokenForwardByTrackRequestProvider;
        private yvf0 getNotLoggedInMembersUseCaseProvider;
        private yvf0 getOrderedAccountsForAutoLoginUseCaseProvider;
        private yvf0 getOtpCommandPerformerProvider;
        private yvf0 getPhoneRegionCodeCommandPerformerProvider;
        private yvf0 getPush2faCodeRequestProvider;
        private yvf0 getQrLinkRequestProvider;
        private yvf0 getSecretsUseCaseProvider;
        private yvf0 getSmsCommandPerformerProvider;
        private yvf0 getSsoConfigRequestProvider;
        private yvf0 getTrackFromMagicRequestProvider;
        private yvf0 getTrackPayloadRequestProvider;
        private yvf0 getUpgradeStatusUseCaseProvider;
        private yvf0 getUpgradeUrlUseCaseProvider;
        private yvf0 getUserInfoRequestProvider;
        private yvf0 getXTokenClientIdCommandPerformerProvider;
        private yvf0 greatAgainPushSubscriptionManagerProvider;
        private yvf0 handleVpnAppBackgroundStateUseCaseProvider;
        private yvf0 hashEncoderProvider;
        private yvf0 hostDispatcherProvider;
        private yvf0 iPCImplProvider;
        private yvf0 iPCPropertiesHolderProvider;
        private yvf0 immediateAccountsRetrieverProvider;
        private yvf0 internalProviderHelperProvider;
        private yvf0 itemClickCommandPerformerProvider;
        private yvf0 limitedDependenciesReportUseCaseProvider;
        private yvf0 limitedPassportInitReportUseCaseProvider;
        private yvf0 limitedUpdatedPropertiesReportUseCaseProvider;
        private yvf0 linkAuthReporterProvider;
        private yvf0 linkHandlingReporterProvider;
        private yvf0 loadAccountsUseCaseProvider;
        private yvf0 localeHelperProvider;
        private yvf0 loginControllerProvider;
        private yvf0 logoutUseCaseProvider;
        private yvf0 makeJwtTokenRequestProvider;
        private yvf0 makeJwtTokenUseCaseProvider;
        private yvf0 makeTokenMasterCoolDownStorageProvider;
        private yvf0 manageAccountsVisibilityForBlacklistedAppsUseCaseProvider;
        private yvf0 managingPlusDevicesReporterProvider;
        private yvf0 mapOfIntegerAndBackendClientProvider;
        private yvf0 mapOfIntegerAndFrontendClientProvider;
        private yvf0 masterCredentialsProvider;
        private yvf0 masterTokenEncrypterProvider;
        private yvf0 masterTokenRotationReporterProvider;
        private yvf0 masterTokenRotationUseCaseProvider;
        private yvf0 masterTokenTombstoneManagerImplProvider;
        private yvf0 memberAccountRepositoryProvider;
        private yvf0 metricaReporterProvider;
        private yvf0 modernAccountMapperProvider;
        private yvf0 networkWrapperImplProvider;
        private yvf0 notificationHelperProvider;
        private yvf0 notificationPictureBuilderProvider;
        private yvf0 otpWaReporterProvider;
        private yvf0 passportInitReporterProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 passportPushRegistrationUseCaseProvider;
        private yvf0 passportRequestsMapperProvider;
        private yvf0 passportRequestsProcessorProvider;
        private yvf0 personProfileHelperProvider;
        private yvf0 pictureIdToBitmapMapperProvider;
        private yvf0 picturePushUrlUseCaseProvider;
        private yvf0 preferenceStorageProvider;
        private yvf0 primarySlothPerformBinderProvider;
        private yvf0 processAuthorizationResultUseCaseProvider;
        private yvf0 propertyUpdaterProvider;
        private yvf0 provideAccountParserJsonProvider;
        private yvf0 provideAccountsRetrieverProvider;
        private yvf0 provideAccountsUpdaterProvider;
        private yvf0 provideAmVersionProvider;
        private yvf0 provideAnalyticalIdentifiersProvider;
        private yvf0 provideAnalyticsHelperProvider;
        private yvf0 provideAnalyticsTrackerWrapperProvider;
        private yvf0 provideAndroidAccountManagerHelperProvider;
        private yvf0 provideAuthCookieDaoProvider;
        private yvf0 provideAuthCookieDaoWrapperProvider;
        private yvf0 provideAuthorizationReporterWrapperProvider;
        private yvf0 provideBackendClientChooserProvider;
        private yvf0 provideBackendParserProvider;
        private yvf0 provideBackendReporterProvider;
        private yvf0 provideBackendReporterWrapperProvider;
        private yvf0 provideBackendUrlDispatcherProvider;
        private yvf0 provideBaseOkHttpUseCaseProvider;
        private yvf0 provideBaseUrlDispatcherProvider;
        private yvf0 provideClientTokenDaoProvider;
        private yvf0 provideClipboardControllerProvider;
        private yvf0 provideClipboardManagerProvider;
        private yvf0 provideClockProvider;
        private yvf0 provideCommonBackendParamsProvider;
        private yvf0 provideCoolDownUidStorageProvider;
        private yvf0 provideCoroutineDispatchersProvider;
        private yvf0 provideCoroutineScopesProvider;
        private yvf0 provideDataStoreManagerProvider;
        private yvf0 provideDataStoreProvider;
        private yvf0 provideDatabaseHelperProvider;
        private yvf0 provideDebugInfoUtilProvider;
        private yvf0 provideDeviceDensityProvider;
        private yvf0 provideDiaryMethodDaoProvider;
        private yvf0 provideDiaryUploadDaoProvider;
        private yvf0 provideEventReporterProvider;
        private yvf0 provideExperimentsCurrentSessionProvider;
        private yvf0 provideExperimentsExcluderProvider;
        private yvf0 provideExperimentsHolderProvider;
        private yvf0 provideGcmSubscriptionsDaoProvider;
        private yvf0 provideIPCApiProvider;
        private yvf0 provideImageLoadingClientProvider;
        private yvf0 provideIsWhiteLabelProvider;
        private yvf0 provideMasterTokenTombstoneManagerProvider;
        private yvf0 provideModernAccountRefresherProvider;
        private yvf0 provideNotificationDndManagerProvider;
        private yvf0 provideOkHttpClientProvider;
        private yvf0 providePassportBiometricApiProvider;
        private yvf0 providePassportDatabaseProvider;
        private yvf0 providePermissionManagerProvider;
        private yvf0 provideProductionBackendClientProvider;
        private yvf0 provideProductionFrontendClientProvider;
        private yvf0 provideRcBackendClientProvider;
        private yvf0 provideRcFrontendClientProvider;
        private yvf0 provideReporterProvider;
        private yvf0 provideRetryingOkHttpUseCaseProvider;
        private yvf0 provideSlothReportDelegateProvider;
        private yvf0 provideSmartLockInterfaceProvider;
        private yvf0 provideSyncHelperProvider;
        private yvf0 provideTeamFrontendClientProvider;
        private yvf0 provideTeamProductionBackendClientProvider;
        private yvf0 provideTeamTestingBackendClientProvider;
        private yvf0 provideTeamTestingFrontendClientProvider;
        private yvf0 provideTestingBackendClientProvider;
        private yvf0 provideTestingFrontendClientProvider;
        private yvf0 provideTimeProvider;
        private yvf0 provideTwoFactorOtpProvider;
        private yvf0 provideUrlTemplateDataStoreProvider;
        private yvf0 provideUserInfoMapperProvider;
        private yvf0 provideWebAuthNClientProvider;
        private yvf0 pushAvailabilityDetectorProvider;
        private yvf0 pushIntentProvider;
        private yvf0 pushOpenUrlInBrowserReporterProvider;
        private yvf0 pushPayloadFactoryProvider;
        private yvf0 pushPayloadStorageProvider;
        private yvf0 pushReporterProvider;
        private yvf0 pushSubscribeRequestProvider;
        private yvf0 pushSubscriberProvider;
        private yvf0 pushSubscriptionSchedulerProvider;
        private yvf0 pushSubscriptionTimeDispatcherProvider;
        private yvf0 pushUnsubscribeRequestProvider;
        private yvf0 quarantineMasterTokenStorageProvider;
        private yvf0 registerPhonishRequestProvider;
        private yvf0 registerPhonishUseCaseProvider;
        private yvf0 removeAccountUseCaseProvider;
        private yvf0 reportingFeatureProvider;
        private yvf0 requestCreatorProvider;
        private yvf0 requestFactoryProvider;
        private yvf0 requestFactoryProvider10;
        private yvf0 requestFactoryProvider11;
        private yvf0 requestFactoryProvider12;
        private yvf0 requestFactoryProvider13;
        private yvf0 requestFactoryProvider14;
        private yvf0 requestFactoryProvider15;
        private yvf0 requestFactoryProvider16;
        private yvf0 requestFactoryProvider17;
        private yvf0 requestFactoryProvider18;
        private yvf0 requestFactoryProvider19;
        private yvf0 requestFactoryProvider2;
        private yvf0 requestFactoryProvider20;
        private yvf0 requestFactoryProvider21;
        private yvf0 requestFactoryProvider22;
        private yvf0 requestFactoryProvider23;
        private yvf0 requestFactoryProvider24;
        private yvf0 requestFactoryProvider25;
        private yvf0 requestFactoryProvider26;
        private yvf0 requestFactoryProvider27;
        private yvf0 requestFactoryProvider28;
        private yvf0 requestFactoryProvider29;
        private yvf0 requestFactoryProvider3;
        private yvf0 requestFactoryProvider30;
        private yvf0 requestFactoryProvider31;
        private yvf0 requestFactoryProvider32;
        private yvf0 requestFactoryProvider33;
        private yvf0 requestFactoryProvider34;
        private yvf0 requestFactoryProvider35;
        private yvf0 requestFactoryProvider36;
        private yvf0 requestFactoryProvider37;
        private yvf0 requestFactoryProvider38;
        private yvf0 requestFactoryProvider39;
        private yvf0 requestFactoryProvider4;
        private yvf0 requestFactoryProvider40;
        private yvf0 requestFactoryProvider41;
        private yvf0 requestFactoryProvider42;
        private yvf0 requestFactoryProvider43;
        private yvf0 requestFactoryProvider44;
        private yvf0 requestFactoryProvider45;
        private yvf0 requestFactoryProvider5;
        private yvf0 requestFactoryProvider6;
        private yvf0 requestFactoryProvider7;
        private yvf0 requestFactoryProvider8;
        private yvf0 requestFactoryProvider9;
        private yvf0 requestLoginCredentialsCommandPerformerProvider;
        private yvf0 requestMagicLinkParamsCommandPerformerProvider;
        private yvf0 requestSavedExperimentsCommandPerformerProvider;
        private yvf0 requestSmsUseCaseProvider;
        private yvf0 requestSmsUseCaseProvider2;
        private yvf0 responseTransformerProvider;
        private yvf0 responseTransformerProvider2;
        private yvf0 resultTransformerProvider;
        private yvf0 retryingProvider;
        private yvf0 retryingProvider2;
        private yvf0 revokeMasterTokenRequestProvider;
        private yvf0 revokeMasterTokenUseCaseProvider;
        private yvf0 revokeMasterTokenWrapperProvider;
        private yvf0 saveLoginCredentialsCommandPerformerProvider;
        private yvf0 savedExperimentsProvider;
        private yvf0 scopeAuthUrlUseCaseProvider;
        private yvf0 scopeUrlUseCaseProvider;
        private yvf0 sendAuthToTrackReporterProvider;
        private yvf0 sendAuthToTrackRequestProvider;
        private final com.yandex.passport.internal.di.module.n serviceModule;
        private final Context setApplicationContext;
        private yvf0 setApplicationContextProvider;
        private yvf0 setCurrentAccountUseCaseProvider;
        private yvf0 setIReporterInternalProvider;
        private yvf0 setPopupSizeCommandPerformerProvider;
        private final com.yandex.passport.internal.properties.p setProperties;
        private yvf0 setPropertiesProvider;
        private yvf0 setVpnChallengeActivityDisabledPerformerProvider;
        private yvf0 showAuthCodeUseCaseProvider;
        private yvf0 silentPushReporterProvider;
        private yvf0 slothAuthCookieProviderImplProvider;
        private yvf0 slothAuthDelegateImplProvider;
        private yvf0 slothBaseUrlProviderImplProvider;
        private yvf0 slothBouncerPerformConfigurationProvider;
        private yvf0 slothDependenciesFactoryProvider;
        private yvf0 slothEulaSupportProvider;
        private yvf0 slothReportDelegateImplProvider;
        private yvf0 slothStandalonePerformConfigurationProvider;
        private yvf0 slothUrlCheckerImplProvider;
        private yvf0 slothUrlProviderImplProvider;
        private yvf0 slothUserMenuPerformConfigurationProvider;
        private yvf0 slothWebCardPerformConfigurationProvider;
        private yvf0 slothWebParamsProviderImplProvider;
        private yvf0 smsCodeSendingRequestProvider;
        private yvf0 smsCodeSendingUseCaseProvider;
        private yvf0 smsCodeVerificationRequestProvider;
        private yvf0 smsRetrieverHelperProvider;
        private yvf0 socialActionReporterProvider;
        private yvf0 socialBrowserReporterProvider;
        private yvf0 socialReporterProvider;
        private yvf0 ssoAccountsSyncHelperProvider;
        private yvf0 ssoAnnouncerProvider;
        private yvf0 ssoApplicationsResolverProvider;
        private yvf0 ssoBootstrapHelperProvider;
        private yvf0 ssoContentProviderClientProvider;
        private yvf0 ssoContentProviderHelperProvider;
        private yvf0 ssoDisablerProvider;
        private yvf0 standaloneReporterProvider;
        private yvf0 startAuthorizationUseCaseProvider;
        private yvf0 startBiometricSessionRequestProvider;
        private yvf0 startBiometricSessionUseCaseProvider;
        private yvf0 startRegistrationUseCaseProvider;
        private yvf0 stashReporterProvider;
        private yvf0 storageReporterProvider;
        private yvf0 subscriptionEnqueuePerformerProvider;
        private yvf0 suggestedLanguageReporterProvider;
        private yvf0 suggestedLanguageRequestProvider;
        private yvf0 suggestedLanguageUseCaseProvider;
        private yvf0 syncAdapterProvider;
        private yvf0 syncReporterProvider;
        private yvf0 tldResolverProvider;
        private yvf0 tokenActionReporterProvider;
        private yvf0 tombstoneReporterProvider;
        private yvf0 tryAddPlusDeviceRequestProvider;
        private yvf0 tryAddPlusDeviceUseCaseProvider;
        private yvf0 tryGetMasterCredentialsByAccountProvider;
        private yvf0 uiLanguageProviderImplProvider;
        private yvf0 updateAvatarRequestProvider;
        private yvf0 updateAvatarUseCaseProvider;
        private yvf0 updateBadgesConfigUseCaseProvider;
        private yvf0 updateEnqueuePerformerProvider;
        private yvf0 updateMasterTokenReporterProvider;
        private yvf0 upgradeStatusStashUpdaterProvider;
        private yvf0 urlCheckerProvider;
        private yvf0 urlRestorerProvider;
        private yvf0 urlTemplateRepositoryProvider;
        private yvf0 userIdReporterProvider;
        private yvf0 userInfoReporterProvider;
        private yvf0 userMenuEventSenderProvider;
        private yvf0 userMenuSlothPerformBinderProvider;
        private yvf0 usingMasterTokenRequestUseCaseProvider;
        private yvf0 usingMasterTokenRequestUseCaseProvider2;
        private yvf0 usingMasterTokenRequestUseCaseProvider3;
        private yvf0 usingMasterTokenRequestUseCaseProvider4;
        private yvf0 validatePhoneNumberRequestProvider;
        private yvf0 vpnChallengeReporterProvider;
        private yvf0 vpnChallengeStoreFactoryProvider;
        private com.yandex.passport.internal.ui.challenge.vpn.b0 vpnChallengeViewModelProvider;
        private yvf0 vpnConfigRepositoryProvider;
        private yvf0 vpnCookieRepositoryProvider;
        private yvf0 warmUpWebViewReporterProvider;
        private yvf0 webAmReporterProvider;
        private yvf0 webAuthNAuthPerformerProvider;
        private yvf0 webAuthNAvailabilityPerformerProvider;
        private yvf0 webAuthNRegisterPerformerProvider;
        private yvf0 webAuthNReporterProvider;
        private yvf0 webCardEventSenderProvider;
        private yvf0 webCardReporterProvider;
        private yvf0 webCardSlothPerformBinderProvider;
        private yvf0 whiteListRegexConfigStorageProvider;

        private PassportProcessGlobalComponentImpl(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.n nVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.p pVar) {
            this.passportProcessGlobalComponentImpl = this;
            this.setProperties = pVar;
            this.setApplicationContext = context;
            this.commonModule = aVar;
            this.serviceModule = nVar;
            initialize(aVar, eVar, hVar, nVar, context, iReporterYandex, pVar);
            initialize2(aVar, eVar, hVar, nVar, context, iReporterYandex, pVar);
            initialize3(aVar, eVar, hVar, nVar, context, iReporterYandex, pVar);
            initialize4(aVar, eVar, hVar, nVar, context, iReporterYandex, pVar);
            initialize5(aVar, eVar, hVar, nVar, context, iReporterYandex, pVar);
        }

        private com.yandex.passport.internal.methods.performer.a acceptDeviceAuthorizationPerformer() {
            return new com.yandex.passport.internal.methods.performer.a((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get(), (s1) this.deviceAuthorizationSubmitRequestProvider.get(), (m1) this.deviceAuthorizationCommitRequestProvider.get(), (com.yandex.passport.internal.credentials.d) this.masterCredentialsProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.b addAccountPerformer() {
            return new com.yandex.passport.internal.methods.performer.b((com.yandex.passport.internal.usecase.b) this.authorizeByMasterTokenUseCaseProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.usecase.ui.g authByMuidTokenUseCase() {
            return new com.yandex.passport.internal.usecase.ui.g((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.h) this.checkLocationIdUseCaseProvider.get(), fetchAndSaveModernAccountUseCase(), (t7) this.getMasterTokenByMemberTokenRequestProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), (com.yandex.passport.internal.credentials.d) this.masterCredentialsProvider.get(), (com.yandex.passport.internal.report.reporters.b1) this.tokenActionReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.c authByQrLinkPerformer() {
            return new com.yandex.passport.internal.methods.performer.c(authorizeByTrackIdUseCase(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.internal.report.reporters.d0) this.linkAuthReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.d authorizeByCodePerformer() {
            return new com.yandex.passport.internal.methods.performer.d((com.yandex.passport.internal.usecase.authorize.d) this.authorizeByCodeUseCaseProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.methods.performer.e authorizeByCookiePerformer() {
            return new com.yandex.passport.internal.methods.performer.e((com.yandex.passport.internal.usecase.authorize.b) this.authByCookieUseCaseProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.methods.performer.f authorizeByDeviceCodePerformer() {
            return new com.yandex.passport.internal.methods.performer.f(authorizeByDeviceCodeUseCase(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.usecase.authorize.f authorizeByDeviceCodeUseCase() {
            return new com.yandex.passport.internal.usecase.authorize.f((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.h) this.checkLocationIdUseCaseProvider.get(), fetchAndSaveModernAccountUseCase(), (com.yandex.passport.data.network.token.f0) this.getMasterTokenByDeviceCodeRequestProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), (com.yandex.passport.internal.credentials.d) this.masterCredentialsProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.g authorizeByForwardTrackPerformer() {
            return new com.yandex.passport.internal.methods.performer.g(getAuthorizeByForwardTrackUseCase(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.methods.performer.h authorizeByRawJsonPerformer() {
            return new com.yandex.passport.internal.methods.performer.h((com.yandex.passport.internal.account.c) this.loginControllerProvider.get());
        }

        private com.yandex.passport.internal.usecase.authorize.l authorizeByTrackIdUseCase() {
            return new com.yandex.passport.internal.usecase.authorize.l((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.h) this.checkLocationIdUseCaseProvider.get(), fetchAndSaveModernAccountUseCase(), (com.yandex.passport.data.network.token.f1) this.getMasterTokenByTrackIdRequestProvider.get(), (com.yandex.passport.internal.report.reporters.b1) this.tokenActionReporterProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), (com.yandex.passport.internal.credentials.d) this.masterCredentialsProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.i authorizeByUserCredentialsPerformer() {
            return new com.yandex.passport.internal.methods.performer.i((com.yandex.passport.internal.account.c) this.loginControllerProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.autologin.d autoLoginPerformer() {
            return new com.yandex.passport.internal.autologin.d((com.yandex.passport.internal.autologin.g) this.autoLoginUseCaseProvider.get(), (com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.report.reporters.j) this.autoLoginReporterProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), getAccountFilterRepository());
        }

        private com.yandex.passport.internal.methods.performer.j corruptMasterTokenPerformer() {
            return new com.yandex.passport.internal.methods.performer.j((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.core.accounts.g) this.provideAccountsUpdaterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.k deleteSavedPushPayloadPerformer() {
            return new com.yandex.passport.internal.methods.performer.k(getPushPayloadFactory(), (com.yandex.passport.internal.push.e0) this.pushPayloadStorageProvider.get(), (u0) this.silentPushReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.l dropTokenPerformer() {
            return new com.yandex.passport.internal.methods.performer.l((com.yandex.passport.internal.core.tokens.b) this.clientTokenDroppingWrapperProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.yandex.passport.internal.usecase.n fetchAndSaveModernAccountUseCase() {
            return new com.yandex.passport.internal.usecase.n((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), fetchModernAccountUseCase(), (com.yandex.passport.internal.core.accounts.e) this.accountsSaverProvider.get());
        }

        private com.yandex.passport.internal.usecase.ui.v fetchAuthCookieUseCase() {
            return new com.yandex.passport.internal.usecase.ui.v((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.j0) this.getCookieByTokenUseCaseProvider.get(), (i1) this.webAmReporterProvider.get());
        }

        private com.yandex.passport.internal.usecase.p fetchModernAccountUseCase() {
            return new com.yandex.passport.internal.usecase.p((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.t) this.getAllUserInfoUseCaseProvider.get(), (com.yandex.passport.internal.report.reporters.b1) this.tokenActionReporterProvider.get(), (DatabaseHelper) this.provideDatabaseHelperProvider.get(), (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public x findMasterUidAccountUseCase() {
            return new x((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.core.accounts.t) this.memberAccountRepositoryProvider.get(), (com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.n getAccountByMachineReadableLoginPerformer() {
            return new com.yandex.passport.internal.methods.performer.n((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.o getAccountByNamePerformer() {
            return new com.yandex.passport.internal.methods.performer.o((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.ui.b getAccountUpgradeStatusPerformer() {
            return new com.yandex.passport.internal.methods.performer.ui.b((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.upgrader.j) this.getUpgradeStatusUseCaseProvider.get(), (com.yandex.passport.internal.report.reporters.f) this.accountUpgradeReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.r getAccountsListPerformer() {
            return new com.yandex.passport.internal.methods.performer.r((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), getAccountFilterRepository());
        }

        private com.yandex.passport.internal.methods.performer.s getAuthCookiePerformer() {
            return new com.yandex.passport.internal.methods.performer.s((com.yandex.passport.internal.database.auth_cookie.a) this.provideAuthCookieDaoWrapperProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.internal.report.reporters.r) this.cookieByTokenReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.t getAuthorizationUrlPerformer() {
            return new com.yandex.passport.internal.methods.performer.t((y) this.getAuthorizationUrlUseCaseProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get(), (com.yandex.passport.internal.report.reporters.c0) this.getAuthorizationUrlReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.v getAvailableAccountsPerformer() {
            return new com.yandex.passport.internal.methods.performer.v((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), getAccountFilterRepository(), getNotLoggedInMembersUseCase(), (j) this.flagRepositoryProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.x getBooleanFlagPerformer() {
            return new com.yandex.passport.internal.methods.performer.x((j) this.flagRepositoryProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.y getChildCodeByUidParentPerformer() {
            return new com.yandex.passport.internal.methods.performer.y(getChildCodeByUidParentUseCase(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.usecase.f0 getChildCodeByUidParentUseCase() {
            return new com.yandex.passport.internal.usecase.f0((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (y3) this.getChildCodeByUidParentRequestProvider.get(), this.setProperties, (com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.z getCodeByCookiePerformer() {
            return new com.yandex.passport.internal.methods.performer.z((t4) this.getCodeByCookieRequestProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.internal.credentials.d) this.masterCredentialsProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.a0 getCodeByUidPerformer() {
            return new com.yandex.passport.internal.methods.performer.a0((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.core.accounts.g) this.provideAccountsUpdaterProvider.get(), (z4) this.getCodeByMasterTokenRequestProvider.get(), this.setProperties, (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.methods.performer.b0 getCurrentAccountPerformer() {
            return new com.yandex.passport.internal.methods.performer.b0((com.yandex.passport.internal.account.a) this.currentAccountManagerProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.c0 getDeviceCodePerformer() {
            return new com.yandex.passport.internal.methods.performer.c0((com.yandex.passport.internal.helper.d) this.deviceAuthorizationHelperProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.methods.performer.d0 getFlagCredentialManagerForAutoLoginPerformer() {
            return new com.yandex.passport.internal.methods.performer.d0((j) this.flagRepositoryProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.e0 getInvalidateCookiesAndDeleteAuthCookiesPerformer() {
            return new com.yandex.passport.internal.methods.performer.e0((com.yandex.passport.internal.database.auth_cookie.a) this.provideAuthCookieDaoWrapperProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.internal.report.reporters.r) this.cookieByTokenReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.f0 getLocationIdPerformer() {
            return new com.yandex.passport.internal.methods.performer.f0((com.yandex.passport.internal.usecase.k0) this.getLocationIdUseCaseProvider.get());
        }

        private o0 getNotLoggedInMembersUseCase() {
            return new o0((com.yandex.passport.internal.core.accounts.t) this.memberAccountRepositoryProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.g0 getOtpByTrackPerformer() {
            return new com.yandex.passport.internal.methods.performer.g0(getOtpByTrackUseCase(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.usecase.q0 getOtpByTrackUseCase() {
            return new com.yandex.passport.internal.usecase.q0((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (d8) this.getPush2faCodeRequestProvider.get(), (com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), (u0) this.silentPushReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.h0 getPersonProfilePerformer() {
            return new com.yandex.passport.internal.methods.performer.h0((com.yandex.passport.internal.helper.h) this.personProfileHelperProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.methods.performer.i0 getPushCodePerformer() {
            return new com.yandex.passport.internal.methods.performer.i0(getOtpByTrackUseCase());
        }

        private com.yandex.passport.internal.methods.performer.j0 getQrLinkPerformer() {
            return new com.yandex.passport.internal.methods.performer.j0((j8) this.getQrLinkRequestProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.internal.report.reporters.d0) this.linkAuthReporterProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.k0 getSavedPushPayloadPerformer() {
            return new com.yandex.passport.internal.methods.performer.k0((j) this.flagRepositoryProvider.get(), getPushPayloadFactory(), (com.yandex.passport.internal.push.e0) this.pushPayloadStorageProvider.get(), (u0) this.silentPushReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.l0 getSilentPushConfigPerformer() {
            return new com.yandex.passport.internal.methods.performer.l0((j) this.flagRepositoryProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.o0 getTrackPayloadPerformer() {
            return new com.yandex.passport.internal.methods.performer.o0((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (o9) this.getTrackPayloadRequestProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.p0 getUidByNormalizedLoginPerformer() {
            return new com.yandex.passport.internal.methods.performer.p0((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.q0 getUserIdUrlPerformer() {
            return new com.yandex.passport.internal.methods.performer.q0((com.yandex.passport.internal.account.a) this.currentAccountManagerProvider.get(), (com.yandex.passport.internal.network.e) this.provideBaseUrlDispatcherProvider.get(), (y) this.getAuthorizationUrlUseCaseProvider.get(), (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get(), (com.yandex.passport.internal.sloth.p) this.slothWebParamsProviderImplProvider.get(), fetchAuthCookieUseCase(), (j) this.flagRepositoryProvider.get(), (com.yandex.passport.internal.report.reporters.e1) this.userIdReporterProvider.get());
        }

        private void initialize(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.n nVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.p pVar) {
            this.setApplicationContextProvider = n3w.a(context);
            n3w a = n3w.a(pVar);
            this.setPropertiesProvider = a;
            int i = 2;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.c(i, a)));
            this.localeHelperProvider = b;
            int i2 = 1;
            xvf0 b2 = i5m.b(cma1.i(new mb(this.setApplicationContextProvider, b, i2)));
            this.contextUtilsProvider = b2;
            this.commonParamsProvider = i5m.b(cma1.i(new mb(b2, this.setPropertiesProvider, 9)));
            this.setIReporterInternalProvider = n3w.a(iReporterYandex);
            xvf0 c = i5m.c(com.yandex.passport.common.coroutine.c.a);
            this.coroutineDispatchersImplProvider = c;
            int i3 = 0;
            xvf0 b3 = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(c, i3)));
            this.coroutineScopesImplProvider = b3;
            this.provideCoroutineScopesProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b3, 6)));
            xvf0 b4 = i5m.b(cma1.i(new fa(this.coroutineDispatchersImplProvider, 20)));
            this.provideCoroutineDispatchersProvider = b4;
            xvf0 b5 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.p(nVar, this.setApplicationContextProvider, this.provideCoroutineScopesProvider, b4)));
            this.provideAnalyticalIdentifiersProvider = b5;
            xvf0 b6 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.p(nVar, this.setApplicationContextProvider, b5, this.setPropertiesProvider)));
            this.provideAnalyticsHelperProvider = b6;
            xvf0 b7 = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.setApplicationContextProvider, this.commonParamsProvider, this.setIReporterInternalProvider, b6, 7)));
            this.metricaReporterProvider = b7;
            this.provideReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.r(nVar, b7, i2)));
            this.featureFlagResolverProvider = i5m.c(com.yandex.passport.internal.flags.e.a);
            this.provideClockProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.o(nVar, i2)));
            com.yandex.passport.internal.di.module.q qVar = new com.yandex.passport.internal.di.module.q(nVar, this.setApplicationContextProvider, 4);
            this.provideExperimentsExcluderProvider = qVar;
            this.experimentsFilterProvider = new com.yandex.passport.internal.di.module.c(i2, qVar);
            xvf0 b8 = i5m.b(cma1.i(new fa(this.setIReporterInternalProvider, 29)));
            this.environmentReporterProvider = b8;
            this.experimentHolderReporterProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b8, 13)));
            int i4 = 3;
            xvf0 b9 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.q(nVar, this.setApplicationContextProvider, i4)));
            this.provideExperimentsCurrentSessionProvider = b9;
            this.provideExperimentsHolderProvider = i5m.b(cma1.i(new j4(nVar, this.setApplicationContextProvider, this.provideClockProvider, this.experimentsFilterProvider, this.experimentHolderReporterProvider, this.commonParamsProvider, b9)));
            xvf0 b10 = i5m.b(cma1.i(new fa(this.setApplicationContextProvider, 23)));
            this.experimentsOverridesProvider = b10;
            xvf0 b11 = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.featureFlagResolverProvider, this.provideExperimentsHolderProvider, b10, this.provideExperimentsCurrentSessionProvider, 3)));
            this.flagRepositoryProvider = b11;
            xvf0 b12 = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b11, 8)));
            this.reportingFeatureProvider = b12;
            xvf0 b13 = i5m.b(cma1.i(new k8(this.provideReporterProvider, this.commonParamsProvider, b12, 5)));
            this.eventReporterProvider = b13;
            xvf0 b14 = i5m.b(cma1.i(new mb(b13, this.reportingFeatureProvider, 12)));
            this.encryptReporterProvider = b14;
            int i5 = 22;
            xvf0 b15 = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b14, i5)));
            this.getSecretsUseCaseProvider = b15;
            this.commonEncryptUseCaseProvider = i5m.b(cma1.i(new k8(b15, this.flagRepositoryProvider, this.encryptReporterProvider)));
            int i6 = 14;
            this.commonDecryptUseCaseProvider = i5m.b(cma1.i(new e9(this.getSecretsUseCaseProvider, this.encryptReporterProvider, this.flagRepositoryProvider, i6)));
            xvf0 b16 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.o(nVar, i3)));
            this.provideAccountParserJsonProvider = b16;
            com.yandex.passport.internal.di.module.r rVar = new com.yandex.passport.internal.di.module.r(nVar, b16, i);
            this.provideUserInfoMapperProvider = rVar;
            com.yandex.passport.internal.di.module.c cVar = new com.yandex.passport.internal.di.module.c(i4, rVar);
            this.modernAccountMapperProvider = cVar;
            this.provideDatabaseHelperProvider = i5m.b(cma1.i(new h7(eVar, this.setApplicationContextProvider, this.commonEncryptUseCaseProvider, this.commonDecryptUseCaseProvider, cVar, this.flagRepositoryProvider)));
            this.provideOkHttpClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.j(hVar, this.setPropertiesProvider, i4)));
            this.propertyUpdaterProvider = i5m.b(cma1.i(new fa(this.setPropertiesProvider, 25)));
            yvf0 yvf0Var = this.setApplicationContextProvider;
            this.commonConfigPrefsProvider = new fa(yvf0Var, i6);
            xvf0 b17 = i5m.b(cma1.i(new nc(yvf0Var, this.setPropertiesProvider, 15)));
            this.applicationDetailsProviderImplProvider = b17;
            xvf0 b18 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.b(aVar, b17, i2)));
            this.bindApplicationDetailsProvider = b18;
            this.configStorageProvider = new mb(this.commonConfigPrefsProvider, b18, i);
            this.provideDeviceDensityProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.d(aVar, this.setApplicationContextProvider, i3)));
            xvf0 b19 = i5m.b(cma1.i(new fa(this.setApplicationContextProvider, i5)));
            this.provideUrlTemplateDataStoreProvider = b19;
            int i7 = 4;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(b19, i7);
            this.urlTemplateRepositoryProvider = gVar;
            z1 z1Var = new z1(this.propertyUpdaterProvider, this.configStorageProvider, this.flagRepositoryProvider, this.provideDeviceDensityProvider, gVar, 19);
            this.baseUrlDispatcherImplProvider = z1Var;
            this.provideBaseUrlDispatcherProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.g(hVar, z1Var, i4)));
            this.provideAnalyticsTrackerWrapperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.q(nVar, this.setIReporterInternalProvider, i3)));
            xvf0 b20 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i6)));
            this.tokenActionReporterProvider = b20;
            this.provideBackendParserProvider = i5m.b(cma1.i(new g1(hVar, this.provideAnalyticsTrackerWrapperProvider, this.provideClockProvider, b20)));
            this.provideBackendReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.j(hVar, this.provideAnalyticsTrackerWrapperProvider, i3)));
            xvf0 b21 = i5m.b(cma1.i(new fa(this.setPropertiesProvider, 19)));
            this.masterCredentialsProvider = b21;
            this.provideProductionBackendClientProvider = i5m.b(cma1.i(new f551(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, b21)));
            this.provideTeamProductionBackendClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.l(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 1)));
            this.provideTestingBackendClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.l(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 3)));
            this.provideTeamTestingBackendClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.l(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 2)));
            this.provideRcBackendClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.l(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 0)));
            int i8 = ei00.b;
            di00 di00Var = new di00(5);
            di00Var.Ig(1, this.provideProductionBackendClientProvider);
            di00Var.Ig(2, this.provideTeamProductionBackendClientProvider);
            di00Var.Ig(3, this.provideTestingBackendClientProvider);
            di00Var.Ig(4, this.provideTeamTestingBackendClientProvider);
            di00Var.Ig(5, this.provideRcBackendClientProvider);
            this.mapOfIntegerAndBackendClientProvider = di00Var.Hg();
            xvf0 b22 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.setApplicationContextProvider, this.localeHelperProvider, 26)));
            this.uiLanguageProviderImplProvider = b22;
            this.bindUiLanguageProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.b(aVar, b22, i7)));
            xvf0 c2 = i5m.c(com.yandex.passport.internal.common.k.a);
            this.tldResolverProvider = c2;
            this.provideProductionFrontendClientProvider = i5m.b(cma1.i(new j4(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, c2, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider)));
            this.provideTestingFrontendClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.m(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, this.tldResolverProvider, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, this.configStorageProvider, 3)));
            this.provideTeamFrontendClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.m(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, this.tldResolverProvider, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, this.configStorageProvider, 1)));
            this.provideTeamTestingFrontendClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.m(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, this.tldResolverProvider, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, this.configStorageProvider, 2)));
            this.provideRcFrontendClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.m(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, this.tldResolverProvider, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, this.configStorageProvider, 0)));
            di00 di00Var2 = new di00(5);
            di00Var2.Ig(1, this.provideProductionFrontendClientProvider);
            di00Var2.Ig(3, this.provideTestingFrontendClientProvider);
            di00Var2.Ig(2, this.provideTeamFrontendClientProvider);
            di00Var2.Ig(4, this.provideTeamTestingFrontendClientProvider);
            di00Var2.Ig(5, this.provideRcFrontendClientProvider);
            ei00 Hg = di00Var2.Hg();
            this.mapOfIntegerAndFrontendClientProvider = Hg;
            this.provideBackendClientChooserProvider = i5m.b(cma1.i(new com.yandex.passport.internal.badges.d(hVar, this.mapOfIntegerAndBackendClientProvider, Hg, 1)));
            int i9 = 26;
            xvf0 b23 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.setApplicationContextProvider, i9)));
            this.preferenceStorageProvider = b23;
            this.masterTokenEncrypterProvider = i5m.b(cma1.i(new mb(this.setApplicationContextProvider, b23, i4)));
            this.provideEventReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.q(nVar, this.provideAnalyticsTrackerWrapperProvider, 2)));
            this.stashReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, 12)));
            xvf0 b24 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 14)));
            this.storageReporterProvider = b24;
            xvf0 b25 = i5m.b(cma1.i(new mb(this.setApplicationContextProvider, b24, 5)));
            this.provideDataStoreProvider = b25;
            xvf0 b26 = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b25, 18)));
            this.dataStoreManagerImplProvider = b26;
            this.provideDataStoreManagerProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b26, 7)));
            xvf0 b27 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, 15)));
            this.tombstoneReporterProvider = b27;
            xvf0 b28 = i5m.b(cma1.i(new k8(this.provideDataStoreManagerProvider, this.bindApplicationDetailsProvider, b27, i4)));
            this.masterTokenTombstoneManagerImplProvider = b28;
            int i10 = 1;
            this.provideMasterTokenTombstoneManagerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.i(hVar, b28, i10)));
            xvf0 b29 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i10)));
            this.delayedAccountReporterProvider = b29;
            this.provideAndroidAccountManagerHelperProvider = i5m.b(cma1.i(new cfw0(nVar, this.setApplicationContextProvider, this.masterTokenEncrypterProvider, this.provideEventReporterProvider, this.stashReporterProvider, this.preferenceStorageProvider, this.provideClockProvider, this.provideMasterTokenTombstoneManagerProvider, this.provideDatabaseHelperProvider, b29)));
            xvf0 b30 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.k(hVar, this.provideCoroutineDispatchersProvider, this.provideOkHttpClientProvider, 0)));
            this.provideBaseOkHttpUseCaseProvider = b30;
            this.provideRetryingOkHttpUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.badges.d(hVar, this.provideCoroutineDispatchersProvider, b30, 2)));
            xvf0 b31 = i5m.b(cma1.i(new nc(this.eventReporterProvider, this.reportingFeatureProvider, 28)));
            this.backendReporterProvider = b31;
            com.yandex.passport.common.coroutine.g gVar2 = new com.yandex.passport.common.coroutine.g(b31, 11);
            this.backendReporterWrapperImplProvider = gVar2;
            this.provideBackendReporterWrapperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.g(hVar, gVar2, 1)));
            xvf0 c3 = i5m.c(com.yandex.passport.internal.network.mappers.c.a);
            this.environmentDataMapperProvider = c3;
            mb mbVar = new mb(this.provideBaseUrlDispatcherProvider, c3, 6);
            this.backendUrlDispatcherImplProvider = mbVar;
            int i11 = 2;
            xvf0 b32 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.g(hVar, mbVar, i11)));
            this.provideBackendUrlDispatcherProvider = b32;
            this.requestCreatorProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b32, i11)));
            xvf0 b33 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.j(hVar, this.commonParamsProvider, 1)));
            this.provideCommonBackendParamsProvider = b33;
            xvf0 b34 = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.provideAnalyticalIdentifiersProvider, this.bindApplicationDetailsProvider, this.provideClockProvider, b33, 0)));
            this.commonBackendQueryProvider = b34;
            mb mbVar2 = new mb(this.requestCreatorProvider, b34, 0);
            this.requestFactoryProvider = mbVar2;
            this.revokeMasterTokenRequestProvider = i5m.b(cma1.i(new j4(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, nb.a, pb.a, mbVar2, this.provideMasterTokenTombstoneManagerProvider, 2)));
            this.tryGetMasterCredentialsByAccountProvider = i5m.b(cma1.i(new e9(this.provideCoroutineDispatchersProvider, this.masterCredentialsProvider, this.provideAndroidAccountManagerHelperProvider, 16)));
            this.clientTokenDroppingInteractorProvider = i5m.b(cma1.i(new nc(this.provideDatabaseHelperProvider, this.provideEventReporterProvider, 17)));
            com.yandex.passport.data.network.m mVar = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 25);
            this.requestFactoryProvider2 = mVar;
            this.pushSubscribeRequestProvider = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) mVar, this.provideMasterTokenTombstoneManagerProvider, 10)));
            com.yandex.passport.data.network.m mVar2 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i9);
            this.requestFactoryProvider3 = mVar2;
            this.pushUnsubscribeRequestProvider = i5m.b(cma1.i(new g1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar2, 5)));
            this.provideGcmSubscriptionsDaoProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.f(eVar, this.provideDatabaseHelperProvider, i4)));
            this.pushSubscriptionTimeDispatcherProvider = i5m.b(cma1.i(new nc(this.provideClockProvider, this.flagRepositoryProvider, 22)));
        }

        private void initialize2(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.n nVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.p pVar) {
            this.hashEncoderProvider = i5m.c(com.yandex.passport.internal.util.k.a);
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, 8)));
            this.pushReporterProvider = b;
            this.pushSubscriberProvider = i5m.b(cma1.i(new com.yandex.passport.internal.core.accounts.o(this.pushSubscribeRequestProvider, this.pushUnsubscribeRequestProvider, this.provideGcmSubscriptionsDaoProvider, this.pushSubscriptionTimeDispatcherProvider, this.hashEncoderProvider, this.preferenceStorageProvider, this.flagRepositoryProvider, b, this.environmentDataMapperProvider)));
            int i = 5;
            this.providePermissionManagerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.q(nVar, this.setApplicationContextProvider, i)));
            this.delayedAccountProvider = i5m.b(cma1.i(new nc(this.provideDatabaseHelperProvider, this.modernAccountMapperProvider, 16)));
            this.provideSyncHelperProvider = i5m.b(cma1.i(new g1(nVar, this.setApplicationContextProvider, this.provideClockProvider, this.flagRepositoryProvider)));
            xvf0 b2 = i5m.b(cma1.i(new nc(this.eventReporterProvider, this.reportingFeatureProvider, 24)));
            this.announcementReporterProvider = b2;
            yvf0 yvf0Var = this.setApplicationContextProvider;
            fa faVar = new fa(yvf0Var, 12);
            this.accountSharingConfigStorageProvider = faVar;
            this.announcingHelperProvider = i5m.b(cma1.i(new z1(yvf0Var, this.provideClockProvider, b2, this.provideAnalyticalIdentifiersProvider, faVar)));
            this.accountsBackuperProvider = new eqh();
            this.pushSubscriptionSchedulerProvider = new eqh();
            this.accountsChangesSelfAnnouncerProvider = i5m.b(cma1.i(new fa(this.setApplicationContextProvider, 18)));
            this.ssoApplicationsResolverProvider = i5m.b(cma1.i(new e9(this.setApplicationContextProvider, this.accountSharingConfigStorageProvider, this.provideEventReporterProvider, 9)));
            this.ssoDisablerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.setPropertiesProvider, this.flagRepositoryProvider, 25)));
            this.ssoContentProviderClientProvider = i5m.b(cma1.i(new e9(this.setApplicationContextProvider, this.provideEventReporterProvider, this.ssoApplicationsResolverProvider, 11)));
            this.accountsChangesAnnouncerProvider = new eqh();
            this.revokeMasterTokenUseCaseProvider = new eqh();
            int i2 = 3;
            this.accountUpdateReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i2)));
            xvf0 b3 = i5m.b(cma1.i(new fa(this.preferenceStorageProvider, i2)));
            this.currentAccountStorageProvider = b3;
            this.provideAccountsUpdaterProvider = i5m.b(cma1.i(new my0(nVar, this.provideAndroidAccountManagerHelperProvider, this.accountsChangesAnnouncerProvider, this.provideEventReporterProvider, this.revokeMasterTokenUseCaseProvider, this.stashReporterProvider, this.tokenActionReporterProvider, this.accountUpdateReporterProvider, this.setPropertiesProvider, this.provideDatabaseHelperProvider, this.delayedAccountReporterProvider, b3, this.modernAccountMapperProvider)));
            eqh eqhVar = new eqh();
            this.immediateAccountsRetrieverProvider = eqhVar;
            this.accountsSaverProvider = i5m.b(cma1.i(new z1(this.provideAccountsUpdaterProvider, (v7p) eqhVar, this.provideEventReporterProvider, this.flagRepositoryProvider, this.modernAccountMapperProvider, 17)));
            int i3 = 1;
            xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i3)));
            this.accountLoadingReporterProvider = b4;
            xvf0 b5 = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b4, i)));
            this.memberAccountRepositoryProvider = b5;
            this.removeAccountUseCaseProvider = new com.yandex.passport.data.network.core.i(this.provideAccountsUpdaterProvider, b5, this.immediateAccountsRetrieverProvider, this.flagRepositoryProvider, 2);
            int i4 = 4;
            xvf0 b6 = i5m.b(cma1.i(new e9(this.provideDatabaseHelperProvider, this.provideClockProvider, this.modernAccountMapperProvider, i4)));
            this.accountLastActionHelperProvider = b6;
            xvf0 b7 = i5m.b(cma1.i(new com.yandex.passport.internal.helper.e(this.accountsSaverProvider, this.removeAccountUseCaseProvider, this.immediateAccountsRetrieverProvider, b6, this.ssoContentProviderClientProvider, this.ssoDisablerProvider, this.provideEventReporterProvider, this.modernAccountMapperProvider)));
            this.ssoAccountsSyncHelperProvider = b7;
            xvf0 b8 = i5m.b(cma1.i(new com.yandex.passport.internal.config.l(this.setApplicationContextProvider, this.ssoApplicationsResolverProvider, this.ssoDisablerProvider, this.provideEventReporterProvider, this.ssoContentProviderClientProvider, b7, 2)));
            this.ssoAnnouncerProvider = b8;
            eqh eqhVar2 = (eqh) this.accountsChangesAnnouncerProvider;
            xvf0 i5 = cma1.i(i5m.b(cma1.i(new com.yandex.passport.internal.config.l(this.announcingHelperProvider, this.accountsBackuperProvider, this.pushSubscriptionSchedulerProvider, this.accountsChangesSelfAnnouncerProvider, b8, this.accountLastActionHelperProvider))));
            if (eqhVar2.a != null) {
                ny61.k();
                return;
            }
            eqhVar2.a = i5;
            eqh eqhVar3 = (eqh) this.accountsBackuperProvider;
            xvf0 i6 = cma1.i(i5m.b(cma1.i(new com.yandex.passport.internal.core.accounts.c(this.provideAndroidAccountManagerHelperProvider, this.delayedAccountProvider, this.provideDatabaseHelperProvider, this.provideSyncHelperProvider, this.accountsChangesAnnouncerProvider, this.preferenceStorageProvider, this.provideEventReporterProvider, this.setPropertiesProvider, this.flagRepositoryProvider, 0))));
            if (eqhVar3.a != null) {
                ny61.k();
                return;
            }
            eqhVar3.a = i6;
            xvf0 b9 = i5m.b(cma1.i(new e9(this.provideAccountsUpdaterProvider, this.provideBackendClientChooserProvider, this.provideEventReporterProvider, i3)));
            this.corruptedAccountRepairerProvider = b9;
            eqh eqhVar4 = (eqh) this.immediateAccountsRetrieverProvider;
            xvf0 i7 = cma1.i(i5m.b(cma1.i(new com.yandex.passport.internal.core.accounts.o(this.provideAndroidAccountManagerHelperProvider, this.delayedAccountProvider, this.provideDatabaseHelperProvider, this.accountsBackuperProvider, b9, this.provideEventReporterProvider, this.provideClockProvider, this.modernAccountMapperProvider, this.preferenceStorageProvider))));
            if (eqhVar4.a != null) {
                ny61.k();
                return;
            }
            eqhVar4.a = i7;
            xvf0 b10 = i5m.b(cma1.i(new e9(this.ssoApplicationsResolverProvider, this.ssoAnnouncerProvider, this.ssoAccountsSyncHelperProvider, 10)));
            this.ssoBootstrapHelperProvider = b10;
            xvf0 b11 = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.setApplicationContextProvider, this.preferenceStorageProvider, b10, this.ssoDisablerProvider, 4)));
            this.bootstrapHelperProvider = b11;
            this.provideAccountsRetrieverProvider = i5m.b(cma1.i(new com.yandex.passport.internal.badges.d(nVar, this.immediateAccountsRetrieverProvider, b11, 3)));
            this.pushAvailabilityDetectorProvider = i5m.b(cma1.i(new fa(this.setApplicationContextProvider, 27)));
            xvf0 c = i5m.c(com.yandex.passport.internal.provider.communication.s.a);
            this.passportRequestsMapperProvider = c;
            this.passportRequestsProcessorProvider = i5m.b(cma1.i(new mb(this.setApplicationContextProvider, c, 8)));
            xvf0 c2 = i5m.c(com.yandex.passport.internal.provider.communication.m.a);
            this.iPCPropertiesHolderProvider = c2;
            xvf0 b12 = i5m.b(cma1.i(new mb(this.passportRequestsProcessorProvider, c2, 7)));
            this.iPCImplProvider = b12;
            int i8 = 0;
            this.provideIPCApiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.r(nVar, b12, i8)));
            xvf0 b13 = i5m.b(cma1.i(new com.yandex.passport.internal.badges.d(nVar, this.pushSubscriptionSchedulerProvider, this.setApplicationContextProvider)));
            this.provideNotificationDndManagerProvider = b13;
            xvf0 b14 = i5m.b(cma1.i(new vw2(b13, this.setPropertiesProvider, this.pushSubscriberProvider, this.provideAccountsRetrieverProvider, this.provideGcmSubscriptionsDaoProvider, this.hashEncoderProvider, this.pushAvailabilityDetectorProvider, this.pushReporterProvider, this.provideDatabaseHelperProvider, this.flagRepositoryProvider, this.provideIPCApiProvider, this.iPCPropertiesHolderProvider)));
            this.greatAgainPushSubscriptionManagerProvider = b14;
            xvf0 b15 = i5m.b(cma1.i(new k8(this.provideCoroutineDispatchersProvider, this.preferenceStorageProvider, b14, i4)));
            this.passportPushRegistrationUseCaseProvider = b15;
            xvf0 b16 = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.setApplicationContextProvider, this.provideCoroutineScopesProvider, this.provideCoroutineDispatchersProvider, b15, 6)));
            this.subscriptionEnqueuePerformerProvider = b16;
            eqh eqhVar5 = (eqh) this.pushSubscriptionSchedulerProvider;
            xvf0 i9 = cma1.i(i5m.b(cma1.i(new z0(this.setApplicationContextProvider, this.setPropertiesProvider, this.providePermissionManagerProvider, this.flagRepositoryProvider, b16, 4))));
            if (eqhVar5.a != null) {
                ny61.k();
                return;
            }
            eqhVar5.a = i9;
            eqh eqhVar6 = (eqh) this.revokeMasterTokenUseCaseProvider;
            xvf0 i10 = cma1.i(i5m.b(cma1.i(new com.yandex.passport.internal.core.accounts.c(this.provideCoroutineDispatchersProvider, this.revokeMasterTokenRequestProvider, this.tryGetMasterCredentialsByAccountProvider, this.masterCredentialsProvider, this.tokenActionReporterProvider, this.environmentDataMapperProvider, this.clientTokenDroppingInteractorProvider, this.pushSubscriberProvider, this.pushSubscriptionSchedulerProvider, 2))));
            if (eqhVar6.a != null) {
                ny61.k();
                return;
            }
            eqhVar6.a = i10;
            xvf0 b17 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.revokeMasterTokenUseCaseProvider, 29)));
            this.revokeMasterTokenWrapperProvider = b17;
            this.authenticatorProvider = i5m.b(cma1.i(new z0(this.setApplicationContextProvider, b17, this.provideDatabaseHelperProvider, this.accountsChangesAnnouncerProvider, this.currentAccountStorageProvider)));
            this.responseTransformerProvider = new fa(this.provideClockProvider, i8);
            this.requestFactoryProvider4 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 23);
            int i11 = 6;
            xvf0 b18 = i5m.b(cma1.i(new nc(this.provideCoroutineDispatchersProvider, this.provideMasterTokenTombstoneManagerProvider, i11)));
            this.usingMasterTokenRequestUseCaseProvider = b18;
            int i12 = 0;
            this.getUserInfoRequestProvider = i5m.b(cma1.i(new ea(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.responseTransformerProvider, (yvf0) ga.a, this.requestFactoryProvider4, b18, i12)));
            int i13 = 13;
            com.yandex.passport.data.network.m mVar = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i13);
            this.requestFactoryProvider5 = mVar;
            xvf0 b19 = i5m.b(cma1.i(new j4(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, k4.a, m4.a, mVar, this.provideMasterTokenTombstoneManagerProvider, i12)));
            this.getClientOrMasterTokenByMasterTokenRequestProvider = b19;
            this.getMasterTokenByMasterTokenUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.provideCoroutineDispatchersProvider, this.setPropertiesProvider, b19, this.environmentDataMapperProvider, 9)));
            xvf0 b20 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i11)));
            this.masterTokenRotationReporterProvider = b20;
            mb mbVar = new mb(this.setApplicationContextProvider, b20, i13);
            this.quarantineMasterTokenStorageProvider = mbVar;
            xvf0 b21 = i5m.b(cma1.i(new h7(this.provideCoroutineDispatchersProvider, this.getMasterTokenByMasterTokenUseCaseProvider, this.revokeMasterTokenUseCaseProvider, b20, mbVar, this.masterCredentialsProvider)));
            this.masterTokenRotationUseCaseProvider = b21;
            xvf0 b22 = i5m.b(cma1.i(new ea(this.provideCoroutineDispatchersProvider, this.getUserInfoRequestProvider, this.provideAccountsRetrieverProvider, this.flagRepositoryProvider, b21, this.environmentDataMapperProvider, this.provideUserInfoMapperProvider, 6)));
            this.getAllUserInfoUseCaseProvider = b22;
            this.provideModernAccountRefresherProvider = i5m.b(cma1.i(new f551(nVar, this.provideAccountsUpdaterProvider, this.provideClockProvider, b22, this.provideDatabaseHelperProvider, this.bindUiLanguageProvider, this.flagRepositoryProvider, this.memberAccountRepositoryProvider, this.provideUserInfoMapperProvider)));
            xvf0 b23 = i5m.b(cma1.i(new fa(this.provideAnalyticsTrackerWrapperProvider, 8)));
            this.syncReporterProvider = b23;
            xvf0 b24 = i5m.b(cma1.i(new ea(this.setApplicationContextProvider, this.provideAndroidAccountManagerHelperProvider, this.provideModernAccountRefresherProvider, this.corruptedAccountRepairerProvider, this.provideAccountsRetrieverProvider, b23, this.modernAccountMapperProvider, 3)));
            this.accountSynchronizerProvider = b24;
            this.syncAdapterProvider = i5m.b(cma1.i(new mb(this.setApplicationContextProvider, b24, i4)));
            this.processAuthorizationResultUseCaseProvider = new r0(this.provideCoroutineDispatchersProvider, this.accountsSaverProvider, this.provideDatabaseHelperProvider, this.tokenActionReporterProvider, 8);
            xvf0 b25 = i5m.b(cma1.i(new nc(this.eventReporterProvider, this.reportingFeatureProvider, 26)));
            this.authorizationReporterProvider = b25;
            xvf0 b26 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.i(hVar, b25, i8)));
            this.provideAuthorizationReporterWrapperProvider = b26;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(b26, 1);
            this.resultTransformerProvider = gVar;
            com.yandex.passport.data.network.m mVar2 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i8);
            this.requestFactoryProvider6 = mVar2;
            this.authorizeByPasswordRequestProvider = new qxu0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, gVar, mVar2, 24);
            int i14 = 24;
            xvf0 b27 = i5m.b(cma1.i(new fa(this.provideUserInfoMapperProvider, i14)));
            this.authorizationResultDataMapperProvider = b27;
            yvf0 yvf0Var2 = this.provideCoroutineDispatchersProvider;
            this.authorizeByPasswordUseCaseProvider = new ea(yvf0Var2, this.processAuthorizationResultUseCaseProvider, this.authorizeByPasswordRequestProvider, this.authorizationReporterProvider, this.setPropertiesProvider, this.environmentDataMapperProvider, b27, 9);
            this.fetchModernAccountUseCaseProvider = new z1(yvf0Var2, this.getAllUserInfoUseCaseProvider, this.tokenActionReporterProvider, this.provideDatabaseHelperProvider, this.bindUiLanguageProvider, 20);
            int i15 = 2;
            nc ncVar = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, i15);
            this.requestFactoryProvider7 = ncVar;
            this.suggestedLanguageRequestProvider = i5m.b(cma1.i(new g1(yvf0Var2, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, ncVar, 6)));
            xvf0 b28 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i13)));
            this.suggestedLanguageReporterProvider = b28;
            xvf0 b29 = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.bindUiLanguageProvider, this.suggestedLanguageRequestProvider, b28, this.environmentDataMapperProvider, 11)));
            this.suggestedLanguageUseCaseProvider = b29;
            yvf0 yvf0Var3 = this.provideCoroutineDispatchersProvider;
            yvf0 yvf0Var4 = this.fetchModernAccountUseCaseProvider;
            yvf0 yvf0Var5 = this.accountsSaverProvider;
            e9 e9Var = new e9(yvf0Var3, yvf0Var4, yvf0Var5, 15);
            this.fetchAndSaveModernAccountUseCaseProvider = e9Var;
            this.loginControllerProvider = i5m.b(cma1.i(new cfw0(this.provideBackendClientChooserProvider, yvf0Var5, this.setPropertiesProvider, this.provideDatabaseHelperProvider, this.tokenActionReporterProvider, this.provideBackendParserProvider, this.authorizeByPasswordUseCaseProvider, yvf0Var4, b29, e9Var)));
            xvf0 b30 = i5m.b(cma1.i(new nc(this.setApplicationContextProvider, this.storageReporterProvider, 18)));
            this.filterRulesStorageProvider = b30;
            com.yandex.passport.internal.di.module.c cVar = new com.yandex.passport.internal.di.module.c(i8, aVar);
            this.provideAmVersionProvider = cVar;
            g1 g1Var = new g1(b30, this.bindApplicationDetailsProvider, cVar, com.yandex.passport.internal.filter.t.a);
            this.accountFilterRepositoryProvider = g1Var;
            this.loadAccountsUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.badges.d(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, (v7p) g1Var, 7)));
            this.provideImageLoadingClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.j(hVar, this.provideOkHttpClientProvider, i15)));
            this.accountTrackerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.usecase.l0(this.provideAndroidAccountManagerHelperProvider, this.provideEventReporterProvider, i15)));
            this.authSdkProviderHelperProvider = i5m.b(cma1.i(new nc(this.provideAccountsRetrieverProvider, this.accountFilterRepositoryProvider, 14)));
            this.smsRetrieverHelperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.setApplicationContextProvider, this.preferenceStorageProvider, i14)));
            this.silentPushReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 12)));
            com.yandex.passport.data.network.m mVar3 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 20);
            this.requestFactoryProvider8 = mVar3;
            this.getPush2faCodeRequestProvider = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) mVar3, this.provideMasterTokenTombstoneManagerProvider, 6)));
            this.pushPayloadFactoryProvider = new fa(this.pushReporterProvider, 28);
            this.pushPayloadStorageProvider = i5m.c(com.yandex.passport.internal.push.f0.a);
            yvf0 yvf0Var6 = this.setApplicationContextProvider;
            r0 r0Var = new r0(yvf0Var6, this.bindApplicationDetailsProvider, this.provideAnalyticalIdentifiersProvider, this.flagRepositoryProvider, 2);
            this.pushIntentProvider = r0Var;
            nc ncVar2 = new nc(yvf0Var6, this.provideBaseUrlDispatcherProvider, 21);
            this.pictureIdToBitmapMapperProvider = ncVar2;
            this.notificationPictureBuilderProvider = i5m.b(cma1.i(new com.yandex.passport.internal.badges.d(yvf0Var6, (yvf0) ncVar2, (v7p) r0Var, 5)));
            com.yandex.passport.data.network.m mVar4 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 1);
            this.requestFactoryProvider9 = mVar4;
            yvf0 yvf0Var7 = this.provideCoroutineDispatchersProvider;
            qxu0 qxu0Var = new qxu0(yvf0Var7, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar4, this.provideMasterTokenTombstoneManagerProvider, 25);
            this.authorizeByXTokenRequestProvider = qxu0Var;
            this.getAuthorizationUrlUseCaseProvider = i5m.b(cma1.i(new h7(yvf0Var7, this.provideAccountsRetrieverProvider, this.provideBaseUrlDispatcherProvider, qxu0Var, this.authorizationReporterProvider, this.environmentDataMapperProvider, 8)));
            xvf0 b31 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, 7)));
            this.pushOpenUrlInBrowserReporterProvider = b31;
            this.notificationHelperProvider = i5m.b(cma1.i(new cui(this.setApplicationContextProvider, this.provideAccountsRetrieverProvider, this.pushReporterProvider, this.silentPushReporterProvider, this.provideAnalyticalIdentifiersProvider, this.bindApplicationDetailsProvider, this.pushSubscriberProvider, this.getPush2faCodeRequestProvider, this.pushAvailabilityDetectorProvider, this.provideCoroutineDispatchersProvider, this.flagRepositoryProvider, this.environmentDataMapperProvider, this.pushPayloadFactoryProvider, this.pushPayloadStorageProvider, this.pushIntentProvider, this.notificationPictureBuilderProvider, this.getAuthorizationUrlUseCaseProvider, b31)));
        }

        private void initialize3(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.n nVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.p pVar) {
            int i = 9;
            com.yandex.passport.data.network.m mVar = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i);
            this.requestFactoryProvider10 = mVar;
            this.experimentsRequestProvider = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) n2.a, (yvf0) mVar, 1)));
            int i2 = 2;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i2)));
            this.experimentReporterProvider = b;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(b, i);
            this.experimentsParserProvider = gVar;
            this.experimentsFetcherProvider = i5m.b(cma1.i(new h7(this.experimentsRequestProvider, this.provideExperimentsHolderProvider, gVar, b, this.provideAnalyticalIdentifiersProvider, this.environmentDataMapperProvider)));
            e9 e9Var = new e9(this.setApplicationContextProvider, this.provideCoroutineScopesProvider, this.provideCoroutineDispatchersProvider, 3);
            this.updateEnqueuePerformerProvider = e9Var;
            this.experimentsUpdaterProvider = i5m.b(cma1.i(new g1(this.provideExperimentsHolderProvider, this.provideClockProvider, this.providePermissionManagerProvider, e9Var, 10)));
            this.domikStatefulReporterProvider = i5m.b(cma1.i(new fa(this.provideAnalyticsTrackerWrapperProvider, 6)));
            this.provideDebugInfoUtilProvider = i5m.b(cma1.i(new j4(nVar, this.setApplicationContextProvider, this.provideAnalyticsHelperProvider, this.provideAndroidAccountManagerHelperProvider, this.provideAccountsRetrieverProvider, this.provideExperimentsHolderProvider, this.modernAccountMapperProvider)));
            int i3 = 13;
            xvf0 b2 = i5m.b(cma1.i(new nc(this.provideAccountsRetrieverProvider, this.currentAccountStorageProvider, i3)));
            this.currentAccountManagerProvider = b2;
            this.currentAccountAnalyticsHelperProvider = i5m.b(cma1.i(new ea(this.setApplicationContextProvider, this.preferenceStorageProvider, b2, this.provideDatabaseHelperProvider, this.provideEventReporterProvider, this.setPropertiesProvider, this.provideClockProvider)));
            int i4 = 16;
            xvf0 b3 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i4)));
            this.userInfoReporterProvider = b3;
            this.personProfileHelperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.helper.e(this.provideAccountsRetrieverProvider, this.provideBackendClientChooserProvider, this.accountSynchronizerProvider, this.preferenceStorageProvider, this.provideClockProvider, this.contextUtilsProvider, b3, this.getAuthorizationUrlUseCaseProvider)));
            this.ssoContentProviderHelperProvider = i5m.b(cma1.i(new r0(this.ssoApplicationsResolverProvider, this.ssoAccountsSyncHelperProvider, this.tokenActionReporterProvider, this.modernAccountMapperProvider, 5)));
            this.appBindReporterProvider = i5m.b(cma1.i(new fa(this.provideAnalyticsTrackerWrapperProvider, 4)));
            this.socialBrowserReporterProvider = i5m.b(cma1.i(new fa(this.provideAnalyticsTrackerWrapperProvider, 7)));
            int i5 = 5;
            this.authByTrackReporterProvider = i5m.b(cma1.i(new fa(this.provideAnalyticsTrackerWrapperProvider, i5)));
            com.yandex.passport.data.network.m mVar2 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i4);
            this.requestFactoryProvider11 = mVar2;
            this.getConfigRequestProvider = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) o6.a, (yvf0) mVar2, 4)));
            this.configReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i5)));
            xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.o(nVar, i2)));
            this.provideTimeProvider = b4;
            this.configStatusStorageProvider = new k8(this.commonConfigPrefsProvider, b4, this.bindApplicationDetailsProvider, 1);
            yvf0 yvf0Var = this.setApplicationContextProvider;
            int i6 = 17;
            this.whiteListRegexConfigStorageProvider = new fa(yvf0Var, i6);
            this.ebsConfigStorageProvider = new fa(yvf0Var, 15);
            xvf0 b5 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i6)));
            this.vpnChallengeReporterProvider = b5;
            this.vpnConfigRepositoryProvider = i5m.b(cma1.i(new k8(this.commonConfigPrefsProvider, this.bindApplicationDetailsProvider, b5, i2)));
            xvf0 b6 = i5m.b(cma1.i(new fa(this.commonConfigPrefsProvider, i3)));
            this.autoLoginParametersConfigStorageProvider = b6;
            xvf0 b7 = i5m.b(cma1.i(new com.yandex.passport.internal.config.n(this.provideCoroutineDispatchersProvider, this.configStorageProvider, this.getConfigRequestProvider, this.configReporterProvider, this.configStatusStorageProvider, this.environmentDataMapperProvider, com.yandex.passport.internal.network.mappers.f.a, this.accountFilterRepositoryProvider, this.urlTemplateRepositoryProvider, this.whiteListRegexConfigStorageProvider, this.ebsConfigStorageProvider, this.vpnConfigRepositoryProvider, b6)));
            this.getConfigUseCaseProvider = b7;
            int i7 = 8;
            this.checkLocationIdUseCaseProvider = i5m.b(cma1.i(new k8(this.provideCoroutineDispatchersProvider, b7, this.configStorageProvider, i7)));
            nc ncVar = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, i7);
            this.requestFactoryProvider12 = ncVar;
            xvf0 b8 = i5m.b(cma1.i(new j4(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, com.yandex.passport.data.network.token.u.a, com.yandex.passport.data.network.token.w.a, ncVar, this.provideMasterTokenTombstoneManagerProvider, 4)));
            this.getMasterTokenByCookieRequestProvider = b8;
            this.authByCookieUseCaseProvider = i5m.b(cma1.i(new ea(this.provideCoroutineDispatchersProvider, this.checkLocationIdUseCaseProvider, this.fetchAndSaveModernAccountUseCaseProvider, b8, this.tokenActionReporterProvider, this.masterCredentialsProvider, this.environmentDataMapperProvider, 8)));
            int i8 = 10;
            this.socialReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i8)));
            xvf0 b9 = i5m.b(cma1.i(new e9(this.setApplicationContextProvider, this.provideBackendClientChooserProvider, this.provideAccountsRetrieverProvider, i5)));
            this.authorizationInTrackHelperProvider = b9;
            this.internalProviderHelperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.provider.c(this.preferenceStorageProvider, this.provideAccountsRetrieverProvider, this.provideAccountsUpdaterProvider, this.provideBackendClientChooserProvider, this.clientTokenDroppingInteractorProvider, this.pushSubscriptionSchedulerProvider, this.provideDebugInfoUtilProvider, this.personProfileHelperProvider, b9, this.experimentsOverridesProvider)));
            xvf0 b10 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.f(eVar, this.setApplicationContextProvider, 4)));
            this.providePassportDatabaseProvider = b10;
            int i9 = 0;
            this.provideDiaryMethodDaoProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.g(eVar, b10, i9)));
            xvf0 b11 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i9)));
            this.diaryReporterProvider = b11;
            xvf0 b12 = i5m.b(cma1.i(new k8(this.provideCoroutineDispatchersProvider, this.provideDiaryMethodDaoProvider, b11, 6)));
            this.diaryEntityRecorderProvider = b12;
            xvf0 b13 = i5m.b(cma1.i(new mb(this.provideClockProvider, b12, i8)));
            this.diaryArgumentsRecorderProvider = b13;
            this.diaryRecorderProvider = i5m.b(cma1.i(new z0(this.flagRepositoryProvider, this.provideClockProvider, this.diaryEntityRecorderProvider, b13, this.provideCoroutineDispatchersProvider, 5)));
            this.requestFactoryProvider13 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 4);
            xvf0 b14 = i5m.b(cma1.i(new nc(this.provideCoroutineDispatchersProvider, this.provideMasterTokenTombstoneManagerProvider, 6)));
            this.usingMasterTokenRequestUseCaseProvider2 = b14;
            this.completeStatusRequestProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.requestFactoryProvider13, b14, 0)));
            int i10 = 27;
            this.upgradeStatusStashUpdaterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.provideAccountsUpdaterProvider, this.provideClockProvider, i10)));
            xvf0 b15 = i5m.b(cma1.i(new nc(this.eventReporterProvider, this.reportingFeatureProvider, 23)));
            this.accountUpgradeReporterProvider = b15;
            this.getUpgradeStatusUseCaseProvider = i5m.b(cma1.i(new ea(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.completeStatusRequestProvider, this.contextUtilsProvider, this.upgradeStatusStashUpdaterProvider, b15, this.environmentDataMapperProvider, 5)));
            com.yandex.passport.data.network.m mVar3 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 15);
            this.requestFactoryProvider14 = mVar3;
            this.getCodeByMasterTokenRequestProvider = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) mVar3, this.provideMasterTokenTombstoneManagerProvider, 3)));
            com.yandex.passport.data.network.m mVar4 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 11);
            this.requestFactoryProvider15 = mVar4;
            yvf0 yvf0Var2 = this.provideCoroutineDispatchersProvider;
            this.getChallengeRequestProvider = new g1(yvf0Var2, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar4, 1);
            this.findModernAccountUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(yvf0Var2, this.provideAccountsRetrieverProvider, 29)));
            xvf0 b16 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.f(eVar, this.provideDatabaseHelperProvider, 1)));
            this.provideClientTokenDaoProvider = b16;
            xvf0 b17 = i5m.b(cma1.i(new com.yandex.passport.internal.provider.c(this.provideCoroutineDispatchersProvider, this.setPropertiesProvider, b16, this.provideAccountsUpdaterProvider, this.getClientOrMasterTokenByMasterTokenRequestProvider, this.provideDatabaseHelperProvider, this.pushSubscriptionSchedulerProvider, this.tokenActionReporterProvider, this.pushSubscriberProvider, this.environmentDataMapperProvider)));
            this.getClientTokenUseCaseProvider = b17;
            this.getChallengeUseCaseProvider = i5m.b(cma1.i(new ea(this.provideCoroutineDispatchersProvider, this.getChallengeRequestProvider, this.provideBaseUrlDispatcherProvider, this.findModernAccountUseCaseProvider, b17, this.bindApplicationDetailsProvider, this.environmentDataMapperProvider, 7)));
            xvf0 b18 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.provideCoroutineDispatchersProvider, this.preferenceStorageProvider, 28)));
            this.disableAutoLoginUseCaseProvider = b18;
            this.logoutUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.provider.c(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.clientTokenDroppingInteractorProvider, this.currentAccountStorageProvider, this.provideEventReporterProvider, b18, this.memberAccountRepositoryProvider, this.flagRepositoryProvider, this.pushSubscriberProvider, this.pushSubscriptionSchedulerProvider)));
            this.autoLoginReporterProvider = i5m.b(cma1.i(new nc(this.eventReporterProvider, this.reportingFeatureProvider, i10)));
            xvf0 b19 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 4)));
            this.badgesReporterProvider = b19;
            yvf0 yvf0Var3 = this.setApplicationContextProvider;
            yvf0 yvf0Var4 = this.provideCoroutineDispatchersProvider;
            com.yandex.passport.data.network.core.i iVar = new com.yandex.passport.data.network.core.i(yvf0Var3, yvf0Var4, this.provideTimeProvider, b19, 1);
            this.badgesStorageProvider = iVar;
            com.yandex.passport.internal.badges.d dVar = new com.yandex.passport.internal.badges.d(yvf0Var4, yvf0Var3, (v7p) iVar, i9);
            this.getAllowedBadgesUseCaseProvider = dVar;
            fa faVar = new fa(yvf0Var4, 9);
            this.getBadgesForAccountUseCaseProvider = faVar;
            this.getOrderedAccountsForAutoLoginUseCaseProvider = i5m.b(cma1.i(new f551(yvf0Var4, this.provideAccountsRetrieverProvider, dVar, faVar, this.autoLoginParametersConfigStorageProvider, this.bindApplicationDetailsProvider, this.flagRepositoryProvider, this.memberAccountRepositoryProvider, this.autoLoginReporterProvider, 2)));
            com.yandex.passport.data.network.m mVar5 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 19);
            this.requestFactoryProvider16 = mVar5;
            xvf0 b20 = i5m.b(cma1.i(new h7(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, u7.a, w7.a, mVar5)));
            this.getMasterTokenByMemberTokenRequestProvider = b20;
            yvf0 yvf0Var5 = this.provideCoroutineDispatchersProvider;
            ea eaVar = new ea(yvf0Var5, this.checkLocationIdUseCaseProvider, this.fetchAndSaveModernAccountUseCaseProvider, b20, this.environmentDataMapperProvider, this.masterCredentialsProvider, this.tokenActionReporterProvider, 10);
            this.authByMuidTokenUseCaseProvider = eaVar;
            e9 e9Var2 = new e9(yvf0Var5, this.memberAccountRepositoryProvider, this.provideAccountsRetrieverProvider, 18);
            this.findMasterUidAccountUseCaseProvider = e9Var2;
            this.autoLoginUseCaseProvider = i5m.b(cma1.i(new n4j0(yvf0Var5, this.preferenceStorageProvider, this.setPropertiesProvider, this.autoLoginReporterProvider, this.getClientTokenUseCaseProvider, this.getOrderedAccountsForAutoLoginUseCaseProvider, eaVar, e9Var2, 17)));
            this.checkVpnBlockRequestProvider = i5m.b(cma1.i(new r0(this.provideCoroutineDispatchersProvider, this.provideBaseOkHttpUseCaseProvider, this.requestCreatorProvider, this.commonBackendQueryProvider, 0)));
            xvf0 b21 = i5m.b(cma1.i(new fa(this.setApplicationContextProvider, i8)));
            this.deviceInfoProviderImplProvider = b21;
            this.bindDeviceInfoProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.b(aVar, b21, 2)));
            xvf0 b22 = i5m.b(cma1.i(new fa(this.commonConfigPrefsProvider, 16)));
            this.vpnCookieRepositoryProvider = b22;
            this.getAntirobotAnswerUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.config.n(this.provideCoroutineDispatchersProvider, this.autoLoginUseCaseProvider, this.currentAccountManagerProvider, this.provideAccountsRetrieverProvider, this.setPropertiesProvider, this.propertyUpdaterProvider, this.getClientTokenUseCaseProvider, this.checkVpnBlockRequestProvider, this.environmentDataMapperProvider, this.bindDeviceInfoProvider, this.bindApplicationDetailsProvider, b22, this.provideIPCApiProvider)));
            xvf0 b23 = i5m.b(cma1.i(new fa(this.setApplicationContextProvider, 11)));
            this.networkWrapperImplProvider = b23;
            this.bindNetworkWrapperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.b(aVar, b23, 3)));
            xvf0 b24 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.setApplicationContextProvider, 19)));
            this.connectionTypeImplProvider = b24;
            xvf0 b25 = i5m.b(cma1.i(new com.yandex.passport.internal.provider.c(this.provideCoroutineDispatchersProvider, this.provideCoroutineScopesProvider, this.getAntirobotAnswerUseCaseProvider, this.bindNetworkWrapperProvider, this.vpnConfigRepositoryProvider, this.flagRepositoryProvider, this.currentAccountStorageProvider, b24, this.propertyUpdaterProvider, this.vpnChallengeReporterProvider)));
            this.checkVpnStatusUseCaseProvider = b25;
            this.executeCheckVpnStatusPerformerProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b25, 10)));
            this.clientTokenDroppingWrapperProvider = i5m.b(cma1.i(new e9(this.provideDatabaseHelperProvider, this.provideAccountsRetrieverProvider, this.clientTokenDroppingInteractorProvider, 2)));
            this.setCurrentAccountUseCaseProvider = i5m.b(cma1.i(new r0(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.currentAccountStorageProvider, this.provideEventReporterProvider, 9)));
            this.requestFactoryProvider17 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 28);
            xvf0 b26 = i5m.b(cma1.i(new nc(this.provideCoroutineDispatchersProvider, this.provideMasterTokenTombstoneManagerProvider, 6)));
            this.usingMasterTokenRequestUseCaseProvider3 = b26;
            this.sendAuthToTrackRequestProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.requestFactoryProvider17, b26, 1)));
            com.yandex.passport.data.network.m mVar6 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 18);
            this.requestFactoryProvider18 = mVar6;
            this.getDeviceCodeRequestProvider = i5m.b(cma1.i(new h7(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) mVar6, (yvf0) i7.a, (yvf0) k7.a, 0)));
            xvf0 b27 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, 9)));
            this.sendAuthToTrackReporterProvider = b27;
            this.deviceAuthorizationHelperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.helper.e(this.provideBackendClientChooserProvider, this.provideAccountsRetrieverProvider, this.sendAuthToTrackRequestProvider, this.getDeviceCodeRequestProvider, b27, this.environmentDataMapperProvider, this.provideAnalyticsTrackerWrapperProvider, this.masterCredentialsProvider)));
            com.yandex.passport.data.network.m mVar7 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 14);
            this.requestFactoryProvider19 = mVar7;
            this.getCodeByCookieRequestProvider = i5m.b(cma1.i(new g1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar7, 3)));
            nc ncVar2 = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, 9);
            this.requestFactoryProvider20 = ncVar2;
            this.getMasterTokenByDeviceCodeRequestProvider = i5m.b(cma1.i(new j4(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, com.yandex.passport.data.network.token.g0.a, com.yandex.passport.data.network.token.i0.a, ncVar2, this.provideMasterTokenTombstoneManagerProvider, 5)));
            nc ncVar3 = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, 7);
            this.requestFactoryProvider21 = ncVar3;
            xvf0 b28 = i5m.b(cma1.i(new j4(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, com.yandex.passport.data.network.token.i.a, com.yandex.passport.data.network.token.k.a, ncVar3, this.provideMasterTokenTombstoneManagerProvider, 3)));
            this.getMasterTokenByCodeRequestProvider = b28;
            this.authorizeByCodeUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.config.l(this.provideCoroutineDispatchersProvider, this.checkLocationIdUseCaseProvider, this.fetchAndSaveModernAccountUseCaseProvider, b28, this.masterCredentialsProvider, this.environmentDataMapperProvider)));
            nc ncVar4 = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, 4);
            this.requestFactoryProvider22 = ncVar4;
            yvf0 yvf0Var6 = this.provideCoroutineDispatchersProvider;
            z1 z1Var = new z1(yvf0Var6, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) ncVar4, this.provideMasterTokenTombstoneManagerProvider, 15);
            this.updateAvatarRequestProvider = z1Var;
            this.updateAvatarUseCaseProvider = i5m.b(cma1.i(new h7(this.setApplicationContextProvider, yvf0Var6, z1Var, this.provideAccountsRetrieverProvider, this.accountSynchronizerProvider, this.environmentDataMapperProvider)));
            xvf0 b29 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.f(eVar, this.providePassportDatabaseProvider, 2)));
            this.provideDiaryUploadDaoProvider = b29;
            xvf0 b30 = i5m.b(cma1.i(new mb(b29, this.provideCoroutineDispatchersProvider, 11)));
            this.diaryUploadDaoWrapperProvider = b30;
            this.diaryUploadUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.flagRepositoryProvider, b30, this.provideClockProvider, this.diaryReporterProvider, 6)));
        }

        private void initialize4(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.n nVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.p pVar) {
            com.yandex.passport.data.network.m mVar = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 7);
            this.requestFactoryProvider23 = mVar;
            this.deviceAuthorizationSubmitRequestProvider = i5m.b(cma1.i(new qxu0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar, this.provideMasterTokenTombstoneManagerProvider, 29)));
            int i = 6;
            com.yandex.passport.data.network.m mVar2 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i);
            this.requestFactoryProvider24 = mVar2;
            this.deviceAuthorizationCommitRequestProvider = i5m.b(cma1.i(new qxu0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar2, this.provideMasterTokenTombstoneManagerProvider, 28)));
            this.authorizeByMasterTokenUseCaseProvider = i5m.b(cma1.i(new e9(this.provideCoroutineDispatchersProvider, this.fetchModernAccountUseCaseProvider, this.accountsSaverProvider, 13)));
            int i2 = 12;
            com.yandex.passport.data.network.m mVar3 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i2);
            this.requestFactoryProvider25 = mVar3;
            this.getChildCodeByUidParentRequestProvider = i5m.b(cma1.i(new g1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar3, 2)));
            com.yandex.passport.data.network.m mVar4 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 22);
            this.requestFactoryProvider26 = mVar4;
            this.getTrackPayloadRequestProvider = i5m.b(cma1.i(new j4(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, p9.a, r9.a, mVar4, this.provideMasterTokenTombstoneManagerProvider, 1)));
            xvf0 b = i5m.b(cma1.i(new fa(this.provideBackendUrlDispatcherProvider, 2)));
            this.hostDispatcherProvider = b;
            int i3 = 0;
            k8 k8Var = new k8(this.requestCreatorProvider, this.commonBackendQueryProvider, b, i3);
            this.requestFactoryProvider27 = k8Var;
            this.getQrLinkRequestProvider = i5m.b(cma1.i(new g1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, k8Var, 4)));
            int i4 = 4;
            this.linkAuthReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i4)));
            nc ncVar = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, 11);
            this.requestFactoryProvider28 = ncVar;
            this.getMasterTokenByTrackIdRequestProvider = i5m.b(cma1.i(new h7(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) com.yandex.passport.data.network.token.g1.a, (v7p) ncVar, this.provideMasterTokenTombstoneManagerProvider, 2)));
            e9 e9Var = new e9(this.requestCreatorProvider, this.commonBackendQueryProvider, this.hostDispatcherProvider, i3);
            this.requestFactoryProvider29 = e9Var;
            this.getTrackFromMagicRequestProvider = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) f9.a, (yvf0) e9Var, 8)));
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.f(eVar, this.providePassportDatabaseProvider, i3)));
            this.provideAuthCookieDaoProvider = b2;
            this.provideAuthCookieDaoWrapperProvider = i5m.b(cma1.i(new h7(eVar, b2, this.provideCoroutineDispatchersProvider, this.commonDecryptUseCaseProvider, this.commonEncryptUseCaseProvider, this.flagRepositoryProvider)));
            int i5 = 17;
            com.yandex.passport.data.network.m mVar5 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i5);
            this.requestFactoryProvider30 = mVar5;
            this.getCookieByTokenRequestProvider = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) mVar5, this.provideMasterTokenTombstoneManagerProvider, 5)));
            xvf0 b3 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i)));
            this.cookieByTokenReporterProvider = b3;
            this.getCookieByTokenUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.getCookieByTokenRequestProvider, this.environmentDataMapperProvider, b3, 9)));
            this.getLocationIdUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.usecase.l0(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, i3)));
            xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.internal.core.accounts.c(this.setApplicationContextProvider, this.provideAndroidAccountManagerHelperProvider, this.provideAccountsRetrieverProvider, this.pushAvailabilityDetectorProvider, this.provideMasterTokenTombstoneManagerProvider, this.baseUrlDispatcherImplProvider, this.eventReporterProvider, this.reportingFeatureProvider, this.modernAccountMapperProvider, 1)));
            this.passportInitReporterProvider = b4;
            this.limitedUpdatedPropertiesReportUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.setApplicationContextProvider, this.provideCoroutineDispatchersProvider, this.provideTimeProvider, b4, 10)));
            int i6 = 3;
            this.requestFactoryProvider31 = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, i6);
            xvf0 b5 = i5m.b(cma1.i(new nc(this.provideCoroutineDispatchersProvider, this.provideMasterTokenTombstoneManagerProvider, i)));
            this.usingMasterTokenRequestUseCaseProvider4 = b5;
            this.tryAddPlusDeviceRequestProvider = new ea(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.requestFactoryProvider31, (yvf0) rd.a, (yvf0) td.a, b5, 1);
            int i7 = 5;
            xvf0 b6 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i7)));
            this.managingPlusDevicesReporterProvider = b6;
            this.tryAddPlusDeviceUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.tryAddPlusDeviceRequestProvider, this.provideAccountsRetrieverProvider, this.environmentDataMapperProvider, b6, 12)));
            this.getAuthorizationUrlReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i6)));
            this.slothWebParamsProviderImplProvider = i5m.b(cma1.i(new r0(this.provideAnalyticsHelperProvider, this.bindApplicationDetailsProvider, this.commonParamsProvider, this.setPropertiesProvider, 3)));
            this.webAmReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, 18)));
            this.userIdReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 16)));
            xvf0 c = i5m.c(com.yandex.passport.internal.common.c.a);
            this.appBackgroundStateWrapperImplProvider = c;
            this.bindAppBackgroundStateWrapperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.b(aVar, c, i3)));
            this.setVpnChallengeActivityDisabledPerformerProvider = i5m.b(cma1.i(new e9(this.setApplicationContextProvider, this.checkVpnStatusUseCaseProvider, this.vpnConfigRepositoryProvider, i)));
            int i8 = 20;
            this.getAccountSubtitlePerformerProvider = i5m.b(cma1.i(new nc(this.setApplicationContextProvider, this.immediateAccountsRetrieverProvider, i8)));
            nc ncVar2 = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, i2);
            this.requestFactoryProvider32 = ncVar2;
            this.getMasterTokenForwardByTrackRequestProvider = i5m.b(cma1.i(new h7(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) com.yandex.passport.data.network.token.p1.a, (v7p) ncVar2, this.provideMasterTokenTombstoneManagerProvider, 3)));
            this.slothAuthDelegateImplProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.authByCookieUseCaseProvider, i8)));
            r0 r0Var = new r0(this.setApplicationContextProvider, this.provideAnalyticsHelperProvider, this.localeHelperProvider, this.bindApplicationDetailsProvider, 1);
            this.urlRestorerProvider = r0Var;
            xvf0 b7 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, (v7p) r0Var, this.clientTokenDroppingWrapperProvider, this.getAuthorizationUrlUseCaseProvider, this.bindUiLanguageProvider, 21)));
            this.authQrUseCaseProvider = b7;
            yvf0 yvf0Var = this.provideCoroutineDispatchersProvider;
            int i9 = 19;
            this.retryingProvider = new mb(yvf0Var, b7, i9);
            xvf0 b8 = i5m.b(cma1.i(new r0(yvf0Var, this.urlRestorerProvider, this.getAuthorizationUrlUseCaseProvider, this.bindUiLanguageProvider, 11)));
            this.showAuthCodeUseCaseProvider = b8;
            yvf0 yvf0Var2 = this.provideCoroutineDispatchersProvider;
            this.retryingProvider2 = new mb(yvf0Var2, b8, i8);
            xvf0 b9 = i5m.b(cma1.i(new e9(yvf0Var2, this.bindUiLanguageProvider, this.provideBaseUrlDispatcherProvider, i9)));
            this.scopeUrlUseCaseProvider = b9;
            this.scopeAuthUrlUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.getAuthorizationUrlUseCaseProvider, this.bindUiLanguageProvider, this.clientTokenDroppingWrapperProvider, b9, 14)));
            int i10 = 1;
            xvf0 b10 = i5m.b(cma1.i(new com.yandex.passport.internal.usecase.l0(this.provideCoroutineDispatchersProvider, this.urlRestorerProvider, i10)));
            this.picturePushUrlUseCaseProvider = b10;
            this.slothUrlProviderImplProvider = i5m.b(cma1.i(new ea(this.getAuthorizationUrlUseCaseProvider, this.retryingProvider, this.retryingProvider2, this.scopeAuthUrlUseCaseProvider, this.scopeUrlUseCaseProvider, b10, this.urlRestorerProvider, 4)));
            int i11 = 21;
            this.slothBaseUrlProviderImplProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.provideBaseUrlDispatcherProvider, i11)));
            this.slothReportDelegateImplProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.provideReporterProvider, this.reportingFeatureProvider, i11)));
            com.yandex.passport.internal.report.reporters.p pVar2 = new com.yandex.passport.internal.report.reporters.p(this.setApplicationContextProvider, this.setPropertiesProvider, i8);
            this.slothEulaSupportProvider = pVar2;
            com.yandex.passport.internal.badges.d dVar = new com.yandex.passport.internal.badges.d(this.whiteListRegexConfigStorageProvider, pVar2, this.provideBaseUrlDispatcherProvider);
            this.urlCheckerProvider = dVar;
            xvf0 b11 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.g(this.configStorageProvider, dVar, i7)));
            this.slothUrlCheckerImplProvider = b11;
            yvf0 yvf0Var3 = this.provideCoroutineDispatchersProvider;
            e9 e9Var2 = new e9(yvf0Var3, this.getCookieByTokenUseCaseProvider, this.webAmReporterProvider, i5);
            this.fetchAuthCookieUseCaseProvider = e9Var2;
            com.yandex.passport.internal.di.module.c cVar = new com.yandex.passport.internal.di.module.c(i4, e9Var2);
            this.slothAuthCookieProviderImplProvider = cVar;
            this.slothDependenciesFactoryProvider = i5m.b(cma1.i(new vw2(this.setApplicationContextProvider, yvf0Var3, this.slothAuthDelegateImplProvider, this.slothUrlProviderImplProvider, this.slothBaseUrlProviderImplProvider, this.flagRepositoryProvider, this.slothReportDelegateImplProvider, this.bindUiLanguageProvider, this.slothWebParamsProviderImplProvider, b11, cVar, this.connectionTypeImplProvider)));
            int i12 = 23;
            this.getCustomEulaStringsCommandPerformerProvider = new com.yandex.passport.internal.report.diary.m(this.slothEulaSupportProvider, i12);
            xvf0 b12 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.q(nVar, this.setPropertiesProvider, 7)));
            this.provideTwoFactorOtpProvider = b12;
            int i13 = 14;
            this.getOtpCommandPerformerProvider = new com.yandex.passport.common.coroutine.g(b12, i13);
            yvf0 yvf0Var4 = this.setApplicationContextProvider;
            this.getPhoneRegionCodeCommandPerformerProvider = new com.yandex.passport.internal.report.diary.m(yvf0Var4, 24);
            this.getSmsCommandPerformerProvider = new r0(yvf0Var4, this.smsRetrieverHelperProvider, this.domikStatefulReporterProvider, this.provideCoroutineScopesProvider, 4);
            this.debugOnlyGetSmsVerificationHashPerformerProvider = new com.yandex.passport.internal.report.diary.m(yvf0Var4, 22);
            this.getXTokenClientIdCommandPerformerProvider = new com.yandex.passport.internal.report.diary.m(this.setPropertiesProvider, 25);
            xvf0 b13 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.k(hVar, this.setIReporterInternalProvider, yvf0Var4, i10)));
            this.provideSmartLockInterfaceProvider = b13;
            yvf0 yvf0Var5 = this.setApplicationContextProvider;
            this.requestLoginCredentialsCommandPerformerProvider = new mb(b13, yvf0Var5, i13);
            this.requestMagicLinkParamsCommandPerformerProvider = new com.yandex.passport.internal.report.reporters.p(this.setPropertiesProvider, this.provideAnalyticsHelperProvider, 22);
            yvf0 yvf0Var6 = this.experimentsOverridesProvider;
            yvf0 yvf0Var7 = this.flagRepositoryProvider;
            nc ncVar3 = new nc(yvf0Var6, yvf0Var7, i9);
            this.savedExperimentsProvider = ncVar3;
            this.requestSavedExperimentsCommandPerformerProvider = new com.yandex.passport.internal.di.module.c(5, ncVar3);
            this.saveLoginCredentialsCommandPerformerProvider = new mb(b13, yvf0Var5, 15);
            this.provideWebAuthNClientProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.k(hVar, yvf0Var5, yvf0Var7, 2)));
            xvf0 b14 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 18)));
            this.webAuthNReporterProvider = b14;
            yvf0 yvf0Var8 = this.provideWebAuthNClientProvider;
            mb mbVar = new mb(yvf0Var8, b14, 16);
            this.webAuthNAuthPerformerProvider = mbVar;
            mb mbVar2 = new mb(yvf0Var8, b14, 17);
            this.webAuthNRegisterPerformerProvider = mbVar2;
            k8 k8Var2 = new k8(yvf0Var8, this.setPropertiesProvider, b14, 7);
            this.webAuthNAvailabilityPerformerProvider = k8Var2;
            xvf0 b15 = i5m.b(cma1.i(new my0(this.getCustomEulaStringsCommandPerformerProvider, this.getOtpCommandPerformerProvider, this.getPhoneRegionCodeCommandPerformerProvider, this.getSmsCommandPerformerProvider, this.debugOnlyGetSmsVerificationHashPerformerProvider, this.getXTokenClientIdCommandPerformerProvider, this.requestLoginCredentialsCommandPerformerProvider, this.requestMagicLinkParamsCommandPerformerProvider, this.requestSavedExperimentsCommandPerformerProvider, this.saveLoginCredentialsCommandPerformerProvider, mbVar, mbVar2, k8Var2, 19)));
            this.primarySlothPerformBinderProvider = b15;
            this.slothStandalonePerformConfigurationProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b15, i9)));
            this.webCardEventSenderProvider = i5m.c(com.yandex.passport.internal.sloth.performers.webcard.h.a);
            xvf0 b16 = i5m.b(cma1.i(new com.yandex.passport.internal.usecase.ui.o(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.provideBackendClientChooserProvider, this.bindUiLanguageProvider, this.tldResolverProvider, this.getAuthorizationUrlUseCaseProvider, 0)));
            this.changePasswordUseCaseProvider = b16;
            yvf0 yvf0Var9 = this.webCardEventSenderProvider;
            mb mbVar3 = new mb(yvf0Var9, b16, 18);
            this.beginChangePasswordFlowCommandPerformerProvider = mbVar3;
            com.yandex.passport.internal.report.reporters.p pVar3 = new com.yandex.passport.internal.report.reporters.p(yvf0Var9, this.flagRepositoryProvider, i12);
            this.setPopupSizeCommandPerformerProvider = pVar3;
            xvf0 b17 = i5m.b(cma1.i(new j4(mbVar3, pVar3, this.getPhoneRegionCodeCommandPerformerProvider, this.requestSavedExperimentsCommandPerformerProvider, this.getCustomEulaStringsCommandPerformerProvider, this.requestLoginCredentialsCommandPerformerProvider, this.webAuthNAvailabilityPerformerProvider)));
            this.webCardSlothPerformBinderProvider = b17;
            this.slothWebCardPerformConfigurationProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b17, 21)));
            xvf0 c2 = i5m.c(com.yandex.passport.internal.sloth.performers.usermenu.i.a);
            this.userMenuEventSenderProvider = c2;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(c2, 15);
            this.finishWithItemCommandPerformerProvider = gVar;
            com.yandex.passport.common.coroutine.g gVar2 = new com.yandex.passport.common.coroutine.g(c2, 16);
            this.itemClickCommandPerformerProvider = gVar2;
            xvf0 b18 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.g(gVar, gVar2, 6)));
            this.userMenuSlothPerformBinderProvider = b18;
            this.slothUserMenuPerformConfigurationProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b18, 20)));
            this.bouncerReporterProvider = i5m.b(cma1.i(new e9(this.eventReporterProvider, this.reportingFeatureProvider, this.provideAccountsRetrieverProvider, 7)));
            int i14 = 10;
            this.linkHandlingReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i14)));
            com.yandex.passport.data.network.m mVar6 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i14);
            this.requestFactoryProvider33 = mVar6;
            xvf0 b19 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) f3.a, (yvf0) mVar6, 2)));
            this.getBadgesSpecificationRequestProvider = b19;
            this.updateBadgesConfigUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.badgesStorageProvider, b19, this.badgesReporterProvider, this.environmentDataMapperProvider, 2)));
            com.yandex.passport.data.network.m mVar7 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 21);
            this.requestFactoryProvider34 = mVar7;
            xvf0 b20 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) v8.a, (yvf0) mVar7, 7)));
            this.getSsoConfigRequestProvider = b20;
            this.getAppAccountVisibilityConfigUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.config.l(this.provideCoroutineDispatchersProvider, b20, this.configReporterProvider, this.configStatusStorageProvider, this.environmentDataMapperProvider, this.accountSharingConfigStorageProvider)));
            xvf0 b21 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 2)));
            this.accountSharingReporterProvider = b21;
            this.manageAccountsVisibilityForBlacklistedAppsUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.provideCoroutineDispatchersProvider, this.accountSharingConfigStorageProvider, this.provideAndroidAccountManagerHelperProvider, b21, 11)));
        }

        private void initialize5(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.n nVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.p pVar) {
            int i = 10;
            nc ncVar = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, i);
            this.requestFactoryProvider35 = ncVar;
            xvf0 b = i5m.b(cma1.i(new j4(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, s0.a, com.yandex.passport.data.network.token.u0.a, ncVar, this.provideMasterTokenTombstoneManagerProvider, 6)));
            this.getMasterTokenByMailishSocialTaskIdRequestProvider = b;
            this.authorizeByMailOAuthTaskIdUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.fetchAndSaveModernAccountUseCaseProvider, b, this.masterCredentialsProvider, this.environmentDataMapperProvider, 13)));
            xvf0 b2 = i5m.b(cma1.i(new r0(this.provideAccountsRetrieverProvider, this.completeStatusRequestProvider, this.environmentDataMapperProvider, this.contextUtilsProvider, 6)));
            this.getUpgradeUrlUseCaseProvider = b2;
            yvf0 yvf0Var = this.provideCoroutineDispatchersProvider;
            com.yandex.passport.data.network.core.i iVar = new com.yandex.passport.data.network.core.i(yvf0Var, b2, this.provideAccountsRetrieverProvider, this.accountUpgradeReporterProvider, 8);
            this.accountUpgradeLaunchUseCaseProvider = iVar;
            int i2 = 6;
            this.accountUpgraderViewModelProvider = new com.yandex.passport.internal.di.module.c(i2, iVar);
            this.limitedPassportInitReportUseCaseProvider = i5m.b(cma1.i(new r0(this.setApplicationContextProvider, yvf0Var, this.provideTimeProvider, this.passportInitReporterProvider, 7)));
            int i3 = 8;
            xvf0 b3 = i5m.b(cma1.i(new e9(this.setApplicationContextProvider, this.eventReporterProvider, this.flagRepositoryProvider, i3)));
            this.dependenciesReporterProvider = b3;
            this.limitedDependenciesReportUseCaseProvider = i5m.b(cma1.i(new k8(this.setApplicationContextProvider, this.provideCoroutineDispatchersProvider, b3, i)));
            this.authSdkReporterProvider = i5m.b(cma1.i(new nc(this.eventReporterProvider, this.reportingFeatureProvider, 25)));
            int i4 = 11;
            this.standaloneReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i4)));
            int i5 = 17;
            this.warmUpWebViewReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i5)));
            xvf0 b4 = i5m.b(cma1.i(new fa(this.setApplicationContextProvider, 21)));
            this.provideCoolDownUidStorageProvider = b4;
            this.makeTokenMasterCoolDownStorageProvider = i5m.b(cma1.i(new com.yandex.passport.common.coroutine.g(b4, i5)));
            this.updateMasterTokenReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 15)));
            this.otpWaReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i4)));
            this.handleVpnAppBackgroundStateUseCaseProvider = i5m.b(cma1.i(new e9(this.checkVpnStatusUseCaseProvider, this.bindNetworkWrapperProvider, this.flagRepositoryProvider, 20)));
            int i6 = 12;
            e9 e9Var = new e9(this.checkVpnStatusUseCaseProvider, this.vpnCookieRepositoryProvider, this.vpnChallengeReporterProvider, i6);
            this.vpnChallengeStoreFactoryProvider = e9Var;
            com.yandex.passport.internal.ui.challenge.vpn.b0 b0Var = new com.yandex.passport.internal.ui.challenge.vpn.b0(e9Var);
            this.vpnChallengeViewModelProvider = b0Var;
            this.factoryProvider = n3w.a(new com.yandex.passport.internal.ui.challenge.vpn.c0(b0Var));
            int i7 = 0;
            xvf0 b5 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, i7)));
            this.challengeReporterProvider = b5;
            this.challengeHelperProvider = i5m.b(cma1.i(new com.yandex.passport.internal.config.l(this.provideBaseUrlDispatcherProvider, this.getChallengeUseCaseProvider, this.getAuthorizationUrlUseCaseProvider, this.bindUiLanguageProvider, this.flagRepositoryProvider, b5, 3)));
            this.deleteAccountUseCaseProvider = i5m.b(cma1.i(new r0(this.provideCoroutineDispatchersProvider, this.removeAccountUseCaseProvider, this.provideEventReporterProvider, this.provideDatabaseHelperProvider, 10)));
            com.yandex.passport.data.network.m mVar = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i3);
            this.requestFactoryProvider36 = mVar;
            xvf0 b6 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) mVar, this.provideMasterTokenTombstoneManagerProvider, 0)));
            this.disablePhonishRequestProvider = b6;
            this.deletePhonishForeverUseCaseProvider = i5m.b(cma1.i(new k8(this.provideCoroutineDispatchersProvider, b6, this.environmentDataMapperProvider, i6)));
            this.esiaBindingReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 9)));
            this.provideSlothReportDelegateProvider = new com.yandex.passport.internal.di.module.q(nVar, this.slothReportDelegateImplProvider, i2);
            this.webCardReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.p(this.eventReporterProvider, this.reportingFeatureProvider, 19)));
            int i8 = 2;
            this.providePassportBiometricApiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.d(aVar, com.yandex.passport.internal.ui.sloth.ebs.h1.a, i8)));
            com.yandex.passport.data.network.m mVar2 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i8);
            this.requestFactoryProvider37 = mVar2;
            this.biometricTrackInitRequestProvider = i5m.b(cma1.i(new qxu0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar2, com.yandex.passport.data.network.a0.a, 26)));
            xvf0 b7 = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, i3)));
            this.ebsReporterProvider = b7;
            this.biometricTrackInitUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.biometricTrackInitRequestProvider, this.environmentDataMapperProvider, b7, 7)));
            com.yandex.passport.data.network.m mVar3 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, 24);
            this.requestFactoryProvider38 = mVar3;
            xvf0 b8 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) mVar3, (yvf0) pa.a, 9)));
            this.makeJwtTokenRequestProvider = b8;
            this.makeJwtTokenUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, b8, this.environmentDataMapperProvider, this.ebsReporterProvider, 10)));
            int i9 = 1;
            nc ncVar2 = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, i9);
            this.requestFactoryProvider39 = ncVar2;
            xvf0 b9 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (v7p) ncVar2, (yvf0) ad.a, 14)));
            this.startBiometricSessionRequestProvider = b9;
            this.startBiometricSessionUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.config.l(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, b9, this.environmentDataMapperProvider, this.ebsConfigStorageProvider, this.ebsReporterProvider)));
            int i10 = 3;
            com.yandex.passport.data.network.m mVar4 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i10);
            this.requestFactoryProvider40 = mVar4;
            xvf0 b10 = i5m.b(cma1.i(new qxu0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar4, com.yandex.passport.data.network.j0.a, 27)));
            this.checkAgeByTrackIdRequestProvider = b10;
            this.checkAgeByTrackIdUseCaseProvider = i5m.b(cma1.i(new z0(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, b10, this.environmentDataMapperProvider, this.ebsReporterProvider, 8)));
            int i11 = 29;
            com.yandex.passport.data.network.m mVar5 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i11);
            this.requestFactoryProvider41 = mVar5;
            xvf0 b11 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) ec.a, (yvf0) mVar5, 12)));
            this.smsCodeSendingRequestProvider = b11;
            this.smsCodeSendingUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.provideCoroutineDispatchersProvider, b11, this.bindApplicationDetailsProvider, this.environmentDataMapperProvider, 13)));
            int i12 = 5;
            nc ncVar3 = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, i12);
            this.requestFactoryProvider42 = ncVar3;
            xvf0 b12 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) le.a, (yvf0) ncVar3, 16)));
            this.validatePhoneNumberRequestProvider = b12;
            yvf0 yvf0Var2 = this.loginControllerProvider;
            com.yandex.passport.internal.ui.i iVar2 = com.yandex.passport.internal.ui.h.a;
            this.startRegistrationUseCaseProvider = i5m.b(cma1.i(new ea(yvf0Var2, iVar2, this.smsCodeSendingUseCaseProvider, this.provideCoroutineDispatchersProvider, this.suggestedLanguageUseCaseProvider, b12, this.environmentDataMapperProvider, 11)));
            fa faVar = new fa(this.provideClockProvider, i9);
            this.responseTransformerProvider2 = faVar;
            int i13 = 27;
            com.yandex.passport.data.network.m mVar6 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i13);
            this.requestFactoryProvider43 = mVar6;
            xvf0 b13 = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) faVar, (yvf0) mVar6, 11)));
            this.registerPhonishRequestProvider = b13;
            xvf0 b14 = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.provideCoroutineDispatchersProvider, b13, this.environmentDataMapperProvider, this.provideUserInfoMapperProvider, 12)));
            this.registerPhonishUseCaseProvider = b14;
            this.domikLoginHelperProvider = i5m.b(cma1.i(new com.yandex.passport.data.network.core.i(this.provideBackendClientChooserProvider, this.setPropertiesProvider, this.loginControllerProvider, b14, 5)));
            nc ncVar4 = new nc(this.requestCreatorProvider, this.commonBackendQueryProvider, i7);
            this.requestFactoryProvider44 = ncVar4;
            this.smsCodeVerificationRequestProvider = i5m.b(cma1.i(new z1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (yvf0) oc.a, (yvf0) ncVar4, 13)));
            com.yandex.passport.data.network.m mVar7 = new com.yandex.passport.data.network.m(this.requestCreatorProvider, this.commonBackendQueryProvider, i12);
            this.requestFactoryProvider45 = mVar7;
            xvf0 b15 = i5m.b(cma1.i(new g1(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, mVar7, 0)));
            this.countrySuggestionRequestProvider = b15;
            xvf0 b16 = i5m.b(cma1.i(new k8(this.provideCoroutineDispatchersProvider, b15, this.environmentDataMapperProvider, i4)));
            this.countrySuggestionUseCaseProvider = b16;
            int i14 = 1;
            this.requestSmsUseCaseProvider = i5m.b(cma1.i(new com.yandex.passport.internal.usecase.ui.o(this.smsCodeSendingUseCaseProvider, this.contextUtilsProvider, iVar2, this.suggestedLanguageUseCaseProvider, b16, this.provideCoroutineDispatchersProvider, i14)));
            this.requestSmsUseCaseProvider2 = i5m.b(cma1.i(new com.yandex.passport.internal.usecase.ui.o(this.smsCodeSendingUseCaseProvider, this.contextUtilsProvider, iVar2, this.suggestedLanguageUseCaseProvider, this.countrySuggestionUseCaseProvider, this.provideCoroutineDispatchersProvider, i14)));
            this.startAuthorizationUseCaseProvider = i5m.b(cma1.i(new r0(this.loginControllerProvider, iVar2, this.suggestedLanguageUseCaseProvider, this.provideCoroutineDispatchersProvider, 12)));
            this.createProfileReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 7)));
            xvf0 b17 = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.q(nVar, this.setApplicationContextProvider, i9)));
            this.provideClipboardManagerProvider = b17;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(b17, i10);
            this.clipboardControllerImplProvider = gVar;
            this.provideClipboardControllerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.di.module.g(nVar, gVar, 4)));
            this.provideIsWhiteLabelProvider = new com.yandex.passport.internal.di.module.d(aVar, this.setPropertiesProvider, i9);
            this.socialActionReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.eventReporterProvider, 13)));
            this.bindPhoneNumberReporterProvider = i5m.b(cma1.i(new nc(this.eventReporterProvider, this.reportingFeatureProvider, i11)));
            this.getNotLoggedInMembersUseCaseProvider = new com.yandex.passport.internal.report.diary.m(this.memberAccountRepositoryProvider, 28);
            this.slothBouncerPerformConfigurationProvider = i5m.b(cma1.i(new com.yandex.passport.internal.report.diary.m(this.primarySlothPerformBinderProvider, i13)));
        }

        private com.yandex.passport.internal.methods.performer.r0 isMasterTokenValidPerformer() {
            return new com.yandex.passport.internal.methods.performer.r0((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.data.network.core.o) this.provideMasterTokenTombstoneManagerProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.s0 logoutPerformer() {
            return new com.yandex.passport.internal.methods.performer.s0((com.yandex.passport.internal.usecase.d0) this.getChallengeUseCaseProvider.get(), (com.yandex.passport.internal.usecase.v0) this.logoutUseCaseProvider.get());
        }

        private Map<Class<? extends yr31>, yvf0> mapOfClassOfAndProviderOfViewModel() {
            return Collections.singletonMap(com.yandex.passport.internal.ui.account_upgrade.g.class, this.accountUpgraderViewModelProvider);
        }

        private com.yandex.passport.internal.methods.performer.x0 onAccountUpgradeDeclinedPerformer() {
            return new com.yandex.passport.internal.methods.performer.x0(getAccountUpgradeRefuseUseCase());
        }

        private com.yandex.passport.internal.methods.performer.y0 onAppBackgroundStateChangedPerformer() {
            return new com.yandex.passport.internal.methods.performer.y0((com.yandex.passport.internal.common.a) this.bindAppBackgroundStateWrapperProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.z0 onNewPushTokenPerformer() {
            return new com.yandex.passport.internal.methods.performer.z0((com.yandex.passport.internal.push.k0) this.pushSubscriptionSchedulerProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.a1 onPushMessageReceivedPerformer() {
            return new com.yandex.passport.internal.methods.performer.a1((com.yandex.passport.internal.push.h) this.notificationHelperProvider.get(), (com.yandex.passport.internal.report.reporters.s0) this.pushReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.b1 performSyncPerformer() {
            return new com.yandex.passport.internal.methods.performer.b1((com.yandex.passport.internal.helper.h) this.personProfileHelperProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.link_auth.a pollingStorage() {
            return new com.yandex.passport.internal.link_auth.a(this.setApplicationContext, (com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (j) this.flagRepositoryProvider.get(), (com.yandex.passport.common.a) this.provideClockProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.c1 pushProviderSupportedPlatformsPerformer() {
            return new com.yandex.passport.internal.methods.performer.c1((com.yandex.passport.internal.provider.communication.l) this.iPCPropertiesHolderProvider.get());
        }

        private com.yandex.passport.internal.rotation.g quarantineMasterTokenStorage() {
            return new com.yandex.passport.internal.rotation.g(this.setApplicationContext, (com.yandex.passport.internal.report.reporters.i0) this.masterTokenRotationReporterProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.d1 removeAccountExplicitlyPerformer() {
            return new com.yandex.passport.internal.methods.performer.d1(removeAccountUseCase(), (com.yandex.passport.internal.core.accounts.n) this.immediateAccountsRetrieverProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.e1 removeAccountPerformer() {
            return new com.yandex.passport.internal.methods.performer.e1(this.setApplicationContext, (c0) this.provideEventReporterProvider.get(), removeAccountUseCase(), (com.yandex.passport.internal.core.accounts.n) this.immediateAccountsRetrieverProvider.get());
        }

        private com.yandex.passport.internal.core.accounts.z removeAccountUseCase() {
            return new com.yandex.passport.internal.core.accounts.z((com.yandex.passport.internal.core.accounts.g) this.provideAccountsUpdaterProvider.get(), (com.yandex.passport.internal.core.accounts.t) this.memberAccountRepositoryProvider.get(), (com.yandex.passport.internal.core.accounts.n) this.immediateAccountsRetrieverProvider.get(), (j) this.flagRepositoryProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.f1 sendAuthToTrackPerformer() {
            return new com.yandex.passport.internal.methods.performer.f1((com.yandex.passport.internal.helper.d) this.deviceAuthorizationHelperProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private com.yandex.passport.internal.methods.performer.g1 setCurrentAccountPerformer() {
            return new com.yandex.passport.internal.methods.performer.g1((com.yandex.passport.internal.usecase.d0) this.getChallengeUseCaseProvider.get(), (com.yandex.passport.internal.account.a) this.currentAccountManagerProvider.get(), (j1) this.setCurrentAccountUseCaseProvider.get());
        }

        private com.yandex.passport.internal.sloth.k slothEulaSupport() {
            return new com.yandex.passport.internal.sloth.k(this.setApplicationContext, this.setProperties);
        }

        private com.yandex.passport.internal.methods.performer.i1 trackFromMagicPerformer() {
            return new com.yandex.passport.internal.methods.performer.i1((d9) this.getTrackFromMagicRequestProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), pollingStorage(), (com.yandex.passport.internal.report.reporters.d0) this.linkAuthReporterProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.j1 tryAddPlusDevicePerformer() {
            return new com.yandex.passport.internal.methods.performer.j1((p1) this.tryAddPlusDeviceUseCaseProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private k1 updateAuthCookiePerformer() {
            return new k1((com.yandex.passport.internal.database.auth_cookie.a) this.provideAuthCookieDaoWrapperProvider.get(), new com.yandex.passport.internal.methods.performer.error.a(), (com.yandex.passport.internal.usecase.j0) this.getCookieByTokenUseCaseProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.l1 updateAvatarPerformer() {
            return new com.yandex.passport.internal.methods.performer.l1((t1) this.updateAvatarUseCaseProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        private u1 updateMasterTokenIfPossibleUseCase() {
            return new u1(authByMuidTokenUseCase(), (com.yandex.passport.internal.storage.a) this.makeTokenMasterCoolDownStorageProvider.get(), (com.yandex.passport.internal.report.reporters.d1) this.updateMasterTokenReporterProvider.get(), (j) this.flagRepositoryProvider.get(), (com.yandex.passport.internal.core.accounts.t) this.memberAccountRepositoryProvider.get());
        }

        private com.yandex.passport.internal.methods.performer.m1 updatePropertiesPerformer() {
            return new com.yandex.passport.internal.methods.performer.m1((com.yandex.passport.internal.properties.q) this.propertyUpdaterProvider.get(), (com.yandex.passport.internal.usecase.u0) this.limitedUpdatedPropertiesReportUseCaseProvider.get(), (com.yandex.passport.internal.report.reporters.o0) this.passportInitReporterProvider.get());
        }

        private n1 uploadDiaryPerformer() {
            return new n1((com.yandex.passport.internal.report.diary.o) this.diaryUploadUseCaseProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.yandex.passport.internal.ui.common.web.b urlChecker() {
            return new com.yandex.passport.internal.ui.common.web.b(whiteListRegexConfigStorage(), slothEulaSupport(), (com.yandex.passport.internal.network.e) this.provideBaseUrlDispatcherProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean whiteLabelBoolean() {
            com.yandex.passport.internal.di.module.a aVar = this.commonModule;
            com.yandex.passport.internal.properties.p pVar = this.setProperties;
            aVar.getClass();
            return pVar.w;
        }

        private com.yandex.passport.internal.config.q whiteListRegexConfigStorage() {
            return new com.yandex.passport.internal.config.q(this.setApplicationContext);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public e createAuthSdkActivityComponent(f fVar) {
            fVar.getClass();
            return new AuthSdkActivityComponentImpl(this.passportProcessGlobalComponentImpl, fVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.authsdk.i createAuthSdkSlothComponent(d0 d0Var) {
            d0Var.getClass();
            return new AuthSdkSlothComponentImpl(this.passportProcessGlobalComponentImpl, d0Var);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.authsdk.j createAuthSdkSlothComposeComponentBuilder() {
            return new AuthSdkSlothComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public c createBiometricVerificationComponentBuilder() {
            return new BiometricVerificationComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.bouncer.challenge.a createBouncerChallengeComponentBuilder() {
            return new BouncerChallengeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.delete.a createDeleteAccountComponentBuilder() {
            return new DeleteAccountComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public l0 createDeleteForever() {
            return new DeleteForeverComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public i0 createDeleteForeverActivityComponent(j0 j0Var) {
            j0Var.getClass();
            return new DeleteForeverActivityComponentImpl(this.passportProcessGlobalComponentImpl, j0Var);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.domik.di.a createDomikComponent(com.yandex.passport.internal.ui.domik.di.b bVar) {
            bVar.getClass();
            return new DomikComponentImpl(this.passportProcessGlobalComponentImpl, bVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.social.esia.g createEsiaBindComponentBuilder() {
            return new EsiaBindComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.bouncer.c createLoginActivityComponent(com.yandex.passport.internal.ui.bouncer.d dVar) {
            dVar.getClass();
            return new BouncerActivityComponentImpl(this.passportProcessGlobalComponentImpl, dVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public f1 createLoginModelComponent(com.yandex.passport.internal.ui.bouncer.j jVar) {
            jVar.getClass();
            return new BouncerModelComponentImpl(this.passportProcessGlobalComponentImpl, jVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.b createLogoutActivityComponent(com.yandex.passport.internal.ui.challenge.logout.c cVar) {
            cVar.getClass();
            return new LogoutActivityComponentImpl(this.passportProcessGlobalComponentImpl, cVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.l createLogoutBottomSheetActivityComponent() {
            return new LogoutBottomSheetActivityComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r createLogoutBottomSheetComposeComponentBuilder() {
            return new LogoutBottomSheetComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.e createLogoutComponent() {
            return new LogoutComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.j createLogoutComposeComponentBuilder() {
            return new LogoutComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.plusdevices.a createManagingPlusDevicesComponentBuilder() {
            return new ManagingPlusDevicesComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.webauthn.b createRegisterWebAuthNComponentBuilder() {
            return new RegisterWebAuthNComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.changecurrent.a createSetCurrentAccountActivityComponent(com.yandex.passport.internal.ui.challenge.changecurrent.b bVar) {
            bVar.getClass();
            return new SetCurrentAccountActivityComponentImpl(this.passportProcessGlobalComponentImpl, bVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.changecurrent.d createSetCurrentAccountComponent() {
            return new SetCurrentAccountComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.changecurrent.k createSetCurrentComposeComponentBuilder() {
            return new SetCurrentComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.r createStandaloneSlothComponent(com.yandex.passport.internal.ui.sloth.x xVar) {
            xVar.getClass();
            return new StandaloneSlothComponentImpl(this.passportProcessGlobalComponentImpl, xVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.s createStandaloneSlothComposeComponentBuilder() {
            return new StandaloneSlothComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.menu.e createUserMenuActivityComponent(com.yandex.passport.internal.ui.sloth.menu.f fVar) {
            fVar.getClass();
            return new UserMenuActivityComponentImpl(this.passportProcessGlobalComponentImpl, fVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.webcard.d createWebCardComposeComponentBuilder() {
            return new WebCardComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.webcard.s0 createWebCardSlothComponent(com.yandex.passport.internal.ui.sloth.webcard.t0 t0Var) {
            t0Var.getClass();
            return new WebCardSlothComponentImpl(this.passportProcessGlobalComponentImpl, t0Var);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.filter.i getAccountFilterRepository() {
            com.yandex.passport.internal.filter.l lVar = (com.yandex.passport.internal.filter.l) this.filterRulesStorageProvider.get();
            com.yandex.passport.common.common.a aVar = (com.yandex.passport.common.common.a) this.bindApplicationDetailsProvider.get();
            this.commonModule.getClass();
            return new com.yandex.passport.internal.filter.i(lVar, aVar, "7.55.1", new com.yandex.passport.internal.filter.s());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.config.a getAccountSharingConfigStorage() {
            return new com.yandex.passport.internal.config.a(this.setApplicationContext);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.a getAccountSynchronizer() {
            return (com.yandex.passport.internal.core.accounts.a) this.accountSynchronizerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.legacy.analytics.a getAccountTracker() {
            return (com.yandex.passport.legacy.analytics.a) this.accountTrackerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.upgrader.d getAccountUpgradeRefuseUseCase() {
            return new com.yandex.passport.internal.upgrader.d((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.upgrader.n) this.upgradeStatusStashUpdaterProvider.get(), (com.yandex.passport.internal.report.reporters.f) this.accountUpgradeReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.upgrader.e getAccountUpgradeSuccessUseCase() {
            return new com.yandex.passport.internal.upgrader.e((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.upgrader.n) this.upgradeStatusStashUpdaterProvider.get(), (com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.b getAccountsBackuper() {
            return (com.yandex.passport.internal.core.accounts.b) this.accountsBackuperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.announcing.c getAccountsChangesAnnouncer() {
            return (com.yandex.passport.internal.core.announcing.c) this.accountsChangesAnnouncerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.d getAccountsRetriever() {
            return (com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.e getAccountsSaver() {
            return (com.yandex.passport.internal.core.accounts.e) this.accountsSaverProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.g getAccountsUpdater() {
            return (com.yandex.passport.internal.core.accounts.g) this.provideAccountsUpdaterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public String getAmVersion() {
            this.commonModule.getClass();
            return "7.55.1";
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.analytics.d getAnalyticalIdentifiersProvider() {
            return (com.yandex.passport.common.analytics.d) this.provideAnalyticalIdentifiersProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.analytics.f getAnalyticsHelper() {
            return (com.yandex.passport.common.analytics.f) this.provideAnalyticsHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.t getAnalyticsTrackerWrapper() {
            return (com.yandex.passport.internal.analytics.t) this.provideAnalyticsTrackerWrapperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.j getAndroidAccountManagerHelper() {
            return (com.yandex.passport.internal.core.accounts.j) this.provideAndroidAccountManagerHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.g getAnnouncementReporter() {
            return (com.yandex.passport.internal.report.reporters.g) this.announcementReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.announcing.g getAnnouncingHelper() {
            return (com.yandex.passport.internal.core.announcing.g) this.announcingHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.common.a getAppBackgroundStateWrapper() {
            return (com.yandex.passport.internal.common.a) this.bindAppBackgroundStateWrapperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.u getAppBindReporter() {
            return (com.yandex.passport.internal.analytics.u) this.appBindReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public Context getApplicationContext() {
            return this.setApplicationContext;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.authorize.d getAuthByCodeUseCase() {
            return (com.yandex.passport.internal.usecase.authorize.d) this.authorizeByCodeUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.authorize.b getAuthByCookieUseCase() {
            return (com.yandex.passport.internal.usecase.authorize.b) this.authByCookieUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.v getAuthByTrackReporter() {
            return (com.yandex.passport.internal.analytics.v) this.authByTrackReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.tv.d getAuthInWebViewViewModel() {
            return new com.yandex.passport.internal.ui.tv.d((com.yandex.passport.internal.usecase.authorize.b) this.authByCookieUseCaseProvider.get(), (c0) this.provideEventReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public h getAuthSdkReporter() {
            return (h) this.authSdkReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public Authenticator getAuthenticator() {
            return (Authenticator) this.authenticatorProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.authorize.h getAuthorizeByForwardTrackUseCase() {
            return new com.yandex.passport.internal.usecase.authorize.h((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.h) this.checkLocationIdUseCaseProvider.get(), fetchAndSaveModernAccountUseCase(), (o1) this.getMasterTokenForwardByTrackRequestProvider.get(), (com.yandex.passport.internal.report.reporters.b1) this.tokenActionReporterProvider.get(), (com.yandex.passport.internal.credentials.d) this.masterCredentialsProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.ui.l getAuthorizeByMailOAuthTaskIdUseCase() {
            return (com.yandex.passport.internal.usecase.ui.l) this.authorizeByMailOAuthTaskIdUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.autologin.g getAutoLoginUseCase() {
            return (com.yandex.passport.internal.autologin.g) this.autoLoginUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.network.a getBackendParser() {
            return (com.yandex.passport.internal.network.a) this.provideBackendParserProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.w getBackendReporter() {
            return (com.yandex.passport.internal.analytics.w) this.provideBackendReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.n getBouncerReporter() {
            return (com.yandex.passport.internal.report.reporters.n) this.bouncerReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.vpn.b getCheckVpnStatusUseCase() {
            return (com.yandex.passport.internal.usecase.vpn.b) this.checkVpnStatusUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.network.client.c getClientChooser() {
            return (com.yandex.passport.internal.network.client.c) this.provideBackendClientChooserProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.a getClock() {
            return (com.yandex.passport.common.a) this.provideClockProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.g getCommonParamsProvider() {
            return (com.yandex.passport.internal.report.g) this.commonParamsProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.e getContextUtils() {
            return (com.yandex.passport.internal.e) this.contextUtilsProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.coroutine.a getCoroutineDispatchers() {
            return (com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.coroutine.e getCoroutineScopes() {
            return (com.yandex.passport.common.coroutine.e) this.provideCoroutineScopesProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sloth.credentialmanager.d getCredentialManagerInterface() {
            return (com.yandex.passport.internal.sloth.credentialmanager.d) this.provideSmartLockInterfaceProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.y getCurrentAccountAnalyticsHelper() {
            return (com.yandex.passport.internal.analytics.y) this.currentAccountAnalyticsHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.account.a getCurrentAccountManager() {
            return (com.yandex.passport.internal.account.a) this.currentAccountManagerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public DatabaseHelper getDatabaseHelper() {
            return (DatabaseHelper) this.provideDatabaseHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.util.e getDebugInfoUtil() {
            return (com.yandex.passport.internal.util.e) this.provideDebugInfoUtilProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.m getDelayedAccountRepairer() {
            return new com.yandex.passport.internal.core.accounts.m((com.yandex.passport.internal.core.accounts.l) this.delayedAccountProvider.get(), (com.yandex.passport.internal.core.accounts.e) this.accountsSaverProvider.get(), (com.yandex.passport.internal.core.accounts.j) this.provideAndroidAccountManagerHelperProvider.get(), (com.yandex.passport.internal.report.reporters.t) this.delayedAccountReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.t getDelayedAccountReporter() {
            return (com.yandex.passport.internal.report.reporters.t) this.delayedAccountReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.diary.k getDiaryRecorder() {
            return (com.yandex.passport.internal.report.diary.k) this.diaryRecorderProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.diary.o getDiaryUploadUseCase() {
            return (com.yandex.passport.internal.report.diary.o) this.diaryUploadUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public c0 getEventReporter() {
            return (c0) this.provideEventReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.z getExitReasonReporter() {
            return new com.yandex.passport.internal.report.reporters.z((com.yandex.passport.internal.report.j) this.eventReporterProvider.get(), (com.yandex.passport.internal.features.a) this.reportingFeatureProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.flags.experiments.e getExperimentsFetcher() {
            return (com.yandex.passport.internal.flags.experiments.e) this.experimentsFetcherProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.flags.experiments.g getExperimentsHolder() {
            return (com.yandex.passport.internal.flags.experiments.g) this.provideExperimentsHolderProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.flags.experiments.k getExperimentsOverrides() {
            return (com.yandex.passport.internal.flags.experiments.k) this.experimentsOverridesProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.flags.experiments.q getExperimentsUpdater() {
            return (com.yandex.passport.internal.flags.experiments.q) this.experimentsUpdaterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public j getFlagRepository() {
            return (j) this.flagRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.methods.performer.p getGetAccountByUidPerformer() {
            return new com.yandex.passport.internal.methods.performer.p((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.config.k getGetAppAccountVisibilityConfigUseCase() {
            return (com.yandex.passport.internal.config.k) this.getAppAccountVisibilityConfigUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public y getGetAuthorizationUrlUseCase() {
            return (y) this.getAuthorizationUrlUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.k0 getGetLocationIdUseCase() {
            return (com.yandex.passport.internal.usecase.k0) this.getLocationIdUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.methods.performer.m0 getGetTokenPerformer() {
            return new com.yandex.passport.internal.methods.performer.m0((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (h0) this.getClientTokenUseCaseProvider.get(), new com.yandex.passport.internal.methods.performer.error.a());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.vpn.e getHandleVpnAppBackgroundStateUseCase() {
            return (com.yandex.passport.internal.usecase.vpn.e) this.handleVpnAppBackgroundStateUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.util.j getHashEncoder() {
            return (com.yandex.passport.internal.util.j) this.hashEncoderProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public ImageLoadingClient getImageLoadingClient() {
            return (ImageLoadingClient) this.provideImageLoadingClientProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.s0 getLimitedDependenciesReportUseCase() {
            return (com.yandex.passport.internal.usecase.s0) this.limitedDependenciesReportUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.t0 getLimitedPassportInitReportUseCase() {
            return (com.yandex.passport.internal.usecase.t0) this.limitedPassportInitReportUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.e0 getLinkHandlingReporter() {
            return (com.yandex.passport.internal.report.reporters.e0) this.linkHandlingReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.ui.c0 getLoadAccountsUseCase() {
            return (com.yandex.passport.internal.usecase.ui.c0) this.loadAccountsUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.helper.g getLocaleHelper() {
            return (com.yandex.passport.internal.helper.g) this.localeHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.account.c getLoginController() {
            return (com.yandex.passport.internal.account.c) this.loginControllerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.authsdk.b getLoginSdkProviderHelper() {
            return (com.yandex.passport.internal.authsdk.b) this.authSdkProviderHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public w0 getMakeAllTokenMasterRelatedUseCase() {
            return new w0((com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.storage.a) this.makeTokenMasterCoolDownStorageProvider.get(), updateMasterTokenIfPossibleUseCase(), (j) this.flagRepositoryProvider.get(), (com.yandex.passport.internal.report.reporters.d1) this.updateMasterTokenReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.z0 getManageAccountsVisibilityForBlacklistedAppsUseCase() {
            return (com.yandex.passport.internal.usecase.z0) this.manageAccountsVisibilityForBlacklistedAppsUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.h0 getManagingPlusDevicesReporter() {
            return (com.yandex.passport.internal.report.reporters.h0) this.managingPlusDevicesReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.r getMasterTokenEncrypter() {
            return (com.yandex.passport.internal.core.accounts.r) this.masterTokenEncrypterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.data.network.core.o getMasterTokenTombstoneManager() {
            return (com.yandex.passport.data.network.core.o) this.provideMasterTokenTombstoneManagerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.t getMemberAccountRepository() {
            return (com.yandex.passport.internal.core.accounts.t) this.memberAccountRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.methods.performer.v0 getMethodPerformDispatcher() {
            return new com.yandex.passport.internal.methods.performer.v0((com.yandex.passport.internal.provider.b) this.internalProviderHelperProvider.get(), (com.yandex.passport.internal.report.diary.k) this.diaryRecorderProvider.get(), getAccountUpgradeStatusPerformer(), getCodeByUidPerformer(), onAccountUpgradeDeclinedPerformer(), logoutPerformer(), performSyncPerformer(), (com.yandex.passport.internal.methods.performer.m) this.executeCheckVpnStatusPerformerProvider.get(), corruptMasterTokenPerformer(), dropTokenPerformer(), removeAccountPerformer(), getPersonProfilePerformer(), setCurrentAccountPerformer(), getUidByNormalizedLoginPerformer(), authorizeByRawJsonPerformer(), authorizeByUserCredentialsPerformer(), sendAuthToTrackPerformer(), getCodeByCookiePerformer(), authorizeByForwardTrackPerformer(), getDeviceCodePerformer(), authorizeByDeviceCodePerformer(), authorizeByCookiePerformer(), authorizeByCodePerformer(), updateAvatarPerformer(), uploadDiaryPerformer(), getAccountsListPerformer(), getGetAccountByUidPerformer(), getAccountByNamePerformer(), getCurrentAccountPerformer(), getAccountByMachineReadableLoginPerformer(), isMasterTokenValidPerformer(), acceptDeviceAuthorizationPerformer(), getGetTokenPerformer(), addAccountPerformer(), getChildCodeByUidParentPerformer(), autoLoginPerformer(), getTrackPayloadPerformer(), getQrLinkPerformer(), authByQrLinkPerformer(), trackFromMagicPerformer(), updateAuthCookiePerformer(), getAuthCookiePerformer(), getInvalidateCookiesAndDeleteAuthCookiesPerformer(), getLocationIdPerformer(), getFlagCredentialManagerForAutoLoginPerformer(), updatePropertiesPerformer(), onPushMessageReceivedPerformer(), onNewPushTokenPerformer(), getPushCodePerformer(), getSilentPushConfigPerformer(), getSavedPushPayloadPerformer(), deleteSavedPushPayloadPerformer(), tryAddPlusDevicePerformer(), getAvailableAccountsPerformer(), pushProviderSupportedPlatformsPerformer(), getAuthorizationUrlPerformer(), getUserIdUrlPerformer(), getOtpByTrackPerformer(), removeAccountExplicitlyPerformer(), getBooleanFlagPerformer(), onAppBackgroundStateChangedPerformer(), (com.yandex.passport.internal.methods.performer.h1) this.setVpnChallengeActivityDisabledPerformerProvider.get(), (com.yandex.passport.internal.methods.performer.q) this.getAccountSubtitlePerformerProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public nd getMetricaReporter() {
            return (nd) this.metricaReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.push.h getNotificationHelper() {
            return (com.yandex.passport.internal.push.h) this.notificationHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public OkHttpClient getOkHttpClient() {
            return (OkHttpClient) this.provideOkHttpClientProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.j0 getOtpWaReporter() {
            return (com.yandex.passport.internal.report.reporters.j0) this.otpWaReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.provider.communication.u getPassportRequestsProcessor() {
            return (com.yandex.passport.internal.provider.communication.u) this.passportRequestsProcessorProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.helper.h getPersonProfileHelper() {
            return (com.yandex.passport.internal.helper.h) this.personProfileHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.storage.i getPreferenceStorage() {
            return (com.yandex.passport.internal.storage.i) this.preferenceStorageProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.properties.p getProperties() {
            return this.setProperties;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.properties.q getPropertyUpdater() {
            return (com.yandex.passport.internal.properties.q) this.propertyUpdaterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.push.d0 getPushPayloadFactory() {
            return new com.yandex.passport.internal.push.d0((com.yandex.passport.internal.report.reporters.s0) this.pushReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.s0 getPushReporter() {
            return (com.yandex.passport.internal.report.reporters.s0) this.pushReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.push.c getPushSubscriptionManager() {
            return (com.yandex.passport.internal.push.c) this.greatAgainPushSubscriptionManagerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.push.k0 getPushSubscriptionScheduler() {
            return (com.yandex.passport.internal.push.k0) this.pushSubscriptionSchedulerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.rotation.h getRevokeQuarantineMasterTokenUseCase() {
            return new com.yandex.passport.internal.rotation.h((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), quarantineMasterTokenStorage(), (com.yandex.passport.internal.usecase.f1) this.revokeMasterTokenUseCaseProvider.get(), (com.yandex.passport.internal.core.accounts.d) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.report.reporters.i0) this.masterTokenRotationReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sloth.h getSlothDependenciesFactory() {
            return (com.yandex.passport.internal.sloth.h) this.slothDependenciesFactoryProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.sloth.dependencies.g getSlothReportDelegate() {
            com.yandex.passport.internal.di.module.n nVar = this.serviceModule;
            com.yandex.passport.internal.sloth.m mVar = (com.yandex.passport.internal.sloth.m) this.slothReportDelegateImplProvider.get();
            nVar.getClass();
            return mVar;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.i getSlothStandalonePerformConfiguration() {
            return (com.yandex.passport.internal.ui.sloth.i) this.slothStandalonePerformConfigurationProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.menu.a getSlothUserMenuPerformConfiguration() {
            return (com.yandex.passport.internal.ui.sloth.menu.a) this.slothUserMenuPerformConfigurationProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.webcard.b getSlothWebCardPerformConfiguration() {
            return (com.yandex.passport.internal.ui.sloth.webcard.b) this.slothWebCardPerformConfigurationProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.smsretriever.a getSmsRetrieverHelper() {
            return (com.yandex.passport.internal.smsretriever.a) this.smsRetrieverHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.e0 getSocialBrowserReporter() {
            return (com.yandex.passport.internal.analytics.e0) this.socialBrowserReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.w0 getSocialReporter() {
            return (com.yandex.passport.internal.report.reporters.w0) this.socialReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sso.announcing.a getSsoAccountsSyncHelper() {
            return (com.yandex.passport.internal.sso.announcing.a) this.ssoAccountsSyncHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sso.k getSsoContentProviderHelper() {
            return (com.yandex.passport.internal.sso.k) this.ssoContentProviderHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.x0 getStandaloneReporter() {
            return (com.yandex.passport.internal.report.reporters.x0) this.standaloneReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.y0 getStashReporter() {
            return (com.yandex.passport.internal.report.reporters.y0) this.stashReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public b0 getStatefulReporter() {
            return (b0) this.domikStatefulReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.n1 getSuggestedLanguageUseCase() {
            return (com.yandex.passport.internal.usecase.n1) this.suggestedLanguageUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public SyncAdapter getSyncAdapter() {
            return (SyncAdapter) this.syncAdapterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.sync.a getSyncHelper() {
            return (com.yandex.passport.internal.core.sync.a) this.provideSyncHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.b1 getTokenActionReporter() {
            return (com.yandex.passport.internal.report.reporters.b1) this.tokenActionReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public p1 getTryAddPlusDeviceUseCase() {
            return (p1) this.tryAddPlusDeviceUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.ui.lang.b getUiLanguageProvider() {
            return (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.badges.g getUpdateBadgesConfigUseCase() {
            return (com.yandex.passport.internal.badges.g) this.updateBadgesConfigUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.config.m getUpdateConfigUseCase() {
            return (com.yandex.passport.internal.config.m) this.getConfigUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.network.e getUrlDispatcher() {
            return (com.yandex.passport.internal.network.e) this.provideBaseUrlDispatcherProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sloth.performers.usermenu.h getUserMenuEventSender() {
            return (com.yandex.passport.internal.sloth.performers.usermenu.h) this.userMenuEventSenderProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.di.module.s getViewModelsFactory() {
            return new com.yandex.passport.internal.di.module.s(mapOfClassOfAndProviderOfViewModel());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.vpn.p getVpnChallengeViewModelFactory() {
            return (com.yandex.passport.internal.ui.challenge.vpn.p) this.factoryProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.h1 getWarmUpWebViewReporter() {
            return (com.yandex.passport.internal.report.reporters.h1) this.warmUpWebViewReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public i1 getWebAmReporter() {
            return (i1) this.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sloth.webauthn.c getWebAuthN() {
            return (com.yandex.passport.internal.sloth.webauthn.c) this.provideWebAuthNClientProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.webview.webcases.n getWebCaseFactory() {
            return new com.yandex.passport.internal.ui.webview.webcases.n((com.yandex.passport.internal.network.client.c) this.provideBackendClientChooserProvider.get());
        }
    }

    /* loaded from: classes15.dex */
    public static final class RegisterWebAuthNComponentBuilder implements com.yandex.passport.internal.ui.sloth.webauthn.b {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private RegisterWebAuthNProperties setProperties;

        private RegisterWebAuthNComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public com.yandex.passport.internal.ui.sloth.webauthn.c build() {
            q5z.f(RegisterWebAuthNProperties.class, this.setProperties);
            q5z.f(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            q5z.f(Activity.class, this.setActivity);
            return new RegisterWebAuthNComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.sloth.webauthn.d(), this.setProperties, this.setProgressProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public RegisterWebAuthNComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public RegisterWebAuthNComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public RegisterWebAuthNComponentBuilder setProperties(RegisterWebAuthNProperties registerWebAuthNProperties) {
            registerWebAuthNProperties.getClass();
            this.setProperties = registerWebAuthNProperties;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class RegisterWebAuthNComponentImpl implements com.yandex.passport.internal.ui.sloth.webauthn.c {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 providePerformConfigurationProvider;
        private final RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl;
        private yvf0 setActivityProvider;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final RegisterWebAuthNProperties setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private RegisterWebAuthNComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.webauthn.d dVar, RegisterWebAuthNProperties registerWebAuthNProperties, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.registerWebAuthNComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = registerWebAuthNProperties;
            this.setProgressProperties = gVar;
            initialize(eVar, dVar, registerWebAuthNProperties, gVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.webauthn.d dVar, RegisterWebAuthNProperties registerWebAuthNProperties, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.providePerformConfigurationProvider = new com.yandex.passport.internal.ui.bouncer.f(dVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 15);
            this.setActivityProvider = n3w.a(activity);
        }

        private com.yandex.passport.internal.ui.sloth.webauthn.p registerWebAuthNStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.webauthn.p(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.setProperties, (com.yandex.passport.internal.core.accounts.d) this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.report.reporters.j1) this.passportProcessGlobalComponentImpl.webAuthNReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.setProgressProperties;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.c
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss6_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.registerWebAuthNComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.c
        public com.yandex.passport.internal.ui.sloth.webauthn.r getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.webauthn.r(registerWebAuthNStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.c
        public com.yandex.passport.internal.sloth.webauthn.c getWebAuthN() {
            return (com.yandex.passport.internal.sloth.webauthn.c) this.passportProcessGlobalComponentImpl.provideWebAuthNClientProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.c
        public com.yandex.passport.internal.report.reporters.j1 getWebAuthNReporter() {
            return (com.yandex.passport.internal.report.reporters.j1) this.passportProcessGlobalComponentImpl.webAuthNReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.c
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class RendererComponentBuilder implements com.yandex.passport.internal.ui.bouncer.u {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;

        private RendererComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.internal.ui.bouncer.v build() {
            return new RendererComponentImpl(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl, new com.yandex.passport.internal.ui.bouncer.s());
        }
    }

    /* loaded from: classes15.dex */
    public static final class RendererComponentImpl implements com.yandex.passport.internal.ui.bouncer.v {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final com.yandex.passport.internal.ui.bouncer.s bouncerRendererModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final RendererComponentImpl rendererComponentImpl;

        private RendererComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl, com.yandex.passport.internal.ui.bouncer.s sVar) {
            this.rendererComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
            this.bouncerRendererModule = sVar;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public Activity getActivity() {
            return (Activity) this.bouncerActivityComponentImpl.getActivityProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.internal.report.reporters.l getBadgesReporter() {
            return (com.yandex.passport.internal.report.reporters.l) this.passportProcessGlobalComponentImpl.badgesReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public BouncerActivity getBouncerActivity() {
            return (BouncerActivity) this.bouncerActivityComponentImpl.getBouncerActivityProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public yvf0 getBouncerMasterChooserComponentBuilderProvider() {
            return this.bouncerActivityComponentImpl.getBouncerMasterChooserComponentBuilderProvider;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public yvf0 getBouncerSlothComposeComponentBuilderProvider() {
            return this.bouncerActivityComponentImpl.getBouncerSlothComposeComponentBuilderProvider;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.common.coroutine.a getCoroutineDispatchers() {
            return (com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.internal.report.reporters.s getCreateProfileReporter() {
            return (com.yandex.passport.internal.report.reporters.s) this.passportProcessGlobalComponentImpl.createProfileReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public j getFlagRepository() {
            return (j) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public r getNetworkObserver() {
            com.yandex.passport.internal.ui.bouncer.s sVar = this.bouncerRendererModule;
            com.yandex.passport.internal.sloth.l slothNetworkStatusImpl = this.bouncerActivityComponentImpl.slothNetworkStatusImpl();
            sVar.getClass();
            return slothNetworkStatusImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.internal.properties.p getPassportProperties() {
            return this.passportProcessGlobalComponentImpl.setProperties;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.bouncerActivityComponentImpl.progressProperties();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.internal.report.reporters.n getReporter() {
            return (com.yandex.passport.internal.report.reporters.n) this.passportProcessGlobalComponentImpl.bouncerReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.internal.report.reporters.v0 getSocialActionReporter() {
            return (com.yandex.passport.internal.report.reporters.v0) this.passportProcessGlobalComponentImpl.socialActionReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.common.ui.lang.b getUiLanguageProvider() {
            return (com.yandex.passport.common.ui.lang.b) this.passportProcessGlobalComponentImpl.bindUiLanguageProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public com.yandex.passport.internal.ui.bouncer.t getWishSource() {
            return (com.yandex.passport.internal.ui.bouncer.t) this.bouncerActivityComponentImpl.bouncerWishSourceProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.v
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class SetCurrentAccountActivityComponentImpl implements com.yandex.passport.internal.ui.challenge.changecurrent.a {
        private yvf0 challengeUiProvider;
        private yvf0 getActivityProvider;
        private yvf0 getProgressPropertiesProvider;
        private yvf0 getPropertiesProvider;
        private yvf0 loadingUiProvider;
        private yvf0 loadingWithDelaySlabProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final SetCurrentAccountActivityComponentImpl setCurrentAccountActivityComponentImpl;
        private yvf0 webUrlCheckerProvider;
        private yvf0 webViewControllerProvider;
        private yvf0 webViewSlabProvider;
        private yvf0 webViewUiProvider;

        private SetCurrentAccountActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.changecurrent.b bVar) {
            this.setCurrentAccountActivityComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(bVar);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.changecurrent.b bVar) {
            int i = 0;
            this.getActivityProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.j(i, bVar)));
            this.getProgressPropertiesProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.challenge.changecurrent.c(bVar, i)));
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getActivityProvider, this.getProgressPropertiesProvider, 10)));
            this.webViewUiProvider = b;
            this.webViewControllerProvider = i5m.b(cma1.i(new b1(b, 2)));
            this.webUrlCheckerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.urlCheckerProvider, 15);
            this.webViewSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.common.web.h(this.webViewUiProvider, this.getActivityProvider, this.webViewControllerProvider, this.passportProcessGlobalComponentImpl.provideEventReporterProvider, this.webUrlCheckerProvider, 0)));
            this.challengeUiProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, 14)));
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(this.getActivityProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getProgressPropertiesProvider, 9)));
            this.loadingUiProvider = b2;
            int i2 = 1;
            this.loadingWithDelaySlabProvider = i5m.b(cma1.i(new b1(b2, i2)));
            this.getPropertiesProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.challenge.changecurrent.c(bVar, i2)));
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.a
        public com.yandex.passport.internal.ui.common.d getDelayedLoadingSlab() {
            return (com.yandex.passport.internal.ui.common.d) this.loadingWithDelaySlabProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.common.c getLoader() {
            return (com.yandex.passport.internal.ui.common.c) this.loadingUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.a
        public SetCurrentAccountPropertiesImpl getProperties() {
            return (SetCurrentAccountPropertiesImpl) this.getPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.challenge.p getUi() {
            return (com.yandex.passport.internal.ui.challenge.p) this.challengeUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.d
        public com.yandex.passport.internal.ui.common.web.g getWebSlab() {
            return (com.yandex.passport.internal.ui.common.web.g) this.webViewSlabProvider.get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SetCurrentAccountComponentBuilder implements com.yandex.passport.internal.ui.challenge.changecurrent.d {
        private com.yandex.passport.internal.ui.challenge.j challengeData;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.changecurrent.h viewModel;

        private SetCurrentAccountComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.d
        public com.yandex.passport.internal.ui.challenge.changecurrent.e build() {
            q5z.f(com.yandex.passport.internal.ui.challenge.j.class, this.challengeData);
            q5z.f(com.yandex.passport.internal.ui.challenge.changecurrent.h.class, this.viewModel);
            return new SetCurrentAccountComponentImpl(this.passportProcessGlobalComponentImpl, this.challengeData, this.viewModel);
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.d
        public SetCurrentAccountComponentBuilder challengeData(com.yandex.passport.internal.ui.challenge.j jVar) {
            jVar.getClass();
            this.challengeData = jVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.d
        public SetCurrentAccountComponentBuilder viewModel(com.yandex.passport.internal.ui.challenge.changecurrent.h hVar) {
            hVar.getClass();
            this.viewModel = hVar;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class SetCurrentAccountComponentImpl implements com.yandex.passport.internal.ui.challenge.changecurrent.e {
        private yvf0 challengeDataProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final SetCurrentAccountComponentImpl setCurrentAccountComponentImpl;
        private yvf0 setCurrentAccountModelProvider;
        private yvf0 viewModelProvider;

        private SetCurrentAccountComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.j jVar, com.yandex.passport.internal.ui.challenge.changecurrent.h hVar) {
            this.setCurrentAccountComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(jVar, hVar);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.j jVar, com.yandex.passport.internal.ui.challenge.changecurrent.h hVar) {
            this.challengeDataProvider = n3w.a(jVar);
            n3w a = n3w.a(hVar);
            this.viewModelProvider = a;
            this.setCurrentAccountModelProvider = new qd21(this.challengeDataProvider, a, this.passportProcessGlobalComponentImpl.challengeHelperProvider, this.passportProcessGlobalComponentImpl.setCurrentAccountUseCaseProvider, this.passportProcessGlobalComponentImpl.currentAccountManagerProvider);
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.e
        public yvf0 getSessionProvider() {
            return this.setCurrentAccountModelProvider;
        }
    }

    public static final class SetCurrentComposeComponentBuilder implements com.yandex.passport.internal.ui.challenge.changecurrent.k {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.changecurrent.g setProperties;

        private SetCurrentComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.k
        public com.yandex.passport.internal.ui.challenge.changecurrent.l build() {
            q5z.f(com.yandex.passport.internal.ui.challenge.changecurrent.g.class, this.setProperties);
            return new SetCurrentComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), this.setProperties);
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.k
        public SetCurrentComposeComponentBuilder setProperties(com.yandex.passport.internal.ui.challenge.changecurrent.g gVar) {
            gVar.getClass();
            this.setProperties = gVar;
            return this;
        }
    }

    public static final class SetCurrentComposeComponentImpl implements com.yandex.passport.internal.ui.challenge.changecurrent.l {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final SetCurrentComposeComponentImpl setCurrentComposeComponentImpl;
        private final com.yandex.passport.internal.ui.challenge.changecurrent.g setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        private SetCurrentComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.changecurrent.g gVar) {
            this.setCurrentComposeComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = gVar;
        }

        private com.yandex.passport.internal.ui.challenge.i challengeChecker() {
            return new com.yandex.passport.internal.ui.challenge.i((com.yandex.passport.internal.ui.challenge.n) this.passportProcessGlobalComponentImpl.challengeHelperProvider.get());
        }

        private com.yandex.passport.internal.ui.challenge.changecurrent.c0 setCurrentStoreFactory() {
            return new com.yandex.passport.internal.ui.challenge.changecurrent.c0(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), challengeChecker(), (j1) this.passportProcessGlobalComponentImpl.setCurrentAccountUseCaseProvider.get(), (com.yandex.passport.internal.account.a) this.passportProcessGlobalComponentImpl.currentAccountManagerProvider.get(), this.setProperties);
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.l
        public c0 getEventReporter() {
            return (c0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.l
        public com.yandex.passport.internal.ui.common.web.d getUrlChecker() {
            return new com.yandex.passport.internal.ui.common.web.d(this.passportProcessGlobalComponentImpl.urlChecker());
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.l
        public com.yandex.passport.internal.ui.challenge.changecurrent.p getViewModelFactory() {
            return new com.yandex.passport.internal.ui.challenge.changecurrent.p(setCurrentStoreFactory());
        }
    }

    /* loaded from: classes15.dex */
    public static final class StandaloneSlothComponentImpl implements com.yandex.passport.internal.ui.sloth.r {
        private yvf0 getActivityProvider;
        private yvf0 getParametersProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideSlothUiSettingsProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothSslErrorHandlerProvider;
        private yvf0 slothStringRepositoryImplProvider;
        private yvf0 slothUiDependenciesFactoryProvider;
        private final StandaloneSlothComponentImpl standaloneSlothComponentImpl;
        private yvf0 standaloneSlothSlabProvider;
        private yvf0 standaloneSlothUiProvider;
        private yvf0 standaloneWishConsumerProvider;

        private StandaloneSlothComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.sloth.x xVar) {
            this.standaloneSlothComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(xVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.x xVar) {
            this.getActivityProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.y(xVar, 0)));
            this.slothStringRepositoryImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothDebugInformationDelegateImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            int i = 1;
            this.slothNetworkStatusImplProvider = new q0(this.getActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i);
            this.slothSslErrorHandlerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 20);
            this.slothUiDependenciesFactoryProvider = new m(this.getActivityProvider, this.slothStringRepositoryImplProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, this.slothDebugInformationDelegateImplProvider, this.slothNetworkStatusImplProvider, this.passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, this.slothSslErrorHandlerProvider, this.passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            this.standaloneWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, 22)));
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(xVar, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 4)));
            this.provideSlothUiSettingsProvider = b;
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.roundabout.items.d(this.slothUiDependenciesFactoryProvider, this.standaloneWishConsumerProvider, b, 2)));
            this.standaloneSlothSlabProvider = b2;
            this.standaloneSlothUiProvider = i5m.b(cma1.i(new b1(b2, 3)));
            this.getParametersProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.y(xVar, i)));
        }

        @Override // com.yandex.passport.internal.ui.sloth.r
        public SlothParams getParams() {
            return (SlothParams) this.getParametersProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.r
        public com.yandex.passport.internal.ui.sloth.b0 getUi() {
            return (com.yandex.passport.internal.ui.sloth.b0) this.standaloneSlothUiProvider.get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class StandaloneSlothComposeComponentBuilder implements com.yandex.passport.internal.ui.sloth.s {
        private Activity activity;
        private SlothParams params;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.common.ui.progress.g progressProperties;

        private StandaloneSlothComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.s
        public StandaloneSlothComposeComponentBuilder activity(Activity activity) {
            activity.getClass();
            this.activity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.s
        public com.yandex.passport.internal.ui.sloth.t build() {
            q5z.f(SlothParams.class, this.params);
            q5z.f(com.yandex.passport.common.ui.progress.g.class, this.progressProperties);
            q5z.f(Activity.class, this.activity);
            return new StandaloneSlothComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.sloth.u(), this.params, this.progressProperties, this.activity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.s
        public StandaloneSlothComposeComponentBuilder params(SlothParams slothParams) {
            slothParams.getClass();
            this.params = slothParams;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.s
        public StandaloneSlothComposeComponentBuilder progressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.progressProperties = gVar;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class StandaloneSlothComposeComponentImpl implements com.yandex.passport.internal.ui.sloth.t {
        private final Activity activity;
        private final SlothParams params;
        private yvf0 paramsProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.common.ui.progress.g progressProperties;
        private yvf0 provideSlothDependenciesProvider;
        private yvf0 provideSlothSessionProvider;
        private final StandaloneSlothComposeComponentImpl standaloneSlothComposeComponentImpl;
        private final com.yandex.passport.internal.ui.sloth.u standaloneSlothComposeModule;

        private StandaloneSlothComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.sloth.u uVar, SlothParams slothParams, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.standaloneSlothComposeComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.standaloneSlothComposeModule = uVar;
            this.activity = activity;
            this.progressProperties = gVar;
            this.params = slothParams;
            initialize(uVar, slothParams, gVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.u uVar, SlothParams slothParams, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.paramsProvider = n3w.a(slothParams);
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(uVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, 3)));
            this.provideSlothDependenciesProvider = b;
            this.provideSlothSessionProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g((Object) uVar, this.paramsProvider, b, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 2)));
        }

        private com.yandex.passport.internal.ui.sloth.f slothComposeUiReporterImpl() {
            return new com.yandex.passport.internal.ui.sloth.f(this.passportProcessGlobalComponentImpl.getSlothReportDelegate());
        }

        private com.yandex.passport.internal.ui.sloth.g slothDebugInformationDelegateImpl() {
            return new com.yandex.passport.internal.ui.sloth.g((com.yandex.passport.internal.util.e) this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider.get());
        }

        private com.yandex.passport.internal.sloth.l slothNetworkStatusImpl() {
            return new com.yandex.passport.internal.sloth.l(this.activity, (com.yandex.passport.common.coroutine.e) this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider.get());
        }

        private com.yandex.passport.internal.ui.sloth.k slothStringRepositoryImpl() {
            return new com.yandex.passport.internal.ui.sloth.k(new com.yandex.passport.internal.ui.g());
        }

        private com.yandex.passport.internal.ui.sloth.p slothWishConsumerImpl() {
            return new com.yandex.passport.internal.ui.sloth.p(this.activity);
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.progressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothComposeUIReporter() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.f slothComposeUiReporterImpl = slothComposeUiReporterImpl();
            uVar.getClass();
            return slothComposeUiReporterImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.g slothDebugInformationDelegateImpl = slothDebugInformationDelegateImpl();
            uVar.getClass();
            return slothDebugInformationDelegateImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public r getSlothNetworkStatus() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.sloth.l slothNetworkStatusImpl = slothNetworkStatusImpl();
            uVar.getClass();
            return slothNetworkStatusImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.b1 getSlothUiInteractor() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            com.yandex.passport.sloth.c1 c1Var = (com.yandex.passport.sloth.c1) this.provideSlothSessionProvider.get();
            uVar.getClass();
            com.yandex.passport.sloth.b1 b1Var = c1Var.C;
            q5z.i(b1Var);
            return b1Var;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.h getSlothUrlProvider() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            com.yandex.passport.sloth.dependencies.b bVar = (com.yandex.passport.sloth.dependencies.b) this.provideSlothDependenciesProvider.get();
            uVar.getClass();
            com.yandex.passport.sloth.dependencies.h hVar = bVar.d;
            q5z.i(hVar);
            return hVar;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.data.c0 getSlothVariant() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            SlothParams slothParams = this.params;
            uVar.getClass();
            com.yandex.passport.sloth.data.c0 variant = slothParams.getVariant();
            q5z.i(variant);
            return variant;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            this.standaloneSlothComposeModule.getClass();
            return new com.yandex.passport.internal.ui.sloth.n(0);
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.q getSlothWishConsumer() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.p slothWishConsumerImpl = slothWishConsumerImpl();
            uVar.getClass();
            return slothWishConsumerImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.a getStringRepository() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.k slothStringRepositoryImpl = slothStringRepositoryImpl();
            uVar.getClass();
            return slothStringRepositoryImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.t
        public com.yandex.passport.internal.ui.sloth.v getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.v((com.yandex.passport.sloth.c1) this.provideSlothSessionProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.sloth.t
        public i1 getWebAmReporter() {
            return (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public st41 getWebViewSslErrorHandler() {
            com.yandex.passport.internal.ui.sloth.u uVar = this.standaloneSlothComposeModule;
            Context context = this.passportProcessGlobalComponentImpl.setApplicationContext;
            uVar.getClass();
            return new com.yandex.passport.internal.ui.sloth.h(context);
        }

        @Override // com.yandex.passport.internal.ui.sloth.t
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class UserMenuActivityComponentImpl implements com.yandex.passport.internal.ui.sloth.menu.e {
        private yvf0 baseSlothUiSettingsProvider;
        private yvf0 getActivityProvider;
        private yvf0 getProgressPropertiesProvider;
        private yvf0 getPropertiesProvider;
        private yvf0 getStringRepositoryProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideUserMenuRequestsProcessorProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothSslErrorHandlerProvider;
        private yvf0 slothStringRepositoryImplProvider;
        private final UserMenuActivityComponentImpl userMenuActivityComponentImpl;
        private yvf0 userMenuActivityUiProvider;
        private yvf0 userMenuMessageMapperProvider;
        private yvf0 userMenuSlothDependenciesFactoryProvider;
        private yvf0 userMenuSlothSlabProvider;
        private yvf0 userMenuUiControllerProvider;
        private yvf0 userMenuWishConsumerProvider;

        private UserMenuActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.sloth.menu.f fVar) {
            this.userMenuActivityComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(fVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.menu.f fVar) {
            this.getActivityProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.menu.g(fVar, 0)));
            this.slothStringRepositoryImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothDebugInformationDelegateImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            int i = 1;
            this.slothNetworkStatusImplProvider = new q0(this.getActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i);
            this.slothSslErrorHandlerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 20);
            this.userMenuSlothDependenciesFactoryProvider = new m(this.getActivityProvider, this.slothStringRepositoryImplProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, this.slothDebugInformationDelegateImplProvider, this.slothNetworkStatusImplProvider, this.passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, this.slothSslErrorHandlerProvider, this.passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 1);
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.menu.g(fVar, i)));
            this.getProgressPropertiesProvider = b;
            int i2 = 7;
            this.baseSlothUiSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.fallback.d(b, b.a, this.passportProcessGlobalComponentImpl.setPropertiesProvider, i2)));
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, 23)));
            this.userMenuWishConsumerProvider = b2;
            this.userMenuSlothSlabProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.roundabout.items.d(this.userMenuSlothDependenciesFactoryProvider, this.baseSlothUiSettingsProvider, b2, 4)));
            xvf0 b3 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(fVar, this.slothStringRepositoryImplProvider, i2)));
            this.getStringRepositoryProvider = b3;
            xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.roundabout.items.d(this.userMenuSlothSlabProvider, this.getActivityProvider, b3, 3)));
            this.userMenuActivityUiProvider = b4;
            this.userMenuUiControllerProvider = i5m.b(cma1.i(new c1(b4, this.getStringRepositoryProvider)));
            xvf0 c = i5m.c(com.yandex.passport.internal.ui.sloth.menu.j.a);
            this.userMenuMessageMapperProvider = c;
            this.provideUserMenuRequestsProcessorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(fVar, c, 8)));
            this.getPropertiesProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.menu.g(fVar, 2)));
        }

        @Override // com.yandex.passport.internal.ui.sloth.menu.e
        public com.yandex.passport.internal.ui.sloth.menu.q getUiController() {
            return (com.yandex.passport.internal.ui.sloth.menu.q) this.userMenuUiControllerProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.menu.e
        public UserMenuProperties getUserMenuProperties() {
            return (UserMenuProperties) this.getPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.menu.e
        public com.yandex.passport.internal.ui.sloth.menu.l getUserMenuRequestsProcessor() {
            return (com.yandex.passport.internal.ui.sloth.menu.l) this.provideUserMenuRequestsProcessorProvider.get();
        }
    }

    /* loaded from: classes15.dex */
    public static final class WebCardComposeComponentBuilder implements com.yandex.passport.internal.ui.sloth.webcard.d {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.internal.ui.sloth.webcard.k0 setInputParams;

        private WebCardComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.d
        public com.yandex.passport.internal.ui.sloth.webcard.e build() {
            q5z.f(com.yandex.passport.internal.ui.sloth.webcard.k0.class, this.setInputParams);
            q5z.f(Activity.class, this.setActivity);
            return new WebCardComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.sloth.webcard.f(), this.setInputParams, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.d
        public WebCardComposeComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.d
        public WebCardComposeComponentBuilder setInputParams(com.yandex.passport.internal.ui.sloth.webcard.k0 k0Var) {
            k0Var.getClass();
            this.setInputParams = k0Var;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class WebCardComposeComponentImpl implements com.yandex.passport.internal.ui.sloth.webcard.e {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 providePerformConfigurationProvider;
        private yvf0 setActivityProvider;
        private final com.yandex.passport.internal.ui.sloth.webcard.k0 setInputParams;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;
        private final WebCardComposeComponentImpl webCardComposeComponentImpl;
        private final com.yandex.passport.internal.ui.sloth.webcard.f webCardComposeModule;

        private WebCardComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.webcard.f fVar, com.yandex.passport.internal.ui.sloth.webcard.k0 k0Var, Activity activity) {
            this.webCardComposeComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setInputParams = k0Var;
            this.webCardComposeModule = fVar;
            initialize(eVar, fVar, k0Var, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.webcard.f fVar, com.yandex.passport.internal.ui.sloth.webcard.k0 k0Var, Activity activity) {
            this.providePerformConfigurationProvider = new com.yandex.passport.internal.ui.bouncer.f(fVar, this.passportProcessGlobalComponentImpl.slothWebCardPerformConfigurationProvider, 16);
            this.setActivityProvider = n3w.a(activity);
        }

        private com.yandex.passport.internal.usecase.i1 selectPushPictureUseCase() {
            return new com.yandex.passport.internal.usecase.i1((com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.helper.d) this.passportProcessGlobalComponentImpl.deviceAuthorizationHelperProvider.get());
        }

        private com.yandex.passport.internal.ui.sloth.webcard.w webCardComposeStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.webcard.w(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), (com.yandex.passport.internal.sloth.performers.webcard.g) this.passportProcessGlobalComponentImpl.webCardEventSenderProvider.get(), (com.yandex.passport.internal.report.reporters.k1) this.passportProcessGlobalComponentImpl.webCardReporterProvider.get(), this.setInputParams, (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get(), (com.yandex.passport.internal.push.h) this.passportProcessGlobalComponentImpl.notificationHelperProvider.get(), selectPushPictureUseCase());
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.e
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            this.webCardComposeModule.getClass();
            return com.yandex.passport.common.ui.progress.g.e;
        }

        public com.yandex.passport.sloth.dependencies.f getSlothPerformConfiguration() {
            com.yandex.passport.internal.ui.sloth.webcard.f fVar = this.webCardComposeModule;
            com.yandex.passport.internal.ui.sloth.webcard.b bVar = (com.yandex.passport.internal.ui.sloth.webcard.b) this.passportProcessGlobalComponentImpl.slothWebCardPerformConfigurationProvider.get();
            fVar.getClass();
            return new com.yandex.passport.sloth.dependencies.f(Collections.singletonList(bVar.a));
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.e
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss3_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.webCardComposeComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.e
        public com.yandex.passport.internal.ui.sloth.webcard.a0 getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.webcard.a0(webCardComposeStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.e
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class WebCardSlothComponentImpl implements com.yandex.passport.internal.ui.sloth.webcard.s0 {
        private yvf0 getActivityProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideInputParamsProvider;
        private yvf0 provideSlothUiSettingsProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothSslErrorHandlerProvider;
        private yvf0 slothStringRepositoryImplProvider;
        private yvf0 slothUiDependenciesFactoryProvider;
        private yvf0 standaloneWishConsumerProvider;
        private final WebCardSlothComponentImpl webCardSlothComponentImpl;
        private final com.yandex.passport.internal.ui.sloth.webcard.t0 webCardSlothModule;
        private yvf0 webCardSlothSlabProvider;
        private yvf0 webCardSlothUiProvider;

        private WebCardSlothComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.sloth.webcard.t0 t0Var) {
            this.webCardSlothComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.webCardSlothModule = t0Var;
            initialize(t0Var);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.webcard.t0 t0Var) {
            this.getActivityProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.webcard.u0(t0Var, 0)));
            this.slothStringRepositoryImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothDebugInformationDelegateImplProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            int i = 1;
            this.slothNetworkStatusImplProvider = new q0(this.getActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i);
            this.slothSslErrorHandlerProvider = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 20);
            this.slothUiDependenciesFactoryProvider = new m(this.getActivityProvider, this.slothStringRepositoryImplProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, this.slothDebugInformationDelegateImplProvider, this.slothNetworkStatusImplProvider, this.passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, this.slothSslErrorHandlerProvider, this.passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(this.getActivityProvider, 22)));
            this.standaloneWishConsumerProvider = b;
            com.yandex.passport.internal.ui.sloth.webcard.u0 u0Var = new com.yandex.passport.internal.ui.sloth.webcard.u0(t0Var, i);
            this.provideInputParamsProvider = u0Var;
            com.yandex.passport.internal.ui.bouncer.f fVar = new com.yandex.passport.internal.ui.bouncer.f(t0Var, u0Var, 17);
            this.provideSlothUiSettingsProvider = fVar;
            xvf0 b2 = i5m.b(cma1.i(new i(this.slothUiDependenciesFactoryProvider, b, fVar, 2)));
            this.webCardSlothSlabProvider = b2;
            this.webCardSlothUiProvider = i5m.b(cma1.i(new c1(this.getActivityProvider, b2, 5)));
        }

        private com.yandex.passport.internal.usecase.i1 selectPushPictureUseCase() {
            return new com.yandex.passport.internal.usecase.i1((com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.helper.d) this.passportProcessGlobalComponentImpl.deviceAuthorizationHelperProvider.get());
        }

        private com.yandex.passport.internal.ui.sloth.webcard.a slothSessionFactory() {
            com.yandex.passport.internal.ui.sloth.webcard.t0 t0Var = this.webCardSlothModule;
            com.yandex.passport.internal.ui.sloth.webcard.b bVar = (com.yandex.passport.internal.ui.sloth.webcard.b) this.passportProcessGlobalComponentImpl.slothWebCardPerformConfigurationProvider.get();
            com.yandex.passport.internal.sloth.h hVar = (com.yandex.passport.internal.sloth.h) this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider.get();
            t0Var.getClass();
            return new com.yandex.passport.internal.core.accounts.p(bVar, hVar);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.s0
        public com.yandex.passport.internal.ui.sloth.webcard.z0 getUi() {
            return (com.yandex.passport.internal.ui.sloth.webcard.z0) this.webCardSlothUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.s0
        public com.yandex.passport.internal.ui.sloth.webcard.a1 getViewModelFactory() {
            com.yandex.passport.internal.ui.sloth.webcard.k0 k0Var = this.webCardSlothModule.b;
            q5z.i(k0Var);
            return new com.yandex.passport.internal.ui.sloth.webcard.a1(k0Var, slothSessionFactory(), (com.yandex.passport.internal.push.h) this.passportProcessGlobalComponentImpl.notificationHelperProvider.get(), (com.yandex.passport.internal.sloth.performers.webcard.g) this.passportProcessGlobalComponentImpl.webCardEventSenderProvider.get(), (com.yandex.passport.internal.report.reporters.k1) this.passportProcessGlobalComponentImpl.webCardReporterProvider.get(), selectPushPictureUseCase());
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.s0
        public i1 getWebAmReporter() {
            return (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.s0
        public com.yandex.passport.internal.report.reporters.k1 getWebCardReporter() {
            return (com.yandex.passport.internal.report.reporters.k1) this.passportProcessGlobalComponentImpl.webCardReporterProvider.get();
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss2_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss2_SlothScreenComponentImpl _cypiuss2_SlothScreenComponentImpl;
        private final ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideDebugInformationDelegateProvider;
        private yvf0 provideSlothComposeUiReporterProvider;
        private yvf0 provideSlothDependenciesProvider;
        private yvf0 provideSlothNetworkStatusProvider;
        private yvf0 provideSlothSSLErrorHandlerProvider;
        private yvf0 provideSlothSessionProvider;
        private yvf0 provideSlothUiInteractorProvider;
        private yvf0 provideSlothUrlProvider;
        private yvf0 provideSlothVariantProvider;
        private yvf0 provideSlothWebViewSettingsProvider;
        private yvf0 provideStringRepositoryProvider;
        private yvf0 provideWishConsumerProvider;
        private yvf0 setOnSlothUiWishProvider;
        private yvf0 setSlothHeadersProvider;
        private yvf0 setSlothParamsProvider;
        private yvf0 slothComposeUiReporterImplProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothStringRepositoryImplProvider;

        private cypiuss2_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this._cypiuss2_SlothScreenComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.managingPlusDevicesComponentImpl = managingPlusDevicesComponentImpl;
            initialize(bVar, slothParams, map, tlsVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this.setSlothParamsProvider = n3w.a(slothParams);
            int i = 0;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, i)));
            this.provideSlothDependenciesProvider = b;
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g((Object) bVar, this.setSlothParamsProvider, b, this.managingPlusDevicesComponentImpl.providePerformConfigurationProvider, 3)));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, b2, 13)));
            n3w a = n3w.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, i)));
            int i2 = 1;
            this.provideSlothSSLErrorHandlerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, i2)));
            this.provideSlothUrlProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 2)));
            n3w a2 = n3w.a(tlsVar);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, i2)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothStringRepositoryImplProvider = eVar;
            this.provideStringRepositoryProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar, 14)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar2 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            this.slothDebugInformationDelegateImplProvider = eVar2;
            this.provideDebugInformationDelegateProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar2, 10)));
            q0 q0Var = new q0(this.managingPlusDevicesComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i2);
            this.slothNetworkStatusImplProvider = q0Var;
            this.provideSlothNetworkStatusProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, q0Var, 12)));
            this.provideSlothVariantProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 3)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar3 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 18);
            this.slothComposeUiReporterImplProvider = eVar3;
            this.provideSlothComposeUiReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar3, 11)));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.managingPlusDevicesComponentImpl.setProgressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public r getSlothNetworkStatus() {
            return (r) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.b1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.b1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.h getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.h) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.data.c0 getSlothVariant() {
            return (com.yandex.passport.sloth.data.c0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.q getSlothWishConsumer() {
            return (com.yandex.passport.sloth.ui.dependencies.q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.a getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.a) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.c1) this.provideSlothSessionProvider.get());
        }

        public i1 getWebAmReporter() {
            return (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public st41 getWebViewSslErrorHandler() {
            return (st41) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss3_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss3_SlothScreenComponentImpl _cypiuss3_SlothScreenComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideDebugInformationDelegateProvider;
        private yvf0 provideSlothComposeUiReporterProvider;
        private yvf0 provideSlothDependenciesProvider;
        private yvf0 provideSlothNetworkStatusProvider;
        private yvf0 provideSlothSSLErrorHandlerProvider;
        private yvf0 provideSlothSessionProvider;
        private yvf0 provideSlothUiInteractorProvider;
        private yvf0 provideSlothUrlProvider;
        private yvf0 provideSlothVariantProvider;
        private yvf0 provideSlothWebViewSettingsProvider;
        private yvf0 provideStringRepositoryProvider;
        private yvf0 provideWishConsumerProvider;
        private yvf0 setOnSlothUiWishProvider;
        private yvf0 setSlothHeadersProvider;
        private yvf0 setSlothParamsProvider;
        private yvf0 slothComposeUiReporterImplProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothStringRepositoryImplProvider;
        private final WebCardComposeComponentImpl webCardComposeComponentImpl;

        private cypiuss3_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, WebCardComposeComponentImpl webCardComposeComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this._cypiuss3_SlothScreenComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.webCardComposeComponentImpl = webCardComposeComponentImpl;
            initialize(bVar, slothParams, map, tlsVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this.setSlothParamsProvider = n3w.a(slothParams);
            int i = 0;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, i)));
            this.provideSlothDependenciesProvider = b;
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g((Object) bVar, this.setSlothParamsProvider, b, this.webCardComposeComponentImpl.providePerformConfigurationProvider, 3)));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, b2, 13)));
            n3w a = n3w.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, i)));
            int i2 = 1;
            this.provideSlothSSLErrorHandlerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, i2)));
            this.provideSlothUrlProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 2)));
            n3w a2 = n3w.a(tlsVar);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, i2)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothStringRepositoryImplProvider = eVar;
            this.provideStringRepositoryProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar, 14)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar2 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            this.slothDebugInformationDelegateImplProvider = eVar2;
            this.provideDebugInformationDelegateProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar2, 10)));
            q0 q0Var = new q0(this.webCardComposeComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i2);
            this.slothNetworkStatusImplProvider = q0Var;
            this.provideSlothNetworkStatusProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, q0Var, 12)));
            this.provideSlothVariantProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 3)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar3 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 18);
            this.slothComposeUiReporterImplProvider = eVar3;
            this.provideSlothComposeUiReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar3, 11)));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            this.webCardComposeComponentImpl.webCardComposeModule.getClass();
            return com.yandex.passport.common.ui.progress.g.e;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public r getSlothNetworkStatus() {
            return (r) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.b1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.b1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.h getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.h) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.data.c0 getSlothVariant() {
            return (com.yandex.passport.sloth.data.c0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.q getSlothWishConsumer() {
            return (com.yandex.passport.sloth.ui.dependencies.q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.a getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.a) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.c1) this.provideSlothSessionProvider.get());
        }

        public i1 getWebAmReporter() {
            return (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public st41 getWebViewSslErrorHandler() {
            return (st41) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss4_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss4_SlothScreenComponentImpl _cypiuss4_SlothScreenComponentImpl;
        private final AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideDebugInformationDelegateProvider;
        private yvf0 provideSlothComposeUiReporterProvider;
        private yvf0 provideSlothDependenciesProvider;
        private yvf0 provideSlothNetworkStatusProvider;
        private yvf0 provideSlothSSLErrorHandlerProvider;
        private yvf0 provideSlothSessionProvider;
        private yvf0 provideSlothUiInteractorProvider;
        private yvf0 provideSlothUrlProvider;
        private yvf0 provideSlothVariantProvider;
        private yvf0 provideSlothWebViewSettingsProvider;
        private yvf0 provideStringRepositoryProvider;
        private yvf0 provideWishConsumerProvider;
        private yvf0 setOnSlothUiWishProvider;
        private yvf0 setSlothHeadersProvider;
        private yvf0 setSlothParamsProvider;
        private yvf0 slothComposeUiReporterImplProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothStringRepositoryImplProvider;

        private cypiuss4_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this._cypiuss4_SlothScreenComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.authSdkSlothComposeComponentImpl = authSdkSlothComposeComponentImpl;
            initialize(bVar, slothParams, map, tlsVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this.setSlothParamsProvider = n3w.a(slothParams);
            int i = 0;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, i)));
            this.provideSlothDependenciesProvider = b;
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g((Object) bVar, this.setSlothParamsProvider, b, this.authSdkSlothComposeComponentImpl.providePerformConfigurationProvider, 3)));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, b2, 13)));
            n3w a = n3w.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, i)));
            int i2 = 1;
            this.provideSlothSSLErrorHandlerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, i2)));
            this.provideSlothUrlProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 2)));
            n3w a2 = n3w.a(tlsVar);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, i2)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothStringRepositoryImplProvider = eVar;
            this.provideStringRepositoryProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar, 14)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar2 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            this.slothDebugInformationDelegateImplProvider = eVar2;
            this.provideDebugInformationDelegateProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar2, 10)));
            q0 q0Var = new q0(this.authSdkSlothComposeComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i2);
            this.slothNetworkStatusImplProvider = q0Var;
            this.provideSlothNetworkStatusProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, q0Var, 12)));
            this.provideSlothVariantProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 3)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar3 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 18);
            this.slothComposeUiReporterImplProvider = eVar3;
            this.provideSlothComposeUiReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar3, 11)));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.authSdkSlothComposeComponentImpl.setProgressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public r getSlothNetworkStatus() {
            return (r) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.b1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.b1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.h getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.h) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.data.c0 getSlothVariant() {
            return (com.yandex.passport.sloth.data.c0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.q getSlothWishConsumer() {
            return (com.yandex.passport.sloth.ui.dependencies.q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.a getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.a) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.c1) this.provideSlothSessionProvider.get());
        }

        public i1 getWebAmReporter() {
            return (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public st41 getWebViewSslErrorHandler() {
            return (st41) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss5_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss5_SlothScreenComponentImpl _cypiuss5_SlothScreenComponentImpl;
        private final BiometricVerificationComponentImpl biometricVerificationComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideDebugInformationDelegateProvider;
        private yvf0 provideSlothComposeUiReporterProvider;
        private yvf0 provideSlothDependenciesProvider;
        private yvf0 provideSlothNetworkStatusProvider;
        private yvf0 provideSlothSSLErrorHandlerProvider;
        private yvf0 provideSlothSessionProvider;
        private yvf0 provideSlothUiInteractorProvider;
        private yvf0 provideSlothUrlProvider;
        private yvf0 provideSlothVariantProvider;
        private yvf0 provideSlothWebViewSettingsProvider;
        private yvf0 provideStringRepositoryProvider;
        private yvf0 provideWishConsumerProvider;
        private yvf0 setOnSlothUiWishProvider;
        private yvf0 setSlothHeadersProvider;
        private yvf0 setSlothParamsProvider;
        private yvf0 slothComposeUiReporterImplProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothStringRepositoryImplProvider;

        private cypiuss5_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BiometricVerificationComponentImpl biometricVerificationComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this._cypiuss5_SlothScreenComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.biometricVerificationComponentImpl = biometricVerificationComponentImpl;
            initialize(bVar, slothParams, map, tlsVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this.setSlothParamsProvider = n3w.a(slothParams);
            int i = 0;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, i)));
            this.provideSlothDependenciesProvider = b;
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g((Object) bVar, this.setSlothParamsProvider, b, this.biometricVerificationComponentImpl.providePerformConfigurationProvider, 3)));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, b2, 13)));
            n3w a = n3w.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, i)));
            int i2 = 1;
            this.provideSlothSSLErrorHandlerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, i2)));
            this.provideSlothUrlProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 2)));
            n3w a2 = n3w.a(tlsVar);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, i2)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothStringRepositoryImplProvider = eVar;
            this.provideStringRepositoryProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar, 14)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar2 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            this.slothDebugInformationDelegateImplProvider = eVar2;
            this.provideDebugInformationDelegateProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar2, 10)));
            q0 q0Var = new q0(this.biometricVerificationComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i2);
            this.slothNetworkStatusImplProvider = q0Var;
            this.provideSlothNetworkStatusProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, q0Var, 12)));
            this.provideSlothVariantProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 3)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar3 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 18);
            this.slothComposeUiReporterImplProvider = eVar3;
            this.provideSlothComposeUiReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar3, 11)));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.biometricVerificationComponentImpl.setProgressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public r getSlothNetworkStatus() {
            return (r) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.b1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.b1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.h getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.h) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.data.c0 getSlothVariant() {
            return (com.yandex.passport.sloth.data.c0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.q getSlothWishConsumer() {
            return (com.yandex.passport.sloth.ui.dependencies.q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.a getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.a) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.c1) this.provideSlothSessionProvider.get());
        }

        public i1 getWebAmReporter() {
            return (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public st41 getWebViewSslErrorHandler() {
            return (st41) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss6_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss6_SlothScreenComponentImpl _cypiuss6_SlothScreenComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideDebugInformationDelegateProvider;
        private yvf0 provideSlothComposeUiReporterProvider;
        private yvf0 provideSlothDependenciesProvider;
        private yvf0 provideSlothNetworkStatusProvider;
        private yvf0 provideSlothSSLErrorHandlerProvider;
        private yvf0 provideSlothSessionProvider;
        private yvf0 provideSlothUiInteractorProvider;
        private yvf0 provideSlothUrlProvider;
        private yvf0 provideSlothVariantProvider;
        private yvf0 provideSlothWebViewSettingsProvider;
        private yvf0 provideStringRepositoryProvider;
        private yvf0 provideWishConsumerProvider;
        private final RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl;
        private yvf0 setOnSlothUiWishProvider;
        private yvf0 setSlothHeadersProvider;
        private yvf0 setSlothParamsProvider;
        private yvf0 slothComposeUiReporterImplProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothStringRepositoryImplProvider;

        private cypiuss6_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this._cypiuss6_SlothScreenComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.registerWebAuthNComponentImpl = registerWebAuthNComponentImpl;
            initialize(bVar, slothParams, map, tlsVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this.setSlothParamsProvider = n3w.a(slothParams);
            int i = 0;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, i)));
            this.provideSlothDependenciesProvider = b;
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g((Object) bVar, this.setSlothParamsProvider, b, this.registerWebAuthNComponentImpl.providePerformConfigurationProvider, 3)));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, b2, 13)));
            n3w a = n3w.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, i)));
            int i2 = 1;
            this.provideSlothSSLErrorHandlerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, i2)));
            this.provideSlothUrlProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 2)));
            n3w a2 = n3w.a(tlsVar);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, i2)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothStringRepositoryImplProvider = eVar;
            this.provideStringRepositoryProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar, 14)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar2 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            this.slothDebugInformationDelegateImplProvider = eVar2;
            this.provideDebugInformationDelegateProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar2, 10)));
            q0 q0Var = new q0(this.registerWebAuthNComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i2);
            this.slothNetworkStatusImplProvider = q0Var;
            this.provideSlothNetworkStatusProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, q0Var, 12)));
            this.provideSlothVariantProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 3)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar3 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 18);
            this.slothComposeUiReporterImplProvider = eVar3;
            this.provideSlothComposeUiReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar3, 11)));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.registerWebAuthNComponentImpl.setProgressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public r getSlothNetworkStatus() {
            return (r) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.b1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.b1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.h getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.h) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.data.c0 getSlothVariant() {
            return (com.yandex.passport.sloth.data.c0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.q getSlothWishConsumer() {
            return (com.yandex.passport.sloth.ui.dependencies.q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.a getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.a) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.c1) this.provideSlothSessionProvider.get());
        }

        public i1 getWebAmReporter() {
            return (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public st41 getWebViewSslErrorHandler() {
            return (st41) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss_SlothScreenComponentImpl _cypiuss_SlothScreenComponentImpl;
        private final DeleteAccountComponentImpl deleteAccountComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private yvf0 provideDebugInformationDelegateProvider;
        private yvf0 provideSlothComposeUiReporterProvider;
        private yvf0 provideSlothDependenciesProvider;
        private yvf0 provideSlothNetworkStatusProvider;
        private yvf0 provideSlothSSLErrorHandlerProvider;
        private yvf0 provideSlothSessionProvider;
        private yvf0 provideSlothUiInteractorProvider;
        private yvf0 provideSlothUrlProvider;
        private yvf0 provideSlothVariantProvider;
        private yvf0 provideSlothWebViewSettingsProvider;
        private yvf0 provideStringRepositoryProvider;
        private yvf0 provideWishConsumerProvider;
        private yvf0 setOnSlothUiWishProvider;
        private yvf0 setSlothHeadersProvider;
        private yvf0 setSlothParamsProvider;
        private yvf0 slothComposeUiReporterImplProvider;
        private yvf0 slothDebugInformationDelegateImplProvider;
        private yvf0 slothNetworkStatusImplProvider;
        private yvf0 slothStringRepositoryImplProvider;

        private cypiuss_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, DeleteAccountComponentImpl deleteAccountComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this._cypiuss_SlothScreenComponentImpl = this;
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.deleteAccountComponentImpl = deleteAccountComponentImpl;
            initialize(bVar, slothParams, map, tlsVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, SlothParams slothParams, Map<String, String> map, tls tlsVar) {
            this.setSlothParamsProvider = n3w.a(slothParams);
            int i = 0;
            xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, i)));
            this.provideSlothDependenciesProvider = b;
            xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.g((Object) bVar, this.setSlothParamsProvider, b, this.deleteAccountComponentImpl.providePerformConfigurationProvider, 3)));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, b2, 13)));
            n3w a = n3w.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, i)));
            int i2 = 1;
            this.provideSlothSSLErrorHandlerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, i2)));
            this.provideSlothUrlProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 2)));
            n3w a2 = n3w.a(tlsVar);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, i2)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar = new com.yandex.passport.internal.ui.bouncer.error.e(com.yandex.passport.internal.ui.h.a, 21);
            this.slothStringRepositoryImplProvider = eVar;
            this.provideStringRepositoryProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar, 14)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar2 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 19);
            this.slothDebugInformationDelegateImplProvider = eVar2;
            this.provideDebugInformationDelegateProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar2, 10)));
            q0 q0Var = new q0(this.deleteAccountComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, i2);
            this.slothNetworkStatusImplProvider = q0Var;
            this.provideSlothNetworkStatusProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, q0Var, 12)));
            this.provideSlothVariantProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 3)));
            com.yandex.passport.internal.ui.bouncer.error.e eVar3 = new com.yandex.passport.internal.ui.bouncer.error.e(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 18);
            this.slothComposeUiReporterImplProvider = eVar3;
            this.provideSlothComposeUiReporterProvider = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(bVar, eVar3, 11)));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.deleteAccountComponentImpl.progressProperties();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public r getSlothNetworkStatus() {
            return (r) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.b1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.b1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.h getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.h) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.data.c0 getSlothVariant() {
            return (com.yandex.passport.sloth.data.c0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.q getSlothWishConsumer() {
            return (com.yandex.passport.sloth.ui.dependencies.q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.a getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.a) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.c1) this.provideSlothSessionProvider.get());
        }

        public i1 getWebAmReporter() {
            return (i1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public st41 getWebViewSslErrorHandler() {
            return (st41) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    private DaggerPassportProcessGlobalComponent() {
    }

    public static PassportProcessGlobalComponent.Builder builder() {
        return new Builder();
    }

    /* loaded from: classes15.dex */
    public static final class EsiaBindComponentBuilder implements com.yandex.passport.internal.social.esia.g {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private SocialismUrlProvider$ActualTheme setActualTheme;
        private EsiaInternalBindProperties setEsiaInternalBindProperties;

        private EsiaBindComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.social.esia.g
        public com.yandex.passport.internal.social.esia.h build() {
            q5z.f(SocialismUrlProvider$ActualTheme.class, this.setActualTheme);
            return new EsiaBindComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.social.esia.i(), this.setEsiaInternalBindProperties, this.setActualTheme);
        }

        @Override // com.yandex.passport.internal.social.esia.g
        public EsiaBindComponentBuilder setActualTheme(SocialismUrlProvider$ActualTheme socialismUrlProvider$ActualTheme) {
            socialismUrlProvider$ActualTheme.getClass();
            this.setActualTheme = socialismUrlProvider$ActualTheme;
            return this;
        }

        @Override // com.yandex.passport.internal.social.esia.g
        public EsiaBindComponentBuilder setEsiaInternalBindProperties(EsiaInternalBindProperties esiaInternalBindProperties) {
            this.setEsiaInternalBindProperties = esiaInternalBindProperties;
            return this;
        }
    }

    /* loaded from: classes15.dex */
    public static final class BouncerMasterChooserComponentBuilder implements a {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Boolean setCreateMasterEnterPhoneNumberOption;
        private List<d1> setMasters;

        private BouncerMasterChooserComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.a
        public com.yandex.passport.internal.ui.bouncer.chooser.b build() {
            q5z.f(List.class, this.setMasters);
            q5z.f(Boolean.class, this.setCreateMasterEnterPhoneNumberOption);
            return new BouncerMasterChooserComponentImpl(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl, new com.yandex.passport.internal.ui.bouncer.chooser.c(), new com.yandex.passport.internal.ui.common.e(), this.setMasters, this.setCreateMasterEnterPhoneNumberOption);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.a
        public BouncerMasterChooserComponentBuilder setCreateMasterEnterPhoneNumberOption(boolean z) {
            this.setCreateMasterEnterPhoneNumberOption = Boolean.valueOf(z);
            return this;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.a
        public BouncerMasterChooserComponentBuilder setMasters(List<d1> list) {
            list.getClass();
            this.setMasters = list;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.a
        public /* bridge */ /* synthetic */ a setMasters(List list) {
            return setMasters((List<d1>) list);
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss2_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private tls setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private SlothParams setSlothParams;

        private cypiuss2_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.managingPlusDevicesComponentImpl = managingPlusDevicesComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            q5z.f(SlothParams.class, this.setSlothParams);
            q5z.f(Map.class, this.setSlothHeaders);
            q5z.f(tls.class, this.setOnSlothUiWish);
            return new cypiuss2_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.managingPlusDevicesComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss2_SlothScreenComponentBuilder setOnSlothUiWish(tls tlsVar) {
            tlsVar.getClass();
            this.setOnSlothUiWish = tlsVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss2_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss2_SlothScreenComponentBuilder setSlothParams(SlothParams slothParams) {
            slothParams.getClass();
            this.setSlothParams = slothParams;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss3_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private tls setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private SlothParams setSlothParams;
        private final WebCardComposeComponentImpl webCardComposeComponentImpl;

        private cypiuss3_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, WebCardComposeComponentImpl webCardComposeComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.webCardComposeComponentImpl = webCardComposeComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            q5z.f(SlothParams.class, this.setSlothParams);
            q5z.f(Map.class, this.setSlothHeaders);
            q5z.f(tls.class, this.setOnSlothUiWish);
            return new cypiuss3_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.webCardComposeComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss3_SlothScreenComponentBuilder setOnSlothUiWish(tls tlsVar) {
            tlsVar.getClass();
            this.setOnSlothUiWish = tlsVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss3_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss3_SlothScreenComponentBuilder setSlothParams(SlothParams slothParams) {
            slothParams.getClass();
            this.setSlothParams = slothParams;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss4_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private tls setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private SlothParams setSlothParams;

        private cypiuss4_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.authSdkSlothComposeComponentImpl = authSdkSlothComposeComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            q5z.f(SlothParams.class, this.setSlothParams);
            q5z.f(Map.class, this.setSlothHeaders);
            q5z.f(tls.class, this.setOnSlothUiWish);
            return new cypiuss4_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.authSdkSlothComposeComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss4_SlothScreenComponentBuilder setOnSlothUiWish(tls tlsVar) {
            tlsVar.getClass();
            this.setOnSlothUiWish = tlsVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss4_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss4_SlothScreenComponentBuilder setSlothParams(SlothParams slothParams) {
            slothParams.getClass();
            this.setSlothParams = slothParams;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss5_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final BiometricVerificationComponentImpl biometricVerificationComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private tls setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private SlothParams setSlothParams;

        private cypiuss5_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BiometricVerificationComponentImpl biometricVerificationComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.biometricVerificationComponentImpl = biometricVerificationComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            q5z.f(SlothParams.class, this.setSlothParams);
            q5z.f(Map.class, this.setSlothHeaders);
            q5z.f(tls.class, this.setOnSlothUiWish);
            return new cypiuss5_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.biometricVerificationComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss5_SlothScreenComponentBuilder setOnSlothUiWish(tls tlsVar) {
            tlsVar.getClass();
            this.setOnSlothUiWish = tlsVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss5_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss5_SlothScreenComponentBuilder setSlothParams(SlothParams slothParams) {
            slothParams.getClass();
            this.setSlothParams = slothParams;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss6_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl;
        private tls setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private SlothParams setSlothParams;

        private cypiuss6_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.registerWebAuthNComponentImpl = registerWebAuthNComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            q5z.f(SlothParams.class, this.setSlothParams);
            q5z.f(Map.class, this.setSlothHeaders);
            q5z.f(tls.class, this.setOnSlothUiWish);
            return new cypiuss6_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.registerWebAuthNComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss6_SlothScreenComponentBuilder setOnSlothUiWish(tls tlsVar) {
            tlsVar.getClass();
            this.setOnSlothUiWish = tlsVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss6_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss6_SlothScreenComponentBuilder setSlothParams(SlothParams slothParams) {
            slothParams.getClass();
            this.setSlothParams = slothParams;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    /* loaded from: classes15.dex */
    public static final class cypiuss_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final DeleteAccountComponentImpl deleteAccountComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private tls setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private SlothParams setSlothParams;

        private cypiuss_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, DeleteAccountComponentImpl deleteAccountComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.deleteAccountComponentImpl = deleteAccountComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            q5z.f(SlothParams.class, this.setSlothParams);
            q5z.f(Map.class, this.setSlothHeaders);
            q5z.f(tls.class, this.setOnSlothUiWish);
            return new cypiuss_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.deleteAccountComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss_SlothScreenComponentBuilder setOnSlothUiWish(tls tlsVar) {
            tlsVar.getClass();
            this.setOnSlothUiWish = tlsVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss_SlothScreenComponentBuilder setSlothParams(SlothParams slothParams) {
            slothParams.getClass();
            this.setSlothParams = slothParams;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }
}
