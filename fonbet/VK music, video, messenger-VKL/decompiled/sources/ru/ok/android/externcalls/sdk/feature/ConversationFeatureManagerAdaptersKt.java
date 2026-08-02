package ru.ok.android.externcalls.sdk.feature;

import io.reactivex.rxjava3.core.a;
import io.reactivex.rxjava3.core.b;
import io.reactivex.rxjava3.core.d;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.internal.operators.completable.e;
import java.util.Set;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.erb;
import xsna.lph;
import xsna.uj0;

/* compiled from: ConversationFeatureManagerAdapters.kt */
/* loaded from: classes9.dex */
public final class ConversationFeatureManagerAdaptersKt {
    public static final a enableFeatureForAllCompletable(ConversationFeatureManager conversationFeatureManager, CallFeature callFeature) {
        return new e(new lph(1, conversationFeatureManager, callFeature));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableFeatureForAllCompletable$lambda$0(ConversationFeatureManager conversationFeatureManager, CallFeature callFeature, b bVar) {
        conversationFeatureManager.enableFeatureForAll(callFeature, new ConversationFeatureManagerAdaptersKt$enableFeatureForAllCompletable$1$1(bVar), new ConversationFeatureManagerAdaptersKt$enableFeatureForAllCompletable$1$2(bVar));
    }

    public static final a enableFeatureForRolesCompletable(final ConversationFeatureManager conversationFeatureManager, final CallFeature callFeature, final Set<? extends CallParticipant.Role> set) {
        return new e(new d() { // from class: xsna.urj
            @Override // io.reactivex.rxjava3.core.d
            public final void subscribe(io.reactivex.rxjava3.core.b bVar) {
                ConversationFeatureManagerAdaptersKt.enableFeatureForRolesCompletable$lambda$0(ConversationFeatureManager.this, callFeature, set, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableFeatureForRolesCompletable$lambda$0(ConversationFeatureManager conversationFeatureManager, CallFeature callFeature, Set set, b bVar) {
        conversationFeatureManager.enableFeatureForRoles(callFeature, set, new ConversationFeatureManagerAdaptersKt$enableFeatureForRolesCompletable$1$1(bVar), new ConversationFeatureManagerAdaptersKt$enableFeatureForRolesCompletable$1$2(bVar));
    }

    public static final q<Boolean> observeFeatureEnabled(ConversationFeatureManager conversationFeatureManager, CallFeature callFeature) {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new uj0(conversationFeatureManager, callFeature));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager$FeatureListener, ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt$observeFeatureEnabled$1$listener$1] */
    public static final void observeFeatureEnabled$lambda$0(final ConversationFeatureManager conversationFeatureManager, final CallFeature callFeature, final r rVar) {
        final ?? r0 = new ConversationFeatureManager.FeatureListener() { // from class: ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt$observeFeatureEnabled$1$listener$1
            @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
            public void onFeatureEnabledChanged(CallFeature callFeature2, boolean z) {
                rVar.onNext(Boolean.valueOf(z));
            }
        };
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.trj
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                ConversationFeatureManager.this.removeFeatureListener(callFeature, r0);
            }
        });
        conversationFeatureManager.addFeatureListener(callFeature, r0);
    }

    public static final q<FeatureRoles> observeFeatureRoles(ConversationFeatureManager conversationFeatureManager, CallFeature callFeature) {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new erb(1, conversationFeatureManager, callFeature));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager$FeatureListener, ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt$observeFeatureRoles$1$listener$1] */
    public static final void observeFeatureRoles$lambda$0(final ConversationFeatureManager conversationFeatureManager, final CallFeature callFeature, final r rVar) {
        final ?? r0 = new ConversationFeatureManager.FeatureListener() { // from class: ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt$observeFeatureRoles$1$listener$1
            @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
            public void onFeatureRolesChanged(CallFeature callFeature2, FeatureRoles featureRoles) {
                rVar.onNext(featureRoles);
            }
        };
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.srj
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                ConversationFeatureManager.this.removeFeatureListener(callFeature, r0);
            }
        });
        conversationFeatureManager.addFeatureListener(callFeature, r0);
    }
}
