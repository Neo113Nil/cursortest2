package xsna;

import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationAdaptersKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class erj implements io.reactivex.rxjava3.core.d, Preference.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ erj(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.b;
        w290 w290Var = (w290) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        w290Var.getConfig().setEnabled(booleanValue);
        if (w290Var.isInitialized() || !booleanValue) {
            return true;
        }
        debugDevSettingsFragment.ko();
        return true;
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        ConversationAdaptersKt.addParticipantByLinkCompletable$lambda$0((Conversation) this.b, (String) this.c, bVar);
    }
}
