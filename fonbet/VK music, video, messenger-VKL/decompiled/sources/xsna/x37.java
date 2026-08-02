package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.im.ui.bridges.MaxButtonVariants;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.im.ui.max.MaxRedirectHandler;
import com.vk.mvi.binder.BinderLifecycleMode;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.call_options.source.list.ItemsFactory$Event;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.prodstat.analytics.call.click.VoipStartCallClickAnalytics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.khw0;
import xsna.x69;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x37 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x37(Peer.Type type, VoipCallSource voipCallSource, wzs wzsVar, MaxButtonVariants maxButtonVariants, Ref$ObjectRef ref$ObjectRef) {
        this.d = type;
        this.e = voipCallSource;
        this.f = wzsVar;
        this.g = maxButtonVariants;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VoipStartCallClickAnalytics.Event.OutgoingCall.Type type;
        MaxRedirectHandler.Entrypoint entrypoint;
        switch (this.b) {
            case 0:
                ((com.vk.mvi.binder.c) this.d).a.a(new y37((rd1) this.e, (lm50) obj, this.c, (BinderLifecycleMode) this.f, (ptk0) this.g));
                return s3q0.a;
            default:
                Peer.Type type2 = (Peer.Type) this.d;
                VoipCallSource voipCallSource = (VoipCallSource) this.e;
                wzs wzsVar = (wzs) this.f;
                MaxButtonVariants maxButtonVariants = (MaxButtonVariants) this.g;
                ItemsFactory$Event itemsFactory$Event = ((d19) obj).b;
                int[] iArr = x69.a.$EnumSwitchMapping$0;
                int i = iArr[itemsFactory$Event.ordinal()];
                if (i == 1) {
                    type = VoipStartCallClickAnalytics.Event.OutgoingCall.Type.VIDEO;
                } else if (i == 2) {
                    type = VoipStartCallClickAnalytics.Event.OutgoingCall.Type.AUDIO;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type = VoipStartCallClickAnalytics.Event.OutgoingCall.Type.MAX;
                }
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = voipCallSource.c;
                MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = voipCallSource.b;
                VoipStartCallClickAnalytics.Source source2 = (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.CALLS && source == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY_SERVICES) ? VoipStartCallClickAnalytics.Source.CALLS_SERVICES_OTHER : (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS && source == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST) ? VoipStartCallClickAnalytics.Source.FRIENDS_LIST : (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.PROFILE && source == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.PROFILE) ? VoipStartCallClickAnalytics.Source.PROFILE : (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_DETAIL && source == MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_HEADER) ? VoipStartCallClickAnalytics.Source.IM_PROFILE : null;
                if (source2 != null) {
                    ((VoipAnalyticsInternalComponent) ((k7m) m7m.f(new a79())).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df().b(new VoipStartCallClickAnalytics.Event.OutgoingCall(type, source2, gjw0.b(type2)));
                }
                int i2 = iArr[itemsFactory$Event.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    zqk0 zqk0Var = (zqk0) wzsVar.invoke(null, Boolean.valueOf(itemsFactory$Event == ItemsFactory$Event.VIDEO));
                    if (zqk0Var == null) {
                        return s3q0.a;
                    }
                    a201.b().a().d(new khw0.a(zqk0Var, voipCallSource, null, null, null, 28));
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MaxRedirectHandler j7 = ((MaxUtilityComponent) ((k7m) m7m.f(new y69())).mo408a(fpf0.a(MaxUtilityComponent.class))).j7();
                    int i3 = x69.a.$EnumSwitchMapping$1[maxButtonVariants.ordinal()];
                    if (i3 == 1) {
                        entrypoint = MaxRedirectHandler.Entrypoint.Calls;
                    } else {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException("NoOne can't handle Max button click");
                        }
                        entrypoint = j7.b() ? MaxRedirectHandler.Entrypoint.Calls : MaxRedirectHandler.Entrypoint.Install;
                    }
                    j7.a(entrypoint);
                }
                dw20 dw20Var = (dw20) this.c.element;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ x37(com.vk.mvi.binder.c cVar, rd1 rd1Var, Ref$ObjectRef ref$ObjectRef, BinderLifecycleMode binderLifecycleMode, ptk0 ptk0Var) {
        this.d = cVar;
        this.e = rd1Var;
        this.c = ref$ObjectRef;
        this.f = binderLifecycleMode;
        this.g = ptk0Var;
    }
}
