package xsna;

/* compiled from: ImRegisterComponentFactories.kt */
/* loaded from: classes11.dex */
public final class kbw {
    public static final void a(i7m i7mVar) {
        i7mVar.b("com.vk.im.engine.di.ImCommonCommandsFactoryComponent", new y45(3));
        i7mVar.b("com.vk.messagetemplates.api.TemplatesComponent", new b55(4));
        i7mVar.b("com.vk.im.messageviews.api.MessageViewsFeatureComponent", new q03(8));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent", new d53(2));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.di.ImExperimentsComponent", new c13(10));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.di.ImConfigurationComponent", new jnf(4));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.di.ImUiPreferencesComponent", new zfl(1));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.reporters.api.di.ImReportersComponent", new m(3));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.di.ImCmdDirectExecutorComponent", new yp6(3));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.di.ImCmdCoroutinesExecutorComponent", new s65(3));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.di.ImCmdRxExecutorComponent", new c24(3));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.event.publisher.di.ImEventPublisherComponent", new l67(1));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent", new jbw(0));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverComponent", new t03(9));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent", new e53(6));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.sync.api.di.ImSynchronizationComponent", new rq6(6));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.im.sync.api.di.ImSynchronizationHelpersComponent", new sq6(9));
        y7m a = i7mVar.a("com.vk.im.engine.di.scope.ImScopeImpl");
        a.g("com.vk.im.engine.di.ImConfigurationScopedComponent", new mb8(2));
        a.g("com.vk.im.engine.di.ImExperimentsScopedComponent", new k03(4));
        a.g("com.vk.im.reporters.api.di.ImReportersScopedComponent", new vv8(4));
        a.g("com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent", new wv8(3));
        a.g("com.vk.im.engine.di.ImCmdDirectExecutorScopedComponent", new l03(5));
        a.g("com.vk.im.engine.di.ImCmdRxExecutorScopedComponent", new m03(3));
        a.g("com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverScopedComponent", new lq6(2));
        a.g("com.vk.im.engine.event.observer.rx.di.ImRxEventObserverScopedComponent", new g58(3));
        a.g("com.vk.im.engine.event.publisher.di.ImEventPublisherScopedComponent", new p03(6));
        a.g("com.vk.im.engine.lifecycle.di.ImEngineLifecycleScopedComponent", new r03(5));
        a.g("com.vk.im.chat.clips.decoration.api.di.DialogClipsContextScopedComponent", new nb8(7));
        a.g("com.vk.im.chat.clips.decoration.api.di.ImChatClipsDecorationScopedComponent", new p5m(1));
        a.g("com.vk.sharing.api.di.SharingScopedComponent", new pb8(3));
        a.g("com.vk.im.chat.restriction.api.ChatWriteRestrictionFeatureComponent", new qb8(3));
    }
}
