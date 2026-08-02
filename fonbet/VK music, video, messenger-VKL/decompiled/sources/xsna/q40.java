package xsna;

import android.view.View;
import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.common.Image;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.webrtc.cid.ConversationIdChangeListener;
import xsna.cwb0;
import xsna.eda;
import xsna.fit;
import xsna.sza;
import xsna.up90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class q40 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, ConversationIdChangeListener, Preference.c, eda.a, io.reactivex.rxjava3.functions.c, StoryViewerRouter.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((s9) this.c).invoke(obj);
            case 1:
                return (Image) ((pe1) this.c).invoke(obj);
            case 2:
                return (Image) ((pe1) this.c).invoke(obj);
            case 3:
                return (CatalogReplacementResponse) ((eaa) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((kwa) this.c).invoke(obj);
            case 5:
                return (sza.d.b) ((pe1) this.c).invoke(obj);
            case 6:
                return (ClipsEditorInputData) ((eaa) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((eaa) this.c).invoke(obj);
            case 8:
            case 10:
            case 11:
            case 12:
            case 15:
            case 23:
            case 26:
            default:
                return (up90.b) ((xd40) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((pe1) this.c).invoke(obj);
            case 13:
                return (gt9) ((ykb) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.b0) ((c0s) this.c).invoke(obj);
            case 16:
                return (AddActionSuggestion) ((fit.b) this.c).invoke(obj);
            case 17:
                return (Boolean) ((pe1) this.c).invoke(obj);
            case 18:
                return (List) ((pe1) this.c).invoke(obj);
            case 19:
                return (List) ((eaa) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.e) ((eaa) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.e) ((com.vk.voip.ui.push.c) this.c).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.b0) ((ndm) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((d720) this.c).invoke(obj);
            case 25:
                return (jks) ((u4u) this.c).invoke(obj);
            case 27:
                return (ixa0) ((xmz) this.c).invoke(obj);
            case 28:
                return (AudioBook) ((xmz) this.c).invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        return rsg0.y0(new bda(wbaVar, list, str, Collections.singletonList((AccountToggleDto) ((bms) this.c).H.getValue()), 8), null, null, 3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        new bzb0(debugDevSettingsFragment.kn()).b(new cwb0.n(KnetExecutorType.values()), new mh4(8, debugDevSettingsFragment, preference), null);
        return true;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public View k(String str) {
        return (View) this.c;
    }

    @Override // ru.ok.android.webrtc.cid.ConversationIdChangeListener
    public void onConversationIdChanged(String str, String str2) {
        ((MultiEventListener) this.c).onConversationIdChanged(str, str2);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 8:
                return ((Boolean) ((pe1) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((rmg) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (ChannelsCounters) ((ldi) this.c).invoke(obj, obj2);
    }
}
