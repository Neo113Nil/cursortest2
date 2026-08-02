package xsna;

import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mwm;

/* compiled from: DialogsToolbarTitleProviderImpl.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class nwm extends FunctionReferenceImpl implements wzs<Pair<? extends ImBgSyncState, ? extends LongPollType>, mwm.a, ezo0> {
    @Override // xsna.wzs
    public final ezo0 invoke(Pair<? extends ImBgSyncState, ? extends LongPollType> pair, mwm.a aVar) {
        Pair<? extends ImBgSyncState, ? extends LongPollType> pair2 = pair;
        mwm.a aVar2 = aVar;
        mwm mwmVar = (mwm) this.receiver;
        mwmVar.getClass();
        ImBgSyncState d = pair2.d();
        if (mwm.b.$EnumSwitchMapping$1[pair2.g().ordinal()] == 1) {
            mwmVar.f.a(com.vk.im.engine.reporters.syncstate.b.a(d));
        } else {
            mwmVar.e.a(com.vk.im.engine.reporters.syncstate.b.a(d));
        }
        int i = mwm.b.$EnumSwitchMapping$2[d.ordinal()];
        if (i == 1) {
            return new tzo0(R.string.vkim_sync_state_refreshing_dots);
        }
        if (i != 2 && i != 3) {
            if (i != 4 && i != 5) {
                return new tzo0(R.string.vkim_sync_state_connecting_dots);
            }
            r6m.a.getClass();
            return r6m.j() ? new tzo0(R.string.vkim_sync_state_connecting_dots) : new tzo0(R.string.vkim_sync_state_wait_for_network_dots);
        }
        if (aVar2 instanceof mwm.a.C3376a) {
            return new l4j0(((mwm.a.C3376a) aVar2).a);
        }
        if (aVar2 instanceof mwm.a.b) {
            return new vzo0(((mwm.a.b) aVar2).a);
        }
        ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures) ? new tzo0(R.string.vkim_dialogs_header_filter_all_messenger) : new tzo0(R.string.vkim_dialogs_header_filter_all_rename);
    }
}
